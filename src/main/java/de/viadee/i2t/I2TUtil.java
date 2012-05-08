package de.viadee.i2t;

import java.io.*;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.viadee.i2t.datatypes.IDatatypes;
import de.viadee.i2t.datatypes.MSSQLDatatypes;

/**
 * Provides static method helpers e.g. conversions of Informatica to Talend datatypes
 * @author GrS 02.11.2011
 */
public class I2TUtil {

    static Logger logger = Logger.getLogger(I2TUtil.class);
    
    /**
     * Read XML file and retrieve it as String
     * @author GrS 08.11.2011 Comment method "convertXMLFileToString".
     * @param fileName  -   Path to XML resource which is to be loaded
     * @return String
     */
    public static String convertXMLFileToString(String fileName) 
    { 
      try{ 
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance(); 
        InputStream inputStream = new FileInputStream(new File(fileName)); 
        org.w3c.dom.Document doc = documentBuilderFactory.newDocumentBuilder().parse(inputStream); 
        StringWriter stw = new StringWriter(); 
        Transformer serializer = TransformerFactory.newInstance().newTransformer(); 
        serializer.transform(new DOMSource(doc), new StreamResult(stw)); 
        return stw.toString(); 
      } 
      catch (Exception e) { 
        e.printStackTrace(); 
      } 
        return null; 
    }

    /**
     * Parse Talend sort type from Informatica data type
     * @author GrS 08.11.2011 Comment method "getSortFromIDatatype".
     * @param input - Informatica data type string
     * @return String
     */
    public static String getSortFromIDatatype(String input){
        String sort = "";
        switch(IDatatypes.valueOf(input.toUpperCase())){
        case INTEGER:
        case DECIMAL:
        case DOUBLE:
        case BIGINT:
            sort = "num";
            break;
        case STRING:
        case NSTRING:
        case DATETIME:
            sort = "alpha";
            break;
        }
        return sort;
    }
    
    /**
     * Parse Talend type from Informatica data type
     * @author GrS 08.11.2011 Comment method "getTypeFromIDatatype".
     * @param input - Informatica data type string
     * @return String
     */
    public static String getTypeFromIDatatype(String input){
        String type = "";
        input = input.replace("/", "");
        switch(IDatatypes.valueOf(input.toUpperCase())){
        case DATETIME:
            type = "id_Date";
            break;
        case INTEGER:
            type = "id_Integer";
            break;
        case DECIMAL:
            type = "id_BigDecimal";
            break;
        case BIGINT:
            type = "id_BigDecimal";
            break;
        case DOUBLE:
            type = "id_Double";
            break;
        case NSTRING:
        case STRING:
            type = "id_String";
            break;
        }
        return type;
    }
    
    /**
     * Parse Informatica data type from Informatica MSSql datatype
     * @author GrS 08.11.2011 Comment method "getIDatatypeFromMSSqlSource".
     * @param input - Informatica MSSql data type string
     * @return String
     */
    public static String getIDatatypeFromMSSqlSource(String input){
        String type = "";
        switch(MSSQLDatatypes.valueOf(input.toUpperCase())){
        case INT:
        case SMALLINT:
        case TINYINT:
        case BIT:
            type = "integer";
            break;
        case CHAR:
        case VARCHAR:
        case NVARCHAR:
        case TEXT:
            type = "string";
            break;
        case MONEY:
        case DECIMAL:
        case BIGINT:
            type = "decimal";
            break;
        case DATETIME:
        case TIMESTAMP:
            type = "datetime";
            break;
        case REAL: 
        case FLOAT:
            type = "double";
            break;
        }
        return type;
    }
    
    /**
     * parse MSSql data type from Informatica data type
     * @author GrS 08.11.2011 Comment method "getMSSqlDatatypeFromIDatatype".
     * @param input - Informatica data type string
     * @return String
     */
    public static String getMSSqlDatatypeFromIDatatype(String input){
        String type = "";
        input = input.replace("/", "");
        switch(IDatatypes.valueOf(input.toUpperCase())){
        case INTEGER:
            type = "INT";
            break;
        case DATETIME:
            type = "DATETIME";
            break;
        case DECIMAL:
        case BIGINT:
            type = "DECIMAL";
            break;
        case DOUBLE:
            type = "FLOAT";
            break;
        case STRING:
            type = "VARCHAR";
            break;
        case NSTRING:
            type = "NVARCHAR";
            break;
        }
        return type;
    }
    
    /**
     * Parse Talend source type from Informatica data type
     * @author GrS 08.11.2011 Comment method "getSourceTypeFromIDatatype".
     * @param input - Informatica data type string
     * @return String
     */
    public static String getSourceTypeFromIDatatype(String input){
        String sourceType = "";
        input = input.replace("/", "");
        switch(IDatatypes.valueOf(input.toUpperCase())){
        case DATETIME:
            sourceType = "DATETIME";
            break;
        case INTEGER:
            sourceType = "INT";
            break;
        case BIGINT:
        case DECIMAL:
            sourceType = "DECIMAL";
            break;
        case DOUBLE:
            sourceType = "DECIMAL";
            break;
        case STRING:
            sourceType = "VARCHAR";
            break;
        case NSTRING:
        	sourceType = "NVARCHAR";
        	break;
        }
        return sourceType;
    }
    
    /**
     * Print all elements of a resource
     * @author GrS 08.11.2011 Comment method "printAllElements".
     * @param resource  - EMF resource
     */
    public static void printAllElements(Resource resource){
        TreeIterator<EObject> tree = EcoreUtil.getAllProperContents(resource, true);
        while(tree.hasNext()){
            EObject obj = tree.next();
            printAttributeValues(obj);
        }
    }
    
    /**
     * Print attribute values of an EObject
     * @author GrS 08.11.2011 Comment method "printAttributeValues".
     * @param object    - EMF EObject
     */
    public static void printAttributeValues(EObject object){
        EClass eClass = object.eClass();
        System.out.println(eClass.getName());
        for(Iterator<EAttribute> iter = eClass.getEAllAttributes().iterator(); iter.hasNext();){
            EAttribute attribute = iter.next();
            Object value = object.eGet(attribute);
            System.out.print(" -- " + attribute.getName() + ": " + value);
            if(object.eIsSet(attribute)){
                System.out.println();
            }else
            {
                System.out.println(" (default) ");
            }
        }
    }
    
    /**
     * Print EPackage information
     * @author GrS 08.11.2011 Comment method "printPackage".
     * @param ePackage  - EMF EPackage
     */
    public static void printPackage(EPackage ePackage) {
        for (Iterator<EClassifier> iter = ePackage.getEClassifiers().iterator(); iter.hasNext();) {
            EClassifier classifier = iter.next();
            System.out.println(classifier.getName());
            System.out.print("  ");
            if (classifier instanceof EClass) {
                EClass eClass = (EClass) classifier;
                for (Iterator<EAttribute> ai = eClass.getEAttributes().iterator(); ai.hasNext();) {
                    EAttribute attribute = ai.next();
                    System.out.print(attribute.getName() + " ");
                }
                if (!eClass.getEAttributes().isEmpty() && !eClass.getEReferences().isEmpty()) {
                    System.out.println();
                    System.out.print("  ");
                }
                for (Iterator<EReference> ri = eClass.getEReferences().iterator(); ri.hasNext();) {
                    EReference reference = ri.next();
                    System.out.print(reference.getName() + " ");
                }
            } else if (classifier instanceof EEnum) {
                EEnum eEnum = (EEnum) classifier;
                for (Iterator<EEnumLiteral> ei = eEnum.getELiterals().iterator(); ei.hasNext();) {
                    EEnumLiteral literal = ei.next();
                    System.out.print(literal.getName() + " ");
                }
            } else if (classifier instanceof EDataType) {
                EDataType eDataType = (EDataType) classifier;
                System.out.print(eDataType.getInstanceClassName());
            }
            System.out.println();
        }
    }
}
