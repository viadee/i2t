package de.viadee.i2t.preprocessors;

import java.util.LinkedHashSet;
import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;

import Powrmart.CONNECTORType;
import Powrmart.FOLDERType;
import Powrmart.INSTANCEType;
import Powrmart.MAPPINGType;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TARGETFIELDType;
import Powrmart.TARGETType;
import Powrmart.TRANSFORMATIONType;
import Powrmart.TRANSFORMFIELDType;
import Powrmart.TYPEType5;
import de.viadee.i2t.I2TPowrmartFactory;
import de.viadee.i2t.I2TUtil;
import de.viadee.i2t.interfaces.I2TInformaticaPreprocessor;

/**
 * Schema changes in Talend flows are not allowed
 * Those transformations where a schema change is detected are split up
 * A expression transformation with the corresponding mapping is inserted
 * 
 * @author GrS 02.11.2011
 */
public class I2TSchemaChangesPreprocessor extends I2TAbstractInformaticaPreprocessor implements
    I2TInformaticaPreprocessor {

  static Logger logger = Logger.getLogger(I2TSchemaChangesPreprocessor.class);

  public FOLDERType process(final FOLDERType object) {
    LinkedHashSet<String> detectedConnectors = new LinkedHashSet<String>();

    logger.info("searching for schema changes");

    MAPPINGType mapping = (MAPPINGType) object.getMAPPING().get(0);
    if (mapping == null) {
      logger.error("No mapping found at " + object.getNAME().toString());
    } else {
      // detect connectors where a name change is done (from field!=to field)
      for (CONNECTORType connector : mapping.getCONNECTOR()) {
        if (!connector.getFROMFIELD().toString().equals(connector.getTOFIELD().toString())
        // prevent sequence generator fields NEXTVAL and CURVAL from being split
        // up
            && !(connector.getFROMINSTANCETYPE().equals("Sequence") && (connector.getFROMFIELD().equals("NEXTVAL") || connector.getFROMFIELD().equals("CURVAL")))) {
          logger.info("Found inequality of connector field names at " + connector.getFROMINSTANCE() + "."
              + connector.getFROMFIELD() + " and " + connector.getTOINSTANCE() + "." + connector.getTOFIELD());
          String key = connector.getFROMINSTANCE().toString() + "#" + connector.getTOINSTANCE().toString();
          if (!detectedConnectors.contains(key)) {
            detectedConnectors.add(key);
          }
        }
      }

      LinkedList<CONNECTORType> oldConnectors = new LinkedList<CONNECTORType>(mapping.getCONNECTOR());

      for (String entry : detectedConnectors) {

        String[] instanceNames = entry.split("#");
        LinkedHashSet<TRANSFORMFIELDType> fields = new LinkedHashSet<TRANSFORMFIELDType>();
        INSTANCEType oldSource = null;
        INSTANCEType oldTarget = null;

        logger.debug("Splitting up connectors for " + instanceNames[0] + " and " + instanceNames[1]);

        // copy field definitions from transformation
        for (TRANSFORMATIONType transformation : mapping.getTRANSFORMATION()) {
          if (transformation.getNAME().toString().equals(instanceNames[1])) {
            for (TRANSFORMFIELDType field : transformation.getTRANSFORMFIELD()) {
              if (field.getPORTTYPE().toString().contains("INPUT")) {
                TRANSFORMFIELDType newField = (TRANSFORMFIELDType) EcoreUtil.copy(field);
                String portType = newField.getPORTTYPE().toString();
                if (!portType.contains("OUTPUT")) {
                  if (portType.equals("")) {
                    portType = "OUTPUT";
                  } else {
                    portType = portType + "/OUTPUT";
                  }
                  newField.setPORTTYPE(portType);
                }
                fields.add(newField);
              }
            }
          }
        }
        // copy field definitions from target
        for (TARGETType target : object.getTARGET()) {
          if (target.getNAME().toString().equals(instanceNames[1])) {
            for (TARGETFIELDType targetField : target.getTARGETFIELD()) {
              TRANSFORMFIELDType field = pf.createTRANSFORMFIELDType();
              field.setDATATYPE(I2TUtil.getIDatatypeFromMSSqlSource(targetField.getDATATYPE().toString()));
              field.setDEFAULTVALUE("");
              field.setDESCRIPTION("");
              field.setNAME(targetField.getNAME().toString());
              field.setPICTURETEXT("");
              field.setNULLABLE(targetField.getNULLABLE());
              field.setPORTTYPE("INPUT/OUTPUT");
              field.setPRECISION(targetField.getPRECISION());
              field.setSCALE(targetField.getSCALE());
              fields.add(field);
            }
          }
        }

        for (INSTANCEType instance : mapping.getINSTANCE()) {
          if (instanceNames[0].equals(instance.getNAME().toString())) {
            oldSource = instance;
          }
          if (instanceNames[1].equals(instance.getNAME().toString())) {
            oldTarget = instance;
          }
        }
        if (oldSource == null || oldTarget == null) {
          logger.fatal("Instances for detected splittable connector not found: from " + instanceNames[0] + " to "
              + instanceNames[1]);
        }

        // create new instance in between
        String middleInstanceName = "Mapping_" + oldSource.getNAME().toString() + "_to_"
            + oldTarget.getNAME().toString();
        INSTANCEType middleInstance = I2TPowrmartFactory.createInstanceType(middleInstanceName, "Expression", TYPEType5.TRANSFORMATION, "");
        mapping.getINSTANCE().add(middleInstance);

        // create new transformation in between
        TRANSFORMATIONType transformation = I2TPowrmartFactory.createTransformationType(middleInstanceName, "Expression", "schema change detected, adding Expression transformation to map columns");

        TABLEATTRIBUTEType tableAttribute = pf.createTABLEATTRIBUTEType();
        tableAttribute.setNAME("Tracing Level");
        tableAttribute.setVALUE("Normal");
        transformation.getTABLEATTRIBUTE().add(tableAttribute);

        if (fields == null) {
          logger.fatal("No fields added for " + middleInstanceName);
        } else {
          transformation.getTRANSFORMFIELD().addAll(fields);
        }
        mapping.getTRANSFORMATION().add(transformation);

        // process connectors
        for (CONNECTORType oldConnector : oldConnectors) {
          if (oldConnector.getFROMINSTANCE().toString().equals(instanceNames[0])
              && oldConnector.getTOINSTANCE().toString().equals(instanceNames[1])) {
            // create two now connectors to and from middleInstance, keep old
            // column name
            // toConnector
            CONNECTORType toConnector = I2TPowrmartFactory.createConnectorType(oldConnector.getFROMFIELD(), oldConnector.getFROMINSTANCE(), oldConnector.getFROMINSTANCETYPE(), oldConnector.getFROMFIELD(), middleInstanceName, "Expression");
            logger.debug("Adding incoming connector from " + toConnector.getFROMINSTANCE() + "."
                + toConnector.getFROMFIELD() + " to " + toConnector.getTOINSTANCE() + "." + toConnector.getTOFIELD());

            // fromConnector
            CONNECTORType fromConnector = I2TPowrmartFactory.createConnectorType(oldConnector.getTOFIELD().toString(), middleInstanceName, "Expression", oldConnector.getTOFIELD(), oldConnector.getTOINSTANCE(), oldConnector.getTOINSTANCETYPE());

            logger.debug("Adding outgoing connector from " + fromConnector.getFROMINSTANCE() + "."
                + fromConnector.getFROMFIELD() + " to " + fromConnector.getTOINSTANCE() + "."
                + fromConnector.getTOFIELD());
            mapping.getCONNECTOR().add(toConnector);
            mapping.getCONNECTOR().add(fromConnector);

            logger.debug("Removing connector from " + oldConnector.getFROMINSTANCE() + "."
                + oldConnector.getFROMFIELD() + " to " + oldConnector.getTOINSTANCE() + "." + oldConnector.getTOFIELD());
            mapping.getCONNECTOR().remove(oldConnector);

            for (TRANSFORMFIELDType field : transformation.getTRANSFORMFIELD()) {
              if (field.getNAME().toString().equals(oldConnector.getTOFIELD())) {
                logger.debug("Changed transformation field expression to " + oldConnector.getFROMFIELD().toString());
                field.setEXPRESSION(oldConnector.getFROMFIELD().toString());
              }
            }
          }
        }
      }
    }
    return object;
  }
}
