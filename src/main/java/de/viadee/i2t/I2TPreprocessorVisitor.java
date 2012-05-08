package de.viadee.i2t;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import Powrmart.FOLDERType;
import Powrmart.SOURCEType;
import Powrmart.TARGETType;
import Powrmart.TRANSFORMATIONType;
import Powrmart.util.PowrmartSwitch;
import de.viadee.i2t.interfaces.I2TInformaticaPreprocessor;

/**
 * 1st step of transformation required to change the structure of the serialized Informatica XML
 * e.g. checks for schema changes or adoptions to Talend structures (Lookup --> Source + Join)
 * @author GrS 02.11.2011
 */
public class I2TPreprocessorVisitor<T> extends PowrmartSwitch<T> {

    static Logger logger = Logger.getLogger(I2TPreprocessorVisitor.class);

    /**
     * contains a list of preprocessors which are set in the spring config
     */
    Set<I2TInformaticaPreprocessor> preprocessorList = new LinkedHashSet<I2TInformaticaPreprocessor>();

    /**
     * Count occurrences of transformation, source and target elements
     */
    private final HashMap<String,Integer> informaticaTransformationTypeCounter = new HashMap<String, Integer>();

    /**
     * add preprocessor to list of registered preprocessors
     * @author GrS 08.11.2011 Comment method "addStep".
     * @param step  - I2TInformaticaPreprocessor object
     */
    public void addPreprocessorToExecutionList(final I2TInformaticaPreprocessor step){
        preprocessorList.add(step);
    }


    /**
     * Increment counter for transformation type
     * @author GrS 17.11.2011 Comment method "countTransformation".
     * @param transformationType   - Name of transformation type
     */
    public void countTransformation(final String transformationType){
        if(informaticaTransformationTypeCounter.containsKey(transformationType)){
            Integer counter = informaticaTransformationTypeCounter.get(transformationType);
            informaticaTransformationTypeCounter.put(transformationType, ++counter);
        }
        else{
            informaticaTransformationTypeCounter.put(transformationType, new Integer(1));
        }
    }

    /**
     * Print results of transformation type counter
     * @author GrS 17.11.2011 Comment method "printTranformationTypeCounter".
     */
    public void printTranformationTypeCounter(){
        logger.info("Transformation Analysis:");
        for(Map.Entry<String, Integer> entry : informaticaTransformationTypeCounter.entrySet()){
            logger.info(entry.getValue()+" "+entry.getKey()+"s found");
        }
    }

    /**
     * process folder nodes of Informatica structure
     * folder node is top-level node in Informatica structure under the root node
     */
    @SuppressWarnings("unchecked")
    @Override
    public T caseFOLDERType(FOLDERType object) {

        //count nodes
        for(SOURCEType source : object.getSOURCE()){
            countTransformation(source.getDATABASETYPE().toString()+" Source");
        }
        for(TARGETType target : object.getTARGET()){
            countTransformation(target.getDATABASETYPE().toString()+" Target");
        }
        for(TRANSFORMATIONType transformation : object.getMAPPING().get(0).getTRANSFORMATION()){
            countTransformation(transformation.getTYPE().toString());
        }
        printTranformationTypeCounter();

        //execute all registered preprocessors
        for(I2TInformaticaPreprocessor preprocessor : preprocessorList){
      logger.info("Preprocessing with processor: " + preprocessor.getClass().getName());
            object = preprocessor.process(object);
        }

        return (T)object;
    }
}
