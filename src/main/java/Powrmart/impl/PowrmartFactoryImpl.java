/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PowrmartFactoryImpl extends EFactoryImpl implements PowrmartFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PowrmartFactory init() {
        try {
            PowrmartFactory thePowrmartFactory = (PowrmartFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/Thesis%20EMF/model/powrmart.xsd"); 
            if (thePowrmartFactory != null) {
                return thePowrmartFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PowrmartFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowrmartFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case PowrmartPackage.ASSOCIATEDSOURCEINSTANCE_TYPE: return createASSOCIATEDSOURCEINSTANCEType();
            case PowrmartPackage.ATTRIBUTE_TYPE: return createATTRIBUTEType();
            case PowrmartPackage.CONFIGREFERENCE_TYPE: return createCONFIGREFERENCEType();
            case PowrmartPackage.CONFIG_TYPE: return createCONFIGType();
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE: return createCONNECTIONREFERENCEType();
            case PowrmartPackage.CONNECTOR_TYPE: return createCONNECTORType();
            case PowrmartPackage.CONWFRUNINFO_TYPE: return createCONWFRUNINFOType();
            case PowrmartPackage.CUSTOM_TYPE: return createCUSTOMType();
            case PowrmartPackage.DAILYFREQUENCY_TYPE: return createDAILYFREQUENCYType();
            case PowrmartPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case PowrmartPackage.ENDOPTIONS_TYPE: return createENDOPTIONSType();
            case PowrmartPackage.ERPINFO_TYPE: return createERPINFOType();
            case PowrmartPackage.ERPSRCINFO_TYPE: return createERPSRCINFOType();
            case PowrmartPackage.EXPRMACRODEPENDENCY_TYPE: return createEXPRMACRODEPENDENCYType();
            case PowrmartPackage.EXPRMACRO_TYPE: return createEXPRMACROType();
            case PowrmartPackage.FIELDATTRIBUTE_TYPE: return createFIELDATTRIBUTEType();
            case PowrmartPackage.FIELDDEPENDENCY_TYPE: return createFIELDDEPENDENCYType();
            case PowrmartPackage.FILTER_TYPE: return createFILTERType();
            case PowrmartPackage.FLATFILE_TYPE: return createFLATFILEType();
            case PowrmartPackage.FOLDER_TYPE: return createFOLDERType();
            case PowrmartPackage.FOLDERVERSION_TYPE: return createFOLDERVERSIONType();
            case PowrmartPackage.GROUP_TYPE: return createGROUPType();
            case PowrmartPackage.HASHKEY_TYPE: return createHASHKEYType();
            case PowrmartPackage.INITPROP_TYPE: return createINITPROPType();
            case PowrmartPackage.INSTANCE_TYPE: return createINSTANCEType();
            case PowrmartPackage.KEYRANGE_TYPE: return createKEYRANGEType();
            case PowrmartPackage.KEYWORD_TYPE: return createKEYWORDType();
            case PowrmartPackage.MACROARGUMENT_TYPE: return createMACROARGUMENTType();
            case PowrmartPackage.MACRODEPENDENCY_TYPE: return createMACRODEPENDENCYType();
            case PowrmartPackage.MAPDEPENDENCY_TYPE: return createMAPDEPENDENCYType();
            case PowrmartPackage.MAPPING_TYPE: return createMAPPINGType();
            case PowrmartPackage.MAPPINGVARIABLE_TYPE: return createMAPPINGVARIABLEType();
            case PowrmartPackage.MAPPLET_TYPE: return createMAPPLETType();
            case PowrmartPackage.METADATAEXTENSION_TYPE: return createMETADATAEXTENSIONType();
            case PowrmartPackage.PARTITION_TYPE: return createPARTITIONType();
            case PowrmartPackage.POWERMART_TYPE: return createPOWERMARTType();
            case PowrmartPackage.RECURRING_TYPE: return createRECURRINGType();
            case PowrmartPackage.REPEAT_TYPE: return createREPEATType();
            case PowrmartPackage.REPOSITORY_TYPE: return createREPOSITORYType();
            case PowrmartPackage.RESOURCEREFERENCE_TYPE: return createRESOURCEREFERENCEType();
            case PowrmartPackage.SAPCODEBLOCK_TYPE: return createSAPCODEBLOCKType();
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE: return createSAPFUNCINSTANCEPARAMFLDType();
            case PowrmartPackage.SAPFUNCINSTANCEPARAM_TYPE: return createSAPFUNCINSTANCEPARAMType();
            case PowrmartPackage.SAPFUNCPARAM_TYPE: return createSAPFUNCPARAMType();
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE: return createSAPFUNCTIONINSTANCEType();
            case PowrmartPackage.SAPFUNCTION_TYPE: return createSAPFUNCTIONType();
            case PowrmartPackage.SAPOUTPUTPORT_TYPE: return createSAPOUTPUTPORTType();
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE: return createSAPPROGRAMFLOWOBJECTType();
            case PowrmartPackage.SAPPROGRAM_TYPE: return createSAPPROGRAMType();
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE: return createSAPSTRUCTUREFIELDType();
            case PowrmartPackage.SAPSTRUCTURE_TYPE: return createSAPSTRUCTUREType();
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE: return createSAPTABLEINSTANCEPARAMType();
            case PowrmartPackage.SAPTABLEPARAM_TYPE: return createSAPTABLEPARAMType();
            case PowrmartPackage.SAPVARIABLE_TYPE: return createSAPVARIABLEType();
            case PowrmartPackage.SCHEDULEINFO: return createSCHEDULEINFO();
            case PowrmartPackage.SCHEDULEINFO_TYPE: return createSCHEDULEINFOType();
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE: return createSCHEDULEOPTIONSType();
            case PowrmartPackage.SCHEDULER_TYPE: return createSCHEDULERType();
            case PowrmartPackage.SEBLJOIN_TYPE: return createSEBLJOINType();
            case PowrmartPackage.SEBLLINK_TYPE: return createSEBLLINKType();
            case PowrmartPackage.SEBLMVLINKREL_TYPE: return createSEBLMVLINKRELType();
            case PowrmartPackage.SEBLMVLINK_TYPE: return createSEBLMVLINKType();
            case PowrmartPackage.SEBLSRCINFO_TYPE: return createSEBLSRCINFOType();
            case PowrmartPackage.SESSIONCOMPONENT_TYPE: return createSESSIONCOMPONENTType();
            case PowrmartPackage.SESSIONEXTENSION_TYPE: return createSESSIONEXTENSIONType();
            case PowrmartPackage.SESSION_TYPE: return createSESSIONType();
            case PowrmartPackage.SESSTRANSFORMATIONGROUP_TYPE: return createSESSTRANSFORMATIONGROUPType();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE: return createSESSTRANSFORMATIONINSTType();
            case PowrmartPackage.SHORTCUT_TYPE: return createSHORTCUTType();
            case PowrmartPackage.SOURCEFIELD_TYPE: return createSOURCEFIELDType();
            case PowrmartPackage.SOURCE_TYPE: return createSOURCEType();
            case PowrmartPackage.STARTOPTIONS_TYPE: return createSTARTOPTIONSType();
            case PowrmartPackage.TABLEATTRIBUTE_TYPE: return createTABLEATTRIBUTEType();
            case PowrmartPackage.TARGETFIELD_TYPE: return createTARGETFIELDType();
            case PowrmartPackage.TARGETINDEXFIELD_TYPE: return createTARGETINDEXFIELDType();
            case PowrmartPackage.TARGETINDEX_TYPE: return createTARGETINDEXType();
            case PowrmartPackage.TARGETLOADORDER_TYPE: return createTARGETLOADORDERType();
            case PowrmartPackage.TARGET_TYPE: return createTARGETType();
            case PowrmartPackage.TASKINSTANCE_TYPE: return createTASKINSTANCEType();
            case PowrmartPackage.TASK_TYPE: return createTASKType();
            case PowrmartPackage.TIMER_TYPE: return createTIMERType();
            case PowrmartPackage.TRANSFORMATION_TYPE: return createTRANSFORMATIONType();
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE: return createTRANSFORMFIELDATTRDEFType();
            case PowrmartPackage.TRANSFORMFIELDATTR_TYPE: return createTRANSFORMFIELDATTRType();
            case PowrmartPackage.TRANSFORMFIELD_TYPE: return createTRANSFORMFIELDType();
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE: return createTRANSFORMRESOURCEREFType();
            case PowrmartPackage.VALUEPAIR_TYPE: return createVALUEPAIRType();
            case PowrmartPackage.WORKFLOWEVENT_TYPE: return createWORKFLOWEVENTType();
            case PowrmartPackage.WORKFLOWLINK_TYPE: return createWORKFLOWLINKType();
            case PowrmartPackage.WORKFLOW_TYPE: return createWORKFLOWType();
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE: return createWORKFLOWVARIABLEType();
            case PowrmartPackage.WORKLET_TYPE: return createWORKLETType();
            case PowrmartPackage.XMLINFO_TYPE: return createXMLINFOType();
            case PowrmartPackage.XMLTEXT_TYPE: return createXMLTEXTType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case PowrmartPackage.AGGFUNCTION_TYPE:
                return createAGGFUNCTIONTypeFromString(eDataType, initialValue);
            case PowrmartPackage.DATATYPE_TYPE:
                return createDATATYPETypeFromString(eDataType, initialValue);
            case PowrmartPackage.DAY_TYPE:
                return createDAYTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ENDTYPE_TYPE:
                return createENDTYPETypeFromString(eDataType, initialValue);
            case PowrmartPackage.FAILPARENTIFINSTANCEDIDNOTRUN_TYPE:
                return createFAILPARENTIFINSTANCEDIDNOTRUNTypeFromString(eDataType, initialValue);
            case PowrmartPackage.FAILPARENTIFINSTANCEFAILS_TYPE:
                return createFAILPARENTIFINSTANCEFAILSTypeFromString(eDataType, initialValue);
            case PowrmartPackage.IGNOREINCOMPARE_TYPE:
                return createIGNOREINCOMPARETypeFromString(eDataType, initialValue);
            case PowrmartPackage.IGNORENULLINPUTS_TYPE:
                return createIGNORENULLINPUTSTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISCLIENTEDITABLE_TYPE:
                return createISCLIENTEDITABLETypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISCLIENTVISIBLE_TYPE:
                return createISCLIENTVISIBLETypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISDEFAULT_TYPE:
                return createISDEFAULTTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISENABLED_TYPE:
                return createISENABLEDTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISENABLED_TYPE1:
                return createISENABLEDType1FromString(eDataType, initialValue);
            case PowrmartPackage.ISEXPRESSIONVARIABLE_TYPE:
                return createISEXPRESSIONVARIABLETypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISFILENAMEFIELD_TYPE:
                return createISFILENAMEFIELDTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISNONE_TYPE:
                return createISNONETypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISNULL_TYPE:
                return createISNULLTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISOPTIONAL_TYPE:
                return createISOPTIONALTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISOPTIONAL_TYPE1:
                return createISOPTIONALType1FromString(eDataType, initialValue);
            case PowrmartPackage.ISOUTPUTPORT_TYPE:
                return createISOUTPUTPORTTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISPARAM_TYPE:
                return createISPARAMTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISPERSISTENT_TYPE:
                return createISPERSISTENTTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISPROFILEMAPPING_TYPE:
                return createISPROFILEMAPPINGTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISREFERENCE_TYPE:
                return createISREFERENCETypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISREPARTITIONPOINT_TYPE:
                return createISREPARTITIONPOINTTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISREUSABLE_TYPE:
                return createISREUSABLETypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISRUNNABLESERVICE_TYPE:
                return createISRUNNABLESERVICETypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISSERVICE_TYPE:
                return createISSERVICETypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISSHAREREAD_TYPE:
                return createISSHAREREADTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISSHAREWRITE_TYPE:
                return createISSHAREWRITETypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISSORTKEY_TYPE:
                return createISSORTKEYTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISVALID_TYPE:
                return createISVALIDTypeFromString(eDataType, initialValue);
            case PowrmartPackage.ISVALID_TYPE1:
                return createISVALIDType1FromString(eDataType, initialValue);
            case PowrmartPackage.ISVALID_TYPE2:
                return createISVALIDType2FromString(eDataType, initialValue);
            case PowrmartPackage.ISVALID_TYPE3:
                return createISVALIDType3FromString(eDataType, initialValue);
            case PowrmartPackage.MACROTYPE_TYPE:
                return createMACROTYPETypeFromString(eDataType, initialValue);
            case PowrmartPackage.NULLABLE_TYPE:
                return createNULLABLETypeFromString(eDataType, initialValue);
            case PowrmartPackage.NULLABLE_TYPE1:
                return createNULLABLEType1FromString(eDataType, initialValue);
            case PowrmartPackage.NULLCHARTYPE_TYPE:
                return createNULLCHARTYPETypeFromString(eDataType, initialValue);
            case PowrmartPackage.OBJECTTYPE_TYPE:
                return createOBJECTTYPETypeFromString(eDataType, initialValue);
            case PowrmartPackage.OCCURRENCE_TYPE:
                return createOCCURRENCETypeFromString(eDataType, initialValue);
            case PowrmartPackage.OUTERJOINREL_TYPE:
                return createOUTERJOINRELTypeFromString(eDataType, initialValue);
            case PowrmartPackage.PARENTTYPE_TYPE:
                return createPARENTTYPETypeFromString(eDataType, initialValue);
            case PowrmartPackage.PARENTTYPE_TYPE1:
                return createPARENTTYPEType1FromString(eDataType, initialValue);
            case PowrmartPackage.PARENTTYPE_TYPE2:
                return createPARENTTYPEType2FromString(eDataType, initialValue);
            case PowrmartPackage.PARENTTYPE_TYPE3:
                return createPARENTTYPEType3FromString(eDataType, initialValue);
            case PowrmartPackage.REFERENCETYPE_TYPE:
                return createREFERENCETYPETypeFromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLESCHEDULER_TYPE:
                return createREUSABLESCHEDULERTypeFromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE:
                return createREUSABLETypeFromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE1:
                return createREUSABLEType1FromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE2:
                return createREUSABLEType2FromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE3:
                return createREUSABLEType3FromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE4:
                return createREUSABLEType4FromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE5:
                return createREUSABLEType5FromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE6:
                return createREUSABLEType6FromString(eDataType, initialValue);
            case PowrmartPackage.REVERSEASSIGNMENT_TYPE:
                return createREVERSEASSIGNMENTTypeFromString(eDataType, initialValue);
            case PowrmartPackage.RUNFOREVER_TYPE:
                return createRUNFOREVERTypeFromString(eDataType, initialValue);
            case PowrmartPackage.RUNONCE_TYPE:
                return createRUNONCETypeFromString(eDataType, initialValue);
            case PowrmartPackage.SCHEDULETYPE_TYPE:
                return createSCHEDULETYPETypeFromString(eDataType, initialValue);
            case PowrmartPackage.SCHEDULETYPE_TYPE1:
                return createSCHEDULETYPEType1FromString(eDataType, initialValue);
            case PowrmartPackage.SHARED_TYPE:
                return createSHAREDTypeFromString(eDataType, initialValue);
            case PowrmartPackage.SORTDIRECTION_TYPE:
                return createSORTDIRECTIONTypeFromString(eDataType, initialValue);
            case PowrmartPackage.STAGEFILEPERSIST_TYPE:
                return createSTAGEFILEPERSISTTypeFromString(eDataType, initialValue);
            case PowrmartPackage.STAGEFILEREINIT_TYPE:
                return createSTAGEFILEREINITTypeFromString(eDataType, initialValue);
            case PowrmartPackage.SUBTYPE_TYPE:
                return createSUBTYPETypeFromString(eDataType, initialValue);
            case PowrmartPackage.SUBTYPE_TYPE1:
                return createSUBTYPEType1FromString(eDataType, initialValue);
            case PowrmartPackage.SUSPENDONERROR_TYPE:
                return createSUSPENDONERRORTypeFromString(eDataType, initialValue);
            case PowrmartPackage.TASKSMUSTRUNONSERVER_TYPE:
                return createTASKSMUSTRUNONSERVERTypeFromString(eDataType, initialValue);
            case PowrmartPackage.TIMERTYPE_TYPE:
                return createTIMERTYPETypeFromString(eDataType, initialValue);
            case PowrmartPackage.TREATINPUTLINKASAND_TYPE:
                return createTREATINPUTLINKASANDTypeFromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE:
                return createTYPETypeFromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE1:
                return createTYPEType1FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE2:
                return createTYPEType2FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE3:
                return createTYPEType3FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE4:
                return createTYPEType4FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE5:
                return createTYPEType5FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE6:
                return createTYPEType6FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE7:
                return createTYPEType7FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE8:
                return createTYPEType8FromString(eDataType, initialValue);
            case PowrmartPackage.USERDEFINED_TYPE:
                return createUSERDEFINEDTypeFromString(eDataType, initialValue);
            case PowrmartPackage.USERDEFINED_TYPE1:
                return createUSERDEFINEDType1FromString(eDataType, initialValue);
            case PowrmartPackage.VALUETYPE_TYPE:
                return createVALUETYPETypeFromString(eDataType, initialValue);
            case PowrmartPackage.VALUETYPE_TYPE1:
                return createVALUETYPEType1FromString(eDataType, initialValue);
            case PowrmartPackage.VALUETYPE_TYPE2:
                return createVALUETYPEType2FromString(eDataType, initialValue);
            case PowrmartPackage.AGGFUNCTION_TYPE_OBJECT:
                return createAGGFUNCTIONTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.DATATYPE_TYPE_OBJECT:
                return createDATATYPETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.DAY_TYPE_OBJECT:
                return createDAYTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ENDTYPE_TYPE_OBJECT:
                return createENDTYPETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.FAILPARENTIFINSTANCEDIDNOTRUN_TYPE_OBJECT:
                return createFAILPARENTIFINSTANCEDIDNOTRUNTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.FAILPARENTIFINSTANCEFAILS_TYPE_OBJECT:
                return createFAILPARENTIFINSTANCEFAILSTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.IGNOREINCOMPARE_TYPE_OBJECT:
                return createIGNOREINCOMPARETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.IGNORENULLINPUTS_TYPE_OBJECT:
                return createIGNORENULLINPUTSTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISCLIENTEDITABLE_TYPE_OBJECT:
                return createISCLIENTEDITABLETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISCLIENTVISIBLE_TYPE_OBJECT:
                return createISCLIENTVISIBLETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISDEFAULT_TYPE_OBJECT:
                return createISDEFAULTTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISENABLED_TYPE_OBJECT:
                return createISENABLEDTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISENABLED_TYPE_OBJECT1:
                return createISENABLEDTypeObject1FromString(eDataType, initialValue);
            case PowrmartPackage.ISEXPRESSIONVARIABLE_TYPE_OBJECT:
                return createISEXPRESSIONVARIABLETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISFILENAMEFIELD_TYPE_OBJECT:
                return createISFILENAMEFIELDTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISNONE_TYPE_OBJECT:
                return createISNONETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISNULL_TYPE_OBJECT:
                return createISNULLTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISOPTIONAL_TYPE_OBJECT:
                return createISOPTIONALTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISOPTIONAL_TYPE_OBJECT1:
                return createISOPTIONALTypeObject1FromString(eDataType, initialValue);
            case PowrmartPackage.ISOUTPUTPORT_TYPE_OBJECT:
                return createISOUTPUTPORTTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISPARAM_TYPE_OBJECT:
                return createISPARAMTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISPERSISTENT_TYPE_OBJECT:
                return createISPERSISTENTTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISPROFILEMAPPING_TYPE_OBJECT:
                return createISPROFILEMAPPINGTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISREFERENCE_TYPE_OBJECT:
                return createISREFERENCETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISREPARTITIONPOINT_TYPE_OBJECT:
                return createISREPARTITIONPOINTTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISREUSABLE_TYPE_OBJECT:
                return createISREUSABLETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISRUNNABLESERVICE_TYPE_OBJECT:
                return createISRUNNABLESERVICETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISSERVICE_TYPE_OBJECT:
                return createISSERVICETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISSHAREREAD_TYPE_OBJECT:
                return createISSHAREREADTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISSHAREWRITE_TYPE_OBJECT:
                return createISSHAREWRITETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISSORTKEY_TYPE_OBJECT:
                return createISSORTKEYTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISVALID_TYPE_OBJECT:
                return createISVALIDTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.ISVALID_TYPE_OBJECT1:
                return createISVALIDTypeObject1FromString(eDataType, initialValue);
            case PowrmartPackage.ISVALID_TYPE_OBJECT2:
                return createISVALIDTypeObject2FromString(eDataType, initialValue);
            case PowrmartPackage.ISVALID_TYPE_OBJECT3:
                return createISVALIDTypeObject3FromString(eDataType, initialValue);
            case PowrmartPackage.MACROTYPE_TYPE_OBJECT:
                return createMACROTYPETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.NULLABLE_TYPE_OBJECT:
                return createNULLABLETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.NULLABLE_TYPE_OBJECT1:
                return createNULLABLETypeObject1FromString(eDataType, initialValue);
            case PowrmartPackage.NULLCHARTYPE_TYPE_OBJECT:
                return createNULLCHARTYPETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.OBJECTTYPE_TYPE_OBJECT:
                return createOBJECTTYPETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.OCCURRENCE_TYPE_OBJECT:
                return createOCCURRENCETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.OUTERJOINREL_TYPE_OBJECT:
                return createOUTERJOINRELTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.PARENTTYPE_TYPE_OBJECT:
                return createPARENTTYPETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.PARENTTYPE_TYPE_OBJECT1:
                return createPARENTTYPETypeObject1FromString(eDataType, initialValue);
            case PowrmartPackage.PARENTTYPE_TYPE_OBJECT2:
                return createPARENTTYPETypeObject2FromString(eDataType, initialValue);
            case PowrmartPackage.PARENTTYPE_TYPE_OBJECT3:
                return createPARENTTYPETypeObject3FromString(eDataType, initialValue);
            case PowrmartPackage.REFERENCETYPE_TYPE_OBJECT:
                return createREFERENCETYPETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLESCHEDULER_TYPE_OBJECT:
                return createREUSABLESCHEDULERTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT:
                return createREUSABLETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT1:
                return createREUSABLETypeObject1FromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT2:
                return createREUSABLETypeObject2FromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT3:
                return createREUSABLETypeObject3FromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT4:
                return createREUSABLETypeObject4FromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT5:
                return createREUSABLETypeObject5FromString(eDataType, initialValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT6:
                return createREUSABLETypeObject6FromString(eDataType, initialValue);
            case PowrmartPackage.REVERSEASSIGNMENT_TYPE_OBJECT:
                return createREVERSEASSIGNMENTTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.RUNFOREVER_TYPE_OBJECT:
                return createRUNFOREVERTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.RUNONCE_TYPE_OBJECT:
                return createRUNONCETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.SCHEDULETYPE_TYPE_OBJECT:
                return createSCHEDULETYPETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.SCHEDULETYPE_TYPE_OBJECT1:
                return createSCHEDULETYPETypeObject1FromString(eDataType, initialValue);
            case PowrmartPackage.SHARED_TYPE_OBJECT:
                return createSHAREDTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.SORTDIRECTION_TYPE_OBJECT:
                return createSORTDIRECTIONTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.STAGEFILEPERSIST_TYPE_OBJECT:
                return createSTAGEFILEPERSISTTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.STAGEFILEREINIT_TYPE_OBJECT:
                return createSTAGEFILEREINITTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.SUBTYPE_TYPE_OBJECT:
                return createSUBTYPETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.SUBTYPE_TYPE_OBJECT1:
                return createSUBTYPETypeObject1FromString(eDataType, initialValue);
            case PowrmartPackage.SUSPENDONERROR_TYPE_OBJECT:
                return createSUSPENDONERRORTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.TASKSMUSTRUNONSERVER_TYPE_OBJECT:
                return createTASKSMUSTRUNONSERVERTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.TIMERTYPE_TYPE_OBJECT:
                return createTIMERTYPETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.TREATINPUTLINKASAND_TYPE_OBJECT:
                return createTREATINPUTLINKASANDTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT:
                return createTYPETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT1:
                return createTYPETypeObject1FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT2:
                return createTYPETypeObject2FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT3:
                return createTYPETypeObject3FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT4:
                return createTYPETypeObject4FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT5:
                return createTYPETypeObject5FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT6:
                return createTYPETypeObject6FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT7:
                return createTYPETypeObject7FromString(eDataType, initialValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT8:
                return createTYPETypeObject8FromString(eDataType, initialValue);
            case PowrmartPackage.USERDEFINED_TYPE_OBJECT:
                return createUSERDEFINEDTypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.USERDEFINED_TYPE_OBJECT1:
                return createUSERDEFINEDTypeObject1FromString(eDataType, initialValue);
            case PowrmartPackage.VALUETYPE_TYPE_OBJECT:
                return createVALUETYPETypeObjectFromString(eDataType, initialValue);
            case PowrmartPackage.VALUETYPE_TYPE_OBJECT1:
                return createVALUETYPETypeObject1FromString(eDataType, initialValue);
            case PowrmartPackage.VALUETYPE_TYPE_OBJECT2:
                return createVALUETYPETypeObject2FromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case PowrmartPackage.AGGFUNCTION_TYPE:
                return convertAGGFUNCTIONTypeToString(eDataType, instanceValue);
            case PowrmartPackage.DATATYPE_TYPE:
                return convertDATATYPETypeToString(eDataType, instanceValue);
            case PowrmartPackage.DAY_TYPE:
                return convertDAYTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ENDTYPE_TYPE:
                return convertENDTYPETypeToString(eDataType, instanceValue);
            case PowrmartPackage.FAILPARENTIFINSTANCEDIDNOTRUN_TYPE:
                return convertFAILPARENTIFINSTANCEDIDNOTRUNTypeToString(eDataType, instanceValue);
            case PowrmartPackage.FAILPARENTIFINSTANCEFAILS_TYPE:
                return convertFAILPARENTIFINSTANCEFAILSTypeToString(eDataType, instanceValue);
            case PowrmartPackage.IGNOREINCOMPARE_TYPE:
                return convertIGNOREINCOMPARETypeToString(eDataType, instanceValue);
            case PowrmartPackage.IGNORENULLINPUTS_TYPE:
                return convertIGNORENULLINPUTSTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISCLIENTEDITABLE_TYPE:
                return convertISCLIENTEDITABLETypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISCLIENTVISIBLE_TYPE:
                return convertISCLIENTVISIBLETypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISDEFAULT_TYPE:
                return convertISDEFAULTTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISENABLED_TYPE:
                return convertISENABLEDTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISENABLED_TYPE1:
                return convertISENABLEDType1ToString(eDataType, instanceValue);
            case PowrmartPackage.ISEXPRESSIONVARIABLE_TYPE:
                return convertISEXPRESSIONVARIABLETypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISFILENAMEFIELD_TYPE:
                return convertISFILENAMEFIELDTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISNONE_TYPE:
                return convertISNONETypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISNULL_TYPE:
                return convertISNULLTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISOPTIONAL_TYPE:
                return convertISOPTIONALTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISOPTIONAL_TYPE1:
                return convertISOPTIONALType1ToString(eDataType, instanceValue);
            case PowrmartPackage.ISOUTPUTPORT_TYPE:
                return convertISOUTPUTPORTTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISPARAM_TYPE:
                return convertISPARAMTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISPERSISTENT_TYPE:
                return convertISPERSISTENTTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISPROFILEMAPPING_TYPE:
                return convertISPROFILEMAPPINGTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISREFERENCE_TYPE:
                return convertISREFERENCETypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISREPARTITIONPOINT_TYPE:
                return convertISREPARTITIONPOINTTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISREUSABLE_TYPE:
                return convertISREUSABLETypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISRUNNABLESERVICE_TYPE:
                return convertISRUNNABLESERVICETypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISSERVICE_TYPE:
                return convertISSERVICETypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISSHAREREAD_TYPE:
                return convertISSHAREREADTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISSHAREWRITE_TYPE:
                return convertISSHAREWRITETypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISSORTKEY_TYPE:
                return convertISSORTKEYTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISVALID_TYPE:
                return convertISVALIDTypeToString(eDataType, instanceValue);
            case PowrmartPackage.ISVALID_TYPE1:
                return convertISVALIDType1ToString(eDataType, instanceValue);
            case PowrmartPackage.ISVALID_TYPE2:
                return convertISVALIDType2ToString(eDataType, instanceValue);
            case PowrmartPackage.ISVALID_TYPE3:
                return convertISVALIDType3ToString(eDataType, instanceValue);
            case PowrmartPackage.MACROTYPE_TYPE:
                return convertMACROTYPETypeToString(eDataType, instanceValue);
            case PowrmartPackage.NULLABLE_TYPE:
                return convertNULLABLETypeToString(eDataType, instanceValue);
            case PowrmartPackage.NULLABLE_TYPE1:
                return convertNULLABLEType1ToString(eDataType, instanceValue);
            case PowrmartPackage.NULLCHARTYPE_TYPE:
                return convertNULLCHARTYPETypeToString(eDataType, instanceValue);
            case PowrmartPackage.OBJECTTYPE_TYPE:
                return convertOBJECTTYPETypeToString(eDataType, instanceValue);
            case PowrmartPackage.OCCURRENCE_TYPE:
                return convertOCCURRENCETypeToString(eDataType, instanceValue);
            case PowrmartPackage.OUTERJOINREL_TYPE:
                return convertOUTERJOINRELTypeToString(eDataType, instanceValue);
            case PowrmartPackage.PARENTTYPE_TYPE:
                return convertPARENTTYPETypeToString(eDataType, instanceValue);
            case PowrmartPackage.PARENTTYPE_TYPE1:
                return convertPARENTTYPEType1ToString(eDataType, instanceValue);
            case PowrmartPackage.PARENTTYPE_TYPE2:
                return convertPARENTTYPEType2ToString(eDataType, instanceValue);
            case PowrmartPackage.PARENTTYPE_TYPE3:
                return convertPARENTTYPEType3ToString(eDataType, instanceValue);
            case PowrmartPackage.REFERENCETYPE_TYPE:
                return convertREFERENCETYPETypeToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLESCHEDULER_TYPE:
                return convertREUSABLESCHEDULERTypeToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE:
                return convertREUSABLETypeToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE1:
                return convertREUSABLEType1ToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE2:
                return convertREUSABLEType2ToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE3:
                return convertREUSABLEType3ToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE4:
                return convertREUSABLEType4ToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE5:
                return convertREUSABLEType5ToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE6:
                return convertREUSABLEType6ToString(eDataType, instanceValue);
            case PowrmartPackage.REVERSEASSIGNMENT_TYPE:
                return convertREVERSEASSIGNMENTTypeToString(eDataType, instanceValue);
            case PowrmartPackage.RUNFOREVER_TYPE:
                return convertRUNFOREVERTypeToString(eDataType, instanceValue);
            case PowrmartPackage.RUNONCE_TYPE:
                return convertRUNONCETypeToString(eDataType, instanceValue);
            case PowrmartPackage.SCHEDULETYPE_TYPE:
                return convertSCHEDULETYPETypeToString(eDataType, instanceValue);
            case PowrmartPackage.SCHEDULETYPE_TYPE1:
                return convertSCHEDULETYPEType1ToString(eDataType, instanceValue);
            case PowrmartPackage.SHARED_TYPE:
                return convertSHAREDTypeToString(eDataType, instanceValue);
            case PowrmartPackage.SORTDIRECTION_TYPE:
                return convertSORTDIRECTIONTypeToString(eDataType, instanceValue);
            case PowrmartPackage.STAGEFILEPERSIST_TYPE:
                return convertSTAGEFILEPERSISTTypeToString(eDataType, instanceValue);
            case PowrmartPackage.STAGEFILEREINIT_TYPE:
                return convertSTAGEFILEREINITTypeToString(eDataType, instanceValue);
            case PowrmartPackage.SUBTYPE_TYPE:
                return convertSUBTYPETypeToString(eDataType, instanceValue);
            case PowrmartPackage.SUBTYPE_TYPE1:
                return convertSUBTYPEType1ToString(eDataType, instanceValue);
            case PowrmartPackage.SUSPENDONERROR_TYPE:
                return convertSUSPENDONERRORTypeToString(eDataType, instanceValue);
            case PowrmartPackage.TASKSMUSTRUNONSERVER_TYPE:
                return convertTASKSMUSTRUNONSERVERTypeToString(eDataType, instanceValue);
            case PowrmartPackage.TIMERTYPE_TYPE:
                return convertTIMERTYPETypeToString(eDataType, instanceValue);
            case PowrmartPackage.TREATINPUTLINKASAND_TYPE:
                return convertTREATINPUTLINKASANDTypeToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE:
                return convertTYPETypeToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE1:
                return convertTYPEType1ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE2:
                return convertTYPEType2ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE3:
                return convertTYPEType3ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE4:
                return convertTYPEType4ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE5:
                return convertTYPEType5ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE6:
                return convertTYPEType6ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE7:
                return convertTYPEType7ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE8:
                return convertTYPEType8ToString(eDataType, instanceValue);
            case PowrmartPackage.USERDEFINED_TYPE:
                return convertUSERDEFINEDTypeToString(eDataType, instanceValue);
            case PowrmartPackage.USERDEFINED_TYPE1:
                return convertUSERDEFINEDType1ToString(eDataType, instanceValue);
            case PowrmartPackage.VALUETYPE_TYPE:
                return convertVALUETYPETypeToString(eDataType, instanceValue);
            case PowrmartPackage.VALUETYPE_TYPE1:
                return convertVALUETYPEType1ToString(eDataType, instanceValue);
            case PowrmartPackage.VALUETYPE_TYPE2:
                return convertVALUETYPEType2ToString(eDataType, instanceValue);
            case PowrmartPackage.AGGFUNCTION_TYPE_OBJECT:
                return convertAGGFUNCTIONTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.DATATYPE_TYPE_OBJECT:
                return convertDATATYPETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.DAY_TYPE_OBJECT:
                return convertDAYTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ENDTYPE_TYPE_OBJECT:
                return convertENDTYPETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.FAILPARENTIFINSTANCEDIDNOTRUN_TYPE_OBJECT:
                return convertFAILPARENTIFINSTANCEDIDNOTRUNTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.FAILPARENTIFINSTANCEFAILS_TYPE_OBJECT:
                return convertFAILPARENTIFINSTANCEFAILSTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.IGNOREINCOMPARE_TYPE_OBJECT:
                return convertIGNOREINCOMPARETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.IGNORENULLINPUTS_TYPE_OBJECT:
                return convertIGNORENULLINPUTSTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISCLIENTEDITABLE_TYPE_OBJECT:
                return convertISCLIENTEDITABLETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISCLIENTVISIBLE_TYPE_OBJECT:
                return convertISCLIENTVISIBLETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISDEFAULT_TYPE_OBJECT:
                return convertISDEFAULTTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISENABLED_TYPE_OBJECT:
                return convertISENABLEDTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISENABLED_TYPE_OBJECT1:
                return convertISENABLEDTypeObject1ToString(eDataType, instanceValue);
            case PowrmartPackage.ISEXPRESSIONVARIABLE_TYPE_OBJECT:
                return convertISEXPRESSIONVARIABLETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISFILENAMEFIELD_TYPE_OBJECT:
                return convertISFILENAMEFIELDTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISNONE_TYPE_OBJECT:
                return convertISNONETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISNULL_TYPE_OBJECT:
                return convertISNULLTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISOPTIONAL_TYPE_OBJECT:
                return convertISOPTIONALTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISOPTIONAL_TYPE_OBJECT1:
                return convertISOPTIONALTypeObject1ToString(eDataType, instanceValue);
            case PowrmartPackage.ISOUTPUTPORT_TYPE_OBJECT:
                return convertISOUTPUTPORTTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISPARAM_TYPE_OBJECT:
                return convertISPARAMTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISPERSISTENT_TYPE_OBJECT:
                return convertISPERSISTENTTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISPROFILEMAPPING_TYPE_OBJECT:
                return convertISPROFILEMAPPINGTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISREFERENCE_TYPE_OBJECT:
                return convertISREFERENCETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISREPARTITIONPOINT_TYPE_OBJECT:
                return convertISREPARTITIONPOINTTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISREUSABLE_TYPE_OBJECT:
                return convertISREUSABLETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISRUNNABLESERVICE_TYPE_OBJECT:
                return convertISRUNNABLESERVICETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISSERVICE_TYPE_OBJECT:
                return convertISSERVICETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISSHAREREAD_TYPE_OBJECT:
                return convertISSHAREREADTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISSHAREWRITE_TYPE_OBJECT:
                return convertISSHAREWRITETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISSORTKEY_TYPE_OBJECT:
                return convertISSORTKEYTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISVALID_TYPE_OBJECT:
                return convertISVALIDTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.ISVALID_TYPE_OBJECT1:
                return convertISVALIDTypeObject1ToString(eDataType, instanceValue);
            case PowrmartPackage.ISVALID_TYPE_OBJECT2:
                return convertISVALIDTypeObject2ToString(eDataType, instanceValue);
            case PowrmartPackage.ISVALID_TYPE_OBJECT3:
                return convertISVALIDTypeObject3ToString(eDataType, instanceValue);
            case PowrmartPackage.MACROTYPE_TYPE_OBJECT:
                return convertMACROTYPETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.NULLABLE_TYPE_OBJECT:
                return convertNULLABLETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.NULLABLE_TYPE_OBJECT1:
                return convertNULLABLETypeObject1ToString(eDataType, instanceValue);
            case PowrmartPackage.NULLCHARTYPE_TYPE_OBJECT:
                return convertNULLCHARTYPETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.OBJECTTYPE_TYPE_OBJECT:
                return convertOBJECTTYPETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.OCCURRENCE_TYPE_OBJECT:
                return convertOCCURRENCETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.OUTERJOINREL_TYPE_OBJECT:
                return convertOUTERJOINRELTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.PARENTTYPE_TYPE_OBJECT:
                return convertPARENTTYPETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.PARENTTYPE_TYPE_OBJECT1:
                return convertPARENTTYPETypeObject1ToString(eDataType, instanceValue);
            case PowrmartPackage.PARENTTYPE_TYPE_OBJECT2:
                return convertPARENTTYPETypeObject2ToString(eDataType, instanceValue);
            case PowrmartPackage.PARENTTYPE_TYPE_OBJECT3:
                return convertPARENTTYPETypeObject3ToString(eDataType, instanceValue);
            case PowrmartPackage.REFERENCETYPE_TYPE_OBJECT:
                return convertREFERENCETYPETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLESCHEDULER_TYPE_OBJECT:
                return convertREUSABLESCHEDULERTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT:
                return convertREUSABLETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT1:
                return convertREUSABLETypeObject1ToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT2:
                return convertREUSABLETypeObject2ToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT3:
                return convertREUSABLETypeObject3ToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT4:
                return convertREUSABLETypeObject4ToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT5:
                return convertREUSABLETypeObject5ToString(eDataType, instanceValue);
            case PowrmartPackage.REUSABLE_TYPE_OBJECT6:
                return convertREUSABLETypeObject6ToString(eDataType, instanceValue);
            case PowrmartPackage.REVERSEASSIGNMENT_TYPE_OBJECT:
                return convertREVERSEASSIGNMENTTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.RUNFOREVER_TYPE_OBJECT:
                return convertRUNFOREVERTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.RUNONCE_TYPE_OBJECT:
                return convertRUNONCETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.SCHEDULETYPE_TYPE_OBJECT:
                return convertSCHEDULETYPETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.SCHEDULETYPE_TYPE_OBJECT1:
                return convertSCHEDULETYPETypeObject1ToString(eDataType, instanceValue);
            case PowrmartPackage.SHARED_TYPE_OBJECT:
                return convertSHAREDTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.SORTDIRECTION_TYPE_OBJECT:
                return convertSORTDIRECTIONTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.STAGEFILEPERSIST_TYPE_OBJECT:
                return convertSTAGEFILEPERSISTTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.STAGEFILEREINIT_TYPE_OBJECT:
                return convertSTAGEFILEREINITTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.SUBTYPE_TYPE_OBJECT:
                return convertSUBTYPETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.SUBTYPE_TYPE_OBJECT1:
                return convertSUBTYPETypeObject1ToString(eDataType, instanceValue);
            case PowrmartPackage.SUSPENDONERROR_TYPE_OBJECT:
                return convertSUSPENDONERRORTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.TASKSMUSTRUNONSERVER_TYPE_OBJECT:
                return convertTASKSMUSTRUNONSERVERTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.TIMERTYPE_TYPE_OBJECT:
                return convertTIMERTYPETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.TREATINPUTLINKASAND_TYPE_OBJECT:
                return convertTREATINPUTLINKASANDTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT:
                return convertTYPETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT1:
                return convertTYPETypeObject1ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT2:
                return convertTYPETypeObject2ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT3:
                return convertTYPETypeObject3ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT4:
                return convertTYPETypeObject4ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT5:
                return convertTYPETypeObject5ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT6:
                return convertTYPETypeObject6ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT7:
                return convertTYPETypeObject7ToString(eDataType, instanceValue);
            case PowrmartPackage.TYPE_TYPE_OBJECT8:
                return convertTYPETypeObject8ToString(eDataType, instanceValue);
            case PowrmartPackage.USERDEFINED_TYPE_OBJECT:
                return convertUSERDEFINEDTypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.USERDEFINED_TYPE_OBJECT1:
                return convertUSERDEFINEDTypeObject1ToString(eDataType, instanceValue);
            case PowrmartPackage.VALUETYPE_TYPE_OBJECT:
                return convertVALUETYPETypeObjectToString(eDataType, instanceValue);
            case PowrmartPackage.VALUETYPE_TYPE_OBJECT1:
                return convertVALUETYPETypeObject1ToString(eDataType, instanceValue);
            case PowrmartPackage.VALUETYPE_TYPE_OBJECT2:
                return convertVALUETYPETypeObject2ToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ASSOCIATEDSOURCEINSTANCEType createASSOCIATEDSOURCEINSTANCEType() {
        ASSOCIATEDSOURCEINSTANCETypeImpl associatedsourceinstanceType = new ASSOCIATEDSOURCEINSTANCETypeImpl();
        return associatedsourceinstanceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ATTRIBUTEType createATTRIBUTEType() {
        ATTRIBUTETypeImpl attributeType = new ATTRIBUTETypeImpl();
        return attributeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONFIGREFERENCEType createCONFIGREFERENCEType() {
        CONFIGREFERENCETypeImpl configreferenceType = new CONFIGREFERENCETypeImpl();
        return configreferenceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONFIGType createCONFIGType() {
        CONFIGTypeImpl configType = new CONFIGTypeImpl();
        return configType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONNECTIONREFERENCEType createCONNECTIONREFERENCEType() {
        CONNECTIONREFERENCETypeImpl connectionreferenceType = new CONNECTIONREFERENCETypeImpl();
        return connectionreferenceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONNECTORType createCONNECTORType() {
        CONNECTORTypeImpl connectorType = new CONNECTORTypeImpl();
        return connectorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONWFRUNINFOType createCONWFRUNINFOType() {
        CONWFRUNINFOTypeImpl conwfruninfoType = new CONWFRUNINFOTypeImpl();
        return conwfruninfoType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CUSTOMType createCUSTOMType() {
        CUSTOMTypeImpl customType = new CUSTOMTypeImpl();
        return customType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DAILYFREQUENCYType createDAILYFREQUENCYType() {
        DAILYFREQUENCYTypeImpl dailyfrequencyType = new DAILYFREQUENCYTypeImpl();
        return dailyfrequencyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ENDOPTIONSType createENDOPTIONSType() {
        ENDOPTIONSTypeImpl endoptionsType = new ENDOPTIONSTypeImpl();
        return endoptionsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ERPINFOType createERPINFOType() {
        ERPINFOTypeImpl erpinfoType = new ERPINFOTypeImpl();
        return erpinfoType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ERPSRCINFOType createERPSRCINFOType() {
        ERPSRCINFOTypeImpl erpsrcinfoType = new ERPSRCINFOTypeImpl();
        return erpsrcinfoType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EXPRMACRODEPENDENCYType createEXPRMACRODEPENDENCYType() {
        EXPRMACRODEPENDENCYTypeImpl exprmacrodependencyType = new EXPRMACRODEPENDENCYTypeImpl();
        return exprmacrodependencyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EXPRMACROType createEXPRMACROType() {
        EXPRMACROTypeImpl exprmacroType = new EXPRMACROTypeImpl();
        return exprmacroType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FIELDATTRIBUTEType createFIELDATTRIBUTEType() {
        FIELDATTRIBUTETypeImpl fieldattributeType = new FIELDATTRIBUTETypeImpl();
        return fieldattributeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FIELDDEPENDENCYType createFIELDDEPENDENCYType() {
        FIELDDEPENDENCYTypeImpl fielddependencyType = new FIELDDEPENDENCYTypeImpl();
        return fielddependencyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FILTERType createFILTERType() {
        FILTERTypeImpl filterType = new FILTERTypeImpl();
        return filterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FLATFILEType createFLATFILEType() {
        FLATFILETypeImpl flatfileType = new FLATFILETypeImpl();
        return flatfileType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FOLDERType createFOLDERType() {
        FOLDERTypeImpl folderType = new FOLDERTypeImpl();
        return folderType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FOLDERVERSIONType createFOLDERVERSIONType() {
        FOLDERVERSIONTypeImpl folderversionType = new FOLDERVERSIONTypeImpl();
        return folderversionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GROUPType createGROUPType() {
        GROUPTypeImpl groupType = new GROUPTypeImpl();
        return groupType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HASHKEYType createHASHKEYType() {
        HASHKEYTypeImpl hashkeyType = new HASHKEYTypeImpl();
        return hashkeyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public INITPROPType createINITPROPType() {
        INITPROPTypeImpl initpropType = new INITPROPTypeImpl();
        return initpropType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public INSTANCEType createINSTANCEType() {
        INSTANCETypeImpl instanceType = new INSTANCETypeImpl();
        return instanceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KEYRANGEType createKEYRANGEType() {
        KEYRANGETypeImpl keyrangeType = new KEYRANGETypeImpl();
        return keyrangeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KEYWORDType createKEYWORDType() {
        KEYWORDTypeImpl keywordType = new KEYWORDTypeImpl();
        return keywordType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MACROARGUMENTType createMACROARGUMENTType() {
        MACROARGUMENTTypeImpl macroargumentType = new MACROARGUMENTTypeImpl();
        return macroargumentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MACRODEPENDENCYType createMACRODEPENDENCYType() {
        MACRODEPENDENCYTypeImpl macrodependencyType = new MACRODEPENDENCYTypeImpl();
        return macrodependencyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MAPDEPENDENCYType createMAPDEPENDENCYType() {
        MAPDEPENDENCYTypeImpl mapdependencyType = new MAPDEPENDENCYTypeImpl();
        return mapdependencyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MAPPINGType createMAPPINGType() {
        MAPPINGTypeImpl mappingType = new MAPPINGTypeImpl();
        return mappingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MAPPINGVARIABLEType createMAPPINGVARIABLEType() {
        MAPPINGVARIABLETypeImpl mappingvariableType = new MAPPINGVARIABLETypeImpl();
        return mappingvariableType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MAPPLETType createMAPPLETType() {
        MAPPLETTypeImpl mappletType = new MAPPLETTypeImpl();
        return mappletType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public METADATAEXTENSIONType createMETADATAEXTENSIONType() {
        METADATAEXTENSIONTypeImpl metadataextensionType = new METADATAEXTENSIONTypeImpl();
        return metadataextensionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARTITIONType createPARTITIONType() {
        PARTITIONTypeImpl partitionType = new PARTITIONTypeImpl();
        return partitionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public POWERMARTType createPOWERMARTType() {
        POWERMARTTypeImpl powermartType = new POWERMARTTypeImpl();
        return powermartType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RECURRINGType createRECURRINGType() {
        RECURRINGTypeImpl recurringType = new RECURRINGTypeImpl();
        return recurringType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REPEATType createREPEATType() {
        REPEATTypeImpl repeatType = new REPEATTypeImpl();
        return repeatType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REPOSITORYType createREPOSITORYType() {
        REPOSITORYTypeImpl repositoryType = new REPOSITORYTypeImpl();
        return repositoryType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RESOURCEREFERENCEType createRESOURCEREFERENCEType() {
        RESOURCEREFERENCETypeImpl resourcereferenceType = new RESOURCEREFERENCETypeImpl();
        return resourcereferenceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPCODEBLOCKType createSAPCODEBLOCKType() {
        SAPCODEBLOCKTypeImpl sapcodeblockType = new SAPCODEBLOCKTypeImpl();
        return sapcodeblockType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPFUNCINSTANCEPARAMFLDType createSAPFUNCINSTANCEPARAMFLDType() {
        SAPFUNCINSTANCEPARAMFLDTypeImpl sapfuncinstanceparamfldType = new SAPFUNCINSTANCEPARAMFLDTypeImpl();
        return sapfuncinstanceparamfldType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPFUNCINSTANCEPARAMType createSAPFUNCINSTANCEPARAMType() {
        SAPFUNCINSTANCEPARAMTypeImpl sapfuncinstanceparamType = new SAPFUNCINSTANCEPARAMTypeImpl();
        return sapfuncinstanceparamType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPFUNCPARAMType createSAPFUNCPARAMType() {
        SAPFUNCPARAMTypeImpl sapfuncparamType = new SAPFUNCPARAMTypeImpl();
        return sapfuncparamType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPFUNCTIONINSTANCEType createSAPFUNCTIONINSTANCEType() {
        SAPFUNCTIONINSTANCETypeImpl sapfunctioninstanceType = new SAPFUNCTIONINSTANCETypeImpl();
        return sapfunctioninstanceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPFUNCTIONType createSAPFUNCTIONType() {
        SAPFUNCTIONTypeImpl sapfunctionType = new SAPFUNCTIONTypeImpl();
        return sapfunctionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPOUTPUTPORTType createSAPOUTPUTPORTType() {
        SAPOUTPUTPORTTypeImpl sapoutputportType = new SAPOUTPUTPORTTypeImpl();
        return sapoutputportType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPPROGRAMFLOWOBJECTType createSAPPROGRAMFLOWOBJECTType() {
        SAPPROGRAMFLOWOBJECTTypeImpl sapprogramflowobjectType = new SAPPROGRAMFLOWOBJECTTypeImpl();
        return sapprogramflowobjectType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPPROGRAMType createSAPPROGRAMType() {
        SAPPROGRAMTypeImpl sapprogramType = new SAPPROGRAMTypeImpl();
        return sapprogramType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPSTRUCTUREFIELDType createSAPSTRUCTUREFIELDType() {
        SAPSTRUCTUREFIELDTypeImpl sapstructurefieldType = new SAPSTRUCTUREFIELDTypeImpl();
        return sapstructurefieldType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPSTRUCTUREType createSAPSTRUCTUREType() {
        SAPSTRUCTURETypeImpl sapstructureType = new SAPSTRUCTURETypeImpl();
        return sapstructureType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPTABLEINSTANCEPARAMType createSAPTABLEINSTANCEPARAMType() {
        SAPTABLEINSTANCEPARAMTypeImpl saptableinstanceparamType = new SAPTABLEINSTANCEPARAMTypeImpl();
        return saptableinstanceparamType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPTABLEPARAMType createSAPTABLEPARAMType() {
        SAPTABLEPARAMTypeImpl saptableparamType = new SAPTABLEPARAMTypeImpl();
        return saptableparamType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPVARIABLEType createSAPVARIABLEType() {
        SAPVARIABLETypeImpl sapvariableType = new SAPVARIABLETypeImpl();
        return sapvariableType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULEINFO createSCHEDULEINFO() {
        SCHEDULEINFOImpl scheduleinfo = new SCHEDULEINFOImpl();
        return scheduleinfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULEINFOType createSCHEDULEINFOType() {
        SCHEDULEINFOTypeImpl scheduleinfoType = new SCHEDULEINFOTypeImpl();
        return scheduleinfoType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULEOPTIONSType createSCHEDULEOPTIONSType() {
        SCHEDULEOPTIONSTypeImpl scheduleoptionsType = new SCHEDULEOPTIONSTypeImpl();
        return scheduleoptionsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULERType createSCHEDULERType() {
        SCHEDULERTypeImpl schedulerType = new SCHEDULERTypeImpl();
        return schedulerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SEBLJOINType createSEBLJOINType() {
        SEBLJOINTypeImpl sebljoinType = new SEBLJOINTypeImpl();
        return sebljoinType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SEBLLINKType createSEBLLINKType() {
        SEBLLINKTypeImpl sebllinkType = new SEBLLINKTypeImpl();
        return sebllinkType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SEBLMVLINKRELType createSEBLMVLINKRELType() {
        SEBLMVLINKRELTypeImpl seblmvlinkrelType = new SEBLMVLINKRELTypeImpl();
        return seblmvlinkrelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SEBLMVLINKType createSEBLMVLINKType() {
        SEBLMVLINKTypeImpl seblmvlinkType = new SEBLMVLINKTypeImpl();
        return seblmvlinkType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SEBLSRCINFOType createSEBLSRCINFOType() {
        SEBLSRCINFOTypeImpl seblsrcinfoType = new SEBLSRCINFOTypeImpl();
        return seblsrcinfoType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SESSIONCOMPONENTType createSESSIONCOMPONENTType() {
        SESSIONCOMPONENTTypeImpl sessioncomponentType = new SESSIONCOMPONENTTypeImpl();
        return sessioncomponentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SESSIONEXTENSIONType createSESSIONEXTENSIONType() {
        SESSIONEXTENSIONTypeImpl sessionextensionType = new SESSIONEXTENSIONTypeImpl();
        return sessionextensionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SESSIONType createSESSIONType() {
        SESSIONTypeImpl sessionType = new SESSIONTypeImpl();
        return sessionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SESSTRANSFORMATIONGROUPType createSESSTRANSFORMATIONGROUPType() {
        SESSTRANSFORMATIONGROUPTypeImpl sesstransformationgroupType = new SESSTRANSFORMATIONGROUPTypeImpl();
        return sesstransformationgroupType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SESSTRANSFORMATIONINSTType createSESSTRANSFORMATIONINSTType() {
        SESSTRANSFORMATIONINSTTypeImpl sesstransformationinstType = new SESSTRANSFORMATIONINSTTypeImpl();
        return sesstransformationinstType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SHORTCUTType createSHORTCUTType() {
        SHORTCUTTypeImpl shortcutType = new SHORTCUTTypeImpl();
        return shortcutType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SOURCEFIELDType createSOURCEFIELDType() {
        SOURCEFIELDTypeImpl sourcefieldType = new SOURCEFIELDTypeImpl();
        return sourcefieldType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SOURCEType createSOURCEType() {
        SOURCETypeImpl sourceType = new SOURCETypeImpl();
        return sourceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public STARTOPTIONSType createSTARTOPTIONSType() {
        STARTOPTIONSTypeImpl startoptionsType = new STARTOPTIONSTypeImpl();
        return startoptionsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TABLEATTRIBUTEType createTABLEATTRIBUTEType() {
        TABLEATTRIBUTETypeImpl tableattributeType = new TABLEATTRIBUTETypeImpl();
        return tableattributeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TARGETFIELDType createTARGETFIELDType() {
        TARGETFIELDTypeImpl targetfieldType = new TARGETFIELDTypeImpl();
        return targetfieldType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TARGETINDEXFIELDType createTARGETINDEXFIELDType() {
        TARGETINDEXFIELDTypeImpl targetindexfieldType = new TARGETINDEXFIELDTypeImpl();
        return targetindexfieldType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TARGETINDEXType createTARGETINDEXType() {
        TARGETINDEXTypeImpl targetindexType = new TARGETINDEXTypeImpl();
        return targetindexType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TARGETLOADORDERType createTARGETLOADORDERType() {
        TARGETLOADORDERTypeImpl targetloadorderType = new TARGETLOADORDERTypeImpl();
        return targetloadorderType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TARGETType createTARGETType() {
        TARGETTypeImpl targetType = new TARGETTypeImpl();
        return targetType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TASKINSTANCEType createTASKINSTANCEType() {
        TASKINSTANCETypeImpl taskinstanceType = new TASKINSTANCETypeImpl();
        return taskinstanceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TASKType createTASKType() {
        TASKTypeImpl taskType = new TASKTypeImpl();
        return taskType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TIMERType createTIMERType() {
        TIMERTypeImpl timerType = new TIMERTypeImpl();
        return timerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRANSFORMATIONType createTRANSFORMATIONType() {
        TRANSFORMATIONTypeImpl transformationType = new TRANSFORMATIONTypeImpl();
        return transformationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRANSFORMFIELDATTRDEFType createTRANSFORMFIELDATTRDEFType() {
        TRANSFORMFIELDATTRDEFTypeImpl transformfieldattrdefType = new TRANSFORMFIELDATTRDEFTypeImpl();
        return transformfieldattrdefType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRANSFORMFIELDATTRType createTRANSFORMFIELDATTRType() {
        TRANSFORMFIELDATTRTypeImpl transformfieldattrType = new TRANSFORMFIELDATTRTypeImpl();
        return transformfieldattrType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRANSFORMFIELDType createTRANSFORMFIELDType() {
        TRANSFORMFIELDTypeImpl transformfieldType = new TRANSFORMFIELDTypeImpl();
        return transformfieldType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRANSFORMRESOURCEREFType createTRANSFORMRESOURCEREFType() {
        TRANSFORMRESOURCEREFTypeImpl transformresourcerefType = new TRANSFORMRESOURCEREFTypeImpl();
        return transformresourcerefType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VALUEPAIRType createVALUEPAIRType() {
        VALUEPAIRTypeImpl valuepairType = new VALUEPAIRTypeImpl();
        return valuepairType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WORKFLOWEVENTType createWORKFLOWEVENTType() {
        WORKFLOWEVENTTypeImpl workfloweventType = new WORKFLOWEVENTTypeImpl();
        return workfloweventType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WORKFLOWLINKType createWORKFLOWLINKType() {
        WORKFLOWLINKTypeImpl workflowlinkType = new WORKFLOWLINKTypeImpl();
        return workflowlinkType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WORKFLOWType createWORKFLOWType() {
        WORKFLOWTypeImpl workflowType = new WORKFLOWTypeImpl();
        return workflowType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WORKFLOWVARIABLEType createWORKFLOWVARIABLEType() {
        WORKFLOWVARIABLETypeImpl workflowvariableType = new WORKFLOWVARIABLETypeImpl();
        return workflowvariableType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WORKLETType createWORKLETType() {
        WORKLETTypeImpl workletType = new WORKLETTypeImpl();
        return workletType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLINFOType createXMLINFOType() {
        XMLINFOTypeImpl xmlinfoType = new XMLINFOTypeImpl();
        return xmlinfoType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLTEXTType createXMLTEXTType() {
        XMLTEXTTypeImpl xmltextType = new XMLTEXTTypeImpl();
        return xmltextType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AGGFUNCTIONType createAGGFUNCTIONTypeFromString(EDataType eDataType, String initialValue) {
        AGGFUNCTIONType result = AGGFUNCTIONType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAGGFUNCTIONTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DATATYPEType createDATATYPETypeFromString(EDataType eDataType, String initialValue) {
        DATATYPEType result = DATATYPEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDATATYPETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DAYType createDAYTypeFromString(EDataType eDataType, String initialValue) {
        DAYType result = DAYType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDAYTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ENDTYPEType createENDTYPETypeFromString(EDataType eDataType, String initialValue) {
        ENDTYPEType result = ENDTYPEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertENDTYPETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FAILPARENTIFINSTANCEDIDNOTRUNType createFAILPARENTIFINSTANCEDIDNOTRUNTypeFromString(EDataType eDataType, String initialValue) {
        FAILPARENTIFINSTANCEDIDNOTRUNType result = FAILPARENTIFINSTANCEDIDNOTRUNType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFAILPARENTIFINSTANCEDIDNOTRUNTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FAILPARENTIFINSTANCEFAILSType createFAILPARENTIFINSTANCEFAILSTypeFromString(EDataType eDataType, String initialValue) {
        FAILPARENTIFINSTANCEFAILSType result = FAILPARENTIFINSTANCEFAILSType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFAILPARENTIFINSTANCEFAILSTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IGNOREINCOMPAREType createIGNOREINCOMPARETypeFromString(EDataType eDataType, String initialValue) {
        IGNOREINCOMPAREType result = IGNOREINCOMPAREType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIGNOREINCOMPARETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IGNORENULLINPUTSType createIGNORENULLINPUTSTypeFromString(EDataType eDataType, String initialValue) {
        IGNORENULLINPUTSType result = IGNORENULLINPUTSType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIGNORENULLINPUTSTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISCLIENTEDITABLEType createISCLIENTEDITABLETypeFromString(EDataType eDataType, String initialValue) {
        ISCLIENTEDITABLEType result = ISCLIENTEDITABLEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISCLIENTEDITABLETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISCLIENTVISIBLEType createISCLIENTVISIBLETypeFromString(EDataType eDataType, String initialValue) {
        ISCLIENTVISIBLEType result = ISCLIENTVISIBLEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISCLIENTVISIBLETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISDEFAULTType createISDEFAULTTypeFromString(EDataType eDataType, String initialValue) {
        ISDEFAULTType result = ISDEFAULTType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISDEFAULTTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISENABLEDType createISENABLEDTypeFromString(EDataType eDataType, String initialValue) {
        ISENABLEDType result = ISENABLEDType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISENABLEDTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISENABLEDType1 createISENABLEDType1FromString(EDataType eDataType, String initialValue) {
        ISENABLEDType1 result = ISENABLEDType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISENABLEDType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISEXPRESSIONVARIABLEType createISEXPRESSIONVARIABLETypeFromString(EDataType eDataType, String initialValue) {
        ISEXPRESSIONVARIABLEType result = ISEXPRESSIONVARIABLEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISEXPRESSIONVARIABLETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISFILENAMEFIELDType createISFILENAMEFIELDTypeFromString(EDataType eDataType, String initialValue) {
        ISFILENAMEFIELDType result = ISFILENAMEFIELDType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISFILENAMEFIELDTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISNONEType createISNONETypeFromString(EDataType eDataType, String initialValue) {
        ISNONEType result = ISNONEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISNONETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISNULLType createISNULLTypeFromString(EDataType eDataType, String initialValue) {
        ISNULLType result = ISNULLType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISNULLTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISOPTIONALType createISOPTIONALTypeFromString(EDataType eDataType, String initialValue) {
        ISOPTIONALType result = ISOPTIONALType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISOPTIONALTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISOPTIONALType1 createISOPTIONALType1FromString(EDataType eDataType, String initialValue) {
        ISOPTIONALType1 result = ISOPTIONALType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISOPTIONALType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISOUTPUTPORTType createISOUTPUTPORTTypeFromString(EDataType eDataType, String initialValue) {
        ISOUTPUTPORTType result = ISOUTPUTPORTType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISOUTPUTPORTTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISPARAMType createISPARAMTypeFromString(EDataType eDataType, String initialValue) {
        ISPARAMType result = ISPARAMType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISPARAMTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISPERSISTENTType createISPERSISTENTTypeFromString(EDataType eDataType, String initialValue) {
        ISPERSISTENTType result = ISPERSISTENTType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISPERSISTENTTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISPROFILEMAPPINGType createISPROFILEMAPPINGTypeFromString(EDataType eDataType, String initialValue) {
        ISPROFILEMAPPINGType result = ISPROFILEMAPPINGType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISPROFILEMAPPINGTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISREFERENCEType createISREFERENCETypeFromString(EDataType eDataType, String initialValue) {
        ISREFERENCEType result = ISREFERENCEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISREFERENCETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISREPARTITIONPOINTType createISREPARTITIONPOINTTypeFromString(EDataType eDataType, String initialValue) {
        ISREPARTITIONPOINTType result = ISREPARTITIONPOINTType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISREPARTITIONPOINTTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISREUSABLEType createISREUSABLETypeFromString(EDataType eDataType, String initialValue) {
        ISREUSABLEType result = ISREUSABLEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISREUSABLETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISRUNNABLESERVICEType createISRUNNABLESERVICETypeFromString(EDataType eDataType, String initialValue) {
        ISRUNNABLESERVICEType result = ISRUNNABLESERVICEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISRUNNABLESERVICETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISSERVICEType createISSERVICETypeFromString(EDataType eDataType, String initialValue) {
        ISSERVICEType result = ISSERVICEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISSERVICETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISSHAREREADType createISSHAREREADTypeFromString(EDataType eDataType, String initialValue) {
        ISSHAREREADType result = ISSHAREREADType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISSHAREREADTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISSHAREWRITEType createISSHAREWRITETypeFromString(EDataType eDataType, String initialValue) {
        ISSHAREWRITEType result = ISSHAREWRITEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISSHAREWRITETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISSORTKEYType createISSORTKEYTypeFromString(EDataType eDataType, String initialValue) {
        ISSORTKEYType result = ISSORTKEYType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISSORTKEYTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISVALIDType createISVALIDTypeFromString(EDataType eDataType, String initialValue) {
        ISVALIDType result = ISVALIDType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISVALIDTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISVALIDType1 createISVALIDType1FromString(EDataType eDataType, String initialValue) {
        ISVALIDType1 result = ISVALIDType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISVALIDType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISVALIDType2 createISVALIDType2FromString(EDataType eDataType, String initialValue) {
        ISVALIDType2 result = ISVALIDType2.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISVALIDType2ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISVALIDType3 createISVALIDType3FromString(EDataType eDataType, String initialValue) {
        ISVALIDType3 result = ISVALIDType3.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISVALIDType3ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MACROTYPEType createMACROTYPETypeFromString(EDataType eDataType, String initialValue) {
        MACROTYPEType result = MACROTYPEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMACROTYPETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NULLABLEType createNULLABLETypeFromString(EDataType eDataType, String initialValue) {
        NULLABLEType result = NULLABLEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNULLABLETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NULLABLEType1 createNULLABLEType1FromString(EDataType eDataType, String initialValue) {
        NULLABLEType1 result = NULLABLEType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNULLABLEType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NULLCHARTYPEType createNULLCHARTYPETypeFromString(EDataType eDataType, String initialValue) {
        NULLCHARTYPEType result = NULLCHARTYPEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNULLCHARTYPETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OBJECTTYPEType createOBJECTTYPETypeFromString(EDataType eDataType, String initialValue) {
        OBJECTTYPEType result = OBJECTTYPEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOBJECTTYPETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OCCURRENCEType createOCCURRENCETypeFromString(EDataType eDataType, String initialValue) {
        OCCURRENCEType result = OCCURRENCEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOCCURRENCETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OUTERJOINRELType createOUTERJOINRELTypeFromString(EDataType eDataType, String initialValue) {
        OUTERJOINRELType result = OUTERJOINRELType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOUTERJOINRELTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARENTTYPEType createPARENTTYPETypeFromString(EDataType eDataType, String initialValue) {
        PARENTTYPEType result = PARENTTYPEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPARENTTYPETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARENTTYPEType1 createPARENTTYPEType1FromString(EDataType eDataType, String initialValue) {
        PARENTTYPEType1 result = PARENTTYPEType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPARENTTYPEType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARENTTYPEType2 createPARENTTYPEType2FromString(EDataType eDataType, String initialValue) {
        PARENTTYPEType2 result = PARENTTYPEType2.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPARENTTYPEType2ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARENTTYPEType3 createPARENTTYPEType3FromString(EDataType eDataType, String initialValue) {
        PARENTTYPEType3 result = PARENTTYPEType3.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPARENTTYPEType3ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REFERENCETYPEType createREFERENCETYPETypeFromString(EDataType eDataType, String initialValue) {
        REFERENCETYPEType result = REFERENCETYPEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREFERENCETYPETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLESCHEDULERType createREUSABLESCHEDULERTypeFromString(EDataType eDataType, String initialValue) {
        REUSABLESCHEDULERType result = REUSABLESCHEDULERType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLESCHEDULERTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType createREUSABLETypeFromString(EDataType eDataType, String initialValue) {
        REUSABLEType result = REUSABLEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType1 createREUSABLEType1FromString(EDataType eDataType, String initialValue) {
        REUSABLEType1 result = REUSABLEType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLEType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType2 createREUSABLEType2FromString(EDataType eDataType, String initialValue) {
        REUSABLEType2 result = REUSABLEType2.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLEType2ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType3 createREUSABLEType3FromString(EDataType eDataType, String initialValue) {
        REUSABLEType3 result = REUSABLEType3.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLEType3ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType4 createREUSABLEType4FromString(EDataType eDataType, String initialValue) {
        REUSABLEType4 result = REUSABLEType4.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLEType4ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType5 createREUSABLEType5FromString(EDataType eDataType, String initialValue) {
        REUSABLEType5 result = REUSABLEType5.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLEType5ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType6 createREUSABLEType6FromString(EDataType eDataType, String initialValue) {
        REUSABLEType6 result = REUSABLEType6.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLEType6ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REVERSEASSIGNMENTType createREVERSEASSIGNMENTTypeFromString(EDataType eDataType, String initialValue) {
        REVERSEASSIGNMENTType result = REVERSEASSIGNMENTType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREVERSEASSIGNMENTTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RUNFOREVERType createRUNFOREVERTypeFromString(EDataType eDataType, String initialValue) {
        RUNFOREVERType result = RUNFOREVERType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRUNFOREVERTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RUNONCEType createRUNONCETypeFromString(EDataType eDataType, String initialValue) {
        RUNONCEType result = RUNONCEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRUNONCETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULETYPEType createSCHEDULETYPETypeFromString(EDataType eDataType, String initialValue) {
        SCHEDULETYPEType result = SCHEDULETYPEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSCHEDULETYPETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULETYPEType1 createSCHEDULETYPEType1FromString(EDataType eDataType, String initialValue) {
        SCHEDULETYPEType1 result = SCHEDULETYPEType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSCHEDULETYPEType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SHAREDType createSHAREDTypeFromString(EDataType eDataType, String initialValue) {
        SHAREDType result = SHAREDType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSHAREDTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SORTDIRECTIONType createSORTDIRECTIONTypeFromString(EDataType eDataType, String initialValue) {
        SORTDIRECTIONType result = SORTDIRECTIONType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSORTDIRECTIONTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public STAGEFILEPERSISTType createSTAGEFILEPERSISTTypeFromString(EDataType eDataType, String initialValue) {
        STAGEFILEPERSISTType result = STAGEFILEPERSISTType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSTAGEFILEPERSISTTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public STAGEFILEREINITType createSTAGEFILEREINITTypeFromString(EDataType eDataType, String initialValue) {
        STAGEFILEREINITType result = STAGEFILEREINITType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSTAGEFILEREINITTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SUBTYPEType createSUBTYPETypeFromString(EDataType eDataType, String initialValue) {
        SUBTYPEType result = SUBTYPEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSUBTYPETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SUBTYPEType1 createSUBTYPEType1FromString(EDataType eDataType, String initialValue) {
        SUBTYPEType1 result = SUBTYPEType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSUBTYPEType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SUSPENDONERRORType createSUSPENDONERRORTypeFromString(EDataType eDataType, String initialValue) {
        SUSPENDONERRORType result = SUSPENDONERRORType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSUSPENDONERRORTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TASKSMUSTRUNONSERVERType createTASKSMUSTRUNONSERVERTypeFromString(EDataType eDataType, String initialValue) {
        TASKSMUSTRUNONSERVERType result = TASKSMUSTRUNONSERVERType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTASKSMUSTRUNONSERVERTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TIMERTYPEType createTIMERTYPETypeFromString(EDataType eDataType, String initialValue) {
        TIMERTYPEType result = TIMERTYPEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTIMERTYPETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TREATINPUTLINKASANDType createTREATINPUTLINKASANDTypeFromString(EDataType eDataType, String initialValue) {
        TREATINPUTLINKASANDType result = TREATINPUTLINKASANDType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTREATINPUTLINKASANDTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType createTYPETypeFromString(EDataType eDataType, String initialValue) {
        TYPEType result = TYPEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType1 createTYPEType1FromString(EDataType eDataType, String initialValue) {
        TYPEType1 result = TYPEType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPEType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType2 createTYPEType2FromString(EDataType eDataType, String initialValue) {
        TYPEType2 result = TYPEType2.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPEType2ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType3 createTYPEType3FromString(EDataType eDataType, String initialValue) {
        TYPEType3 result = TYPEType3.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPEType3ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType4 createTYPEType4FromString(EDataType eDataType, String initialValue) {
        TYPEType4 result = TYPEType4.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPEType4ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType5 createTYPEType5FromString(EDataType eDataType, String initialValue) {
        TYPEType5 result = TYPEType5.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPEType5ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType6 createTYPEType6FromString(EDataType eDataType, String initialValue) {
        TYPEType6 result = TYPEType6.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPEType6ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType7 createTYPEType7FromString(EDataType eDataType, String initialValue) {
        TYPEType7 result = TYPEType7.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPEType7ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType8 createTYPEType8FromString(EDataType eDataType, String initialValue) {
        TYPEType8 result = TYPEType8.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPEType8ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public USERDEFINEDType createUSERDEFINEDTypeFromString(EDataType eDataType, String initialValue) {
        USERDEFINEDType result = USERDEFINEDType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUSERDEFINEDTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public USERDEFINEDType1 createUSERDEFINEDType1FromString(EDataType eDataType, String initialValue) {
        USERDEFINEDType1 result = USERDEFINEDType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUSERDEFINEDType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VALUETYPEType createVALUETYPETypeFromString(EDataType eDataType, String initialValue) {
        VALUETYPEType result = VALUETYPEType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVALUETYPETypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VALUETYPEType1 createVALUETYPEType1FromString(EDataType eDataType, String initialValue) {
        VALUETYPEType1 result = VALUETYPEType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVALUETYPEType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VALUETYPEType2 createVALUETYPEType2FromString(EDataType eDataType, String initialValue) {
        VALUETYPEType2 result = VALUETYPEType2.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVALUETYPEType2ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AGGFUNCTIONType createAGGFUNCTIONTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createAGGFUNCTIONTypeFromString(PowrmartPackage.eINSTANCE.getAGGFUNCTIONType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAGGFUNCTIONTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertAGGFUNCTIONTypeToString(PowrmartPackage.eINSTANCE.getAGGFUNCTIONType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DATATYPEType createDATATYPETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createDATATYPETypeFromString(PowrmartPackage.eINSTANCE.getDATATYPEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDATATYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertDATATYPETypeToString(PowrmartPackage.eINSTANCE.getDATATYPEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DAYType createDAYTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createDAYTypeFromString(PowrmartPackage.eINSTANCE.getDAYType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDAYTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertDAYTypeToString(PowrmartPackage.eINSTANCE.getDAYType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ENDTYPEType createENDTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createENDTYPETypeFromString(PowrmartPackage.eINSTANCE.getENDTYPEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertENDTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertENDTYPETypeToString(PowrmartPackage.eINSTANCE.getENDTYPEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FAILPARENTIFINSTANCEDIDNOTRUNType createFAILPARENTIFINSTANCEDIDNOTRUNTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createFAILPARENTIFINSTANCEDIDNOTRUNTypeFromString(PowrmartPackage.eINSTANCE.getFAILPARENTIFINSTANCEDIDNOTRUNType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFAILPARENTIFINSTANCEDIDNOTRUNTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertFAILPARENTIFINSTANCEDIDNOTRUNTypeToString(PowrmartPackage.eINSTANCE.getFAILPARENTIFINSTANCEDIDNOTRUNType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FAILPARENTIFINSTANCEFAILSType createFAILPARENTIFINSTANCEFAILSTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createFAILPARENTIFINSTANCEFAILSTypeFromString(PowrmartPackage.eINSTANCE.getFAILPARENTIFINSTANCEFAILSType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFAILPARENTIFINSTANCEFAILSTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertFAILPARENTIFINSTANCEFAILSTypeToString(PowrmartPackage.eINSTANCE.getFAILPARENTIFINSTANCEFAILSType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IGNOREINCOMPAREType createIGNOREINCOMPARETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createIGNOREINCOMPARETypeFromString(PowrmartPackage.eINSTANCE.getIGNOREINCOMPAREType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIGNOREINCOMPARETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertIGNOREINCOMPARETypeToString(PowrmartPackage.eINSTANCE.getIGNOREINCOMPAREType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IGNORENULLINPUTSType createIGNORENULLINPUTSTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createIGNORENULLINPUTSTypeFromString(PowrmartPackage.eINSTANCE.getIGNORENULLINPUTSType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIGNORENULLINPUTSTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertIGNORENULLINPUTSTypeToString(PowrmartPackage.eINSTANCE.getIGNORENULLINPUTSType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISCLIENTEDITABLEType createISCLIENTEDITABLETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISCLIENTEDITABLETypeFromString(PowrmartPackage.eINSTANCE.getISCLIENTEDITABLEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISCLIENTEDITABLETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISCLIENTEDITABLETypeToString(PowrmartPackage.eINSTANCE.getISCLIENTEDITABLEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISCLIENTVISIBLEType createISCLIENTVISIBLETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISCLIENTVISIBLETypeFromString(PowrmartPackage.eINSTANCE.getISCLIENTVISIBLEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISCLIENTVISIBLETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISCLIENTVISIBLETypeToString(PowrmartPackage.eINSTANCE.getISCLIENTVISIBLEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISDEFAULTType createISDEFAULTTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISDEFAULTTypeFromString(PowrmartPackage.eINSTANCE.getISDEFAULTType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISDEFAULTTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISDEFAULTTypeToString(PowrmartPackage.eINSTANCE.getISDEFAULTType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISENABLEDType createISENABLEDTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISENABLEDTypeFromString(PowrmartPackage.eINSTANCE.getISENABLEDType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISENABLEDTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISENABLEDTypeToString(PowrmartPackage.eINSTANCE.getISENABLEDType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISENABLEDType1 createISENABLEDTypeObject1FromString(EDataType eDataType, String initialValue) {
        return createISENABLEDType1FromString(PowrmartPackage.eINSTANCE.getISENABLEDType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISENABLEDTypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertISENABLEDType1ToString(PowrmartPackage.eINSTANCE.getISENABLEDType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISEXPRESSIONVARIABLEType createISEXPRESSIONVARIABLETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISEXPRESSIONVARIABLETypeFromString(PowrmartPackage.eINSTANCE.getISEXPRESSIONVARIABLEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISEXPRESSIONVARIABLETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISEXPRESSIONVARIABLETypeToString(PowrmartPackage.eINSTANCE.getISEXPRESSIONVARIABLEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISFILENAMEFIELDType createISFILENAMEFIELDTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISFILENAMEFIELDTypeFromString(PowrmartPackage.eINSTANCE.getISFILENAMEFIELDType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISFILENAMEFIELDTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISFILENAMEFIELDTypeToString(PowrmartPackage.eINSTANCE.getISFILENAMEFIELDType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISNONEType createISNONETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISNONETypeFromString(PowrmartPackage.eINSTANCE.getISNONEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISNONETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISNONETypeToString(PowrmartPackage.eINSTANCE.getISNONEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISNULLType createISNULLTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISNULLTypeFromString(PowrmartPackage.eINSTANCE.getISNULLType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISNULLTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISNULLTypeToString(PowrmartPackage.eINSTANCE.getISNULLType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISOPTIONALType createISOPTIONALTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISOPTIONALTypeFromString(PowrmartPackage.eINSTANCE.getISOPTIONALType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISOPTIONALTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISOPTIONALTypeToString(PowrmartPackage.eINSTANCE.getISOPTIONALType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISOPTIONALType1 createISOPTIONALTypeObject1FromString(EDataType eDataType, String initialValue) {
        return createISOPTIONALType1FromString(PowrmartPackage.eINSTANCE.getISOPTIONALType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISOPTIONALTypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertISOPTIONALType1ToString(PowrmartPackage.eINSTANCE.getISOPTIONALType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISOUTPUTPORTType createISOUTPUTPORTTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISOUTPUTPORTTypeFromString(PowrmartPackage.eINSTANCE.getISOUTPUTPORTType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISOUTPUTPORTTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISOUTPUTPORTTypeToString(PowrmartPackage.eINSTANCE.getISOUTPUTPORTType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISPARAMType createISPARAMTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISPARAMTypeFromString(PowrmartPackage.eINSTANCE.getISPARAMType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISPARAMTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISPARAMTypeToString(PowrmartPackage.eINSTANCE.getISPARAMType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISPERSISTENTType createISPERSISTENTTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISPERSISTENTTypeFromString(PowrmartPackage.eINSTANCE.getISPERSISTENTType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISPERSISTENTTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISPERSISTENTTypeToString(PowrmartPackage.eINSTANCE.getISPERSISTENTType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISPROFILEMAPPINGType createISPROFILEMAPPINGTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISPROFILEMAPPINGTypeFromString(PowrmartPackage.eINSTANCE.getISPROFILEMAPPINGType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISPROFILEMAPPINGTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISPROFILEMAPPINGTypeToString(PowrmartPackage.eINSTANCE.getISPROFILEMAPPINGType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISREFERENCEType createISREFERENCETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISREFERENCETypeFromString(PowrmartPackage.eINSTANCE.getISREFERENCEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISREFERENCETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISREFERENCETypeToString(PowrmartPackage.eINSTANCE.getISREFERENCEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISREPARTITIONPOINTType createISREPARTITIONPOINTTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISREPARTITIONPOINTTypeFromString(PowrmartPackage.eINSTANCE.getISREPARTITIONPOINTType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISREPARTITIONPOINTTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISREPARTITIONPOINTTypeToString(PowrmartPackage.eINSTANCE.getISREPARTITIONPOINTType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISREUSABLEType createISREUSABLETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISREUSABLETypeFromString(PowrmartPackage.eINSTANCE.getISREUSABLEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISREUSABLETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISREUSABLETypeToString(PowrmartPackage.eINSTANCE.getISREUSABLEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISRUNNABLESERVICEType createISRUNNABLESERVICETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISRUNNABLESERVICETypeFromString(PowrmartPackage.eINSTANCE.getISRUNNABLESERVICEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISRUNNABLESERVICETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISRUNNABLESERVICETypeToString(PowrmartPackage.eINSTANCE.getISRUNNABLESERVICEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISSERVICEType createISSERVICETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISSERVICETypeFromString(PowrmartPackage.eINSTANCE.getISSERVICEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISSERVICETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISSERVICETypeToString(PowrmartPackage.eINSTANCE.getISSERVICEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISSHAREREADType createISSHAREREADTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISSHAREREADTypeFromString(PowrmartPackage.eINSTANCE.getISSHAREREADType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISSHAREREADTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISSHAREREADTypeToString(PowrmartPackage.eINSTANCE.getISSHAREREADType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISSHAREWRITEType createISSHAREWRITETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISSHAREWRITETypeFromString(PowrmartPackage.eINSTANCE.getISSHAREWRITEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISSHAREWRITETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISSHAREWRITETypeToString(PowrmartPackage.eINSTANCE.getISSHAREWRITEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISSORTKEYType createISSORTKEYTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISSORTKEYTypeFromString(PowrmartPackage.eINSTANCE.getISSORTKEYType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISSORTKEYTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISSORTKEYTypeToString(PowrmartPackage.eINSTANCE.getISSORTKEYType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISVALIDType2 createISVALIDTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createISVALIDType2FromString(PowrmartPackage.eINSTANCE.getISVALIDType2(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISVALIDTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertISVALIDType2ToString(PowrmartPackage.eINSTANCE.getISVALIDType2(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISVALIDType createISVALIDTypeObject1FromString(EDataType eDataType, String initialValue) {
        return createISVALIDTypeFromString(PowrmartPackage.eINSTANCE.getISVALIDType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISVALIDTypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertISVALIDTypeToString(PowrmartPackage.eINSTANCE.getISVALIDType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISVALIDType1 createISVALIDTypeObject2FromString(EDataType eDataType, String initialValue) {
        return createISVALIDType1FromString(PowrmartPackage.eINSTANCE.getISVALIDType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISVALIDTypeObject2ToString(EDataType eDataType, Object instanceValue) {
        return convertISVALIDType1ToString(PowrmartPackage.eINSTANCE.getISVALIDType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISVALIDType3 createISVALIDTypeObject3FromString(EDataType eDataType, String initialValue) {
        return createISVALIDType3FromString(PowrmartPackage.eINSTANCE.getISVALIDType3(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertISVALIDTypeObject3ToString(EDataType eDataType, Object instanceValue) {
        return convertISVALIDType3ToString(PowrmartPackage.eINSTANCE.getISVALIDType3(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MACROTYPEType createMACROTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createMACROTYPETypeFromString(PowrmartPackage.eINSTANCE.getMACROTYPEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMACROTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertMACROTYPETypeToString(PowrmartPackage.eINSTANCE.getMACROTYPEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NULLABLEType createNULLABLETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createNULLABLETypeFromString(PowrmartPackage.eINSTANCE.getNULLABLEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNULLABLETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertNULLABLETypeToString(PowrmartPackage.eINSTANCE.getNULLABLEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NULLABLEType1 createNULLABLETypeObject1FromString(EDataType eDataType, String initialValue) {
        return createNULLABLEType1FromString(PowrmartPackage.eINSTANCE.getNULLABLEType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNULLABLETypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertNULLABLEType1ToString(PowrmartPackage.eINSTANCE.getNULLABLEType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NULLCHARTYPEType createNULLCHARTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createNULLCHARTYPETypeFromString(PowrmartPackage.eINSTANCE.getNULLCHARTYPEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNULLCHARTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertNULLCHARTYPETypeToString(PowrmartPackage.eINSTANCE.getNULLCHARTYPEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OBJECTTYPEType createOBJECTTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createOBJECTTYPETypeFromString(PowrmartPackage.eINSTANCE.getOBJECTTYPEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOBJECTTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertOBJECTTYPETypeToString(PowrmartPackage.eINSTANCE.getOBJECTTYPEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OCCURRENCEType createOCCURRENCETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createOCCURRENCETypeFromString(PowrmartPackage.eINSTANCE.getOCCURRENCEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOCCURRENCETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertOCCURRENCETypeToString(PowrmartPackage.eINSTANCE.getOCCURRENCEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OUTERJOINRELType createOUTERJOINRELTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createOUTERJOINRELTypeFromString(PowrmartPackage.eINSTANCE.getOUTERJOINRELType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOUTERJOINRELTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertOUTERJOINRELTypeToString(PowrmartPackage.eINSTANCE.getOUTERJOINRELType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARENTTYPEType2 createPARENTTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createPARENTTYPEType2FromString(PowrmartPackage.eINSTANCE.getPARENTTYPEType2(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPARENTTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertPARENTTYPEType2ToString(PowrmartPackage.eINSTANCE.getPARENTTYPEType2(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARENTTYPEType1 createPARENTTYPETypeObject1FromString(EDataType eDataType, String initialValue) {
        return createPARENTTYPEType1FromString(PowrmartPackage.eINSTANCE.getPARENTTYPEType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPARENTTYPETypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertPARENTTYPEType1ToString(PowrmartPackage.eINSTANCE.getPARENTTYPEType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARENTTYPEType createPARENTTYPETypeObject2FromString(EDataType eDataType, String initialValue) {
        return createPARENTTYPETypeFromString(PowrmartPackage.eINSTANCE.getPARENTTYPEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPARENTTYPETypeObject2ToString(EDataType eDataType, Object instanceValue) {
        return convertPARENTTYPETypeToString(PowrmartPackage.eINSTANCE.getPARENTTYPEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARENTTYPEType3 createPARENTTYPETypeObject3FromString(EDataType eDataType, String initialValue) {
        return createPARENTTYPEType3FromString(PowrmartPackage.eINSTANCE.getPARENTTYPEType3(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPARENTTYPETypeObject3ToString(EDataType eDataType, Object instanceValue) {
        return convertPARENTTYPEType3ToString(PowrmartPackage.eINSTANCE.getPARENTTYPEType3(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REFERENCETYPEType createREFERENCETYPETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createREFERENCETYPETypeFromString(PowrmartPackage.eINSTANCE.getREFERENCETYPEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREFERENCETYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertREFERENCETYPETypeToString(PowrmartPackage.eINSTANCE.getREFERENCETYPEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLESCHEDULERType createREUSABLESCHEDULERTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createREUSABLESCHEDULERTypeFromString(PowrmartPackage.eINSTANCE.getREUSABLESCHEDULERType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLESCHEDULERTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertREUSABLESCHEDULERTypeToString(PowrmartPackage.eINSTANCE.getREUSABLESCHEDULERType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType createREUSABLETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createREUSABLETypeFromString(PowrmartPackage.eINSTANCE.getREUSABLEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertREUSABLETypeToString(PowrmartPackage.eINSTANCE.getREUSABLEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType4 createREUSABLETypeObject1FromString(EDataType eDataType, String initialValue) {
        return createREUSABLEType4FromString(PowrmartPackage.eINSTANCE.getREUSABLEType4(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLETypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertREUSABLEType4ToString(PowrmartPackage.eINSTANCE.getREUSABLEType4(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType1 createREUSABLETypeObject2FromString(EDataType eDataType, String initialValue) {
        return createREUSABLEType1FromString(PowrmartPackage.eINSTANCE.getREUSABLEType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLETypeObject2ToString(EDataType eDataType, Object instanceValue) {
        return convertREUSABLEType1ToString(PowrmartPackage.eINSTANCE.getREUSABLEType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType2 createREUSABLETypeObject3FromString(EDataType eDataType, String initialValue) {
        return createREUSABLEType2FromString(PowrmartPackage.eINSTANCE.getREUSABLEType2(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLETypeObject3ToString(EDataType eDataType, Object instanceValue) {
        return convertREUSABLEType2ToString(PowrmartPackage.eINSTANCE.getREUSABLEType2(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType3 createREUSABLETypeObject4FromString(EDataType eDataType, String initialValue) {
        return createREUSABLEType3FromString(PowrmartPackage.eINSTANCE.getREUSABLEType3(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLETypeObject4ToString(EDataType eDataType, Object instanceValue) {
        return convertREUSABLEType3ToString(PowrmartPackage.eINSTANCE.getREUSABLEType3(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType5 createREUSABLETypeObject5FromString(EDataType eDataType, String initialValue) {
        return createREUSABLEType5FromString(PowrmartPackage.eINSTANCE.getREUSABLEType5(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLETypeObject5ToString(EDataType eDataType, Object instanceValue) {
        return convertREUSABLEType5ToString(PowrmartPackage.eINSTANCE.getREUSABLEType5(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType6 createREUSABLETypeObject6FromString(EDataType eDataType, String initialValue) {
        return createREUSABLEType6FromString(PowrmartPackage.eINSTANCE.getREUSABLEType6(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREUSABLETypeObject6ToString(EDataType eDataType, Object instanceValue) {
        return convertREUSABLEType6ToString(PowrmartPackage.eINSTANCE.getREUSABLEType6(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REVERSEASSIGNMENTType createREVERSEASSIGNMENTTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createREVERSEASSIGNMENTTypeFromString(PowrmartPackage.eINSTANCE.getREVERSEASSIGNMENTType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertREVERSEASSIGNMENTTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertREVERSEASSIGNMENTTypeToString(PowrmartPackage.eINSTANCE.getREVERSEASSIGNMENTType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RUNFOREVERType createRUNFOREVERTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createRUNFOREVERTypeFromString(PowrmartPackage.eINSTANCE.getRUNFOREVERType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRUNFOREVERTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertRUNFOREVERTypeToString(PowrmartPackage.eINSTANCE.getRUNFOREVERType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RUNONCEType createRUNONCETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createRUNONCETypeFromString(PowrmartPackage.eINSTANCE.getRUNONCEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRUNONCETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertRUNONCETypeToString(PowrmartPackage.eINSTANCE.getRUNONCEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULETYPEType createSCHEDULETYPETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createSCHEDULETYPETypeFromString(PowrmartPackage.eINSTANCE.getSCHEDULETYPEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSCHEDULETYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertSCHEDULETYPETypeToString(PowrmartPackage.eINSTANCE.getSCHEDULETYPEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULETYPEType1 createSCHEDULETYPETypeObject1FromString(EDataType eDataType, String initialValue) {
        return createSCHEDULETYPEType1FromString(PowrmartPackage.eINSTANCE.getSCHEDULETYPEType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSCHEDULETYPETypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertSCHEDULETYPEType1ToString(PowrmartPackage.eINSTANCE.getSCHEDULETYPEType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SHAREDType createSHAREDTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createSHAREDTypeFromString(PowrmartPackage.eINSTANCE.getSHAREDType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSHAREDTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertSHAREDTypeToString(PowrmartPackage.eINSTANCE.getSHAREDType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SORTDIRECTIONType createSORTDIRECTIONTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createSORTDIRECTIONTypeFromString(PowrmartPackage.eINSTANCE.getSORTDIRECTIONType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSORTDIRECTIONTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertSORTDIRECTIONTypeToString(PowrmartPackage.eINSTANCE.getSORTDIRECTIONType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public STAGEFILEPERSISTType createSTAGEFILEPERSISTTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createSTAGEFILEPERSISTTypeFromString(PowrmartPackage.eINSTANCE.getSTAGEFILEPERSISTType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSTAGEFILEPERSISTTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertSTAGEFILEPERSISTTypeToString(PowrmartPackage.eINSTANCE.getSTAGEFILEPERSISTType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public STAGEFILEREINITType createSTAGEFILEREINITTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createSTAGEFILEREINITTypeFromString(PowrmartPackage.eINSTANCE.getSTAGEFILEREINITType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSTAGEFILEREINITTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertSTAGEFILEREINITTypeToString(PowrmartPackage.eINSTANCE.getSTAGEFILEREINITType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SUBTYPEType createSUBTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createSUBTYPETypeFromString(PowrmartPackage.eINSTANCE.getSUBTYPEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSUBTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertSUBTYPETypeToString(PowrmartPackage.eINSTANCE.getSUBTYPEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SUBTYPEType1 createSUBTYPETypeObject1FromString(EDataType eDataType, String initialValue) {
        return createSUBTYPEType1FromString(PowrmartPackage.eINSTANCE.getSUBTYPEType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSUBTYPETypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertSUBTYPEType1ToString(PowrmartPackage.eINSTANCE.getSUBTYPEType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SUSPENDONERRORType createSUSPENDONERRORTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createSUSPENDONERRORTypeFromString(PowrmartPackage.eINSTANCE.getSUSPENDONERRORType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSUSPENDONERRORTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertSUSPENDONERRORTypeToString(PowrmartPackage.eINSTANCE.getSUSPENDONERRORType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TASKSMUSTRUNONSERVERType createTASKSMUSTRUNONSERVERTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createTASKSMUSTRUNONSERVERTypeFromString(PowrmartPackage.eINSTANCE.getTASKSMUSTRUNONSERVERType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTASKSMUSTRUNONSERVERTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTASKSMUSTRUNONSERVERTypeToString(PowrmartPackage.eINSTANCE.getTASKSMUSTRUNONSERVERType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TIMERTYPEType createTIMERTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createTIMERTYPETypeFromString(PowrmartPackage.eINSTANCE.getTIMERTYPEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTIMERTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTIMERTYPETypeToString(PowrmartPackage.eINSTANCE.getTIMERTYPEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TREATINPUTLINKASANDType createTREATINPUTLINKASANDTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createTREATINPUTLINKASANDTypeFromString(PowrmartPackage.eINSTANCE.getTREATINPUTLINKASANDType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTREATINPUTLINKASANDTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTREATINPUTLINKASANDTypeToString(PowrmartPackage.eINSTANCE.getTREATINPUTLINKASANDType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType6 createTYPETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createTYPEType6FromString(PowrmartPackage.eINSTANCE.getTYPEType6(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTYPEType6ToString(PowrmartPackage.eINSTANCE.getTYPEType6(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType createTYPETypeObject1FromString(EDataType eDataType, String initialValue) {
        return createTYPETypeFromString(PowrmartPackage.eINSTANCE.getTYPEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPETypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertTYPETypeToString(PowrmartPackage.eINSTANCE.getTYPEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType2 createTYPETypeObject2FromString(EDataType eDataType, String initialValue) {
        return createTYPEType2FromString(PowrmartPackage.eINSTANCE.getTYPEType2(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPETypeObject2ToString(EDataType eDataType, Object instanceValue) {
        return convertTYPEType2ToString(PowrmartPackage.eINSTANCE.getTYPEType2(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType1 createTYPETypeObject3FromString(EDataType eDataType, String initialValue) {
        return createTYPEType1FromString(PowrmartPackage.eINSTANCE.getTYPEType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPETypeObject3ToString(EDataType eDataType, Object instanceValue) {
        return convertTYPEType1ToString(PowrmartPackage.eINSTANCE.getTYPEType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType4 createTYPETypeObject4FromString(EDataType eDataType, String initialValue) {
        return createTYPEType4FromString(PowrmartPackage.eINSTANCE.getTYPEType4(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPETypeObject4ToString(EDataType eDataType, Object instanceValue) {
        return convertTYPEType4ToString(PowrmartPackage.eINSTANCE.getTYPEType4(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType3 createTYPETypeObject5FromString(EDataType eDataType, String initialValue) {
        return createTYPEType3FromString(PowrmartPackage.eINSTANCE.getTYPEType3(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPETypeObject5ToString(EDataType eDataType, Object instanceValue) {
        return convertTYPEType3ToString(PowrmartPackage.eINSTANCE.getTYPEType3(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType5 createTYPETypeObject6FromString(EDataType eDataType, String initialValue) {
        return createTYPEType5FromString(PowrmartPackage.eINSTANCE.getTYPEType5(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPETypeObject6ToString(EDataType eDataType, Object instanceValue) {
        return convertTYPEType5ToString(PowrmartPackage.eINSTANCE.getTYPEType5(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType7 createTYPETypeObject7FromString(EDataType eDataType, String initialValue) {
        return createTYPEType7FromString(PowrmartPackage.eINSTANCE.getTYPEType7(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPETypeObject7ToString(EDataType eDataType, Object instanceValue) {
        return convertTYPEType7ToString(PowrmartPackage.eINSTANCE.getTYPEType7(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType8 createTYPETypeObject8FromString(EDataType eDataType, String initialValue) {
        return createTYPEType8FromString(PowrmartPackage.eINSTANCE.getTYPEType8(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTYPETypeObject8ToString(EDataType eDataType, Object instanceValue) {
        return convertTYPEType8ToString(PowrmartPackage.eINSTANCE.getTYPEType8(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public USERDEFINEDType createUSERDEFINEDTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createUSERDEFINEDTypeFromString(PowrmartPackage.eINSTANCE.getUSERDEFINEDType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUSERDEFINEDTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertUSERDEFINEDTypeToString(PowrmartPackage.eINSTANCE.getUSERDEFINEDType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public USERDEFINEDType1 createUSERDEFINEDTypeObject1FromString(EDataType eDataType, String initialValue) {
        return createUSERDEFINEDType1FromString(PowrmartPackage.eINSTANCE.getUSERDEFINEDType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUSERDEFINEDTypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertUSERDEFINEDType1ToString(PowrmartPackage.eINSTANCE.getUSERDEFINEDType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VALUETYPEType1 createVALUETYPETypeObjectFromString(EDataType eDataType, String initialValue) {
        return createVALUETYPEType1FromString(PowrmartPackage.eINSTANCE.getVALUETYPEType1(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVALUETYPETypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertVALUETYPEType1ToString(PowrmartPackage.eINSTANCE.getVALUETYPEType1(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VALUETYPEType createVALUETYPETypeObject1FromString(EDataType eDataType, String initialValue) {
        return createVALUETYPETypeFromString(PowrmartPackage.eINSTANCE.getVALUETYPEType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVALUETYPETypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertVALUETYPETypeToString(PowrmartPackage.eINSTANCE.getVALUETYPEType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VALUETYPEType2 createVALUETYPETypeObject2FromString(EDataType eDataType, String initialValue) {
        return createVALUETYPEType2FromString(PowrmartPackage.eINSTANCE.getVALUETYPEType2(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVALUETYPETypeObject2ToString(EDataType eDataType, Object instanceValue) {
        return convertVALUETYPEType2ToString(PowrmartPackage.eINSTANCE.getVALUETYPEType2(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowrmartPackage getPowrmartPackage() {
        return (PowrmartPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static PowrmartPackage getPackage() {
        return PowrmartPackage.eINSTANCE;
    }

} //PowrmartFactoryImpl
