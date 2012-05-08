package de.viadee.i2t;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;

import javax.swing.JFrame;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Powrmart.util.PowrmartResourceFactoryImpl;

/**
 * I2TApplication owns the whole application setup and structure.
 * It requires two visitor beans inherited from PowrmartVisitor and a model name
 * Creates two main resources:
 *  <li>an intermediate Informatica resource saves the model after pre-processing phase</li>
 *  <li>a final Talend resource for the import in Talend Open Studio after transformation phase</li>
 *  Talend requires three types of files:
 *  <li>the model in an .item file</li>
 *  <li>a .properties fiel</li>
 *  <li>and a talend.project in the same directory</li>
 * @author GrS 10.11.2011
 */
@SuppressWarnings("unchecked")
public class I2TApplication {
    /**
     * Input Informatica resource.
     */
    private Resource informaticaInputResource;
    /**
     * Intermediate Informatica resource.
     */
    private Resource informaticaIntermediateResource;
    /**
     * Talend resource.
     */
    private Resource talendOutputResource;
    /**
     * Spring transformation bean.
     */
    private final I2TPowrmartVisitor powrmartVisitor;
    /**
     * Spring pre-processing bean.
     */
    private final I2TPreprocessorVisitor preprocessorVisitor;
    /**
     * Resource factory registry.
     */
    private final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    /**
     * List of intermediate objects, set during pre-processing phase.
     */
    private LinkedList<EObject> intermediateObjects = new LinkedList<EObject>();
    /**
     * Log4j logger.
     */
    static Logger logger = Logger.getLogger(I2TApplication.class);
    /**
     * Path for output files.
     */
    private String outputPath;
    /**
     * Path for input files.
     */
    private String inputPath;
    /**
     * Name of model which is processed.
     */
    private final String modelName;
    /**
     * Show graph.
     */
    private boolean showGraph = false;

    /**
     * Initialize appliaction class with the two spring processing beans.
     * Set default input and output paths.
     * @author GrS 10.11.2011 I2TApplication constructor comment.
     * @param modelName             - name of Informatica model in input directory
     * @param preprocessorVisitor   - pre-processor Spring bean
     * @param powrmartVisitor       - transformation Spring bean
     */
    public I2TApplication(final String modelName, final I2TPreprocessorVisitor preprocessorVisitor, final I2TPowrmartVisitor powrmartVisitor){
        this.preprocessorVisitor = preprocessorVisitor;
        this.powrmartVisitor = powrmartVisitor;
        this.modelName = modelName;
        outputPath = new java.io.File("").getAbsolutePath() + "/output";
        inputPath = new java.io.File("").getAbsolutePath() + "/input";
    }

    /**
     * Set the flag to show the graph of the processed ETL model
     * @author GrS 02.12.2011 Comment method "setShowGraph".
     * @param showGraph
     */
    public void setShowGraph(final boolean showGraph) {
        this.showGraph = showGraph;
    }

    /**
     * Show a JFrame containing the model as graph if the flag is set
     * @author GrS 02.12.2011 Comment method "showGraph".
     */
    public void showGraph(){
        if(showGraph){
            I2TGraphLayoutOptimizationImpl frame = (I2TGraphLayoutOptimizationImpl)powrmartVisitor.getGraphLayoutOptimization();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setVisible(true);
        }
    }

    /**
     * Set a custom output path.
     * @author GrS 10.11.2011 Comment method "setOutputPath".
     * @param outputPath            - output path for transformed models
     * @throws I2TApplicationException
     */
    public void setOutputPath(final String outputPath) throws I2TApplicationException {
        if (new File(outputPath).isDirectory()){
            this.outputPath = outputPath;
        }
        else{
            throw new I2TApplicationException("Output path is no valid path!");
        }
    }

    /**
     * Set a custom input path.
     * @author GrS 10.11.2011 Comment method "setInputPath".
     * @param inputPath             - input path for Informatica source models
     * @throws I2TApplicationException
     */
    public void setInputPath(final String inputPath) throws I2TApplicationException {
        if (new File(inputPath).isDirectory()){
            this.inputPath = inputPath;
        }
        else{
            throw new I2TApplicationException("Input path is no valid path!");
        }
    }

    /**
     * Execute the transformation process:
     * <li>loads an Informatica XML resource model</li>
     * <li>loads the application properties from i2t.properties</li>
     * <li>executes the pre processing phase</li>
     * <li>saves an intermediate Informatica resource model to XML</li>
     * <li>executes the transformation phase</li>
     * <li>saves the Talend resource model to XML</li>
     * <li>show the graph if the flag is set via setShowGraph</li>
     * @author GrS 10.11.2011 Comment method "run".
     * @throws I2TApplicationException
     */
    public void run() throws I2TApplicationException{

        String inputFilePath = inputPath + "/" + modelName + ".xml";
        if(new File(inputFilePath).isFile()){
            String intermediateFilePath = outputPath + "/_" + modelName + ".xml";
            String outputFilePath = outputPath + "/" + modelName + ".item";
            String outputPropertiesFilePath = outputPath + "/" + modelName + ".properties";

      // die Informatik xml Datei wird als emf.Resource geladen und
      // die PowrmartResourceFactoryImpl als xml Factory gespeichert
            loadInformaticaResource(inputFilePath);
      // Property Datei: i2t.properties wird geladen
            loadApplicationProperties();
      // das intermediateObjects wird befüllt mit Hilfe der
      // I2TPreprocessorVisitor Implementierung ==> momentan wird nur
      // Powrmart.impl.FOLDERTypeImpl zwischengespeichert
      // !!!!
      // !!!! de.viadee.i2t.I2TPreprocessorVisitor.caseFOLDERType(FOLDERType)
      // !!!!
      // * hier wird protokolliert(Logausgabe) und eine Statistik gemacht
      // * wichtig ist hier die richtige Reihenfolge der PreProcessors, da
      // momentan immer das Informatika RootObjekt "FOLDERType"
      // durchgereicht wird
            executePreprocessingPhase();
      // die EObjective aus intermediateObjects werden in die Zwischendatei
      // /output/_yyyyy.xml zwischengespeichert
            saveInformaticaIntermediateResource(intermediateFilePath);
      // das gespeicherte Zwischen modell wird geladen und dort die EObjects in
      // einer Schleife durchlaufen und dem powrmartVisitor.doSwitch übergeben
      // In der I2TPowrmartVisitor werden dann für MAPPINGType, SOURCEType und
      // TARGETType die Mapping-Mehoden ausgeführt
      // Darin werden die tComponeten aus der I2TTalendFactory erstellt, also
      // z.B tMSSqlInput Componente: I2TPowrmartVisitor ==>
      // I2TTalendFactory.createMSSqlInputComponent()
            executeTransformationPhase();
      // Speichert das instanzierte Ecore-Talend-Modell in einer Datei ab
            saveTalendResource(outputFilePath);
      // Für das Talend Modell *.item wird zusätzlich noch .properties mit dem
      // gleichen Namen und Standardwerten erzeugt
            saveTalendPropertiesFile(modelName,outputPropertiesFilePath);
      // optional wird das Ergebnis noch als Graph dargestellt
            showGraph();
        }
        else{
            throw new I2TApplicationException("Input file "+ inputFilePath+" was not found!");
        }

    }

    /**
     * Shutdown the application.
     * @author GrS 17.11.2011 Comment method "close".
     */
    public void close(){
        informaticaInputResource = null;
        informaticaIntermediateResource = null;
        talendOutputResource = null;
        intermediateObjects = null;
    }

    /**
     * Receive a path to a Informatica XML document and load it into a resource for further processing.
     * @author GrS 10.11.2011 Comment method "loadInformaticaResource".
     * @param path  -   path to source input model
     */
    private void loadInformaticaResource(final String path){

        ResourceSet informaticaResourceSet = new ResourceSetImpl();
        reg.getExtensionToFactoryMap().put("xml", new PowrmartResourceFactoryImpl());
        URI loadFileURI = URI.createFileURI(path);
        informaticaInputResource = informaticaResourceSet.getResource(loadFileURI, true);
        logger.info("loading file "+loadFileURI);
    }

    /**
     * Load application properties, e.g. a database configuration.
     * @author GrS 10.11.2011 Comment method "loadApplicationProperties".
     */
    private void loadApplicationProperties(){
        Properties defaultProperties = new Properties();
        FileInputStream in;
        try {
            in = new FileInputStream("i2t.properties");
            defaultProperties.load(in);
            in.close();
            logger.info("using config i2t.properties");
            powrmartVisitor.setConfig(defaultProperties);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
            logger.fatal("failed loading i2t.properties: file not found");
        } catch (IOException e) {
            e.printStackTrace();
            logger.fatal("failed loading i2t.properties");
        }
    }

    /**
     * First analyze Informatica and adapt structure with preprocessors.
     * @author GrS 10.11.2011 Comment method "executePreprocessingPhase".
     */
    private void executePreprocessingPhase(){
        for(Iterator<EObject> iter = EcoreUtil.getAllContents(informaticaInputResource,true);iter.hasNext();){
            EObject eObject = (EObject)iter.next();
            eObject = (EObject)preprocessorVisitor.doSwitch(eObject);
            if(eObject!= null){
                intermediateObjects.add(eObject);
            }
        }
    }

    /**
     * Create Talend structure from adapted Informatica structure with transformations.
     * @author GrS 10.11.2011 Comment method "executeTransformationPhase".
     */
    private void executeTransformationPhase(){
          for(Iterator<EObject> iter = EcoreUtil.getAllContents(informaticaIntermediateResource,true);iter.hasNext();){
              EObject eObject = (EObject)iter.next();
              powrmartVisitor.doSwitch(eObject);
          }
          logger.warn("Don't forget to check the update strategies of the target tables!\n");

          powrmartVisitor.printTranformationTypeCounter();
    }

    /**
     * Creates intermediate Informatica resource and save the preprocessing results.
     * @author GrS 10.11.2011 Comment method "saveInformaticaIntermediateResource".
     * @param path  -   path to intermediate output model
     */
    private void saveInformaticaIntermediateResource(final String path){
        //create intermediate Informatica resource
        ResourceSet informaticaResourceSet = new ResourceSetImpl();
        URI intermediateFileURI = URI.createFileURI(path);
        informaticaIntermediateResource = informaticaResourceSet.createResource(intermediateFileURI);

        //save intermediate resource
    informaticaIntermediateResource.getContents().addAll(intermediateObjects);

    // List<EObject> list = new ArrayList<EObject>();
    // TreeIterator<EObject> eAllContents = ((FOLDERType)
    // intermediateObjects.getFirst()).eAllContents();
    // while (eAllContents.hasNext()) {
    // EObject next = eAllContents.next();
    // list.add(next);
    // }
    // informaticaIntermediateResource.getContents().addAll(list);

    // informaticaIntermediateResource.getContents().addAll(((FOLDERType)
    // intermediateObjects.getFirst()).getTRANSFORMATION());

          try{
              Map<String,Boolean> options = new HashMap<String,Boolean>();
              options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
              informaticaIntermediateResource.save(options);
              logger.info("writing intemediate file "+intermediateFileURI);

          }
          catch(IOException e)
          {
              logger.fatal("failed writing "+intermediateFileURI+" Message: "+e.getMessage());
          }
    }

    /**
     * Create Talend resource and saves the transformation results.
     * @author GrS 10.11.2011 Comment method "saveTalendResource".
     * @param path  -   path to output target model
     */
    private void saveTalendResource(final String path){
        //create talend resource
        ResourceSet talendResourceSet = new ResourceSetImpl();
        reg.getExtensionToFactoryMap().put("item", new XMIResourceFactoryImpl());
        URI saveFileURI = URI.createFileURI(path);
        talendOutputResource = talendResourceSet.createResource(saveFileURI);
        talendOutputResource.getContents().add(powrmartVisitor.getDocument());
        try{
            Map<String,Boolean> options = new HashMap<String,Boolean>();
            options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
            talendOutputResource.save(options);
            logger.info("writing file "+saveFileURI);

        }
        catch(IOException e)
        {
            logger.fatal("failed writing "+saveFileURI+" Message: "+e.getMessage());
        }
    }

  /**
   * Create a properties file for the Talend resource to later import it in
   * Talend Open Studio
   * Talend cannot import Talend resources without a .properties file, a
   * talend.project file is also required for import
   *
   * @author GrS 10.11.2011 Comment method "saveTalendPropertiesFile".
   * @param modelName
   *          - name of input model
   * @param path
   *          - path to properties file
   */
    private void saveTalendPropertiesFile(final String modelName, final String path){
        String propertiesFile = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                                +"<xmi:XMI xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:TalendProperties=\"http://www.talend.org/properties\">"
                                +"<TalendProperties:Property xmi:id=\"_I4v5kO6CEeC5jYMN6YUbeg\" id=\"_I4mvoO6CEeC5jYMN6YUbeg\" label=\""+modelName+"\" creationDate=\"2011-10-04T14:12:33.065+0200\" modificationDate=\"2011-10-04T14:13:46.066+0200\" version=\"0.1\" statusCode=\"\" item=\"_I4v5ku6CEeC5jYMN6YUbeg\">"
                                +"<author href=\"../../talend.project#_Eml-cbwaEeCOV6bbpr1vbg\"/>"
                                +"</TalendProperties:Property>"
                                +"<TalendProperties:ItemState xmi:id=\"_I4v5ke6CEeC5jYMN6YUbeg\" path=\"Thesis\" locked=\"true\" lockDate=\"2011-10-04T14:12:35.284+0200\">"
                                +"<locker href=\"../../talend.project#_Eml-cbwaEeCOV6bbpr1vbg\"/>"
                                +"</TalendProperties:ItemState>"
                                +"<TalendProperties:ProcessItem xmi:id=\"_I4v5ku6CEeC5jYMN6YUbeg\" property=\"_I4v5kO6CEeC5jYMN6YUbeg\" state=\"_I4v5ke6CEeC5jYMN6YUbeg\">"
                                +"<process href=\""+modelName+".item#/\"/>"
                                +"</TalendProperties:ProcessItem>"
                                +"</xmi:XMI>";

        try {
           FileWriter outFile = new FileWriter(path);
           PrintWriter out = new PrintWriter(outFile);
           out.println(propertiesFile);
           out.close();
    }
        catch (IOException e){
               e.printStackTrace();
        }
    }
}
