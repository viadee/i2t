/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.util;

import Powrmart.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage
 * @generated
 */
public class PowrmartSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PowrmartPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowrmartSwitch() {
        if (modelPackage == null) {
            modelPackage = PowrmartPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case PowrmartPackage.ASSOCIATEDSOURCEINSTANCE_TYPE: {
                ASSOCIATEDSOURCEINSTANCEType associatedsourceinstanceType = (ASSOCIATEDSOURCEINSTANCEType)theEObject;
                T result = caseASSOCIATEDSOURCEINSTANCEType(associatedsourceinstanceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.ATTRIBUTE_TYPE: {
                ATTRIBUTEType attributeType = (ATTRIBUTEType)theEObject;
                T result = caseATTRIBUTEType(attributeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.CONFIGREFERENCE_TYPE: {
                CONFIGREFERENCEType configreferenceType = (CONFIGREFERENCEType)theEObject;
                T result = caseCONFIGREFERENCEType(configreferenceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.CONFIG_TYPE: {
                CONFIGType configType = (CONFIGType)theEObject;
                T result = caseCONFIGType(configType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE: {
                CONNECTIONREFERENCEType connectionreferenceType = (CONNECTIONREFERENCEType)theEObject;
                T result = caseCONNECTIONREFERENCEType(connectionreferenceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.CONNECTOR_TYPE: {
                CONNECTORType connectorType = (CONNECTORType)theEObject;
                T result = caseCONNECTORType(connectorType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.CONWFRUNINFO_TYPE: {
                CONWFRUNINFOType conwfruninfoType = (CONWFRUNINFOType)theEObject;
                T result = caseCONWFRUNINFOType(conwfruninfoType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.CUSTOM_TYPE: {
                CUSTOMType customType = (CUSTOMType)theEObject;
                T result = caseCUSTOMType(customType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.DAILYFREQUENCY_TYPE: {
                DAILYFREQUENCYType dailyfrequencyType = (DAILYFREQUENCYType)theEObject;
                T result = caseDAILYFREQUENCYType(dailyfrequencyType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.ENDOPTIONS_TYPE: {
                ENDOPTIONSType endoptionsType = (ENDOPTIONSType)theEObject;
                T result = caseENDOPTIONSType(endoptionsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.ERPINFO_TYPE: {
                ERPINFOType erpinfoType = (ERPINFOType)theEObject;
                T result = caseERPINFOType(erpinfoType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.ERPSRCINFO_TYPE: {
                ERPSRCINFOType erpsrcinfoType = (ERPSRCINFOType)theEObject;
                T result = caseERPSRCINFOType(erpsrcinfoType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.EXPRMACRODEPENDENCY_TYPE: {
                EXPRMACRODEPENDENCYType exprmacrodependencyType = (EXPRMACRODEPENDENCYType)theEObject;
                T result = caseEXPRMACRODEPENDENCYType(exprmacrodependencyType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.EXPRMACRO_TYPE: {
                EXPRMACROType exprmacroType = (EXPRMACROType)theEObject;
                T result = caseEXPRMACROType(exprmacroType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.FIELDATTRIBUTE_TYPE: {
                FIELDATTRIBUTEType fieldattributeType = (FIELDATTRIBUTEType)theEObject;
                T result = caseFIELDATTRIBUTEType(fieldattributeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.FIELDDEPENDENCY_TYPE: {
                FIELDDEPENDENCYType fielddependencyType = (FIELDDEPENDENCYType)theEObject;
                T result = caseFIELDDEPENDENCYType(fielddependencyType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.FILTER_TYPE: {
                FILTERType filterType = (FILTERType)theEObject;
                T result = caseFILTERType(filterType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.FLATFILE_TYPE: {
                FLATFILEType flatfileType = (FLATFILEType)theEObject;
                T result = caseFLATFILEType(flatfileType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.FOLDER_TYPE: {
                FOLDERType folderType = (FOLDERType)theEObject;
                T result = caseFOLDERType(folderType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.FOLDERVERSION_TYPE: {
                FOLDERVERSIONType folderversionType = (FOLDERVERSIONType)theEObject;
                T result = caseFOLDERVERSIONType(folderversionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.GROUP_TYPE: {
                GROUPType groupType = (GROUPType)theEObject;
                T result = caseGROUPType(groupType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.HASHKEY_TYPE: {
                HASHKEYType hashkeyType = (HASHKEYType)theEObject;
                T result = caseHASHKEYType(hashkeyType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.INITPROP_TYPE: {
                INITPROPType initpropType = (INITPROPType)theEObject;
                T result = caseINITPROPType(initpropType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.INSTANCE_TYPE: {
                INSTANCEType instanceType = (INSTANCEType)theEObject;
                T result = caseINSTANCEType(instanceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.KEYRANGE_TYPE: {
                KEYRANGEType keyrangeType = (KEYRANGEType)theEObject;
                T result = caseKEYRANGEType(keyrangeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.KEYWORD_TYPE: {
                KEYWORDType keywordType = (KEYWORDType)theEObject;
                T result = caseKEYWORDType(keywordType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.MACROARGUMENT_TYPE: {
                MACROARGUMENTType macroargumentType = (MACROARGUMENTType)theEObject;
                T result = caseMACROARGUMENTType(macroargumentType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.MACRODEPENDENCY_TYPE: {
                MACRODEPENDENCYType macrodependencyType = (MACRODEPENDENCYType)theEObject;
                T result = caseMACRODEPENDENCYType(macrodependencyType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.MAPDEPENDENCY_TYPE: {
                MAPDEPENDENCYType mapdependencyType = (MAPDEPENDENCYType)theEObject;
                T result = caseMAPDEPENDENCYType(mapdependencyType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.MAPPING_TYPE: {
                MAPPINGType mappingType = (MAPPINGType)theEObject;
                T result = caseMAPPINGType(mappingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.MAPPINGVARIABLE_TYPE: {
                MAPPINGVARIABLEType mappingvariableType = (MAPPINGVARIABLEType)theEObject;
                T result = caseMAPPINGVARIABLEType(mappingvariableType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.MAPPLET_TYPE: {
                MAPPLETType mappletType = (MAPPLETType)theEObject;
                T result = caseMAPPLETType(mappletType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.METADATAEXTENSION_TYPE: {
                METADATAEXTENSIONType metadataextensionType = (METADATAEXTENSIONType)theEObject;
                T result = caseMETADATAEXTENSIONType(metadataextensionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.PARTITION_TYPE: {
                PARTITIONType partitionType = (PARTITIONType)theEObject;
                T result = casePARTITIONType(partitionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.POWERMART_TYPE: {
                POWERMARTType powermartType = (POWERMARTType)theEObject;
                T result = casePOWERMARTType(powermartType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.RECURRING_TYPE: {
                RECURRINGType recurringType = (RECURRINGType)theEObject;
                T result = caseRECURRINGType(recurringType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.REPEAT_TYPE: {
                REPEATType repeatType = (REPEATType)theEObject;
                T result = caseREPEATType(repeatType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.REPOSITORY_TYPE: {
                REPOSITORYType repositoryType = (REPOSITORYType)theEObject;
                T result = caseREPOSITORYType(repositoryType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.RESOURCEREFERENCE_TYPE: {
                RESOURCEREFERENCEType resourcereferenceType = (RESOURCEREFERENCEType)theEObject;
                T result = caseRESOURCEREFERENCEType(resourcereferenceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPCODEBLOCK_TYPE: {
                SAPCODEBLOCKType sapcodeblockType = (SAPCODEBLOCKType)theEObject;
                T result = caseSAPCODEBLOCKType(sapcodeblockType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE: {
                SAPFUNCINSTANCEPARAMFLDType sapfuncinstanceparamfldType = (SAPFUNCINSTANCEPARAMFLDType)theEObject;
                T result = caseSAPFUNCINSTANCEPARAMFLDType(sapfuncinstanceparamfldType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPFUNCINSTANCEPARAM_TYPE: {
                SAPFUNCINSTANCEPARAMType sapfuncinstanceparamType = (SAPFUNCINSTANCEPARAMType)theEObject;
                T result = caseSAPFUNCINSTANCEPARAMType(sapfuncinstanceparamType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPFUNCPARAM_TYPE: {
                SAPFUNCPARAMType sapfuncparamType = (SAPFUNCPARAMType)theEObject;
                T result = caseSAPFUNCPARAMType(sapfuncparamType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE: {
                SAPFUNCTIONINSTANCEType sapfunctioninstanceType = (SAPFUNCTIONINSTANCEType)theEObject;
                T result = caseSAPFUNCTIONINSTANCEType(sapfunctioninstanceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPFUNCTION_TYPE: {
                SAPFUNCTIONType sapfunctionType = (SAPFUNCTIONType)theEObject;
                T result = caseSAPFUNCTIONType(sapfunctionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPOUTPUTPORT_TYPE: {
                SAPOUTPUTPORTType sapoutputportType = (SAPOUTPUTPORTType)theEObject;
                T result = caseSAPOUTPUTPORTType(sapoutputportType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE: {
                SAPPROGRAMFLOWOBJECTType sapprogramflowobjectType = (SAPPROGRAMFLOWOBJECTType)theEObject;
                T result = caseSAPPROGRAMFLOWOBJECTType(sapprogramflowobjectType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPPROGRAM_TYPE: {
                SAPPROGRAMType sapprogramType = (SAPPROGRAMType)theEObject;
                T result = caseSAPPROGRAMType(sapprogramType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE: {
                SAPSTRUCTUREFIELDType sapstructurefieldType = (SAPSTRUCTUREFIELDType)theEObject;
                T result = caseSAPSTRUCTUREFIELDType(sapstructurefieldType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPSTRUCTURE_TYPE: {
                SAPSTRUCTUREType sapstructureType = (SAPSTRUCTUREType)theEObject;
                T result = caseSAPSTRUCTUREType(sapstructureType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE: {
                SAPTABLEINSTANCEPARAMType saptableinstanceparamType = (SAPTABLEINSTANCEPARAMType)theEObject;
                T result = caseSAPTABLEINSTANCEPARAMType(saptableinstanceparamType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPTABLEPARAM_TYPE: {
                SAPTABLEPARAMType saptableparamType = (SAPTABLEPARAMType)theEObject;
                T result = caseSAPTABLEPARAMType(saptableparamType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SAPVARIABLE_TYPE: {
                SAPVARIABLEType sapvariableType = (SAPVARIABLEType)theEObject;
                T result = caseSAPVARIABLEType(sapvariableType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SCHEDULEINFO: {
                SCHEDULEINFO scheduleinfo = (SCHEDULEINFO)theEObject;
                T result = caseSCHEDULEINFO(scheduleinfo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SCHEDULEINFO_TYPE: {
                SCHEDULEINFOType scheduleinfoType = (SCHEDULEINFOType)theEObject;
                T result = caseSCHEDULEINFOType(scheduleinfoType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE: {
                SCHEDULEOPTIONSType scheduleoptionsType = (SCHEDULEOPTIONSType)theEObject;
                T result = caseSCHEDULEOPTIONSType(scheduleoptionsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SCHEDULER_TYPE: {
                SCHEDULERType schedulerType = (SCHEDULERType)theEObject;
                T result = caseSCHEDULERType(schedulerType);
                if (result == null) result = caseSCHEDULEINFO(schedulerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SEBLJOIN_TYPE: {
                SEBLJOINType sebljoinType = (SEBLJOINType)theEObject;
                T result = caseSEBLJOINType(sebljoinType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SEBLLINK_TYPE: {
                SEBLLINKType sebllinkType = (SEBLLINKType)theEObject;
                T result = caseSEBLLINKType(sebllinkType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SEBLMVLINKREL_TYPE: {
                SEBLMVLINKRELType seblmvlinkrelType = (SEBLMVLINKRELType)theEObject;
                T result = caseSEBLMVLINKRELType(seblmvlinkrelType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SEBLMVLINK_TYPE: {
                SEBLMVLINKType seblmvlinkType = (SEBLMVLINKType)theEObject;
                T result = caseSEBLMVLINKType(seblmvlinkType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SEBLSRCINFO_TYPE: {
                SEBLSRCINFOType seblsrcinfoType = (SEBLSRCINFOType)theEObject;
                T result = caseSEBLSRCINFOType(seblsrcinfoType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SESSIONCOMPONENT_TYPE: {
                SESSIONCOMPONENTType sessioncomponentType = (SESSIONCOMPONENTType)theEObject;
                T result = caseSESSIONCOMPONENTType(sessioncomponentType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SESSIONEXTENSION_TYPE: {
                SESSIONEXTENSIONType sessionextensionType = (SESSIONEXTENSIONType)theEObject;
                T result = caseSESSIONEXTENSIONType(sessionextensionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SESSION_TYPE: {
                SESSIONType sessionType = (SESSIONType)theEObject;
                T result = caseSESSIONType(sessionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SESSTRANSFORMATIONGROUP_TYPE: {
                SESSTRANSFORMATIONGROUPType sesstransformationgroupType = (SESSTRANSFORMATIONGROUPType)theEObject;
                T result = caseSESSTRANSFORMATIONGROUPType(sesstransformationgroupType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE: {
                SESSTRANSFORMATIONINSTType sesstransformationinstType = (SESSTRANSFORMATIONINSTType)theEObject;
                T result = caseSESSTRANSFORMATIONINSTType(sesstransformationinstType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SHORTCUT_TYPE: {
                SHORTCUTType shortcutType = (SHORTCUTType)theEObject;
                T result = caseSHORTCUTType(shortcutType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SOURCEFIELD_TYPE: {
                SOURCEFIELDType sourcefieldType = (SOURCEFIELDType)theEObject;
                T result = caseSOURCEFIELDType(sourcefieldType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.SOURCE_TYPE: {
                SOURCEType sourceType = (SOURCEType)theEObject;
                T result = caseSOURCEType(sourceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.STARTOPTIONS_TYPE: {
                STARTOPTIONSType startoptionsType = (STARTOPTIONSType)theEObject;
                T result = caseSTARTOPTIONSType(startoptionsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TABLEATTRIBUTE_TYPE: {
                TABLEATTRIBUTEType tableattributeType = (TABLEATTRIBUTEType)theEObject;
                T result = caseTABLEATTRIBUTEType(tableattributeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TARGETFIELD_TYPE: {
                TARGETFIELDType targetfieldType = (TARGETFIELDType)theEObject;
                T result = caseTARGETFIELDType(targetfieldType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TARGETINDEXFIELD_TYPE: {
                TARGETINDEXFIELDType targetindexfieldType = (TARGETINDEXFIELDType)theEObject;
                T result = caseTARGETINDEXFIELDType(targetindexfieldType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TARGETINDEX_TYPE: {
                TARGETINDEXType targetindexType = (TARGETINDEXType)theEObject;
                T result = caseTARGETINDEXType(targetindexType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TARGETLOADORDER_TYPE: {
                TARGETLOADORDERType targetloadorderType = (TARGETLOADORDERType)theEObject;
                T result = caseTARGETLOADORDERType(targetloadorderType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TARGET_TYPE: {
                TARGETType targetType = (TARGETType)theEObject;
                T result = caseTARGETType(targetType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TASKINSTANCE_TYPE: {
                TASKINSTANCEType taskinstanceType = (TASKINSTANCEType)theEObject;
                T result = caseTASKINSTANCEType(taskinstanceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TASK_TYPE: {
                TASKType taskType = (TASKType)theEObject;
                T result = caseTASKType(taskType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TIMER_TYPE: {
                TIMERType timerType = (TIMERType)theEObject;
                T result = caseTIMERType(timerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TRANSFORMATION_TYPE: {
                TRANSFORMATIONType transformationType = (TRANSFORMATIONType)theEObject;
                T result = caseTRANSFORMATIONType(transformationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE: {
                TRANSFORMFIELDATTRDEFType transformfieldattrdefType = (TRANSFORMFIELDATTRDEFType)theEObject;
                T result = caseTRANSFORMFIELDATTRDEFType(transformfieldattrdefType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TRANSFORMFIELDATTR_TYPE: {
                TRANSFORMFIELDATTRType transformfieldattrType = (TRANSFORMFIELDATTRType)theEObject;
                T result = caseTRANSFORMFIELDATTRType(transformfieldattrType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TRANSFORMFIELD_TYPE: {
                TRANSFORMFIELDType transformfieldType = (TRANSFORMFIELDType)theEObject;
                T result = caseTRANSFORMFIELDType(transformfieldType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE: {
                TRANSFORMRESOURCEREFType transformresourcerefType = (TRANSFORMRESOURCEREFType)theEObject;
                T result = caseTRANSFORMRESOURCEREFType(transformresourcerefType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.VALUEPAIR_TYPE: {
                VALUEPAIRType valuepairType = (VALUEPAIRType)theEObject;
                T result = caseVALUEPAIRType(valuepairType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.WORKFLOWEVENT_TYPE: {
                WORKFLOWEVENTType workfloweventType = (WORKFLOWEVENTType)theEObject;
                T result = caseWORKFLOWEVENTType(workfloweventType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.WORKFLOWLINK_TYPE: {
                WORKFLOWLINKType workflowlinkType = (WORKFLOWLINKType)theEObject;
                T result = caseWORKFLOWLINKType(workflowlinkType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.WORKFLOW_TYPE: {
                WORKFLOWType workflowType = (WORKFLOWType)theEObject;
                T result = caseWORKFLOWType(workflowType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE: {
                WORKFLOWVARIABLEType workflowvariableType = (WORKFLOWVARIABLEType)theEObject;
                T result = caseWORKFLOWVARIABLEType(workflowvariableType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.WORKLET_TYPE: {
                WORKLETType workletType = (WORKLETType)theEObject;
                T result = caseWORKLETType(workletType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.XMLINFO_TYPE: {
                XMLINFOType xmlinfoType = (XMLINFOType)theEObject;
                T result = caseXMLINFOType(xmlinfoType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PowrmartPackage.XMLTEXT_TYPE: {
                XMLTEXTType xmltextType = (XMLTEXTType)theEObject;
                T result = caseXMLTEXTType(xmltextType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ASSOCIATEDSOURCEINSTANCE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ASSOCIATEDSOURCEINSTANCE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseASSOCIATEDSOURCEINSTANCEType(ASSOCIATEDSOURCEINSTANCEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ATTRIBUTE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseATTRIBUTEType(ATTRIBUTEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CONFIGREFERENCE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CONFIGREFERENCE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCONFIGREFERENCEType(CONFIGREFERENCEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CONFIG Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CONFIG Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCONFIGType(CONFIGType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CONNECTIONREFERENCE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CONNECTIONREFERENCE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCONNECTIONREFERENCEType(CONNECTIONREFERENCEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CONNECTOR Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CONNECTOR Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCONNECTORType(CONNECTORType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CONWFRUNINFO Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CONWFRUNINFO Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCONWFRUNINFOType(CONWFRUNINFOType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CUSTOM Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CUSTOM Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCUSTOMType(CUSTOMType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DAILYFREQUENCY Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DAILYFREQUENCY Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDAILYFREQUENCYType(DAILYFREQUENCYType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ENDOPTIONS Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ENDOPTIONS Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseENDOPTIONSType(ENDOPTIONSType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ERPINFO Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ERPINFO Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseERPINFOType(ERPINFOType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ERPSRCINFO Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ERPSRCINFO Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseERPSRCINFOType(ERPSRCINFOType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EXPRMACRODEPENDENCY Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EXPRMACRODEPENDENCY Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEXPRMACRODEPENDENCYType(EXPRMACRODEPENDENCYType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EXPRMACRO Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EXPRMACRO Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEXPRMACROType(EXPRMACROType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>FIELDATTRIBUTE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>FIELDATTRIBUTE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFIELDATTRIBUTEType(FIELDATTRIBUTEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>FIELDDEPENDENCY Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>FIELDDEPENDENCY Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFIELDDEPENDENCYType(FIELDDEPENDENCYType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>FILTER Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>FILTER Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFILTERType(FILTERType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>FLATFILE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>FLATFILE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFLATFILEType(FLATFILEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>FOLDER Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>FOLDER Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFOLDERType(FOLDERType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>FOLDERVERSION Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>FOLDERVERSION Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFOLDERVERSIONType(FOLDERVERSIONType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>GROUP Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>GROUP Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGROUPType(GROUPType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>HASHKEY Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>HASHKEY Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHASHKEYType(HASHKEYType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>INITPROP Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>INITPROP Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseINITPROPType(INITPROPType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>INSTANCE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>INSTANCE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseINSTANCEType(INSTANCEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>KEYRANGE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>KEYRANGE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKEYRANGEType(KEYRANGEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>KEYWORD Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>KEYWORD Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKEYWORDType(KEYWORDType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>MACROARGUMENT Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>MACROARGUMENT Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMACROARGUMENTType(MACROARGUMENTType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>MACRODEPENDENCY Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>MACRODEPENDENCY Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMACRODEPENDENCYType(MACRODEPENDENCYType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>MAPDEPENDENCY Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>MAPDEPENDENCY Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMAPDEPENDENCYType(MAPDEPENDENCYType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>MAPPING Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>MAPPING Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMAPPINGType(MAPPINGType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>MAPPINGVARIABLE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>MAPPINGVARIABLE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMAPPINGVARIABLEType(MAPPINGVARIABLEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>MAPPLET Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>MAPPLET Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMAPPLETType(MAPPLETType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>METADATAEXTENSION Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>METADATAEXTENSION Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMETADATAEXTENSIONType(METADATAEXTENSIONType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PARTITION Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PARTITION Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePARTITIONType(PARTITIONType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>POWERMART Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>POWERMART Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePOWERMARTType(POWERMARTType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>RECURRING Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>RECURRING Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRECURRINGType(RECURRINGType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>REPEAT Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>REPEAT Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseREPEATType(REPEATType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>REPOSITORY Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>REPOSITORY Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseREPOSITORYType(REPOSITORYType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>RESOURCEREFERENCE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>RESOURCEREFERENCE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRESOURCEREFERENCEType(RESOURCEREFERENCEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPCODEBLOCK Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPCODEBLOCK Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPCODEBLOCKType(SAPCODEBLOCKType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPFUNCINSTANCEPARAMFLD Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPFUNCINSTANCEPARAMFLD Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPFUNCINSTANCEPARAMFLDType(SAPFUNCINSTANCEPARAMFLDType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPFUNCINSTANCEPARAM Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPFUNCINSTANCEPARAM Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPFUNCINSTANCEPARAMType(SAPFUNCINSTANCEPARAMType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPFUNCPARAM Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPFUNCPARAM Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPFUNCPARAMType(SAPFUNCPARAMType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPFUNCTIONINSTANCE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPFUNCTIONINSTANCE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPFUNCTIONINSTANCEType(SAPFUNCTIONINSTANCEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPFUNCTION Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPFUNCTION Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPFUNCTIONType(SAPFUNCTIONType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPOUTPUTPORT Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPOUTPUTPORT Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPOUTPUTPORTType(SAPOUTPUTPORTType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPPROGRAMFLOWOBJECT Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPPROGRAMFLOWOBJECT Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPPROGRAMFLOWOBJECTType(SAPPROGRAMFLOWOBJECTType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPPROGRAM Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPPROGRAM Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPPROGRAMType(SAPPROGRAMType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPSTRUCTUREFIELD Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPSTRUCTUREFIELD Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPSTRUCTUREFIELDType(SAPSTRUCTUREFIELDType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPSTRUCTURE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPSTRUCTURE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPSTRUCTUREType(SAPSTRUCTUREType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPTABLEINSTANCEPARAM Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPTABLEINSTANCEPARAM Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPTABLEINSTANCEPARAMType(SAPTABLEINSTANCEPARAMType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPTABLEPARAM Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPTABLEPARAM Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPTABLEPARAMType(SAPTABLEPARAMType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SAPVARIABLE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SAPVARIABLE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSAPVARIABLEType(SAPVARIABLEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SCHEDULEINFO</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SCHEDULEINFO</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSCHEDULEINFO(SCHEDULEINFO object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SCHEDULEINFO Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SCHEDULEINFO Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSCHEDULEINFOType(SCHEDULEINFOType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SCHEDULEOPTIONS Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SCHEDULEOPTIONS Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSCHEDULEOPTIONSType(SCHEDULEOPTIONSType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SCHEDULER Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SCHEDULER Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSCHEDULERType(SCHEDULERType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SEBLJOIN Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SEBLJOIN Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSEBLJOINType(SEBLJOINType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SEBLLINK Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SEBLLINK Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSEBLLINKType(SEBLLINKType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SEBLMVLINKREL Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SEBLMVLINKREL Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSEBLMVLINKRELType(SEBLMVLINKRELType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SEBLMVLINK Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SEBLMVLINK Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSEBLMVLINKType(SEBLMVLINKType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SEBLSRCINFO Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SEBLSRCINFO Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSEBLSRCINFOType(SEBLSRCINFOType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SESSIONCOMPONENT Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SESSIONCOMPONENT Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSESSIONCOMPONENTType(SESSIONCOMPONENTType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SESSIONEXTENSION Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SESSIONEXTENSION Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSESSIONEXTENSIONType(SESSIONEXTENSIONType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SESSION Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SESSION Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSESSIONType(SESSIONType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SESSTRANSFORMATIONGROUP Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SESSTRANSFORMATIONGROUP Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSESSTRANSFORMATIONGROUPType(SESSTRANSFORMATIONGROUPType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SESSTRANSFORMATIONINST Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SESSTRANSFORMATIONINST Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSESSTRANSFORMATIONINSTType(SESSTRANSFORMATIONINSTType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SHORTCUT Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SHORTCUT Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSHORTCUTType(SHORTCUTType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SOURCEFIELD Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SOURCEFIELD Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSOURCEFIELDType(SOURCEFIELDType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SOURCE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SOURCE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSOURCEType(SOURCEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>STARTOPTIONS Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>STARTOPTIONS Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSTARTOPTIONSType(STARTOPTIONSType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TABLEATTRIBUTE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TABLEATTRIBUTE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTABLEATTRIBUTEType(TABLEATTRIBUTEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TARGETFIELD Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TARGETFIELD Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTARGETFIELDType(TARGETFIELDType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TARGETINDEXFIELD Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TARGETINDEXFIELD Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTARGETINDEXFIELDType(TARGETINDEXFIELDType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TARGETINDEX Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TARGETINDEX Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTARGETINDEXType(TARGETINDEXType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TARGETLOADORDER Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TARGETLOADORDER Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTARGETLOADORDERType(TARGETLOADORDERType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TARGET Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TARGET Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTARGETType(TARGETType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TASKINSTANCE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TASKINSTANCE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTASKINSTANCEType(TASKINSTANCEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TASK Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TASK Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTASKType(TASKType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TIMER Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TIMER Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTIMERType(TIMERType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TRANSFORMATION Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TRANSFORMATION Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTRANSFORMATIONType(TRANSFORMATIONType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TRANSFORMFIELDATTRDEF Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TRANSFORMFIELDATTRDEF Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTRANSFORMFIELDATTRDEFType(TRANSFORMFIELDATTRDEFType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TRANSFORMFIELDATTR Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TRANSFORMFIELDATTR Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTRANSFORMFIELDATTRType(TRANSFORMFIELDATTRType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TRANSFORMFIELD Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TRANSFORMFIELD Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTRANSFORMFIELDType(TRANSFORMFIELDType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TRANSFORMRESOURCEREF Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TRANSFORMRESOURCEREF Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTRANSFORMRESOURCEREFType(TRANSFORMRESOURCEREFType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>VALUEPAIR Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>VALUEPAIR Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVALUEPAIRType(VALUEPAIRType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WORKFLOWEVENT Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WORKFLOWEVENT Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWORKFLOWEVENTType(WORKFLOWEVENTType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WORKFLOWLINK Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WORKFLOWLINK Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWORKFLOWLINKType(WORKFLOWLINKType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WORKFLOW Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WORKFLOW Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWORKFLOWType(WORKFLOWType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WORKFLOWVARIABLE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WORKFLOWVARIABLE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWORKFLOWVARIABLEType(WORKFLOWVARIABLEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WORKLET Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WORKLET Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWORKLETType(WORKLETType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>XMLINFO Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>XMLINFO Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseXMLINFOType(XMLINFOType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>XMLTEXT Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>XMLTEXT Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseXMLTEXTType(XMLTEXTType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //PowrmartSwitch
