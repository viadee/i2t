/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface PowrmartPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "Powrmart";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "platform:/resource/Thesis%20EMF/model/powrmart.xsd";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "Powrmart";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PowrmartPackage eINSTANCE = Powrmart.impl.PowrmartPackageImpl.init();

    /**
     * The meta object id for the '{@link Powrmart.impl.ASSOCIATEDSOURCEINSTANCETypeImpl <em>ASSOCIATEDSOURCEINSTANCE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.ASSOCIATEDSOURCEINSTANCETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getASSOCIATEDSOURCEINSTANCEType()
     * @generated
     */
    int ASSOCIATEDSOURCEINSTANCE_TYPE = 0;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATEDSOURCEINSTANCE_TYPE__NAME = 0;

    /**
     * The number of structural features of the '<em>ASSOCIATEDSOURCEINSTANCE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATEDSOURCEINSTANCE_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link Powrmart.impl.ATTRIBUTETypeImpl <em>ATTRIBUTE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.ATTRIBUTETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getATTRIBUTEType()
     * @generated
     */
    int ATTRIBUTE_TYPE = 1;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>PARTITIONNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__PARTITIONNAME = 1;

    /**
     * The feature id for the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__VALUE = 2;

    /**
     * The number of structural features of the '<em>ATTRIBUTE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.CONFIGREFERENCETypeImpl <em>CONFIGREFERENCE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.CONFIGREFERENCETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getCONFIGREFERENCEType()
     * @generated
     */
    int CONFIGREFERENCE_TYPE = 2;

    /**
     * The feature id for the '<em><b>ATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGREFERENCE_TYPE__ATTRIBUTE = 0;

    /**
     * The feature id for the '<em><b>REFOBJECTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGREFERENCE_TYPE__REFOBJECTNAME = 1;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGREFERENCE_TYPE__TYPE = 2;

    /**
     * The number of structural features of the '<em>CONFIGREFERENCE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGREFERENCE_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.CONFIGTypeImpl <em>CONFIG Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.CONFIGTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getCONFIGType()
     * @generated
     */
    int CONFIG_TYPE = 3;

    /**
     * The feature id for the '<em><b>ATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__ATTRIBUTE = 0;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>ISDEFAULT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__ISDEFAULT = 2;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__NAME = 3;

    /**
     * The feature id for the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE__VERSIONNUMBER = 4;

    /**
     * The number of structural features of the '<em>CONFIG Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link Powrmart.impl.CONNECTIONREFERENCETypeImpl <em>CONNECTIONREFERENCE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.CONNECTIONREFERENCETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getCONNECTIONREFERENCEType()
     * @generated
     */
    int CONNECTIONREFERENCE_TYPE = 4;

    /**
     * The feature id for the '<em><b>ATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIONREFERENCE_TYPE__ATTRIBUTE = 0;

    /**
     * The feature id for the '<em><b>CNXREFNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIONREFERENCE_TYPE__CNXREFNAME = 1;

    /**
     * The feature id for the '<em><b>COMPONENTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIONREFERENCE_TYPE__COMPONENTVERSION = 2;

    /**
     * The feature id for the '<em><b>CONNECTIONNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIONREFERENCE_TYPE__CONNECTIONNAME = 3;

    /**
     * The feature id for the '<em><b>CONNECTIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIONREFERENCE_TYPE__CONNECTIONNUMBER = 4;

    /**
     * The feature id for the '<em><b>CONNECTIONSUBTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIONREFERENCE_TYPE__CONNECTIONSUBTYPE = 5;

    /**
     * The feature id for the '<em><b>CONNECTIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIONREFERENCE_TYPE__CONNECTIONTYPE = 6;

    /**
     * The feature id for the '<em><b>PARTITIONNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIONREFERENCE_TYPE__PARTITIONNAME = 7;

    /**
     * The feature id for the '<em><b>VARIABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIONREFERENCE_TYPE__VARIABLE = 8;

    /**
     * The number of structural features of the '<em>CONNECTIONREFERENCE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIONREFERENCE_TYPE_FEATURE_COUNT = 9;

    /**
     * The meta object id for the '{@link Powrmart.impl.CONNECTORTypeImpl <em>CONNECTOR Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.CONNECTORTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getCONNECTORType()
     * @generated
     */
    int CONNECTOR_TYPE = 5;

    /**
     * The feature id for the '<em><b>FROMFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__FROMFIELD = 0;

    /**
     * The feature id for the '<em><b>FROMINSTANCE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__FROMINSTANCE = 1;

    /**
     * The feature id for the '<em><b>FROMINSTANCETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__FROMINSTANCETYPE = 2;

    /**
     * The feature id for the '<em><b>TOFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__TOFIELD = 3;

    /**
     * The feature id for the '<em><b>TOINSTANCE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__TOINSTANCE = 4;

    /**
     * The feature id for the '<em><b>TOINSTANCETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__TOINSTANCETYPE = 5;

    /**
     * The number of structural features of the '<em>CONNECTOR Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link Powrmart.impl.CONWFRUNINFOTypeImpl <em>CONWFRUNINFO Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.CONWFRUNINFOTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getCONWFRUNINFOType()
     * @generated
     */
    int CONWFRUNINFO_TYPE = 6;

    /**
     * The feature id for the '<em><b>CONWFPARAMFILE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONWFRUNINFO_TYPE__CONWFPARAMFILE = 0;

    /**
     * The feature id for the '<em><b>CONWFRUNINSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONWFRUNINFO_TYPE__CONWFRUNINSTNAME = 1;

    /**
     * The number of structural features of the '<em>CONWFRUNINFO Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONWFRUNINFO_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link Powrmart.impl.CUSTOMTypeImpl <em>CUSTOM Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.CUSTOMTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getCUSTOMType()
     * @generated
     */
    int CUSTOM_TYPE = 7;

    /**
     * The feature id for the '<em><b>DAILYFREQUENCY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_TYPE__DAILYFREQUENCY = 0;

    /**
     * The feature id for the '<em><b>REPEAT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_TYPE__REPEAT = 1;

    /**
     * The number of structural features of the '<em>CUSTOM Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link Powrmart.impl.DAILYFREQUENCYTypeImpl <em>DAILYFREQUENCY Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.DAILYFREQUENCYTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getDAILYFREQUENCYType()
     * @generated
     */
    int DAILYFREQUENCY_TYPE = 8;

    /**
     * The feature id for the '<em><b>HOURS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAILYFREQUENCY_TYPE__HOURS = 0;

    /**
     * The feature id for the '<em><b>MINUTES</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAILYFREQUENCY_TYPE__MINUTES = 1;

    /**
     * The feature id for the '<em><b>RUNONCE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAILYFREQUENCY_TYPE__RUNONCE = 2;

    /**
     * The number of structural features of the '<em>DAILYFREQUENCY Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAILYFREQUENCY_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.DocumentRootImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 9;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>ASSOCIATEDSOURCEINSTANCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ASSOCIATEDSOURCEINSTANCE = 3;

    /**
     * The feature id for the '<em><b>ATTRIBUTE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ATTRIBUTE = 4;

    /**
     * The feature id for the '<em><b>CONFIG</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONFIG = 5;

    /**
     * The feature id for the '<em><b>CONFIGREFERENCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONFIGREFERENCE = 6;

    /**
     * The feature id for the '<em><b>CONNECTIONREFERENCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONNECTIONREFERENCE = 7;

    /**
     * The feature id for the '<em><b>CONNECTOR</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONNECTOR = 8;

    /**
     * The feature id for the '<em><b>CONWFRUNINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONWFRUNINFO = 9;

    /**
     * The feature id for the '<em><b>CUSTOM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CUSTOM = 10;

    /**
     * The feature id for the '<em><b>DAILYFREQUENCY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DAILYFREQUENCY = 11;

    /**
     * The feature id for the '<em><b>ENDOPTIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ENDOPTIONS = 12;

    /**
     * The feature id for the '<em><b>ERPINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ERPINFO = 13;

    /**
     * The feature id for the '<em><b>ERPSRCINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ERPSRCINFO = 14;

    /**
     * The feature id for the '<em><b>EXPRMACRO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EXPRMACRO = 15;

    /**
     * The feature id for the '<em><b>EXPRMACRODEPENDENCY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EXPRMACRODEPENDENCY = 16;

    /**
     * The feature id for the '<em><b>FIELDATTRIBUTE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FIELDATTRIBUTE = 17;

    /**
     * The feature id for the '<em><b>FIELDDEPENDENCY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FIELDDEPENDENCY = 18;

    /**
     * The feature id for the '<em><b>FILTER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FILTER = 19;

    /**
     * The feature id for the '<em><b>FLATFILE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FLATFILE = 20;

    /**
     * The feature id for the '<em><b>FOLDER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FOLDER = 21;

    /**
     * The feature id for the '<em><b>FOLDERVERSION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FOLDERVERSION = 22;

    /**
     * The feature id for the '<em><b>GROUP</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GROUP = 23;

    /**
     * The feature id for the '<em><b>HASHKEY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__HASHKEY = 24;

    /**
     * The feature id for the '<em><b>INITPROP</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INITPROP = 25;

    /**
     * The feature id for the '<em><b>INSTANCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INSTANCE = 26;

    /**
     * The feature id for the '<em><b>KEYRANGE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__KEYRANGE = 27;

    /**
     * The feature id for the '<em><b>KEYWORD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__KEYWORD = 28;

    /**
     * The feature id for the '<em><b>MACROARGUMENT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MACROARGUMENT = 29;

    /**
     * The feature id for the '<em><b>MACRODEPENDENCY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MACRODEPENDENCY = 30;

    /**
     * The feature id for the '<em><b>MAPDEPENDENCY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MAPDEPENDENCY = 31;

    /**
     * The feature id for the '<em><b>MAPPING</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MAPPING = 32;

    /**
     * The feature id for the '<em><b>MAPPINGVARIABLE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MAPPINGVARIABLE = 33;

    /**
     * The feature id for the '<em><b>MAPPLET</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MAPPLET = 34;

    /**
     * The feature id for the '<em><b>METADATAEXTENSION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__METADATAEXTENSION = 35;

    /**
     * The feature id for the '<em><b>PARTITION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARTITION = 36;

    /**
     * The feature id for the '<em><b>POWERMART</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__POWERMART = 37;

    /**
     * The feature id for the '<em><b>RECURRING</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RECURRING = 38;

    /**
     * The feature id for the '<em><b>REPEAT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__REPEAT = 39;

    /**
     * The feature id for the '<em><b>REPOSITORY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__REPOSITORY = 40;

    /**
     * The feature id for the '<em><b>RESOURCEREFERENCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RESOURCEREFERENCE = 41;

    /**
     * The feature id for the '<em><b>SAPCODEBLOCK</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPCODEBLOCK = 42;

    /**
     * The feature id for the '<em><b>SAPFUNCINSTANCEPARAM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPFUNCINSTANCEPARAM = 43;

    /**
     * The feature id for the '<em><b>SAPFUNCINSTANCEPARAMFLD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPFUNCINSTANCEPARAMFLD = 44;

    /**
     * The feature id for the '<em><b>SAPFUNCPARAM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPFUNCPARAM = 45;

    /**
     * The feature id for the '<em><b>SAPFUNCTION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPFUNCTION = 46;

    /**
     * The feature id for the '<em><b>SAPFUNCTIONINSTANCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPFUNCTIONINSTANCE = 47;

    /**
     * The feature id for the '<em><b>SAPOUTPUTPORT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPOUTPUTPORT = 48;

    /**
     * The feature id for the '<em><b>SAPPROGRAM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPPROGRAM = 49;

    /**
     * The feature id for the '<em><b>SAPPROGRAMFLOWOBJECT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPPROGRAMFLOWOBJECT = 50;

    /**
     * The feature id for the '<em><b>SAPSTRUCTURE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPSTRUCTURE = 51;

    /**
     * The feature id for the '<em><b>SAPSTRUCTUREFIELD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPSTRUCTUREFIELD = 52;

    /**
     * The feature id for the '<em><b>SAPTABLEINSTANCEPARAM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPTABLEINSTANCEPARAM = 53;

    /**
     * The feature id for the '<em><b>SAPTABLEPARAM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPTABLEPARAM = 54;

    /**
     * The feature id for the '<em><b>SAPVARIABLE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SAPVARIABLE = 55;

    /**
     * The feature id for the '<em><b>SCHEDULEINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SCHEDULEINFO = 56;

    /**
     * The feature id for the '<em><b>SCHEDULEOPTIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SCHEDULEOPTIONS = 57;

    /**
     * The feature id for the '<em><b>SCHEDULER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SCHEDULER = 58;

    /**
     * The feature id for the '<em><b>SEBLJOIN</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SEBLJOIN = 59;

    /**
     * The feature id for the '<em><b>SEBLLINK</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SEBLLINK = 60;

    /**
     * The feature id for the '<em><b>SEBLMVLINK</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SEBLMVLINK = 61;

    /**
     * The feature id for the '<em><b>SEBLMVLINKREL</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SEBLMVLINKREL = 62;

    /**
     * The feature id for the '<em><b>SEBLSRCINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SEBLSRCINFO = 63;

    /**
     * The feature id for the '<em><b>SESSION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SESSION = 64;

    /**
     * The feature id for the '<em><b>SESSIONCOMPONENT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SESSIONCOMPONENT = 65;

    /**
     * The feature id for the '<em><b>SESSIONEXTENSION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SESSIONEXTENSION = 66;

    /**
     * The feature id for the '<em><b>SESSTRANSFORMATIONGROUP</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SESSTRANSFORMATIONGROUP = 67;

    /**
     * The feature id for the '<em><b>SESSTRANSFORMATIONINST</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SESSTRANSFORMATIONINST = 68;

    /**
     * The feature id for the '<em><b>SHORTCUT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SHORTCUT = 69;

    /**
     * The feature id for the '<em><b>SOURCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SOURCE = 70;

    /**
     * The feature id for the '<em><b>SOURCEFIELD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SOURCEFIELD = 71;

    /**
     * The feature id for the '<em><b>STARTOPTIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__STARTOPTIONS = 72;

    /**
     * The feature id for the '<em><b>TABLEATTRIBUTE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TABLEATTRIBUTE = 73;

    /**
     * The feature id for the '<em><b>TARGET</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TARGET = 74;

    /**
     * The feature id for the '<em><b>TARGETFIELD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TARGETFIELD = 75;

    /**
     * The feature id for the '<em><b>TARGETINDEX</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TARGETINDEX = 76;

    /**
     * The feature id for the '<em><b>TARGETINDEXFIELD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TARGETINDEXFIELD = 77;

    /**
     * The feature id for the '<em><b>TARGETLOADORDER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TARGETLOADORDER = 78;

    /**
     * The feature id for the '<em><b>TASK</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TASK = 79;

    /**
     * The feature id for the '<em><b>TASKINSTANCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TASKINSTANCE = 80;

    /**
     * The feature id for the '<em><b>TIMER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TIMER = 81;

    /**
     * The feature id for the '<em><b>TRANSFORMATION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TRANSFORMATION = 82;

    /**
     * The feature id for the '<em><b>TRANSFORMFIELD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TRANSFORMFIELD = 83;

    /**
     * The feature id for the '<em><b>TRANSFORMFIELDATTR</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TRANSFORMFIELDATTR = 84;

    /**
     * The feature id for the '<em><b>TRANSFORMFIELDATTRDEF</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TRANSFORMFIELDATTRDEF = 85;

    /**
     * The feature id for the '<em><b>TRANSFORMRESOURCEREF</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TRANSFORMRESOURCEREF = 86;

    /**
     * The feature id for the '<em><b>VALUEPAIR</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__VALUEPAIR = 87;

    /**
     * The feature id for the '<em><b>WORKFLOW</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__WORKFLOW = 88;

    /**
     * The feature id for the '<em><b>WORKFLOWEVENT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__WORKFLOWEVENT = 89;

    /**
     * The feature id for the '<em><b>WORKFLOWLINK</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__WORKFLOWLINK = 90;

    /**
     * The feature id for the '<em><b>WORKFLOWVARIABLE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__WORKFLOWVARIABLE = 91;

    /**
     * The feature id for the '<em><b>WORKLET</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__WORKLET = 92;

    /**
     * The feature id for the '<em><b>XMLINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLINFO = 93;

    /**
     * The feature id for the '<em><b>XMLTEXT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLTEXT = 94;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 95;

    /**
     * The meta object id for the '{@link Powrmart.impl.ENDOPTIONSTypeImpl <em>ENDOPTIONS Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.ENDOPTIONSTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getENDOPTIONSType()
     * @generated
     */
    int ENDOPTIONS_TYPE = 10;

    /**
     * The feature id for the '<em><b>ENDAFTER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDOPTIONS_TYPE__ENDAFTER = 0;

    /**
     * The feature id for the '<em><b>ENDON</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDOPTIONS_TYPE__ENDON = 1;

    /**
     * The feature id for the '<em><b>ENDTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDOPTIONS_TYPE__ENDTYPE = 2;

    /**
     * The feature id for the '<em><b>RUNFOREVER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDOPTIONS_TYPE__RUNFOREVER = 3;

    /**
     * The number of structural features of the '<em>ENDOPTIONS Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDOPTIONS_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link Powrmart.impl.ERPINFOTypeImpl <em>ERPINFO Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.ERPINFOTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getERPINFOType()
     * @generated
     */
    int ERPINFO_TYPE = 11;

    /**
     * The feature id for the '<em><b>SAPFUNCTION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERPINFO_TYPE__SAPFUNCTION = 0;

    /**
     * The feature id for the '<em><b>SAPSTRUCTURE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERPINFO_TYPE__SAPSTRUCTURE = 1;

    /**
     * The feature id for the '<em><b>SAPPROGRAM</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERPINFO_TYPE__SAPPROGRAM = 2;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERPINFO_TYPE__GROUP = 3;

    /**
     * The feature id for the '<em><b>SAPOUTPUTPORT</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERPINFO_TYPE__SAPOUTPUTPORT = 4;

    /**
     * The feature id for the '<em><b>SAPVARIABLE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERPINFO_TYPE__SAPVARIABLE = 5;

    /**
     * The feature id for the '<em><b>SAPPROGRAMFLOWOBJECT</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERPINFO_TYPE__SAPPROGRAMFLOWOBJECT = 6;

    /**
     * The number of structural features of the '<em>ERPINFO Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERPINFO_TYPE_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link Powrmart.impl.ERPSRCINFOTypeImpl <em>ERPSRCINFO Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.ERPSRCINFOTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getERPSRCINFOType()
     * @generated
     */
    int ERPSRCINFO_TYPE = 12;

    /**
     * The feature id for the '<em><b>SEBLSRCINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERPSRCINFO_TYPE__SEBLSRCINFO = 0;

    /**
     * The number of structural features of the '<em>ERPSRCINFO Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERPSRCINFO_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link Powrmart.impl.EXPRMACRODEPENDENCYTypeImpl <em>EXPRMACRODEPENDENCY Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.EXPRMACRODEPENDENCYTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getEXPRMACRODEPENDENCYType()
     * @generated
     */
    int EXPRMACRODEPENDENCY_TYPE = 13;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRMACRODEPENDENCY_TYPE__NAME = 0;

    /**
     * The number of structural features of the '<em>EXPRMACRODEPENDENCY Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRMACRODEPENDENCY_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link Powrmart.impl.EXPRMACROTypeImpl <em>EXPRMACRO Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.EXPRMACROTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getEXPRMACROType()
     * @generated
     */
    int EXPRMACRO_TYPE = 14;

    /**
     * The feature id for the '<em><b>MACROARGUMENT</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRMACRO_TYPE__MACROARGUMENT = 0;

    /**
     * The feature id for the '<em><b>MACRODEPENDENCY</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRMACRO_TYPE__MACRODEPENDENCY = 1;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRMACRO_TYPE__DESCRIPTION = 2;

    /**
     * The feature id for the '<em><b>EXPRESSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRMACRO_TYPE__EXPRESSION = 3;

    /**
     * The feature id for the '<em><b>MACROTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRMACRO_TYPE__MACROTYPE = 4;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRMACRO_TYPE__NAME = 5;

    /**
     * The feature id for the '<em><b>OBJECTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRMACRO_TYPE__OBJECTVERSION = 6;

    /**
     * The feature id for the '<em><b>PROTOTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRMACRO_TYPE__PROTOTYPE = 7;

    /**
     * The feature id for the '<em><b>RETURNTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRMACRO_TYPE__RETURNTYPE = 8;

    /**
     * The feature id for the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRMACRO_TYPE__VERSIONNUMBER = 9;

    /**
     * The number of structural features of the '<em>EXPRMACRO Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRMACRO_TYPE_FEATURE_COUNT = 10;

    /**
     * The meta object id for the '{@link Powrmart.impl.FIELDATTRIBUTETypeImpl <em>FIELDATTRIBUTE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.FIELDATTRIBUTETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getFIELDATTRIBUTEType()
     * @generated
     */
    int FIELDATTRIBUTE_TYPE = 15;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELDATTRIBUTE_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELDATTRIBUTE_TYPE__VALUE = 1;

    /**
     * The number of structural features of the '<em>FIELDATTRIBUTE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELDATTRIBUTE_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link Powrmart.impl.FIELDDEPENDENCYTypeImpl <em>FIELDDEPENDENCY Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.FIELDDEPENDENCYTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getFIELDDEPENDENCYType()
     * @generated
     */
    int FIELDDEPENDENCY_TYPE = 16;

    /**
     * The feature id for the '<em><b>INPUTFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELDDEPENDENCY_TYPE__INPUTFIELD = 0;

    /**
     * The feature id for the '<em><b>OUTPUTFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELDDEPENDENCY_TYPE__OUTPUTFIELD = 1;

    /**
     * The number of structural features of the '<em>FIELDDEPENDENCY Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELDDEPENDENCY_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link Powrmart.impl.FILTERTypeImpl <em>FILTER Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.FILTERTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getFILTERType()
     * @generated
     */
    int FILTER_TYPE = 17;

    /**
     * The feature id for the '<em><b>DAY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILTER_TYPE__DAY = 0;

    /**
     * The feature id for the '<em><b>DAYOFMONTH</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILTER_TYPE__DAYOFMONTH = 1;

    /**
     * The feature id for the '<em><b>OCCURRENCE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILTER_TYPE__OCCURRENCE = 2;

    /**
     * The number of structural features of the '<em>FILTER Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILTER_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.FLATFILETypeImpl <em>FLATFILE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.FLATFILETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getFLATFILEType()
     * @generated
     */
    int FLATFILE_TYPE = 18;

    /**
     * The feature id for the '<em><b>CODEPAGE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__CODEPAGE = 0;

    /**
     * The feature id for the '<em><b>CONSECDELIMITERSASONE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__CONSECDELIMITERSASONE = 1;

    /**
     * The feature id for the '<em><b>DELIMITED</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__DELIMITED = 2;

    /**
     * The feature id for the '<em><b>DELIMITERS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__DELIMITERS = 3;

    /**
     * The feature id for the '<em><b>DELIMITERSINBINARY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__DELIMITERSINBINARY = 4;

    /**
     * The feature id for the '<em><b>ESCAPECHARACTER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__ESCAPECHARACTER = 5;

    /**
     * The feature id for the '<em><b>FILENAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__FILENAME = 6;

    /**
     * The feature id for the '<em><b>FILETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__FILETYPE = 7;

    /**
     * The feature id for the '<em><b>KEEPESCAPECHAR</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__KEEPESCAPECHAR = 8;

    /**
     * The feature id for the '<em><b>LINESEQUENTIAL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__LINESEQUENTIAL = 9;

    /**
     * The feature id for the '<em><b>NULLCHARACTER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__NULLCHARACTER = 10;

    /**
     * The feature id for the '<em><b>NULLCHARTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__NULLCHARTYPE = 11;

    /**
     * The feature id for the '<em><b>PADBYTES</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__PADBYTES = 12;

    /**
     * The feature id for the '<em><b>QUOTECHARACTER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__QUOTECHARACTER = 13;

    /**
     * The feature id for the '<em><b>REPEATABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__REPEATABLE = 14;

    /**
     * The feature id for the '<em><b>ROWDELIMITER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__ROWDELIMITER = 15;

    /**
     * The feature id for the '<em><b>SHIFTSENSITIVEDATA</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__SHIFTSENSITIVEDATA = 16;

    /**
     * The feature id for the '<em><b>SKIPLEADINGBYTES</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__SKIPLEADINGBYTES = 17;

    /**
     * The feature id for the '<em><b>SKIPROWS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__SKIPROWS = 18;

    /**
     * The feature id for the '<em><b>SKIPTRAILINGBYTES</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__SKIPTRAILINGBYTES = 19;

    /**
     * The feature id for the '<em><b>STAGEFILEPERSIST</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__STAGEFILEPERSIST = 20;

    /**
     * The feature id for the '<em><b>STAGEFILEREINIT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__STAGEFILEREINIT = 21;

    /**
     * The feature id for the '<em><b>STRIPTRAILINGBLANKS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE__STRIPTRAILINGBLANKS = 22;

    /**
     * The number of structural features of the '<em>FLATFILE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLATFILE_TYPE_FEATURE_COUNT = 23;

    /**
     * The meta object id for the '{@link Powrmart.impl.FOLDERTypeImpl <em>FOLDER Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.FOLDERTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getFOLDERType()
     * @generated
     */
    int FOLDER_TYPE = 19;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__GROUP = 0;

    /**
     * The feature id for the '<em><b>FOLDERVERSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__FOLDERVERSION = 1;

    /**
     * The feature id for the '<em><b>CONFIG</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__CONFIG = 2;

    /**
     * The feature id for the '<em><b>SCHEDULER</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__SCHEDULER = 3;

    /**
     * The feature id for the '<em><b>TASK</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__TASK = 4;

    /**
     * The feature id for the '<em><b>SESSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__SESSION = 5;

    /**
     * The feature id for the '<em><b>WORKLET</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__WORKLET = 6;

    /**
     * The feature id for the '<em><b>WORKFLOW</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__WORKFLOW = 7;

    /**
     * The feature id for the '<em><b>SOURCE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__SOURCE = 8;

    /**
     * The feature id for the '<em><b>TARGET</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__TARGET = 9;

    /**
     * The feature id for the '<em><b>TRANSFORMATION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__TRANSFORMATION = 10;

    /**
     * The feature id for the '<em><b>MAPPLET</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__MAPPLET = 11;

    /**
     * The feature id for the '<em><b>MAPPING</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__MAPPING = 12;

    /**
     * The feature id for the '<em><b>SHORTCUT</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__SHORTCUT = 13;

    /**
     * The feature id for the '<em><b>EXPRMACRO</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__EXPRMACRO = 14;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__DESCRIPTION = 15;

    /**
     * The feature id for the '<em><b>GROUP1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__GROUP1 = 16;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__NAME = 17;

    /**
     * The feature id for the '<em><b>OWNER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__OWNER = 18;

    /**
     * The feature id for the '<em><b>PERMISSIONS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__PERMISSIONS = 19;

    /**
     * The feature id for the '<em><b>SHARED</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__SHARED = 20;

    /**
     * The feature id for the '<em><b>UUID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE__UUID = 21;

    /**
     * The number of structural features of the '<em>FOLDER Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDER_TYPE_FEATURE_COUNT = 22;

    /**
     * The meta object id for the '{@link Powrmart.impl.FOLDERVERSIONTypeImpl <em>FOLDERVERSION Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.FOLDERVERSIONTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getFOLDERVERSIONType()
     * @generated
     */
    int FOLDERVERSION_TYPE = 20;

    /**
     * The feature id for the '<em><b>SOURCE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDERVERSION_TYPE__SOURCE = 0;

    /**
     * The feature id for the '<em><b>TARGET</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDERVERSION_TYPE__TARGET = 1;

    /**
     * The feature id for the '<em><b>TRANSFORMATION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDERVERSION_TYPE__TRANSFORMATION = 2;

    /**
     * The feature id for the '<em><b>MAPPLET</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDERVERSION_TYPE__MAPPLET = 3;

    /**
     * The feature id for the '<em><b>MAPPING</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDERVERSION_TYPE__MAPPING = 4;

    /**
     * The feature id for the '<em><b>SHORTCUT</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDERVERSION_TYPE__SHORTCUT = 5;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDERVERSION_TYPE__DESCRIPTION = 6;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDERVERSION_TYPE__NAME = 7;

    /**
     * The number of structural features of the '<em>FOLDERVERSION Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOLDERVERSION_TYPE_FEATURE_COUNT = 8;

    /**
     * The meta object id for the '{@link Powrmart.impl.GROUPTypeImpl <em>GROUP Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.GROUPTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getGROUPType()
     * @generated
     */
    int GROUP_TYPE = 21;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_TYPE__DESCRIPTION = 0;

    /**
     * The feature id for the '<em><b>EXPRESSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_TYPE__EXPRESSION = 1;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_TYPE__NAME = 2;

    /**
     * The feature id for the '<em><b>ORDER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_TYPE__ORDER = 3;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_TYPE__TYPE = 4;

    /**
     * The number of structural features of the '<em>GROUP Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link Powrmart.impl.HASHKEYTypeImpl <em>HASHKEY Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.HASHKEYTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getHASHKEYType()
     * @generated
     */
    int HASHKEY_TYPE = 22;

    /**
     * The feature id for the '<em><b>GROUP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HASHKEY_TYPE__GROUP = 0;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HASHKEY_TYPE__NAME = 1;

    /**
     * The number of structural features of the '<em>HASHKEY Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HASHKEY_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link Powrmart.impl.INITPROPTypeImpl <em>INITPROP Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.INITPROPTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getINITPROPType()
     * @generated
     */
    int INITPROP_TYPE = 23;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITPROP_TYPE__DESCRIPTION = 0;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITPROP_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>USERDEFINED</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITPROP_TYPE__USERDEFINED = 2;

    /**
     * The feature id for the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITPROP_TYPE__VALUE = 3;

    /**
     * The number of structural features of the '<em>INITPROP Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITPROP_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link Powrmart.impl.INSTANCETypeImpl <em>INSTANCE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.INSTANCETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getINSTANCEType()
     * @generated
     */
    int INSTANCE_TYPE = 24;

    /**
     * The feature id for the '<em><b>TABLEATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE__TABLEATTRIBUTE = 0;

    /**
     * The feature id for the '<em><b>EXPRMACRODEPENDENCY</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE__EXPRMACRODEPENDENCY = 1;

    /**
     * The feature id for the '<em><b>INITPROP</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE__INITPROP = 2;

    /**
     * The feature id for the '<em><b>ASSOCIATEDSOURCEINSTANCE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE__ASSOCIATEDSOURCEINSTANCE = 3;

    /**
     * The feature id for the '<em><b>ASSOCIATEDDSQ</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE__ASSOCIATEDDSQ = 4;

    /**
     * The feature id for the '<em><b>ASSOCIATEDDSQTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE__ASSOCIATEDDSQTYPE = 5;

    /**
     * The feature id for the '<em><b>DBDNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE__DBDNAME = 6;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE__DESCRIPTION = 7;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE__NAME = 8;

    /**
     * The feature id for the '<em><b>REUSABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE__REUSABLE = 9;

    /**
     * The feature id for the '<em><b>TRANSFORMATIONNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE__TRANSFORMATIONNAME = 10;

    /**
     * The feature id for the '<em><b>TRANSFORMATIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE__TRANSFORMATIONTYPE = 11;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE__TYPE = 12;

    /**
     * The number of structural features of the '<em>INSTANCE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_TYPE_FEATURE_COUNT = 13;
    
    int INSTANCE_TYPE__FIELD = 14;

    /**
     * The meta object id for the '{@link Powrmart.impl.KEYRANGETypeImpl <em>KEYRANGE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.KEYRANGETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getKEYRANGEType()
     * @generated
     */
    int KEYRANGE_TYPE = 25;

    /**
     * The feature id for the '<em><b>ENDRANGE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYRANGE_TYPE__ENDRANGE = 0;

    /**
     * The feature id for the '<em><b>GROUP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYRANGE_TYPE__GROUP = 1;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYRANGE_TYPE__NAME = 2;

    /**
     * The feature id for the '<em><b>SRCINSTANCENAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYRANGE_TYPE__SRCINSTANCENAME = 3;

    /**
     * The feature id for the '<em><b>STARTRANGE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYRANGE_TYPE__STARTRANGE = 4;

    /**
     * The number of structural features of the '<em>KEYRANGE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYRANGE_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link Powrmart.impl.KEYWORDTypeImpl <em>KEYWORD Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.KEYWORDTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getKEYWORDType()
     * @generated
     */
    int KEYWORD_TYPE = 26;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYWORD_TYPE__NAME = 0;

    /**
     * The number of structural features of the '<em>KEYWORD Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEYWORD_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link Powrmart.impl.MACROARGUMENTTypeImpl <em>MACROARGUMENT Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.MACROARGUMENTTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getMACROARGUMENTType()
     * @generated
     */
    int MACROARGUMENT_TYPE = 27;

    /**
     * The feature id for the '<em><b>ARGORDER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROARGUMENT_TYPE__ARGORDER = 0;

    /**
     * The feature id for the '<em><b>DATATYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROARGUMENT_TYPE__DATATYPE = 1;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROARGUMENT_TYPE__NAME = 2;

    /**
     * The feature id for the '<em><b>PRECISION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROARGUMENT_TYPE__PRECISION = 3;

    /**
     * The feature id for the '<em><b>SCALE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROARGUMENT_TYPE__SCALE = 4;

    /**
     * The number of structural features of the '<em>MACROARGUMENT Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACROARGUMENT_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link Powrmart.impl.MACRODEPENDENCYTypeImpl <em>MACRODEPENDENCY Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.MACRODEPENDENCYTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getMACRODEPENDENCYType()
     * @generated
     */
    int MACRODEPENDENCY_TYPE = 28;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACRODEPENDENCY_TYPE__NAME = 0;

    /**
     * The number of structural features of the '<em>MACRODEPENDENCY Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACRODEPENDENCY_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link Powrmart.impl.MAPDEPENDENCYTypeImpl <em>MAPDEPENDENCY Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.MAPDEPENDENCYTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getMAPDEPENDENCYType()
     * @generated
     */
    int MAPDEPENDENCY_TYPE = 29;

    /**
     * The feature id for the '<em><b>FROMINSTANCE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPDEPENDENCY_TYPE__FROMINSTANCE = 0;

    /**
     * The feature id for the '<em><b>FROMINSTANCETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPDEPENDENCY_TYPE__FROMINSTANCETYPE = 1;

    /**
     * The feature id for the '<em><b>TOINSTANCE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPDEPENDENCY_TYPE__TOINSTANCE = 2;

    /**
     * The feature id for the '<em><b>TOINSTANCETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPDEPENDENCY_TYPE__TOINSTANCETYPE = 3;

    /**
     * The number of structural features of the '<em>MAPDEPENDENCY Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPDEPENDENCY_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link Powrmart.impl.MAPPINGTypeImpl <em>MAPPING Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.MAPPINGTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getMAPPINGType()
     * @generated
     */
    int MAPPING_TYPE = 30;

    /**
     * The feature id for the '<em><b>TRANSFORMATION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__TRANSFORMATION = 0;

    /**
     * The feature id for the '<em><b>INSTANCE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__INSTANCE = 1;

    /**
     * The feature id for the '<em><b>CONNECTOR</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__CONNECTOR = 2;

    /**
     * The feature id for the '<em><b>MAPDEPENDENCY</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__MAPDEPENDENCY = 3;

    /**
     * The feature id for the '<em><b>TARGETLOADORDER</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__TARGETLOADORDER = 4;

    /**
     * The feature id for the '<em><b>MAPPINGVARIABLE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__MAPPINGVARIABLE = 5;

    /**
     * The feature id for the '<em><b>ERPINFO</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__ERPINFO = 6;

    /**
     * The feature id for the '<em><b>METADATAEXTENSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__METADATAEXTENSION = 7;

    /**
     * The feature id for the '<em><b>CRCVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__CRCVALUE = 8;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__DESCRIPTION = 9;

    /**
     * The feature id for the '<em><b>ISPROFILEMAPPING</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__ISPROFILEMAPPING = 10;

    /**
     * The feature id for the '<em><b>ISVALID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__ISVALID = 11;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__NAME = 12;

    /**
     * The feature id for the '<em><b>OBJECTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__OBJECTVERSION = 13;

    /**
     * The feature id for the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE__VERSIONNUMBER = 14;

    /**
     * The number of structural features of the '<em>MAPPING Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPING_TYPE_FEATURE_COUNT = 15;

    /**
     * The meta object id for the '{@link Powrmart.impl.MAPPINGVARIABLETypeImpl <em>MAPPINGVARIABLE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.MAPPINGVARIABLETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getMAPPINGVARIABLEType()
     * @generated
     */
    int MAPPINGVARIABLE_TYPE = 31;

    /**
     * The feature id for the '<em><b>AGGFUNCTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGVARIABLE_TYPE__AGGFUNCTION = 0;

    /**
     * The feature id for the '<em><b>DATATYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGVARIABLE_TYPE__DATATYPE = 1;

    /**
     * The feature id for the '<em><b>DEFAULTVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGVARIABLE_TYPE__DEFAULTVALUE = 2;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGVARIABLE_TYPE__DESCRIPTION = 3;

    /**
     * The feature id for the '<em><b>ISEXPRESSIONVARIABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGVARIABLE_TYPE__ISEXPRESSIONVARIABLE = 4;

    /**
     * The feature id for the '<em><b>ISPARAM</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGVARIABLE_TYPE__ISPARAM = 5;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGVARIABLE_TYPE__NAME = 6;

    /**
     * The feature id for the '<em><b>PRECISION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGVARIABLE_TYPE__PRECISION = 7;

    /**
     * The feature id for the '<em><b>SCALE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGVARIABLE_TYPE__SCALE = 8;

    /**
     * The feature id for the '<em><b>USERDEFINED</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGVARIABLE_TYPE__USERDEFINED = 9;

    /**
     * The number of structural features of the '<em>MAPPINGVARIABLE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPINGVARIABLE_TYPE_FEATURE_COUNT = 10;

    /**
     * The meta object id for the '{@link Powrmart.impl.MAPPLETTypeImpl <em>MAPPLET Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.MAPPLETTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getMAPPLETType()
     * @generated
     */
    int MAPPLET_TYPE = 32;

    /**
     * The feature id for the '<em><b>TRANSFORMATION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPLET_TYPE__TRANSFORMATION = 0;

    /**
     * The feature id for the '<em><b>INSTANCE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPLET_TYPE__INSTANCE = 1;

    /**
     * The feature id for the '<em><b>CONNECTOR</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPLET_TYPE__CONNECTOR = 2;

    /**
     * The feature id for the '<em><b>MAPPINGVARIABLE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPLET_TYPE__MAPPINGVARIABLE = 3;

    /**
     * The feature id for the '<em><b>ERPINFO</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPLET_TYPE__ERPINFO = 4;

    /**
     * The feature id for the '<em><b>METADATAEXTENSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPLET_TYPE__METADATAEXTENSION = 5;

    /**
     * The feature id for the '<em><b>CRCVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPLET_TYPE__CRCVALUE = 6;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPLET_TYPE__DESCRIPTION = 7;

    /**
     * The feature id for the '<em><b>ISVALID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPLET_TYPE__ISVALID = 8;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPLET_TYPE__NAME = 9;

    /**
     * The feature id for the '<em><b>OBJECTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPLET_TYPE__OBJECTVERSION = 10;

    /**
     * The feature id for the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPLET_TYPE__VERSIONNUMBER = 11;

    /**
     * The number of structural features of the '<em>MAPPLET Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPLET_TYPE_FEATURE_COUNT = 12;

    /**
     * The meta object id for the '{@link Powrmart.impl.METADATAEXTENSIONTypeImpl <em>METADATAEXTENSION Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.METADATAEXTENSIONTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getMETADATAEXTENSIONType()
     * @generated
     */
    int METADATAEXTENSION_TYPE = 33;

    /**
     * The feature id for the '<em><b>COMPONENTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE__COMPONENTVERSION = 0;

    /**
     * The feature id for the '<em><b>DATATYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE__DATATYPE = 1;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE__DESCRIPTION = 2;

    /**
     * The feature id for the '<em><b>DOMAINNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE__DOMAINNAME = 3;

    /**
     * The feature id for the '<em><b>ISCLIENTEDITABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE__ISCLIENTEDITABLE = 4;

    /**
     * The feature id for the '<em><b>ISCLIENTVISIBLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE__ISCLIENTVISIBLE = 5;

    /**
     * The feature id for the '<em><b>ISREUSABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE__ISREUSABLE = 6;

    /**
     * The feature id for the '<em><b>ISSHAREREAD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE__ISSHAREREAD = 7;

    /**
     * The feature id for the '<em><b>ISSHAREWRITE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE__ISSHAREWRITE = 8;

    /**
     * The feature id for the '<em><b>MAXLENGTH</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE__MAXLENGTH = 9;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE__NAME = 10;

    /**
     * The feature id for the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE__VALUE = 11;

    /**
     * The feature id for the '<em><b>VENDORNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE__VENDORNAME = 12;

    /**
     * The number of structural features of the '<em>METADATAEXTENSION Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATAEXTENSION_TYPE_FEATURE_COUNT = 13;

    /**
     * The meta object id for the '{@link Powrmart.impl.PARTITIONTypeImpl <em>PARTITION Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.PARTITIONTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getPARTITIONType()
     * @generated
     */
    int PARTITION_TYPE = 34;

    /**
     * The feature id for the '<em><b>KEYRANGE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION_TYPE__KEYRANGE = 0;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION_TYPE__DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION_TYPE__NAME = 2;

    /**
     * The number of structural features of the '<em>PARTITION Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTITION_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.POWERMARTTypeImpl <em>POWERMART Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.POWERMARTTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getPOWERMARTType()
     * @generated
     */
    int POWERMART_TYPE = 35;

    /**
     * The feature id for the '<em><b>REPOSITORY</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWERMART_TYPE__REPOSITORY = 0;

    /**
     * The feature id for the '<em><b>CREATIONDATE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWERMART_TYPE__CREATIONDATE = 1;

    /**
     * The feature id for the '<em><b>REPOSITORYVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWERMART_TYPE__REPOSITORYVERSION = 2;

    /**
     * The number of structural features of the '<em>POWERMART Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWERMART_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.RECURRINGTypeImpl <em>RECURRING Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.RECURRINGTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getRECURRINGType()
     * @generated
     */
    int RECURRING_TYPE = 36;

    /**
     * The feature id for the '<em><b>DAYS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURRING_TYPE__DAYS = 0;

    /**
     * The feature id for the '<em><b>HOURS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURRING_TYPE__HOURS = 1;

    /**
     * The feature id for the '<em><b>MINUTES</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURRING_TYPE__MINUTES = 2;

    /**
     * The number of structural features of the '<em>RECURRING Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECURRING_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.REPEATTypeImpl <em>REPEAT Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.REPEATTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getREPEATType()
     * @generated
     */
    int REPEAT_TYPE = 37;

    /**
     * The feature id for the '<em><b>FILTER</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_TYPE__FILTER = 0;

    /**
     * The feature id for the '<em><b>INTERVAL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_TYPE__INTERVAL = 1;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_TYPE__TYPE = 2;

    /**
     * The number of structural features of the '<em>REPEAT Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.REPOSITORYTypeImpl <em>REPOSITORY Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.REPOSITORYTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getREPOSITORYType()
     * @generated
     */
    int REPOSITORY_TYPE = 38;

    /**
     * The feature id for the '<em><b>FOLDER</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_TYPE__FOLDER = 0;

    /**
     * The feature id for the '<em><b>CODEPAGE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_TYPE__CODEPAGE = 1;

    /**
     * The feature id for the '<em><b>DATABASETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_TYPE__DATABASETYPE = 2;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_TYPE__NAME = 3;

    /**
     * The feature id for the '<em><b>PARENTREPOSITORY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_TYPE__PARENTREPOSITORY = 4;

    /**
     * The feature id for the '<em><b>VERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_TYPE__VERSION = 5;

    /**
     * The number of structural features of the '<em>REPOSITORY Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link Powrmart.impl.RESOURCEREFERENCETypeImpl <em>RESOURCEREFERENCE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.RESOURCEREFERENCETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getRESOURCEREFERENCEType()
     * @generated
     */
    int RESOURCEREFERENCE_TYPE = 39;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCEREFERENCE_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCEREFERENCE_TYPE__TYPE = 1;

    /**
     * The number of structural features of the '<em>RESOURCEREFERENCE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCEREFERENCE_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPCODEBLOCKTypeImpl <em>SAPCODEBLOCK Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPCODEBLOCKTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPCODEBLOCKType()
     * @generated
     */
    int SAPCODEBLOCK_TYPE = 40;

    /**
     * The feature id for the '<em><b>CODEBLOCK</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPCODEBLOCK_TYPE__CODEBLOCK = 0;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPCODEBLOCK_TYPE__DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>DSQINSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPCODEBLOCK_TYPE__DSQINSTNAME = 2;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPCODEBLOCK_TYPE__NAME = 3;

    /**
     * The number of structural features of the '<em>SAPCODEBLOCK Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPCODEBLOCK_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPFUNCINSTANCEPARAMFLDTypeImpl <em>SAPFUNCINSTANCEPARAMFLD Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPFUNCINSTANCEPARAMFLDTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPFUNCINSTANCEPARAMFLDType()
     * @generated
     */
    int SAPFUNCINSTANCEPARAMFLD_TYPE = 41;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCINSTANCEPARAMFLD_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCINSTANCEPARAMFLD_TYPE__VALUE = 1;

    /**
     * The feature id for the '<em><b>VALUETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCINSTANCEPARAMFLD_TYPE__VALUETYPE = 2;

    /**
     * The number of structural features of the '<em>SAPFUNCINSTANCEPARAMFLD Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCINSTANCEPARAMFLD_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPFUNCINSTANCEPARAMTypeImpl <em>SAPFUNCINSTANCEPARAM Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPFUNCINSTANCEPARAMTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPFUNCINSTANCEPARAMType()
     * @generated
     */
    int SAPFUNCINSTANCEPARAM_TYPE = 42;

    /**
     * The feature id for the '<em><b>SAPFUNCINSTANCEPARAMFLD</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCINSTANCEPARAM_TYPE__SAPFUNCINSTANCEPARAMFLD = 0;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCINSTANCEPARAM_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCINSTANCEPARAM_TYPE__TYPE = 2;

    /**
     * The feature id for the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCINSTANCEPARAM_TYPE__VALUE = 3;

    /**
     * The feature id for the '<em><b>VALUETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCINSTANCEPARAM_TYPE__VALUETYPE = 4;

    /**
     * The number of structural features of the '<em>SAPFUNCINSTANCEPARAM Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCINSTANCEPARAM_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPFUNCPARAMTypeImpl <em>SAPFUNCPARAM Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPFUNCPARAMTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPFUNCPARAMType()
     * @generated
     */
    int SAPFUNCPARAM_TYPE = 43;

    /**
     * The feature id for the '<em><b>DATATYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCPARAM_TYPE__DATATYPE = 0;

    /**
     * The feature id for the '<em><b>DEF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCPARAM_TYPE__DEF = 1;

    /**
     * The feature id for the '<em><b>DEFAULTVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCPARAM_TYPE__DEFAULTVALUE = 2;

    /**
     * The feature id for the '<em><b>ISOPTIONAL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCPARAM_TYPE__ISOPTIONAL = 3;

    /**
     * The feature id for the '<em><b>ISREFERENCE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCPARAM_TYPE__ISREFERENCE = 4;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCPARAM_TYPE__NAME = 5;

    /**
     * The feature id for the '<em><b>ORDER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCPARAM_TYPE__ORDER = 6;

    /**
     * The feature id for the '<em><b>PRECISION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCPARAM_TYPE__PRECISION = 7;

    /**
     * The feature id for the '<em><b>SCALE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCPARAM_TYPE__SCALE = 8;

    /**
     * The feature id for the '<em><b>SUBTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCPARAM_TYPE__SUBTYPE = 9;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCPARAM_TYPE__TYPE = 10;

    /**
     * The number of structural features of the '<em>SAPFUNCPARAM Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCPARAM_TYPE_FEATURE_COUNT = 11;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPFUNCTIONINSTANCETypeImpl <em>SAPFUNCTIONINSTANCE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPFUNCTIONINSTANCETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPFUNCTIONINSTANCEType()
     * @generated
     */
    int SAPFUNCTIONINSTANCE_TYPE = 44;

    /**
     * The feature id for the '<em><b>SAPFUNCINSTANCEPARAM</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCTIONINSTANCE_TYPE__SAPFUNCINSTANCEPARAM = 0;

    /**
     * The feature id for the '<em><b>SAPTABLEINSTANCEPARAM</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCTIONINSTANCE_TYPE__SAPTABLEINSTANCEPARAM = 1;

    /**
     * The feature id for the '<em><b>DSQINSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCTIONINSTANCE_TYPE__DSQINSTNAME = 2;

    /**
     * The feature id for the '<em><b>FUNCTIONNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCTIONINSTANCE_TYPE__FUNCTIONNAME = 3;

    /**
     * The number of structural features of the '<em>SAPFUNCTIONINSTANCE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCTIONINSTANCE_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPFUNCTIONTypeImpl <em>SAPFUNCTION Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPFUNCTIONTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPFUNCTIONType()
     * @generated
     */
    int SAPFUNCTION_TYPE = 45;

    /**
     * The feature id for the '<em><b>SAPFUNCPARAM</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCTION_TYPE__SAPFUNCPARAM = 0;

    /**
     * The feature id for the '<em><b>SAPTABLEPARAM</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCTION_TYPE__SAPTABLEPARAM = 1;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCTION_TYPE__DESCRIPTION = 2;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCTION_TYPE__NAME = 3;

    /**
     * The number of structural features of the '<em>SAPFUNCTION Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPFUNCTION_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPOUTPUTPORTTypeImpl <em>SAPOUTPUTPORT Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPOUTPUTPORTTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPOUTPUTPORTType()
     * @generated
     */
    int SAPOUTPUTPORT_TYPE = 46;

    /**
     * The feature id for the '<em><b>DSQINSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPOUTPUTPORT_TYPE__DSQINSTNAME = 0;

    /**
     * The feature id for the '<em><b>FIELDNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPOUTPUTPORT_TYPE__FIELDNAME = 1;

    /**
     * The feature id for the '<em><b>PORTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPOUTPUTPORT_TYPE__PORTNAME = 2;

    /**
     * The feature id for the '<em><b>VARNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPOUTPUTPORT_TYPE__VARNAME = 3;

    /**
     * The number of structural features of the '<em>SAPOUTPUTPORT Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPOUTPUTPORT_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPPROGRAMFLOWOBJECTTypeImpl <em>SAPPROGRAMFLOWOBJECT Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPPROGRAMFLOWOBJECTTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPPROGRAMFLOWOBJECTType()
     * @generated
     */
    int SAPPROGRAMFLOWOBJECT_TYPE = 47;

    /**
     * The feature id for the '<em><b>SAPFUNCTIONINSTANCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAMFLOWOBJECT_TYPE__SAPFUNCTIONINSTANCE = 0;

    /**
     * The feature id for the '<em><b>SAPCODEBLOCK</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAMFLOWOBJECT_TYPE__SAPCODEBLOCK = 1;

    /**
     * The feature id for the '<em><b>DSQINSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAMFLOWOBJECT_TYPE__DSQINSTNAME = 2;

    /**
     * The feature id for the '<em><b>JOINBITMAP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAMFLOWOBJECT_TYPE__JOINBITMAP = 3;

    /**
     * The feature id for the '<em><b>ORDER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAMFLOWOBJECT_TYPE__ORDER = 4;

    /**
     * The feature id for the '<em><b>REFDBDNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAMFLOWOBJECT_TYPE__REFDBDNAME = 5;

    /**
     * The feature id for the '<em><b>REFSOURCENAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAMFLOWOBJECT_TYPE__REFSOURCENAME = 6;

    /**
     * The feature id for the '<em><b>REFSOURCEINSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAMFLOWOBJECT_TYPE__REFSOURCEINSTNAME = 7;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAMFLOWOBJECT_TYPE__TYPE = 8;

    /**
     * The number of structural features of the '<em>SAPPROGRAMFLOWOBJECT Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAMFLOWOBJECT_TYPE_FEATURE_COUNT = 9;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPPROGRAMTypeImpl <em>SAPPROGRAM Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPPROGRAMTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPPROGRAMType()
     * @generated
     */
    int SAPPROGRAM_TYPE = 48;

    /**
     * The feature id for the '<em><b>CLIENTSPACE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAM_TYPE__CLIENTSPACE = 0;

    /**
     * The feature id for the '<em><b>HOSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAM_TYPE__HOSTNAME = 1;

    /**
     * The feature id for the '<em><b>INSTALLTIME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAM_TYPE__INSTALLTIME = 2;

    /**
     * The feature id for the '<em><b>ISVALID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAM_TYPE__ISVALID = 3;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAM_TYPE__NAME = 4;

    /**
     * The feature id for the '<em><b>PROGRAMTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAM_TYPE__PROGRAMTYPE = 5;

    /**
     * The feature id for the '<em><b>USERNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAM_TYPE__USERNAME = 6;

    /**
     * The number of structural features of the '<em>SAPPROGRAM Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPPROGRAM_TYPE_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPSTRUCTUREFIELDTypeImpl <em>SAPSTRUCTUREFIELD Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPSTRUCTUREFIELDTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPSTRUCTUREFIELDType()
     * @generated
     */
    int SAPSTRUCTUREFIELD_TYPE = 49;

    /**
     * The feature id for the '<em><b>DATATYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPSTRUCTUREFIELD_TYPE__DATATYPE = 0;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPSTRUCTUREFIELD_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>ORDER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPSTRUCTUREFIELD_TYPE__ORDER = 2;

    /**
     * The feature id for the '<em><b>PRECISION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPSTRUCTUREFIELD_TYPE__PRECISION = 3;

    /**
     * The feature id for the '<em><b>SCALE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPSTRUCTUREFIELD_TYPE__SCALE = 4;

    /**
     * The number of structural features of the '<em>SAPSTRUCTUREFIELD Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPSTRUCTUREFIELD_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPSTRUCTURETypeImpl <em>SAPSTRUCTURE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPSTRUCTURETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPSTRUCTUREType()
     * @generated
     */
    int SAPSTRUCTURE_TYPE = 50;

    /**
     * The feature id for the '<em><b>SAPSTRUCTUREFIELD</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPSTRUCTURE_TYPE__SAPSTRUCTUREFIELD = 0;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPSTRUCTURE_TYPE__NAME = 1;

    /**
     * The number of structural features of the '<em>SAPSTRUCTURE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPSTRUCTURE_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPTABLEINSTANCEPARAMTypeImpl <em>SAPTABLEINSTANCEPARAM Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPTABLEINSTANCEPARAMTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPTABLEINSTANCEPARAMType()
     * @generated
     */
    int SAPTABLEINSTANCEPARAM_TYPE = 51;

    /**
     * The feature id for the '<em><b>SAPFUNCINSTANCEPARAMFLD</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPTABLEINSTANCEPARAM_TYPE__SAPFUNCINSTANCEPARAMFLD = 0;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPTABLEINSTANCEPARAM_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPTABLEINSTANCEPARAM_TYPE__TYPE = 2;

    /**
     * The feature id for the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPTABLEINSTANCEPARAM_TYPE__VALUE = 3;

    /**
     * The feature id for the '<em><b>VALUETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPTABLEINSTANCEPARAM_TYPE__VALUETYPE = 4;

    /**
     * The number of structural features of the '<em>SAPTABLEINSTANCEPARAM Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPTABLEINSTANCEPARAM_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPTABLEPARAMTypeImpl <em>SAPTABLEPARAM Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPTABLEPARAMTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPTABLEPARAMType()
     * @generated
     */
    int SAPTABLEPARAM_TYPE = 52;

    /**
     * The feature id for the '<em><b>DEF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPTABLEPARAM_TYPE__DEF = 0;

    /**
     * The feature id for the '<em><b>ISOPTIONAL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPTABLEPARAM_TYPE__ISOPTIONAL = 1;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPTABLEPARAM_TYPE__NAME = 2;

    /**
     * The feature id for the '<em><b>ORDER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPTABLEPARAM_TYPE__ORDER = 3;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPTABLEPARAM_TYPE__TYPE = 4;

    /**
     * The number of structural features of the '<em>SAPTABLEPARAM Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPTABLEPARAM_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link Powrmart.impl.SAPVARIABLETypeImpl <em>SAPVARIABLE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SAPVARIABLETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSAPVARIABLEType()
     * @generated
     */
    int SAPVARIABLE_TYPE = 53;

    /**
     * The feature id for the '<em><b>DATATYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPVARIABLE_TYPE__DATATYPE = 0;

    /**
     * The feature id for the '<em><b>DEFAULTVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPVARIABLE_TYPE__DEFAULTVALUE = 1;

    /**
     * The feature id for the '<em><b>DSQINSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPVARIABLE_TYPE__DSQINSTNAME = 2;

    /**
     * The feature id for the '<em><b>ISOUTPUTPORT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPVARIABLE_TYPE__ISOUTPUTPORT = 3;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPVARIABLE_TYPE__NAME = 4;

    /**
     * The feature id for the '<em><b>PRECISION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPVARIABLE_TYPE__PRECISION = 5;

    /**
     * The feature id for the '<em><b>SCALE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPVARIABLE_TYPE__SCALE = 6;

    /**
     * The feature id for the '<em><b>SUBTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPVARIABLE_TYPE__SUBTYPE = 7;

    /**
     * The feature id for the '<em><b>VARDEF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPVARIABLE_TYPE__VARDEF = 8;

    /**
     * The number of structural features of the '<em>SAPVARIABLE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPVARIABLE_TYPE_FEATURE_COUNT = 9;

    /**
     * The meta object id for the '{@link Powrmart.impl.SCHEDULEINFOImpl <em>SCHEDULEINFO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SCHEDULEINFOImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSCHEDULEINFO()
     * @generated
     */
    int SCHEDULEINFO = 54;

    /**
     * The feature id for the '<em><b>SCHEDULEINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULEINFO__SCHEDULEINFO = 0;

    /**
     * The number of structural features of the '<em>SCHEDULEINFO</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULEINFO_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link Powrmart.impl.SCHEDULEINFOTypeImpl <em>SCHEDULEINFO Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SCHEDULEINFOTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSCHEDULEINFOType()
     * @generated
     */
    int SCHEDULEINFO_TYPE = 55;

    /**
     * The feature id for the '<em><b>STARTOPTIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULEINFO_TYPE__STARTOPTIONS = 0;

    /**
     * The feature id for the '<em><b>SCHEDULEOPTIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULEINFO_TYPE__SCHEDULEOPTIONS = 1;

    /**
     * The feature id for the '<em><b>ENDOPTIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULEINFO_TYPE__ENDOPTIONS = 2;

    /**
     * The feature id for the '<em><b>SCHEDULETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULEINFO_TYPE__SCHEDULETYPE = 3;

    /**
     * The number of structural features of the '<em>SCHEDULEINFO Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULEINFO_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link Powrmart.impl.SCHEDULEOPTIONSTypeImpl <em>SCHEDULEOPTIONS Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SCHEDULEOPTIONSTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSCHEDULEOPTIONSType()
     * @generated
     */
    int SCHEDULEOPTIONS_TYPE = 56;

    /**
     * The feature id for the '<em><b>RECURRING</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULEOPTIONS_TYPE__RECURRING = 0;

    /**
     * The feature id for the '<em><b>CUSTOM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULEOPTIONS_TYPE__CUSTOM = 1;

    /**
     * The feature id for the '<em><b>SCHEDULETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULEOPTIONS_TYPE__SCHEDULETYPE = 2;

    /**
     * The number of structural features of the '<em>SCHEDULEOPTIONS Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULEOPTIONS_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.SCHEDULERTypeImpl <em>SCHEDULER Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SCHEDULERTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSCHEDULERType()
     * @generated
     */
    int SCHEDULER_TYPE = 57;

    /**
     * The feature id for the '<em><b>SCHEDULEINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULER_TYPE__SCHEDULEINFO = SCHEDULEINFO__SCHEDULEINFO;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULER_TYPE__DESCRIPTION = SCHEDULEINFO_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULER_TYPE__NAME = SCHEDULEINFO_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>REUSABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULER_TYPE__REUSABLE = SCHEDULEINFO_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULER_TYPE__VERSIONNUMBER = SCHEDULEINFO_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>SCHEDULER Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEDULER_TYPE_FEATURE_COUNT = SCHEDULEINFO_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link Powrmart.impl.SEBLJOINTypeImpl <em>SEBLJOIN Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SEBLJOINTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSEBLJOINType()
     * @generated
     */
    int SEBLJOIN_TYPE = 58;

    /**
     * The feature id for the '<em><b>DESTCOL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLJOIN_TYPE__DESTCOL = 0;

    /**
     * The feature id for the '<em><b>FKTABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLJOIN_TYPE__FKTABLE = 1;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLJOIN_TYPE__NAME = 2;

    /**
     * The feature id for the '<em><b>OUTERJOINREL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLJOIN_TYPE__OUTERJOINREL = 3;

    /**
     * The feature id for the '<em><b>PKTABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLJOIN_TYPE__PKTABLE = 4;

    /**
     * The feature id for the '<em><b>SRCCOL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLJOIN_TYPE__SRCCOL = 5;

    /**
     * The number of structural features of the '<em>SEBLJOIN Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLJOIN_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link Powrmart.impl.SEBLLINKTypeImpl <em>SEBLLINK Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SEBLLINKTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSEBLLINKType()
     * @generated
     */
    int SEBLLINK_TYPE = 59;

    /**
     * The feature id for the '<em><b>CHILDBC</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLLINK_TYPE__CHILDBC = 0;

    /**
     * The feature id for the '<em><b>DESTBCBASETABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLLINK_TYPE__DESTBCBASETABLE = 1;

    /**
     * The feature id for the '<em><b>DESTCOL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLLINK_TYPE__DESTCOL = 2;

    /**
     * The feature id for the '<em><b>INTERCHILDCOL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLLINK_TYPE__INTERCHILDCOL = 3;

    /**
     * The feature id for the '<em><b>INTERPARENTCOL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLLINK_TYPE__INTERPARENTCOL = 4;

    /**
     * The feature id for the '<em><b>INTERTABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLLINK_TYPE__INTERTABLE = 5;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLLINK_TYPE__NAME = 6;

    /**
     * The feature id for the '<em><b>PARENTBC</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLLINK_TYPE__PARENTBC = 7;

    /**
     * The feature id for the '<em><b>PRIMARYID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLLINK_TYPE__PRIMARYID = 8;

    /**
     * The feature id for the '<em><b>SRCCOL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLLINK_TYPE__SRCCOL = 9;

    /**
     * The number of structural features of the '<em>SEBLLINK Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLLINK_TYPE_FEATURE_COUNT = 10;

    /**
     * The meta object id for the '{@link Powrmart.impl.SEBLMVLINKRELTypeImpl <em>SEBLMVLINKREL Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SEBLMVLINKRELTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSEBLMVLINKRELType()
     * @generated
     */
    int SEBLMVLINKREL_TYPE = 60;

    /**
     * The feature id for the '<em><b>DESTMVLINK</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLMVLINKREL_TYPE__DESTMVLINK = 0;

    /**
     * The feature id for the '<em><b>FIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLMVLINKREL_TYPE__FIELD = 1;

    /**
     * The feature id for the '<em><b>SRCMVLINK</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLMVLINKREL_TYPE__SRCMVLINK = 2;

    /**
     * The number of structural features of the '<em>SEBLMVLINKREL Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLMVLINKREL_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.SEBLMVLINKTypeImpl <em>SEBLMVLINK Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SEBLMVLINKTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSEBLMVLINKType()
     * @generated
     */
    int SEBLMVLINK_TYPE = 61;

    /**
     * The feature id for the '<em><b>BCNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLMVLINK_TYPE__BCNAME = 0;

    /**
     * The feature id for the '<em><b>DESTBC</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLMVLINK_TYPE__DESTBC = 1;

    /**
     * The feature id for the '<em><b>DESTLINK</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLMVLINK_TYPE__DESTLINK = 2;

    /**
     * The feature id for the '<em><b>MVLINK</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLMVLINK_TYPE__MVLINK = 3;

    /**
     * The feature id for the '<em><b>PRIMARYID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLMVLINK_TYPE__PRIMARYID = 4;

    /**
     * The feature id for the '<em><b>SRCFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLMVLINK_TYPE__SRCFIELD = 5;

    /**
     * The number of structural features of the '<em>SEBLMVLINK Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLMVLINK_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link Powrmart.impl.SEBLSRCINFOTypeImpl <em>SEBLSRCINFO Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SEBLSRCINFOTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSEBLSRCINFOType()
     * @generated
     */
    int SEBLSRCINFO_TYPE = 62;

    /**
     * The feature id for the '<em><b>SEBLJOIN</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLSRCINFO_TYPE__SEBLJOIN = 0;

    /**
     * The feature id for the '<em><b>SEBLLINK</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLSRCINFO_TYPE__SEBLLINK = 1;

    /**
     * The feature id for the '<em><b>SEBLMVLINK</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLSRCINFO_TYPE__SEBLMVLINK = 2;

    /**
     * The feature id for the '<em><b>SEBLMVLINKREL</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLSRCINFO_TYPE__SEBLMVLINKREL = 3;

    /**
     * The number of structural features of the '<em>SEBLSRCINFO Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEBLSRCINFO_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link Powrmart.impl.SESSIONCOMPONENTTypeImpl <em>SESSIONCOMPONENT Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SESSIONCOMPONENTTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSESSIONCOMPONENTType()
     * @generated
     */
    int SESSIONCOMPONENT_TYPE = 63;

    /**
     * The feature id for the '<em><b>TASK</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONCOMPONENT_TYPE__TASK = 0;

    /**
     * The feature id for the '<em><b>VALUEPAIR</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONCOMPONENT_TYPE__VALUEPAIR = 1;

    /**
     * The feature id for the '<em><b>ATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONCOMPONENT_TYPE__ATTRIBUTE = 2;

    /**
     * The feature id for the '<em><b>ISNONE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONCOMPONENT_TYPE__ISNONE = 3;

    /**
     * The feature id for the '<em><b>REFOBJECTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONCOMPONENT_TYPE__REFOBJECTNAME = 4;

    /**
     * The feature id for the '<em><b>REUSABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONCOMPONENT_TYPE__REUSABLE = 5;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONCOMPONENT_TYPE__TYPE = 6;

    /**
     * The number of structural features of the '<em>SESSIONCOMPONENT Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONCOMPONENT_TYPE_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link Powrmart.impl.SESSIONEXTENSIONTypeImpl <em>SESSIONEXTENSION Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SESSIONEXTENSIONTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSESSIONEXTENSIONType()
     * @generated
     */
    int SESSIONEXTENSION_TYPE = 64;

    /**
     * The feature id for the '<em><b>CONNECTIONREFERENCE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONEXTENSION_TYPE__CONNECTIONREFERENCE = 0;

    /**
     * The feature id for the '<em><b>ATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONEXTENSION_TYPE__ATTRIBUTE = 1;

    /**
     * The feature id for the '<em><b>COMPONENTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONEXTENSION_TYPE__COMPONENTVERSION = 2;

    /**
     * The feature id for the '<em><b>DSQINSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONEXTENSION_TYPE__DSQINSTNAME = 3;

    /**
     * The feature id for the '<em><b>DSQINSTTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONEXTENSION_TYPE__DSQINSTTYPE = 4;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONEXTENSION_TYPE__NAME = 5;

    /**
     * The feature id for the '<em><b>SINSTANCENAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONEXTENSION_TYPE__SINSTANCENAME = 6;

    /**
     * The feature id for the '<em><b>SUBTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONEXTENSION_TYPE__SUBTYPE = 7;

    /**
     * The feature id for the '<em><b>TRANSFORMATIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONEXTENSION_TYPE__TRANSFORMATIONTYPE = 8;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONEXTENSION_TYPE__TYPE = 9;

    /**
     * The number of structural features of the '<em>SESSIONEXTENSION Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSIONEXTENSION_TYPE_FEATURE_COUNT = 10;

    /**
     * The meta object id for the '{@link Powrmart.impl.SESSIONTypeImpl <em>SESSION Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SESSIONTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSESSIONType()
     * @generated
     */
    int SESSION_TYPE = 65;

    /**
     * The feature id for the '<em><b>TASK</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__TASK = 0;

    /**
     * The feature id for the '<em><b>SESSTRANSFORMATIONINST</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__SESSTRANSFORMATIONINST = 1;

    /**
     * The feature id for the '<em><b>CONFIGREFERENCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__CONFIGREFERENCE = 2;

    /**
     * The feature id for the '<em><b>SESSIONCOMPONENT</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__SESSIONCOMPONENT = 3;

    /**
     * The feature id for the '<em><b>SESSIONEXTENSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__SESSIONEXTENSION = 4;

    /**
     * The feature id for the '<em><b>ATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__ATTRIBUTE = 5;

    /**
     * The feature id for the '<em><b>METADATAEXTENSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__METADATAEXTENSION = 6;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__GROUP = 7;

    /**
     * The feature id for the '<em><b>RESOURCEREFERENCE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__RESOURCEREFERENCE = 8;

    /**
     * The feature id for the '<em><b>TRANSFORMRESOURCEREF</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__TRANSFORMRESOURCEREF = 9;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__DESCRIPTION = 10;

    /**
     * The feature id for the '<em><b>ISVALID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__ISVALID = 11;

    /**
     * The feature id for the '<em><b>MAPPINGNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__MAPPINGNAME = 12;

    /**
     * The feature id for the '<em><b>MAPPINGVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__MAPPINGVERSION = 13;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__NAME = 14;

    /**
     * The feature id for the '<em><b>PARENT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__PARENT = 15;

    /**
     * The feature id for the '<em><b>PARENTTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__PARENTTYPE = 16;

    /**
     * The feature id for the '<em><b>REUSABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__REUSABLE = 17;

    /**
     * The feature id for the '<em><b>SORTORDER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__SORTORDER = 18;

    /**
     * The feature id for the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE__VERSIONNUMBER = 19;

    /**
     * The number of structural features of the '<em>SESSION Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_TYPE_FEATURE_COUNT = 20;

    /**
     * The meta object id for the '{@link Powrmart.impl.SESSTRANSFORMATIONGROUPTypeImpl <em>SESSTRANSFORMATIONGROUP Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SESSTRANSFORMATIONGROUPTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSESSTRANSFORMATIONGROUPType()
     * @generated
     */
    int SESSTRANSFORMATIONGROUP_TYPE = 66;

    /**
     * The feature id for the '<em><b>GROUP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONGROUP_TYPE__GROUP = 0;

    /**
     * The feature id for the '<em><b>PARTITIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONGROUP_TYPE__PARTITIONTYPE = 1;

    /**
     * The number of structural features of the '<em>SESSTRANSFORMATIONGROUP Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONGROUP_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl <em>SESSTRANSFORMATIONINST Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSESSTRANSFORMATIONINSTType()
     * @generated
     */
    int SESSTRANSFORMATIONINST_TYPE = 67;

    /**
     * The feature id for the '<em><b>SESSTRANSFORMATIONGROUP</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONINST_TYPE__SESSTRANSFORMATIONGROUP = 0;

    /**
     * The feature id for the '<em><b>PARTITION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONINST_TYPE__PARTITION = 1;

    /**
     * The feature id for the '<em><b>HASHKEY</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONINST_TYPE__HASHKEY = 2;

    /**
     * The feature id for the '<em><b>FLATFILE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONINST_TYPE__FLATFILE = 3;

    /**
     * The feature id for the '<em><b>ATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONINST_TYPE__ATTRIBUTE = 4;

    /**
     * The feature id for the '<em><b>ISREPARTITIONPOINT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONINST_TYPE__ISREPARTITIONPOINT = 5;

    /**
     * The feature id for the '<em><b>PARTITIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONINST_TYPE__PARTITIONTYPE = 6;

    /**
     * The feature id for the '<em><b>PIPELINE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONINST_TYPE__PIPELINE = 7;

    /**
     * The feature id for the '<em><b>SINSTANCENAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONINST_TYPE__SINSTANCENAME = 8;

    /**
     * The feature id for the '<em><b>STAGE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONINST_TYPE__STAGE = 9;

    /**
     * The feature id for the '<em><b>TRANSFORMATIONNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONINST_TYPE__TRANSFORMATIONNAME = 10;

    /**
     * The feature id for the '<em><b>TRANSFORMATIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONINST_TYPE__TRANSFORMATIONTYPE = 11;

    /**
     * The number of structural features of the '<em>SESSTRANSFORMATIONINST Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSTRANSFORMATIONINST_TYPE_FEATURE_COUNT = 12;

    /**
     * The meta object id for the '{@link Powrmart.impl.SHORTCUTTypeImpl <em>SHORTCUT Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SHORTCUTTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSHORTCUTType()
     * @generated
     */
    int SHORTCUT_TYPE = 68;

    /**
     * The feature id for the '<em><b>COMMENTS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE__COMMENTS = 0;

    /**
     * The feature id for the '<em><b>DBDNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE__DBDNAME = 1;

    /**
     * The feature id for the '<em><b>FOLDERNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE__FOLDERNAME = 2;

    /**
     * The feature id for the '<em><b>FOLDERVERSIONNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE__FOLDERVERSIONNAME = 3;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE__NAME = 4;

    /**
     * The feature id for the '<em><b>OBJECTSUBTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE__OBJECTSUBTYPE = 5;

    /**
     * The feature id for the '<em><b>OBJECTTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE__OBJECTTYPE = 6;

    /**
     * The feature id for the '<em><b>REFERENCEDDBD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE__REFERENCEDDBD = 7;

    /**
     * The feature id for the '<em><b>REFERENCETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE__REFERENCETYPE = 8;

    /**
     * The feature id for the '<em><b>REFOBJECTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE__REFOBJECTNAME = 9;

    /**
     * The feature id for the '<em><b>REPOSITORYNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE__REPOSITORYNAME = 10;

    /**
     * The feature id for the '<em><b>TEMPLATEID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE__TEMPLATEID = 11;

    /**
     * The feature id for the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE__VERSIONNUMBER = 12;

    /**
     * The number of structural features of the '<em>SHORTCUT Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORTCUT_TYPE_FEATURE_COUNT = 13;

    /**
     * The meta object id for the '{@link Powrmart.impl.SOURCEFIELDTypeImpl <em>SOURCEFIELD Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SOURCEFIELDTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSOURCEFIELDType()
     * @generated
     */
    int SOURCEFIELD_TYPE = 69;

    /**
     * The feature id for the '<em><b>SOURCEFIELD</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__SOURCEFIELD = 0;

    /**
     * The feature id for the '<em><b>FIELDATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__FIELDATTRIBUTE = 1;

    /**
     * The feature id for the '<em><b>BUSINESSNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__BUSINESSNAME = 2;

    /**
     * The feature id for the '<em><b>DATATYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__DATATYPE = 3;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__DESCRIPTION = 4;

    /**
     * The feature id for the '<em><b>FIELDNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__FIELDNUMBER = 5;

    /**
     * The feature id for the '<em><b>FIELDTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__FIELDTYPE = 6;

    /**
     * The feature id for the '<em><b>GROUP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__GROUP = 7;

    /**
     * The feature id for the '<em><b>HIDDEN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__HIDDEN = 8;

    /**
     * The feature id for the '<em><b>KEYTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__KEYTYPE = 9;

    /**
     * The feature id for the '<em><b>LENGTH</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__LENGTH = 10;

    /**
     * The feature id for the '<em><b>LEVEL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__LEVEL = 11;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__NAME = 12;

    /**
     * The feature id for the '<em><b>NULLABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__NULLABLE = 13;

    /**
     * The feature id for the '<em><b>OCCURS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__OCCURS = 14;

    /**
     * The feature id for the '<em><b>OFFSET</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__OFFSET = 15;

    /**
     * The feature id for the '<em><b>PHYSICALLENGTH</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__PHYSICALLENGTH = 16;

    /**
     * The feature id for the '<em><b>PHYSICALOFFSET</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__PHYSICALOFFSET = 17;

    /**
     * The feature id for the '<em><b>PICTURETEXT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__PICTURETEXT = 18;

    /**
     * The feature id for the '<em><b>PRECISION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__PRECISION = 19;

    /**
     * The feature id for the '<em><b>REDEFINES</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__REDEFINES = 20;

    /**
     * The feature id for the '<em><b>REFERENCEDDBD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__REFERENCEDDBD = 21;

    /**
     * The feature id for the '<em><b>REFERENCEDFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__REFERENCEDFIELD = 22;

    /**
     * The feature id for the '<em><b>REFERENCEDTABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__REFERENCEDTABLE = 23;

    /**
     * The feature id for the '<em><b>SCALE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__SCALE = 24;

    /**
     * The feature id for the '<em><b>SHIFTSTATE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__SHIFTSTATE = 25;

    /**
     * The feature id for the '<em><b>USAGE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__USAGE = 26;

    /**
     * The feature id for the '<em><b>USAGEFLAGS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE__USAGEFLAGS = 27;

    /**
     * The number of structural features of the '<em>SOURCEFIELD Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCEFIELD_TYPE_FEATURE_COUNT = 28;

    /**
     * The meta object id for the '{@link Powrmart.impl.SOURCETypeImpl <em>SOURCE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.SOURCETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSOURCEType()
     * @generated
     */
    int SOURCE_TYPE = 70;

    /**
     * The feature id for the '<em><b>FLATFILE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__FLATFILE = 0;

    /**
     * The feature id for the '<em><b>XMLINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__XMLINFO = 1;

    /**
     * The feature id for the '<em><b>ERPSRCINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__ERPSRCINFO = 2;

    /**
     * The feature id for the '<em><b>GROUP</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__GROUP = 3;

    /**
     * The feature id for the '<em><b>TABLEATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__TABLEATTRIBUTE = 4;

    /**
     * The feature id for the '<em><b>SOURCEFIELD</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__SOURCEFIELD = 5;

    /**
     * The feature id for the '<em><b>METADATAEXTENSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__METADATAEXTENSION = 6;

    /**
     * The feature id for the '<em><b>BUSINESSNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__BUSINESSNAME = 7;

    /**
     * The feature id for the '<em><b>COMPONENTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__COMPONENTVERSION = 8;

    /**
     * The feature id for the '<em><b>CRCVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__CRCVALUE = 9;

    /**
     * The feature id for the '<em><b>DATABASESUBTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__DATABASESUBTYPE = 10;

    /**
     * The feature id for the '<em><b>DATABASETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__DATABASETYPE = 11;

    /**
     * The feature id for the '<em><b>DBDNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__DBDNAME = 12;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__DESCRIPTION = 13;

    /**
     * The feature id for the '<em><b>IBMCOMP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__IBMCOMP = 14;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__NAME = 15;

    /**
     * The feature id for the '<em><b>OBJECTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__OBJECTVERSION = 16;

    /**
     * The feature id for the '<em><b>OWNERNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__OWNERNAME = 17;

    /**
     * The feature id for the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE__VERSIONNUMBER = 18;

    /**
     * The number of structural features of the '<em>SOURCE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_TYPE_FEATURE_COUNT = 19;

    /**
     * The meta object id for the '{@link Powrmart.impl.STARTOPTIONSTypeImpl <em>STARTOPTIONS Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.STARTOPTIONSTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getSTARTOPTIONSType()
     * @generated
     */
    int STARTOPTIONS_TYPE = 71;

    /**
     * The feature id for the '<em><b>STARTDATE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STARTOPTIONS_TYPE__STARTDATE = 0;

    /**
     * The feature id for the '<em><b>STARTTIME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STARTOPTIONS_TYPE__STARTTIME = 1;

    /**
     * The number of structural features of the '<em>STARTOPTIONS Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STARTOPTIONS_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link Powrmart.impl.TABLEATTRIBUTETypeImpl <em>TABLEATTRIBUTE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TABLEATTRIBUTETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTABLEATTRIBUTEType()
     * @generated
     */
    int TABLEATTRIBUTE_TYPE = 72;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLEATTRIBUTE_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLEATTRIBUTE_TYPE__VALUE = 1;

    /**
     * The number of structural features of the '<em>TABLEATTRIBUTE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLEATTRIBUTE_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link Powrmart.impl.TARGETFIELDTypeImpl <em>TARGETFIELD Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TARGETFIELDTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTARGETFIELDType()
     * @generated
     */
    int TARGETFIELD_TYPE = 73;

    /**
     * The feature id for the '<em><b>FIELDATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__FIELDATTRIBUTE = 0;

    /**
     * The feature id for the '<em><b>BUSINESSNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__BUSINESSNAME = 1;

    /**
     * The feature id for the '<em><b>DATATYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__DATATYPE = 2;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__DESCRIPTION = 3;

    /**
     * The feature id for the '<em><b>FIELDNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__FIELDNUMBER = 4;

    /**
     * The feature id for the '<em><b>GROUP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__GROUP = 5;

    /**
     * The feature id for the '<em><b>ISFILENAMEFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__ISFILENAMEFIELD = 6;

    /**
     * The feature id for the '<em><b>KEYTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__KEYTYPE = 7;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__NAME = 8;

    /**
     * The feature id for the '<em><b>NULLABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__NULLABLE = 9;

    /**
     * The feature id for the '<em><b>PICTURETEXT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__PICTURETEXT = 10;

    /**
     * The feature id for the '<em><b>PRECISION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__PRECISION = 11;

    /**
     * The feature id for the '<em><b>REFERENCEDFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__REFERENCEDFIELD = 12;

    /**
     * The feature id for the '<em><b>REFERENCEDTABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__REFERENCEDTABLE = 13;

    /**
     * The feature id for the '<em><b>SCALE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE__SCALE = 14;

    /**
     * The number of structural features of the '<em>TARGETFIELD Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETFIELD_TYPE_FEATURE_COUNT = 15;

    /**
     * The meta object id for the '{@link Powrmart.impl.TARGETINDEXFIELDTypeImpl <em>TARGETINDEXFIELD Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TARGETINDEXFIELDTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTARGETINDEXFIELDType()
     * @generated
     */
    int TARGETINDEXFIELD_TYPE = 74;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETINDEXFIELD_TYPE__NAME = 0;

    /**
     * The number of structural features of the '<em>TARGETINDEXFIELD Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETINDEXFIELD_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link Powrmart.impl.TARGETINDEXTypeImpl <em>TARGETINDEX Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TARGETINDEXTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTARGETINDEXType()
     * @generated
     */
    int TARGETINDEX_TYPE = 75;

    /**
     * The feature id for the '<em><b>TARGETINDEXFIELD</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETINDEX_TYPE__TARGETINDEXFIELD = 0;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETINDEX_TYPE__DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETINDEX_TYPE__NAME = 2;

    /**
     * The feature id for the '<em><b>UNIQUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETINDEX_TYPE__UNIQUE = 3;

    /**
     * The number of structural features of the '<em>TARGETINDEX Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETINDEX_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link Powrmart.impl.TARGETLOADORDERTypeImpl <em>TARGETLOADORDER Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TARGETLOADORDERTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTARGETLOADORDERType()
     * @generated
     */
    int TARGETLOADORDER_TYPE = 76;

    /**
     * The feature id for the '<em><b>ORDER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETLOADORDER_TYPE__ORDER = 0;

    /**
     * The feature id for the '<em><b>TARGETINSTANCE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETLOADORDER_TYPE__TARGETINSTANCE = 1;

    /**
     * The number of structural features of the '<em>TARGETLOADORDER Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGETLOADORDER_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link Powrmart.impl.TARGETTypeImpl <em>TARGET Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TARGETTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTARGETType()
     * @generated
     */
    int TARGET_TYPE = 77;

    /**
     * The feature id for the '<em><b>KEYWORD</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__KEYWORD = 0;

    /**
     * The feature id for the '<em><b>FLATFILE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__FLATFILE = 1;

    /**
     * The feature id for the '<em><b>XMLINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__XMLINFO = 2;

    /**
     * The feature id for the '<em><b>GROUP</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__GROUP = 3;

    /**
     * The feature id for the '<em><b>TARGETFIELD</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__TARGETFIELD = 4;

    /**
     * The feature id for the '<em><b>TARGETINDEX</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__TARGETINDEX = 5;

    /**
     * The feature id for the '<em><b>TABLEATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__TABLEATTRIBUTE = 6;

    /**
     * The feature id for the '<em><b>METADATAEXTENSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__METADATAEXTENSION = 7;

    /**
     * The feature id for the '<em><b>BUSINESSNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__BUSINESSNAME = 8;

    /**
     * The feature id for the '<em><b>COMPONENTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__COMPONENTVERSION = 9;

    /**
     * The feature id for the '<em><b>CONSTRAINT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__CONSTRAINT = 10;

    /**
     * The feature id for the '<em><b>CRCVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__CRCVALUE = 11;

    /**
     * The feature id for the '<em><b>DATABASETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__DATABASETYPE = 12;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__DESCRIPTION = 13;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__NAME = 14;

    /**
     * The feature id for the '<em><b>OBJECTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__OBJECTVERSION = 15;

    /**
     * The feature id for the '<em><b>TABLEOPTIONS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__TABLEOPTIONS = 16;

    /**
     * The feature id for the '<em><b>TABLETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__TABLETYPE = 17;

    /**
     * The feature id for the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE__VERSIONNUMBER = 18;

    /**
     * The number of structural features of the '<em>TARGET Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_TYPE_FEATURE_COUNT = 19;

    /**
     * The meta object id for the '{@link Powrmart.impl.TASKINSTANCETypeImpl <em>TASKINSTANCE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TASKINSTANCETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTASKINSTANCEType()
     * @generated
     */
    int TASKINSTANCE_TYPE = 78;

    /**
     * The feature id for the '<em><b>ATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__ATTRIBUTE = 0;

    /**
     * The feature id for the '<em><b>WORKFLOWVARIABLE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__WORKFLOWVARIABLE = 1;

    /**
     * The feature id for the '<em><b>VALUEPAIR</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__VALUEPAIR = 2;

    /**
     * The feature id for the '<em><b>CONFIGREFERENCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__CONFIGREFERENCE = 3;

    /**
     * The feature id for the '<em><b>SESSIONCOMPONENT</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__SESSIONCOMPONENT = 4;

    /**
     * The feature id for the '<em><b>SESSIONEXTENSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__SESSIONEXTENSION = 5;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__GROUP = 6;

    /**
     * The feature id for the '<em><b>RESOURCEREFERENCE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__RESOURCEREFERENCE = 7;

    /**
     * The feature id for the '<em><b>TRANSFORMRESOURCEREF</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__TRANSFORMRESOURCEREF = 8;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__DESCRIPTION = 9;

    /**
     * The feature id for the '<em><b>FAILPARENTIFINSTANCEDIDNOTRUN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEDIDNOTRUN = 10;

    /**
     * The feature id for the '<em><b>FAILPARENTIFINSTANCEFAILS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEFAILS = 11;

    /**
     * The feature id for the '<em><b>ISENABLED</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__ISENABLED = 12;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__NAME = 13;

    /**
     * The feature id for the '<em><b>REUSABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__REUSABLE = 14;

    /**
     * The feature id for the '<em><b>SERVEROVERRIDE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__SERVEROVERRIDE = 15;

    /**
     * The feature id for the '<em><b>TASKNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__TASKNAME = 16;

    /**
     * The feature id for the '<em><b>TASKTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__TASKTYPE = 17;

    /**
     * The feature id for the '<em><b>TREATINPUTLINKASAND</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE__TREATINPUTLINKASAND = 18;

    /**
     * The number of structural features of the '<em>TASKINSTANCE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASKINSTANCE_TYPE_FEATURE_COUNT = 19;

    /**
     * The meta object id for the '{@link Powrmart.impl.TASKTypeImpl <em>TASK Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TASKTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTASKType()
     * @generated
     */
    int TASK_TYPE = 79;

    /**
     * The feature id for the '<em><b>ATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_TYPE__ATTRIBUTE = 0;

    /**
     * The feature id for the '<em><b>EXPRMACRODEPENDENCY</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_TYPE__EXPRMACRODEPENDENCY = 1;

    /**
     * The feature id for the '<em><b>TIMER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_TYPE__TIMER = 2;

    /**
     * The feature id for the '<em><b>VALUEPAIR</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_TYPE__VALUEPAIR = 3;

    /**
     * The feature id for the '<em><b>RESOURCEREFERENCE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_TYPE__RESOURCEREFERENCE = 4;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_TYPE__DESCRIPTION = 5;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_TYPE__NAME = 6;

    /**
     * The feature id for the '<em><b>PARENT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_TYPE__PARENT = 7;

    /**
     * The feature id for the '<em><b>PARENTTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_TYPE__PARENTTYPE = 8;

    /**
     * The feature id for the '<em><b>REUSABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_TYPE__REUSABLE = 9;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_TYPE__TYPE = 10;

    /**
     * The feature id for the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_TYPE__VERSIONNUMBER = 11;

    /**
     * The number of structural features of the '<em>TASK Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_TYPE_FEATURE_COUNT = 12;

    /**
     * The meta object id for the '{@link Powrmart.impl.TIMERTypeImpl <em>TIMER Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TIMERTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTIMERType()
     * @generated
     */
    int TIMER_TYPE = 80;

    /**
     * The feature id for the '<em><b>STARTOPTIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_TYPE__STARTOPTIONS = 0;

    /**
     * The feature id for the '<em><b>RECURRING</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_TYPE__RECURRING = 1;

    /**
     * The feature id for the '<em><b>TIMERTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_TYPE__TIMERTYPE = 2;

    /**
     * The number of structural features of the '<em>TIMER Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.TRANSFORMATIONTypeImpl <em>TRANSFORMATION Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TRANSFORMATIONTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTRANSFORMATIONType()
     * @generated
     */
    int TRANSFORMATION_TYPE = 81;

    /**
     * The feature id for the '<em><b>GROUP</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__GROUP = 0;

    /**
     * The feature id for the '<em><b>SOURCEFIELD</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__SOURCEFIELD = 1;

    /**
     * The feature id for the '<em><b>TRANSFORMFIELD</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__TRANSFORMFIELD = 2;

    /**
     * The feature id for the '<em><b>TABLEATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__TABLEATTRIBUTE = 3;

    /**
     * The feature id for the '<em><b>INITPROP</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__INITPROP = 4;

    /**
     * The feature id for the '<em><b>METADATAEXTENSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__METADATAEXTENSION = 5;

    /**
     * The feature id for the '<em><b>TRANSFORMFIELDATTRDEF</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__TRANSFORMFIELDATTRDEF = 6;

    /**
     * The feature id for the '<em><b>FIELDDEPENDENCY</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__FIELDDEPENDENCY = 7;

    /**
     * The feature id for the '<em><b>FLATFILE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__FLATFILE = 8;

    /**
     * The feature id for the '<em><b>EXPRMACRODEPENDENCY</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__EXPRMACRODEPENDENCY = 9;

    /**
     * The feature id for the '<em><b>COMPONENTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__COMPONENTVERSION = 10;

    /**
     * The feature id for the '<em><b>CRCVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__CRCVALUE = 11;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__DESCRIPTION = 12;

    /**
     * The feature id for the '<em><b>ISVSAMNORMALIZER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__ISVSAMNORMALIZER = 13;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__NAME = 14;

    /**
     * The feature id for the '<em><b>OBJECTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__OBJECTVERSION = 15;

    /**
     * The feature id for the '<em><b>PARENT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__PARENT = 16;

    /**
     * The feature id for the '<em><b>PARENTTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__PARENTTYPE = 17;

    /**
     * The feature id for the '<em><b>REFDBDNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__REFDBDNAME = 18;

    /**
     * The feature id for the '<em><b>REFSOURCENAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__REFSOURCENAME = 19;

    /**
     * The feature id for the '<em><b>REUSABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__REUSABLE = 20;

    /**
     * The feature id for the '<em><b>TEMPLATEID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__TEMPLATEID = 21;

    /**
     * The feature id for the '<em><b>TEMPLATENAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__TEMPLATENAME = 22;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__TYPE = 23;

    /**
     * The feature id for the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE__VERSIONNUMBER = 24;

    /**
     * The number of structural features of the '<em>TRANSFORMATION Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMATION_TYPE_FEATURE_COUNT = 25;

    /**
     * The meta object id for the '{@link Powrmart.impl.TRANSFORMFIELDATTRDEFTypeImpl <em>TRANSFORMFIELDATTRDEF Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TRANSFORMFIELDATTRDEFTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTRANSFORMFIELDATTRDEFType()
     * @generated
     */
    int TRANSFORMFIELDATTRDEF_TYPE = 82;

    /**
     * The feature id for the '<em><b>DATATYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELDATTRDEF_TYPE__DATATYPE = 0;

    /**
     * The feature id for the '<em><b>DEFAULTVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELDATTRDEF_TYPE__DEFAULTVALUE = 1;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELDATTRDEF_TYPE__DESCRIPTION = 2;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELDATTRDEF_TYPE__NAME = 3;

    /**
     * The feature id for the '<em><b>ORDER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELDATTRDEF_TYPE__ORDER = 4;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELDATTRDEF_TYPE__TYPE = 5;

    /**
     * The number of structural features of the '<em>TRANSFORMFIELDATTRDEF Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELDATTRDEF_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link Powrmart.impl.TRANSFORMFIELDATTRTypeImpl <em>TRANSFORMFIELDATTR Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TRANSFORMFIELDATTRTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTRANSFORMFIELDATTRType()
     * @generated
     */
    int TRANSFORMFIELDATTR_TYPE = 83;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELDATTR_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELDATTR_TYPE__VALUE = 1;

    /**
     * The number of structural features of the '<em>TRANSFORMFIELDATTR Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELDATTR_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link Powrmart.impl.TRANSFORMFIELDTypeImpl <em>TRANSFORMFIELD Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TRANSFORMFIELDTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTRANSFORMFIELDType()
     * @generated
     */
    int TRANSFORMFIELD_TYPE = 84;

    /**
     * The feature id for the '<em><b>TRANSFORMFIELDATTR</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__TRANSFORMFIELDATTR = 0;

    /**
     * The feature id for the '<em><b>DATATYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__DATATYPE = 1;

    /**
     * The feature id for the '<em><b>DEFAULTVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__DEFAULTVALUE = 2;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__DESCRIPTION = 3;

    /**
     * The feature id for the '<em><b>EXPRESSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__EXPRESSION = 4;

    /**
     * The feature id for the '<em><b>EXPRESSIONDESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__EXPRESSIONDESCRIPTION = 5;

    /**
     * The feature id for the '<em><b>EXPRESSIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__EXPRESSIONTYPE = 6;

    /**
     * The feature id for the '<em><b>FIELDNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__FIELDNUMBER = 7;

    /**
     * The feature id for the '<em><b>GROUP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__GROUP = 8;

    /**
     * The feature id for the '<em><b>IGNOREINCOMPARE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__IGNOREINCOMPARE = 9;

    /**
     * The feature id for the '<em><b>IGNORENULLINPUTS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__IGNORENULLINPUTS = 10;

    /**
     * The feature id for the '<em><b>ISSORTKEY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__ISSORTKEY = 11;

    /**
     * The feature id for the '<em><b>MAPPLETGROUP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__MAPPLETGROUP = 12;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__NAME = 13;

    /**
     * The feature id for the '<em><b>OUTPUTGROUP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__OUTPUTGROUP = 14;

    /**
     * The feature id for the '<em><b>PICTURETEXT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__PICTURETEXT = 15;

    /**
     * The feature id for the '<em><b>PORTTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__PORTTYPE = 16;

    /**
     * The feature id for the '<em><b>PRECISION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__PRECISION = 17;

    /**
     * The feature id for the '<em><b>REFFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__REFFIELD = 18;

    /**
     * The feature id for the '<em><b>REFINSTANCETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__REFINSTANCETYPE = 19;

    /**
     * The feature id for the '<em><b>REFSOURCEFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__REFSOURCEFIELD = 20;

    /**
     * The feature id for the '<em><b>REFTRANSFORMATION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__REFTRANSFORMATION = 21;

    /**
     * The feature id for the '<em><b>SCALE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__SCALE = 22;

    /**
     * The feature id for the '<em><b>SEQUENCEGENERATORVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__SEQUENCEGENERATORVALUE = 23;

    /**
     * The feature id for the '<em><b>SORTDIRECTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__SORTDIRECTION = 24;

    /**
     * The number of structural features of the '<em>TRANSFORMFIELD Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMFIELD_TYPE_FEATURE_COUNT = 25;

    /**
     * The number of structural features of the '<em>TRANSFORMFIELD Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @ordered
     */
    int TRANSFORMFIELD_TYPE__NULLABLE = 26;

    /**
     * The meta object id for the '{@link Powrmart.impl.TRANSFORMRESOURCEREFTypeImpl <em>TRANSFORMRESOURCEREF Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.TRANSFORMRESOURCEREFTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getTRANSFORMRESOURCEREFType()
     * @generated
     */
    int TRANSFORMRESOURCEREF_TYPE = 85;

    /**
     * The feature id for the '<em><b>RESOURCEREFERENCE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMRESOURCEREF_TYPE__RESOURCEREFERENCE = 0;

    /**
     * The feature id for the '<em><b>SINSTANCENAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMRESOURCEREF_TYPE__SINSTANCENAME = 1;

    /**
     * The feature id for the '<em><b>TRANSFORMATIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMRESOURCEREF_TYPE__TRANSFORMATIONTYPE = 2;

    /**
     * The number of structural features of the '<em>TRANSFORMRESOURCEREF Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMRESOURCEREF_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.VALUEPAIRTypeImpl <em>VALUEPAIR Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.VALUEPAIRTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getVALUEPAIRType()
     * @generated
     */
    int VALUEPAIR_TYPE = 86;

    /**
     * The feature id for the '<em><b>COMMENTS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUEPAIR_TYPE__COMMENTS = 0;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUEPAIR_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>REVERSEASSIGNMENT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUEPAIR_TYPE__REVERSEASSIGNMENT = 2;

    /**
     * The feature id for the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUEPAIR_TYPE__VALUE = 3;

    /**
     * The number of structural features of the '<em>VALUEPAIR Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUEPAIR_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link Powrmart.impl.WORKFLOWEVENTTypeImpl <em>WORKFLOWEVENT Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.WORKFLOWEVENTTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getWORKFLOWEVENTType()
     * @generated
     */
    int WORKFLOWEVENT_TYPE = 87;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWEVENT_TYPE__DESCRIPTION = 0;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWEVENT_TYPE__NAME = 1;

    /**
     * The number of structural features of the '<em>WORKFLOWEVENT Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWEVENT_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link Powrmart.impl.WORKFLOWLINKTypeImpl <em>WORKFLOWLINK Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.WORKFLOWLINKTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getWORKFLOWLINKType()
     * @generated
     */
    int WORKFLOWLINK_TYPE = 88;

    /**
     * The feature id for the '<em><b>EXPRMACRODEPENDENCY</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWLINK_TYPE__EXPRMACRODEPENDENCY = 0;

    /**
     * The feature id for the '<em><b>CONDITION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWLINK_TYPE__CONDITION = 1;

    /**
     * The feature id for the '<em><b>FROMTASK</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWLINK_TYPE__FROMTASK = 2;

    /**
     * The feature id for the '<em><b>TOTASK</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWLINK_TYPE__TOTASK = 3;

    /**
     * The number of structural features of the '<em>WORKFLOWLINK Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWLINK_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link Powrmart.impl.WORKFLOWTypeImpl <em>WORKFLOW Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.WORKFLOWTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getWORKFLOWType()
     * @generated
     */
    int WORKFLOW_TYPE = 89;

    /**
     * The feature id for the '<em><b>SCHEDULER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__SCHEDULER = 0;

    /**
     * The feature id for the '<em><b>TASK</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__TASK = 1;

    /**
     * The feature id for the '<em><b>SESSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__SESSION = 2;

    /**
     * The feature id for the '<em><b>WORKLET</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__WORKLET = 3;

    /**
     * The feature id for the '<em><b>TASKINSTANCE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__TASKINSTANCE = 4;

    /**
     * The feature id for the '<em><b>WORKFLOWLINK</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__WORKFLOWLINK = 5;

    /**
     * The feature id for the '<em><b>WORKFLOWVARIABLE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__WORKFLOWVARIABLE = 6;

    /**
     * The feature id for the '<em><b>WORKFLOWEVENT</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__WORKFLOWEVENT = 7;

    /**
     * The feature id for the '<em><b>ATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__ATTRIBUTE = 8;

    /**
     * The feature id for the '<em><b>METADATAEXTENSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__METADATAEXTENSION = 9;

    /**
     * The feature id for the '<em><b>CONWFRUNINFO</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__CONWFRUNINFO = 10;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__DESCRIPTION = 11;

    /**
     * The feature id for the '<em><b>ISENABLED</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__ISENABLED = 12;

    /**
     * The feature id for the '<em><b>ISRUNNABLESERVICE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__ISRUNNABLESERVICE = 13;

    /**
     * The feature id for the '<em><b>ISSERVICE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__ISSERVICE = 14;

    /**
     * The feature id for the '<em><b>ISVALID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__ISVALID = 15;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__NAME = 16;

    /**
     * The feature id for the '<em><b>REUSABLESCHEDULER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__REUSABLESCHEDULER = 17;

    /**
     * The feature id for the '<em><b>SCHEDULERNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__SCHEDULERNAME = 18;

    /**
     * The feature id for the '<em><b>SERVERDOMAINNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__SERVERDOMAINNAME = 19;

    /**
     * The feature id for the '<em><b>SERVERNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__SERVERNAME = 20;

    /**
     * The feature id for the '<em><b>SERVICELEVELNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__SERVICELEVELNAME = 21;

    /**
     * The feature id for the '<em><b>SUSPENDONERROR</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__SUSPENDONERROR = 22;

    /**
     * The feature id for the '<em><b>SUSPENSIONEMAIL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__SUSPENSIONEMAIL = 23;

    /**
     * The feature id for the '<em><b>TASKSMUSTRUNONSERVER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__TASKSMUSTRUNONSERVER = 24;

    /**
     * The feature id for the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE__VERSIONNUMBER = 25;

    /**
     * The number of structural features of the '<em>WORKFLOW Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOW_TYPE_FEATURE_COUNT = 26;

    /**
     * The meta object id for the '{@link Powrmart.impl.WORKFLOWVARIABLETypeImpl <em>WORKFLOWVARIABLE Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.WORKFLOWVARIABLETypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getWORKFLOWVARIABLEType()
     * @generated
     */
    int WORKFLOWVARIABLE_TYPE = 90;

    /**
     * The feature id for the '<em><b>DATATYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWVARIABLE_TYPE__DATATYPE = 0;

    /**
     * The feature id for the '<em><b>DEFAULTVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWVARIABLE_TYPE__DEFAULTVALUE = 1;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWVARIABLE_TYPE__DESCRIPTION = 2;

    /**
     * The feature id for the '<em><b>ISNULL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWVARIABLE_TYPE__ISNULL = 3;

    /**
     * The feature id for the '<em><b>ISPERSISTENT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWVARIABLE_TYPE__ISPERSISTENT = 4;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWVARIABLE_TYPE__NAME = 5;

    /**
     * The feature id for the '<em><b>USERDEFINED</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWVARIABLE_TYPE__USERDEFINED = 6;

    /**
     * The number of structural features of the '<em>WORKFLOWVARIABLE Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKFLOWVARIABLE_TYPE_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link Powrmart.impl.WORKLETTypeImpl <em>WORKLET Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.WORKLETTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getWORKLETType()
     * @generated
     */
    int WORKLET_TYPE = 91;

    /**
     * The feature id for the '<em><b>TASK</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__TASK = 0;

    /**
     * The feature id for the '<em><b>SESSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__SESSION = 1;

    /**
     * The feature id for the '<em><b>WORKLET</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__WORKLET = 2;

    /**
     * The feature id for the '<em><b>TASKINSTANCE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__TASKINSTANCE = 3;

    /**
     * The feature id for the '<em><b>WORKFLOWLINK</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__WORKFLOWLINK = 4;

    /**
     * The feature id for the '<em><b>WORKFLOWVARIABLE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__WORKFLOWVARIABLE = 5;

    /**
     * The feature id for the '<em><b>WORKFLOWEVENT</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__WORKFLOWEVENT = 6;

    /**
     * The feature id for the '<em><b>ATTRIBUTE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__ATTRIBUTE = 7;

    /**
     * The feature id for the '<em><b>METADATAEXTENSION</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__METADATAEXTENSION = 8;

    /**
     * The feature id for the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__DESCRIPTION = 9;

    /**
     * The feature id for the '<em><b>ISVALID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__ISVALID = 10;

    /**
     * The feature id for the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__NAME = 11;

    /**
     * The feature id for the '<em><b>PARENT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__PARENT = 12;

    /**
     * The feature id for the '<em><b>PARENTTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__PARENTTYPE = 13;

    /**
     * The feature id for the '<em><b>REUSABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__REUSABLE = 14;

    /**
     * The feature id for the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE__VERSIONNUMBER = 15;

    /**
     * The number of structural features of the '<em>WORKLET Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLET_TYPE_FEATURE_COUNT = 16;

    /**
     * The meta object id for the '{@link Powrmart.impl.XMLINFOTypeImpl <em>XMLINFO Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.XMLINFOTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getXMLINFOType()
     * @generated
     */
    int XMLINFO_TYPE = 92;

    /**
     * The feature id for the '<em><b>XMLTEXT</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMLINFO_TYPE__XMLTEXT = 0;

    /**
     * The feature id for the '<em><b>TEXT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMLINFO_TYPE__TEXT = 1;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMLINFO_TYPE__TYPE = 2;

    /**
     * The number of structural features of the '<em>XMLINFO Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMLINFO_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.impl.XMLTEXTTypeImpl <em>XMLTEXT Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.impl.XMLTEXTTypeImpl
     * @see Powrmart.impl.PowrmartPackageImpl#getXMLTEXTType()
     * @generated
     */
    int XMLTEXT_TYPE = 93;

    /**
     * The feature id for the '<em><b>NAMESPACE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMLTEXT_TYPE__NAMESPACE = 0;

    /**
     * The feature id for the '<em><b>TEXT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMLTEXT_TYPE__TEXT = 1;

    /**
     * The feature id for the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMLTEXT_TYPE__TYPE = 2;

    /**
     * The number of structural features of the '<em>XMLTEXT Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMLTEXT_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link Powrmart.AGGFUNCTIONType <em>AGGFUNCTION Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.AGGFUNCTIONType
     * @see Powrmart.impl.PowrmartPackageImpl#getAGGFUNCTIONType()
     * @generated
     */
    int AGGFUNCTION_TYPE = 94;

    /**
     * The meta object id for the '{@link Powrmart.DATATYPEType <em>DATATYPE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.DATATYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getDATATYPEType()
     * @generated
     */
    int DATATYPE_TYPE = 95;

    /**
     * The meta object id for the '{@link Powrmart.DAYType <em>DAY Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.DAYType
     * @see Powrmart.impl.PowrmartPackageImpl#getDAYType()
     * @generated
     */
    int DAY_TYPE = 96;

    /**
     * The meta object id for the '{@link Powrmart.ENDTYPEType <em>ENDTYPE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ENDTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getENDTYPEType()
     * @generated
     */
    int ENDTYPE_TYPE = 97;

    /**
     * The meta object id for the '{@link Powrmart.FAILPARENTIFINSTANCEDIDNOTRUNType <em>FAILPARENTIFINSTANCEDIDNOTRUN Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.FAILPARENTIFINSTANCEDIDNOTRUNType
     * @see Powrmart.impl.PowrmartPackageImpl#getFAILPARENTIFINSTANCEDIDNOTRUNType()
     * @generated
     */
    int FAILPARENTIFINSTANCEDIDNOTRUN_TYPE = 98;

    /**
     * The meta object id for the '{@link Powrmart.FAILPARENTIFINSTANCEFAILSType <em>FAILPARENTIFINSTANCEFAILS Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.FAILPARENTIFINSTANCEFAILSType
     * @see Powrmart.impl.PowrmartPackageImpl#getFAILPARENTIFINSTANCEFAILSType()
     * @generated
     */
    int FAILPARENTIFINSTANCEFAILS_TYPE = 99;

    /**
     * The meta object id for the '{@link Powrmart.IGNOREINCOMPAREType <em>IGNOREINCOMPARE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.IGNOREINCOMPAREType
     * @see Powrmart.impl.PowrmartPackageImpl#getIGNOREINCOMPAREType()
     * @generated
     */
    int IGNOREINCOMPARE_TYPE = 100;

    /**
     * The meta object id for the '{@link Powrmart.IGNORENULLINPUTSType <em>IGNORENULLINPUTS Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.IGNORENULLINPUTSType
     * @see Powrmart.impl.PowrmartPackageImpl#getIGNORENULLINPUTSType()
     * @generated
     */
    int IGNORENULLINPUTS_TYPE = 101;

    /**
     * The meta object id for the '{@link Powrmart.ISCLIENTEDITABLEType <em>ISCLIENTEDITABLE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISCLIENTEDITABLEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISCLIENTEDITABLEType()
     * @generated
     */
    int ISCLIENTEDITABLE_TYPE = 102;

    /**
     * The meta object id for the '{@link Powrmart.ISCLIENTVISIBLEType <em>ISCLIENTVISIBLE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISCLIENTVISIBLEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISCLIENTVISIBLEType()
     * @generated
     */
    int ISCLIENTVISIBLE_TYPE = 103;

    /**
     * The meta object id for the '{@link Powrmart.ISDEFAULTType <em>ISDEFAULT Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISDEFAULTType
     * @see Powrmart.impl.PowrmartPackageImpl#getISDEFAULTType()
     * @generated
     */
    int ISDEFAULT_TYPE = 104;

    /**
     * The meta object id for the '{@link Powrmart.ISENABLEDType <em>ISENABLED Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISENABLEDType
     * @see Powrmart.impl.PowrmartPackageImpl#getISENABLEDType()
     * @generated
     */
    int ISENABLED_TYPE = 105;

    /**
     * The meta object id for the '{@link Powrmart.ISENABLEDType1 <em>ISENABLED Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISENABLEDType1
     * @see Powrmart.impl.PowrmartPackageImpl#getISENABLEDType1()
     * @generated
     */
    int ISENABLED_TYPE1 = 106;

    /**
     * The meta object id for the '{@link Powrmart.ISEXPRESSIONVARIABLEType <em>ISEXPRESSIONVARIABLE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISEXPRESSIONVARIABLEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISEXPRESSIONVARIABLEType()
     * @generated
     */
    int ISEXPRESSIONVARIABLE_TYPE = 107;

    /**
     * The meta object id for the '{@link Powrmart.ISFILENAMEFIELDType <em>ISFILENAMEFIELD Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISFILENAMEFIELDType
     * @see Powrmart.impl.PowrmartPackageImpl#getISFILENAMEFIELDType()
     * @generated
     */
    int ISFILENAMEFIELD_TYPE = 108;

    /**
     * The meta object id for the '{@link Powrmart.ISNONEType <em>ISNONE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISNONEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISNONEType()
     * @generated
     */
    int ISNONE_TYPE = 109;

    /**
     * The meta object id for the '{@link Powrmart.ISNULLType <em>ISNULL Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISNULLType
     * @see Powrmart.impl.PowrmartPackageImpl#getISNULLType()
     * @generated
     */
    int ISNULL_TYPE = 110;

    /**
     * The meta object id for the '{@link Powrmart.ISOPTIONALType <em>ISOPTIONAL Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISOPTIONALType
     * @see Powrmart.impl.PowrmartPackageImpl#getISOPTIONALType()
     * @generated
     */
    int ISOPTIONAL_TYPE = 111;

    /**
     * The meta object id for the '{@link Powrmart.ISOPTIONALType1 <em>ISOPTIONAL Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISOPTIONALType1
     * @see Powrmart.impl.PowrmartPackageImpl#getISOPTIONALType1()
     * @generated
     */
    int ISOPTIONAL_TYPE1 = 112;

    /**
     * The meta object id for the '{@link Powrmart.ISOUTPUTPORTType <em>ISOUTPUTPORT Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISOUTPUTPORTType
     * @see Powrmart.impl.PowrmartPackageImpl#getISOUTPUTPORTType()
     * @generated
     */
    int ISOUTPUTPORT_TYPE = 113;

    /**
     * The meta object id for the '{@link Powrmart.ISPARAMType <em>ISPARAM Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISPARAMType
     * @see Powrmart.impl.PowrmartPackageImpl#getISPARAMType()
     * @generated
     */
    int ISPARAM_TYPE = 114;

    /**
     * The meta object id for the '{@link Powrmart.ISPERSISTENTType <em>ISPERSISTENT Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISPERSISTENTType
     * @see Powrmart.impl.PowrmartPackageImpl#getISPERSISTENTType()
     * @generated
     */
    int ISPERSISTENT_TYPE = 115;

    /**
     * The meta object id for the '{@link Powrmart.ISPROFILEMAPPINGType <em>ISPROFILEMAPPING Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISPROFILEMAPPINGType
     * @see Powrmart.impl.PowrmartPackageImpl#getISPROFILEMAPPINGType()
     * @generated
     */
    int ISPROFILEMAPPING_TYPE = 116;

    /**
     * The meta object id for the '{@link Powrmart.ISREFERENCEType <em>ISREFERENCE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISREFERENCEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISREFERENCEType()
     * @generated
     */
    int ISREFERENCE_TYPE = 117;

    /**
     * The meta object id for the '{@link Powrmart.ISREPARTITIONPOINTType <em>ISREPARTITIONPOINT Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISREPARTITIONPOINTType
     * @see Powrmart.impl.PowrmartPackageImpl#getISREPARTITIONPOINTType()
     * @generated
     */
    int ISREPARTITIONPOINT_TYPE = 118;

    /**
     * The meta object id for the '{@link Powrmart.ISREUSABLEType <em>ISREUSABLE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISREUSABLEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISREUSABLEType()
     * @generated
     */
    int ISREUSABLE_TYPE = 119;

    /**
     * The meta object id for the '{@link Powrmart.ISRUNNABLESERVICEType <em>ISRUNNABLESERVICE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISRUNNABLESERVICEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISRUNNABLESERVICEType()
     * @generated
     */
    int ISRUNNABLESERVICE_TYPE = 120;

    /**
     * The meta object id for the '{@link Powrmart.ISSERVICEType <em>ISSERVICE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISSERVICEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISSERVICEType()
     * @generated
     */
    int ISSERVICE_TYPE = 121;

    /**
     * The meta object id for the '{@link Powrmart.ISSHAREREADType <em>ISSHAREREAD Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISSHAREREADType
     * @see Powrmart.impl.PowrmartPackageImpl#getISSHAREREADType()
     * @generated
     */
    int ISSHAREREAD_TYPE = 122;

    /**
     * The meta object id for the '{@link Powrmart.ISSHAREWRITEType <em>ISSHAREWRITE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISSHAREWRITEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISSHAREWRITEType()
     * @generated
     */
    int ISSHAREWRITE_TYPE = 123;

    /**
     * The meta object id for the '{@link Powrmart.ISSORTKEYType <em>ISSORTKEY Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISSORTKEYType
     * @see Powrmart.impl.PowrmartPackageImpl#getISSORTKEYType()
     * @generated
     */
    int ISSORTKEY_TYPE = 124;

    /**
     * The meta object id for the '{@link Powrmart.ISVALIDType <em>ISVALID Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISVALIDType
     * @see Powrmart.impl.PowrmartPackageImpl#getISVALIDType()
     * @generated
     */
    int ISVALID_TYPE = 125;

    /**
     * The meta object id for the '{@link Powrmart.ISVALIDType1 <em>ISVALID Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISVALIDType1
     * @see Powrmart.impl.PowrmartPackageImpl#getISVALIDType1()
     * @generated
     */
    int ISVALID_TYPE1 = 126;

    /**
     * The meta object id for the '{@link Powrmart.ISVALIDType2 <em>ISVALID Type2</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISVALIDType2
     * @see Powrmart.impl.PowrmartPackageImpl#getISVALIDType2()
     * @generated
     */
    int ISVALID_TYPE2 = 127;

    /**
     * The meta object id for the '{@link Powrmart.ISVALIDType3 <em>ISVALID Type3</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISVALIDType3
     * @see Powrmart.impl.PowrmartPackageImpl#getISVALIDType3()
     * @generated
     */
    int ISVALID_TYPE3 = 128;

    /**
     * The meta object id for the '{@link Powrmart.MACROTYPEType <em>MACROTYPE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.MACROTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getMACROTYPEType()
     * @generated
     */
    int MACROTYPE_TYPE = 129;

    /**
     * The meta object id for the '{@link Powrmart.NULLABLEType <em>NULLABLE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.NULLABLEType
     * @see Powrmart.impl.PowrmartPackageImpl#getNULLABLEType()
     * @generated
     */
    int NULLABLE_TYPE = 130;

    /**
     * The meta object id for the '{@link Powrmart.NULLABLEType1 <em>NULLABLE Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.NULLABLEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getNULLABLEType1()
     * @generated
     */
    int NULLABLE_TYPE1 = 131;

    /**
     * The meta object id for the '{@link Powrmart.NULLCHARTYPEType <em>NULLCHARTYPE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.NULLCHARTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getNULLCHARTYPEType()
     * @generated
     */
    int NULLCHARTYPE_TYPE = 132;

    /**
     * The meta object id for the '{@link Powrmart.OBJECTTYPEType <em>OBJECTTYPE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.OBJECTTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getOBJECTTYPEType()
     * @generated
     */
    int OBJECTTYPE_TYPE = 133;

    /**
     * The meta object id for the '{@link Powrmart.OCCURRENCEType <em>OCCURRENCE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.OCCURRENCEType
     * @see Powrmart.impl.PowrmartPackageImpl#getOCCURRENCEType()
     * @generated
     */
    int OCCURRENCE_TYPE = 134;

    /**
     * The meta object id for the '{@link Powrmart.OUTERJOINRELType <em>OUTERJOINREL Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.OUTERJOINRELType
     * @see Powrmart.impl.PowrmartPackageImpl#getOUTERJOINRELType()
     * @generated
     */
    int OUTERJOINREL_TYPE = 135;

    /**
     * The meta object id for the '{@link Powrmart.PARENTTYPEType <em>PARENTTYPE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.PARENTTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getPARENTTYPEType()
     * @generated
     */
    int PARENTTYPE_TYPE = 136;

    /**
     * The meta object id for the '{@link Powrmart.PARENTTYPEType1 <em>PARENTTYPE Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.PARENTTYPEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getPARENTTYPEType1()
     * @generated
     */
    int PARENTTYPE_TYPE1 = 137;

    /**
     * The meta object id for the '{@link Powrmart.PARENTTYPEType2 <em>PARENTTYPE Type2</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.PARENTTYPEType2
     * @see Powrmart.impl.PowrmartPackageImpl#getPARENTTYPEType2()
     * @generated
     */
    int PARENTTYPE_TYPE2 = 138;

    /**
     * The meta object id for the '{@link Powrmart.PARENTTYPEType3 <em>PARENTTYPE Type3</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.PARENTTYPEType3
     * @see Powrmart.impl.PowrmartPackageImpl#getPARENTTYPEType3()
     * @generated
     */
    int PARENTTYPE_TYPE3 = 139;

    /**
     * The meta object id for the '{@link Powrmart.REFERENCETYPEType <em>REFERENCETYPE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REFERENCETYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getREFERENCETYPEType()
     * @generated
     */
    int REFERENCETYPE_TYPE = 140;

    /**
     * The meta object id for the '{@link Powrmart.REUSABLESCHEDULERType <em>REUSABLESCHEDULER Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLESCHEDULERType
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLESCHEDULERType()
     * @generated
     */
    int REUSABLESCHEDULER_TYPE = 141;

    /**
     * The meta object id for the '{@link Powrmart.REUSABLEType <em>REUSABLE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLEType()
     * @generated
     */
    int REUSABLE_TYPE = 142;

    /**
     * The meta object id for the '{@link Powrmart.REUSABLEType1 <em>REUSABLE Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLEType1()
     * @generated
     */
    int REUSABLE_TYPE1 = 143;

    /**
     * The meta object id for the '{@link Powrmart.REUSABLEType2 <em>REUSABLE Type2</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType2
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLEType2()
     * @generated
     */
    int REUSABLE_TYPE2 = 144;

    /**
     * The meta object id for the '{@link Powrmart.REUSABLEType3 <em>REUSABLE Type3</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType3
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLEType3()
     * @generated
     */
    int REUSABLE_TYPE3 = 145;

    /**
     * The meta object id for the '{@link Powrmart.REUSABLEType4 <em>REUSABLE Type4</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType4
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLEType4()
     * @generated
     */
    int REUSABLE_TYPE4 = 146;

    /**
     * The meta object id for the '{@link Powrmart.REUSABLEType5 <em>REUSABLE Type5</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType5
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLEType5()
     * @generated
     */
    int REUSABLE_TYPE5 = 147;

    /**
     * The meta object id for the '{@link Powrmart.REUSABLEType6 <em>REUSABLE Type6</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType6
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLEType6()
     * @generated
     */
    int REUSABLE_TYPE6 = 148;

    /**
     * The meta object id for the '{@link Powrmart.REVERSEASSIGNMENTType <em>REVERSEASSIGNMENT Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REVERSEASSIGNMENTType
     * @see Powrmart.impl.PowrmartPackageImpl#getREVERSEASSIGNMENTType()
     * @generated
     */
    int REVERSEASSIGNMENT_TYPE = 149;

    /**
     * The meta object id for the '{@link Powrmart.RUNFOREVERType <em>RUNFOREVER Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.RUNFOREVERType
     * @see Powrmart.impl.PowrmartPackageImpl#getRUNFOREVERType()
     * @generated
     */
    int RUNFOREVER_TYPE = 150;

    /**
     * The meta object id for the '{@link Powrmart.RUNONCEType <em>RUNONCE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.RUNONCEType
     * @see Powrmart.impl.PowrmartPackageImpl#getRUNONCEType()
     * @generated
     */
    int RUNONCE_TYPE = 151;

    /**
     * The meta object id for the '{@link Powrmart.SCHEDULETYPEType <em>SCHEDULETYPE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SCHEDULETYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getSCHEDULETYPEType()
     * @generated
     */
    int SCHEDULETYPE_TYPE = 152;

    /**
     * The meta object id for the '{@link Powrmart.SCHEDULETYPEType1 <em>SCHEDULETYPE Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SCHEDULETYPEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getSCHEDULETYPEType1()
     * @generated
     */
    int SCHEDULETYPE_TYPE1 = 153;

    /**
     * The meta object id for the '{@link Powrmart.SHAREDType <em>SHARED Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SHAREDType
     * @see Powrmart.impl.PowrmartPackageImpl#getSHAREDType()
     * @generated
     */
    int SHARED_TYPE = 154;

    /**
     * The meta object id for the '{@link Powrmart.SORTDIRECTIONType <em>SORTDIRECTION Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SORTDIRECTIONType
     * @see Powrmart.impl.PowrmartPackageImpl#getSORTDIRECTIONType()
     * @generated
     */
    int SORTDIRECTION_TYPE = 155;

    /**
     * The meta object id for the '{@link Powrmart.STAGEFILEPERSISTType <em>STAGEFILEPERSIST Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.STAGEFILEPERSISTType
     * @see Powrmart.impl.PowrmartPackageImpl#getSTAGEFILEPERSISTType()
     * @generated
     */
    int STAGEFILEPERSIST_TYPE = 156;

    /**
     * The meta object id for the '{@link Powrmart.STAGEFILEREINITType <em>STAGEFILEREINIT Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.STAGEFILEREINITType
     * @see Powrmart.impl.PowrmartPackageImpl#getSTAGEFILEREINITType()
     * @generated
     */
    int STAGEFILEREINIT_TYPE = 157;

    /**
     * The meta object id for the '{@link Powrmart.SUBTYPEType <em>SUBTYPE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SUBTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getSUBTYPEType()
     * @generated
     */
    int SUBTYPE_TYPE = 158;

    /**
     * The meta object id for the '{@link Powrmart.SUBTYPEType1 <em>SUBTYPE Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SUBTYPEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getSUBTYPEType1()
     * @generated
     */
    int SUBTYPE_TYPE1 = 159;

    /**
     * The meta object id for the '{@link Powrmart.SUSPENDONERRORType <em>SUSPENDONERROR Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SUSPENDONERRORType
     * @see Powrmart.impl.PowrmartPackageImpl#getSUSPENDONERRORType()
     * @generated
     */
    int SUSPENDONERROR_TYPE = 160;

    /**
     * The meta object id for the '{@link Powrmart.TASKSMUSTRUNONSERVERType <em>TASKSMUSTRUNONSERVER Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TASKSMUSTRUNONSERVERType
     * @see Powrmart.impl.PowrmartPackageImpl#getTASKSMUSTRUNONSERVERType()
     * @generated
     */
    int TASKSMUSTRUNONSERVER_TYPE = 161;

    /**
     * The meta object id for the '{@link Powrmart.TIMERTYPEType <em>TIMERTYPE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TIMERTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getTIMERTYPEType()
     * @generated
     */
    int TIMERTYPE_TYPE = 162;

    /**
     * The meta object id for the '{@link Powrmart.TREATINPUTLINKASANDType <em>TREATINPUTLINKASAND Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TREATINPUTLINKASANDType
     * @see Powrmart.impl.PowrmartPackageImpl#getTREATINPUTLINKASANDType()
     * @generated
     */
    int TREATINPUTLINKASAND_TYPE = 163;

    /**
     * The meta object id for the '{@link Powrmart.TYPEType <em>TYPE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPEType()
     * @generated
     */
    int TYPE_TYPE = 164;

    /**
     * The meta object id for the '{@link Powrmart.TYPEType1 <em>TYPE Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPEType1()
     * @generated
     */
    int TYPE_TYPE1 = 165;

    /**
     * The meta object id for the '{@link Powrmart.TYPEType2 <em>TYPE Type2</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType2
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPEType2()
     * @generated
     */
    int TYPE_TYPE2 = 166;

    /**
     * The meta object id for the '{@link Powrmart.TYPEType3 <em>TYPE Type3</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType3
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPEType3()
     * @generated
     */
    int TYPE_TYPE3 = 167;

    /**
     * The meta object id for the '{@link Powrmart.TYPEType4 <em>TYPE Type4</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType4
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPEType4()
     * @generated
     */
    int TYPE_TYPE4 = 168;

    /**
     * The meta object id for the '{@link Powrmart.TYPEType5 <em>TYPE Type5</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType5
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPEType5()
     * @generated
     */
    int TYPE_TYPE5 = 169;

    /**
     * The meta object id for the '{@link Powrmart.TYPEType6 <em>TYPE Type6</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType6
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPEType6()
     * @generated
     */
    int TYPE_TYPE6 = 170;

    /**
     * The meta object id for the '{@link Powrmart.TYPEType7 <em>TYPE Type7</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType7
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPEType7()
     * @generated
     */
    int TYPE_TYPE7 = 171;

    /**
     * The meta object id for the '{@link Powrmart.TYPEType8 <em>TYPE Type8</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType8
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPEType8()
     * @generated
     */
    int TYPE_TYPE8 = 172;

    /**
     * The meta object id for the '{@link Powrmart.USERDEFINEDType <em>USERDEFINED Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.USERDEFINEDType
     * @see Powrmart.impl.PowrmartPackageImpl#getUSERDEFINEDType()
     * @generated
     */
    int USERDEFINED_TYPE = 173;

    /**
     * The meta object id for the '{@link Powrmart.USERDEFINEDType1 <em>USERDEFINED Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.USERDEFINEDType1
     * @see Powrmart.impl.PowrmartPackageImpl#getUSERDEFINEDType1()
     * @generated
     */
    int USERDEFINED_TYPE1 = 174;

    /**
     * The meta object id for the '{@link Powrmart.VALUETYPEType <em>VALUETYPE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.VALUETYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getVALUETYPEType()
     * @generated
     */
    int VALUETYPE_TYPE = 175;

    /**
     * The meta object id for the '{@link Powrmart.VALUETYPEType1 <em>VALUETYPE Type1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.VALUETYPEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getVALUETYPEType1()
     * @generated
     */
    int VALUETYPE_TYPE1 = 176;

    /**
     * The meta object id for the '{@link Powrmart.VALUETYPEType2 <em>VALUETYPE Type2</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.VALUETYPEType2
     * @see Powrmart.impl.PowrmartPackageImpl#getVALUETYPEType2()
     * @generated
     */
    int VALUETYPE_TYPE2 = 177;

    /**
     * The meta object id for the '<em>AGGFUNCTION Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.AGGFUNCTIONType
     * @see Powrmart.impl.PowrmartPackageImpl#getAGGFUNCTIONTypeObject()
     * @generated
     */
    int AGGFUNCTION_TYPE_OBJECT = 178;

    /**
     * The meta object id for the '<em>DATATYPE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.DATATYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getDATATYPETypeObject()
     * @generated
     */
    int DATATYPE_TYPE_OBJECT = 179;

    /**
     * The meta object id for the '<em>DAY Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.DAYType
     * @see Powrmart.impl.PowrmartPackageImpl#getDAYTypeObject()
     * @generated
     */
    int DAY_TYPE_OBJECT = 180;

    /**
     * The meta object id for the '<em>ENDTYPE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ENDTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getENDTYPETypeObject()
     * @generated
     */
    int ENDTYPE_TYPE_OBJECT = 181;

    /**
     * The meta object id for the '<em>FAILPARENTIFINSTANCEDIDNOTRUN Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.FAILPARENTIFINSTANCEDIDNOTRUNType
     * @see Powrmart.impl.PowrmartPackageImpl#getFAILPARENTIFINSTANCEDIDNOTRUNTypeObject()
     * @generated
     */
    int FAILPARENTIFINSTANCEDIDNOTRUN_TYPE_OBJECT = 182;

    /**
     * The meta object id for the '<em>FAILPARENTIFINSTANCEFAILS Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.FAILPARENTIFINSTANCEFAILSType
     * @see Powrmart.impl.PowrmartPackageImpl#getFAILPARENTIFINSTANCEFAILSTypeObject()
     * @generated
     */
    int FAILPARENTIFINSTANCEFAILS_TYPE_OBJECT = 183;

    /**
     * The meta object id for the '<em>IGNOREINCOMPARE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.IGNOREINCOMPAREType
     * @see Powrmart.impl.PowrmartPackageImpl#getIGNOREINCOMPARETypeObject()
     * @generated
     */
    int IGNOREINCOMPARE_TYPE_OBJECT = 184;

    /**
     * The meta object id for the '<em>IGNORENULLINPUTS Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.IGNORENULLINPUTSType
     * @see Powrmart.impl.PowrmartPackageImpl#getIGNORENULLINPUTSTypeObject()
     * @generated
     */
    int IGNORENULLINPUTS_TYPE_OBJECT = 185;

    /**
     * The meta object id for the '<em>ISCLIENTEDITABLE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISCLIENTEDITABLEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISCLIENTEDITABLETypeObject()
     * @generated
     */
    int ISCLIENTEDITABLE_TYPE_OBJECT = 186;

    /**
     * The meta object id for the '<em>ISCLIENTVISIBLE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISCLIENTVISIBLEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISCLIENTVISIBLETypeObject()
     * @generated
     */
    int ISCLIENTVISIBLE_TYPE_OBJECT = 187;

    /**
     * The meta object id for the '<em>ISDEFAULT Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISDEFAULTType
     * @see Powrmart.impl.PowrmartPackageImpl#getISDEFAULTTypeObject()
     * @generated
     */
    int ISDEFAULT_TYPE_OBJECT = 188;

    /**
     * The meta object id for the '<em>ISENABLED Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISENABLEDType
     * @see Powrmart.impl.PowrmartPackageImpl#getISENABLEDTypeObject()
     * @generated
     */
    int ISENABLED_TYPE_OBJECT = 189;

    /**
     * The meta object id for the '<em>ISENABLED Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISENABLEDType1
     * @see Powrmart.impl.PowrmartPackageImpl#getISENABLEDTypeObject1()
     * @generated
     */
    int ISENABLED_TYPE_OBJECT1 = 190;

    /**
     * The meta object id for the '<em>ISEXPRESSIONVARIABLE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISEXPRESSIONVARIABLEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISEXPRESSIONVARIABLETypeObject()
     * @generated
     */
    int ISEXPRESSIONVARIABLE_TYPE_OBJECT = 191;

    /**
     * The meta object id for the '<em>ISFILENAMEFIELD Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISFILENAMEFIELDType
     * @see Powrmart.impl.PowrmartPackageImpl#getISFILENAMEFIELDTypeObject()
     * @generated
     */
    int ISFILENAMEFIELD_TYPE_OBJECT = 192;

    /**
     * The meta object id for the '<em>ISNONE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISNONEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISNONETypeObject()
     * @generated
     */
    int ISNONE_TYPE_OBJECT = 193;

    /**
     * The meta object id for the '<em>ISNULL Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISNULLType
     * @see Powrmart.impl.PowrmartPackageImpl#getISNULLTypeObject()
     * @generated
     */
    int ISNULL_TYPE_OBJECT = 194;

    /**
     * The meta object id for the '<em>ISOPTIONAL Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISOPTIONALType
     * @see Powrmart.impl.PowrmartPackageImpl#getISOPTIONALTypeObject()
     * @generated
     */
    int ISOPTIONAL_TYPE_OBJECT = 195;

    /**
     * The meta object id for the '<em>ISOPTIONAL Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISOPTIONALType1
     * @see Powrmart.impl.PowrmartPackageImpl#getISOPTIONALTypeObject1()
     * @generated
     */
    int ISOPTIONAL_TYPE_OBJECT1 = 196;

    /**
     * The meta object id for the '<em>ISOUTPUTPORT Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISOUTPUTPORTType
     * @see Powrmart.impl.PowrmartPackageImpl#getISOUTPUTPORTTypeObject()
     * @generated
     */
    int ISOUTPUTPORT_TYPE_OBJECT = 197;

    /**
     * The meta object id for the '<em>ISPARAM Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISPARAMType
     * @see Powrmart.impl.PowrmartPackageImpl#getISPARAMTypeObject()
     * @generated
     */
    int ISPARAM_TYPE_OBJECT = 198;

    /**
     * The meta object id for the '<em>ISPERSISTENT Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISPERSISTENTType
     * @see Powrmart.impl.PowrmartPackageImpl#getISPERSISTENTTypeObject()
     * @generated
     */
    int ISPERSISTENT_TYPE_OBJECT = 199;

    /**
     * The meta object id for the '<em>ISPROFILEMAPPING Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISPROFILEMAPPINGType
     * @see Powrmart.impl.PowrmartPackageImpl#getISPROFILEMAPPINGTypeObject()
     * @generated
     */
    int ISPROFILEMAPPING_TYPE_OBJECT = 200;

    /**
     * The meta object id for the '<em>ISREFERENCE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISREFERENCEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISREFERENCETypeObject()
     * @generated
     */
    int ISREFERENCE_TYPE_OBJECT = 201;

    /**
     * The meta object id for the '<em>ISREPARTITIONPOINT Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISREPARTITIONPOINTType
     * @see Powrmart.impl.PowrmartPackageImpl#getISREPARTITIONPOINTTypeObject()
     * @generated
     */
    int ISREPARTITIONPOINT_TYPE_OBJECT = 202;

    /**
     * The meta object id for the '<em>ISREUSABLE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISREUSABLEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISREUSABLETypeObject()
     * @generated
     */
    int ISREUSABLE_TYPE_OBJECT = 203;

    /**
     * The meta object id for the '<em>ISRUNNABLESERVICE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISRUNNABLESERVICEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISRUNNABLESERVICETypeObject()
     * @generated
     */
    int ISRUNNABLESERVICE_TYPE_OBJECT = 204;

    /**
     * The meta object id for the '<em>ISSERVICE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISSERVICEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISSERVICETypeObject()
     * @generated
     */
    int ISSERVICE_TYPE_OBJECT = 205;

    /**
     * The meta object id for the '<em>ISSHAREREAD Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISSHAREREADType
     * @see Powrmart.impl.PowrmartPackageImpl#getISSHAREREADTypeObject()
     * @generated
     */
    int ISSHAREREAD_TYPE_OBJECT = 206;

    /**
     * The meta object id for the '<em>ISSHAREWRITE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISSHAREWRITEType
     * @see Powrmart.impl.PowrmartPackageImpl#getISSHAREWRITETypeObject()
     * @generated
     */
    int ISSHAREWRITE_TYPE_OBJECT = 207;

    /**
     * The meta object id for the '<em>ISSORTKEY Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISSORTKEYType
     * @see Powrmart.impl.PowrmartPackageImpl#getISSORTKEYTypeObject()
     * @generated
     */
    int ISSORTKEY_TYPE_OBJECT = 208;

    /**
     * The meta object id for the '<em>ISVALID Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISVALIDType2
     * @see Powrmart.impl.PowrmartPackageImpl#getISVALIDTypeObject()
     * @generated
     */
    int ISVALID_TYPE_OBJECT = 209;

    /**
     * The meta object id for the '<em>ISVALID Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISVALIDType
     * @see Powrmart.impl.PowrmartPackageImpl#getISVALIDTypeObject1()
     * @generated
     */
    int ISVALID_TYPE_OBJECT1 = 210;

    /**
     * The meta object id for the '<em>ISVALID Type Object2</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISVALIDType1
     * @see Powrmart.impl.PowrmartPackageImpl#getISVALIDTypeObject2()
     * @generated
     */
    int ISVALID_TYPE_OBJECT2 = 211;

    /**
     * The meta object id for the '<em>ISVALID Type Object3</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.ISVALIDType3
     * @see Powrmart.impl.PowrmartPackageImpl#getISVALIDTypeObject3()
     * @generated
     */
    int ISVALID_TYPE_OBJECT3 = 212;

    /**
     * The meta object id for the '<em>MACROTYPE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.MACROTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getMACROTYPETypeObject()
     * @generated
     */
    int MACROTYPE_TYPE_OBJECT = 213;

    /**
     * The meta object id for the '<em>NULLABLE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.NULLABLEType
     * @see Powrmart.impl.PowrmartPackageImpl#getNULLABLETypeObject()
     * @generated
     */
    int NULLABLE_TYPE_OBJECT = 214;

    /**
     * The meta object id for the '<em>NULLABLE Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.NULLABLEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getNULLABLETypeObject1()
     * @generated
     */
    int NULLABLE_TYPE_OBJECT1 = 215;

    /**
     * The meta object id for the '<em>NULLCHARTYPE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.NULLCHARTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getNULLCHARTYPETypeObject()
     * @generated
     */
    int NULLCHARTYPE_TYPE_OBJECT = 216;

    /**
     * The meta object id for the '<em>OBJECTTYPE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.OBJECTTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getOBJECTTYPETypeObject()
     * @generated
     */
    int OBJECTTYPE_TYPE_OBJECT = 217;

    /**
     * The meta object id for the '<em>OCCURRENCE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.OCCURRENCEType
     * @see Powrmart.impl.PowrmartPackageImpl#getOCCURRENCETypeObject()
     * @generated
     */
    int OCCURRENCE_TYPE_OBJECT = 218;

    /**
     * The meta object id for the '<em>OUTERJOINREL Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.OUTERJOINRELType
     * @see Powrmart.impl.PowrmartPackageImpl#getOUTERJOINRELTypeObject()
     * @generated
     */
    int OUTERJOINREL_TYPE_OBJECT = 219;

    /**
     * The meta object id for the '<em>PARENTTYPE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.PARENTTYPEType2
     * @see Powrmart.impl.PowrmartPackageImpl#getPARENTTYPETypeObject()
     * @generated
     */
    int PARENTTYPE_TYPE_OBJECT = 220;

    /**
     * The meta object id for the '<em>PARENTTYPE Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.PARENTTYPEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getPARENTTYPETypeObject1()
     * @generated
     */
    int PARENTTYPE_TYPE_OBJECT1 = 221;

    /**
     * The meta object id for the '<em>PARENTTYPE Type Object2</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.PARENTTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getPARENTTYPETypeObject2()
     * @generated
     */
    int PARENTTYPE_TYPE_OBJECT2 = 222;

    /**
     * The meta object id for the '<em>PARENTTYPE Type Object3</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.PARENTTYPEType3
     * @see Powrmart.impl.PowrmartPackageImpl#getPARENTTYPETypeObject3()
     * @generated
     */
    int PARENTTYPE_TYPE_OBJECT3 = 223;

    /**
     * The meta object id for the '<em>REFERENCETYPE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REFERENCETYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getREFERENCETYPETypeObject()
     * @generated
     */
    int REFERENCETYPE_TYPE_OBJECT = 224;

    /**
     * The meta object id for the '<em>REUSABLESCHEDULER Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLESCHEDULERType
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLESCHEDULERTypeObject()
     * @generated
     */
    int REUSABLESCHEDULER_TYPE_OBJECT = 225;

    /**
     * The meta object id for the '<em>REUSABLE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLETypeObject()
     * @generated
     */
    int REUSABLE_TYPE_OBJECT = 226;

    /**
     * The meta object id for the '<em>REUSABLE Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType4
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLETypeObject1()
     * @generated
     */
    int REUSABLE_TYPE_OBJECT1 = 227;

    /**
     * The meta object id for the '<em>REUSABLE Type Object2</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLETypeObject2()
     * @generated
     */
    int REUSABLE_TYPE_OBJECT2 = 228;

    /**
     * The meta object id for the '<em>REUSABLE Type Object3</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType2
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLETypeObject3()
     * @generated
     */
    int REUSABLE_TYPE_OBJECT3 = 229;

    /**
     * The meta object id for the '<em>REUSABLE Type Object4</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType3
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLETypeObject4()
     * @generated
     */
    int REUSABLE_TYPE_OBJECT4 = 230;

    /**
     * The meta object id for the '<em>REUSABLE Type Object5</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType5
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLETypeObject5()
     * @generated
     */
    int REUSABLE_TYPE_OBJECT5 = 231;

    /**
     * The meta object id for the '<em>REUSABLE Type Object6</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REUSABLEType6
     * @see Powrmart.impl.PowrmartPackageImpl#getREUSABLETypeObject6()
     * @generated
     */
    int REUSABLE_TYPE_OBJECT6 = 232;

    /**
     * The meta object id for the '<em>REVERSEASSIGNMENT Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.REVERSEASSIGNMENTType
     * @see Powrmart.impl.PowrmartPackageImpl#getREVERSEASSIGNMENTTypeObject()
     * @generated
     */
    int REVERSEASSIGNMENT_TYPE_OBJECT = 233;

    /**
     * The meta object id for the '<em>RUNFOREVER Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.RUNFOREVERType
     * @see Powrmart.impl.PowrmartPackageImpl#getRUNFOREVERTypeObject()
     * @generated
     */
    int RUNFOREVER_TYPE_OBJECT = 234;

    /**
     * The meta object id for the '<em>RUNONCE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.RUNONCEType
     * @see Powrmart.impl.PowrmartPackageImpl#getRUNONCETypeObject()
     * @generated
     */
    int RUNONCE_TYPE_OBJECT = 235;

    /**
     * The meta object id for the '<em>SCHEDULETYPE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SCHEDULETYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getSCHEDULETYPETypeObject()
     * @generated
     */
    int SCHEDULETYPE_TYPE_OBJECT = 236;

    /**
     * The meta object id for the '<em>SCHEDULETYPE Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SCHEDULETYPEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getSCHEDULETYPETypeObject1()
     * @generated
     */
    int SCHEDULETYPE_TYPE_OBJECT1 = 237;

    /**
     * The meta object id for the '<em>SHARED Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SHAREDType
     * @see Powrmart.impl.PowrmartPackageImpl#getSHAREDTypeObject()
     * @generated
     */
    int SHARED_TYPE_OBJECT = 238;

    /**
     * The meta object id for the '<em>SORTDIRECTION Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SORTDIRECTIONType
     * @see Powrmart.impl.PowrmartPackageImpl#getSORTDIRECTIONTypeObject()
     * @generated
     */
    int SORTDIRECTION_TYPE_OBJECT = 239;

    /**
     * The meta object id for the '<em>STAGEFILEPERSIST Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.STAGEFILEPERSISTType
     * @see Powrmart.impl.PowrmartPackageImpl#getSTAGEFILEPERSISTTypeObject()
     * @generated
     */
    int STAGEFILEPERSIST_TYPE_OBJECT = 240;

    /**
     * The meta object id for the '<em>STAGEFILEREINIT Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.STAGEFILEREINITType
     * @see Powrmart.impl.PowrmartPackageImpl#getSTAGEFILEREINITTypeObject()
     * @generated
     */
    int STAGEFILEREINIT_TYPE_OBJECT = 241;

    /**
     * The meta object id for the '<em>SUBTYPE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SUBTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getSUBTYPETypeObject()
     * @generated
     */
    int SUBTYPE_TYPE_OBJECT = 242;

    /**
     * The meta object id for the '<em>SUBTYPE Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SUBTYPEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getSUBTYPETypeObject1()
     * @generated
     */
    int SUBTYPE_TYPE_OBJECT1 = 243;

    /**
     * The meta object id for the '<em>SUSPENDONERROR Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.SUSPENDONERRORType
     * @see Powrmart.impl.PowrmartPackageImpl#getSUSPENDONERRORTypeObject()
     * @generated
     */
    int SUSPENDONERROR_TYPE_OBJECT = 244;

    /**
     * The meta object id for the '<em>TASKSMUSTRUNONSERVER Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TASKSMUSTRUNONSERVERType
     * @see Powrmart.impl.PowrmartPackageImpl#getTASKSMUSTRUNONSERVERTypeObject()
     * @generated
     */
    int TASKSMUSTRUNONSERVER_TYPE_OBJECT = 245;

    /**
     * The meta object id for the '<em>TIMERTYPE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TIMERTYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getTIMERTYPETypeObject()
     * @generated
     */
    int TIMERTYPE_TYPE_OBJECT = 246;

    /**
     * The meta object id for the '<em>TREATINPUTLINKASAND Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TREATINPUTLINKASANDType
     * @see Powrmart.impl.PowrmartPackageImpl#getTREATINPUTLINKASANDTypeObject()
     * @generated
     */
    int TREATINPUTLINKASAND_TYPE_OBJECT = 247;

    /**
     * The meta object id for the '<em>TYPE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType6
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPETypeObject()
     * @generated
     */
    int TYPE_TYPE_OBJECT = 248;

    /**
     * The meta object id for the '<em>TYPE Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPETypeObject1()
     * @generated
     */
    int TYPE_TYPE_OBJECT1 = 249;

    /**
     * The meta object id for the '<em>TYPE Type Object2</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType2
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPETypeObject2()
     * @generated
     */
    int TYPE_TYPE_OBJECT2 = 250;

    /**
     * The meta object id for the '<em>TYPE Type Object3</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPETypeObject3()
     * @generated
     */
    int TYPE_TYPE_OBJECT3 = 251;

    /**
     * The meta object id for the '<em>TYPE Type Object4</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType4
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPETypeObject4()
     * @generated
     */
    int TYPE_TYPE_OBJECT4 = 252;

    /**
     * The meta object id for the '<em>TYPE Type Object5</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType3
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPETypeObject5()
     * @generated
     */
    int TYPE_TYPE_OBJECT5 = 253;

    /**
     * The meta object id for the '<em>TYPE Type Object6</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType5
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPETypeObject6()
     * @generated
     */
    int TYPE_TYPE_OBJECT6 = 254;

    /**
     * The meta object id for the '<em>TYPE Type Object7</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType7
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPETypeObject7()
     * @generated
     */
    int TYPE_TYPE_OBJECT7 = 255;

    /**
     * The meta object id for the '<em>TYPE Type Object8</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.TYPEType8
     * @see Powrmart.impl.PowrmartPackageImpl#getTYPETypeObject8()
     * @generated
     */
    int TYPE_TYPE_OBJECT8 = 256;

    /**
     * The meta object id for the '<em>USERDEFINED Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.USERDEFINEDType
     * @see Powrmart.impl.PowrmartPackageImpl#getUSERDEFINEDTypeObject()
     * @generated
     */
    int USERDEFINED_TYPE_OBJECT = 257;

    /**
     * The meta object id for the '<em>USERDEFINED Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.USERDEFINEDType1
     * @see Powrmart.impl.PowrmartPackageImpl#getUSERDEFINEDTypeObject1()
     * @generated
     */
    int USERDEFINED_TYPE_OBJECT1 = 258;

    /**
     * The meta object id for the '<em>VALUETYPE Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.VALUETYPEType1
     * @see Powrmart.impl.PowrmartPackageImpl#getVALUETYPETypeObject()
     * @generated
     */
    int VALUETYPE_TYPE_OBJECT = 259;

    /**
     * The meta object id for the '<em>VALUETYPE Type Object1</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.VALUETYPEType
     * @see Powrmart.impl.PowrmartPackageImpl#getVALUETYPETypeObject1()
     * @generated
     */
    int VALUETYPE_TYPE_OBJECT1 = 260;

    /**
     * The meta object id for the '<em>VALUETYPE Type Object2</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Powrmart.VALUETYPEType2
     * @see Powrmart.impl.PowrmartPackageImpl#getVALUETYPETypeObject2()
     * @generated
     */
    int VALUETYPE_TYPE_OBJECT2 = 261;


    /**
     * Returns the meta object for class '{@link Powrmart.ASSOCIATEDSOURCEINSTANCEType <em>ASSOCIATEDSOURCEINSTANCE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ASSOCIATEDSOURCEINSTANCE Type</em>'.
     * @see Powrmart.ASSOCIATEDSOURCEINSTANCEType
     * @generated
     */
    EClass getASSOCIATEDSOURCEINSTANCEType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.ASSOCIATEDSOURCEINSTANCEType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.ASSOCIATEDSOURCEINSTANCEType#getNAME()
     * @see #getASSOCIATEDSOURCEINSTANCEType()
     * @generated
     */
    EAttribute getASSOCIATEDSOURCEINSTANCEType_NAME();

    /**
     * Returns the meta object for class '{@link Powrmart.ATTRIBUTEType <em>ATTRIBUTE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ATTRIBUTE Type</em>'.
     * @see Powrmart.ATTRIBUTEType
     * @generated
     */
    EClass getATTRIBUTEType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.ATTRIBUTEType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.ATTRIBUTEType#getNAME()
     * @see #getATTRIBUTEType()
     * @generated
     */
    EAttribute getATTRIBUTEType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.ATTRIBUTEType#getPARTITIONNAME <em>PARTITIONNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARTITIONNAME</em>'.
     * @see Powrmart.ATTRIBUTEType#getPARTITIONNAME()
     * @see #getATTRIBUTEType()
     * @generated
     */
    EAttribute getATTRIBUTEType_PARTITIONNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.ATTRIBUTEType#getVALUE <em>VALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUE</em>'.
     * @see Powrmart.ATTRIBUTEType#getVALUE()
     * @see #getATTRIBUTEType()
     * @generated
     */
    EAttribute getATTRIBUTEType_VALUE();

    /**
     * Returns the meta object for class '{@link Powrmart.CONFIGREFERENCEType <em>CONFIGREFERENCE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CONFIGREFERENCE Type</em>'.
     * @see Powrmart.CONFIGREFERENCEType
     * @generated
     */
    EClass getCONFIGREFERENCEType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.CONFIGREFERENCEType#getATTRIBUTE <em>ATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ATTRIBUTE</em>'.
     * @see Powrmart.CONFIGREFERENCEType#getATTRIBUTE()
     * @see #getCONFIGREFERENCEType()
     * @generated
     */
    EReference getCONFIGREFERENCEType_ATTRIBUTE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONFIGREFERENCEType#getREFOBJECTNAME <em>REFOBJECTNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFOBJECTNAME</em>'.
     * @see Powrmart.CONFIGREFERENCEType#getREFOBJECTNAME()
     * @see #getCONFIGREFERENCEType()
     * @generated
     */
    EAttribute getCONFIGREFERENCEType_REFOBJECTNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONFIGREFERENCEType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.CONFIGREFERENCEType#getTYPE()
     * @see #getCONFIGREFERENCEType()
     * @generated
     */
    EAttribute getCONFIGREFERENCEType_TYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.CONFIGType <em>CONFIG Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CONFIG Type</em>'.
     * @see Powrmart.CONFIGType
     * @generated
     */
    EClass getCONFIGType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.CONFIGType#getATTRIBUTE <em>ATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ATTRIBUTE</em>'.
     * @see Powrmart.CONFIGType#getATTRIBUTE()
     * @see #getCONFIGType()
     * @generated
     */
    EReference getCONFIGType_ATTRIBUTE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONFIGType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.CONFIGType#getDESCRIPTION()
     * @see #getCONFIGType()
     * @generated
     */
    EAttribute getCONFIGType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONFIGType#getISDEFAULT <em>ISDEFAULT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISDEFAULT</em>'.
     * @see Powrmart.CONFIGType#getISDEFAULT()
     * @see #getCONFIGType()
     * @generated
     */
    EAttribute getCONFIGType_ISDEFAULT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONFIGType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.CONFIGType#getNAME()
     * @see #getCONFIGType()
     * @generated
     */
    EAttribute getCONFIGType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONFIGType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSIONNUMBER</em>'.
     * @see Powrmart.CONFIGType#getVERSIONNUMBER()
     * @see #getCONFIGType()
     * @generated
     */
    EAttribute getCONFIGType_VERSIONNUMBER();

    /**
     * Returns the meta object for class '{@link Powrmart.CONNECTIONREFERENCEType <em>CONNECTIONREFERENCE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CONNECTIONREFERENCE Type</em>'.
     * @see Powrmart.CONNECTIONREFERENCEType
     * @generated
     */
    EClass getCONNECTIONREFERENCEType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.CONNECTIONREFERENCEType#getATTRIBUTE <em>ATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ATTRIBUTE</em>'.
     * @see Powrmart.CONNECTIONREFERENCEType#getATTRIBUTE()
     * @see #getCONNECTIONREFERENCEType()
     * @generated
     */
    EReference getCONNECTIONREFERENCEType_ATTRIBUTE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTIONREFERENCEType#getCNXREFNAME <em>CNXREFNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CNXREFNAME</em>'.
     * @see Powrmart.CONNECTIONREFERENCEType#getCNXREFNAME()
     * @see #getCONNECTIONREFERENCEType()
     * @generated
     */
    EAttribute getCONNECTIONREFERENCEType_CNXREFNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTIONREFERENCEType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>COMPONENTVERSION</em>'.
     * @see Powrmart.CONNECTIONREFERENCEType#getCOMPONENTVERSION()
     * @see #getCONNECTIONREFERENCEType()
     * @generated
     */
    EAttribute getCONNECTIONREFERENCEType_COMPONENTVERSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTIONREFERENCEType#getCONNECTIONNAME <em>CONNECTIONNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CONNECTIONNAME</em>'.
     * @see Powrmart.CONNECTIONREFERENCEType#getCONNECTIONNAME()
     * @see #getCONNECTIONREFERENCEType()
     * @generated
     */
    EAttribute getCONNECTIONREFERENCEType_CONNECTIONNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTIONREFERENCEType#getCONNECTIONNUMBER <em>CONNECTIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CONNECTIONNUMBER</em>'.
     * @see Powrmart.CONNECTIONREFERENCEType#getCONNECTIONNUMBER()
     * @see #getCONNECTIONREFERENCEType()
     * @generated
     */
    EAttribute getCONNECTIONREFERENCEType_CONNECTIONNUMBER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTIONREFERENCEType#getCONNECTIONSUBTYPE <em>CONNECTIONSUBTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CONNECTIONSUBTYPE</em>'.
     * @see Powrmart.CONNECTIONREFERENCEType#getCONNECTIONSUBTYPE()
     * @see #getCONNECTIONREFERENCEType()
     * @generated
     */
    EAttribute getCONNECTIONREFERENCEType_CONNECTIONSUBTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTIONREFERENCEType#getCONNECTIONTYPE <em>CONNECTIONTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CONNECTIONTYPE</em>'.
     * @see Powrmart.CONNECTIONREFERENCEType#getCONNECTIONTYPE()
     * @see #getCONNECTIONREFERENCEType()
     * @generated
     */
    EAttribute getCONNECTIONREFERENCEType_CONNECTIONTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTIONREFERENCEType#getPARTITIONNAME <em>PARTITIONNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARTITIONNAME</em>'.
     * @see Powrmart.CONNECTIONREFERENCEType#getPARTITIONNAME()
     * @see #getCONNECTIONREFERENCEType()
     * @generated
     */
    EAttribute getCONNECTIONREFERENCEType_PARTITIONNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTIONREFERENCEType#getVARIABLE <em>VARIABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VARIABLE</em>'.
     * @see Powrmart.CONNECTIONREFERENCEType#getVARIABLE()
     * @see #getCONNECTIONREFERENCEType()
     * @generated
     */
    EAttribute getCONNECTIONREFERENCEType_VARIABLE();

    /**
     * Returns the meta object for class '{@link Powrmart.CONNECTORType <em>CONNECTOR Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CONNECTOR Type</em>'.
     * @see Powrmart.CONNECTORType
     * @generated
     */
    EClass getCONNECTORType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTORType#getFROMFIELD <em>FROMFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FROMFIELD</em>'.
     * @see Powrmart.CONNECTORType#getFROMFIELD()
     * @see #getCONNECTORType()
     * @generated
     */
    EAttribute getCONNECTORType_FROMFIELD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTORType#getFROMINSTANCE <em>FROMINSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FROMINSTANCE</em>'.
     * @see Powrmart.CONNECTORType#getFROMINSTANCE()
     * @see #getCONNECTORType()
     * @generated
     */
    EAttribute getCONNECTORType_FROMINSTANCE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTORType#getFROMINSTANCETYPE <em>FROMINSTANCETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FROMINSTANCETYPE</em>'.
     * @see Powrmart.CONNECTORType#getFROMINSTANCETYPE()
     * @see #getCONNECTORType()
     * @generated
     */
    EAttribute getCONNECTORType_FROMINSTANCETYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTORType#getTOFIELD <em>TOFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TOFIELD</em>'.
     * @see Powrmart.CONNECTORType#getTOFIELD()
     * @see #getCONNECTORType()
     * @generated
     */
    EAttribute getCONNECTORType_TOFIELD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTORType#getTOINSTANCE <em>TOINSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TOINSTANCE</em>'.
     * @see Powrmart.CONNECTORType#getTOINSTANCE()
     * @see #getCONNECTORType()
     * @generated
     */
    EAttribute getCONNECTORType_TOINSTANCE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONNECTORType#getTOINSTANCETYPE <em>TOINSTANCETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TOINSTANCETYPE</em>'.
     * @see Powrmart.CONNECTORType#getTOINSTANCETYPE()
     * @see #getCONNECTORType()
     * @generated
     */
    EAttribute getCONNECTORType_TOINSTANCETYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.CONWFRUNINFOType <em>CONWFRUNINFO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CONWFRUNINFO Type</em>'.
     * @see Powrmart.CONWFRUNINFOType
     * @generated
     */
    EClass getCONWFRUNINFOType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONWFRUNINFOType#getCONWFPARAMFILE <em>CONWFPARAMFILE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CONWFPARAMFILE</em>'.
     * @see Powrmart.CONWFRUNINFOType#getCONWFPARAMFILE()
     * @see #getCONWFRUNINFOType()
     * @generated
     */
    EAttribute getCONWFRUNINFOType_CONWFPARAMFILE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.CONWFRUNINFOType#getCONWFRUNINSTNAME <em>CONWFRUNINSTNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CONWFRUNINSTNAME</em>'.
     * @see Powrmart.CONWFRUNINFOType#getCONWFRUNINSTNAME()
     * @see #getCONWFRUNINFOType()
     * @generated
     */
    EAttribute getCONWFRUNINFOType_CONWFRUNINSTNAME();

    /**
     * Returns the meta object for class '{@link Powrmart.CUSTOMType <em>CUSTOM Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>CUSTOM Type</em>'.
     * @see Powrmart.CUSTOMType
     * @generated
     */
    EClass getCUSTOMType();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.CUSTOMType#getDAILYFREQUENCY <em>DAILYFREQUENCY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>DAILYFREQUENCY</em>'.
     * @see Powrmart.CUSTOMType#getDAILYFREQUENCY()
     * @see #getCUSTOMType()
     * @generated
     */
    EReference getCUSTOMType_DAILYFREQUENCY();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.CUSTOMType#getREPEAT <em>REPEAT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>REPEAT</em>'.
     * @see Powrmart.CUSTOMType#getREPEAT()
     * @see #getCUSTOMType()
     * @generated
     */
    EReference getCUSTOMType_REPEAT();

    /**
     * Returns the meta object for class '{@link Powrmart.DAILYFREQUENCYType <em>DAILYFREQUENCY Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>DAILYFREQUENCY Type</em>'.
     * @see Powrmart.DAILYFREQUENCYType
     * @generated
     */
    EClass getDAILYFREQUENCYType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.DAILYFREQUENCYType#getHOURS <em>HOURS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>HOURS</em>'.
     * @see Powrmart.DAILYFREQUENCYType#getHOURS()
     * @see #getDAILYFREQUENCYType()
     * @generated
     */
    EAttribute getDAILYFREQUENCYType_HOURS();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.DAILYFREQUENCYType#getMINUTES <em>MINUTES</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MINUTES</em>'.
     * @see Powrmart.DAILYFREQUENCYType#getMINUTES()
     * @see #getDAILYFREQUENCYType()
     * @generated
     */
    EAttribute getDAILYFREQUENCYType_MINUTES();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.DAILYFREQUENCYType#getRUNONCE <em>RUNONCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>RUNONCE</em>'.
     * @see Powrmart.DAILYFREQUENCYType#getRUNONCE()
     * @see #getDAILYFREQUENCYType()
     * @generated
     */
    EAttribute getDAILYFREQUENCYType_RUNONCE();

    /**
     * Returns the meta object for class '{@link Powrmart.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see Powrmart.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link Powrmart.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see Powrmart.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link Powrmart.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see Powrmart.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link Powrmart.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see Powrmart.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getASSOCIATEDSOURCEINSTANCE <em>ASSOCIATEDSOURCEINSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>ASSOCIATEDSOURCEINSTANCE</em>'.
     * @see Powrmart.DocumentRoot#getASSOCIATEDSOURCEINSTANCE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ASSOCIATEDSOURCEINSTANCE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getATTRIBUTE <em>ATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>ATTRIBUTE</em>'.
     * @see Powrmart.DocumentRoot#getATTRIBUTE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ATTRIBUTE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getCONFIG <em>CONFIG</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CONFIG</em>'.
     * @see Powrmart.DocumentRoot#getCONFIG()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CONFIG();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getCONFIGREFERENCE <em>CONFIGREFERENCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CONFIGREFERENCE</em>'.
     * @see Powrmart.DocumentRoot#getCONFIGREFERENCE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CONFIGREFERENCE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getCONNECTIONREFERENCE <em>CONNECTIONREFERENCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CONNECTIONREFERENCE</em>'.
     * @see Powrmart.DocumentRoot#getCONNECTIONREFERENCE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CONNECTIONREFERENCE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getCONNECTOR <em>CONNECTOR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CONNECTOR</em>'.
     * @see Powrmart.DocumentRoot#getCONNECTOR()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CONNECTOR();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getCONWFRUNINFO <em>CONWFRUNINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CONWFRUNINFO</em>'.
     * @see Powrmart.DocumentRoot#getCONWFRUNINFO()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CONWFRUNINFO();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getCUSTOM <em>CUSTOM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CUSTOM</em>'.
     * @see Powrmart.DocumentRoot#getCUSTOM()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CUSTOM();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getDAILYFREQUENCY <em>DAILYFREQUENCY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>DAILYFREQUENCY</em>'.
     * @see Powrmart.DocumentRoot#getDAILYFREQUENCY()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DAILYFREQUENCY();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getENDOPTIONS <em>ENDOPTIONS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>ENDOPTIONS</em>'.
     * @see Powrmart.DocumentRoot#getENDOPTIONS()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ENDOPTIONS();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getERPINFO <em>ERPINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>ERPINFO</em>'.
     * @see Powrmart.DocumentRoot#getERPINFO()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ERPINFO();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getERPSRCINFO <em>ERPSRCINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>ERPSRCINFO</em>'.
     * @see Powrmart.DocumentRoot#getERPSRCINFO()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ERPSRCINFO();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getEXPRMACRO <em>EXPRMACRO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>EXPRMACRO</em>'.
     * @see Powrmart.DocumentRoot#getEXPRMACRO()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EXPRMACRO();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>EXPRMACRODEPENDENCY</em>'.
     * @see Powrmart.DocumentRoot#getEXPRMACRODEPENDENCY()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EXPRMACRODEPENDENCY();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getFIELDATTRIBUTE <em>FIELDATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>FIELDATTRIBUTE</em>'.
     * @see Powrmart.DocumentRoot#getFIELDATTRIBUTE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FIELDATTRIBUTE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getFIELDDEPENDENCY <em>FIELDDEPENDENCY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>FIELDDEPENDENCY</em>'.
     * @see Powrmart.DocumentRoot#getFIELDDEPENDENCY()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FIELDDEPENDENCY();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getFILTER <em>FILTER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>FILTER</em>'.
     * @see Powrmart.DocumentRoot#getFILTER()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FILTER();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getFLATFILE <em>FLATFILE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>FLATFILE</em>'.
     * @see Powrmart.DocumentRoot#getFLATFILE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FLATFILE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getFOLDER <em>FOLDER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>FOLDER</em>'.
     * @see Powrmart.DocumentRoot#getFOLDER()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FOLDER();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getFOLDERVERSION <em>FOLDERVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>FOLDERVERSION</em>'.
     * @see Powrmart.DocumentRoot#getFOLDERVERSION()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FOLDERVERSION();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getGROUP <em>GROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>GROUP</em>'.
     * @see Powrmart.DocumentRoot#getGROUP()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GROUP();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getHASHKEY <em>HASHKEY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>HASHKEY</em>'.
     * @see Powrmart.DocumentRoot#getHASHKEY()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_HASHKEY();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getINITPROP <em>INITPROP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>INITPROP</em>'.
     * @see Powrmart.DocumentRoot#getINITPROP()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_INITPROP();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getINSTANCE <em>INSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>INSTANCE</em>'.
     * @see Powrmart.DocumentRoot#getINSTANCE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_INSTANCE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getKEYRANGE <em>KEYRANGE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>KEYRANGE</em>'.
     * @see Powrmart.DocumentRoot#getKEYRANGE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_KEYRANGE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getKEYWORD <em>KEYWORD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>KEYWORD</em>'.
     * @see Powrmart.DocumentRoot#getKEYWORD()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_KEYWORD();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getMACROARGUMENT <em>MACROARGUMENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>MACROARGUMENT</em>'.
     * @see Powrmart.DocumentRoot#getMACROARGUMENT()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MACROARGUMENT();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getMACRODEPENDENCY <em>MACRODEPENDENCY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>MACRODEPENDENCY</em>'.
     * @see Powrmart.DocumentRoot#getMACRODEPENDENCY()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MACRODEPENDENCY();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getMAPDEPENDENCY <em>MAPDEPENDENCY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>MAPDEPENDENCY</em>'.
     * @see Powrmart.DocumentRoot#getMAPDEPENDENCY()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MAPDEPENDENCY();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getMAPPING <em>MAPPING</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>MAPPING</em>'.
     * @see Powrmart.DocumentRoot#getMAPPING()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MAPPING();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getMAPPINGVARIABLE <em>MAPPINGVARIABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>MAPPINGVARIABLE</em>'.
     * @see Powrmart.DocumentRoot#getMAPPINGVARIABLE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MAPPINGVARIABLE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getMAPPLET <em>MAPPLET</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>MAPPLET</em>'.
     * @see Powrmart.DocumentRoot#getMAPPLET()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MAPPLET();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>METADATAEXTENSION</em>'.
     * @see Powrmart.DocumentRoot#getMETADATAEXTENSION()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_METADATAEXTENSION();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getPARTITION <em>PARTITION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>PARTITION</em>'.
     * @see Powrmart.DocumentRoot#getPARTITION()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PARTITION();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getPOWERMART <em>POWERMART</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>POWERMART</em>'.
     * @see Powrmart.DocumentRoot#getPOWERMART()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_POWERMART();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getRECURRING <em>RECURRING</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>RECURRING</em>'.
     * @see Powrmart.DocumentRoot#getRECURRING()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_RECURRING();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getREPEAT <em>REPEAT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>REPEAT</em>'.
     * @see Powrmart.DocumentRoot#getREPEAT()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_REPEAT();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getREPOSITORY <em>REPOSITORY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>REPOSITORY</em>'.
     * @see Powrmart.DocumentRoot#getREPOSITORY()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_REPOSITORY();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>RESOURCEREFERENCE</em>'.
     * @see Powrmart.DocumentRoot#getRESOURCEREFERENCE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_RESOURCEREFERENCE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPCODEBLOCK <em>SAPCODEBLOCK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPCODEBLOCK</em>'.
     * @see Powrmart.DocumentRoot#getSAPCODEBLOCK()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPCODEBLOCK();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPFUNCINSTANCEPARAM <em>SAPFUNCINSTANCEPARAM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPFUNCINSTANCEPARAM</em>'.
     * @see Powrmart.DocumentRoot#getSAPFUNCINSTANCEPARAM()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPFUNCINSTANCEPARAM();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPFUNCINSTANCEPARAMFLD <em>SAPFUNCINSTANCEPARAMFLD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPFUNCINSTANCEPARAMFLD</em>'.
     * @see Powrmart.DocumentRoot#getSAPFUNCINSTANCEPARAMFLD()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPFUNCINSTANCEPARAMFLD();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPFUNCPARAM <em>SAPFUNCPARAM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPFUNCPARAM</em>'.
     * @see Powrmart.DocumentRoot#getSAPFUNCPARAM()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPFUNCPARAM();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPFUNCTION <em>SAPFUNCTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPFUNCTION</em>'.
     * @see Powrmart.DocumentRoot#getSAPFUNCTION()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPFUNCTION();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPFUNCTIONINSTANCE <em>SAPFUNCTIONINSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPFUNCTIONINSTANCE</em>'.
     * @see Powrmart.DocumentRoot#getSAPFUNCTIONINSTANCE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPFUNCTIONINSTANCE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPOUTPUTPORT <em>SAPOUTPUTPORT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPOUTPUTPORT</em>'.
     * @see Powrmart.DocumentRoot#getSAPOUTPUTPORT()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPOUTPUTPORT();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPPROGRAM <em>SAPPROGRAM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPPROGRAM</em>'.
     * @see Powrmart.DocumentRoot#getSAPPROGRAM()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPPROGRAM();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPPROGRAMFLOWOBJECT <em>SAPPROGRAMFLOWOBJECT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPPROGRAMFLOWOBJECT</em>'.
     * @see Powrmart.DocumentRoot#getSAPPROGRAMFLOWOBJECT()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPPROGRAMFLOWOBJECT();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPSTRUCTURE <em>SAPSTRUCTURE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPSTRUCTURE</em>'.
     * @see Powrmart.DocumentRoot#getSAPSTRUCTURE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPSTRUCTURE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPSTRUCTUREFIELD <em>SAPSTRUCTUREFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPSTRUCTUREFIELD</em>'.
     * @see Powrmart.DocumentRoot#getSAPSTRUCTUREFIELD()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPSTRUCTUREFIELD();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPTABLEINSTANCEPARAM <em>SAPTABLEINSTANCEPARAM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPTABLEINSTANCEPARAM</em>'.
     * @see Powrmart.DocumentRoot#getSAPTABLEINSTANCEPARAM()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPTABLEINSTANCEPARAM();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPTABLEPARAM <em>SAPTABLEPARAM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPTABLEPARAM</em>'.
     * @see Powrmart.DocumentRoot#getSAPTABLEPARAM()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPTABLEPARAM();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSAPVARIABLE <em>SAPVARIABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPVARIABLE</em>'.
     * @see Powrmart.DocumentRoot#getSAPVARIABLE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SAPVARIABLE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSCHEDULEINFO <em>SCHEDULEINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SCHEDULEINFO</em>'.
     * @see Powrmart.DocumentRoot#getSCHEDULEINFO()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SCHEDULEINFO();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSCHEDULEOPTIONS <em>SCHEDULEOPTIONS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SCHEDULEOPTIONS</em>'.
     * @see Powrmart.DocumentRoot#getSCHEDULEOPTIONS()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SCHEDULEOPTIONS();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSCHEDULER <em>SCHEDULER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SCHEDULER</em>'.
     * @see Powrmart.DocumentRoot#getSCHEDULER()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SCHEDULER();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSEBLJOIN <em>SEBLJOIN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SEBLJOIN</em>'.
     * @see Powrmart.DocumentRoot#getSEBLJOIN()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SEBLJOIN();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSEBLLINK <em>SEBLLINK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SEBLLINK</em>'.
     * @see Powrmart.DocumentRoot#getSEBLLINK()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SEBLLINK();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSEBLMVLINK <em>SEBLMVLINK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SEBLMVLINK</em>'.
     * @see Powrmart.DocumentRoot#getSEBLMVLINK()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SEBLMVLINK();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSEBLMVLINKREL <em>SEBLMVLINKREL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SEBLMVLINKREL</em>'.
     * @see Powrmart.DocumentRoot#getSEBLMVLINKREL()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SEBLMVLINKREL();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSEBLSRCINFO <em>SEBLSRCINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SEBLSRCINFO</em>'.
     * @see Powrmart.DocumentRoot#getSEBLSRCINFO()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SEBLSRCINFO();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSESSION <em>SESSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SESSION</em>'.
     * @see Powrmart.DocumentRoot#getSESSION()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SESSION();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSESSIONCOMPONENT <em>SESSIONCOMPONENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SESSIONCOMPONENT</em>'.
     * @see Powrmart.DocumentRoot#getSESSIONCOMPONENT()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SESSIONCOMPONENT();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSESSIONEXTENSION <em>SESSIONEXTENSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SESSIONEXTENSION</em>'.
     * @see Powrmart.DocumentRoot#getSESSIONEXTENSION()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SESSIONEXTENSION();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSESSTRANSFORMATIONGROUP <em>SESSTRANSFORMATIONGROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SESSTRANSFORMATIONGROUP</em>'.
     * @see Powrmart.DocumentRoot#getSESSTRANSFORMATIONGROUP()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SESSTRANSFORMATIONGROUP();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSESSTRANSFORMATIONINST <em>SESSTRANSFORMATIONINST</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SESSTRANSFORMATIONINST</em>'.
     * @see Powrmart.DocumentRoot#getSESSTRANSFORMATIONINST()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SESSTRANSFORMATIONINST();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSHORTCUT <em>SHORTCUT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SHORTCUT</em>'.
     * @see Powrmart.DocumentRoot#getSHORTCUT()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SHORTCUT();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSOURCE <em>SOURCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SOURCE</em>'.
     * @see Powrmart.DocumentRoot#getSOURCE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SOURCE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSOURCEFIELD <em>SOURCEFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SOURCEFIELD</em>'.
     * @see Powrmart.DocumentRoot#getSOURCEFIELD()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SOURCEFIELD();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getSTARTOPTIONS <em>STARTOPTIONS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>STARTOPTIONS</em>'.
     * @see Powrmart.DocumentRoot#getSTARTOPTIONS()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_STARTOPTIONS();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TABLEATTRIBUTE</em>'.
     * @see Powrmart.DocumentRoot#getTABLEATTRIBUTE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TABLEATTRIBUTE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTARGET <em>TARGET</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TARGET</em>'.
     * @see Powrmart.DocumentRoot#getTARGET()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TARGET();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTARGETFIELD <em>TARGETFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TARGETFIELD</em>'.
     * @see Powrmart.DocumentRoot#getTARGETFIELD()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TARGETFIELD();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTARGETINDEX <em>TARGETINDEX</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TARGETINDEX</em>'.
     * @see Powrmart.DocumentRoot#getTARGETINDEX()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TARGETINDEX();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTARGETINDEXFIELD <em>TARGETINDEXFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TARGETINDEXFIELD</em>'.
     * @see Powrmart.DocumentRoot#getTARGETINDEXFIELD()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TARGETINDEXFIELD();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTARGETLOADORDER <em>TARGETLOADORDER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TARGETLOADORDER</em>'.
     * @see Powrmart.DocumentRoot#getTARGETLOADORDER()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TARGETLOADORDER();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTASK <em>TASK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TASK</em>'.
     * @see Powrmart.DocumentRoot#getTASK()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TASK();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTASKINSTANCE <em>TASKINSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TASKINSTANCE</em>'.
     * @see Powrmart.DocumentRoot#getTASKINSTANCE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TASKINSTANCE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTIMER <em>TIMER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TIMER</em>'.
     * @see Powrmart.DocumentRoot#getTIMER()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TIMER();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTRANSFORMATION <em>TRANSFORMATION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TRANSFORMATION</em>'.
     * @see Powrmart.DocumentRoot#getTRANSFORMATION()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TRANSFORMATION();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTRANSFORMFIELD <em>TRANSFORMFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TRANSFORMFIELD</em>'.
     * @see Powrmart.DocumentRoot#getTRANSFORMFIELD()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TRANSFORMFIELD();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTRANSFORMFIELDATTR <em>TRANSFORMFIELDATTR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TRANSFORMFIELDATTR</em>'.
     * @see Powrmart.DocumentRoot#getTRANSFORMFIELDATTR()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TRANSFORMFIELDATTR();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTRANSFORMFIELDATTRDEF <em>TRANSFORMFIELDATTRDEF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TRANSFORMFIELDATTRDEF</em>'.
     * @see Powrmart.DocumentRoot#getTRANSFORMFIELDATTRDEF()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TRANSFORMFIELDATTRDEF();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getTRANSFORMRESOURCEREF <em>TRANSFORMRESOURCEREF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TRANSFORMRESOURCEREF</em>'.
     * @see Powrmart.DocumentRoot#getTRANSFORMRESOURCEREF()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TRANSFORMRESOURCEREF();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getVALUEPAIR <em>VALUEPAIR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>VALUEPAIR</em>'.
     * @see Powrmart.DocumentRoot#getVALUEPAIR()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_VALUEPAIR();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getWORKFLOW <em>WORKFLOW</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>WORKFLOW</em>'.
     * @see Powrmart.DocumentRoot#getWORKFLOW()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_WORKFLOW();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getWORKFLOWEVENT <em>WORKFLOWEVENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>WORKFLOWEVENT</em>'.
     * @see Powrmart.DocumentRoot#getWORKFLOWEVENT()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_WORKFLOWEVENT();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getWORKFLOWLINK <em>WORKFLOWLINK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>WORKFLOWLINK</em>'.
     * @see Powrmart.DocumentRoot#getWORKFLOWLINK()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_WORKFLOWLINK();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getWORKFLOWVARIABLE <em>WORKFLOWVARIABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>WORKFLOWVARIABLE</em>'.
     * @see Powrmart.DocumentRoot#getWORKFLOWVARIABLE()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_WORKFLOWVARIABLE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getWORKLET <em>WORKLET</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>WORKLET</em>'.
     * @see Powrmart.DocumentRoot#getWORKLET()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_WORKLET();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getXMLINFO <em>XMLINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>XMLINFO</em>'.
     * @see Powrmart.DocumentRoot#getXMLINFO()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLINFO();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.DocumentRoot#getXMLTEXT <em>XMLTEXT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>XMLTEXT</em>'.
     * @see Powrmart.DocumentRoot#getXMLTEXT()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLTEXT();

    /**
     * Returns the meta object for class '{@link Powrmart.ENDOPTIONSType <em>ENDOPTIONS Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ENDOPTIONS Type</em>'.
     * @see Powrmart.ENDOPTIONSType
     * @generated
     */
    EClass getENDOPTIONSType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.ENDOPTIONSType#getENDAFTER <em>ENDAFTER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ENDAFTER</em>'.
     * @see Powrmart.ENDOPTIONSType#getENDAFTER()
     * @see #getENDOPTIONSType()
     * @generated
     */
    EAttribute getENDOPTIONSType_ENDAFTER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.ENDOPTIONSType#getENDON <em>ENDON</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ENDON</em>'.
     * @see Powrmart.ENDOPTIONSType#getENDON()
     * @see #getENDOPTIONSType()
     * @generated
     */
    EAttribute getENDOPTIONSType_ENDON();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.ENDOPTIONSType#getENDTYPE <em>ENDTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ENDTYPE</em>'.
     * @see Powrmart.ENDOPTIONSType#getENDTYPE()
     * @see #getENDOPTIONSType()
     * @generated
     */
    EAttribute getENDOPTIONSType_ENDTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.ENDOPTIONSType#getRUNFOREVER <em>RUNFOREVER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>RUNFOREVER</em>'.
     * @see Powrmart.ENDOPTIONSType#getRUNFOREVER()
     * @see #getENDOPTIONSType()
     * @generated
     */
    EAttribute getENDOPTIONSType_RUNFOREVER();

    /**
     * Returns the meta object for class '{@link Powrmart.ERPINFOType <em>ERPINFO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ERPINFO Type</em>'.
     * @see Powrmart.ERPINFOType
     * @generated
     */
    EClass getERPINFOType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.ERPINFOType#getSAPFUNCTION <em>SAPFUNCTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SAPFUNCTION</em>'.
     * @see Powrmart.ERPINFOType#getSAPFUNCTION()
     * @see #getERPINFOType()
     * @generated
     */
    EReference getERPINFOType_SAPFUNCTION();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.ERPINFOType#getSAPSTRUCTURE <em>SAPSTRUCTURE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SAPSTRUCTURE</em>'.
     * @see Powrmart.ERPINFOType#getSAPSTRUCTURE()
     * @see #getERPINFOType()
     * @generated
     */
    EReference getERPINFOType_SAPSTRUCTURE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.ERPINFOType#getSAPPROGRAM <em>SAPPROGRAM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SAPPROGRAM</em>'.
     * @see Powrmart.ERPINFOType#getSAPPROGRAM()
     * @see #getERPINFOType()
     * @generated
     */
    EReference getERPINFOType_SAPPROGRAM();

    /**
     * Returns the meta object for the attribute list '{@link Powrmart.ERPINFOType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see Powrmart.ERPINFOType#getGroup()
     * @see #getERPINFOType()
     * @generated
     */
    EAttribute getERPINFOType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.ERPINFOType#getSAPOUTPUTPORT <em>SAPOUTPUTPORT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SAPOUTPUTPORT</em>'.
     * @see Powrmart.ERPINFOType#getSAPOUTPUTPORT()
     * @see #getERPINFOType()
     * @generated
     */
    EReference getERPINFOType_SAPOUTPUTPORT();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.ERPINFOType#getSAPVARIABLE <em>SAPVARIABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SAPVARIABLE</em>'.
     * @see Powrmart.ERPINFOType#getSAPVARIABLE()
     * @see #getERPINFOType()
     * @generated
     */
    EReference getERPINFOType_SAPVARIABLE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.ERPINFOType#getSAPPROGRAMFLOWOBJECT <em>SAPPROGRAMFLOWOBJECT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SAPPROGRAMFLOWOBJECT</em>'.
     * @see Powrmart.ERPINFOType#getSAPPROGRAMFLOWOBJECT()
     * @see #getERPINFOType()
     * @generated
     */
    EReference getERPINFOType_SAPPROGRAMFLOWOBJECT();

    /**
     * Returns the meta object for class '{@link Powrmart.ERPSRCINFOType <em>ERPSRCINFO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ERPSRCINFO Type</em>'.
     * @see Powrmart.ERPSRCINFOType
     * @generated
     */
    EClass getERPSRCINFOType();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.ERPSRCINFOType#getSEBLSRCINFO <em>SEBLSRCINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SEBLSRCINFO</em>'.
     * @see Powrmart.ERPSRCINFOType#getSEBLSRCINFO()
     * @see #getERPSRCINFOType()
     * @generated
     */
    EReference getERPSRCINFOType_SEBLSRCINFO();

    /**
     * Returns the meta object for class '{@link Powrmart.EXPRMACRODEPENDENCYType <em>EXPRMACRODEPENDENCY Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EXPRMACRODEPENDENCY Type</em>'.
     * @see Powrmart.EXPRMACRODEPENDENCYType
     * @generated
     */
    EClass getEXPRMACRODEPENDENCYType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.EXPRMACRODEPENDENCYType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.EXPRMACRODEPENDENCYType#getNAME()
     * @see #getEXPRMACRODEPENDENCYType()
     * @generated
     */
    EAttribute getEXPRMACRODEPENDENCYType_NAME();

    /**
     * Returns the meta object for class '{@link Powrmart.EXPRMACROType <em>EXPRMACRO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EXPRMACRO Type</em>'.
     * @see Powrmart.EXPRMACROType
     * @generated
     */
    EClass getEXPRMACROType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.EXPRMACROType#getMACROARGUMENT <em>MACROARGUMENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>MACROARGUMENT</em>'.
     * @see Powrmart.EXPRMACROType#getMACROARGUMENT()
     * @see #getEXPRMACROType()
     * @generated
     */
    EReference getEXPRMACROType_MACROARGUMENT();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.EXPRMACROType#getMACRODEPENDENCY <em>MACRODEPENDENCY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>MACRODEPENDENCY</em>'.
     * @see Powrmart.EXPRMACROType#getMACRODEPENDENCY()
     * @see #getEXPRMACROType()
     * @generated
     */
    EReference getEXPRMACROType_MACRODEPENDENCY();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.EXPRMACROType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.EXPRMACROType#getDESCRIPTION()
     * @see #getEXPRMACROType()
     * @generated
     */
    EAttribute getEXPRMACROType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.EXPRMACROType#getEXPRESSION <em>EXPRESSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>EXPRESSION</em>'.
     * @see Powrmart.EXPRMACROType#getEXPRESSION()
     * @see #getEXPRMACROType()
     * @generated
     */
    EAttribute getEXPRMACROType_EXPRESSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.EXPRMACROType#getMACROTYPE <em>MACROTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MACROTYPE</em>'.
     * @see Powrmart.EXPRMACROType#getMACROTYPE()
     * @see #getEXPRMACROType()
     * @generated
     */
    EAttribute getEXPRMACROType_MACROTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.EXPRMACROType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.EXPRMACROType#getNAME()
     * @see #getEXPRMACROType()
     * @generated
     */
    EAttribute getEXPRMACROType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.EXPRMACROType#getOBJECTVERSION <em>OBJECTVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OBJECTVERSION</em>'.
     * @see Powrmart.EXPRMACROType#getOBJECTVERSION()
     * @see #getEXPRMACROType()
     * @generated
     */
    EAttribute getEXPRMACROType_OBJECTVERSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.EXPRMACROType#getPROTOTYPE <em>PROTOTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PROTOTYPE</em>'.
     * @see Powrmart.EXPRMACROType#getPROTOTYPE()
     * @see #getEXPRMACROType()
     * @generated
     */
    EAttribute getEXPRMACROType_PROTOTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.EXPRMACROType#getRETURNTYPE <em>RETURNTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>RETURNTYPE</em>'.
     * @see Powrmart.EXPRMACROType#getRETURNTYPE()
     * @see #getEXPRMACROType()
     * @generated
     */
    EAttribute getEXPRMACROType_RETURNTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.EXPRMACROType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSIONNUMBER</em>'.
     * @see Powrmart.EXPRMACROType#getVERSIONNUMBER()
     * @see #getEXPRMACROType()
     * @generated
     */
    EAttribute getEXPRMACROType_VERSIONNUMBER();

    /**
     * Returns the meta object for class '{@link Powrmart.FIELDATTRIBUTEType <em>FIELDATTRIBUTE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>FIELDATTRIBUTE Type</em>'.
     * @see Powrmart.FIELDATTRIBUTEType
     * @generated
     */
    EClass getFIELDATTRIBUTEType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FIELDATTRIBUTEType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.FIELDATTRIBUTEType#getNAME()
     * @see #getFIELDATTRIBUTEType()
     * @generated
     */
    EAttribute getFIELDATTRIBUTEType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FIELDATTRIBUTEType#getVALUE <em>VALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUE</em>'.
     * @see Powrmart.FIELDATTRIBUTEType#getVALUE()
     * @see #getFIELDATTRIBUTEType()
     * @generated
     */
    EAttribute getFIELDATTRIBUTEType_VALUE();

    /**
     * Returns the meta object for class '{@link Powrmart.FIELDDEPENDENCYType <em>FIELDDEPENDENCY Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>FIELDDEPENDENCY Type</em>'.
     * @see Powrmart.FIELDDEPENDENCYType
     * @generated
     */
    EClass getFIELDDEPENDENCYType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FIELDDEPENDENCYType#getINPUTFIELD <em>INPUTFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>INPUTFIELD</em>'.
     * @see Powrmart.FIELDDEPENDENCYType#getINPUTFIELD()
     * @see #getFIELDDEPENDENCYType()
     * @generated
     */
    EAttribute getFIELDDEPENDENCYType_INPUTFIELD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FIELDDEPENDENCYType#getOUTPUTFIELD <em>OUTPUTFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OUTPUTFIELD</em>'.
     * @see Powrmart.FIELDDEPENDENCYType#getOUTPUTFIELD()
     * @see #getFIELDDEPENDENCYType()
     * @generated
     */
    EAttribute getFIELDDEPENDENCYType_OUTPUTFIELD();

    /**
     * Returns the meta object for class '{@link Powrmart.FILTERType <em>FILTER Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>FILTER Type</em>'.
     * @see Powrmart.FILTERType
     * @generated
     */
    EClass getFILTERType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FILTERType#getDAY <em>DAY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DAY</em>'.
     * @see Powrmart.FILTERType#getDAY()
     * @see #getFILTERType()
     * @generated
     */
    EAttribute getFILTERType_DAY();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FILTERType#getDAYOFMONTH <em>DAYOFMONTH</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DAYOFMONTH</em>'.
     * @see Powrmart.FILTERType#getDAYOFMONTH()
     * @see #getFILTERType()
     * @generated
     */
    EAttribute getFILTERType_DAYOFMONTH();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FILTERType#getOCCURRENCE <em>OCCURRENCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OCCURRENCE</em>'.
     * @see Powrmart.FILTERType#getOCCURRENCE()
     * @see #getFILTERType()
     * @generated
     */
    EAttribute getFILTERType_OCCURRENCE();

    /**
     * Returns the meta object for class '{@link Powrmart.FLATFILEType <em>FLATFILE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>FLATFILE Type</em>'.
     * @see Powrmart.FLATFILEType
     * @generated
     */
    EClass getFLATFILEType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getCODEPAGE <em>CODEPAGE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CODEPAGE</em>'.
     * @see Powrmart.FLATFILEType#getCODEPAGE()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_CODEPAGE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getCONSECDELIMITERSASONE <em>CONSECDELIMITERSASONE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CONSECDELIMITERSASONE</em>'.
     * @see Powrmart.FLATFILEType#getCONSECDELIMITERSASONE()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_CONSECDELIMITERSASONE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getDELIMITED <em>DELIMITED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DELIMITED</em>'.
     * @see Powrmart.FLATFILEType#getDELIMITED()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_DELIMITED();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getDELIMITERS <em>DELIMITERS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DELIMITERS</em>'.
     * @see Powrmart.FLATFILEType#getDELIMITERS()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_DELIMITERS();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getDELIMITERSINBINARY <em>DELIMITERSINBINARY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DELIMITERSINBINARY</em>'.
     * @see Powrmart.FLATFILEType#getDELIMITERSINBINARY()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_DELIMITERSINBINARY();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getESCAPECHARACTER <em>ESCAPECHARACTER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ESCAPECHARACTER</em>'.
     * @see Powrmart.FLATFILEType#getESCAPECHARACTER()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_ESCAPECHARACTER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getFILENAME <em>FILENAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FILENAME</em>'.
     * @see Powrmart.FLATFILEType#getFILENAME()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_FILENAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getFILETYPE <em>FILETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FILETYPE</em>'.
     * @see Powrmart.FLATFILEType#getFILETYPE()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_FILETYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getKEEPESCAPECHAR <em>KEEPESCAPECHAR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>KEEPESCAPECHAR</em>'.
     * @see Powrmart.FLATFILEType#getKEEPESCAPECHAR()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_KEEPESCAPECHAR();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getLINESEQUENTIAL <em>LINESEQUENTIAL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>LINESEQUENTIAL</em>'.
     * @see Powrmart.FLATFILEType#getLINESEQUENTIAL()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_LINESEQUENTIAL();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getNULLCHARACTER <em>NULLCHARACTER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NULLCHARACTER</em>'.
     * @see Powrmart.FLATFILEType#getNULLCHARACTER()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_NULLCHARACTER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getNULLCHARTYPE <em>NULLCHARTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NULLCHARTYPE</em>'.
     * @see Powrmart.FLATFILEType#getNULLCHARTYPE()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_NULLCHARTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getPADBYTES <em>PADBYTES</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PADBYTES</em>'.
     * @see Powrmart.FLATFILEType#getPADBYTES()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_PADBYTES();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getQUOTECHARACTER <em>QUOTECHARACTER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>QUOTECHARACTER</em>'.
     * @see Powrmart.FLATFILEType#getQUOTECHARACTER()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_QUOTECHARACTER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getREPEATABLE <em>REPEATABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REPEATABLE</em>'.
     * @see Powrmart.FLATFILEType#getREPEATABLE()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_REPEATABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getROWDELIMITER <em>ROWDELIMITER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ROWDELIMITER</em>'.
     * @see Powrmart.FLATFILEType#getROWDELIMITER()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_ROWDELIMITER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getSHIFTSENSITIVEDATA <em>SHIFTSENSITIVEDATA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SHIFTSENSITIVEDATA</em>'.
     * @see Powrmart.FLATFILEType#getSHIFTSENSITIVEDATA()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_SHIFTSENSITIVEDATA();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getSKIPLEADINGBYTES <em>SKIPLEADINGBYTES</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SKIPLEADINGBYTES</em>'.
     * @see Powrmart.FLATFILEType#getSKIPLEADINGBYTES()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_SKIPLEADINGBYTES();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getSKIPROWS <em>SKIPROWS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SKIPROWS</em>'.
     * @see Powrmart.FLATFILEType#getSKIPROWS()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_SKIPROWS();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getSKIPTRAILINGBYTES <em>SKIPTRAILINGBYTES</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SKIPTRAILINGBYTES</em>'.
     * @see Powrmart.FLATFILEType#getSKIPTRAILINGBYTES()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_SKIPTRAILINGBYTES();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getSTAGEFILEPERSIST <em>STAGEFILEPERSIST</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>STAGEFILEPERSIST</em>'.
     * @see Powrmart.FLATFILEType#getSTAGEFILEPERSIST()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_STAGEFILEPERSIST();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getSTAGEFILEREINIT <em>STAGEFILEREINIT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>STAGEFILEREINIT</em>'.
     * @see Powrmart.FLATFILEType#getSTAGEFILEREINIT()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_STAGEFILEREINIT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FLATFILEType#getSTRIPTRAILINGBLANKS <em>STRIPTRAILINGBLANKS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>STRIPTRAILINGBLANKS</em>'.
     * @see Powrmart.FLATFILEType#getSTRIPTRAILINGBLANKS()
     * @see #getFLATFILEType()
     * @generated
     */
    EAttribute getFLATFILEType_STRIPTRAILINGBLANKS();

    /**
     * Returns the meta object for class '{@link Powrmart.FOLDERType <em>FOLDER Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>FOLDER Type</em>'.
     * @see Powrmart.FOLDERType
     * @generated
     */
    EClass getFOLDERType();

    /**
     * Returns the meta object for the attribute list '{@link Powrmart.FOLDERType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see Powrmart.FOLDERType#getGroup()
     * @see #getFOLDERType()
     * @generated
     */
    EAttribute getFOLDERType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getFOLDERVERSION <em>FOLDERVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>FOLDERVERSION</em>'.
     * @see Powrmart.FOLDERType#getFOLDERVERSION()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_FOLDERVERSION();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getCONFIG <em>CONFIG</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>CONFIG</em>'.
     * @see Powrmart.FOLDERType#getCONFIG()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_CONFIG();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getSCHEDULER <em>SCHEDULER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SCHEDULER</em>'.
     * @see Powrmart.FOLDERType#getSCHEDULER()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_SCHEDULER();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getTASK <em>TASK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TASK</em>'.
     * @see Powrmart.FOLDERType#getTASK()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_TASK();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getSESSION <em>SESSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SESSION</em>'.
     * @see Powrmart.FOLDERType#getSESSION()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_SESSION();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getWORKLET <em>WORKLET</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>WORKLET</em>'.
     * @see Powrmart.FOLDERType#getWORKLET()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_WORKLET();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getWORKFLOW <em>WORKFLOW</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>WORKFLOW</em>'.
     * @see Powrmart.FOLDERType#getWORKFLOW()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_WORKFLOW();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getSOURCE <em>SOURCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SOURCE</em>'.
     * @see Powrmart.FOLDERType#getSOURCE()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_SOURCE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getTARGET <em>TARGET</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TARGET</em>'.
     * @see Powrmart.FOLDERType#getTARGET()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_TARGET();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getTRANSFORMATION <em>TRANSFORMATION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TRANSFORMATION</em>'.
     * @see Powrmart.FOLDERType#getTRANSFORMATION()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_TRANSFORMATION();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getMAPPLET <em>MAPPLET</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>MAPPLET</em>'.
     * @see Powrmart.FOLDERType#getMAPPLET()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_MAPPLET();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getMAPPING <em>MAPPING</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>MAPPING</em>'.
     * @see Powrmart.FOLDERType#getMAPPING()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_MAPPING();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getSHORTCUT <em>SHORTCUT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SHORTCUT</em>'.
     * @see Powrmart.FOLDERType#getSHORTCUT()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_SHORTCUT();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERType#getEXPRMACRO <em>EXPRMACRO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>EXPRMACRO</em>'.
     * @see Powrmart.FOLDERType#getEXPRMACRO()
     * @see #getFOLDERType()
     * @generated
     */
    EReference getFOLDERType_EXPRMACRO();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FOLDERType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.FOLDERType#getDESCRIPTION()
     * @see #getFOLDERType()
     * @generated
     */
    EAttribute getFOLDERType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FOLDERType#getGROUP1 <em>GROUP1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>GROUP1</em>'.
     * @see Powrmart.FOLDERType#getGROUP1()
     * @see #getFOLDERType()
     * @generated
     */
    EAttribute getFOLDERType_GROUP1();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FOLDERType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.FOLDERType#getNAME()
     * @see #getFOLDERType()
     * @generated
     */
    EAttribute getFOLDERType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FOLDERType#getOWNER <em>OWNER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OWNER</em>'.
     * @see Powrmart.FOLDERType#getOWNER()
     * @see #getFOLDERType()
     * @generated
     */
    EAttribute getFOLDERType_OWNER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FOLDERType#getPERMISSIONS <em>PERMISSIONS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PERMISSIONS</em>'.
     * @see Powrmart.FOLDERType#getPERMISSIONS()
     * @see #getFOLDERType()
     * @generated
     */
    EAttribute getFOLDERType_PERMISSIONS();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FOLDERType#getSHARED <em>SHARED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SHARED</em>'.
     * @see Powrmart.FOLDERType#getSHARED()
     * @see #getFOLDERType()
     * @generated
     */
    EAttribute getFOLDERType_SHARED();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FOLDERType#getUUID <em>UUID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>UUID</em>'.
     * @see Powrmart.FOLDERType#getUUID()
     * @see #getFOLDERType()
     * @generated
     */
    EAttribute getFOLDERType_UUID();

    /**
     * Returns the meta object for class '{@link Powrmart.FOLDERVERSIONType <em>FOLDERVERSION Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>FOLDERVERSION Type</em>'.
     * @see Powrmart.FOLDERVERSIONType
     * @generated
     */
    EClass getFOLDERVERSIONType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERVERSIONType#getSOURCE <em>SOURCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SOURCE</em>'.
     * @see Powrmart.FOLDERVERSIONType#getSOURCE()
     * @see #getFOLDERVERSIONType()
     * @generated
     */
    EReference getFOLDERVERSIONType_SOURCE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERVERSIONType#getTARGET <em>TARGET</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TARGET</em>'.
     * @see Powrmart.FOLDERVERSIONType#getTARGET()
     * @see #getFOLDERVERSIONType()
     * @generated
     */
    EReference getFOLDERVERSIONType_TARGET();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERVERSIONType#getTRANSFORMATION <em>TRANSFORMATION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TRANSFORMATION</em>'.
     * @see Powrmart.FOLDERVERSIONType#getTRANSFORMATION()
     * @see #getFOLDERVERSIONType()
     * @generated
     */
    EReference getFOLDERVERSIONType_TRANSFORMATION();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERVERSIONType#getMAPPLET <em>MAPPLET</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>MAPPLET</em>'.
     * @see Powrmart.FOLDERVERSIONType#getMAPPLET()
     * @see #getFOLDERVERSIONType()
     * @generated
     */
    EReference getFOLDERVERSIONType_MAPPLET();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERVERSIONType#getMAPPING <em>MAPPING</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>MAPPING</em>'.
     * @see Powrmart.FOLDERVERSIONType#getMAPPING()
     * @see #getFOLDERVERSIONType()
     * @generated
     */
    EReference getFOLDERVERSIONType_MAPPING();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.FOLDERVERSIONType#getSHORTCUT <em>SHORTCUT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SHORTCUT</em>'.
     * @see Powrmart.FOLDERVERSIONType#getSHORTCUT()
     * @see #getFOLDERVERSIONType()
     * @generated
     */
    EReference getFOLDERVERSIONType_SHORTCUT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FOLDERVERSIONType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.FOLDERVERSIONType#getDESCRIPTION()
     * @see #getFOLDERVERSIONType()
     * @generated
     */
    EAttribute getFOLDERVERSIONType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.FOLDERVERSIONType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.FOLDERVERSIONType#getNAME()
     * @see #getFOLDERVERSIONType()
     * @generated
     */
    EAttribute getFOLDERVERSIONType_NAME();

    /**
     * Returns the meta object for class '{@link Powrmart.GROUPType <em>GROUP Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>GROUP Type</em>'.
     * @see Powrmart.GROUPType
     * @generated
     */
    EClass getGROUPType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.GROUPType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.GROUPType#getDESCRIPTION()
     * @see #getGROUPType()
     * @generated
     */
    EAttribute getGROUPType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.GROUPType#getEXPRESSION <em>EXPRESSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>EXPRESSION</em>'.
     * @see Powrmart.GROUPType#getEXPRESSION()
     * @see #getGROUPType()
     * @generated
     */
    EAttribute getGROUPType_EXPRESSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.GROUPType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.GROUPType#getNAME()
     * @see #getGROUPType()
     * @generated
     */
    EAttribute getGROUPType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.GROUPType#getORDER <em>ORDER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ORDER</em>'.
     * @see Powrmart.GROUPType#getORDER()
     * @see #getGROUPType()
     * @generated
     */
    EAttribute getGROUPType_ORDER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.GROUPType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.GROUPType#getTYPE()
     * @see #getGROUPType()
     * @generated
     */
    EAttribute getGROUPType_TYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.HASHKEYType <em>HASHKEY Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>HASHKEY Type</em>'.
     * @see Powrmart.HASHKEYType
     * @generated
     */
    EClass getHASHKEYType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.HASHKEYType#getGROUP <em>GROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>GROUP</em>'.
     * @see Powrmart.HASHKEYType#getGROUP()
     * @see #getHASHKEYType()
     * @generated
     */
    EAttribute getHASHKEYType_GROUP();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.HASHKEYType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.HASHKEYType#getNAME()
     * @see #getHASHKEYType()
     * @generated
     */
    EAttribute getHASHKEYType_NAME();

    /**
     * Returns the meta object for class '{@link Powrmart.INITPROPType <em>INITPROP Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>INITPROP Type</em>'.
     * @see Powrmart.INITPROPType
     * @generated
     */
    EClass getINITPROPType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.INITPROPType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.INITPROPType#getDESCRIPTION()
     * @see #getINITPROPType()
     * @generated
     */
    EAttribute getINITPROPType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.INITPROPType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.INITPROPType#getNAME()
     * @see #getINITPROPType()
     * @generated
     */
    EAttribute getINITPROPType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.INITPROPType#getUSERDEFINED <em>USERDEFINED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>USERDEFINED</em>'.
     * @see Powrmart.INITPROPType#getUSERDEFINED()
     * @see #getINITPROPType()
     * @generated
     */
    EAttribute getINITPROPType_USERDEFINED();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.INITPROPType#getVALUE <em>VALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUE</em>'.
     * @see Powrmart.INITPROPType#getVALUE()
     * @see #getINITPROPType()
     * @generated
     */
    EAttribute getINITPROPType_VALUE();

    /**
     * Returns the meta object for class '{@link Powrmart.INSTANCEType <em>INSTANCE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>INSTANCE Type</em>'.
     * @see Powrmart.INSTANCEType
     * @generated
     */
    EClass getINSTANCEType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.INSTANCEType#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TABLEATTRIBUTE</em>'.
     * @see Powrmart.INSTANCEType#getTABLEATTRIBUTE()
     * @see #getINSTANCEType()
     * @generated
     */
    EReference getINSTANCEType_TABLEATTRIBUTE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.INSTANCEType#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>EXPRMACRODEPENDENCY</em>'.
     * @see Powrmart.INSTANCEType#getEXPRMACRODEPENDENCY()
     * @see #getINSTANCEType()
     * @generated
     */
    EReference getINSTANCEType_EXPRMACRODEPENDENCY();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.INSTANCEType#getINITPROP <em>INITPROP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>INITPROP</em>'.
     * @see Powrmart.INSTANCEType#getINITPROP()
     * @see #getINSTANCEType()
     * @generated
     */
    EReference getINSTANCEType_INITPROP();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.INSTANCEType#getASSOCIATEDSOURCEINSTANCE <em>ASSOCIATEDSOURCEINSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ASSOCIATEDSOURCEINSTANCE</em>'.
     * @see Powrmart.INSTANCEType#getASSOCIATEDSOURCEINSTANCE()
     * @see #getINSTANCEType()
     * @generated
     */
    EReference getINSTANCEType_ASSOCIATEDSOURCEINSTANCE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.INSTANCEType#getASSOCIATEDDSQ <em>ASSOCIATEDDSQ</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ASSOCIATEDDSQ</em>'.
     * @see Powrmart.INSTANCEType#getASSOCIATEDDSQ()
     * @see #getINSTANCEType()
     * @generated
     */
    EAttribute getINSTANCEType_ASSOCIATEDDSQ();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.INSTANCEType#getASSOCIATEDDSQTYPE <em>ASSOCIATEDDSQTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ASSOCIATEDDSQTYPE</em>'.
     * @see Powrmart.INSTANCEType#getASSOCIATEDDSQTYPE()
     * @see #getINSTANCEType()
     * @generated
     */
    EAttribute getINSTANCEType_ASSOCIATEDDSQTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.INSTANCEType#getDBDNAME <em>DBDNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DBDNAME</em>'.
     * @see Powrmart.INSTANCEType#getDBDNAME()
     * @see #getINSTANCEType()
     * @generated
     */
    EAttribute getINSTANCEType_DBDNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.INSTANCEType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.INSTANCEType#getDESCRIPTION()
     * @see #getINSTANCEType()
     * @generated
     */
    EAttribute getINSTANCEType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.INSTANCEType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.INSTANCEType#getNAME()
     * @see #getINSTANCEType()
     * @generated
     */
    EAttribute getINSTANCEType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.INSTANCEType#getREUSABLE <em>REUSABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REUSABLE</em>'.
     * @see Powrmart.INSTANCEType#getREUSABLE()
     * @see #getINSTANCEType()
     * @generated
     */
    EAttribute getINSTANCEType_REUSABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.INSTANCEType#getTRANSFORMATIONNAME <em>TRANSFORMATIONNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TRANSFORMATIONNAME</em>'.
     * @see Powrmart.INSTANCEType#getTRANSFORMATIONNAME()
     * @see #getINSTANCEType()
     * @generated
     */
    EAttribute getINSTANCEType_TRANSFORMATIONNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.INSTANCEType#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TRANSFORMATIONTYPE</em>'.
     * @see Powrmart.INSTANCEType#getTRANSFORMATIONTYPE()
     * @see #getINSTANCEType()
     * @generated
     */
    EAttribute getINSTANCEType_TRANSFORMATIONTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.INSTANCEType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.INSTANCEType#getTYPE()
     * @see #getINSTANCEType()
     * @generated
     */
    EAttribute getINSTANCEType_TYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.KEYRANGEType <em>KEYRANGE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KEYRANGE Type</em>'.
     * @see Powrmart.KEYRANGEType
     * @generated
     */
    EClass getKEYRANGEType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.KEYRANGEType#getENDRANGE <em>ENDRANGE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ENDRANGE</em>'.
     * @see Powrmart.KEYRANGEType#getENDRANGE()
     * @see #getKEYRANGEType()
     * @generated
     */
    EAttribute getKEYRANGEType_ENDRANGE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.KEYRANGEType#getGROUP <em>GROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>GROUP</em>'.
     * @see Powrmart.KEYRANGEType#getGROUP()
     * @see #getKEYRANGEType()
     * @generated
     */
    EAttribute getKEYRANGEType_GROUP();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.KEYRANGEType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.KEYRANGEType#getNAME()
     * @see #getKEYRANGEType()
     * @generated
     */
    EAttribute getKEYRANGEType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.KEYRANGEType#getSRCINSTANCENAME <em>SRCINSTANCENAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SRCINSTANCENAME</em>'.
     * @see Powrmart.KEYRANGEType#getSRCINSTANCENAME()
     * @see #getKEYRANGEType()
     * @generated
     */
    EAttribute getKEYRANGEType_SRCINSTANCENAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.KEYRANGEType#getSTARTRANGE <em>STARTRANGE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>STARTRANGE</em>'.
     * @see Powrmart.KEYRANGEType#getSTARTRANGE()
     * @see #getKEYRANGEType()
     * @generated
     */
    EAttribute getKEYRANGEType_STARTRANGE();

    /**
     * Returns the meta object for class '{@link Powrmart.KEYWORDType <em>KEYWORD Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KEYWORD Type</em>'.
     * @see Powrmart.KEYWORDType
     * @generated
     */
    EClass getKEYWORDType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.KEYWORDType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.KEYWORDType#getNAME()
     * @see #getKEYWORDType()
     * @generated
     */
    EAttribute getKEYWORDType_NAME();

    /**
     * Returns the meta object for class '{@link Powrmart.MACROARGUMENTType <em>MACROARGUMENT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>MACROARGUMENT Type</em>'.
     * @see Powrmart.MACROARGUMENTType
     * @generated
     */
    EClass getMACROARGUMENTType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MACROARGUMENTType#getARGORDER <em>ARGORDER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ARGORDER</em>'.
     * @see Powrmart.MACROARGUMENTType#getARGORDER()
     * @see #getMACROARGUMENTType()
     * @generated
     */
    EAttribute getMACROARGUMENTType_ARGORDER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MACROARGUMENTType#getDATATYPE <em>DATATYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATATYPE</em>'.
     * @see Powrmart.MACROARGUMENTType#getDATATYPE()
     * @see #getMACROARGUMENTType()
     * @generated
     */
    EAttribute getMACROARGUMENTType_DATATYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MACROARGUMENTType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.MACROARGUMENTType#getNAME()
     * @see #getMACROARGUMENTType()
     * @generated
     */
    EAttribute getMACROARGUMENTType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MACROARGUMENTType#getPRECISION <em>PRECISION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PRECISION</em>'.
     * @see Powrmart.MACROARGUMENTType#getPRECISION()
     * @see #getMACROARGUMENTType()
     * @generated
     */
    EAttribute getMACROARGUMENTType_PRECISION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MACROARGUMENTType#getSCALE <em>SCALE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SCALE</em>'.
     * @see Powrmart.MACROARGUMENTType#getSCALE()
     * @see #getMACROARGUMENTType()
     * @generated
     */
    EAttribute getMACROARGUMENTType_SCALE();

    /**
     * Returns the meta object for class '{@link Powrmart.MACRODEPENDENCYType <em>MACRODEPENDENCY Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>MACRODEPENDENCY Type</em>'.
     * @see Powrmart.MACRODEPENDENCYType
     * @generated
     */
    EClass getMACRODEPENDENCYType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MACRODEPENDENCYType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.MACRODEPENDENCYType#getNAME()
     * @see #getMACRODEPENDENCYType()
     * @generated
     */
    EAttribute getMACRODEPENDENCYType_NAME();

    /**
     * Returns the meta object for class '{@link Powrmart.MAPDEPENDENCYType <em>MAPDEPENDENCY Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>MAPDEPENDENCY Type</em>'.
     * @see Powrmart.MAPDEPENDENCYType
     * @generated
     */
    EClass getMAPDEPENDENCYType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPDEPENDENCYType#getFROMINSTANCE <em>FROMINSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FROMINSTANCE</em>'.
     * @see Powrmart.MAPDEPENDENCYType#getFROMINSTANCE()
     * @see #getMAPDEPENDENCYType()
     * @generated
     */
    EAttribute getMAPDEPENDENCYType_FROMINSTANCE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPDEPENDENCYType#getFROMINSTANCETYPE <em>FROMINSTANCETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FROMINSTANCETYPE</em>'.
     * @see Powrmart.MAPDEPENDENCYType#getFROMINSTANCETYPE()
     * @see #getMAPDEPENDENCYType()
     * @generated
     */
    EAttribute getMAPDEPENDENCYType_FROMINSTANCETYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPDEPENDENCYType#getTOINSTANCE <em>TOINSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TOINSTANCE</em>'.
     * @see Powrmart.MAPDEPENDENCYType#getTOINSTANCE()
     * @see #getMAPDEPENDENCYType()
     * @generated
     */
    EAttribute getMAPDEPENDENCYType_TOINSTANCE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPDEPENDENCYType#getTOINSTANCETYPE <em>TOINSTANCETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TOINSTANCETYPE</em>'.
     * @see Powrmart.MAPDEPENDENCYType#getTOINSTANCETYPE()
     * @see #getMAPDEPENDENCYType()
     * @generated
     */
    EAttribute getMAPDEPENDENCYType_TOINSTANCETYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.MAPPINGType <em>MAPPING Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>MAPPING Type</em>'.
     * @see Powrmart.MAPPINGType
     * @generated
     */
    EClass getMAPPINGType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPINGType#getTRANSFORMATION <em>TRANSFORMATION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TRANSFORMATION</em>'.
     * @see Powrmart.MAPPINGType#getTRANSFORMATION()
     * @see #getMAPPINGType()
     * @generated
     */
    EReference getMAPPINGType_TRANSFORMATION();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPINGType#getINSTANCE <em>INSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>INSTANCE</em>'.
     * @see Powrmart.MAPPINGType#getINSTANCE()
     * @see #getMAPPINGType()
     * @generated
     */
    EReference getMAPPINGType_INSTANCE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPINGType#getCONNECTOR <em>CONNECTOR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>CONNECTOR</em>'.
     * @see Powrmart.MAPPINGType#getCONNECTOR()
     * @see #getMAPPINGType()
     * @generated
     */
    EReference getMAPPINGType_CONNECTOR();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPINGType#getMAPDEPENDENCY <em>MAPDEPENDENCY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>MAPDEPENDENCY</em>'.
     * @see Powrmart.MAPPINGType#getMAPDEPENDENCY()
     * @see #getMAPPINGType()
     * @generated
     */
    EReference getMAPPINGType_MAPDEPENDENCY();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPINGType#getTARGETLOADORDER <em>TARGETLOADORDER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TARGETLOADORDER</em>'.
     * @see Powrmart.MAPPINGType#getTARGETLOADORDER()
     * @see #getMAPPINGType()
     * @generated
     */
    EReference getMAPPINGType_TARGETLOADORDER();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPINGType#getMAPPINGVARIABLE <em>MAPPINGVARIABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>MAPPINGVARIABLE</em>'.
     * @see Powrmart.MAPPINGType#getMAPPINGVARIABLE()
     * @see #getMAPPINGType()
     * @generated
     */
    EReference getMAPPINGType_MAPPINGVARIABLE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPINGType#getERPINFO <em>ERPINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ERPINFO</em>'.
     * @see Powrmart.MAPPINGType#getERPINFO()
     * @see #getMAPPINGType()
     * @generated
     */
    EReference getMAPPINGType_ERPINFO();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPINGType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>METADATAEXTENSION</em>'.
     * @see Powrmart.MAPPINGType#getMETADATAEXTENSION()
     * @see #getMAPPINGType()
     * @generated
     */
    EReference getMAPPINGType_METADATAEXTENSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGType#getCRCVALUE <em>CRCVALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CRCVALUE</em>'.
     * @see Powrmart.MAPPINGType#getCRCVALUE()
     * @see #getMAPPINGType()
     * @generated
     */
    EAttribute getMAPPINGType_CRCVALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.MAPPINGType#getDESCRIPTION()
     * @see #getMAPPINGType()
     * @generated
     */
    EAttribute getMAPPINGType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGType#getISPROFILEMAPPING <em>ISPROFILEMAPPING</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISPROFILEMAPPING</em>'.
     * @see Powrmart.MAPPINGType#getISPROFILEMAPPING()
     * @see #getMAPPINGType()
     * @generated
     */
    EAttribute getMAPPINGType_ISPROFILEMAPPING();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGType#getISVALID <em>ISVALID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISVALID</em>'.
     * @see Powrmart.MAPPINGType#getISVALID()
     * @see #getMAPPINGType()
     * @generated
     */
    EAttribute getMAPPINGType_ISVALID();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.MAPPINGType#getNAME()
     * @see #getMAPPINGType()
     * @generated
     */
    EAttribute getMAPPINGType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGType#getOBJECTVERSION <em>OBJECTVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OBJECTVERSION</em>'.
     * @see Powrmart.MAPPINGType#getOBJECTVERSION()
     * @see #getMAPPINGType()
     * @generated
     */
    EAttribute getMAPPINGType_OBJECTVERSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSIONNUMBER</em>'.
     * @see Powrmart.MAPPINGType#getVERSIONNUMBER()
     * @see #getMAPPINGType()
     * @generated
     */
    EAttribute getMAPPINGType_VERSIONNUMBER();

    /**
     * Returns the meta object for class '{@link Powrmart.MAPPINGVARIABLEType <em>MAPPINGVARIABLE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>MAPPINGVARIABLE Type</em>'.
     * @see Powrmart.MAPPINGVARIABLEType
     * @generated
     */
    EClass getMAPPINGVARIABLEType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGVARIABLEType#getAGGFUNCTION <em>AGGFUNCTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>AGGFUNCTION</em>'.
     * @see Powrmart.MAPPINGVARIABLEType#getAGGFUNCTION()
     * @see #getMAPPINGVARIABLEType()
     * @generated
     */
    EAttribute getMAPPINGVARIABLEType_AGGFUNCTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGVARIABLEType#getDATATYPE <em>DATATYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATATYPE</em>'.
     * @see Powrmart.MAPPINGVARIABLEType#getDATATYPE()
     * @see #getMAPPINGVARIABLEType()
     * @generated
     */
    EAttribute getMAPPINGVARIABLEType_DATATYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGVARIABLEType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DEFAULTVALUE</em>'.
     * @see Powrmart.MAPPINGVARIABLEType#getDEFAULTVALUE()
     * @see #getMAPPINGVARIABLEType()
     * @generated
     */
    EAttribute getMAPPINGVARIABLEType_DEFAULTVALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGVARIABLEType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.MAPPINGVARIABLEType#getDESCRIPTION()
     * @see #getMAPPINGVARIABLEType()
     * @generated
     */
    EAttribute getMAPPINGVARIABLEType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGVARIABLEType#getISEXPRESSIONVARIABLE <em>ISEXPRESSIONVARIABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISEXPRESSIONVARIABLE</em>'.
     * @see Powrmart.MAPPINGVARIABLEType#getISEXPRESSIONVARIABLE()
     * @see #getMAPPINGVARIABLEType()
     * @generated
     */
    EAttribute getMAPPINGVARIABLEType_ISEXPRESSIONVARIABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGVARIABLEType#getISPARAM <em>ISPARAM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISPARAM</em>'.
     * @see Powrmart.MAPPINGVARIABLEType#getISPARAM()
     * @see #getMAPPINGVARIABLEType()
     * @generated
     */
    EAttribute getMAPPINGVARIABLEType_ISPARAM();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGVARIABLEType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.MAPPINGVARIABLEType#getNAME()
     * @see #getMAPPINGVARIABLEType()
     * @generated
     */
    EAttribute getMAPPINGVARIABLEType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGVARIABLEType#getPRECISION <em>PRECISION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PRECISION</em>'.
     * @see Powrmart.MAPPINGVARIABLEType#getPRECISION()
     * @see #getMAPPINGVARIABLEType()
     * @generated
     */
    EAttribute getMAPPINGVARIABLEType_PRECISION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGVARIABLEType#getSCALE <em>SCALE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SCALE</em>'.
     * @see Powrmart.MAPPINGVARIABLEType#getSCALE()
     * @see #getMAPPINGVARIABLEType()
     * @generated
     */
    EAttribute getMAPPINGVARIABLEType_SCALE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPINGVARIABLEType#getUSERDEFINED <em>USERDEFINED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>USERDEFINED</em>'.
     * @see Powrmart.MAPPINGVARIABLEType#getUSERDEFINED()
     * @see #getMAPPINGVARIABLEType()
     * @generated
     */
    EAttribute getMAPPINGVARIABLEType_USERDEFINED();

    /**
     * Returns the meta object for class '{@link Powrmart.MAPPLETType <em>MAPPLET Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>MAPPLET Type</em>'.
     * @see Powrmart.MAPPLETType
     * @generated
     */
    EClass getMAPPLETType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPLETType#getTRANSFORMATION <em>TRANSFORMATION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TRANSFORMATION</em>'.
     * @see Powrmart.MAPPLETType#getTRANSFORMATION()
     * @see #getMAPPLETType()
     * @generated
     */
    EReference getMAPPLETType_TRANSFORMATION();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPLETType#getINSTANCE <em>INSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>INSTANCE</em>'.
     * @see Powrmart.MAPPLETType#getINSTANCE()
     * @see #getMAPPLETType()
     * @generated
     */
    EReference getMAPPLETType_INSTANCE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPLETType#getCONNECTOR <em>CONNECTOR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>CONNECTOR</em>'.
     * @see Powrmart.MAPPLETType#getCONNECTOR()
     * @see #getMAPPLETType()
     * @generated
     */
    EReference getMAPPLETType_CONNECTOR();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPLETType#getMAPPINGVARIABLE <em>MAPPINGVARIABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>MAPPINGVARIABLE</em>'.
     * @see Powrmart.MAPPLETType#getMAPPINGVARIABLE()
     * @see #getMAPPLETType()
     * @generated
     */
    EReference getMAPPLETType_MAPPINGVARIABLE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPLETType#getERPINFO <em>ERPINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ERPINFO</em>'.
     * @see Powrmart.MAPPLETType#getERPINFO()
     * @see #getMAPPLETType()
     * @generated
     */
    EReference getMAPPLETType_ERPINFO();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.MAPPLETType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>METADATAEXTENSION</em>'.
     * @see Powrmart.MAPPLETType#getMETADATAEXTENSION()
     * @see #getMAPPLETType()
     * @generated
     */
    EReference getMAPPLETType_METADATAEXTENSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPLETType#getCRCVALUE <em>CRCVALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CRCVALUE</em>'.
     * @see Powrmart.MAPPLETType#getCRCVALUE()
     * @see #getMAPPLETType()
     * @generated
     */
    EAttribute getMAPPLETType_CRCVALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPLETType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.MAPPLETType#getDESCRIPTION()
     * @see #getMAPPLETType()
     * @generated
     */
    EAttribute getMAPPLETType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPLETType#getISVALID <em>ISVALID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISVALID</em>'.
     * @see Powrmart.MAPPLETType#getISVALID()
     * @see #getMAPPLETType()
     * @generated
     */
    EAttribute getMAPPLETType_ISVALID();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPLETType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.MAPPLETType#getNAME()
     * @see #getMAPPLETType()
     * @generated
     */
    EAttribute getMAPPLETType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPLETType#getOBJECTVERSION <em>OBJECTVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OBJECTVERSION</em>'.
     * @see Powrmart.MAPPLETType#getOBJECTVERSION()
     * @see #getMAPPLETType()
     * @generated
     */
    EAttribute getMAPPLETType_OBJECTVERSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.MAPPLETType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSIONNUMBER</em>'.
     * @see Powrmart.MAPPLETType#getVERSIONNUMBER()
     * @see #getMAPPLETType()
     * @generated
     */
    EAttribute getMAPPLETType_VERSIONNUMBER();

    /**
     * Returns the meta object for class '{@link Powrmart.METADATAEXTENSIONType <em>METADATAEXTENSION Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>METADATAEXTENSION Type</em>'.
     * @see Powrmart.METADATAEXTENSIONType
     * @generated
     */
    EClass getMETADATAEXTENSIONType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.METADATAEXTENSIONType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>COMPONENTVERSION</em>'.
     * @see Powrmart.METADATAEXTENSIONType#getCOMPONENTVERSION()
     * @see #getMETADATAEXTENSIONType()
     * @generated
     */
    EAttribute getMETADATAEXTENSIONType_COMPONENTVERSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.METADATAEXTENSIONType#getDATATYPE <em>DATATYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATATYPE</em>'.
     * @see Powrmart.METADATAEXTENSIONType#getDATATYPE()
     * @see #getMETADATAEXTENSIONType()
     * @generated
     */
    EAttribute getMETADATAEXTENSIONType_DATATYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.METADATAEXTENSIONType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.METADATAEXTENSIONType#getDESCRIPTION()
     * @see #getMETADATAEXTENSIONType()
     * @generated
     */
    EAttribute getMETADATAEXTENSIONType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.METADATAEXTENSIONType#getDOMAINNAME <em>DOMAINNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DOMAINNAME</em>'.
     * @see Powrmart.METADATAEXTENSIONType#getDOMAINNAME()
     * @see #getMETADATAEXTENSIONType()
     * @generated
     */
    EAttribute getMETADATAEXTENSIONType_DOMAINNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.METADATAEXTENSIONType#getISCLIENTEDITABLE <em>ISCLIENTEDITABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISCLIENTEDITABLE</em>'.
     * @see Powrmart.METADATAEXTENSIONType#getISCLIENTEDITABLE()
     * @see #getMETADATAEXTENSIONType()
     * @generated
     */
    EAttribute getMETADATAEXTENSIONType_ISCLIENTEDITABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.METADATAEXTENSIONType#getISCLIENTVISIBLE <em>ISCLIENTVISIBLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISCLIENTVISIBLE</em>'.
     * @see Powrmart.METADATAEXTENSIONType#getISCLIENTVISIBLE()
     * @see #getMETADATAEXTENSIONType()
     * @generated
     */
    EAttribute getMETADATAEXTENSIONType_ISCLIENTVISIBLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.METADATAEXTENSIONType#getISREUSABLE <em>ISREUSABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISREUSABLE</em>'.
     * @see Powrmart.METADATAEXTENSIONType#getISREUSABLE()
     * @see #getMETADATAEXTENSIONType()
     * @generated
     */
    EAttribute getMETADATAEXTENSIONType_ISREUSABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.METADATAEXTENSIONType#getISSHAREREAD <em>ISSHAREREAD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISSHAREREAD</em>'.
     * @see Powrmart.METADATAEXTENSIONType#getISSHAREREAD()
     * @see #getMETADATAEXTENSIONType()
     * @generated
     */
    EAttribute getMETADATAEXTENSIONType_ISSHAREREAD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.METADATAEXTENSIONType#getISSHAREWRITE <em>ISSHAREWRITE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISSHAREWRITE</em>'.
     * @see Powrmart.METADATAEXTENSIONType#getISSHAREWRITE()
     * @see #getMETADATAEXTENSIONType()
     * @generated
     */
    EAttribute getMETADATAEXTENSIONType_ISSHAREWRITE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.METADATAEXTENSIONType#getMAXLENGTH <em>MAXLENGTH</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MAXLENGTH</em>'.
     * @see Powrmart.METADATAEXTENSIONType#getMAXLENGTH()
     * @see #getMETADATAEXTENSIONType()
     * @generated
     */
    EAttribute getMETADATAEXTENSIONType_MAXLENGTH();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.METADATAEXTENSIONType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.METADATAEXTENSIONType#getNAME()
     * @see #getMETADATAEXTENSIONType()
     * @generated
     */
    EAttribute getMETADATAEXTENSIONType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.METADATAEXTENSIONType#getVALUE <em>VALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUE</em>'.
     * @see Powrmart.METADATAEXTENSIONType#getVALUE()
     * @see #getMETADATAEXTENSIONType()
     * @generated
     */
    EAttribute getMETADATAEXTENSIONType_VALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.METADATAEXTENSIONType#getVENDORNAME <em>VENDORNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VENDORNAME</em>'.
     * @see Powrmart.METADATAEXTENSIONType#getVENDORNAME()
     * @see #getMETADATAEXTENSIONType()
     * @generated
     */
    EAttribute getMETADATAEXTENSIONType_VENDORNAME();

    /**
     * Returns the meta object for class '{@link Powrmart.PARTITIONType <em>PARTITION Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>PARTITION Type</em>'.
     * @see Powrmart.PARTITIONType
     * @generated
     */
    EClass getPARTITIONType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.PARTITIONType#getKEYRANGE <em>KEYRANGE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>KEYRANGE</em>'.
     * @see Powrmart.PARTITIONType#getKEYRANGE()
     * @see #getPARTITIONType()
     * @generated
     */
    EReference getPARTITIONType_KEYRANGE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.PARTITIONType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.PARTITIONType#getDESCRIPTION()
     * @see #getPARTITIONType()
     * @generated
     */
    EAttribute getPARTITIONType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.PARTITIONType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.PARTITIONType#getNAME()
     * @see #getPARTITIONType()
     * @generated
     */
    EAttribute getPARTITIONType_NAME();

    /**
     * Returns the meta object for class '{@link Powrmart.POWERMARTType <em>POWERMART Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>POWERMART Type</em>'.
     * @see Powrmart.POWERMARTType
     * @generated
     */
    EClass getPOWERMARTType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.POWERMARTType#getREPOSITORY <em>REPOSITORY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>REPOSITORY</em>'.
     * @see Powrmart.POWERMARTType#getREPOSITORY()
     * @see #getPOWERMARTType()
     * @generated
     */
    EReference getPOWERMARTType_REPOSITORY();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.POWERMARTType#getCREATIONDATE <em>CREATIONDATE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CREATIONDATE</em>'.
     * @see Powrmart.POWERMARTType#getCREATIONDATE()
     * @see #getPOWERMARTType()
     * @generated
     */
    EAttribute getPOWERMARTType_CREATIONDATE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.POWERMARTType#getREPOSITORYVERSION <em>REPOSITORYVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REPOSITORYVERSION</em>'.
     * @see Powrmart.POWERMARTType#getREPOSITORYVERSION()
     * @see #getPOWERMARTType()
     * @generated
     */
    EAttribute getPOWERMARTType_REPOSITORYVERSION();

    /**
     * Returns the meta object for class '{@link Powrmart.RECURRINGType <em>RECURRING Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>RECURRING Type</em>'.
     * @see Powrmart.RECURRINGType
     * @generated
     */
    EClass getRECURRINGType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.RECURRINGType#getDAYS <em>DAYS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DAYS</em>'.
     * @see Powrmart.RECURRINGType#getDAYS()
     * @see #getRECURRINGType()
     * @generated
     */
    EAttribute getRECURRINGType_DAYS();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.RECURRINGType#getHOURS <em>HOURS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>HOURS</em>'.
     * @see Powrmart.RECURRINGType#getHOURS()
     * @see #getRECURRINGType()
     * @generated
     */
    EAttribute getRECURRINGType_HOURS();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.RECURRINGType#getMINUTES <em>MINUTES</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MINUTES</em>'.
     * @see Powrmart.RECURRINGType#getMINUTES()
     * @see #getRECURRINGType()
     * @generated
     */
    EAttribute getRECURRINGType_MINUTES();

    /**
     * Returns the meta object for class '{@link Powrmart.REPEATType <em>REPEAT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>REPEAT Type</em>'.
     * @see Powrmart.REPEATType
     * @generated
     */
    EClass getREPEATType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.REPEATType#getFILTER <em>FILTER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>FILTER</em>'.
     * @see Powrmart.REPEATType#getFILTER()
     * @see #getREPEATType()
     * @generated
     */
    EReference getREPEATType_FILTER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.REPEATType#getINTERVAL <em>INTERVAL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>INTERVAL</em>'.
     * @see Powrmart.REPEATType#getINTERVAL()
     * @see #getREPEATType()
     * @generated
     */
    EAttribute getREPEATType_INTERVAL();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.REPEATType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.REPEATType#getTYPE()
     * @see #getREPEATType()
     * @generated
     */
    EAttribute getREPEATType_TYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.REPOSITORYType <em>REPOSITORY Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>REPOSITORY Type</em>'.
     * @see Powrmart.REPOSITORYType
     * @generated
     */
    EClass getREPOSITORYType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.REPOSITORYType#getFOLDER <em>FOLDER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>FOLDER</em>'.
     * @see Powrmart.REPOSITORYType#getFOLDER()
     * @see #getREPOSITORYType()
     * @generated
     */
    EReference getREPOSITORYType_FOLDER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.REPOSITORYType#getCODEPAGE <em>CODEPAGE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CODEPAGE</em>'.
     * @see Powrmart.REPOSITORYType#getCODEPAGE()
     * @see #getREPOSITORYType()
     * @generated
     */
    EAttribute getREPOSITORYType_CODEPAGE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.REPOSITORYType#getDATABASETYPE <em>DATABASETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATABASETYPE</em>'.
     * @see Powrmart.REPOSITORYType#getDATABASETYPE()
     * @see #getREPOSITORYType()
     * @generated
     */
    EAttribute getREPOSITORYType_DATABASETYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.REPOSITORYType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.REPOSITORYType#getNAME()
     * @see #getREPOSITORYType()
     * @generated
     */
    EAttribute getREPOSITORYType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.REPOSITORYType#getPARENTREPOSITORY <em>PARENTREPOSITORY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARENTREPOSITORY</em>'.
     * @see Powrmart.REPOSITORYType#getPARENTREPOSITORY()
     * @see #getREPOSITORYType()
     * @generated
     */
    EAttribute getREPOSITORYType_PARENTREPOSITORY();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.REPOSITORYType#getVERSION <em>VERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSION</em>'.
     * @see Powrmart.REPOSITORYType#getVERSION()
     * @see #getREPOSITORYType()
     * @generated
     */
    EAttribute getREPOSITORYType_VERSION();

    /**
     * Returns the meta object for class '{@link Powrmart.RESOURCEREFERENCEType <em>RESOURCEREFERENCE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>RESOURCEREFERENCE Type</em>'.
     * @see Powrmart.RESOURCEREFERENCEType
     * @generated
     */
    EClass getRESOURCEREFERENCEType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.RESOURCEREFERENCEType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.RESOURCEREFERENCEType#getNAME()
     * @see #getRESOURCEREFERENCEType()
     * @generated
     */
    EAttribute getRESOURCEREFERENCEType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.RESOURCEREFERENCEType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.RESOURCEREFERENCEType#getTYPE()
     * @see #getRESOURCEREFERENCEType()
     * @generated
     */
    EAttribute getRESOURCEREFERENCEType_TYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPCODEBLOCKType <em>SAPCODEBLOCK Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPCODEBLOCK Type</em>'.
     * @see Powrmart.SAPCODEBLOCKType
     * @generated
     */
    EClass getSAPCODEBLOCKType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPCODEBLOCKType#getCODEBLOCK <em>CODEBLOCK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CODEBLOCK</em>'.
     * @see Powrmart.SAPCODEBLOCKType#getCODEBLOCK()
     * @see #getSAPCODEBLOCKType()
     * @generated
     */
    EAttribute getSAPCODEBLOCKType_CODEBLOCK();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPCODEBLOCKType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.SAPCODEBLOCKType#getDESCRIPTION()
     * @see #getSAPCODEBLOCKType()
     * @generated
     */
    EAttribute getSAPCODEBLOCKType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPCODEBLOCKType#getDSQINSTNAME <em>DSQINSTNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DSQINSTNAME</em>'.
     * @see Powrmart.SAPCODEBLOCKType#getDSQINSTNAME()
     * @see #getSAPCODEBLOCKType()
     * @generated
     */
    EAttribute getSAPCODEBLOCKType_DSQINSTNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPCODEBLOCKType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SAPCODEBLOCKType#getNAME()
     * @see #getSAPCODEBLOCKType()
     * @generated
     */
    EAttribute getSAPCODEBLOCKType_NAME();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPFUNCINSTANCEPARAMFLDType <em>SAPFUNCINSTANCEPARAMFLD Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPFUNCINSTANCEPARAMFLD Type</em>'.
     * @see Powrmart.SAPFUNCINSTANCEPARAMFLDType
     * @generated
     */
    EClass getSAPFUNCINSTANCEPARAMFLDType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCINSTANCEPARAMFLDType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SAPFUNCINSTANCEPARAMFLDType#getNAME()
     * @see #getSAPFUNCINSTANCEPARAMFLDType()
     * @generated
     */
    EAttribute getSAPFUNCINSTANCEPARAMFLDType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCINSTANCEPARAMFLDType#getVALUE <em>VALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUE</em>'.
     * @see Powrmart.SAPFUNCINSTANCEPARAMFLDType#getVALUE()
     * @see #getSAPFUNCINSTANCEPARAMFLDType()
     * @generated
     */
    EAttribute getSAPFUNCINSTANCEPARAMFLDType_VALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCINSTANCEPARAMFLDType#getVALUETYPE <em>VALUETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUETYPE</em>'.
     * @see Powrmart.SAPFUNCINSTANCEPARAMFLDType#getVALUETYPE()
     * @see #getSAPFUNCINSTANCEPARAMFLDType()
     * @generated
     */
    EAttribute getSAPFUNCINSTANCEPARAMFLDType_VALUETYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPFUNCINSTANCEPARAMType <em>SAPFUNCINSTANCEPARAM Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPFUNCINSTANCEPARAM Type</em>'.
     * @see Powrmart.SAPFUNCINSTANCEPARAMType
     * @generated
     */
    EClass getSAPFUNCINSTANCEPARAMType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SAPFUNCINSTANCEPARAMType#getSAPFUNCINSTANCEPARAMFLD <em>SAPFUNCINSTANCEPARAMFLD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SAPFUNCINSTANCEPARAMFLD</em>'.
     * @see Powrmart.SAPFUNCINSTANCEPARAMType#getSAPFUNCINSTANCEPARAMFLD()
     * @see #getSAPFUNCINSTANCEPARAMType()
     * @generated
     */
    EReference getSAPFUNCINSTANCEPARAMType_SAPFUNCINSTANCEPARAMFLD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCINSTANCEPARAMType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SAPFUNCINSTANCEPARAMType#getNAME()
     * @see #getSAPFUNCINSTANCEPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCINSTANCEPARAMType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCINSTANCEPARAMType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.SAPFUNCINSTANCEPARAMType#getTYPE()
     * @see #getSAPFUNCINSTANCEPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCINSTANCEPARAMType_TYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCINSTANCEPARAMType#getVALUE <em>VALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUE</em>'.
     * @see Powrmart.SAPFUNCINSTANCEPARAMType#getVALUE()
     * @see #getSAPFUNCINSTANCEPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCINSTANCEPARAMType_VALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCINSTANCEPARAMType#getVALUETYPE <em>VALUETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUETYPE</em>'.
     * @see Powrmart.SAPFUNCINSTANCEPARAMType#getVALUETYPE()
     * @see #getSAPFUNCINSTANCEPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCINSTANCEPARAMType_VALUETYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPFUNCPARAMType <em>SAPFUNCPARAM Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPFUNCPARAM Type</em>'.
     * @see Powrmart.SAPFUNCPARAMType
     * @generated
     */
    EClass getSAPFUNCPARAMType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCPARAMType#getDATATYPE <em>DATATYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATATYPE</em>'.
     * @see Powrmart.SAPFUNCPARAMType#getDATATYPE()
     * @see #getSAPFUNCPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCPARAMType_DATATYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCPARAMType#getDEF <em>DEF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DEF</em>'.
     * @see Powrmart.SAPFUNCPARAMType#getDEF()
     * @see #getSAPFUNCPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCPARAMType_DEF();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCPARAMType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DEFAULTVALUE</em>'.
     * @see Powrmart.SAPFUNCPARAMType#getDEFAULTVALUE()
     * @see #getSAPFUNCPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCPARAMType_DEFAULTVALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCPARAMType#getISOPTIONAL <em>ISOPTIONAL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISOPTIONAL</em>'.
     * @see Powrmart.SAPFUNCPARAMType#getISOPTIONAL()
     * @see #getSAPFUNCPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCPARAMType_ISOPTIONAL();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCPARAMType#getISREFERENCE <em>ISREFERENCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISREFERENCE</em>'.
     * @see Powrmart.SAPFUNCPARAMType#getISREFERENCE()
     * @see #getSAPFUNCPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCPARAMType_ISREFERENCE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCPARAMType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SAPFUNCPARAMType#getNAME()
     * @see #getSAPFUNCPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCPARAMType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCPARAMType#getORDER <em>ORDER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ORDER</em>'.
     * @see Powrmart.SAPFUNCPARAMType#getORDER()
     * @see #getSAPFUNCPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCPARAMType_ORDER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCPARAMType#getPRECISION <em>PRECISION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PRECISION</em>'.
     * @see Powrmart.SAPFUNCPARAMType#getPRECISION()
     * @see #getSAPFUNCPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCPARAMType_PRECISION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCPARAMType#getSCALE <em>SCALE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SCALE</em>'.
     * @see Powrmart.SAPFUNCPARAMType#getSCALE()
     * @see #getSAPFUNCPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCPARAMType_SCALE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCPARAMType#getSUBTYPE <em>SUBTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SUBTYPE</em>'.
     * @see Powrmart.SAPFUNCPARAMType#getSUBTYPE()
     * @see #getSAPFUNCPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCPARAMType_SUBTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCPARAMType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.SAPFUNCPARAMType#getTYPE()
     * @see #getSAPFUNCPARAMType()
     * @generated
     */
    EAttribute getSAPFUNCPARAMType_TYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPFUNCTIONINSTANCEType <em>SAPFUNCTIONINSTANCE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPFUNCTIONINSTANCE Type</em>'.
     * @see Powrmart.SAPFUNCTIONINSTANCEType
     * @generated
     */
    EClass getSAPFUNCTIONINSTANCEType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SAPFUNCTIONINSTANCEType#getSAPFUNCINSTANCEPARAM <em>SAPFUNCINSTANCEPARAM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SAPFUNCINSTANCEPARAM</em>'.
     * @see Powrmart.SAPFUNCTIONINSTANCEType#getSAPFUNCINSTANCEPARAM()
     * @see #getSAPFUNCTIONINSTANCEType()
     * @generated
     */
    EReference getSAPFUNCTIONINSTANCEType_SAPFUNCINSTANCEPARAM();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SAPFUNCTIONINSTANCEType#getSAPTABLEINSTANCEPARAM <em>SAPTABLEINSTANCEPARAM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SAPTABLEINSTANCEPARAM</em>'.
     * @see Powrmart.SAPFUNCTIONINSTANCEType#getSAPTABLEINSTANCEPARAM()
     * @see #getSAPFUNCTIONINSTANCEType()
     * @generated
     */
    EReference getSAPFUNCTIONINSTANCEType_SAPTABLEINSTANCEPARAM();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCTIONINSTANCEType#getDSQINSTNAME <em>DSQINSTNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DSQINSTNAME</em>'.
     * @see Powrmart.SAPFUNCTIONINSTANCEType#getDSQINSTNAME()
     * @see #getSAPFUNCTIONINSTANCEType()
     * @generated
     */
    EAttribute getSAPFUNCTIONINSTANCEType_DSQINSTNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCTIONINSTANCEType#getFUNCTIONNAME <em>FUNCTIONNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FUNCTIONNAME</em>'.
     * @see Powrmart.SAPFUNCTIONINSTANCEType#getFUNCTIONNAME()
     * @see #getSAPFUNCTIONINSTANCEType()
     * @generated
     */
    EAttribute getSAPFUNCTIONINSTANCEType_FUNCTIONNAME();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPFUNCTIONType <em>SAPFUNCTION Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPFUNCTION Type</em>'.
     * @see Powrmart.SAPFUNCTIONType
     * @generated
     */
    EClass getSAPFUNCTIONType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SAPFUNCTIONType#getSAPFUNCPARAM <em>SAPFUNCPARAM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SAPFUNCPARAM</em>'.
     * @see Powrmart.SAPFUNCTIONType#getSAPFUNCPARAM()
     * @see #getSAPFUNCTIONType()
     * @generated
     */
    EReference getSAPFUNCTIONType_SAPFUNCPARAM();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SAPFUNCTIONType#getSAPTABLEPARAM <em>SAPTABLEPARAM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SAPTABLEPARAM</em>'.
     * @see Powrmart.SAPFUNCTIONType#getSAPTABLEPARAM()
     * @see #getSAPFUNCTIONType()
     * @generated
     */
    EReference getSAPFUNCTIONType_SAPTABLEPARAM();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCTIONType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.SAPFUNCTIONType#getDESCRIPTION()
     * @see #getSAPFUNCTIONType()
     * @generated
     */
    EAttribute getSAPFUNCTIONType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPFUNCTIONType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SAPFUNCTIONType#getNAME()
     * @see #getSAPFUNCTIONType()
     * @generated
     */
    EAttribute getSAPFUNCTIONType_NAME();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPOUTPUTPORTType <em>SAPOUTPUTPORT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPOUTPUTPORT Type</em>'.
     * @see Powrmart.SAPOUTPUTPORTType
     * @generated
     */
    EClass getSAPOUTPUTPORTType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPOUTPUTPORTType#getDSQINSTNAME <em>DSQINSTNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DSQINSTNAME</em>'.
     * @see Powrmart.SAPOUTPUTPORTType#getDSQINSTNAME()
     * @see #getSAPOUTPUTPORTType()
     * @generated
     */
    EAttribute getSAPOUTPUTPORTType_DSQINSTNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPOUTPUTPORTType#getFIELDNAME <em>FIELDNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FIELDNAME</em>'.
     * @see Powrmart.SAPOUTPUTPORTType#getFIELDNAME()
     * @see #getSAPOUTPUTPORTType()
     * @generated
     */
    EAttribute getSAPOUTPUTPORTType_FIELDNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPOUTPUTPORTType#getPORTNAME <em>PORTNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PORTNAME</em>'.
     * @see Powrmart.SAPOUTPUTPORTType#getPORTNAME()
     * @see #getSAPOUTPUTPORTType()
     * @generated
     */
    EAttribute getSAPOUTPUTPORTType_PORTNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPOUTPUTPORTType#getVARNAME <em>VARNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VARNAME</em>'.
     * @see Powrmart.SAPOUTPUTPORTType#getVARNAME()
     * @see #getSAPOUTPUTPORTType()
     * @generated
     */
    EAttribute getSAPOUTPUTPORTType_VARNAME();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPPROGRAMFLOWOBJECTType <em>SAPPROGRAMFLOWOBJECT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPPROGRAMFLOWOBJECT Type</em>'.
     * @see Powrmart.SAPPROGRAMFLOWOBJECTType
     * @generated
     */
    EClass getSAPPROGRAMFLOWOBJECTType();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getSAPFUNCTIONINSTANCE <em>SAPFUNCTIONINSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPFUNCTIONINSTANCE</em>'.
     * @see Powrmart.SAPPROGRAMFLOWOBJECTType#getSAPFUNCTIONINSTANCE()
     * @see #getSAPPROGRAMFLOWOBJECTType()
     * @generated
     */
    EReference getSAPPROGRAMFLOWOBJECTType_SAPFUNCTIONINSTANCE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getSAPCODEBLOCK <em>SAPCODEBLOCK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SAPCODEBLOCK</em>'.
     * @see Powrmart.SAPPROGRAMFLOWOBJECTType#getSAPCODEBLOCK()
     * @see #getSAPPROGRAMFLOWOBJECTType()
     * @generated
     */
    EReference getSAPPROGRAMFLOWOBJECTType_SAPCODEBLOCK();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getDSQINSTNAME <em>DSQINSTNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DSQINSTNAME</em>'.
     * @see Powrmart.SAPPROGRAMFLOWOBJECTType#getDSQINSTNAME()
     * @see #getSAPPROGRAMFLOWOBJECTType()
     * @generated
     */
    EAttribute getSAPPROGRAMFLOWOBJECTType_DSQINSTNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getJOINBITMAP <em>JOINBITMAP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>JOINBITMAP</em>'.
     * @see Powrmart.SAPPROGRAMFLOWOBJECTType#getJOINBITMAP()
     * @see #getSAPPROGRAMFLOWOBJECTType()
     * @generated
     */
    EAttribute getSAPPROGRAMFLOWOBJECTType_JOINBITMAP();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getORDER <em>ORDER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ORDER</em>'.
     * @see Powrmart.SAPPROGRAMFLOWOBJECTType#getORDER()
     * @see #getSAPPROGRAMFLOWOBJECTType()
     * @generated
     */
    EAttribute getSAPPROGRAMFLOWOBJECTType_ORDER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getREFDBDNAME <em>REFDBDNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFDBDNAME</em>'.
     * @see Powrmart.SAPPROGRAMFLOWOBJECTType#getREFDBDNAME()
     * @see #getSAPPROGRAMFLOWOBJECTType()
     * @generated
     */
    EAttribute getSAPPROGRAMFLOWOBJECTType_REFDBDNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getREFSOURCENAME <em>REFSOURCENAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFSOURCENAME</em>'.
     * @see Powrmart.SAPPROGRAMFLOWOBJECTType#getREFSOURCENAME()
     * @see #getSAPPROGRAMFLOWOBJECTType()
     * @generated
     */
    EAttribute getSAPPROGRAMFLOWOBJECTType_REFSOURCENAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getREFSOURCEINSTNAME <em>REFSOURCEINSTNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFSOURCEINSTNAME</em>'.
     * @see Powrmart.SAPPROGRAMFLOWOBJECTType#getREFSOURCEINSTNAME()
     * @see #getSAPPROGRAMFLOWOBJECTType()
     * @generated
     */
    EAttribute getSAPPROGRAMFLOWOBJECTType_REFSOURCEINSTNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.SAPPROGRAMFLOWOBJECTType#getTYPE()
     * @see #getSAPPROGRAMFLOWOBJECTType()
     * @generated
     */
    EAttribute getSAPPROGRAMFLOWOBJECTType_TYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPPROGRAMType <em>SAPPROGRAM Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPPROGRAM Type</em>'.
     * @see Powrmart.SAPPROGRAMType
     * @generated
     */
    EClass getSAPPROGRAMType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMType#getCLIENTSPACE <em>CLIENTSPACE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CLIENTSPACE</em>'.
     * @see Powrmart.SAPPROGRAMType#getCLIENTSPACE()
     * @see #getSAPPROGRAMType()
     * @generated
     */
    EAttribute getSAPPROGRAMType_CLIENTSPACE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMType#getHOSTNAME <em>HOSTNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>HOSTNAME</em>'.
     * @see Powrmart.SAPPROGRAMType#getHOSTNAME()
     * @see #getSAPPROGRAMType()
     * @generated
     */
    EAttribute getSAPPROGRAMType_HOSTNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMType#getINSTALLTIME <em>INSTALLTIME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>INSTALLTIME</em>'.
     * @see Powrmart.SAPPROGRAMType#getINSTALLTIME()
     * @see #getSAPPROGRAMType()
     * @generated
     */
    EAttribute getSAPPROGRAMType_INSTALLTIME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMType#getISVALID <em>ISVALID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISVALID</em>'.
     * @see Powrmart.SAPPROGRAMType#getISVALID()
     * @see #getSAPPROGRAMType()
     * @generated
     */
    EAttribute getSAPPROGRAMType_ISVALID();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SAPPROGRAMType#getNAME()
     * @see #getSAPPROGRAMType()
     * @generated
     */
    EAttribute getSAPPROGRAMType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMType#getPROGRAMTYPE <em>PROGRAMTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PROGRAMTYPE</em>'.
     * @see Powrmart.SAPPROGRAMType#getPROGRAMTYPE()
     * @see #getSAPPROGRAMType()
     * @generated
     */
    EAttribute getSAPPROGRAMType_PROGRAMTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPPROGRAMType#getUSERNAME <em>USERNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>USERNAME</em>'.
     * @see Powrmart.SAPPROGRAMType#getUSERNAME()
     * @see #getSAPPROGRAMType()
     * @generated
     */
    EAttribute getSAPPROGRAMType_USERNAME();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPSTRUCTUREFIELDType <em>SAPSTRUCTUREFIELD Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPSTRUCTUREFIELD Type</em>'.
     * @see Powrmart.SAPSTRUCTUREFIELDType
     * @generated
     */
    EClass getSAPSTRUCTUREFIELDType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPSTRUCTUREFIELDType#getDATATYPE <em>DATATYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATATYPE</em>'.
     * @see Powrmart.SAPSTRUCTUREFIELDType#getDATATYPE()
     * @see #getSAPSTRUCTUREFIELDType()
     * @generated
     */
    EAttribute getSAPSTRUCTUREFIELDType_DATATYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPSTRUCTUREFIELDType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SAPSTRUCTUREFIELDType#getNAME()
     * @see #getSAPSTRUCTUREFIELDType()
     * @generated
     */
    EAttribute getSAPSTRUCTUREFIELDType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPSTRUCTUREFIELDType#getORDER <em>ORDER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ORDER</em>'.
     * @see Powrmart.SAPSTRUCTUREFIELDType#getORDER()
     * @see #getSAPSTRUCTUREFIELDType()
     * @generated
     */
    EAttribute getSAPSTRUCTUREFIELDType_ORDER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPSTRUCTUREFIELDType#getPRECISION <em>PRECISION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PRECISION</em>'.
     * @see Powrmart.SAPSTRUCTUREFIELDType#getPRECISION()
     * @see #getSAPSTRUCTUREFIELDType()
     * @generated
     */
    EAttribute getSAPSTRUCTUREFIELDType_PRECISION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPSTRUCTUREFIELDType#getSCALE <em>SCALE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SCALE</em>'.
     * @see Powrmart.SAPSTRUCTUREFIELDType#getSCALE()
     * @see #getSAPSTRUCTUREFIELDType()
     * @generated
     */
    EAttribute getSAPSTRUCTUREFIELDType_SCALE();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPSTRUCTUREType <em>SAPSTRUCTURE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPSTRUCTURE Type</em>'.
     * @see Powrmart.SAPSTRUCTUREType
     * @generated
     */
    EClass getSAPSTRUCTUREType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SAPSTRUCTUREType#getSAPSTRUCTUREFIELD <em>SAPSTRUCTUREFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SAPSTRUCTUREFIELD</em>'.
     * @see Powrmart.SAPSTRUCTUREType#getSAPSTRUCTUREFIELD()
     * @see #getSAPSTRUCTUREType()
     * @generated
     */
    EReference getSAPSTRUCTUREType_SAPSTRUCTUREFIELD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPSTRUCTUREType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SAPSTRUCTUREType#getNAME()
     * @see #getSAPSTRUCTUREType()
     * @generated
     */
    EAttribute getSAPSTRUCTUREType_NAME();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPTABLEINSTANCEPARAMType <em>SAPTABLEINSTANCEPARAM Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPTABLEINSTANCEPARAM Type</em>'.
     * @see Powrmart.SAPTABLEINSTANCEPARAMType
     * @generated
     */
    EClass getSAPTABLEINSTANCEPARAMType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SAPTABLEINSTANCEPARAMType#getSAPFUNCINSTANCEPARAMFLD <em>SAPFUNCINSTANCEPARAMFLD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SAPFUNCINSTANCEPARAMFLD</em>'.
     * @see Powrmart.SAPTABLEINSTANCEPARAMType#getSAPFUNCINSTANCEPARAMFLD()
     * @see #getSAPTABLEINSTANCEPARAMType()
     * @generated
     */
    EReference getSAPTABLEINSTANCEPARAMType_SAPFUNCINSTANCEPARAMFLD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPTABLEINSTANCEPARAMType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SAPTABLEINSTANCEPARAMType#getNAME()
     * @see #getSAPTABLEINSTANCEPARAMType()
     * @generated
     */
    EAttribute getSAPTABLEINSTANCEPARAMType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPTABLEINSTANCEPARAMType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.SAPTABLEINSTANCEPARAMType#getTYPE()
     * @see #getSAPTABLEINSTANCEPARAMType()
     * @generated
     */
    EAttribute getSAPTABLEINSTANCEPARAMType_TYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPTABLEINSTANCEPARAMType#getVALUE <em>VALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUE</em>'.
     * @see Powrmart.SAPTABLEINSTANCEPARAMType#getVALUE()
     * @see #getSAPTABLEINSTANCEPARAMType()
     * @generated
     */
    EAttribute getSAPTABLEINSTANCEPARAMType_VALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPTABLEINSTANCEPARAMType#getVALUETYPE <em>VALUETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUETYPE</em>'.
     * @see Powrmart.SAPTABLEINSTANCEPARAMType#getVALUETYPE()
     * @see #getSAPTABLEINSTANCEPARAMType()
     * @generated
     */
    EAttribute getSAPTABLEINSTANCEPARAMType_VALUETYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPTABLEPARAMType <em>SAPTABLEPARAM Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPTABLEPARAM Type</em>'.
     * @see Powrmart.SAPTABLEPARAMType
     * @generated
     */
    EClass getSAPTABLEPARAMType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPTABLEPARAMType#getDEF <em>DEF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DEF</em>'.
     * @see Powrmart.SAPTABLEPARAMType#getDEF()
     * @see #getSAPTABLEPARAMType()
     * @generated
     */
    EAttribute getSAPTABLEPARAMType_DEF();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPTABLEPARAMType#getISOPTIONAL <em>ISOPTIONAL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISOPTIONAL</em>'.
     * @see Powrmart.SAPTABLEPARAMType#getISOPTIONAL()
     * @see #getSAPTABLEPARAMType()
     * @generated
     */
    EAttribute getSAPTABLEPARAMType_ISOPTIONAL();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPTABLEPARAMType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SAPTABLEPARAMType#getNAME()
     * @see #getSAPTABLEPARAMType()
     * @generated
     */
    EAttribute getSAPTABLEPARAMType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPTABLEPARAMType#getORDER <em>ORDER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ORDER</em>'.
     * @see Powrmart.SAPTABLEPARAMType#getORDER()
     * @see #getSAPTABLEPARAMType()
     * @generated
     */
    EAttribute getSAPTABLEPARAMType_ORDER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPTABLEPARAMType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.SAPTABLEPARAMType#getTYPE()
     * @see #getSAPTABLEPARAMType()
     * @generated
     */
    EAttribute getSAPTABLEPARAMType_TYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.SAPVARIABLEType <em>SAPVARIABLE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPVARIABLE Type</em>'.
     * @see Powrmart.SAPVARIABLEType
     * @generated
     */
    EClass getSAPVARIABLEType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPVARIABLEType#getDATATYPE <em>DATATYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATATYPE</em>'.
     * @see Powrmart.SAPVARIABLEType#getDATATYPE()
     * @see #getSAPVARIABLEType()
     * @generated
     */
    EAttribute getSAPVARIABLEType_DATATYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPVARIABLEType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DEFAULTVALUE</em>'.
     * @see Powrmart.SAPVARIABLEType#getDEFAULTVALUE()
     * @see #getSAPVARIABLEType()
     * @generated
     */
    EAttribute getSAPVARIABLEType_DEFAULTVALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPVARIABLEType#getDSQINSTNAME <em>DSQINSTNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DSQINSTNAME</em>'.
     * @see Powrmart.SAPVARIABLEType#getDSQINSTNAME()
     * @see #getSAPVARIABLEType()
     * @generated
     */
    EAttribute getSAPVARIABLEType_DSQINSTNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPVARIABLEType#getISOUTPUTPORT <em>ISOUTPUTPORT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISOUTPUTPORT</em>'.
     * @see Powrmart.SAPVARIABLEType#getISOUTPUTPORT()
     * @see #getSAPVARIABLEType()
     * @generated
     */
    EAttribute getSAPVARIABLEType_ISOUTPUTPORT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPVARIABLEType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SAPVARIABLEType#getNAME()
     * @see #getSAPVARIABLEType()
     * @generated
     */
    EAttribute getSAPVARIABLEType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPVARIABLEType#getPRECISION <em>PRECISION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PRECISION</em>'.
     * @see Powrmart.SAPVARIABLEType#getPRECISION()
     * @see #getSAPVARIABLEType()
     * @generated
     */
    EAttribute getSAPVARIABLEType_PRECISION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPVARIABLEType#getSCALE <em>SCALE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SCALE</em>'.
     * @see Powrmart.SAPVARIABLEType#getSCALE()
     * @see #getSAPVARIABLEType()
     * @generated
     */
    EAttribute getSAPVARIABLEType_SCALE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPVARIABLEType#getSUBTYPE <em>SUBTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SUBTYPE</em>'.
     * @see Powrmart.SAPVARIABLEType#getSUBTYPE()
     * @see #getSAPVARIABLEType()
     * @generated
     */
    EAttribute getSAPVARIABLEType_SUBTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SAPVARIABLEType#getVARDEF <em>VARDEF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VARDEF</em>'.
     * @see Powrmart.SAPVARIABLEType#getVARDEF()
     * @see #getSAPVARIABLEType()
     * @generated
     */
    EAttribute getSAPVARIABLEType_VARDEF();

    /**
     * Returns the meta object for class '{@link Powrmart.SCHEDULEINFO <em>SCHEDULEINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SCHEDULEINFO</em>'.
     * @see Powrmart.SCHEDULEINFO
     * @generated
     */
    EClass getSCHEDULEINFO();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.SCHEDULEINFO#getSCHEDULEINFO <em>SCHEDULEINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SCHEDULEINFO</em>'.
     * @see Powrmart.SCHEDULEINFO#getSCHEDULEINFO()
     * @see #getSCHEDULEINFO()
     * @generated
     */
    EReference getSCHEDULEINFO_SCHEDULEINFO();

    /**
     * Returns the meta object for class '{@link Powrmart.SCHEDULEINFOType <em>SCHEDULEINFO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SCHEDULEINFO Type</em>'.
     * @see Powrmart.SCHEDULEINFOType
     * @generated
     */
    EClass getSCHEDULEINFOType();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.SCHEDULEINFOType#getSTARTOPTIONS <em>STARTOPTIONS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>STARTOPTIONS</em>'.
     * @see Powrmart.SCHEDULEINFOType#getSTARTOPTIONS()
     * @see #getSCHEDULEINFOType()
     * @generated
     */
    EReference getSCHEDULEINFOType_STARTOPTIONS();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.SCHEDULEINFOType#getSCHEDULEOPTIONS <em>SCHEDULEOPTIONS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SCHEDULEOPTIONS</em>'.
     * @see Powrmart.SCHEDULEINFOType#getSCHEDULEOPTIONS()
     * @see #getSCHEDULEINFOType()
     * @generated
     */
    EReference getSCHEDULEINFOType_SCHEDULEOPTIONS();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.SCHEDULEINFOType#getENDOPTIONS <em>ENDOPTIONS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>ENDOPTIONS</em>'.
     * @see Powrmart.SCHEDULEINFOType#getENDOPTIONS()
     * @see #getSCHEDULEINFOType()
     * @generated
     */
    EReference getSCHEDULEINFOType_ENDOPTIONS();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SCHEDULEINFOType#getSCHEDULETYPE <em>SCHEDULETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SCHEDULETYPE</em>'.
     * @see Powrmart.SCHEDULEINFOType#getSCHEDULETYPE()
     * @see #getSCHEDULEINFOType()
     * @generated
     */
    EAttribute getSCHEDULEINFOType_SCHEDULETYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.SCHEDULEOPTIONSType <em>SCHEDULEOPTIONS Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SCHEDULEOPTIONS Type</em>'.
     * @see Powrmart.SCHEDULEOPTIONSType
     * @generated
     */
    EClass getSCHEDULEOPTIONSType();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.SCHEDULEOPTIONSType#getRECURRING <em>RECURRING</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>RECURRING</em>'.
     * @see Powrmart.SCHEDULEOPTIONSType#getRECURRING()
     * @see #getSCHEDULEOPTIONSType()
     * @generated
     */
    EReference getSCHEDULEOPTIONSType_RECURRING();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.SCHEDULEOPTIONSType#getCUSTOM <em>CUSTOM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CUSTOM</em>'.
     * @see Powrmart.SCHEDULEOPTIONSType#getCUSTOM()
     * @see #getSCHEDULEOPTIONSType()
     * @generated
     */
    EReference getSCHEDULEOPTIONSType_CUSTOM();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SCHEDULEOPTIONSType#getSCHEDULETYPE <em>SCHEDULETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SCHEDULETYPE</em>'.
     * @see Powrmart.SCHEDULEOPTIONSType#getSCHEDULETYPE()
     * @see #getSCHEDULEOPTIONSType()
     * @generated
     */
    EAttribute getSCHEDULEOPTIONSType_SCHEDULETYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.SCHEDULERType <em>SCHEDULER Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SCHEDULER Type</em>'.
     * @see Powrmart.SCHEDULERType
     * @generated
     */
    EClass getSCHEDULERType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SCHEDULERType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.SCHEDULERType#getDESCRIPTION()
     * @see #getSCHEDULERType()
     * @generated
     */
    EAttribute getSCHEDULERType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SCHEDULERType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SCHEDULERType#getNAME()
     * @see #getSCHEDULERType()
     * @generated
     */
    EAttribute getSCHEDULERType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SCHEDULERType#getREUSABLE <em>REUSABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REUSABLE</em>'.
     * @see Powrmart.SCHEDULERType#getREUSABLE()
     * @see #getSCHEDULERType()
     * @generated
     */
    EAttribute getSCHEDULERType_REUSABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SCHEDULERType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSIONNUMBER</em>'.
     * @see Powrmart.SCHEDULERType#getVERSIONNUMBER()
     * @see #getSCHEDULERType()
     * @generated
     */
    EAttribute getSCHEDULERType_VERSIONNUMBER();

    /**
     * Returns the meta object for class '{@link Powrmart.SEBLJOINType <em>SEBLJOIN Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SEBLJOIN Type</em>'.
     * @see Powrmart.SEBLJOINType
     * @generated
     */
    EClass getSEBLJOINType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLJOINType#getDESTCOL <em>DESTCOL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESTCOL</em>'.
     * @see Powrmart.SEBLJOINType#getDESTCOL()
     * @see #getSEBLJOINType()
     * @generated
     */
    EAttribute getSEBLJOINType_DESTCOL();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLJOINType#getFKTABLE <em>FKTABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FKTABLE</em>'.
     * @see Powrmart.SEBLJOINType#getFKTABLE()
     * @see #getSEBLJOINType()
     * @generated
     */
    EAttribute getSEBLJOINType_FKTABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLJOINType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SEBLJOINType#getNAME()
     * @see #getSEBLJOINType()
     * @generated
     */
    EAttribute getSEBLJOINType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLJOINType#getOUTERJOINREL <em>OUTERJOINREL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OUTERJOINREL</em>'.
     * @see Powrmart.SEBLJOINType#getOUTERJOINREL()
     * @see #getSEBLJOINType()
     * @generated
     */
    EAttribute getSEBLJOINType_OUTERJOINREL();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLJOINType#getPKTABLE <em>PKTABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PKTABLE</em>'.
     * @see Powrmart.SEBLJOINType#getPKTABLE()
     * @see #getSEBLJOINType()
     * @generated
     */
    EAttribute getSEBLJOINType_PKTABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLJOINType#getSRCCOL <em>SRCCOL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SRCCOL</em>'.
     * @see Powrmart.SEBLJOINType#getSRCCOL()
     * @see #getSEBLJOINType()
     * @generated
     */
    EAttribute getSEBLJOINType_SRCCOL();

    /**
     * Returns the meta object for class '{@link Powrmart.SEBLLINKType <em>SEBLLINK Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SEBLLINK Type</em>'.
     * @see Powrmart.SEBLLINKType
     * @generated
     */
    EClass getSEBLLINKType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLLINKType#getCHILDBC <em>CHILDBC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CHILDBC</em>'.
     * @see Powrmart.SEBLLINKType#getCHILDBC()
     * @see #getSEBLLINKType()
     * @generated
     */
    EAttribute getSEBLLINKType_CHILDBC();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLLINKType#getDESTBCBASETABLE <em>DESTBCBASETABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESTBCBASETABLE</em>'.
     * @see Powrmart.SEBLLINKType#getDESTBCBASETABLE()
     * @see #getSEBLLINKType()
     * @generated
     */
    EAttribute getSEBLLINKType_DESTBCBASETABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLLINKType#getDESTCOL <em>DESTCOL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESTCOL</em>'.
     * @see Powrmart.SEBLLINKType#getDESTCOL()
     * @see #getSEBLLINKType()
     * @generated
     */
    EAttribute getSEBLLINKType_DESTCOL();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLLINKType#getINTERCHILDCOL <em>INTERCHILDCOL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>INTERCHILDCOL</em>'.
     * @see Powrmart.SEBLLINKType#getINTERCHILDCOL()
     * @see #getSEBLLINKType()
     * @generated
     */
    EAttribute getSEBLLINKType_INTERCHILDCOL();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLLINKType#getINTERPARENTCOL <em>INTERPARENTCOL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>INTERPARENTCOL</em>'.
     * @see Powrmart.SEBLLINKType#getINTERPARENTCOL()
     * @see #getSEBLLINKType()
     * @generated
     */
    EAttribute getSEBLLINKType_INTERPARENTCOL();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLLINKType#getINTERTABLE <em>INTERTABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>INTERTABLE</em>'.
     * @see Powrmart.SEBLLINKType#getINTERTABLE()
     * @see #getSEBLLINKType()
     * @generated
     */
    EAttribute getSEBLLINKType_INTERTABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLLINKType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SEBLLINKType#getNAME()
     * @see #getSEBLLINKType()
     * @generated
     */
    EAttribute getSEBLLINKType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLLINKType#getPARENTBC <em>PARENTBC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARENTBC</em>'.
     * @see Powrmart.SEBLLINKType#getPARENTBC()
     * @see #getSEBLLINKType()
     * @generated
     */
    EAttribute getSEBLLINKType_PARENTBC();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLLINKType#getPRIMARYID <em>PRIMARYID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PRIMARYID</em>'.
     * @see Powrmart.SEBLLINKType#getPRIMARYID()
     * @see #getSEBLLINKType()
     * @generated
     */
    EAttribute getSEBLLINKType_PRIMARYID();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLLINKType#getSRCCOL <em>SRCCOL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SRCCOL</em>'.
     * @see Powrmart.SEBLLINKType#getSRCCOL()
     * @see #getSEBLLINKType()
     * @generated
     */
    EAttribute getSEBLLINKType_SRCCOL();

    /**
     * Returns the meta object for class '{@link Powrmart.SEBLMVLINKRELType <em>SEBLMVLINKREL Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SEBLMVLINKREL Type</em>'.
     * @see Powrmart.SEBLMVLINKRELType
     * @generated
     */
    EClass getSEBLMVLINKRELType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLMVLINKRELType#getDESTMVLINK <em>DESTMVLINK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESTMVLINK</em>'.
     * @see Powrmart.SEBLMVLINKRELType#getDESTMVLINK()
     * @see #getSEBLMVLINKRELType()
     * @generated
     */
    EAttribute getSEBLMVLINKRELType_DESTMVLINK();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLMVLINKRELType#getFIELD <em>FIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FIELD</em>'.
     * @see Powrmart.SEBLMVLINKRELType#getFIELD()
     * @see #getSEBLMVLINKRELType()
     * @generated
     */
    EAttribute getSEBLMVLINKRELType_FIELD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLMVLINKRELType#getSRCMVLINK <em>SRCMVLINK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SRCMVLINK</em>'.
     * @see Powrmart.SEBLMVLINKRELType#getSRCMVLINK()
     * @see #getSEBLMVLINKRELType()
     * @generated
     */
    EAttribute getSEBLMVLINKRELType_SRCMVLINK();

    /**
     * Returns the meta object for class '{@link Powrmart.SEBLMVLINKType <em>SEBLMVLINK Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SEBLMVLINK Type</em>'.
     * @see Powrmart.SEBLMVLINKType
     * @generated
     */
    EClass getSEBLMVLINKType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLMVLINKType#getBCNAME <em>BCNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>BCNAME</em>'.
     * @see Powrmart.SEBLMVLINKType#getBCNAME()
     * @see #getSEBLMVLINKType()
     * @generated
     */
    EAttribute getSEBLMVLINKType_BCNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLMVLINKType#getDESTBC <em>DESTBC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESTBC</em>'.
     * @see Powrmart.SEBLMVLINKType#getDESTBC()
     * @see #getSEBLMVLINKType()
     * @generated
     */
    EAttribute getSEBLMVLINKType_DESTBC();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLMVLINKType#getDESTLINK <em>DESTLINK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESTLINK</em>'.
     * @see Powrmart.SEBLMVLINKType#getDESTLINK()
     * @see #getSEBLMVLINKType()
     * @generated
     */
    EAttribute getSEBLMVLINKType_DESTLINK();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLMVLINKType#getMVLINK <em>MVLINK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MVLINK</em>'.
     * @see Powrmart.SEBLMVLINKType#getMVLINK()
     * @see #getSEBLMVLINKType()
     * @generated
     */
    EAttribute getSEBLMVLINKType_MVLINK();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLMVLINKType#getPRIMARYID <em>PRIMARYID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PRIMARYID</em>'.
     * @see Powrmart.SEBLMVLINKType#getPRIMARYID()
     * @see #getSEBLMVLINKType()
     * @generated
     */
    EAttribute getSEBLMVLINKType_PRIMARYID();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SEBLMVLINKType#getSRCFIELD <em>SRCFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SRCFIELD</em>'.
     * @see Powrmart.SEBLMVLINKType#getSRCFIELD()
     * @see #getSEBLMVLINKType()
     * @generated
     */
    EAttribute getSEBLMVLINKType_SRCFIELD();

    /**
     * Returns the meta object for class '{@link Powrmart.SEBLSRCINFOType <em>SEBLSRCINFO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SEBLSRCINFO Type</em>'.
     * @see Powrmart.SEBLSRCINFOType
     * @generated
     */
    EClass getSEBLSRCINFOType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SEBLSRCINFOType#getSEBLJOIN <em>SEBLJOIN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SEBLJOIN</em>'.
     * @see Powrmart.SEBLSRCINFOType#getSEBLJOIN()
     * @see #getSEBLSRCINFOType()
     * @generated
     */
    EReference getSEBLSRCINFOType_SEBLJOIN();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SEBLSRCINFOType#getSEBLLINK <em>SEBLLINK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SEBLLINK</em>'.
     * @see Powrmart.SEBLSRCINFOType#getSEBLLINK()
     * @see #getSEBLSRCINFOType()
     * @generated
     */
    EReference getSEBLSRCINFOType_SEBLLINK();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SEBLSRCINFOType#getSEBLMVLINK <em>SEBLMVLINK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SEBLMVLINK</em>'.
     * @see Powrmart.SEBLSRCINFOType#getSEBLMVLINK()
     * @see #getSEBLSRCINFOType()
     * @generated
     */
    EReference getSEBLSRCINFOType_SEBLMVLINK();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SEBLSRCINFOType#getSEBLMVLINKREL <em>SEBLMVLINKREL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SEBLMVLINKREL</em>'.
     * @see Powrmart.SEBLSRCINFOType#getSEBLMVLINKREL()
     * @see #getSEBLSRCINFOType()
     * @generated
     */
    EReference getSEBLSRCINFOType_SEBLMVLINKREL();

    /**
     * Returns the meta object for class '{@link Powrmart.SESSIONCOMPONENTType <em>SESSIONCOMPONENT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SESSIONCOMPONENT Type</em>'.
     * @see Powrmart.SESSIONCOMPONENTType
     * @generated
     */
    EClass getSESSIONCOMPONENTType();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.SESSIONCOMPONENTType#getTASK <em>TASK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TASK</em>'.
     * @see Powrmart.SESSIONCOMPONENTType#getTASK()
     * @see #getSESSIONCOMPONENTType()
     * @generated
     */
    EReference getSESSIONCOMPONENTType_TASK();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSIONCOMPONENTType#getVALUEPAIR <em>VALUEPAIR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>VALUEPAIR</em>'.
     * @see Powrmart.SESSIONCOMPONENTType#getVALUEPAIR()
     * @see #getSESSIONCOMPONENTType()
     * @generated
     */
    EReference getSESSIONCOMPONENTType_VALUEPAIR();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSIONCOMPONENTType#getATTRIBUTE <em>ATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ATTRIBUTE</em>'.
     * @see Powrmart.SESSIONCOMPONENTType#getATTRIBUTE()
     * @see #getSESSIONCOMPONENTType()
     * @generated
     */
    EReference getSESSIONCOMPONENTType_ATTRIBUTE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONCOMPONENTType#getISNONE <em>ISNONE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISNONE</em>'.
     * @see Powrmart.SESSIONCOMPONENTType#getISNONE()
     * @see #getSESSIONCOMPONENTType()
     * @generated
     */
    EAttribute getSESSIONCOMPONENTType_ISNONE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONCOMPONENTType#getREFOBJECTNAME <em>REFOBJECTNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFOBJECTNAME</em>'.
     * @see Powrmart.SESSIONCOMPONENTType#getREFOBJECTNAME()
     * @see #getSESSIONCOMPONENTType()
     * @generated
     */
    EAttribute getSESSIONCOMPONENTType_REFOBJECTNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONCOMPONENTType#getREUSABLE <em>REUSABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REUSABLE</em>'.
     * @see Powrmart.SESSIONCOMPONENTType#getREUSABLE()
     * @see #getSESSIONCOMPONENTType()
     * @generated
     */
    EAttribute getSESSIONCOMPONENTType_REUSABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONCOMPONENTType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.SESSIONCOMPONENTType#getTYPE()
     * @see #getSESSIONCOMPONENTType()
     * @generated
     */
    EAttribute getSESSIONCOMPONENTType_TYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.SESSIONEXTENSIONType <em>SESSIONEXTENSION Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SESSIONEXTENSION Type</em>'.
     * @see Powrmart.SESSIONEXTENSIONType
     * @generated
     */
    EClass getSESSIONEXTENSIONType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSIONEXTENSIONType#getCONNECTIONREFERENCE <em>CONNECTIONREFERENCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>CONNECTIONREFERENCE</em>'.
     * @see Powrmart.SESSIONEXTENSIONType#getCONNECTIONREFERENCE()
     * @see #getSESSIONEXTENSIONType()
     * @generated
     */
    EReference getSESSIONEXTENSIONType_CONNECTIONREFERENCE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSIONEXTENSIONType#getATTRIBUTE <em>ATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ATTRIBUTE</em>'.
     * @see Powrmart.SESSIONEXTENSIONType#getATTRIBUTE()
     * @see #getSESSIONEXTENSIONType()
     * @generated
     */
    EReference getSESSIONEXTENSIONType_ATTRIBUTE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONEXTENSIONType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>COMPONENTVERSION</em>'.
     * @see Powrmart.SESSIONEXTENSIONType#getCOMPONENTVERSION()
     * @see #getSESSIONEXTENSIONType()
     * @generated
     */
    EAttribute getSESSIONEXTENSIONType_COMPONENTVERSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONEXTENSIONType#getDSQINSTNAME <em>DSQINSTNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DSQINSTNAME</em>'.
     * @see Powrmart.SESSIONEXTENSIONType#getDSQINSTNAME()
     * @see #getSESSIONEXTENSIONType()
     * @generated
     */
    EAttribute getSESSIONEXTENSIONType_DSQINSTNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONEXTENSIONType#getDSQINSTTYPE <em>DSQINSTTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DSQINSTTYPE</em>'.
     * @see Powrmart.SESSIONEXTENSIONType#getDSQINSTTYPE()
     * @see #getSESSIONEXTENSIONType()
     * @generated
     */
    EAttribute getSESSIONEXTENSIONType_DSQINSTTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONEXTENSIONType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SESSIONEXTENSIONType#getNAME()
     * @see #getSESSIONEXTENSIONType()
     * @generated
     */
    EAttribute getSESSIONEXTENSIONType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONEXTENSIONType#getSINSTANCENAME <em>SINSTANCENAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SINSTANCENAME</em>'.
     * @see Powrmart.SESSIONEXTENSIONType#getSINSTANCENAME()
     * @see #getSESSIONEXTENSIONType()
     * @generated
     */
    EAttribute getSESSIONEXTENSIONType_SINSTANCENAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONEXTENSIONType#getSUBTYPE <em>SUBTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SUBTYPE</em>'.
     * @see Powrmart.SESSIONEXTENSIONType#getSUBTYPE()
     * @see #getSESSIONEXTENSIONType()
     * @generated
     */
    EAttribute getSESSIONEXTENSIONType_SUBTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONEXTENSIONType#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TRANSFORMATIONTYPE</em>'.
     * @see Powrmart.SESSIONEXTENSIONType#getTRANSFORMATIONTYPE()
     * @see #getSESSIONEXTENSIONType()
     * @generated
     */
    EAttribute getSESSIONEXTENSIONType_TRANSFORMATIONTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONEXTENSIONType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.SESSIONEXTENSIONType#getTYPE()
     * @see #getSESSIONEXTENSIONType()
     * @generated
     */
    EAttribute getSESSIONEXTENSIONType_TYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.SESSIONType <em>SESSION Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SESSION Type</em>'.
     * @see Powrmart.SESSIONType
     * @generated
     */
    EClass getSESSIONType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSIONType#getTASK <em>TASK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TASK</em>'.
     * @see Powrmart.SESSIONType#getTASK()
     * @see #getSESSIONType()
     * @generated
     */
    EReference getSESSIONType_TASK();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSIONType#getSESSTRANSFORMATIONINST <em>SESSTRANSFORMATIONINST</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SESSTRANSFORMATIONINST</em>'.
     * @see Powrmart.SESSIONType#getSESSTRANSFORMATIONINST()
     * @see #getSESSIONType()
     * @generated
     */
    EReference getSESSIONType_SESSTRANSFORMATIONINST();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.SESSIONType#getCONFIGREFERENCE <em>CONFIGREFERENCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CONFIGREFERENCE</em>'.
     * @see Powrmart.SESSIONType#getCONFIGREFERENCE()
     * @see #getSESSIONType()
     * @generated
     */
    EReference getSESSIONType_CONFIGREFERENCE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSIONType#getSESSIONCOMPONENT <em>SESSIONCOMPONENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SESSIONCOMPONENT</em>'.
     * @see Powrmart.SESSIONType#getSESSIONCOMPONENT()
     * @see #getSESSIONType()
     * @generated
     */
    EReference getSESSIONType_SESSIONCOMPONENT();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSIONType#getSESSIONEXTENSION <em>SESSIONEXTENSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SESSIONEXTENSION</em>'.
     * @see Powrmart.SESSIONType#getSESSIONEXTENSION()
     * @see #getSESSIONType()
     * @generated
     */
    EReference getSESSIONType_SESSIONEXTENSION();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSIONType#getATTRIBUTE <em>ATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ATTRIBUTE</em>'.
     * @see Powrmart.SESSIONType#getATTRIBUTE()
     * @see #getSESSIONType()
     * @generated
     */
    EReference getSESSIONType_ATTRIBUTE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSIONType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>METADATAEXTENSION</em>'.
     * @see Powrmart.SESSIONType#getMETADATAEXTENSION()
     * @see #getSESSIONType()
     * @generated
     */
    EReference getSESSIONType_METADATAEXTENSION();

    /**
     * Returns the meta object for the attribute list '{@link Powrmart.SESSIONType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see Powrmart.SESSIONType#getGroup()
     * @see #getSESSIONType()
     * @generated
     */
    EAttribute getSESSIONType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSIONType#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>RESOURCEREFERENCE</em>'.
     * @see Powrmart.SESSIONType#getRESOURCEREFERENCE()
     * @see #getSESSIONType()
     * @generated
     */
    EReference getSESSIONType_RESOURCEREFERENCE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSIONType#getTRANSFORMRESOURCEREF <em>TRANSFORMRESOURCEREF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TRANSFORMRESOURCEREF</em>'.
     * @see Powrmart.SESSIONType#getTRANSFORMRESOURCEREF()
     * @see #getSESSIONType()
     * @generated
     */
    EReference getSESSIONType_TRANSFORMRESOURCEREF();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.SESSIONType#getDESCRIPTION()
     * @see #getSESSIONType()
     * @generated
     */
    EAttribute getSESSIONType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONType#getISVALID <em>ISVALID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISVALID</em>'.
     * @see Powrmart.SESSIONType#getISVALID()
     * @see #getSESSIONType()
     * @generated
     */
    EAttribute getSESSIONType_ISVALID();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONType#getMAPPINGNAME <em>MAPPINGNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MAPPINGNAME</em>'.
     * @see Powrmart.SESSIONType#getMAPPINGNAME()
     * @see #getSESSIONType()
     * @generated
     */
    EAttribute getSESSIONType_MAPPINGNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONType#getMAPPINGVERSION <em>MAPPINGVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MAPPINGVERSION</em>'.
     * @see Powrmart.SESSIONType#getMAPPINGVERSION()
     * @see #getSESSIONType()
     * @generated
     */
    EAttribute getSESSIONType_MAPPINGVERSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SESSIONType#getNAME()
     * @see #getSESSIONType()
     * @generated
     */
    EAttribute getSESSIONType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONType#getPARENT <em>PARENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARENT</em>'.
     * @see Powrmart.SESSIONType#getPARENT()
     * @see #getSESSIONType()
     * @generated
     */
    EAttribute getSESSIONType_PARENT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONType#getPARENTTYPE <em>PARENTTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARENTTYPE</em>'.
     * @see Powrmart.SESSIONType#getPARENTTYPE()
     * @see #getSESSIONType()
     * @generated
     */
    EAttribute getSESSIONType_PARENTTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONType#getREUSABLE <em>REUSABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REUSABLE</em>'.
     * @see Powrmart.SESSIONType#getREUSABLE()
     * @see #getSESSIONType()
     * @generated
     */
    EAttribute getSESSIONType_REUSABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONType#getSORTORDER <em>SORTORDER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SORTORDER</em>'.
     * @see Powrmart.SESSIONType#getSORTORDER()
     * @see #getSESSIONType()
     * @generated
     */
    EAttribute getSESSIONType_SORTORDER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSIONType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSIONNUMBER</em>'.
     * @see Powrmart.SESSIONType#getVERSIONNUMBER()
     * @see #getSESSIONType()
     * @generated
     */
    EAttribute getSESSIONType_VERSIONNUMBER();

    /**
     * Returns the meta object for class '{@link Powrmart.SESSTRANSFORMATIONGROUPType <em>SESSTRANSFORMATIONGROUP Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SESSTRANSFORMATIONGROUP Type</em>'.
     * @see Powrmart.SESSTRANSFORMATIONGROUPType
     * @generated
     */
    EClass getSESSTRANSFORMATIONGROUPType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSTRANSFORMATIONGROUPType#getGROUP <em>GROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>GROUP</em>'.
     * @see Powrmart.SESSTRANSFORMATIONGROUPType#getGROUP()
     * @see #getSESSTRANSFORMATIONGROUPType()
     * @generated
     */
    EAttribute getSESSTRANSFORMATIONGROUPType_GROUP();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSTRANSFORMATIONGROUPType#getPARTITIONTYPE <em>PARTITIONTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARTITIONTYPE</em>'.
     * @see Powrmart.SESSTRANSFORMATIONGROUPType#getPARTITIONTYPE()
     * @see #getSESSTRANSFORMATIONGROUPType()
     * @generated
     */
    EAttribute getSESSTRANSFORMATIONGROUPType_PARTITIONTYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.SESSTRANSFORMATIONINSTType <em>SESSTRANSFORMATIONINST Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SESSTRANSFORMATIONINST Type</em>'.
     * @see Powrmart.SESSTRANSFORMATIONINSTType
     * @generated
     */
    EClass getSESSTRANSFORMATIONINSTType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSTRANSFORMATIONINSTType#getSESSTRANSFORMATIONGROUP <em>SESSTRANSFORMATIONGROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SESSTRANSFORMATIONGROUP</em>'.
     * @see Powrmart.SESSTRANSFORMATIONINSTType#getSESSTRANSFORMATIONGROUP()
     * @see #getSESSTRANSFORMATIONINSTType()
     * @generated
     */
    EReference getSESSTRANSFORMATIONINSTType_SESSTRANSFORMATIONGROUP();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSTRANSFORMATIONINSTType#getPARTITION <em>PARTITION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>PARTITION</em>'.
     * @see Powrmart.SESSTRANSFORMATIONINSTType#getPARTITION()
     * @see #getSESSTRANSFORMATIONINSTType()
     * @generated
     */
    EReference getSESSTRANSFORMATIONINSTType_PARTITION();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSTRANSFORMATIONINSTType#getHASHKEY <em>HASHKEY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>HASHKEY</em>'.
     * @see Powrmart.SESSTRANSFORMATIONINSTType#getHASHKEY()
     * @see #getSESSTRANSFORMATIONINSTType()
     * @generated
     */
    EReference getSESSTRANSFORMATIONINSTType_HASHKEY();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSTRANSFORMATIONINSTType#getFLATFILE <em>FLATFILE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>FLATFILE</em>'.
     * @see Powrmart.SESSTRANSFORMATIONINSTType#getFLATFILE()
     * @see #getSESSTRANSFORMATIONINSTType()
     * @generated
     */
    EReference getSESSTRANSFORMATIONINSTType_FLATFILE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SESSTRANSFORMATIONINSTType#getATTRIBUTE <em>ATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ATTRIBUTE</em>'.
     * @see Powrmart.SESSTRANSFORMATIONINSTType#getATTRIBUTE()
     * @see #getSESSTRANSFORMATIONINSTType()
     * @generated
     */
    EReference getSESSTRANSFORMATIONINSTType_ATTRIBUTE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSTRANSFORMATIONINSTType#getISREPARTITIONPOINT <em>ISREPARTITIONPOINT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISREPARTITIONPOINT</em>'.
     * @see Powrmart.SESSTRANSFORMATIONINSTType#getISREPARTITIONPOINT()
     * @see #getSESSTRANSFORMATIONINSTType()
     * @generated
     */
    EAttribute getSESSTRANSFORMATIONINSTType_ISREPARTITIONPOINT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSTRANSFORMATIONINSTType#getPARTITIONTYPE <em>PARTITIONTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARTITIONTYPE</em>'.
     * @see Powrmart.SESSTRANSFORMATIONINSTType#getPARTITIONTYPE()
     * @see #getSESSTRANSFORMATIONINSTType()
     * @generated
     */
    EAttribute getSESSTRANSFORMATIONINSTType_PARTITIONTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSTRANSFORMATIONINSTType#getPIPELINE <em>PIPELINE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PIPELINE</em>'.
     * @see Powrmart.SESSTRANSFORMATIONINSTType#getPIPELINE()
     * @see #getSESSTRANSFORMATIONINSTType()
     * @generated
     */
    EAttribute getSESSTRANSFORMATIONINSTType_PIPELINE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSTRANSFORMATIONINSTType#getSINSTANCENAME <em>SINSTANCENAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SINSTANCENAME</em>'.
     * @see Powrmart.SESSTRANSFORMATIONINSTType#getSINSTANCENAME()
     * @see #getSESSTRANSFORMATIONINSTType()
     * @generated
     */
    EAttribute getSESSTRANSFORMATIONINSTType_SINSTANCENAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSTRANSFORMATIONINSTType#getSTAGE <em>STAGE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>STAGE</em>'.
     * @see Powrmart.SESSTRANSFORMATIONINSTType#getSTAGE()
     * @see #getSESSTRANSFORMATIONINSTType()
     * @generated
     */
    EAttribute getSESSTRANSFORMATIONINSTType_STAGE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSTRANSFORMATIONINSTType#getTRANSFORMATIONNAME <em>TRANSFORMATIONNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TRANSFORMATIONNAME</em>'.
     * @see Powrmart.SESSTRANSFORMATIONINSTType#getTRANSFORMATIONNAME()
     * @see #getSESSTRANSFORMATIONINSTType()
     * @generated
     */
    EAttribute getSESSTRANSFORMATIONINSTType_TRANSFORMATIONNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SESSTRANSFORMATIONINSTType#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TRANSFORMATIONTYPE</em>'.
     * @see Powrmart.SESSTRANSFORMATIONINSTType#getTRANSFORMATIONTYPE()
     * @see #getSESSTRANSFORMATIONINSTType()
     * @generated
     */
    EAttribute getSESSTRANSFORMATIONINSTType_TRANSFORMATIONTYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.SHORTCUTType <em>SHORTCUT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SHORTCUT Type</em>'.
     * @see Powrmart.SHORTCUTType
     * @generated
     */
    EClass getSHORTCUTType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SHORTCUTType#getCOMMENTS <em>COMMENTS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>COMMENTS</em>'.
     * @see Powrmart.SHORTCUTType#getCOMMENTS()
     * @see #getSHORTCUTType()
     * @generated
     */
    EAttribute getSHORTCUTType_COMMENTS();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SHORTCUTType#getDBDNAME <em>DBDNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DBDNAME</em>'.
     * @see Powrmart.SHORTCUTType#getDBDNAME()
     * @see #getSHORTCUTType()
     * @generated
     */
    EAttribute getSHORTCUTType_DBDNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SHORTCUTType#getFOLDERNAME <em>FOLDERNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FOLDERNAME</em>'.
     * @see Powrmart.SHORTCUTType#getFOLDERNAME()
     * @see #getSHORTCUTType()
     * @generated
     */
    EAttribute getSHORTCUTType_FOLDERNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SHORTCUTType#getFOLDERVERSIONNAME <em>FOLDERVERSIONNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FOLDERVERSIONNAME</em>'.
     * @see Powrmart.SHORTCUTType#getFOLDERVERSIONNAME()
     * @see #getSHORTCUTType()
     * @generated
     */
    EAttribute getSHORTCUTType_FOLDERVERSIONNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SHORTCUTType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SHORTCUTType#getNAME()
     * @see #getSHORTCUTType()
     * @generated
     */
    EAttribute getSHORTCUTType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SHORTCUTType#getOBJECTSUBTYPE <em>OBJECTSUBTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OBJECTSUBTYPE</em>'.
     * @see Powrmart.SHORTCUTType#getOBJECTSUBTYPE()
     * @see #getSHORTCUTType()
     * @generated
     */
    EAttribute getSHORTCUTType_OBJECTSUBTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SHORTCUTType#getOBJECTTYPE <em>OBJECTTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OBJECTTYPE</em>'.
     * @see Powrmart.SHORTCUTType#getOBJECTTYPE()
     * @see #getSHORTCUTType()
     * @generated
     */
    EAttribute getSHORTCUTType_OBJECTTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SHORTCUTType#getREFERENCEDDBD <em>REFERENCEDDBD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFERENCEDDBD</em>'.
     * @see Powrmart.SHORTCUTType#getREFERENCEDDBD()
     * @see #getSHORTCUTType()
     * @generated
     */
    EAttribute getSHORTCUTType_REFERENCEDDBD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SHORTCUTType#getREFERENCETYPE <em>REFERENCETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFERENCETYPE</em>'.
     * @see Powrmart.SHORTCUTType#getREFERENCETYPE()
     * @see #getSHORTCUTType()
     * @generated
     */
    EAttribute getSHORTCUTType_REFERENCETYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SHORTCUTType#getREFOBJECTNAME <em>REFOBJECTNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFOBJECTNAME</em>'.
     * @see Powrmart.SHORTCUTType#getREFOBJECTNAME()
     * @see #getSHORTCUTType()
     * @generated
     */
    EAttribute getSHORTCUTType_REFOBJECTNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SHORTCUTType#getREPOSITORYNAME <em>REPOSITORYNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REPOSITORYNAME</em>'.
     * @see Powrmart.SHORTCUTType#getREPOSITORYNAME()
     * @see #getSHORTCUTType()
     * @generated
     */
    EAttribute getSHORTCUTType_REPOSITORYNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SHORTCUTType#getTEMPLATEID <em>TEMPLATEID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TEMPLATEID</em>'.
     * @see Powrmart.SHORTCUTType#getTEMPLATEID()
     * @see #getSHORTCUTType()
     * @generated
     */
    EAttribute getSHORTCUTType_TEMPLATEID();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SHORTCUTType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSIONNUMBER</em>'.
     * @see Powrmart.SHORTCUTType#getVERSIONNUMBER()
     * @see #getSHORTCUTType()
     * @generated
     */
    EAttribute getSHORTCUTType_VERSIONNUMBER();

    /**
     * Returns the meta object for class '{@link Powrmart.SOURCEFIELDType <em>SOURCEFIELD Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SOURCEFIELD Type</em>'.
     * @see Powrmart.SOURCEFIELDType
     * @generated
     */
    EClass getSOURCEFIELDType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SOURCEFIELDType#getSOURCEFIELD <em>SOURCEFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SOURCEFIELD</em>'.
     * @see Powrmart.SOURCEFIELDType#getSOURCEFIELD()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EReference getSOURCEFIELDType_SOURCEFIELD();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SOURCEFIELDType#getFIELDATTRIBUTE <em>FIELDATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>FIELDATTRIBUTE</em>'.
     * @see Powrmart.SOURCEFIELDType#getFIELDATTRIBUTE()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EReference getSOURCEFIELDType_FIELDATTRIBUTE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getBUSINESSNAME <em>BUSINESSNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>BUSINESSNAME</em>'.
     * @see Powrmart.SOURCEFIELDType#getBUSINESSNAME()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_BUSINESSNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getDATATYPE <em>DATATYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATATYPE</em>'.
     * @see Powrmart.SOURCEFIELDType#getDATATYPE()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_DATATYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.SOURCEFIELDType#getDESCRIPTION()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getFIELDNUMBER <em>FIELDNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FIELDNUMBER</em>'.
     * @see Powrmart.SOURCEFIELDType#getFIELDNUMBER()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_FIELDNUMBER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getFIELDTYPE <em>FIELDTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FIELDTYPE</em>'.
     * @see Powrmart.SOURCEFIELDType#getFIELDTYPE()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_FIELDTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getGROUP <em>GROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>GROUP</em>'.
     * @see Powrmart.SOURCEFIELDType#getGROUP()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_GROUP();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getHIDDEN <em>HIDDEN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>HIDDEN</em>'.
     * @see Powrmart.SOURCEFIELDType#getHIDDEN()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_HIDDEN();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getKEYTYPE <em>KEYTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>KEYTYPE</em>'.
     * @see Powrmart.SOURCEFIELDType#getKEYTYPE()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_KEYTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getLENGTH <em>LENGTH</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>LENGTH</em>'.
     * @see Powrmart.SOURCEFIELDType#getLENGTH()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_LENGTH();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getLEVEL <em>LEVEL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>LEVEL</em>'.
     * @see Powrmart.SOURCEFIELDType#getLEVEL()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_LEVEL();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SOURCEFIELDType#getNAME()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getNULLABLE <em>NULLABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NULLABLE</em>'.
     * @see Powrmart.SOURCEFIELDType#getNULLABLE()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_NULLABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getOCCURS <em>OCCURS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OCCURS</em>'.
     * @see Powrmart.SOURCEFIELDType#getOCCURS()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_OCCURS();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getOFFSET <em>OFFSET</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OFFSET</em>'.
     * @see Powrmart.SOURCEFIELDType#getOFFSET()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_OFFSET();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getPHYSICALLENGTH <em>PHYSICALLENGTH</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PHYSICALLENGTH</em>'.
     * @see Powrmart.SOURCEFIELDType#getPHYSICALLENGTH()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_PHYSICALLENGTH();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getPHYSICALOFFSET <em>PHYSICALOFFSET</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PHYSICALOFFSET</em>'.
     * @see Powrmart.SOURCEFIELDType#getPHYSICALOFFSET()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_PHYSICALOFFSET();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getPICTURETEXT <em>PICTURETEXT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PICTURETEXT</em>'.
     * @see Powrmart.SOURCEFIELDType#getPICTURETEXT()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_PICTURETEXT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getPRECISION <em>PRECISION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PRECISION</em>'.
     * @see Powrmart.SOURCEFIELDType#getPRECISION()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_PRECISION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getREDEFINES <em>REDEFINES</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REDEFINES</em>'.
     * @see Powrmart.SOURCEFIELDType#getREDEFINES()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_REDEFINES();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getREFERENCEDDBD <em>REFERENCEDDBD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFERENCEDDBD</em>'.
     * @see Powrmart.SOURCEFIELDType#getREFERENCEDDBD()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_REFERENCEDDBD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getREFERENCEDFIELD <em>REFERENCEDFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFERENCEDFIELD</em>'.
     * @see Powrmart.SOURCEFIELDType#getREFERENCEDFIELD()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_REFERENCEDFIELD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getREFERENCEDTABLE <em>REFERENCEDTABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFERENCEDTABLE</em>'.
     * @see Powrmart.SOURCEFIELDType#getREFERENCEDTABLE()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_REFERENCEDTABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getSCALE <em>SCALE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SCALE</em>'.
     * @see Powrmart.SOURCEFIELDType#getSCALE()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_SCALE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getSHIFTSTATE <em>SHIFTSTATE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SHIFTSTATE</em>'.
     * @see Powrmart.SOURCEFIELDType#getSHIFTSTATE()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_SHIFTSTATE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getUSAGE <em>USAGE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>USAGE</em>'.
     * @see Powrmart.SOURCEFIELDType#getUSAGE()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_USAGE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEFIELDType#getUSAGEFLAGS <em>USAGEFLAGS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>USAGEFLAGS</em>'.
     * @see Powrmart.SOURCEFIELDType#getUSAGEFLAGS()
     * @see #getSOURCEFIELDType()
     * @generated
     */
    EAttribute getSOURCEFIELDType_USAGEFLAGS();

    /**
     * Returns the meta object for class '{@link Powrmart.SOURCEType <em>SOURCE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SOURCE Type</em>'.
     * @see Powrmart.SOURCEType
     * @generated
     */
    EClass getSOURCEType();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.SOURCEType#getFLATFILE <em>FLATFILE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>FLATFILE</em>'.
     * @see Powrmart.SOURCEType#getFLATFILE()
     * @see #getSOURCEType()
     * @generated
     */
    EReference getSOURCEType_FLATFILE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.SOURCEType#getXMLINFO <em>XMLINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>XMLINFO</em>'.
     * @see Powrmart.SOURCEType#getXMLINFO()
     * @see #getSOURCEType()
     * @generated
     */
    EReference getSOURCEType_XMLINFO();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.SOURCEType#getERPSRCINFO <em>ERPSRCINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>ERPSRCINFO</em>'.
     * @see Powrmart.SOURCEType#getERPSRCINFO()
     * @see #getSOURCEType()
     * @generated
     */
    EReference getSOURCEType_ERPSRCINFO();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SOURCEType#getGROUP <em>GROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>GROUP</em>'.
     * @see Powrmart.SOURCEType#getGROUP()
     * @see #getSOURCEType()
     * @generated
     */
    EReference getSOURCEType_GROUP();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SOURCEType#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TABLEATTRIBUTE</em>'.
     * @see Powrmart.SOURCEType#getTABLEATTRIBUTE()
     * @see #getSOURCEType()
     * @generated
     */
    EReference getSOURCEType_TABLEATTRIBUTE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SOURCEType#getSOURCEFIELD <em>SOURCEFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SOURCEFIELD</em>'.
     * @see Powrmart.SOURCEType#getSOURCEFIELD()
     * @see #getSOURCEType()
     * @generated
     */
    EReference getSOURCEType_SOURCEFIELD();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.SOURCEType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>METADATAEXTENSION</em>'.
     * @see Powrmart.SOURCEType#getMETADATAEXTENSION()
     * @see #getSOURCEType()
     * @generated
     */
    EReference getSOURCEType_METADATAEXTENSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEType#getBUSINESSNAME <em>BUSINESSNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>BUSINESSNAME</em>'.
     * @see Powrmart.SOURCEType#getBUSINESSNAME()
     * @see #getSOURCEType()
     * @generated
     */
    EAttribute getSOURCEType_BUSINESSNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>COMPONENTVERSION</em>'.
     * @see Powrmart.SOURCEType#getCOMPONENTVERSION()
     * @see #getSOURCEType()
     * @generated
     */
    EAttribute getSOURCEType_COMPONENTVERSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEType#getCRCVALUE <em>CRCVALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CRCVALUE</em>'.
     * @see Powrmart.SOURCEType#getCRCVALUE()
     * @see #getSOURCEType()
     * @generated
     */
    EAttribute getSOURCEType_CRCVALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEType#getDATABASESUBTYPE <em>DATABASESUBTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATABASESUBTYPE</em>'.
     * @see Powrmart.SOURCEType#getDATABASESUBTYPE()
     * @see #getSOURCEType()
     * @generated
     */
    EAttribute getSOURCEType_DATABASESUBTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEType#getDATABASETYPE <em>DATABASETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATABASETYPE</em>'.
     * @see Powrmart.SOURCEType#getDATABASETYPE()
     * @see #getSOURCEType()
     * @generated
     */
    EAttribute getSOURCEType_DATABASETYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEType#getDBDNAME <em>DBDNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DBDNAME</em>'.
     * @see Powrmart.SOURCEType#getDBDNAME()
     * @see #getSOURCEType()
     * @generated
     */
    EAttribute getSOURCEType_DBDNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.SOURCEType#getDESCRIPTION()
     * @see #getSOURCEType()
     * @generated
     */
    EAttribute getSOURCEType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEType#getIBMCOMP <em>IBMCOMP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>IBMCOMP</em>'.
     * @see Powrmart.SOURCEType#getIBMCOMP()
     * @see #getSOURCEType()
     * @generated
     */
    EAttribute getSOURCEType_IBMCOMP();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.SOURCEType#getNAME()
     * @see #getSOURCEType()
     * @generated
     */
    EAttribute getSOURCEType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEType#getOBJECTVERSION <em>OBJECTVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OBJECTVERSION</em>'.
     * @see Powrmart.SOURCEType#getOBJECTVERSION()
     * @see #getSOURCEType()
     * @generated
     */
    EAttribute getSOURCEType_OBJECTVERSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEType#getOWNERNAME <em>OWNERNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OWNERNAME</em>'.
     * @see Powrmart.SOURCEType#getOWNERNAME()
     * @see #getSOURCEType()
     * @generated
     */
    EAttribute getSOURCEType_OWNERNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.SOURCEType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSIONNUMBER</em>'.
     * @see Powrmart.SOURCEType#getVERSIONNUMBER()
     * @see #getSOURCEType()
     * @generated
     */
    EAttribute getSOURCEType_VERSIONNUMBER();

    /**
     * Returns the meta object for class '{@link Powrmart.STARTOPTIONSType <em>STARTOPTIONS Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>STARTOPTIONS Type</em>'.
     * @see Powrmart.STARTOPTIONSType
     * @generated
     */
    EClass getSTARTOPTIONSType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.STARTOPTIONSType#getSTARTDATE <em>STARTDATE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>STARTDATE</em>'.
     * @see Powrmart.STARTOPTIONSType#getSTARTDATE()
     * @see #getSTARTOPTIONSType()
     * @generated
     */
    EAttribute getSTARTOPTIONSType_STARTDATE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.STARTOPTIONSType#getSTARTTIME <em>STARTTIME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>STARTTIME</em>'.
     * @see Powrmart.STARTOPTIONSType#getSTARTTIME()
     * @see #getSTARTOPTIONSType()
     * @generated
     */
    EAttribute getSTARTOPTIONSType_STARTTIME();

    /**
     * Returns the meta object for class '{@link Powrmart.TABLEATTRIBUTEType <em>TABLEATTRIBUTE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TABLEATTRIBUTE Type</em>'.
     * @see Powrmart.TABLEATTRIBUTEType
     * @generated
     */
    EClass getTABLEATTRIBUTEType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TABLEATTRIBUTEType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.TABLEATTRIBUTEType#getNAME()
     * @see #getTABLEATTRIBUTEType()
     * @generated
     */
    EAttribute getTABLEATTRIBUTEType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TABLEATTRIBUTEType#getVALUE <em>VALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUE</em>'.
     * @see Powrmart.TABLEATTRIBUTEType#getVALUE()
     * @see #getTABLEATTRIBUTEType()
     * @generated
     */
    EAttribute getTABLEATTRIBUTEType_VALUE();

    /**
     * Returns the meta object for class '{@link Powrmart.TARGETFIELDType <em>TARGETFIELD Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TARGETFIELD Type</em>'.
     * @see Powrmart.TARGETFIELDType
     * @generated
     */
    EClass getTARGETFIELDType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TARGETFIELDType#getFIELDATTRIBUTE <em>FIELDATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>FIELDATTRIBUTE</em>'.
     * @see Powrmart.TARGETFIELDType#getFIELDATTRIBUTE()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EReference getTARGETFIELDType_FIELDATTRIBUTE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getBUSINESSNAME <em>BUSINESSNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>BUSINESSNAME</em>'.
     * @see Powrmart.TARGETFIELDType#getBUSINESSNAME()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_BUSINESSNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getDATATYPE <em>DATATYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATATYPE</em>'.
     * @see Powrmart.TARGETFIELDType#getDATATYPE()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_DATATYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.TARGETFIELDType#getDESCRIPTION()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getFIELDNUMBER <em>FIELDNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FIELDNUMBER</em>'.
     * @see Powrmart.TARGETFIELDType#getFIELDNUMBER()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_FIELDNUMBER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getGROUP <em>GROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>GROUP</em>'.
     * @see Powrmart.TARGETFIELDType#getGROUP()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_GROUP();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getISFILENAMEFIELD <em>ISFILENAMEFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISFILENAMEFIELD</em>'.
     * @see Powrmart.TARGETFIELDType#getISFILENAMEFIELD()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_ISFILENAMEFIELD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getKEYTYPE <em>KEYTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>KEYTYPE</em>'.
     * @see Powrmart.TARGETFIELDType#getKEYTYPE()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_KEYTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.TARGETFIELDType#getNAME()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getNULLABLE <em>NULLABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NULLABLE</em>'.
     * @see Powrmart.TARGETFIELDType#getNULLABLE()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_NULLABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getPICTURETEXT <em>PICTURETEXT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PICTURETEXT</em>'.
     * @see Powrmart.TARGETFIELDType#getPICTURETEXT()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_PICTURETEXT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getPRECISION <em>PRECISION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PRECISION</em>'.
     * @see Powrmart.TARGETFIELDType#getPRECISION()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_PRECISION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getREFERENCEDFIELD <em>REFERENCEDFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFERENCEDFIELD</em>'.
     * @see Powrmart.TARGETFIELDType#getREFERENCEDFIELD()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_REFERENCEDFIELD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getREFERENCEDTABLE <em>REFERENCEDTABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFERENCEDTABLE</em>'.
     * @see Powrmart.TARGETFIELDType#getREFERENCEDTABLE()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_REFERENCEDTABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETFIELDType#getSCALE <em>SCALE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SCALE</em>'.
     * @see Powrmart.TARGETFIELDType#getSCALE()
     * @see #getTARGETFIELDType()
     * @generated
     */
    EAttribute getTARGETFIELDType_SCALE();

    /**
     * Returns the meta object for class '{@link Powrmart.TARGETINDEXFIELDType <em>TARGETINDEXFIELD Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TARGETINDEXFIELD Type</em>'.
     * @see Powrmart.TARGETINDEXFIELDType
     * @generated
     */
    EClass getTARGETINDEXFIELDType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETINDEXFIELDType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.TARGETINDEXFIELDType#getNAME()
     * @see #getTARGETINDEXFIELDType()
     * @generated
     */
    EAttribute getTARGETINDEXFIELDType_NAME();

    /**
     * Returns the meta object for class '{@link Powrmart.TARGETINDEXType <em>TARGETINDEX Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TARGETINDEX Type</em>'.
     * @see Powrmart.TARGETINDEXType
     * @generated
     */
    EClass getTARGETINDEXType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TARGETINDEXType#getTARGETINDEXFIELD <em>TARGETINDEXFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TARGETINDEXFIELD</em>'.
     * @see Powrmart.TARGETINDEXType#getTARGETINDEXFIELD()
     * @see #getTARGETINDEXType()
     * @generated
     */
    EReference getTARGETINDEXType_TARGETINDEXFIELD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETINDEXType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.TARGETINDEXType#getDESCRIPTION()
     * @see #getTARGETINDEXType()
     * @generated
     */
    EAttribute getTARGETINDEXType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETINDEXType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.TARGETINDEXType#getNAME()
     * @see #getTARGETINDEXType()
     * @generated
     */
    EAttribute getTARGETINDEXType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETINDEXType#getUNIQUE <em>UNIQUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>UNIQUE</em>'.
     * @see Powrmart.TARGETINDEXType#getUNIQUE()
     * @see #getTARGETINDEXType()
     * @generated
     */
    EAttribute getTARGETINDEXType_UNIQUE();

    /**
     * Returns the meta object for class '{@link Powrmart.TARGETLOADORDERType <em>TARGETLOADORDER Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TARGETLOADORDER Type</em>'.
     * @see Powrmart.TARGETLOADORDERType
     * @generated
     */
    EClass getTARGETLOADORDERType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETLOADORDERType#getORDER <em>ORDER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ORDER</em>'.
     * @see Powrmart.TARGETLOADORDERType#getORDER()
     * @see #getTARGETLOADORDERType()
     * @generated
     */
    EAttribute getTARGETLOADORDERType_ORDER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETLOADORDERType#getTARGETINSTANCE <em>TARGETINSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TARGETINSTANCE</em>'.
     * @see Powrmart.TARGETLOADORDERType#getTARGETINSTANCE()
     * @see #getTARGETLOADORDERType()
     * @generated
     */
    EAttribute getTARGETLOADORDERType_TARGETINSTANCE();

    /**
     * Returns the meta object for class '{@link Powrmart.TARGETType <em>TARGET Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TARGET Type</em>'.
     * @see Powrmart.TARGETType
     * @generated
     */
    EClass getTARGETType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TARGETType#getKEYWORD <em>KEYWORD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>KEYWORD</em>'.
     * @see Powrmart.TARGETType#getKEYWORD()
     * @see #getTARGETType()
     * @generated
     */
    EReference getTARGETType_KEYWORD();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.TARGETType#getFLATFILE <em>FLATFILE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>FLATFILE</em>'.
     * @see Powrmart.TARGETType#getFLATFILE()
     * @see #getTARGETType()
     * @generated
     */
    EReference getTARGETType_FLATFILE();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.TARGETType#getXMLINFO <em>XMLINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>XMLINFO</em>'.
     * @see Powrmart.TARGETType#getXMLINFO()
     * @see #getTARGETType()
     * @generated
     */
    EReference getTARGETType_XMLINFO();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TARGETType#getGROUP <em>GROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>GROUP</em>'.
     * @see Powrmart.TARGETType#getGROUP()
     * @see #getTARGETType()
     * @generated
     */
    EReference getTARGETType_GROUP();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TARGETType#getTARGETFIELD <em>TARGETFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TARGETFIELD</em>'.
     * @see Powrmart.TARGETType#getTARGETFIELD()
     * @see #getTARGETType()
     * @generated
     */
    EReference getTARGETType_TARGETFIELD();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TARGETType#getTARGETINDEX <em>TARGETINDEX</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TARGETINDEX</em>'.
     * @see Powrmart.TARGETType#getTARGETINDEX()
     * @see #getTARGETType()
     * @generated
     */
    EReference getTARGETType_TARGETINDEX();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TARGETType#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TABLEATTRIBUTE</em>'.
     * @see Powrmart.TARGETType#getTABLEATTRIBUTE()
     * @see #getTARGETType()
     * @generated
     */
    EReference getTARGETType_TABLEATTRIBUTE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TARGETType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>METADATAEXTENSION</em>'.
     * @see Powrmart.TARGETType#getMETADATAEXTENSION()
     * @see #getTARGETType()
     * @generated
     */
    EReference getTARGETType_METADATAEXTENSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETType#getBUSINESSNAME <em>BUSINESSNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>BUSINESSNAME</em>'.
     * @see Powrmart.TARGETType#getBUSINESSNAME()
     * @see #getTARGETType()
     * @generated
     */
    EAttribute getTARGETType_BUSINESSNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>COMPONENTVERSION</em>'.
     * @see Powrmart.TARGETType#getCOMPONENTVERSION()
     * @see #getTARGETType()
     * @generated
     */
    EAttribute getTARGETType_COMPONENTVERSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETType#getCONSTRAINT <em>CONSTRAINT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CONSTRAINT</em>'.
     * @see Powrmart.TARGETType#getCONSTRAINT()
     * @see #getTARGETType()
     * @generated
     */
    EAttribute getTARGETType_CONSTRAINT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETType#getCRCVALUE <em>CRCVALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CRCVALUE</em>'.
     * @see Powrmart.TARGETType#getCRCVALUE()
     * @see #getTARGETType()
     * @generated
     */
    EAttribute getTARGETType_CRCVALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETType#getDATABASETYPE <em>DATABASETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATABASETYPE</em>'.
     * @see Powrmart.TARGETType#getDATABASETYPE()
     * @see #getTARGETType()
     * @generated
     */
    EAttribute getTARGETType_DATABASETYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.TARGETType#getDESCRIPTION()
     * @see #getTARGETType()
     * @generated
     */
    EAttribute getTARGETType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.TARGETType#getNAME()
     * @see #getTARGETType()
     * @generated
     */
    EAttribute getTARGETType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETType#getOBJECTVERSION <em>OBJECTVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OBJECTVERSION</em>'.
     * @see Powrmart.TARGETType#getOBJECTVERSION()
     * @see #getTARGETType()
     * @generated
     */
    EAttribute getTARGETType_OBJECTVERSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETType#getTABLEOPTIONS <em>TABLEOPTIONS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TABLEOPTIONS</em>'.
     * @see Powrmart.TARGETType#getTABLEOPTIONS()
     * @see #getTARGETType()
     * @generated
     */
    EAttribute getTARGETType_TABLEOPTIONS();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETType#getTABLETYPE <em>TABLETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TABLETYPE</em>'.
     * @see Powrmart.TARGETType#getTABLETYPE()
     * @see #getTARGETType()
     * @generated
     */
    EAttribute getTARGETType_TABLETYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TARGETType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSIONNUMBER</em>'.
     * @see Powrmart.TARGETType#getVERSIONNUMBER()
     * @see #getTARGETType()
     * @generated
     */
    EAttribute getTARGETType_VERSIONNUMBER();

    /**
     * Returns the meta object for class '{@link Powrmart.TASKINSTANCEType <em>TASKINSTANCE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TASKINSTANCE Type</em>'.
     * @see Powrmart.TASKINSTANCEType
     * @generated
     */
    EClass getTASKINSTANCEType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TASKINSTANCEType#getATTRIBUTE <em>ATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ATTRIBUTE</em>'.
     * @see Powrmart.TASKINSTANCEType#getATTRIBUTE()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EReference getTASKINSTANCEType_ATTRIBUTE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TASKINSTANCEType#getWORKFLOWVARIABLE <em>WORKFLOWVARIABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>WORKFLOWVARIABLE</em>'.
     * @see Powrmart.TASKINSTANCEType#getWORKFLOWVARIABLE()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EReference getTASKINSTANCEType_WORKFLOWVARIABLE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TASKINSTANCEType#getVALUEPAIR <em>VALUEPAIR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>VALUEPAIR</em>'.
     * @see Powrmart.TASKINSTANCEType#getVALUEPAIR()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EReference getTASKINSTANCEType_VALUEPAIR();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.TASKINSTANCEType#getCONFIGREFERENCE <em>CONFIGREFERENCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>CONFIGREFERENCE</em>'.
     * @see Powrmart.TASKINSTANCEType#getCONFIGREFERENCE()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EReference getTASKINSTANCEType_CONFIGREFERENCE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TASKINSTANCEType#getSESSIONCOMPONENT <em>SESSIONCOMPONENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SESSIONCOMPONENT</em>'.
     * @see Powrmart.TASKINSTANCEType#getSESSIONCOMPONENT()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EReference getTASKINSTANCEType_SESSIONCOMPONENT();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TASKINSTANCEType#getSESSIONEXTENSION <em>SESSIONEXTENSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SESSIONEXTENSION</em>'.
     * @see Powrmart.TASKINSTANCEType#getSESSIONEXTENSION()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EReference getTASKINSTANCEType_SESSIONEXTENSION();

    /**
     * Returns the meta object for the attribute list '{@link Powrmart.TASKINSTANCEType#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see Powrmart.TASKINSTANCEType#getGroup()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EAttribute getTASKINSTANCEType_Group();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TASKINSTANCEType#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>RESOURCEREFERENCE</em>'.
     * @see Powrmart.TASKINSTANCEType#getRESOURCEREFERENCE()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EReference getTASKINSTANCEType_RESOURCEREFERENCE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TASKINSTANCEType#getTRANSFORMRESOURCEREF <em>TRANSFORMRESOURCEREF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TRANSFORMRESOURCEREF</em>'.
     * @see Powrmart.TASKINSTANCEType#getTRANSFORMRESOURCEREF()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EReference getTASKINSTANCEType_TRANSFORMRESOURCEREF();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKINSTANCEType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.TASKINSTANCEType#getDESCRIPTION()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EAttribute getTASKINSTANCEType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKINSTANCEType#getFAILPARENTIFINSTANCEDIDNOTRUN <em>FAILPARENTIFINSTANCEDIDNOTRUN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FAILPARENTIFINSTANCEDIDNOTRUN</em>'.
     * @see Powrmart.TASKINSTANCEType#getFAILPARENTIFINSTANCEDIDNOTRUN()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EAttribute getTASKINSTANCEType_FAILPARENTIFINSTANCEDIDNOTRUN();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKINSTANCEType#getFAILPARENTIFINSTANCEFAILS <em>FAILPARENTIFINSTANCEFAILS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FAILPARENTIFINSTANCEFAILS</em>'.
     * @see Powrmart.TASKINSTANCEType#getFAILPARENTIFINSTANCEFAILS()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EAttribute getTASKINSTANCEType_FAILPARENTIFINSTANCEFAILS();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKINSTANCEType#getISENABLED <em>ISENABLED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISENABLED</em>'.
     * @see Powrmart.TASKINSTANCEType#getISENABLED()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EAttribute getTASKINSTANCEType_ISENABLED();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKINSTANCEType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.TASKINSTANCEType#getNAME()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EAttribute getTASKINSTANCEType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKINSTANCEType#getREUSABLE <em>REUSABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REUSABLE</em>'.
     * @see Powrmart.TASKINSTANCEType#getREUSABLE()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EAttribute getTASKINSTANCEType_REUSABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKINSTANCEType#getSERVEROVERRIDE <em>SERVEROVERRIDE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SERVEROVERRIDE</em>'.
     * @see Powrmart.TASKINSTANCEType#getSERVEROVERRIDE()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EAttribute getTASKINSTANCEType_SERVEROVERRIDE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKINSTANCEType#getTASKNAME <em>TASKNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TASKNAME</em>'.
     * @see Powrmart.TASKINSTANCEType#getTASKNAME()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EAttribute getTASKINSTANCEType_TASKNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKINSTANCEType#getTASKTYPE <em>TASKTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TASKTYPE</em>'.
     * @see Powrmart.TASKINSTANCEType#getTASKTYPE()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EAttribute getTASKINSTANCEType_TASKTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKINSTANCEType#getTREATINPUTLINKASAND <em>TREATINPUTLINKASAND</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TREATINPUTLINKASAND</em>'.
     * @see Powrmart.TASKINSTANCEType#getTREATINPUTLINKASAND()
     * @see #getTASKINSTANCEType()
     * @generated
     */
    EAttribute getTASKINSTANCEType_TREATINPUTLINKASAND();

    /**
     * Returns the meta object for class '{@link Powrmart.TASKType <em>TASK Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TASK Type</em>'.
     * @see Powrmart.TASKType
     * @generated
     */
    EClass getTASKType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TASKType#getATTRIBUTE <em>ATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ATTRIBUTE</em>'.
     * @see Powrmart.TASKType#getATTRIBUTE()
     * @see #getTASKType()
     * @generated
     */
    EReference getTASKType_ATTRIBUTE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TASKType#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>EXPRMACRODEPENDENCY</em>'.
     * @see Powrmart.TASKType#getEXPRMACRODEPENDENCY()
     * @see #getTASKType()
     * @generated
     */
    EReference getTASKType_EXPRMACRODEPENDENCY();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.TASKType#getTIMER <em>TIMER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>TIMER</em>'.
     * @see Powrmart.TASKType#getTIMER()
     * @see #getTASKType()
     * @generated
     */
    EReference getTASKType_TIMER();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TASKType#getVALUEPAIR <em>VALUEPAIR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>VALUEPAIR</em>'.
     * @see Powrmart.TASKType#getVALUEPAIR()
     * @see #getTASKType()
     * @generated
     */
    EReference getTASKType_VALUEPAIR();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TASKType#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>RESOURCEREFERENCE</em>'.
     * @see Powrmart.TASKType#getRESOURCEREFERENCE()
     * @see #getTASKType()
     * @generated
     */
    EReference getTASKType_RESOURCEREFERENCE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.TASKType#getDESCRIPTION()
     * @see #getTASKType()
     * @generated
     */
    EAttribute getTASKType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.TASKType#getNAME()
     * @see #getTASKType()
     * @generated
     */
    EAttribute getTASKType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKType#getPARENT <em>PARENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARENT</em>'.
     * @see Powrmart.TASKType#getPARENT()
     * @see #getTASKType()
     * @generated
     */
    EAttribute getTASKType_PARENT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKType#getPARENTTYPE <em>PARENTTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARENTTYPE</em>'.
     * @see Powrmart.TASKType#getPARENTTYPE()
     * @see #getTASKType()
     * @generated
     */
    EAttribute getTASKType_PARENTTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKType#getREUSABLE <em>REUSABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REUSABLE</em>'.
     * @see Powrmart.TASKType#getREUSABLE()
     * @see #getTASKType()
     * @generated
     */
    EAttribute getTASKType_REUSABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.TASKType#getTYPE()
     * @see #getTASKType()
     * @generated
     */
    EAttribute getTASKType_TYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TASKType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSIONNUMBER</em>'.
     * @see Powrmart.TASKType#getVERSIONNUMBER()
     * @see #getTASKType()
     * @generated
     */
    EAttribute getTASKType_VERSIONNUMBER();

    /**
     * Returns the meta object for class '{@link Powrmart.TIMERType <em>TIMER Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TIMER Type</em>'.
     * @see Powrmart.TIMERType
     * @generated
     */
    EClass getTIMERType();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.TIMERType#getSTARTOPTIONS <em>STARTOPTIONS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>STARTOPTIONS</em>'.
     * @see Powrmart.TIMERType#getSTARTOPTIONS()
     * @see #getTIMERType()
     * @generated
     */
    EReference getTIMERType_STARTOPTIONS();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.TIMERType#getRECURRING <em>RECURRING</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>RECURRING</em>'.
     * @see Powrmart.TIMERType#getRECURRING()
     * @see #getTIMERType()
     * @generated
     */
    EReference getTIMERType_RECURRING();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TIMERType#getTIMERTYPE <em>TIMERTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TIMERTYPE</em>'.
     * @see Powrmart.TIMERType#getTIMERTYPE()
     * @see #getTIMERType()
     * @generated
     */
    EAttribute getTIMERType_TIMERTYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.TRANSFORMATIONType <em>TRANSFORMATION Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TRANSFORMATION Type</em>'.
     * @see Powrmart.TRANSFORMATIONType
     * @generated
     */
    EClass getTRANSFORMATIONType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TRANSFORMATIONType#getGROUP <em>GROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>GROUP</em>'.
     * @see Powrmart.TRANSFORMATIONType#getGROUP()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EReference getTRANSFORMATIONType_GROUP();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TRANSFORMATIONType#getSOURCEFIELD <em>SOURCEFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SOURCEFIELD</em>'.
     * @see Powrmart.TRANSFORMATIONType#getSOURCEFIELD()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EReference getTRANSFORMATIONType_SOURCEFIELD();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TRANSFORMATIONType#getTRANSFORMFIELD <em>TRANSFORMFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TRANSFORMFIELD</em>'.
     * @see Powrmart.TRANSFORMATIONType#getTRANSFORMFIELD()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EReference getTRANSFORMATIONType_TRANSFORMFIELD();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TRANSFORMATIONType#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TABLEATTRIBUTE</em>'.
     * @see Powrmart.TRANSFORMATIONType#getTABLEATTRIBUTE()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EReference getTRANSFORMATIONType_TABLEATTRIBUTE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TRANSFORMATIONType#getINITPROP <em>INITPROP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>INITPROP</em>'.
     * @see Powrmart.TRANSFORMATIONType#getINITPROP()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EReference getTRANSFORMATIONType_INITPROP();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TRANSFORMATIONType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>METADATAEXTENSION</em>'.
     * @see Powrmart.TRANSFORMATIONType#getMETADATAEXTENSION()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EReference getTRANSFORMATIONType_METADATAEXTENSION();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TRANSFORMATIONType#getTRANSFORMFIELDATTRDEF <em>TRANSFORMFIELDATTRDEF</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TRANSFORMFIELDATTRDEF</em>'.
     * @see Powrmart.TRANSFORMATIONType#getTRANSFORMFIELDATTRDEF()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EReference getTRANSFORMATIONType_TRANSFORMFIELDATTRDEF();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TRANSFORMATIONType#getFIELDDEPENDENCY <em>FIELDDEPENDENCY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>FIELDDEPENDENCY</em>'.
     * @see Powrmart.TRANSFORMATIONType#getFIELDDEPENDENCY()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EReference getTRANSFORMATIONType_FIELDDEPENDENCY();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.TRANSFORMATIONType#getFLATFILE <em>FLATFILE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>FLATFILE</em>'.
     * @see Powrmart.TRANSFORMATIONType#getFLATFILE()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EReference getTRANSFORMATIONType_FLATFILE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TRANSFORMATIONType#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>EXPRMACRODEPENDENCY</em>'.
     * @see Powrmart.TRANSFORMATIONType#getEXPRMACRODEPENDENCY()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EReference getTRANSFORMATIONType_EXPRMACRODEPENDENCY();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>COMPONENTVERSION</em>'.
     * @see Powrmart.TRANSFORMATIONType#getCOMPONENTVERSION()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_COMPONENTVERSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getCRCVALUE <em>CRCVALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CRCVALUE</em>'.
     * @see Powrmart.TRANSFORMATIONType#getCRCVALUE()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_CRCVALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.TRANSFORMATIONType#getDESCRIPTION()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getISVSAMNORMALIZER <em>ISVSAMNORMALIZER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISVSAMNORMALIZER</em>'.
     * @see Powrmart.TRANSFORMATIONType#getISVSAMNORMALIZER()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_ISVSAMNORMALIZER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.TRANSFORMATIONType#getNAME()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getOBJECTVERSION <em>OBJECTVERSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OBJECTVERSION</em>'.
     * @see Powrmart.TRANSFORMATIONType#getOBJECTVERSION()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_OBJECTVERSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getPARENT <em>PARENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARENT</em>'.
     * @see Powrmart.TRANSFORMATIONType#getPARENT()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_PARENT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getPARENTTYPE <em>PARENTTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARENTTYPE</em>'.
     * @see Powrmart.TRANSFORMATIONType#getPARENTTYPE()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_PARENTTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getREFDBDNAME <em>REFDBDNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFDBDNAME</em>'.
     * @see Powrmart.TRANSFORMATIONType#getREFDBDNAME()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_REFDBDNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getREFSOURCENAME <em>REFSOURCENAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFSOURCENAME</em>'.
     * @see Powrmart.TRANSFORMATIONType#getREFSOURCENAME()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_REFSOURCENAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getREUSABLE <em>REUSABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REUSABLE</em>'.
     * @see Powrmart.TRANSFORMATIONType#getREUSABLE()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_REUSABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getTEMPLATEID <em>TEMPLATEID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TEMPLATEID</em>'.
     * @see Powrmart.TRANSFORMATIONType#getTEMPLATEID()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_TEMPLATEID();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getTEMPLATENAME <em>TEMPLATENAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TEMPLATENAME</em>'.
     * @see Powrmart.TRANSFORMATIONType#getTEMPLATENAME()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_TEMPLATENAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.TRANSFORMATIONType#getTYPE()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_TYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMATIONType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSIONNUMBER</em>'.
     * @see Powrmart.TRANSFORMATIONType#getVERSIONNUMBER()
     * @see #getTRANSFORMATIONType()
     * @generated
     */
    EAttribute getTRANSFORMATIONType_VERSIONNUMBER();

    /**
     * Returns the meta object for class '{@link Powrmart.TRANSFORMFIELDATTRDEFType <em>TRANSFORMFIELDATTRDEF Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TRANSFORMFIELDATTRDEF Type</em>'.
     * @see Powrmart.TRANSFORMFIELDATTRDEFType
     * @generated
     */
    EClass getTRANSFORMFIELDATTRDEFType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDATTRDEFType#getDATATYPE <em>DATATYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATATYPE</em>'.
     * @see Powrmart.TRANSFORMFIELDATTRDEFType#getDATATYPE()
     * @see #getTRANSFORMFIELDATTRDEFType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDATTRDEFType_DATATYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDATTRDEFType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DEFAULTVALUE</em>'.
     * @see Powrmart.TRANSFORMFIELDATTRDEFType#getDEFAULTVALUE()
     * @see #getTRANSFORMFIELDATTRDEFType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDATTRDEFType_DEFAULTVALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDATTRDEFType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.TRANSFORMFIELDATTRDEFType#getDESCRIPTION()
     * @see #getTRANSFORMFIELDATTRDEFType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDATTRDEFType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDATTRDEFType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.TRANSFORMFIELDATTRDEFType#getNAME()
     * @see #getTRANSFORMFIELDATTRDEFType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDATTRDEFType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDATTRDEFType#getORDER <em>ORDER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ORDER</em>'.
     * @see Powrmart.TRANSFORMFIELDATTRDEFType#getORDER()
     * @see #getTRANSFORMFIELDATTRDEFType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDATTRDEFType_ORDER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDATTRDEFType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.TRANSFORMFIELDATTRDEFType#getTYPE()
     * @see #getTRANSFORMFIELDATTRDEFType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDATTRDEFType_TYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.TRANSFORMFIELDATTRType <em>TRANSFORMFIELDATTR Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TRANSFORMFIELDATTR Type</em>'.
     * @see Powrmart.TRANSFORMFIELDATTRType
     * @generated
     */
    EClass getTRANSFORMFIELDATTRType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDATTRType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.TRANSFORMFIELDATTRType#getNAME()
     * @see #getTRANSFORMFIELDATTRType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDATTRType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDATTRType#getVALUE <em>VALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUE</em>'.
     * @see Powrmart.TRANSFORMFIELDATTRType#getVALUE()
     * @see #getTRANSFORMFIELDATTRType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDATTRType_VALUE();

    /**
     * Returns the meta object for class '{@link Powrmart.TRANSFORMFIELDType <em>TRANSFORMFIELD Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TRANSFORMFIELD Type</em>'.
     * @see Powrmart.TRANSFORMFIELDType
     * @generated
     */
    EClass getTRANSFORMFIELDType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TRANSFORMFIELDType#getTRANSFORMFIELDATTR <em>TRANSFORMFIELDATTR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TRANSFORMFIELDATTR</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getTRANSFORMFIELDATTR()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EReference getTRANSFORMFIELDType_TRANSFORMFIELDATTR();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getDATATYPE <em>DATATYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATATYPE</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getDATATYPE()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_DATATYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DEFAULTVALUE</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getDEFAULTVALUE()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_DEFAULTVALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getDESCRIPTION()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getEXPRESSION <em>EXPRESSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>EXPRESSION</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getEXPRESSION()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_EXPRESSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getEXPRESSIONDESCRIPTION <em>EXPRESSIONDESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>EXPRESSIONDESCRIPTION</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getEXPRESSIONDESCRIPTION()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_EXPRESSIONDESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getEXPRESSIONTYPE <em>EXPRESSIONTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>EXPRESSIONTYPE</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getEXPRESSIONTYPE()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_EXPRESSIONTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getFIELDNUMBER <em>FIELDNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FIELDNUMBER</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getFIELDNUMBER()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_FIELDNUMBER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getGROUP <em>GROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>GROUP</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getGROUP()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_GROUP();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getIGNOREINCOMPARE <em>IGNOREINCOMPARE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>IGNOREINCOMPARE</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getIGNOREINCOMPARE()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_IGNOREINCOMPARE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getIGNORENULLINPUTS <em>IGNORENULLINPUTS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>IGNORENULLINPUTS</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getIGNORENULLINPUTS()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_IGNORENULLINPUTS();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getISSORTKEY <em>ISSORTKEY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISSORTKEY</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getISSORTKEY()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_ISSORTKEY();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getMAPPLETGROUP <em>MAPPLETGROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>MAPPLETGROUP</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getMAPPLETGROUP()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_MAPPLETGROUP();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getNAME()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getOUTPUTGROUP <em>OUTPUTGROUP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>OUTPUTGROUP</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getOUTPUTGROUP()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_OUTPUTGROUP();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getPICTURETEXT <em>PICTURETEXT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PICTURETEXT</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getPICTURETEXT()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_PICTURETEXT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getPORTTYPE <em>PORTTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PORTTYPE</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getPORTTYPE()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_PORTTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getPRECISION <em>PRECISION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PRECISION</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getPRECISION()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_PRECISION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getREFFIELD <em>REFFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFFIELD</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getREFFIELD()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_REFFIELD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getREFINSTANCETYPE <em>REFINSTANCETYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFINSTANCETYPE</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getREFINSTANCETYPE()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_REFINSTANCETYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getREFSOURCEFIELD <em>REFSOURCEFIELD</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFSOURCEFIELD</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getREFSOURCEFIELD()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_REFSOURCEFIELD();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getREFTRANSFORMATION <em>REFTRANSFORMATION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REFTRANSFORMATION</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getREFTRANSFORMATION()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_REFTRANSFORMATION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getSCALE <em>SCALE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SCALE</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getSCALE()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_SCALE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getSEQUENCEGENERATORVALUE <em>SEQUENCEGENERATORVALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SEQUENCEGENERATORVALUE</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getSEQUENCEGENERATORVALUE()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_SEQUENCEGENERATORVALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMFIELDType#getSORTDIRECTION <em>SORTDIRECTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SORTDIRECTION</em>'.
     * @see Powrmart.TRANSFORMFIELDType#getSORTDIRECTION()
     * @see #getTRANSFORMFIELDType()
     * @generated
     */
    EAttribute getTRANSFORMFIELDType_SORTDIRECTION();

    /**
     * Returns the meta object for class '{@link Powrmart.TRANSFORMRESOURCEREFType <em>TRANSFORMRESOURCEREF Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>TRANSFORMRESOURCEREF Type</em>'.
     * @see Powrmart.TRANSFORMRESOURCEREFType
     * @generated
     */
    EClass getTRANSFORMRESOURCEREFType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.TRANSFORMRESOURCEREFType#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>RESOURCEREFERENCE</em>'.
     * @see Powrmart.TRANSFORMRESOURCEREFType#getRESOURCEREFERENCE()
     * @see #getTRANSFORMRESOURCEREFType()
     * @generated
     */
    EReference getTRANSFORMRESOURCEREFType_RESOURCEREFERENCE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMRESOURCEREFType#getSINSTANCENAME <em>SINSTANCENAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SINSTANCENAME</em>'.
     * @see Powrmart.TRANSFORMRESOURCEREFType#getSINSTANCENAME()
     * @see #getTRANSFORMRESOURCEREFType()
     * @generated
     */
    EAttribute getTRANSFORMRESOURCEREFType_SINSTANCENAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.TRANSFORMRESOURCEREFType#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TRANSFORMATIONTYPE</em>'.
     * @see Powrmart.TRANSFORMRESOURCEREFType#getTRANSFORMATIONTYPE()
     * @see #getTRANSFORMRESOURCEREFType()
     * @generated
     */
    EAttribute getTRANSFORMRESOURCEREFType_TRANSFORMATIONTYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.VALUEPAIRType <em>VALUEPAIR Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>VALUEPAIR Type</em>'.
     * @see Powrmart.VALUEPAIRType
     * @generated
     */
    EClass getVALUEPAIRType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.VALUEPAIRType#getCOMMENTS <em>COMMENTS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>COMMENTS</em>'.
     * @see Powrmart.VALUEPAIRType#getCOMMENTS()
     * @see #getVALUEPAIRType()
     * @generated
     */
    EAttribute getVALUEPAIRType_COMMENTS();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.VALUEPAIRType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.VALUEPAIRType#getNAME()
     * @see #getVALUEPAIRType()
     * @generated
     */
    EAttribute getVALUEPAIRType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.VALUEPAIRType#getREVERSEASSIGNMENT <em>REVERSEASSIGNMENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REVERSEASSIGNMENT</em>'.
     * @see Powrmart.VALUEPAIRType#getREVERSEASSIGNMENT()
     * @see #getVALUEPAIRType()
     * @generated
     */
    EAttribute getVALUEPAIRType_REVERSEASSIGNMENT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.VALUEPAIRType#getVALUE <em>VALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VALUE</em>'.
     * @see Powrmart.VALUEPAIRType#getVALUE()
     * @see #getVALUEPAIRType()
     * @generated
     */
    EAttribute getVALUEPAIRType_VALUE();

    /**
     * Returns the meta object for class '{@link Powrmart.WORKFLOWEVENTType <em>WORKFLOWEVENT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WORKFLOWEVENT Type</em>'.
     * @see Powrmart.WORKFLOWEVENTType
     * @generated
     */
    EClass getWORKFLOWEVENTType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWEVENTType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.WORKFLOWEVENTType#getDESCRIPTION()
     * @see #getWORKFLOWEVENTType()
     * @generated
     */
    EAttribute getWORKFLOWEVENTType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWEVENTType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.WORKFLOWEVENTType#getNAME()
     * @see #getWORKFLOWEVENTType()
     * @generated
     */
    EAttribute getWORKFLOWEVENTType_NAME();

    /**
     * Returns the meta object for class '{@link Powrmart.WORKFLOWLINKType <em>WORKFLOWLINK Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WORKFLOWLINK Type</em>'.
     * @see Powrmart.WORKFLOWLINKType
     * @generated
     */
    EClass getWORKFLOWLINKType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKFLOWLINKType#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>EXPRMACRODEPENDENCY</em>'.
     * @see Powrmart.WORKFLOWLINKType#getEXPRMACRODEPENDENCY()
     * @see #getWORKFLOWLINKType()
     * @generated
     */
    EReference getWORKFLOWLINKType_EXPRMACRODEPENDENCY();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWLINKType#getCONDITION <em>CONDITION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CONDITION</em>'.
     * @see Powrmart.WORKFLOWLINKType#getCONDITION()
     * @see #getWORKFLOWLINKType()
     * @generated
     */
    EAttribute getWORKFLOWLINKType_CONDITION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWLINKType#getFROMTASK <em>FROMTASK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FROMTASK</em>'.
     * @see Powrmart.WORKFLOWLINKType#getFROMTASK()
     * @see #getWORKFLOWLINKType()
     * @generated
     */
    EAttribute getWORKFLOWLINKType_FROMTASK();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWLINKType#getTOTASK <em>TOTASK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TOTASK</em>'.
     * @see Powrmart.WORKFLOWLINKType#getTOTASK()
     * @see #getWORKFLOWLINKType()
     * @generated
     */
    EAttribute getWORKFLOWLINKType_TOTASK();

    /**
     * Returns the meta object for class '{@link Powrmart.WORKFLOWType <em>WORKFLOW Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WORKFLOW Type</em>'.
     * @see Powrmart.WORKFLOWType
     * @generated
     */
    EClass getWORKFLOWType();

    /**
     * Returns the meta object for the containment reference '{@link Powrmart.WORKFLOWType#getSCHEDULER <em>SCHEDULER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SCHEDULER</em>'.
     * @see Powrmart.WORKFLOWType#getSCHEDULER()
     * @see #getWORKFLOWType()
     * @generated
     */
    EReference getWORKFLOWType_SCHEDULER();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKFLOWType#getTASK <em>TASK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TASK</em>'.
     * @see Powrmart.WORKFLOWType#getTASK()
     * @see #getWORKFLOWType()
     * @generated
     */
    EReference getWORKFLOWType_TASK();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKFLOWType#getSESSION <em>SESSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SESSION</em>'.
     * @see Powrmart.WORKFLOWType#getSESSION()
     * @see #getWORKFLOWType()
     * @generated
     */
    EReference getWORKFLOWType_SESSION();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKFLOWType#getWORKLET <em>WORKLET</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>WORKLET</em>'.
     * @see Powrmart.WORKFLOWType#getWORKLET()
     * @see #getWORKFLOWType()
     * @generated
     */
    EReference getWORKFLOWType_WORKLET();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKFLOWType#getTASKINSTANCE <em>TASKINSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TASKINSTANCE</em>'.
     * @see Powrmart.WORKFLOWType#getTASKINSTANCE()
     * @see #getWORKFLOWType()
     * @generated
     */
    EReference getWORKFLOWType_TASKINSTANCE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKFLOWType#getWORKFLOWLINK <em>WORKFLOWLINK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>WORKFLOWLINK</em>'.
     * @see Powrmart.WORKFLOWType#getWORKFLOWLINK()
     * @see #getWORKFLOWType()
     * @generated
     */
    EReference getWORKFLOWType_WORKFLOWLINK();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKFLOWType#getWORKFLOWVARIABLE <em>WORKFLOWVARIABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>WORKFLOWVARIABLE</em>'.
     * @see Powrmart.WORKFLOWType#getWORKFLOWVARIABLE()
     * @see #getWORKFLOWType()
     * @generated
     */
    EReference getWORKFLOWType_WORKFLOWVARIABLE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKFLOWType#getWORKFLOWEVENT <em>WORKFLOWEVENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>WORKFLOWEVENT</em>'.
     * @see Powrmart.WORKFLOWType#getWORKFLOWEVENT()
     * @see #getWORKFLOWType()
     * @generated
     */
    EReference getWORKFLOWType_WORKFLOWEVENT();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKFLOWType#getATTRIBUTE <em>ATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ATTRIBUTE</em>'.
     * @see Powrmart.WORKFLOWType#getATTRIBUTE()
     * @see #getWORKFLOWType()
     * @generated
     */
    EReference getWORKFLOWType_ATTRIBUTE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKFLOWType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>METADATAEXTENSION</em>'.
     * @see Powrmart.WORKFLOWType#getMETADATAEXTENSION()
     * @see #getWORKFLOWType()
     * @generated
     */
    EReference getWORKFLOWType_METADATAEXTENSION();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKFLOWType#getCONWFRUNINFO <em>CONWFRUNINFO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>CONWFRUNINFO</em>'.
     * @see Powrmart.WORKFLOWType#getCONWFRUNINFO()
     * @see #getWORKFLOWType()
     * @generated
     */
    EReference getWORKFLOWType_CONWFRUNINFO();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.WORKFLOWType#getDESCRIPTION()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getISENABLED <em>ISENABLED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISENABLED</em>'.
     * @see Powrmart.WORKFLOWType#getISENABLED()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_ISENABLED();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getISRUNNABLESERVICE <em>ISRUNNABLESERVICE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISRUNNABLESERVICE</em>'.
     * @see Powrmart.WORKFLOWType#getISRUNNABLESERVICE()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_ISRUNNABLESERVICE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getISSERVICE <em>ISSERVICE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISSERVICE</em>'.
     * @see Powrmart.WORKFLOWType#getISSERVICE()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_ISSERVICE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getISVALID <em>ISVALID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISVALID</em>'.
     * @see Powrmart.WORKFLOWType#getISVALID()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_ISVALID();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.WORKFLOWType#getNAME()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getREUSABLESCHEDULER <em>REUSABLESCHEDULER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REUSABLESCHEDULER</em>'.
     * @see Powrmart.WORKFLOWType#getREUSABLESCHEDULER()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_REUSABLESCHEDULER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getSCHEDULERNAME <em>SCHEDULERNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SCHEDULERNAME</em>'.
     * @see Powrmart.WORKFLOWType#getSCHEDULERNAME()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_SCHEDULERNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getSERVERDOMAINNAME <em>SERVERDOMAINNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SERVERDOMAINNAME</em>'.
     * @see Powrmart.WORKFLOWType#getSERVERDOMAINNAME()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_SERVERDOMAINNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getSERVERNAME <em>SERVERNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SERVERNAME</em>'.
     * @see Powrmart.WORKFLOWType#getSERVERNAME()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_SERVERNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getSERVICELEVELNAME <em>SERVICELEVELNAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SERVICELEVELNAME</em>'.
     * @see Powrmart.WORKFLOWType#getSERVICELEVELNAME()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_SERVICELEVELNAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getSUSPENDONERROR <em>SUSPENDONERROR</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SUSPENDONERROR</em>'.
     * @see Powrmart.WORKFLOWType#getSUSPENDONERROR()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_SUSPENDONERROR();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getSUSPENSIONEMAIL <em>SUSPENSIONEMAIL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SUSPENSIONEMAIL</em>'.
     * @see Powrmart.WORKFLOWType#getSUSPENSIONEMAIL()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_SUSPENSIONEMAIL();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getTASKSMUSTRUNONSERVER <em>TASKSMUSTRUNONSERVER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TASKSMUSTRUNONSERVER</em>'.
     * @see Powrmart.WORKFLOWType#getTASKSMUSTRUNONSERVER()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_TASKSMUSTRUNONSERVER();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSIONNUMBER</em>'.
     * @see Powrmart.WORKFLOWType#getVERSIONNUMBER()
     * @see #getWORKFLOWType()
     * @generated
     */
    EAttribute getWORKFLOWType_VERSIONNUMBER();

    /**
     * Returns the meta object for class '{@link Powrmart.WORKFLOWVARIABLEType <em>WORKFLOWVARIABLE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WORKFLOWVARIABLE Type</em>'.
     * @see Powrmart.WORKFLOWVARIABLEType
     * @generated
     */
    EClass getWORKFLOWVARIABLEType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWVARIABLEType#getDATATYPE <em>DATATYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DATATYPE</em>'.
     * @see Powrmart.WORKFLOWVARIABLEType#getDATATYPE()
     * @see #getWORKFLOWVARIABLEType()
     * @generated
     */
    EAttribute getWORKFLOWVARIABLEType_DATATYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWVARIABLEType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DEFAULTVALUE</em>'.
     * @see Powrmart.WORKFLOWVARIABLEType#getDEFAULTVALUE()
     * @see #getWORKFLOWVARIABLEType()
     * @generated
     */
    EAttribute getWORKFLOWVARIABLEType_DEFAULTVALUE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWVARIABLEType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.WORKFLOWVARIABLEType#getDESCRIPTION()
     * @see #getWORKFLOWVARIABLEType()
     * @generated
     */
    EAttribute getWORKFLOWVARIABLEType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWVARIABLEType#getISNULL <em>ISNULL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISNULL</em>'.
     * @see Powrmart.WORKFLOWVARIABLEType#getISNULL()
     * @see #getWORKFLOWVARIABLEType()
     * @generated
     */
    EAttribute getWORKFLOWVARIABLEType_ISNULL();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWVARIABLEType#getISPERSISTENT <em>ISPERSISTENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISPERSISTENT</em>'.
     * @see Powrmart.WORKFLOWVARIABLEType#getISPERSISTENT()
     * @see #getWORKFLOWVARIABLEType()
     * @generated
     */
    EAttribute getWORKFLOWVARIABLEType_ISPERSISTENT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWVARIABLEType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.WORKFLOWVARIABLEType#getNAME()
     * @see #getWORKFLOWVARIABLEType()
     * @generated
     */
    EAttribute getWORKFLOWVARIABLEType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKFLOWVARIABLEType#getUSERDEFINED <em>USERDEFINED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>USERDEFINED</em>'.
     * @see Powrmart.WORKFLOWVARIABLEType#getUSERDEFINED()
     * @see #getWORKFLOWVARIABLEType()
     * @generated
     */
    EAttribute getWORKFLOWVARIABLEType_USERDEFINED();

    /**
     * Returns the meta object for class '{@link Powrmart.WORKLETType <em>WORKLET Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WORKLET Type</em>'.
     * @see Powrmart.WORKLETType
     * @generated
     */
    EClass getWORKLETType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKLETType#getTASK <em>TASK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TASK</em>'.
     * @see Powrmart.WORKLETType#getTASK()
     * @see #getWORKLETType()
     * @generated
     */
    EReference getWORKLETType_TASK();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKLETType#getSESSION <em>SESSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SESSION</em>'.
     * @see Powrmart.WORKLETType#getSESSION()
     * @see #getWORKLETType()
     * @generated
     */
    EReference getWORKLETType_SESSION();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKLETType#getWORKLET <em>WORKLET</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>WORKLET</em>'.
     * @see Powrmart.WORKLETType#getWORKLET()
     * @see #getWORKLETType()
     * @generated
     */
    EReference getWORKLETType_WORKLET();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKLETType#getTASKINSTANCE <em>TASKINSTANCE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>TASKINSTANCE</em>'.
     * @see Powrmart.WORKLETType#getTASKINSTANCE()
     * @see #getWORKLETType()
     * @generated
     */
    EReference getWORKLETType_TASKINSTANCE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKLETType#getWORKFLOWLINK <em>WORKFLOWLINK</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>WORKFLOWLINK</em>'.
     * @see Powrmart.WORKLETType#getWORKFLOWLINK()
     * @see #getWORKLETType()
     * @generated
     */
    EReference getWORKLETType_WORKFLOWLINK();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKLETType#getWORKFLOWVARIABLE <em>WORKFLOWVARIABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>WORKFLOWVARIABLE</em>'.
     * @see Powrmart.WORKLETType#getWORKFLOWVARIABLE()
     * @see #getWORKLETType()
     * @generated
     */
    EReference getWORKLETType_WORKFLOWVARIABLE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKLETType#getWORKFLOWEVENT <em>WORKFLOWEVENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>WORKFLOWEVENT</em>'.
     * @see Powrmart.WORKLETType#getWORKFLOWEVENT()
     * @see #getWORKLETType()
     * @generated
     */
    EReference getWORKLETType_WORKFLOWEVENT();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKLETType#getATTRIBUTE <em>ATTRIBUTE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>ATTRIBUTE</em>'.
     * @see Powrmart.WORKLETType#getATTRIBUTE()
     * @see #getWORKLETType()
     * @generated
     */
    EReference getWORKLETType_ATTRIBUTE();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.WORKLETType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>METADATAEXTENSION</em>'.
     * @see Powrmart.WORKLETType#getMETADATAEXTENSION()
     * @see #getWORKLETType()
     * @generated
     */
    EReference getWORKLETType_METADATAEXTENSION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKLETType#getDESCRIPTION <em>DESCRIPTION</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DESCRIPTION</em>'.
     * @see Powrmart.WORKLETType#getDESCRIPTION()
     * @see #getWORKLETType()
     * @generated
     */
    EAttribute getWORKLETType_DESCRIPTION();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKLETType#getISVALID <em>ISVALID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ISVALID</em>'.
     * @see Powrmart.WORKLETType#getISVALID()
     * @see #getWORKLETType()
     * @generated
     */
    EAttribute getWORKLETType_ISVALID();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKLETType#getNAME <em>NAME</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAME</em>'.
     * @see Powrmart.WORKLETType#getNAME()
     * @see #getWORKLETType()
     * @generated
     */
    EAttribute getWORKLETType_NAME();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKLETType#getPARENT <em>PARENT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARENT</em>'.
     * @see Powrmart.WORKLETType#getPARENT()
     * @see #getWORKLETType()
     * @generated
     */
    EAttribute getWORKLETType_PARENT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKLETType#getPARENTTYPE <em>PARENTTYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PARENTTYPE</em>'.
     * @see Powrmart.WORKLETType#getPARENTTYPE()
     * @see #getWORKLETType()
     * @generated
     */
    EAttribute getWORKLETType_PARENTTYPE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKLETType#getREUSABLE <em>REUSABLE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>REUSABLE</em>'.
     * @see Powrmart.WORKLETType#getREUSABLE()
     * @see #getWORKLETType()
     * @generated
     */
    EAttribute getWORKLETType_REUSABLE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.WORKLETType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VERSIONNUMBER</em>'.
     * @see Powrmart.WORKLETType#getVERSIONNUMBER()
     * @see #getWORKLETType()
     * @generated
     */
    EAttribute getWORKLETType_VERSIONNUMBER();

    /**
     * Returns the meta object for class '{@link Powrmart.XMLINFOType <em>XMLINFO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XMLINFO Type</em>'.
     * @see Powrmart.XMLINFOType
     * @generated
     */
    EClass getXMLINFOType();

    /**
     * Returns the meta object for the containment reference list '{@link Powrmart.XMLINFOType#getXMLTEXT <em>XMLTEXT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>XMLTEXT</em>'.
     * @see Powrmart.XMLINFOType#getXMLTEXT()
     * @see #getXMLINFOType()
     * @generated
     */
    EReference getXMLINFOType_XMLTEXT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.XMLINFOType#getTEXT <em>TEXT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TEXT</em>'.
     * @see Powrmart.XMLINFOType#getTEXT()
     * @see #getXMLINFOType()
     * @generated
     */
    EAttribute getXMLINFOType_TEXT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.XMLINFOType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.XMLINFOType#getTYPE()
     * @see #getXMLINFOType()
     * @generated
     */
    EAttribute getXMLINFOType_TYPE();

    /**
     * Returns the meta object for class '{@link Powrmart.XMLTEXTType <em>XMLTEXT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XMLTEXT Type</em>'.
     * @see Powrmart.XMLTEXTType
     * @generated
     */
    EClass getXMLTEXTType();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.XMLTEXTType#getNAMESPACE <em>NAMESPACE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NAMESPACE</em>'.
     * @see Powrmart.XMLTEXTType#getNAMESPACE()
     * @see #getXMLTEXTType()
     * @generated
     */
    EAttribute getXMLTEXTType_NAMESPACE();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.XMLTEXTType#getTEXT <em>TEXT</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TEXT</em>'.
     * @see Powrmart.XMLTEXTType#getTEXT()
     * @see #getXMLTEXTType()
     * @generated
     */
    EAttribute getXMLTEXTType_TEXT();

    /**
     * Returns the meta object for the attribute '{@link Powrmart.XMLTEXTType#getTYPE <em>TYPE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>TYPE</em>'.
     * @see Powrmart.XMLTEXTType#getTYPE()
     * @see #getXMLTEXTType()
     * @generated
     */
    EAttribute getXMLTEXTType_TYPE();

    /**
     * Returns the meta object for enum '{@link Powrmart.AGGFUNCTIONType <em>AGGFUNCTION Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>AGGFUNCTION Type</em>'.
     * @see Powrmart.AGGFUNCTIONType
     * @generated
     */
    EEnum getAGGFUNCTIONType();

    /**
     * Returns the meta object for enum '{@link Powrmart.DATATYPEType <em>DATATYPE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>DATATYPE Type</em>'.
     * @see Powrmart.DATATYPEType
     * @generated
     */
    EEnum getDATATYPEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.DAYType <em>DAY Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>DAY Type</em>'.
     * @see Powrmart.DAYType
     * @generated
     */
    EEnum getDAYType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ENDTYPEType <em>ENDTYPE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ENDTYPE Type</em>'.
     * @see Powrmart.ENDTYPEType
     * @generated
     */
    EEnum getENDTYPEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.FAILPARENTIFINSTANCEDIDNOTRUNType <em>FAILPARENTIFINSTANCEDIDNOTRUN Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>FAILPARENTIFINSTANCEDIDNOTRUN Type</em>'.
     * @see Powrmart.FAILPARENTIFINSTANCEDIDNOTRUNType
     * @generated
     */
    EEnum getFAILPARENTIFINSTANCEDIDNOTRUNType();

    /**
     * Returns the meta object for enum '{@link Powrmart.FAILPARENTIFINSTANCEFAILSType <em>FAILPARENTIFINSTANCEFAILS Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>FAILPARENTIFINSTANCEFAILS Type</em>'.
     * @see Powrmart.FAILPARENTIFINSTANCEFAILSType
     * @generated
     */
    EEnum getFAILPARENTIFINSTANCEFAILSType();

    /**
     * Returns the meta object for enum '{@link Powrmart.IGNOREINCOMPAREType <em>IGNOREINCOMPARE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>IGNOREINCOMPARE Type</em>'.
     * @see Powrmart.IGNOREINCOMPAREType
     * @generated
     */
    EEnum getIGNOREINCOMPAREType();

    /**
     * Returns the meta object for enum '{@link Powrmart.IGNORENULLINPUTSType <em>IGNORENULLINPUTS Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>IGNORENULLINPUTS Type</em>'.
     * @see Powrmart.IGNORENULLINPUTSType
     * @generated
     */
    EEnum getIGNORENULLINPUTSType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISCLIENTEDITABLEType <em>ISCLIENTEDITABLE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISCLIENTEDITABLE Type</em>'.
     * @see Powrmart.ISCLIENTEDITABLEType
     * @generated
     */
    EEnum getISCLIENTEDITABLEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISCLIENTVISIBLEType <em>ISCLIENTVISIBLE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISCLIENTVISIBLE Type</em>'.
     * @see Powrmart.ISCLIENTVISIBLEType
     * @generated
     */
    EEnum getISCLIENTVISIBLEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISDEFAULTType <em>ISDEFAULT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISDEFAULT Type</em>'.
     * @see Powrmart.ISDEFAULTType
     * @generated
     */
    EEnum getISDEFAULTType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISENABLEDType <em>ISENABLED Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISENABLED Type</em>'.
     * @see Powrmart.ISENABLEDType
     * @generated
     */
    EEnum getISENABLEDType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISENABLEDType1 <em>ISENABLED Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISENABLED Type1</em>'.
     * @see Powrmart.ISENABLEDType1
     * @generated
     */
    EEnum getISENABLEDType1();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISEXPRESSIONVARIABLEType <em>ISEXPRESSIONVARIABLE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISEXPRESSIONVARIABLE Type</em>'.
     * @see Powrmart.ISEXPRESSIONVARIABLEType
     * @generated
     */
    EEnum getISEXPRESSIONVARIABLEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISFILENAMEFIELDType <em>ISFILENAMEFIELD Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISFILENAMEFIELD Type</em>'.
     * @see Powrmart.ISFILENAMEFIELDType
     * @generated
     */
    EEnum getISFILENAMEFIELDType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISNONEType <em>ISNONE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISNONE Type</em>'.
     * @see Powrmart.ISNONEType
     * @generated
     */
    EEnum getISNONEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISNULLType <em>ISNULL Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISNULL Type</em>'.
     * @see Powrmart.ISNULLType
     * @generated
     */
    EEnum getISNULLType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISOPTIONALType <em>ISOPTIONAL Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISOPTIONAL Type</em>'.
     * @see Powrmart.ISOPTIONALType
     * @generated
     */
    EEnum getISOPTIONALType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISOPTIONALType1 <em>ISOPTIONAL Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISOPTIONAL Type1</em>'.
     * @see Powrmart.ISOPTIONALType1
     * @generated
     */
    EEnum getISOPTIONALType1();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISOUTPUTPORTType <em>ISOUTPUTPORT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISOUTPUTPORT Type</em>'.
     * @see Powrmart.ISOUTPUTPORTType
     * @generated
     */
    EEnum getISOUTPUTPORTType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISPARAMType <em>ISPARAM Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISPARAM Type</em>'.
     * @see Powrmart.ISPARAMType
     * @generated
     */
    EEnum getISPARAMType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISPERSISTENTType <em>ISPERSISTENT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISPERSISTENT Type</em>'.
     * @see Powrmart.ISPERSISTENTType
     * @generated
     */
    EEnum getISPERSISTENTType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISPROFILEMAPPINGType <em>ISPROFILEMAPPING Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISPROFILEMAPPING Type</em>'.
     * @see Powrmart.ISPROFILEMAPPINGType
     * @generated
     */
    EEnum getISPROFILEMAPPINGType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISREFERENCEType <em>ISREFERENCE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISREFERENCE Type</em>'.
     * @see Powrmart.ISREFERENCEType
     * @generated
     */
    EEnum getISREFERENCEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISREPARTITIONPOINTType <em>ISREPARTITIONPOINT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISREPARTITIONPOINT Type</em>'.
     * @see Powrmart.ISREPARTITIONPOINTType
     * @generated
     */
    EEnum getISREPARTITIONPOINTType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISREUSABLEType <em>ISREUSABLE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISREUSABLE Type</em>'.
     * @see Powrmart.ISREUSABLEType
     * @generated
     */
    EEnum getISREUSABLEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISRUNNABLESERVICEType <em>ISRUNNABLESERVICE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISRUNNABLESERVICE Type</em>'.
     * @see Powrmart.ISRUNNABLESERVICEType
     * @generated
     */
    EEnum getISRUNNABLESERVICEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISSERVICEType <em>ISSERVICE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISSERVICE Type</em>'.
     * @see Powrmart.ISSERVICEType
     * @generated
     */
    EEnum getISSERVICEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISSHAREREADType <em>ISSHAREREAD Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISSHAREREAD Type</em>'.
     * @see Powrmart.ISSHAREREADType
     * @generated
     */
    EEnum getISSHAREREADType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISSHAREWRITEType <em>ISSHAREWRITE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISSHAREWRITE Type</em>'.
     * @see Powrmart.ISSHAREWRITEType
     * @generated
     */
    EEnum getISSHAREWRITEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISSORTKEYType <em>ISSORTKEY Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISSORTKEY Type</em>'.
     * @see Powrmart.ISSORTKEYType
     * @generated
     */
    EEnum getISSORTKEYType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISVALIDType <em>ISVALID Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISVALID Type</em>'.
     * @see Powrmart.ISVALIDType
     * @generated
     */
    EEnum getISVALIDType();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISVALIDType1 <em>ISVALID Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISVALID Type1</em>'.
     * @see Powrmart.ISVALIDType1
     * @generated
     */
    EEnum getISVALIDType1();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISVALIDType2 <em>ISVALID Type2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISVALID Type2</em>'.
     * @see Powrmart.ISVALIDType2
     * @generated
     */
    EEnum getISVALIDType2();

    /**
     * Returns the meta object for enum '{@link Powrmart.ISVALIDType3 <em>ISVALID Type3</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ISVALID Type3</em>'.
     * @see Powrmart.ISVALIDType3
     * @generated
     */
    EEnum getISVALIDType3();

    /**
     * Returns the meta object for enum '{@link Powrmart.MACROTYPEType <em>MACROTYPE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>MACROTYPE Type</em>'.
     * @see Powrmart.MACROTYPEType
     * @generated
     */
    EEnum getMACROTYPEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.NULLABLEType <em>NULLABLE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>NULLABLE Type</em>'.
     * @see Powrmart.NULLABLEType
     * @generated
     */
    EEnum getNULLABLEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.NULLABLEType1 <em>NULLABLE Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>NULLABLE Type1</em>'.
     * @see Powrmart.NULLABLEType1
     * @generated
     */
    EEnum getNULLABLEType1();

    /**
     * Returns the meta object for enum '{@link Powrmart.NULLCHARTYPEType <em>NULLCHARTYPE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>NULLCHARTYPE Type</em>'.
     * @see Powrmart.NULLCHARTYPEType
     * @generated
     */
    EEnum getNULLCHARTYPEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.OBJECTTYPEType <em>OBJECTTYPE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>OBJECTTYPE Type</em>'.
     * @see Powrmart.OBJECTTYPEType
     * @generated
     */
    EEnum getOBJECTTYPEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.OCCURRENCEType <em>OCCURRENCE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>OCCURRENCE Type</em>'.
     * @see Powrmart.OCCURRENCEType
     * @generated
     */
    EEnum getOCCURRENCEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.OUTERJOINRELType <em>OUTERJOINREL Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>OUTERJOINREL Type</em>'.
     * @see Powrmart.OUTERJOINRELType
     * @generated
     */
    EEnum getOUTERJOINRELType();

    /**
     * Returns the meta object for enum '{@link Powrmart.PARENTTYPEType <em>PARENTTYPE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>PARENTTYPE Type</em>'.
     * @see Powrmart.PARENTTYPEType
     * @generated
     */
    EEnum getPARENTTYPEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.PARENTTYPEType1 <em>PARENTTYPE Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>PARENTTYPE Type1</em>'.
     * @see Powrmart.PARENTTYPEType1
     * @generated
     */
    EEnum getPARENTTYPEType1();

    /**
     * Returns the meta object for enum '{@link Powrmart.PARENTTYPEType2 <em>PARENTTYPE Type2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>PARENTTYPE Type2</em>'.
     * @see Powrmart.PARENTTYPEType2
     * @generated
     */
    EEnum getPARENTTYPEType2();

    /**
     * Returns the meta object for enum '{@link Powrmart.PARENTTYPEType3 <em>PARENTTYPE Type3</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>PARENTTYPE Type3</em>'.
     * @see Powrmart.PARENTTYPEType3
     * @generated
     */
    EEnum getPARENTTYPEType3();

    /**
     * Returns the meta object for enum '{@link Powrmart.REFERENCETYPEType <em>REFERENCETYPE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>REFERENCETYPE Type</em>'.
     * @see Powrmart.REFERENCETYPEType
     * @generated
     */
    EEnum getREFERENCETYPEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.REUSABLESCHEDULERType <em>REUSABLESCHEDULER Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>REUSABLESCHEDULER Type</em>'.
     * @see Powrmart.REUSABLESCHEDULERType
     * @generated
     */
    EEnum getREUSABLESCHEDULERType();

    /**
     * Returns the meta object for enum '{@link Powrmart.REUSABLEType <em>REUSABLE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>REUSABLE Type</em>'.
     * @see Powrmart.REUSABLEType
     * @generated
     */
    EEnum getREUSABLEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.REUSABLEType1 <em>REUSABLE Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>REUSABLE Type1</em>'.
     * @see Powrmart.REUSABLEType1
     * @generated
     */
    EEnum getREUSABLEType1();

    /**
     * Returns the meta object for enum '{@link Powrmart.REUSABLEType2 <em>REUSABLE Type2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>REUSABLE Type2</em>'.
     * @see Powrmart.REUSABLEType2
     * @generated
     */
    EEnum getREUSABLEType2();

    /**
     * Returns the meta object for enum '{@link Powrmart.REUSABLEType3 <em>REUSABLE Type3</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>REUSABLE Type3</em>'.
     * @see Powrmart.REUSABLEType3
     * @generated
     */
    EEnum getREUSABLEType3();

    /**
     * Returns the meta object for enum '{@link Powrmart.REUSABLEType4 <em>REUSABLE Type4</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>REUSABLE Type4</em>'.
     * @see Powrmart.REUSABLEType4
     * @generated
     */
    EEnum getREUSABLEType4();

    /**
     * Returns the meta object for enum '{@link Powrmart.REUSABLEType5 <em>REUSABLE Type5</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>REUSABLE Type5</em>'.
     * @see Powrmart.REUSABLEType5
     * @generated
     */
    EEnum getREUSABLEType5();

    /**
     * Returns the meta object for enum '{@link Powrmart.REUSABLEType6 <em>REUSABLE Type6</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>REUSABLE Type6</em>'.
     * @see Powrmart.REUSABLEType6
     * @generated
     */
    EEnum getREUSABLEType6();

    /**
     * Returns the meta object for enum '{@link Powrmart.REVERSEASSIGNMENTType <em>REVERSEASSIGNMENT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>REVERSEASSIGNMENT Type</em>'.
     * @see Powrmart.REVERSEASSIGNMENTType
     * @generated
     */
    EEnum getREVERSEASSIGNMENTType();

    /**
     * Returns the meta object for enum '{@link Powrmart.RUNFOREVERType <em>RUNFOREVER Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>RUNFOREVER Type</em>'.
     * @see Powrmart.RUNFOREVERType
     * @generated
     */
    EEnum getRUNFOREVERType();

    /**
     * Returns the meta object for enum '{@link Powrmart.RUNONCEType <em>RUNONCE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>RUNONCE Type</em>'.
     * @see Powrmart.RUNONCEType
     * @generated
     */
    EEnum getRUNONCEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.SCHEDULETYPEType <em>SCHEDULETYPE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>SCHEDULETYPE Type</em>'.
     * @see Powrmart.SCHEDULETYPEType
     * @generated
     */
    EEnum getSCHEDULETYPEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.SCHEDULETYPEType1 <em>SCHEDULETYPE Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>SCHEDULETYPE Type1</em>'.
     * @see Powrmart.SCHEDULETYPEType1
     * @generated
     */
    EEnum getSCHEDULETYPEType1();

    /**
     * Returns the meta object for enum '{@link Powrmart.SHAREDType <em>SHARED Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>SHARED Type</em>'.
     * @see Powrmart.SHAREDType
     * @generated
     */
    EEnum getSHAREDType();

    /**
     * Returns the meta object for enum '{@link Powrmart.SORTDIRECTIONType <em>SORTDIRECTION Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>SORTDIRECTION Type</em>'.
     * @see Powrmart.SORTDIRECTIONType
     * @generated
     */
    EEnum getSORTDIRECTIONType();

    /**
     * Returns the meta object for enum '{@link Powrmart.STAGEFILEPERSISTType <em>STAGEFILEPERSIST Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>STAGEFILEPERSIST Type</em>'.
     * @see Powrmart.STAGEFILEPERSISTType
     * @generated
     */
    EEnum getSTAGEFILEPERSISTType();

    /**
     * Returns the meta object for enum '{@link Powrmart.STAGEFILEREINITType <em>STAGEFILEREINIT Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>STAGEFILEREINIT Type</em>'.
     * @see Powrmart.STAGEFILEREINITType
     * @generated
     */
    EEnum getSTAGEFILEREINITType();

    /**
     * Returns the meta object for enum '{@link Powrmart.SUBTYPEType <em>SUBTYPE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>SUBTYPE Type</em>'.
     * @see Powrmart.SUBTYPEType
     * @generated
     */
    EEnum getSUBTYPEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.SUBTYPEType1 <em>SUBTYPE Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>SUBTYPE Type1</em>'.
     * @see Powrmart.SUBTYPEType1
     * @generated
     */
    EEnum getSUBTYPEType1();

    /**
     * Returns the meta object for enum '{@link Powrmart.SUSPENDONERRORType <em>SUSPENDONERROR Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>SUSPENDONERROR Type</em>'.
     * @see Powrmart.SUSPENDONERRORType
     * @generated
     */
    EEnum getSUSPENDONERRORType();

    /**
     * Returns the meta object for enum '{@link Powrmart.TASKSMUSTRUNONSERVERType <em>TASKSMUSTRUNONSERVER Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TASKSMUSTRUNONSERVER Type</em>'.
     * @see Powrmart.TASKSMUSTRUNONSERVERType
     * @generated
     */
    EEnum getTASKSMUSTRUNONSERVERType();

    /**
     * Returns the meta object for enum '{@link Powrmart.TIMERTYPEType <em>TIMERTYPE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TIMERTYPE Type</em>'.
     * @see Powrmart.TIMERTYPEType
     * @generated
     */
    EEnum getTIMERTYPEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.TREATINPUTLINKASANDType <em>TREATINPUTLINKASAND Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TREATINPUTLINKASAND Type</em>'.
     * @see Powrmart.TREATINPUTLINKASANDType
     * @generated
     */
    EEnum getTREATINPUTLINKASANDType();

    /**
     * Returns the meta object for enum '{@link Powrmart.TYPEType <em>TYPE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TYPE Type</em>'.
     * @see Powrmart.TYPEType
     * @generated
     */
    EEnum getTYPEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.TYPEType1 <em>TYPE Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TYPE Type1</em>'.
     * @see Powrmart.TYPEType1
     * @generated
     */
    EEnum getTYPEType1();

    /**
     * Returns the meta object for enum '{@link Powrmart.TYPEType2 <em>TYPE Type2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TYPE Type2</em>'.
     * @see Powrmart.TYPEType2
     * @generated
     */
    EEnum getTYPEType2();

    /**
     * Returns the meta object for enum '{@link Powrmart.TYPEType3 <em>TYPE Type3</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TYPE Type3</em>'.
     * @see Powrmart.TYPEType3
     * @generated
     */
    EEnum getTYPEType3();

    /**
     * Returns the meta object for enum '{@link Powrmart.TYPEType4 <em>TYPE Type4</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TYPE Type4</em>'.
     * @see Powrmart.TYPEType4
     * @generated
     */
    EEnum getTYPEType4();

    /**
     * Returns the meta object for enum '{@link Powrmart.TYPEType5 <em>TYPE Type5</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TYPE Type5</em>'.
     * @see Powrmart.TYPEType5
     * @generated
     */
    EEnum getTYPEType5();

    /**
     * Returns the meta object for enum '{@link Powrmart.TYPEType6 <em>TYPE Type6</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TYPE Type6</em>'.
     * @see Powrmart.TYPEType6
     * @generated
     */
    EEnum getTYPEType6();

    /**
     * Returns the meta object for enum '{@link Powrmart.TYPEType7 <em>TYPE Type7</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TYPE Type7</em>'.
     * @see Powrmart.TYPEType7
     * @generated
     */
    EEnum getTYPEType7();

    /**
     * Returns the meta object for enum '{@link Powrmart.TYPEType8 <em>TYPE Type8</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>TYPE Type8</em>'.
     * @see Powrmart.TYPEType8
     * @generated
     */
    EEnum getTYPEType8();

    /**
     * Returns the meta object for enum '{@link Powrmart.USERDEFINEDType <em>USERDEFINED Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>USERDEFINED Type</em>'.
     * @see Powrmart.USERDEFINEDType
     * @generated
     */
    EEnum getUSERDEFINEDType();

    /**
     * Returns the meta object for enum '{@link Powrmart.USERDEFINEDType1 <em>USERDEFINED Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>USERDEFINED Type1</em>'.
     * @see Powrmart.USERDEFINEDType1
     * @generated
     */
    EEnum getUSERDEFINEDType1();

    /**
     * Returns the meta object for enum '{@link Powrmart.VALUETYPEType <em>VALUETYPE Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>VALUETYPE Type</em>'.
     * @see Powrmart.VALUETYPEType
     * @generated
     */
    EEnum getVALUETYPEType();

    /**
     * Returns the meta object for enum '{@link Powrmart.VALUETYPEType1 <em>VALUETYPE Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>VALUETYPE Type1</em>'.
     * @see Powrmart.VALUETYPEType1
     * @generated
     */
    EEnum getVALUETYPEType1();

    /**
     * Returns the meta object for enum '{@link Powrmart.VALUETYPEType2 <em>VALUETYPE Type2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>VALUETYPE Type2</em>'.
     * @see Powrmart.VALUETYPEType2
     * @generated
     */
    EEnum getVALUETYPEType2();

    /**
     * Returns the meta object for data type '{@link Powrmart.AGGFUNCTIONType <em>AGGFUNCTION Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>AGGFUNCTION Type Object</em>'.
     * @see Powrmart.AGGFUNCTIONType
     * @model instanceClass="Powrmart.AGGFUNCTIONType"
     *        extendedMetaData="name='AGGFUNCTION_._type:Object' baseType='AGGFUNCTION_._type'"
     * @generated
     */
    EDataType getAGGFUNCTIONTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.DATATYPEType <em>DATATYPE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>DATATYPE Type Object</em>'.
     * @see Powrmart.DATATYPEType
     * @model instanceClass="Powrmart.DATATYPEType"
     *        extendedMetaData="name='DATATYPE_._type:Object' baseType='DATATYPE_._type'"
     * @generated
     */
    EDataType getDATATYPETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.DAYType <em>DAY Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>DAY Type Object</em>'.
     * @see Powrmart.DAYType
     * @model instanceClass="Powrmart.DAYType"
     *        extendedMetaData="name='DAY_._type:Object' baseType='DAY_._type'"
     * @generated
     */
    EDataType getDAYTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ENDTYPEType <em>ENDTYPE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ENDTYPE Type Object</em>'.
     * @see Powrmart.ENDTYPEType
     * @model instanceClass="Powrmart.ENDTYPEType"
     *        extendedMetaData="name='ENDTYPE_._type:Object' baseType='ENDTYPE_._type'"
     * @generated
     */
    EDataType getENDTYPETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.FAILPARENTIFINSTANCEDIDNOTRUNType <em>FAILPARENTIFINSTANCEDIDNOTRUN Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>FAILPARENTIFINSTANCEDIDNOTRUN Type Object</em>'.
     * @see Powrmart.FAILPARENTIFINSTANCEDIDNOTRUNType
     * @model instanceClass="Powrmart.FAILPARENTIFINSTANCEDIDNOTRUNType"
     *        extendedMetaData="name='FAIL_PARENT_IF_INSTANCE_DID_NOT_RUN_._type:Object' baseType='FAIL_PARENT_IF_INSTANCE_DID_NOT_RUN_._type'"
     * @generated
     */
    EDataType getFAILPARENTIFINSTANCEDIDNOTRUNTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.FAILPARENTIFINSTANCEFAILSType <em>FAILPARENTIFINSTANCEFAILS Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>FAILPARENTIFINSTANCEFAILS Type Object</em>'.
     * @see Powrmart.FAILPARENTIFINSTANCEFAILSType
     * @model instanceClass="Powrmart.FAILPARENTIFINSTANCEFAILSType"
     *        extendedMetaData="name='FAIL_PARENT_IF_INSTANCE_FAILS_._type:Object' baseType='FAIL_PARENT_IF_INSTANCE_FAILS_._type'"
     * @generated
     */
    EDataType getFAILPARENTIFINSTANCEFAILSTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.IGNOREINCOMPAREType <em>IGNOREINCOMPARE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>IGNOREINCOMPARE Type Object</em>'.
     * @see Powrmart.IGNOREINCOMPAREType
     * @model instanceClass="Powrmart.IGNOREINCOMPAREType"
     *        extendedMetaData="name='IGNORE_IN_COMPARE_._type:Object' baseType='IGNORE_IN_COMPARE_._type'"
     * @generated
     */
    EDataType getIGNOREINCOMPARETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.IGNORENULLINPUTSType <em>IGNORENULLINPUTS Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>IGNORENULLINPUTS Type Object</em>'.
     * @see Powrmart.IGNORENULLINPUTSType
     * @model instanceClass="Powrmart.IGNORENULLINPUTSType"
     *        extendedMetaData="name='IGNORE_NULL_INPUTS_._type:Object' baseType='IGNORE_NULL_INPUTS_._type'"
     * @generated
     */
    EDataType getIGNORENULLINPUTSTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISCLIENTEDITABLEType <em>ISCLIENTEDITABLE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISCLIENTEDITABLE Type Object</em>'.
     * @see Powrmart.ISCLIENTEDITABLEType
     * @model instanceClass="Powrmart.ISCLIENTEDITABLEType"
     *        extendedMetaData="name='ISCLIENTEDITABLE_._type:Object' baseType='ISCLIENTEDITABLE_._type'"
     * @generated
     */
    EDataType getISCLIENTEDITABLETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISCLIENTVISIBLEType <em>ISCLIENTVISIBLE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISCLIENTVISIBLE Type Object</em>'.
     * @see Powrmart.ISCLIENTVISIBLEType
     * @model instanceClass="Powrmart.ISCLIENTVISIBLEType"
     *        extendedMetaData="name='ISCLIENTVISIBLE_._type:Object' baseType='ISCLIENTVISIBLE_._type'"
     * @generated
     */
    EDataType getISCLIENTVISIBLETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISDEFAULTType <em>ISDEFAULT Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISDEFAULT Type Object</em>'.
     * @see Powrmart.ISDEFAULTType
     * @model instanceClass="Powrmart.ISDEFAULTType"
     *        extendedMetaData="name='ISDEFAULT_._type:Object' baseType='ISDEFAULT_._type'"
     * @generated
     */
    EDataType getISDEFAULTTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISENABLEDType <em>ISENABLED Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISENABLED Type Object</em>'.
     * @see Powrmart.ISENABLEDType
     * @model instanceClass="Powrmart.ISENABLEDType"
     *        extendedMetaData="name='ISENABLED_._type:Object' baseType='ISENABLED_._type'"
     * @generated
     */
    EDataType getISENABLEDTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISENABLEDType1 <em>ISENABLED Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISENABLED Type Object1</em>'.
     * @see Powrmart.ISENABLEDType1
     * @model instanceClass="Powrmart.ISENABLEDType1"
     *        extendedMetaData="name='ISENABLED_._1_._type:Object' baseType='ISENABLED_._1_._type'"
     * @generated
     */
    EDataType getISENABLEDTypeObject1();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISEXPRESSIONVARIABLEType <em>ISEXPRESSIONVARIABLE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISEXPRESSIONVARIABLE Type Object</em>'.
     * @see Powrmart.ISEXPRESSIONVARIABLEType
     * @model instanceClass="Powrmart.ISEXPRESSIONVARIABLEType"
     *        extendedMetaData="name='ISEXPRESSIONVARIABLE_._type:Object' baseType='ISEXPRESSIONVARIABLE_._type'"
     * @generated
     */
    EDataType getISEXPRESSIONVARIABLETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISFILENAMEFIELDType <em>ISFILENAMEFIELD Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISFILENAMEFIELD Type Object</em>'.
     * @see Powrmart.ISFILENAMEFIELDType
     * @model instanceClass="Powrmart.ISFILENAMEFIELDType"
     *        extendedMetaData="name='ISFILENAMEFIELD_._type:Object' baseType='ISFILENAMEFIELD_._type'"
     * @generated
     */
    EDataType getISFILENAMEFIELDTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISNONEType <em>ISNONE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISNONE Type Object</em>'.
     * @see Powrmart.ISNONEType
     * @model instanceClass="Powrmart.ISNONEType"
     *        extendedMetaData="name='ISNONE_._type:Object' baseType='ISNONE_._type'"
     * @generated
     */
    EDataType getISNONETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISNULLType <em>ISNULL Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISNULL Type Object</em>'.
     * @see Powrmart.ISNULLType
     * @model instanceClass="Powrmart.ISNULLType"
     *        extendedMetaData="name='ISNULL_._type:Object' baseType='ISNULL_._type'"
     * @generated
     */
    EDataType getISNULLTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISOPTIONALType <em>ISOPTIONAL Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISOPTIONAL Type Object</em>'.
     * @see Powrmart.ISOPTIONALType
     * @model instanceClass="Powrmart.ISOPTIONALType"
     *        extendedMetaData="name='ISOPTIONAL_._type:Object' baseType='ISOPTIONAL_._type'"
     * @generated
     */
    EDataType getISOPTIONALTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISOPTIONALType1 <em>ISOPTIONAL Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISOPTIONAL Type Object1</em>'.
     * @see Powrmart.ISOPTIONALType1
     * @model instanceClass="Powrmart.ISOPTIONALType1"
     *        extendedMetaData="name='ISOPTIONAL_._1_._type:Object' baseType='ISOPTIONAL_._1_._type'"
     * @generated
     */
    EDataType getISOPTIONALTypeObject1();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISOUTPUTPORTType <em>ISOUTPUTPORT Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISOUTPUTPORT Type Object</em>'.
     * @see Powrmart.ISOUTPUTPORTType
     * @model instanceClass="Powrmart.ISOUTPUTPORTType"
     *        extendedMetaData="name='ISOUTPUTPORT_._type:Object' baseType='ISOUTPUTPORT_._type'"
     * @generated
     */
    EDataType getISOUTPUTPORTTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISPARAMType <em>ISPARAM Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISPARAM Type Object</em>'.
     * @see Powrmart.ISPARAMType
     * @model instanceClass="Powrmart.ISPARAMType"
     *        extendedMetaData="name='ISPARAM_._type:Object' baseType='ISPARAM_._type'"
     * @generated
     */
    EDataType getISPARAMTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISPERSISTENTType <em>ISPERSISTENT Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISPERSISTENT Type Object</em>'.
     * @see Powrmart.ISPERSISTENTType
     * @model instanceClass="Powrmart.ISPERSISTENTType"
     *        extendedMetaData="name='ISPERSISTENT_._type:Object' baseType='ISPERSISTENT_._type'"
     * @generated
     */
    EDataType getISPERSISTENTTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISPROFILEMAPPINGType <em>ISPROFILEMAPPING Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISPROFILEMAPPING Type Object</em>'.
     * @see Powrmart.ISPROFILEMAPPINGType
     * @model instanceClass="Powrmart.ISPROFILEMAPPINGType"
     *        extendedMetaData="name='ISPROFILEMAPPING_._type:Object' baseType='ISPROFILEMAPPING_._type'"
     * @generated
     */
    EDataType getISPROFILEMAPPINGTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISREFERENCEType <em>ISREFERENCE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISREFERENCE Type Object</em>'.
     * @see Powrmart.ISREFERENCEType
     * @model instanceClass="Powrmart.ISREFERENCEType"
     *        extendedMetaData="name='ISREFERENCE_._type:Object' baseType='ISREFERENCE_._type'"
     * @generated
     */
    EDataType getISREFERENCETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISREPARTITIONPOINTType <em>ISREPARTITIONPOINT Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISREPARTITIONPOINT Type Object</em>'.
     * @see Powrmart.ISREPARTITIONPOINTType
     * @model instanceClass="Powrmart.ISREPARTITIONPOINTType"
     *        extendedMetaData="name='ISREPARTITIONPOINT_._type:Object' baseType='ISREPARTITIONPOINT_._type'"
     * @generated
     */
    EDataType getISREPARTITIONPOINTTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISREUSABLEType <em>ISREUSABLE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISREUSABLE Type Object</em>'.
     * @see Powrmart.ISREUSABLEType
     * @model instanceClass="Powrmart.ISREUSABLEType"
     *        extendedMetaData="name='ISREUSABLE_._type:Object' baseType='ISREUSABLE_._type'"
     * @generated
     */
    EDataType getISREUSABLETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISRUNNABLESERVICEType <em>ISRUNNABLESERVICE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISRUNNABLESERVICE Type Object</em>'.
     * @see Powrmart.ISRUNNABLESERVICEType
     * @model instanceClass="Powrmart.ISRUNNABLESERVICEType"
     *        extendedMetaData="name='ISRUNNABLESERVICE_._type:Object' baseType='ISRUNNABLESERVICE_._type'"
     * @generated
     */
    EDataType getISRUNNABLESERVICETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISSERVICEType <em>ISSERVICE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISSERVICE Type Object</em>'.
     * @see Powrmart.ISSERVICEType
     * @model instanceClass="Powrmart.ISSERVICEType"
     *        extendedMetaData="name='ISSERVICE_._type:Object' baseType='ISSERVICE_._type'"
     * @generated
     */
    EDataType getISSERVICETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISSHAREREADType <em>ISSHAREREAD Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISSHAREREAD Type Object</em>'.
     * @see Powrmart.ISSHAREREADType
     * @model instanceClass="Powrmart.ISSHAREREADType"
     *        extendedMetaData="name='ISSHAREREAD_._type:Object' baseType='ISSHAREREAD_._type'"
     * @generated
     */
    EDataType getISSHAREREADTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISSHAREWRITEType <em>ISSHAREWRITE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISSHAREWRITE Type Object</em>'.
     * @see Powrmart.ISSHAREWRITEType
     * @model instanceClass="Powrmart.ISSHAREWRITEType"
     *        extendedMetaData="name='ISSHAREWRITE_._type:Object' baseType='ISSHAREWRITE_._type'"
     * @generated
     */
    EDataType getISSHAREWRITETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISSORTKEYType <em>ISSORTKEY Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISSORTKEY Type Object</em>'.
     * @see Powrmart.ISSORTKEYType
     * @model instanceClass="Powrmart.ISSORTKEYType"
     *        extendedMetaData="name='ISSORTKEY_._type:Object' baseType='ISSORTKEY_._type'"
     * @generated
     */
    EDataType getISSORTKEYTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISVALIDType2 <em>ISVALID Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISVALID Type Object</em>'.
     * @see Powrmart.ISVALIDType2
     * @model instanceClass="Powrmart.ISVALIDType2"
     *        extendedMetaData="name='ISVALID_._2_._type:Object' baseType='ISVALID_._2_._type'"
     * @generated
     */
    EDataType getISVALIDTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISVALIDType <em>ISVALID Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISVALID Type Object1</em>'.
     * @see Powrmart.ISVALIDType
     * @model instanceClass="Powrmart.ISVALIDType"
     *        extendedMetaData="name='ISVALID_._type:Object' baseType='ISVALID_._type'"
     * @generated
     */
    EDataType getISVALIDTypeObject1();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISVALIDType1 <em>ISVALID Type Object2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISVALID Type Object2</em>'.
     * @see Powrmart.ISVALIDType1
     * @model instanceClass="Powrmart.ISVALIDType1"
     *        extendedMetaData="name='ISVALID_._1_._type:Object' baseType='ISVALID_._1_._type'"
     * @generated
     */
    EDataType getISVALIDTypeObject2();

    /**
     * Returns the meta object for data type '{@link Powrmart.ISVALIDType3 <em>ISVALID Type Object3</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ISVALID Type Object3</em>'.
     * @see Powrmart.ISVALIDType3
     * @model instanceClass="Powrmart.ISVALIDType3"
     *        extendedMetaData="name='ISVALID_._3_._type:Object' baseType='ISVALID_._3_._type'"
     * @generated
     */
    EDataType getISVALIDTypeObject3();

    /**
     * Returns the meta object for data type '{@link Powrmart.MACROTYPEType <em>MACROTYPE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>MACROTYPE Type Object</em>'.
     * @see Powrmart.MACROTYPEType
     * @model instanceClass="Powrmart.MACROTYPEType"
     *        extendedMetaData="name='MACROTYPE_._type:Object' baseType='MACROTYPE_._type'"
     * @generated
     */
    EDataType getMACROTYPETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.NULLABLEType <em>NULLABLE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>NULLABLE Type Object</em>'.
     * @see Powrmart.NULLABLEType
     * @model instanceClass="Powrmart.NULLABLEType"
     *        extendedMetaData="name='NULLABLE_._type:Object' baseType='NULLABLE_._type'"
     * @generated
     */
    EDataType getNULLABLETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.NULLABLEType1 <em>NULLABLE Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>NULLABLE Type Object1</em>'.
     * @see Powrmart.NULLABLEType1
     * @model instanceClass="Powrmart.NULLABLEType1"
     *        extendedMetaData="name='NULLABLE_._1_._type:Object' baseType='NULLABLE_._1_._type'"
     * @generated
     */
    EDataType getNULLABLETypeObject1();

    /**
     * Returns the meta object for data type '{@link Powrmart.NULLCHARTYPEType <em>NULLCHARTYPE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>NULLCHARTYPE Type Object</em>'.
     * @see Powrmart.NULLCHARTYPEType
     * @model instanceClass="Powrmart.NULLCHARTYPEType"
     *        extendedMetaData="name='NULLCHARTYPE_._type:Object' baseType='NULLCHARTYPE_._type'"
     * @generated
     */
    EDataType getNULLCHARTYPETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.OBJECTTYPEType <em>OBJECTTYPE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>OBJECTTYPE Type Object</em>'.
     * @see Powrmart.OBJECTTYPEType
     * @model instanceClass="Powrmart.OBJECTTYPEType"
     *        extendedMetaData="name='OBJECTTYPE_._type:Object' baseType='OBJECTTYPE_._type'"
     * @generated
     */
    EDataType getOBJECTTYPETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.OCCURRENCEType <em>OCCURRENCE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>OCCURRENCE Type Object</em>'.
     * @see Powrmart.OCCURRENCEType
     * @model instanceClass="Powrmart.OCCURRENCEType"
     *        extendedMetaData="name='OCCURRENCE_._type:Object' baseType='OCCURRENCE_._type'"
     * @generated
     */
    EDataType getOCCURRENCETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.OUTERJOINRELType <em>OUTERJOINREL Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>OUTERJOINREL Type Object</em>'.
     * @see Powrmart.OUTERJOINRELType
     * @model instanceClass="Powrmart.OUTERJOINRELType"
     *        extendedMetaData="name='OUTERJOINREL_._type:Object' baseType='OUTERJOINREL_._type'"
     * @generated
     */
    EDataType getOUTERJOINRELTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.PARENTTYPEType2 <em>PARENTTYPE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>PARENTTYPE Type Object</em>'.
     * @see Powrmart.PARENTTYPEType2
     * @model instanceClass="Powrmart.PARENTTYPEType2"
     *        extendedMetaData="name='PARENT_TYPE_._2_._type:Object' baseType='PARENT_TYPE_._2_._type'"
     * @generated
     */
    EDataType getPARENTTYPETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.PARENTTYPEType1 <em>PARENTTYPE Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>PARENTTYPE Type Object1</em>'.
     * @see Powrmart.PARENTTYPEType1
     * @model instanceClass="Powrmart.PARENTTYPEType1"
     *        extendedMetaData="name='PARENT_TYPE_._1_._type:Object' baseType='PARENT_TYPE_._1_._type'"
     * @generated
     */
    EDataType getPARENTTYPETypeObject1();

    /**
     * Returns the meta object for data type '{@link Powrmart.PARENTTYPEType <em>PARENTTYPE Type Object2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>PARENTTYPE Type Object2</em>'.
     * @see Powrmart.PARENTTYPEType
     * @model instanceClass="Powrmart.PARENTTYPEType"
     *        extendedMetaData="name='PARENT_TYPE_._type:Object' baseType='PARENT_TYPE_._type'"
     * @generated
     */
    EDataType getPARENTTYPETypeObject2();

    /**
     * Returns the meta object for data type '{@link Powrmart.PARENTTYPEType3 <em>PARENTTYPE Type Object3</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>PARENTTYPE Type Object3</em>'.
     * @see Powrmart.PARENTTYPEType3
     * @model instanceClass="Powrmart.PARENTTYPEType3"
     *        extendedMetaData="name='PARENT_TYPE_._3_._type:Object' baseType='PARENT_TYPE_._3_._type'"
     * @generated
     */
    EDataType getPARENTTYPETypeObject3();

    /**
     * Returns the meta object for data type '{@link Powrmart.REFERENCETYPEType <em>REFERENCETYPE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>REFERENCETYPE Type Object</em>'.
     * @see Powrmart.REFERENCETYPEType
     * @model instanceClass="Powrmart.REFERENCETYPEType"
     *        extendedMetaData="name='REFERENCETYPE_._type:Object' baseType='REFERENCETYPE_._type'"
     * @generated
     */
    EDataType getREFERENCETYPETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.REUSABLESCHEDULERType <em>REUSABLESCHEDULER Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>REUSABLESCHEDULER Type Object</em>'.
     * @see Powrmart.REUSABLESCHEDULERType
     * @model instanceClass="Powrmart.REUSABLESCHEDULERType"
     *        extendedMetaData="name='REUSABLE_SCHEDULER_._type:Object' baseType='REUSABLE_SCHEDULER_._type'"
     * @generated
     */
    EDataType getREUSABLESCHEDULERTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.REUSABLEType <em>REUSABLE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>REUSABLE Type Object</em>'.
     * @see Powrmart.REUSABLEType
     * @model instanceClass="Powrmart.REUSABLEType"
     *        extendedMetaData="name='REUSABLE_._type:Object' baseType='REUSABLE_._type'"
     * @generated
     */
    EDataType getREUSABLETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.REUSABLEType4 <em>REUSABLE Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>REUSABLE Type Object1</em>'.
     * @see Powrmart.REUSABLEType4
     * @model instanceClass="Powrmart.REUSABLEType4"
     *        extendedMetaData="name='REUSABLE_._4_._type:Object' baseType='REUSABLE_._4_._type'"
     * @generated
     */
    EDataType getREUSABLETypeObject1();

    /**
     * Returns the meta object for data type '{@link Powrmart.REUSABLEType1 <em>REUSABLE Type Object2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>REUSABLE Type Object2</em>'.
     * @see Powrmart.REUSABLEType1
     * @model instanceClass="Powrmart.REUSABLEType1"
     *        extendedMetaData="name='REUSABLE_._1_._type:Object' baseType='REUSABLE_._1_._type'"
     * @generated
     */
    EDataType getREUSABLETypeObject2();

    /**
     * Returns the meta object for data type '{@link Powrmart.REUSABLEType2 <em>REUSABLE Type Object3</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>REUSABLE Type Object3</em>'.
     * @see Powrmart.REUSABLEType2
     * @model instanceClass="Powrmart.REUSABLEType2"
     *        extendedMetaData="name='REUSABLE_._2_._type:Object' baseType='REUSABLE_._2_._type'"
     * @generated
     */
    EDataType getREUSABLETypeObject3();

    /**
     * Returns the meta object for data type '{@link Powrmart.REUSABLEType3 <em>REUSABLE Type Object4</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>REUSABLE Type Object4</em>'.
     * @see Powrmart.REUSABLEType3
     * @model instanceClass="Powrmart.REUSABLEType3"
     *        extendedMetaData="name='REUSABLE_._3_._type:Object' baseType='REUSABLE_._3_._type'"
     * @generated
     */
    EDataType getREUSABLETypeObject4();

    /**
     * Returns the meta object for data type '{@link Powrmart.REUSABLEType5 <em>REUSABLE Type Object5</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>REUSABLE Type Object5</em>'.
     * @see Powrmart.REUSABLEType5
     * @model instanceClass="Powrmart.REUSABLEType5"
     *        extendedMetaData="name='REUSABLE_._5_._type:Object' baseType='REUSABLE_._5_._type'"
     * @generated
     */
    EDataType getREUSABLETypeObject5();

    /**
     * Returns the meta object for data type '{@link Powrmart.REUSABLEType6 <em>REUSABLE Type Object6</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>REUSABLE Type Object6</em>'.
     * @see Powrmart.REUSABLEType6
     * @model instanceClass="Powrmart.REUSABLEType6"
     *        extendedMetaData="name='REUSABLE_._6_._type:Object' baseType='REUSABLE_._6_._type'"
     * @generated
     */
    EDataType getREUSABLETypeObject6();

    /**
     * Returns the meta object for data type '{@link Powrmart.REVERSEASSIGNMENTType <em>REVERSEASSIGNMENT Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>REVERSEASSIGNMENT Type Object</em>'.
     * @see Powrmart.REVERSEASSIGNMENTType
     * @model instanceClass="Powrmart.REVERSEASSIGNMENTType"
     *        extendedMetaData="name='REVERSEASSIGNMENT_._type:Object' baseType='REVERSEASSIGNMENT_._type'"
     * @generated
     */
    EDataType getREVERSEASSIGNMENTTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.RUNFOREVERType <em>RUNFOREVER Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>RUNFOREVER Type Object</em>'.
     * @see Powrmart.RUNFOREVERType
     * @model instanceClass="Powrmart.RUNFOREVERType"
     *        extendedMetaData="name='RUNFOREVER_._type:Object' baseType='RUNFOREVER_._type'"
     * @generated
     */
    EDataType getRUNFOREVERTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.RUNONCEType <em>RUNONCE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>RUNONCE Type Object</em>'.
     * @see Powrmart.RUNONCEType
     * @model instanceClass="Powrmart.RUNONCEType"
     *        extendedMetaData="name='RUNONCE_._type:Object' baseType='RUNONCE_._type'"
     * @generated
     */
    EDataType getRUNONCETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.SCHEDULETYPEType <em>SCHEDULETYPE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>SCHEDULETYPE Type Object</em>'.
     * @see Powrmart.SCHEDULETYPEType
     * @model instanceClass="Powrmart.SCHEDULETYPEType"
     *        extendedMetaData="name='SCHEDULETYPE_._type:Object' baseType='SCHEDULETYPE_._type'"
     * @generated
     */
    EDataType getSCHEDULETYPETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.SCHEDULETYPEType1 <em>SCHEDULETYPE Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>SCHEDULETYPE Type Object1</em>'.
     * @see Powrmart.SCHEDULETYPEType1
     * @model instanceClass="Powrmart.SCHEDULETYPEType1"
     *        extendedMetaData="name='SCHEDULETYPE_._1_._type:Object' baseType='SCHEDULETYPE_._1_._type'"
     * @generated
     */
    EDataType getSCHEDULETYPETypeObject1();

    /**
     * Returns the meta object for data type '{@link Powrmart.SHAREDType <em>SHARED Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>SHARED Type Object</em>'.
     * @see Powrmart.SHAREDType
     * @model instanceClass="Powrmart.SHAREDType"
     *        extendedMetaData="name='SHARED_._type:Object' baseType='SHARED_._type'"
     * @generated
     */
    EDataType getSHAREDTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.SORTDIRECTIONType <em>SORTDIRECTION Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>SORTDIRECTION Type Object</em>'.
     * @see Powrmart.SORTDIRECTIONType
     * @model instanceClass="Powrmart.SORTDIRECTIONType"
     *        extendedMetaData="name='SORTDIRECTION_._type:Object' baseType='SORTDIRECTION_._type'"
     * @generated
     */
    EDataType getSORTDIRECTIONTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.STAGEFILEPERSISTType <em>STAGEFILEPERSIST Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>STAGEFILEPERSIST Type Object</em>'.
     * @see Powrmart.STAGEFILEPERSISTType
     * @model instanceClass="Powrmart.STAGEFILEPERSISTType"
     *        extendedMetaData="name='STAGEFILEPERSIST_._type:Object' baseType='STAGEFILEPERSIST_._type'"
     * @generated
     */
    EDataType getSTAGEFILEPERSISTTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.STAGEFILEREINITType <em>STAGEFILEREINIT Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>STAGEFILEREINIT Type Object</em>'.
     * @see Powrmart.STAGEFILEREINITType
     * @model instanceClass="Powrmart.STAGEFILEREINITType"
     *        extendedMetaData="name='STAGEFILEREINIT_._type:Object' baseType='STAGEFILEREINIT_._type'"
     * @generated
     */
    EDataType getSTAGEFILEREINITTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.SUBTYPEType <em>SUBTYPE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>SUBTYPE Type Object</em>'.
     * @see Powrmart.SUBTYPEType
     * @model instanceClass="Powrmart.SUBTYPEType"
     *        extendedMetaData="name='SUBTYPE_._type:Object' baseType='SUBTYPE_._type'"
     * @generated
     */
    EDataType getSUBTYPETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.SUBTYPEType1 <em>SUBTYPE Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>SUBTYPE Type Object1</em>'.
     * @see Powrmart.SUBTYPEType1
     * @model instanceClass="Powrmart.SUBTYPEType1"
     *        extendedMetaData="name='SUBTYPE_._1_._type:Object' baseType='SUBTYPE_._1_._type'"
     * @generated
     */
    EDataType getSUBTYPETypeObject1();

    /**
     * Returns the meta object for data type '{@link Powrmart.SUSPENDONERRORType <em>SUSPENDONERROR Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>SUSPENDONERROR Type Object</em>'.
     * @see Powrmart.SUSPENDONERRORType
     * @model instanceClass="Powrmart.SUSPENDONERRORType"
     *        extendedMetaData="name='SUSPEND_ON_ERROR_._type:Object' baseType='SUSPEND_ON_ERROR_._type'"
     * @generated
     */
    EDataType getSUSPENDONERRORTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.TASKSMUSTRUNONSERVERType <em>TASKSMUSTRUNONSERVER Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TASKSMUSTRUNONSERVER Type Object</em>'.
     * @see Powrmart.TASKSMUSTRUNONSERVERType
     * @model instanceClass="Powrmart.TASKSMUSTRUNONSERVERType"
     *        extendedMetaData="name='TASKS_MUST_RUN_ON_SERVER_._type:Object' baseType='TASKS_MUST_RUN_ON_SERVER_._type'"
     * @generated
     */
    EDataType getTASKSMUSTRUNONSERVERTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.TIMERTYPEType <em>TIMERTYPE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TIMERTYPE Type Object</em>'.
     * @see Powrmart.TIMERTYPEType
     * @model instanceClass="Powrmart.TIMERTYPEType"
     *        extendedMetaData="name='TIMERTYPE_._type:Object' baseType='TIMERTYPE_._type'"
     * @generated
     */
    EDataType getTIMERTYPETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.TREATINPUTLINKASANDType <em>TREATINPUTLINKASAND Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TREATINPUTLINKASAND Type Object</em>'.
     * @see Powrmart.TREATINPUTLINKASANDType
     * @model instanceClass="Powrmart.TREATINPUTLINKASANDType"
     *        extendedMetaData="name='TREAT_INPUTLINK_AS_AND_._type:Object' baseType='TREAT_INPUTLINK_AS_AND_._type'"
     * @generated
     */
    EDataType getTREATINPUTLINKASANDTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.TYPEType6 <em>TYPE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TYPE Type Object</em>'.
     * @see Powrmart.TYPEType6
     * @model instanceClass="Powrmart.TYPEType6"
     *        extendedMetaData="name='TYPE_._6_._type:Object' baseType='TYPE_._6_._type'"
     * @generated
     */
    EDataType getTYPETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.TYPEType <em>TYPE Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TYPE Type Object1</em>'.
     * @see Powrmart.TYPEType
     * @model instanceClass="Powrmart.TYPEType"
     *        extendedMetaData="name='TYPE_._type:Object' baseType='TYPE_._type'"
     * @generated
     */
    EDataType getTYPETypeObject1();

    /**
     * Returns the meta object for data type '{@link Powrmart.TYPEType2 <em>TYPE Type Object2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TYPE Type Object2</em>'.
     * @see Powrmart.TYPEType2
     * @model instanceClass="Powrmart.TYPEType2"
     *        extendedMetaData="name='TYPE_._2_._type:Object' baseType='TYPE_._2_._type'"
     * @generated
     */
    EDataType getTYPETypeObject2();

    /**
     * Returns the meta object for data type '{@link Powrmart.TYPEType1 <em>TYPE Type Object3</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TYPE Type Object3</em>'.
     * @see Powrmart.TYPEType1
     * @model instanceClass="Powrmart.TYPEType1"
     *        extendedMetaData="name='TYPE_._1_._type:Object' baseType='TYPE_._1_._type'"
     * @generated
     */
    EDataType getTYPETypeObject3();

    /**
     * Returns the meta object for data type '{@link Powrmart.TYPEType4 <em>TYPE Type Object4</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TYPE Type Object4</em>'.
     * @see Powrmart.TYPEType4
     * @model instanceClass="Powrmart.TYPEType4"
     *        extendedMetaData="name='TYPE_._4_._type:Object' baseType='TYPE_._4_._type'"
     * @generated
     */
    EDataType getTYPETypeObject4();

    /**
     * Returns the meta object for data type '{@link Powrmart.TYPEType3 <em>TYPE Type Object5</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TYPE Type Object5</em>'.
     * @see Powrmart.TYPEType3
     * @model instanceClass="Powrmart.TYPEType3"
     *        extendedMetaData="name='TYPE_._3_._type:Object' baseType='TYPE_._3_._type'"
     * @generated
     */
    EDataType getTYPETypeObject5();

    /**
     * Returns the meta object for data type '{@link Powrmart.TYPEType5 <em>TYPE Type Object6</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TYPE Type Object6</em>'.
     * @see Powrmart.TYPEType5
     * @model instanceClass="Powrmart.TYPEType5"
     *        extendedMetaData="name='TYPE_._5_._type:Object' baseType='TYPE_._5_._type'"
     * @generated
     */
    EDataType getTYPETypeObject6();

    /**
     * Returns the meta object for data type '{@link Powrmart.TYPEType7 <em>TYPE Type Object7</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TYPE Type Object7</em>'.
     * @see Powrmart.TYPEType7
     * @model instanceClass="Powrmart.TYPEType7"
     *        extendedMetaData="name='TYPE_._7_._type:Object' baseType='TYPE_._7_._type'"
     * @generated
     */
    EDataType getTYPETypeObject7();

    /**
     * Returns the meta object for data type '{@link Powrmart.TYPEType8 <em>TYPE Type Object8</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>TYPE Type Object8</em>'.
     * @see Powrmart.TYPEType8
     * @model instanceClass="Powrmart.TYPEType8"
     *        extendedMetaData="name='TYPE_._8_._type:Object' baseType='TYPE_._8_._type'"
     * @generated
     */
    EDataType getTYPETypeObject8();

    /**
     * Returns the meta object for data type '{@link Powrmart.USERDEFINEDType <em>USERDEFINED Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>USERDEFINED Type Object</em>'.
     * @see Powrmart.USERDEFINEDType
     * @model instanceClass="Powrmart.USERDEFINEDType"
     *        extendedMetaData="name='USERDEFINED_._type:Object' baseType='USERDEFINED_._type'"
     * @generated
     */
    EDataType getUSERDEFINEDTypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.USERDEFINEDType1 <em>USERDEFINED Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>USERDEFINED Type Object1</em>'.
     * @see Powrmart.USERDEFINEDType1
     * @model instanceClass="Powrmart.USERDEFINEDType1"
     *        extendedMetaData="name='USERDEFINED_._1_._type:Object' baseType='USERDEFINED_._1_._type'"
     * @generated
     */
    EDataType getUSERDEFINEDTypeObject1();

    /**
     * Returns the meta object for data type '{@link Powrmart.VALUETYPEType1 <em>VALUETYPE Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>VALUETYPE Type Object</em>'.
     * @see Powrmart.VALUETYPEType1
     * @model instanceClass="Powrmart.VALUETYPEType1"
     *        extendedMetaData="name='VALUETYPE_._1_._type:Object' baseType='VALUETYPE_._1_._type'"
     * @generated
     */
    EDataType getVALUETYPETypeObject();

    /**
     * Returns the meta object for data type '{@link Powrmart.VALUETYPEType <em>VALUETYPE Type Object1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>VALUETYPE Type Object1</em>'.
     * @see Powrmart.VALUETYPEType
     * @model instanceClass="Powrmart.VALUETYPEType"
     *        extendedMetaData="name='VALUETYPE_._type:Object' baseType='VALUETYPE_._type'"
     * @generated
     */
    EDataType getVALUETYPETypeObject1();

    /**
     * Returns the meta object for data type '{@link Powrmart.VALUETYPEType2 <em>VALUETYPE Type Object2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>VALUETYPE Type Object2</em>'.
     * @see Powrmart.VALUETYPEType2
     * @model instanceClass="Powrmart.VALUETYPEType2"
     *        extendedMetaData="name='VALUETYPE_._2_._type:Object' baseType='VALUETYPE_._2_._type'"
     * @generated
     */
    EDataType getVALUETYPETypeObject2();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    PowrmartFactory getPowrmartFactory();

} //PowrmartPackage
