/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.util;

import Powrmart.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage
 * @generated
 */
public class PowrmartAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PowrmartPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowrmartAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = PowrmartPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowrmartSwitch<Adapter> modelSwitch =
        new PowrmartSwitch<Adapter>() {
            @Override
            public Adapter caseASSOCIATEDSOURCEINSTANCEType(ASSOCIATEDSOURCEINSTANCEType object) {
                return createASSOCIATEDSOURCEINSTANCETypeAdapter();
            }
            @Override
            public Adapter caseATTRIBUTEType(ATTRIBUTEType object) {
                return createATTRIBUTETypeAdapter();
            }
            @Override
            public Adapter caseCONFIGREFERENCEType(CONFIGREFERENCEType object) {
                return createCONFIGREFERENCETypeAdapter();
            }
            @Override
            public Adapter caseCONFIGType(CONFIGType object) {
                return createCONFIGTypeAdapter();
            }
            @Override
            public Adapter caseCONNECTIONREFERENCEType(CONNECTIONREFERENCEType object) {
                return createCONNECTIONREFERENCETypeAdapter();
            }
            @Override
            public Adapter caseCONNECTORType(CONNECTORType object) {
                return createCONNECTORTypeAdapter();
            }
            @Override
            public Adapter caseCONWFRUNINFOType(CONWFRUNINFOType object) {
                return createCONWFRUNINFOTypeAdapter();
            }
            @Override
            public Adapter caseCUSTOMType(CUSTOMType object) {
                return createCUSTOMTypeAdapter();
            }
            @Override
            public Adapter caseDAILYFREQUENCYType(DAILYFREQUENCYType object) {
                return createDAILYFREQUENCYTypeAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseENDOPTIONSType(ENDOPTIONSType object) {
                return createENDOPTIONSTypeAdapter();
            }
            @Override
            public Adapter caseERPINFOType(ERPINFOType object) {
                return createERPINFOTypeAdapter();
            }
            @Override
            public Adapter caseERPSRCINFOType(ERPSRCINFOType object) {
                return createERPSRCINFOTypeAdapter();
            }
            @Override
            public Adapter caseEXPRMACRODEPENDENCYType(EXPRMACRODEPENDENCYType object) {
                return createEXPRMACRODEPENDENCYTypeAdapter();
            }
            @Override
            public Adapter caseEXPRMACROType(EXPRMACROType object) {
                return createEXPRMACROTypeAdapter();
            }
            @Override
            public Adapter caseFIELDATTRIBUTEType(FIELDATTRIBUTEType object) {
                return createFIELDATTRIBUTETypeAdapter();
            }
            @Override
            public Adapter caseFIELDDEPENDENCYType(FIELDDEPENDENCYType object) {
                return createFIELDDEPENDENCYTypeAdapter();
            }
            @Override
            public Adapter caseFILTERType(FILTERType object) {
                return createFILTERTypeAdapter();
            }
            @Override
            public Adapter caseFLATFILEType(FLATFILEType object) {
                return createFLATFILETypeAdapter();
            }
            @Override
            public Adapter caseFOLDERType(FOLDERType object) {
                return createFOLDERTypeAdapter();
            }
            @Override
            public Adapter caseFOLDERVERSIONType(FOLDERVERSIONType object) {
                return createFOLDERVERSIONTypeAdapter();
            }
            @Override
            public Adapter caseGROUPType(GROUPType object) {
                return createGROUPTypeAdapter();
            }
            @Override
            public Adapter caseHASHKEYType(HASHKEYType object) {
                return createHASHKEYTypeAdapter();
            }
            @Override
            public Adapter caseINITPROPType(INITPROPType object) {
                return createINITPROPTypeAdapter();
            }
            @Override
            public Adapter caseINSTANCEType(INSTANCEType object) {
                return createINSTANCETypeAdapter();
            }
            @Override
            public Adapter caseKEYRANGEType(KEYRANGEType object) {
                return createKEYRANGETypeAdapter();
            }
            @Override
            public Adapter caseKEYWORDType(KEYWORDType object) {
                return createKEYWORDTypeAdapter();
            }
            @Override
            public Adapter caseMACROARGUMENTType(MACROARGUMENTType object) {
                return createMACROARGUMENTTypeAdapter();
            }
            @Override
            public Adapter caseMACRODEPENDENCYType(MACRODEPENDENCYType object) {
                return createMACRODEPENDENCYTypeAdapter();
            }
            @Override
            public Adapter caseMAPDEPENDENCYType(MAPDEPENDENCYType object) {
                return createMAPDEPENDENCYTypeAdapter();
            }
            @Override
            public Adapter caseMAPPINGType(MAPPINGType object) {
                return createMAPPINGTypeAdapter();
            }
            @Override
            public Adapter caseMAPPINGVARIABLEType(MAPPINGVARIABLEType object) {
                return createMAPPINGVARIABLETypeAdapter();
            }
            @Override
            public Adapter caseMAPPLETType(MAPPLETType object) {
                return createMAPPLETTypeAdapter();
            }
            @Override
            public Adapter caseMETADATAEXTENSIONType(METADATAEXTENSIONType object) {
                return createMETADATAEXTENSIONTypeAdapter();
            }
            @Override
            public Adapter casePARTITIONType(PARTITIONType object) {
                return createPARTITIONTypeAdapter();
            }
            @Override
            public Adapter casePOWERMARTType(POWERMARTType object) {
                return createPOWERMARTTypeAdapter();
            }
            @Override
            public Adapter caseRECURRINGType(RECURRINGType object) {
                return createRECURRINGTypeAdapter();
            }
            @Override
            public Adapter caseREPEATType(REPEATType object) {
                return createREPEATTypeAdapter();
            }
            @Override
            public Adapter caseREPOSITORYType(REPOSITORYType object) {
                return createREPOSITORYTypeAdapter();
            }
            @Override
            public Adapter caseRESOURCEREFERENCEType(RESOURCEREFERENCEType object) {
                return createRESOURCEREFERENCETypeAdapter();
            }
            @Override
            public Adapter caseSAPCODEBLOCKType(SAPCODEBLOCKType object) {
                return createSAPCODEBLOCKTypeAdapter();
            }
            @Override
            public Adapter caseSAPFUNCINSTANCEPARAMFLDType(SAPFUNCINSTANCEPARAMFLDType object) {
                return createSAPFUNCINSTANCEPARAMFLDTypeAdapter();
            }
            @Override
            public Adapter caseSAPFUNCINSTANCEPARAMType(SAPFUNCINSTANCEPARAMType object) {
                return createSAPFUNCINSTANCEPARAMTypeAdapter();
            }
            @Override
            public Adapter caseSAPFUNCPARAMType(SAPFUNCPARAMType object) {
                return createSAPFUNCPARAMTypeAdapter();
            }
            @Override
            public Adapter caseSAPFUNCTIONINSTANCEType(SAPFUNCTIONINSTANCEType object) {
                return createSAPFUNCTIONINSTANCETypeAdapter();
            }
            @Override
            public Adapter caseSAPFUNCTIONType(SAPFUNCTIONType object) {
                return createSAPFUNCTIONTypeAdapter();
            }
            @Override
            public Adapter caseSAPOUTPUTPORTType(SAPOUTPUTPORTType object) {
                return createSAPOUTPUTPORTTypeAdapter();
            }
            @Override
            public Adapter caseSAPPROGRAMFLOWOBJECTType(SAPPROGRAMFLOWOBJECTType object) {
                return createSAPPROGRAMFLOWOBJECTTypeAdapter();
            }
            @Override
            public Adapter caseSAPPROGRAMType(SAPPROGRAMType object) {
                return createSAPPROGRAMTypeAdapter();
            }
            @Override
            public Adapter caseSAPSTRUCTUREFIELDType(SAPSTRUCTUREFIELDType object) {
                return createSAPSTRUCTUREFIELDTypeAdapter();
            }
            @Override
            public Adapter caseSAPSTRUCTUREType(SAPSTRUCTUREType object) {
                return createSAPSTRUCTURETypeAdapter();
            }
            @Override
            public Adapter caseSAPTABLEINSTANCEPARAMType(SAPTABLEINSTANCEPARAMType object) {
                return createSAPTABLEINSTANCEPARAMTypeAdapter();
            }
            @Override
            public Adapter caseSAPTABLEPARAMType(SAPTABLEPARAMType object) {
                return createSAPTABLEPARAMTypeAdapter();
            }
            @Override
            public Adapter caseSAPVARIABLEType(SAPVARIABLEType object) {
                return createSAPVARIABLETypeAdapter();
            }
            @Override
            public Adapter caseSCHEDULEINFO(SCHEDULEINFO object) {
                return createSCHEDULEINFOAdapter();
            }
            @Override
            public Adapter caseSCHEDULEINFOType(SCHEDULEINFOType object) {
                return createSCHEDULEINFOTypeAdapter();
            }
            @Override
            public Adapter caseSCHEDULEOPTIONSType(SCHEDULEOPTIONSType object) {
                return createSCHEDULEOPTIONSTypeAdapter();
            }
            @Override
            public Adapter caseSCHEDULERType(SCHEDULERType object) {
                return createSCHEDULERTypeAdapter();
            }
            @Override
            public Adapter caseSEBLJOINType(SEBLJOINType object) {
                return createSEBLJOINTypeAdapter();
            }
            @Override
            public Adapter caseSEBLLINKType(SEBLLINKType object) {
                return createSEBLLINKTypeAdapter();
            }
            @Override
            public Adapter caseSEBLMVLINKRELType(SEBLMVLINKRELType object) {
                return createSEBLMVLINKRELTypeAdapter();
            }
            @Override
            public Adapter caseSEBLMVLINKType(SEBLMVLINKType object) {
                return createSEBLMVLINKTypeAdapter();
            }
            @Override
            public Adapter caseSEBLSRCINFOType(SEBLSRCINFOType object) {
                return createSEBLSRCINFOTypeAdapter();
            }
            @Override
            public Adapter caseSESSIONCOMPONENTType(SESSIONCOMPONENTType object) {
                return createSESSIONCOMPONENTTypeAdapter();
            }
            @Override
            public Adapter caseSESSIONEXTENSIONType(SESSIONEXTENSIONType object) {
                return createSESSIONEXTENSIONTypeAdapter();
            }
            @Override
            public Adapter caseSESSIONType(SESSIONType object) {
                return createSESSIONTypeAdapter();
            }
            @Override
            public Adapter caseSESSTRANSFORMATIONGROUPType(SESSTRANSFORMATIONGROUPType object) {
                return createSESSTRANSFORMATIONGROUPTypeAdapter();
            }
            @Override
            public Adapter caseSESSTRANSFORMATIONINSTType(SESSTRANSFORMATIONINSTType object) {
                return createSESSTRANSFORMATIONINSTTypeAdapter();
            }
            @Override
            public Adapter caseSHORTCUTType(SHORTCUTType object) {
                return createSHORTCUTTypeAdapter();
            }
            @Override
            public Adapter caseSOURCEFIELDType(SOURCEFIELDType object) {
                return createSOURCEFIELDTypeAdapter();
            }
            @Override
            public Adapter caseSOURCEType(SOURCEType object) {
                return createSOURCETypeAdapter();
            }
            @Override
            public Adapter caseSTARTOPTIONSType(STARTOPTIONSType object) {
                return createSTARTOPTIONSTypeAdapter();
            }
            @Override
            public Adapter caseTABLEATTRIBUTEType(TABLEATTRIBUTEType object) {
                return createTABLEATTRIBUTETypeAdapter();
            }
            @Override
            public Adapter caseTARGETFIELDType(TARGETFIELDType object) {
                return createTARGETFIELDTypeAdapter();
            }
            @Override
            public Adapter caseTARGETINDEXFIELDType(TARGETINDEXFIELDType object) {
                return createTARGETINDEXFIELDTypeAdapter();
            }
            @Override
            public Adapter caseTARGETINDEXType(TARGETINDEXType object) {
                return createTARGETINDEXTypeAdapter();
            }
            @Override
            public Adapter caseTARGETLOADORDERType(TARGETLOADORDERType object) {
                return createTARGETLOADORDERTypeAdapter();
            }
            @Override
            public Adapter caseTARGETType(TARGETType object) {
                return createTARGETTypeAdapter();
            }
            @Override
            public Adapter caseTASKINSTANCEType(TASKINSTANCEType object) {
                return createTASKINSTANCETypeAdapter();
            }
            @Override
            public Adapter caseTASKType(TASKType object) {
                return createTASKTypeAdapter();
            }
            @Override
            public Adapter caseTIMERType(TIMERType object) {
                return createTIMERTypeAdapter();
            }
            @Override
            public Adapter caseTRANSFORMATIONType(TRANSFORMATIONType object) {
                return createTRANSFORMATIONTypeAdapter();
            }
            @Override
            public Adapter caseTRANSFORMFIELDATTRDEFType(TRANSFORMFIELDATTRDEFType object) {
                return createTRANSFORMFIELDATTRDEFTypeAdapter();
            }
            @Override
            public Adapter caseTRANSFORMFIELDATTRType(TRANSFORMFIELDATTRType object) {
                return createTRANSFORMFIELDATTRTypeAdapter();
            }
            @Override
            public Adapter caseTRANSFORMFIELDType(TRANSFORMFIELDType object) {
                return createTRANSFORMFIELDTypeAdapter();
            }
            @Override
            public Adapter caseTRANSFORMRESOURCEREFType(TRANSFORMRESOURCEREFType object) {
                return createTRANSFORMRESOURCEREFTypeAdapter();
            }
            @Override
            public Adapter caseVALUEPAIRType(VALUEPAIRType object) {
                return createVALUEPAIRTypeAdapter();
            }
            @Override
            public Adapter caseWORKFLOWEVENTType(WORKFLOWEVENTType object) {
                return createWORKFLOWEVENTTypeAdapter();
            }
            @Override
            public Adapter caseWORKFLOWLINKType(WORKFLOWLINKType object) {
                return createWORKFLOWLINKTypeAdapter();
            }
            @Override
            public Adapter caseWORKFLOWType(WORKFLOWType object) {
                return createWORKFLOWTypeAdapter();
            }
            @Override
            public Adapter caseWORKFLOWVARIABLEType(WORKFLOWVARIABLEType object) {
                return createWORKFLOWVARIABLETypeAdapter();
            }
            @Override
            public Adapter caseWORKLETType(WORKLETType object) {
                return createWORKLETTypeAdapter();
            }
            @Override
            public Adapter caseXMLINFOType(XMLINFOType object) {
                return createXMLINFOTypeAdapter();
            }
            @Override
            public Adapter caseXMLTEXTType(XMLTEXTType object) {
                return createXMLTEXTTypeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link Powrmart.ASSOCIATEDSOURCEINSTANCEType <em>ASSOCIATEDSOURCEINSTANCE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.ASSOCIATEDSOURCEINSTANCEType
     * @generated
     */
    public Adapter createASSOCIATEDSOURCEINSTANCETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.ATTRIBUTEType <em>ATTRIBUTE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.ATTRIBUTEType
     * @generated
     */
    public Adapter createATTRIBUTETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.CONFIGREFERENCEType <em>CONFIGREFERENCE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.CONFIGREFERENCEType
     * @generated
     */
    public Adapter createCONFIGREFERENCETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.CONFIGType <em>CONFIG Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.CONFIGType
     * @generated
     */
    public Adapter createCONFIGTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.CONNECTIONREFERENCEType <em>CONNECTIONREFERENCE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.CONNECTIONREFERENCEType
     * @generated
     */
    public Adapter createCONNECTIONREFERENCETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.CONNECTORType <em>CONNECTOR Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.CONNECTORType
     * @generated
     */
    public Adapter createCONNECTORTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.CONWFRUNINFOType <em>CONWFRUNINFO Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.CONWFRUNINFOType
     * @generated
     */
    public Adapter createCONWFRUNINFOTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.CUSTOMType <em>CUSTOM Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.CUSTOMType
     * @generated
     */
    public Adapter createCUSTOMTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.DAILYFREQUENCYType <em>DAILYFREQUENCY Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.DAILYFREQUENCYType
     * @generated
     */
    public Adapter createDAILYFREQUENCYTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.ENDOPTIONSType <em>ENDOPTIONS Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.ENDOPTIONSType
     * @generated
     */
    public Adapter createENDOPTIONSTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.ERPINFOType <em>ERPINFO Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.ERPINFOType
     * @generated
     */
    public Adapter createERPINFOTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.ERPSRCINFOType <em>ERPSRCINFO Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.ERPSRCINFOType
     * @generated
     */
    public Adapter createERPSRCINFOTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.EXPRMACRODEPENDENCYType <em>EXPRMACRODEPENDENCY Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.EXPRMACRODEPENDENCYType
     * @generated
     */
    public Adapter createEXPRMACRODEPENDENCYTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.EXPRMACROType <em>EXPRMACRO Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.EXPRMACROType
     * @generated
     */
    public Adapter createEXPRMACROTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.FIELDATTRIBUTEType <em>FIELDATTRIBUTE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.FIELDATTRIBUTEType
     * @generated
     */
    public Adapter createFIELDATTRIBUTETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.FIELDDEPENDENCYType <em>FIELDDEPENDENCY Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.FIELDDEPENDENCYType
     * @generated
     */
    public Adapter createFIELDDEPENDENCYTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.FILTERType <em>FILTER Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.FILTERType
     * @generated
     */
    public Adapter createFILTERTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.FLATFILEType <em>FLATFILE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.FLATFILEType
     * @generated
     */
    public Adapter createFLATFILETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.FOLDERType <em>FOLDER Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.FOLDERType
     * @generated
     */
    public Adapter createFOLDERTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.FOLDERVERSIONType <em>FOLDERVERSION Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.FOLDERVERSIONType
     * @generated
     */
    public Adapter createFOLDERVERSIONTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.GROUPType <em>GROUP Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.GROUPType
     * @generated
     */
    public Adapter createGROUPTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.HASHKEYType <em>HASHKEY Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.HASHKEYType
     * @generated
     */
    public Adapter createHASHKEYTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.INITPROPType <em>INITPROP Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.INITPROPType
     * @generated
     */
    public Adapter createINITPROPTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.INSTANCEType <em>INSTANCE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.INSTANCEType
     * @generated
     */
    public Adapter createINSTANCETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.KEYRANGEType <em>KEYRANGE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.KEYRANGEType
     * @generated
     */
    public Adapter createKEYRANGETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.KEYWORDType <em>KEYWORD Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.KEYWORDType
     * @generated
     */
    public Adapter createKEYWORDTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.MACROARGUMENTType <em>MACROARGUMENT Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.MACROARGUMENTType
     * @generated
     */
    public Adapter createMACROARGUMENTTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.MACRODEPENDENCYType <em>MACRODEPENDENCY Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.MACRODEPENDENCYType
     * @generated
     */
    public Adapter createMACRODEPENDENCYTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.MAPDEPENDENCYType <em>MAPDEPENDENCY Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.MAPDEPENDENCYType
     * @generated
     */
    public Adapter createMAPDEPENDENCYTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.MAPPINGType <em>MAPPING Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.MAPPINGType
     * @generated
     */
    public Adapter createMAPPINGTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.MAPPINGVARIABLEType <em>MAPPINGVARIABLE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.MAPPINGVARIABLEType
     * @generated
     */
    public Adapter createMAPPINGVARIABLETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.MAPPLETType <em>MAPPLET Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.MAPPLETType
     * @generated
     */
    public Adapter createMAPPLETTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.METADATAEXTENSIONType <em>METADATAEXTENSION Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.METADATAEXTENSIONType
     * @generated
     */
    public Adapter createMETADATAEXTENSIONTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.PARTITIONType <em>PARTITION Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.PARTITIONType
     * @generated
     */
    public Adapter createPARTITIONTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.POWERMARTType <em>POWERMART Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.POWERMARTType
     * @generated
     */
    public Adapter createPOWERMARTTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.RECURRINGType <em>RECURRING Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.RECURRINGType
     * @generated
     */
    public Adapter createRECURRINGTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.REPEATType <em>REPEAT Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.REPEATType
     * @generated
     */
    public Adapter createREPEATTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.REPOSITORYType <em>REPOSITORY Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.REPOSITORYType
     * @generated
     */
    public Adapter createREPOSITORYTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.RESOURCEREFERENCEType <em>RESOURCEREFERENCE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.RESOURCEREFERENCEType
     * @generated
     */
    public Adapter createRESOURCEREFERENCETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPCODEBLOCKType <em>SAPCODEBLOCK Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPCODEBLOCKType
     * @generated
     */
    public Adapter createSAPCODEBLOCKTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPFUNCINSTANCEPARAMFLDType <em>SAPFUNCINSTANCEPARAMFLD Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPFUNCINSTANCEPARAMFLDType
     * @generated
     */
    public Adapter createSAPFUNCINSTANCEPARAMFLDTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPFUNCINSTANCEPARAMType <em>SAPFUNCINSTANCEPARAM Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPFUNCINSTANCEPARAMType
     * @generated
     */
    public Adapter createSAPFUNCINSTANCEPARAMTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPFUNCPARAMType <em>SAPFUNCPARAM Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPFUNCPARAMType
     * @generated
     */
    public Adapter createSAPFUNCPARAMTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPFUNCTIONINSTANCEType <em>SAPFUNCTIONINSTANCE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPFUNCTIONINSTANCEType
     * @generated
     */
    public Adapter createSAPFUNCTIONINSTANCETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPFUNCTIONType <em>SAPFUNCTION Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPFUNCTIONType
     * @generated
     */
    public Adapter createSAPFUNCTIONTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPOUTPUTPORTType <em>SAPOUTPUTPORT Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPOUTPUTPORTType
     * @generated
     */
    public Adapter createSAPOUTPUTPORTTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPPROGRAMFLOWOBJECTType <em>SAPPROGRAMFLOWOBJECT Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPPROGRAMFLOWOBJECTType
     * @generated
     */
    public Adapter createSAPPROGRAMFLOWOBJECTTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPPROGRAMType <em>SAPPROGRAM Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPPROGRAMType
     * @generated
     */
    public Adapter createSAPPROGRAMTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPSTRUCTUREFIELDType <em>SAPSTRUCTUREFIELD Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPSTRUCTUREFIELDType
     * @generated
     */
    public Adapter createSAPSTRUCTUREFIELDTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPSTRUCTUREType <em>SAPSTRUCTURE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPSTRUCTUREType
     * @generated
     */
    public Adapter createSAPSTRUCTURETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPTABLEINSTANCEPARAMType <em>SAPTABLEINSTANCEPARAM Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPTABLEINSTANCEPARAMType
     * @generated
     */
    public Adapter createSAPTABLEINSTANCEPARAMTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPTABLEPARAMType <em>SAPTABLEPARAM Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPTABLEPARAMType
     * @generated
     */
    public Adapter createSAPTABLEPARAMTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SAPVARIABLEType <em>SAPVARIABLE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SAPVARIABLEType
     * @generated
     */
    public Adapter createSAPVARIABLETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SCHEDULEINFO <em>SCHEDULEINFO</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SCHEDULEINFO
     * @generated
     */
    public Adapter createSCHEDULEINFOAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SCHEDULEINFOType <em>SCHEDULEINFO Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SCHEDULEINFOType
     * @generated
     */
    public Adapter createSCHEDULEINFOTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SCHEDULEOPTIONSType <em>SCHEDULEOPTIONS Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SCHEDULEOPTIONSType
     * @generated
     */
    public Adapter createSCHEDULEOPTIONSTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SCHEDULERType <em>SCHEDULER Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SCHEDULERType
     * @generated
     */
    public Adapter createSCHEDULERTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SEBLJOINType <em>SEBLJOIN Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SEBLJOINType
     * @generated
     */
    public Adapter createSEBLJOINTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SEBLLINKType <em>SEBLLINK Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SEBLLINKType
     * @generated
     */
    public Adapter createSEBLLINKTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SEBLMVLINKRELType <em>SEBLMVLINKREL Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SEBLMVLINKRELType
     * @generated
     */
    public Adapter createSEBLMVLINKRELTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SEBLMVLINKType <em>SEBLMVLINK Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SEBLMVLINKType
     * @generated
     */
    public Adapter createSEBLMVLINKTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SEBLSRCINFOType <em>SEBLSRCINFO Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SEBLSRCINFOType
     * @generated
     */
    public Adapter createSEBLSRCINFOTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SESSIONCOMPONENTType <em>SESSIONCOMPONENT Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SESSIONCOMPONENTType
     * @generated
     */
    public Adapter createSESSIONCOMPONENTTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SESSIONEXTENSIONType <em>SESSIONEXTENSION Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SESSIONEXTENSIONType
     * @generated
     */
    public Adapter createSESSIONEXTENSIONTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SESSIONType <em>SESSION Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SESSIONType
     * @generated
     */
    public Adapter createSESSIONTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SESSTRANSFORMATIONGROUPType <em>SESSTRANSFORMATIONGROUP Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SESSTRANSFORMATIONGROUPType
     * @generated
     */
    public Adapter createSESSTRANSFORMATIONGROUPTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SESSTRANSFORMATIONINSTType <em>SESSTRANSFORMATIONINST Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SESSTRANSFORMATIONINSTType
     * @generated
     */
    public Adapter createSESSTRANSFORMATIONINSTTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SHORTCUTType <em>SHORTCUT Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SHORTCUTType
     * @generated
     */
    public Adapter createSHORTCUTTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SOURCEFIELDType <em>SOURCEFIELD Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SOURCEFIELDType
     * @generated
     */
    public Adapter createSOURCEFIELDTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.SOURCEType <em>SOURCE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.SOURCEType
     * @generated
     */
    public Adapter createSOURCETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.STARTOPTIONSType <em>STARTOPTIONS Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.STARTOPTIONSType
     * @generated
     */
    public Adapter createSTARTOPTIONSTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TABLEATTRIBUTEType <em>TABLEATTRIBUTE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TABLEATTRIBUTEType
     * @generated
     */
    public Adapter createTABLEATTRIBUTETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TARGETFIELDType <em>TARGETFIELD Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TARGETFIELDType
     * @generated
     */
    public Adapter createTARGETFIELDTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TARGETINDEXFIELDType <em>TARGETINDEXFIELD Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TARGETINDEXFIELDType
     * @generated
     */
    public Adapter createTARGETINDEXFIELDTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TARGETINDEXType <em>TARGETINDEX Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TARGETINDEXType
     * @generated
     */
    public Adapter createTARGETINDEXTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TARGETLOADORDERType <em>TARGETLOADORDER Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TARGETLOADORDERType
     * @generated
     */
    public Adapter createTARGETLOADORDERTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TARGETType <em>TARGET Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TARGETType
     * @generated
     */
    public Adapter createTARGETTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TASKINSTANCEType <em>TASKINSTANCE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TASKINSTANCEType
     * @generated
     */
    public Adapter createTASKINSTANCETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TASKType <em>TASK Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TASKType
     * @generated
     */
    public Adapter createTASKTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TIMERType <em>TIMER Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TIMERType
     * @generated
     */
    public Adapter createTIMERTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TRANSFORMATIONType <em>TRANSFORMATION Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TRANSFORMATIONType
     * @generated
     */
    public Adapter createTRANSFORMATIONTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TRANSFORMFIELDATTRDEFType <em>TRANSFORMFIELDATTRDEF Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TRANSFORMFIELDATTRDEFType
     * @generated
     */
    public Adapter createTRANSFORMFIELDATTRDEFTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TRANSFORMFIELDATTRType <em>TRANSFORMFIELDATTR Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TRANSFORMFIELDATTRType
     * @generated
     */
    public Adapter createTRANSFORMFIELDATTRTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TRANSFORMFIELDType <em>TRANSFORMFIELD Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TRANSFORMFIELDType
     * @generated
     */
    public Adapter createTRANSFORMFIELDTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.TRANSFORMRESOURCEREFType <em>TRANSFORMRESOURCEREF Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.TRANSFORMRESOURCEREFType
     * @generated
     */
    public Adapter createTRANSFORMRESOURCEREFTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.VALUEPAIRType <em>VALUEPAIR Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.VALUEPAIRType
     * @generated
     */
    public Adapter createVALUEPAIRTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.WORKFLOWEVENTType <em>WORKFLOWEVENT Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.WORKFLOWEVENTType
     * @generated
     */
    public Adapter createWORKFLOWEVENTTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.WORKFLOWLINKType <em>WORKFLOWLINK Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.WORKFLOWLINKType
     * @generated
     */
    public Adapter createWORKFLOWLINKTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.WORKFLOWType <em>WORKFLOW Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.WORKFLOWType
     * @generated
     */
    public Adapter createWORKFLOWTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.WORKFLOWVARIABLEType <em>WORKFLOWVARIABLE Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.WORKFLOWVARIABLEType
     * @generated
     */
    public Adapter createWORKFLOWVARIABLETypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.WORKLETType <em>WORKLET Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.WORKLETType
     * @generated
     */
    public Adapter createWORKLETTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.XMLINFOType <em>XMLINFO Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.XMLINFOType
     * @generated
     */
    public Adapter createXMLINFOTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link Powrmart.XMLTEXTType <em>XMLTEXT Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see Powrmart.XMLTEXTType
     * @generated
     */
    public Adapter createXMLTEXTTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //PowrmartAdapterFactory
