/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ATTRIBUTEType;
import Powrmart.CONFIGREFERENCEType;
import Powrmart.FAILPARENTIFINSTANCEDIDNOTRUNType;
import Powrmart.FAILPARENTIFINSTANCEFAILSType;
import Powrmart.ISENABLEDType1;
import Powrmart.PowrmartPackage;
import Powrmart.RESOURCEREFERENCEType;
import Powrmart.REUSABLEType2;
import Powrmart.SESSIONCOMPONENTType;
import Powrmart.SESSIONEXTENSIONType;
import Powrmart.TASKINSTANCEType;
import Powrmart.TRANSFORMRESOURCEREFType;
import Powrmart.TREATINPUTLINKASANDType;
import Powrmart.VALUEPAIRType;
import Powrmart.WORKFLOWVARIABLEType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TASKINSTANCE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getWORKFLOWVARIABLE <em>WORKFLOWVARIABLE</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getVALUEPAIR <em>VALUEPAIR</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getCONFIGREFERENCE <em>CONFIGREFERENCE</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getSESSIONCOMPONENT <em>SESSIONCOMPONENT</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getSESSIONEXTENSION <em>SESSIONEXTENSION</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getTRANSFORMRESOURCEREF <em>TRANSFORMRESOURCEREF</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getFAILPARENTIFINSTANCEDIDNOTRUN <em>FAILPARENTIFINSTANCEDIDNOTRUN</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getFAILPARENTIFINSTANCEFAILS <em>FAILPARENTIFINSTANCEFAILS</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getISENABLED <em>ISENABLED</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getSERVEROVERRIDE <em>SERVEROVERRIDE</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getTASKNAME <em>TASKNAME</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getTASKTYPE <em>TASKTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TASKINSTANCETypeImpl#getTREATINPUTLINKASAND <em>TREATINPUTLINKASAND</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TASKINSTANCETypeImpl extends EObjectImpl implements TASKINSTANCEType {
    /**
     * The cached value of the '{@link #getATTRIBUTE() <em>ATTRIBUTE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getATTRIBUTE()
     * @generated
     * @ordered
     */
    protected EList<ATTRIBUTEType> aTTRIBUTE;

    /**
     * The cached value of the '{@link #getWORKFLOWVARIABLE() <em>WORKFLOWVARIABLE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWORKFLOWVARIABLE()
     * @generated
     * @ordered
     */
    protected EList<WORKFLOWVARIABLEType> wORKFLOWVARIABLE;

    /**
     * The cached value of the '{@link #getVALUEPAIR() <em>VALUEPAIR</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUEPAIR()
     * @generated
     * @ordered
     */
    protected EList<VALUEPAIRType> vALUEPAIR;

    /**
     * The cached value of the '{@link #getCONFIGREFERENCE() <em>CONFIGREFERENCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONFIGREFERENCE()
     * @generated
     * @ordered
     */
    protected CONFIGREFERENCEType cONFIGREFERENCE;

    /**
     * The cached value of the '{@link #getSESSIONCOMPONENT() <em>SESSIONCOMPONENT</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSESSIONCOMPONENT()
     * @generated
     * @ordered
     */
    protected EList<SESSIONCOMPONENTType> sESSIONCOMPONENT;

    /**
     * The cached value of the '{@link #getSESSIONEXTENSION() <em>SESSIONEXTENSION</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSESSIONEXTENSION()
     * @generated
     * @ordered
     */
    protected EList<SESSIONEXTENSIONType> sESSIONEXTENSION;

    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap group;

    /**
     * The default value of the '{@link #getDESCRIPTION() <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESCRIPTION()
     * @generated
     * @ordered
     */
    protected static final Object DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDESCRIPTION() <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESCRIPTION()
     * @generated
     * @ordered
     */
    protected Object dESCRIPTION = DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getFAILPARENTIFINSTANCEDIDNOTRUN() <em>FAILPARENTIFINSTANCEDIDNOTRUN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFAILPARENTIFINSTANCEDIDNOTRUN()
     * @generated
     * @ordered
     */
    protected static final FAILPARENTIFINSTANCEDIDNOTRUNType FAILPARENTIFINSTANCEDIDNOTRUN_EDEFAULT = FAILPARENTIFINSTANCEDIDNOTRUNType.YES;

    /**
     * The cached value of the '{@link #getFAILPARENTIFINSTANCEDIDNOTRUN() <em>FAILPARENTIFINSTANCEDIDNOTRUN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFAILPARENTIFINSTANCEDIDNOTRUN()
     * @generated
     * @ordered
     */
    protected FAILPARENTIFINSTANCEDIDNOTRUNType fAILPARENTIFINSTANCEDIDNOTRUN = FAILPARENTIFINSTANCEDIDNOTRUN_EDEFAULT;

    /**
     * This is true if the FAILPARENTIFINSTANCEDIDNOTRUN attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fAILPARENTIFINSTANCEDIDNOTRUNESet;

    /**
     * The default value of the '{@link #getFAILPARENTIFINSTANCEFAILS() <em>FAILPARENTIFINSTANCEFAILS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFAILPARENTIFINSTANCEFAILS()
     * @generated
     * @ordered
     */
    protected static final FAILPARENTIFINSTANCEFAILSType FAILPARENTIFINSTANCEFAILS_EDEFAULT = FAILPARENTIFINSTANCEFAILSType.YES;

    /**
     * The cached value of the '{@link #getFAILPARENTIFINSTANCEFAILS() <em>FAILPARENTIFINSTANCEFAILS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFAILPARENTIFINSTANCEFAILS()
     * @generated
     * @ordered
     */
    protected FAILPARENTIFINSTANCEFAILSType fAILPARENTIFINSTANCEFAILS = FAILPARENTIFINSTANCEFAILS_EDEFAULT;

    /**
     * This is true if the FAILPARENTIFINSTANCEFAILS attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fAILPARENTIFINSTANCEFAILSESet;

    /**
     * The default value of the '{@link #getISENABLED() <em>ISENABLED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISENABLED()
     * @generated
     * @ordered
     */
    protected static final ISENABLEDType1 ISENABLED_EDEFAULT = ISENABLEDType1.YES;

    /**
     * The cached value of the '{@link #getISENABLED() <em>ISENABLED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISENABLED()
     * @generated
     * @ordered
     */
    protected ISENABLEDType1 iSENABLED = ISENABLED_EDEFAULT;

    /**
     * This is true if the ISENABLED attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSENABLEDESet;

    /**
     * The default value of the '{@link #getNAME() <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAME()
     * @generated
     * @ordered
     */
    protected static final Object NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNAME() <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAME()
     * @generated
     * @ordered
     */
    protected Object nAME = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected static final REUSABLEType2 REUSABLE_EDEFAULT = REUSABLEType2.YES;

    /**
     * The cached value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected REUSABLEType2 rEUSABLE = REUSABLE_EDEFAULT;

    /**
     * This is true if the REUSABLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEUSABLEESet;

    /**
     * The default value of the '{@link #getSERVEROVERRIDE() <em>SERVEROVERRIDE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSERVEROVERRIDE()
     * @generated
     * @ordered
     */
    protected static final Object SERVEROVERRIDE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSERVEROVERRIDE() <em>SERVEROVERRIDE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSERVEROVERRIDE()
     * @generated
     * @ordered
     */
    protected Object sERVEROVERRIDE = SERVEROVERRIDE_EDEFAULT;

    /**
     * The default value of the '{@link #getTASKNAME() <em>TASKNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTASKNAME()
     * @generated
     * @ordered
     */
    protected static final Object TASKNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTASKNAME() <em>TASKNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTASKNAME()
     * @generated
     * @ordered
     */
    protected Object tASKNAME = TASKNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTASKTYPE() <em>TASKTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTASKTYPE()
     * @generated
     * @ordered
     */
    protected static final Object TASKTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTASKTYPE() <em>TASKTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTASKTYPE()
     * @generated
     * @ordered
     */
    protected Object tASKTYPE = TASKTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getTREATINPUTLINKASAND() <em>TREATINPUTLINKASAND</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTREATINPUTLINKASAND()
     * @generated
     * @ordered
     */
    protected static final TREATINPUTLINKASANDType TREATINPUTLINKASAND_EDEFAULT = TREATINPUTLINKASANDType.YES;

    /**
     * The cached value of the '{@link #getTREATINPUTLINKASAND() <em>TREATINPUTLINKASAND</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTREATINPUTLINKASAND()
     * @generated
     * @ordered
     */
    protected TREATINPUTLINKASANDType tREATINPUTLINKASAND = TREATINPUTLINKASAND_EDEFAULT;

    /**
     * This is true if the TREATINPUTLINKASAND attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tREATINPUTLINKASANDESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TASKINSTANCETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getTASKINSTANCEType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ATTRIBUTEType> getATTRIBUTE() {
        if (aTTRIBUTE == null) {
            aTTRIBUTE = new EObjectContainmentEList<ATTRIBUTEType>(ATTRIBUTEType.class, this, PowrmartPackage.TASKINSTANCE_TYPE__ATTRIBUTE);
        }
        return aTTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<WORKFLOWVARIABLEType> getWORKFLOWVARIABLE() {
        if (wORKFLOWVARIABLE == null) {
            wORKFLOWVARIABLE = new EObjectContainmentEList<WORKFLOWVARIABLEType>(WORKFLOWVARIABLEType.class, this, PowrmartPackage.TASKINSTANCE_TYPE__WORKFLOWVARIABLE);
        }
        return wORKFLOWVARIABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VALUEPAIRType> getVALUEPAIR() {
        if (vALUEPAIR == null) {
            vALUEPAIR = new EObjectContainmentEList<VALUEPAIRType>(VALUEPAIRType.class, this, PowrmartPackage.TASKINSTANCE_TYPE__VALUEPAIR);
        }
        return vALUEPAIR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONFIGREFERENCEType getCONFIGREFERENCE() {
        return cONFIGREFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCONFIGREFERENCE(CONFIGREFERENCEType newCONFIGREFERENCE, NotificationChain msgs) {
        CONFIGREFERENCEType oldCONFIGREFERENCE = cONFIGREFERENCE;
        cONFIGREFERENCE = newCONFIGREFERENCE;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASKINSTANCE_TYPE__CONFIGREFERENCE, oldCONFIGREFERENCE, newCONFIGREFERENCE);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONFIGREFERENCE(CONFIGREFERENCEType newCONFIGREFERENCE) {
        if (newCONFIGREFERENCE != cONFIGREFERENCE) {
            NotificationChain msgs = null;
            if (cONFIGREFERENCE != null)
                msgs = ((InternalEObject)cONFIGREFERENCE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TASKINSTANCE_TYPE__CONFIGREFERENCE, null, msgs);
            if (newCONFIGREFERENCE != null)
                msgs = ((InternalEObject)newCONFIGREFERENCE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TASKINSTANCE_TYPE__CONFIGREFERENCE, null, msgs);
            msgs = basicSetCONFIGREFERENCE(newCONFIGREFERENCE, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASKINSTANCE_TYPE__CONFIGREFERENCE, newCONFIGREFERENCE, newCONFIGREFERENCE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SESSIONCOMPONENTType> getSESSIONCOMPONENT() {
        if (sESSIONCOMPONENT == null) {
            sESSIONCOMPONENT = new EObjectContainmentEList<SESSIONCOMPONENTType>(SESSIONCOMPONENTType.class, this, PowrmartPackage.TASKINSTANCE_TYPE__SESSIONCOMPONENT);
        }
        return sESSIONCOMPONENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SESSIONEXTENSIONType> getSESSIONEXTENSION() {
        if (sESSIONEXTENSION == null) {
            sESSIONEXTENSION = new EObjectContainmentEList<SESSIONEXTENSIONType>(SESSIONEXTENSIONType.class, this, PowrmartPackage.TASKINSTANCE_TYPE__SESSIONEXTENSION);
        }
        return sESSIONEXTENSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, PowrmartPackage.TASKINSTANCE_TYPE__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RESOURCEREFERENCEType> getRESOURCEREFERENCE() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getTASKINSTANCEType_RESOURCEREFERENCE());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TRANSFORMRESOURCEREFType> getTRANSFORMRESOURCEREF() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getTASKINSTANCEType_TRANSFORMRESOURCEREF());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDESCRIPTION() {
        return dESCRIPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDESCRIPTION(Object newDESCRIPTION) {
        Object oldDESCRIPTION = dESCRIPTION;
        dESCRIPTION = newDESCRIPTION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASKINSTANCE_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FAILPARENTIFINSTANCEDIDNOTRUNType getFAILPARENTIFINSTANCEDIDNOTRUN() {
        return fAILPARENTIFINSTANCEDIDNOTRUN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFAILPARENTIFINSTANCEDIDNOTRUN(FAILPARENTIFINSTANCEDIDNOTRUNType newFAILPARENTIFINSTANCEDIDNOTRUN) {
        FAILPARENTIFINSTANCEDIDNOTRUNType oldFAILPARENTIFINSTANCEDIDNOTRUN = fAILPARENTIFINSTANCEDIDNOTRUN;
        fAILPARENTIFINSTANCEDIDNOTRUN = newFAILPARENTIFINSTANCEDIDNOTRUN == null ? FAILPARENTIFINSTANCEDIDNOTRUN_EDEFAULT : newFAILPARENTIFINSTANCEDIDNOTRUN;
        boolean oldFAILPARENTIFINSTANCEDIDNOTRUNESet = fAILPARENTIFINSTANCEDIDNOTRUNESet;
        fAILPARENTIFINSTANCEDIDNOTRUNESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEDIDNOTRUN, oldFAILPARENTIFINSTANCEDIDNOTRUN, fAILPARENTIFINSTANCEDIDNOTRUN, !oldFAILPARENTIFINSTANCEDIDNOTRUNESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFAILPARENTIFINSTANCEDIDNOTRUN() {
        FAILPARENTIFINSTANCEDIDNOTRUNType oldFAILPARENTIFINSTANCEDIDNOTRUN = fAILPARENTIFINSTANCEDIDNOTRUN;
        boolean oldFAILPARENTIFINSTANCEDIDNOTRUNESet = fAILPARENTIFINSTANCEDIDNOTRUNESet;
        fAILPARENTIFINSTANCEDIDNOTRUN = FAILPARENTIFINSTANCEDIDNOTRUN_EDEFAULT;
        fAILPARENTIFINSTANCEDIDNOTRUNESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEDIDNOTRUN, oldFAILPARENTIFINSTANCEDIDNOTRUN, FAILPARENTIFINSTANCEDIDNOTRUN_EDEFAULT, oldFAILPARENTIFINSTANCEDIDNOTRUNESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFAILPARENTIFINSTANCEDIDNOTRUN() {
        return fAILPARENTIFINSTANCEDIDNOTRUNESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FAILPARENTIFINSTANCEFAILSType getFAILPARENTIFINSTANCEFAILS() {
        return fAILPARENTIFINSTANCEFAILS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFAILPARENTIFINSTANCEFAILS(FAILPARENTIFINSTANCEFAILSType newFAILPARENTIFINSTANCEFAILS) {
        FAILPARENTIFINSTANCEFAILSType oldFAILPARENTIFINSTANCEFAILS = fAILPARENTIFINSTANCEFAILS;
        fAILPARENTIFINSTANCEFAILS = newFAILPARENTIFINSTANCEFAILS == null ? FAILPARENTIFINSTANCEFAILS_EDEFAULT : newFAILPARENTIFINSTANCEFAILS;
        boolean oldFAILPARENTIFINSTANCEFAILSESet = fAILPARENTIFINSTANCEFAILSESet;
        fAILPARENTIFINSTANCEFAILSESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEFAILS, oldFAILPARENTIFINSTANCEFAILS, fAILPARENTIFINSTANCEFAILS, !oldFAILPARENTIFINSTANCEFAILSESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFAILPARENTIFINSTANCEFAILS() {
        FAILPARENTIFINSTANCEFAILSType oldFAILPARENTIFINSTANCEFAILS = fAILPARENTIFINSTANCEFAILS;
        boolean oldFAILPARENTIFINSTANCEFAILSESet = fAILPARENTIFINSTANCEFAILSESet;
        fAILPARENTIFINSTANCEFAILS = FAILPARENTIFINSTANCEFAILS_EDEFAULT;
        fAILPARENTIFINSTANCEFAILSESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEFAILS, oldFAILPARENTIFINSTANCEFAILS, FAILPARENTIFINSTANCEFAILS_EDEFAULT, oldFAILPARENTIFINSTANCEFAILSESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFAILPARENTIFINSTANCEFAILS() {
        return fAILPARENTIFINSTANCEFAILSESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISENABLEDType1 getISENABLED() {
        return iSENABLED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISENABLED(ISENABLEDType1 newISENABLED) {
        ISENABLEDType1 oldISENABLED = iSENABLED;
        iSENABLED = newISENABLED == null ? ISENABLED_EDEFAULT : newISENABLED;
        boolean oldISENABLEDESet = iSENABLEDESet;
        iSENABLEDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASKINSTANCE_TYPE__ISENABLED, oldISENABLED, iSENABLED, !oldISENABLEDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISENABLED() {
        ISENABLEDType1 oldISENABLED = iSENABLED;
        boolean oldISENABLEDESet = iSENABLEDESet;
        iSENABLED = ISENABLED_EDEFAULT;
        iSENABLEDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TASKINSTANCE_TYPE__ISENABLED, oldISENABLED, ISENABLED_EDEFAULT, oldISENABLEDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISENABLED() {
        return iSENABLEDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getNAME() {
        return nAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNAME(Object newNAME) {
        Object oldNAME = nAME;
        nAME = newNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASKINSTANCE_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType2 getREUSABLE() {
        return rEUSABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREUSABLE(REUSABLEType2 newREUSABLE) {
        REUSABLEType2 oldREUSABLE = rEUSABLE;
        rEUSABLE = newREUSABLE == null ? REUSABLE_EDEFAULT : newREUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASKINSTANCE_TYPE__REUSABLE, oldREUSABLE, rEUSABLE, !oldREUSABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREUSABLE() {
        REUSABLEType2 oldREUSABLE = rEUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLE = REUSABLE_EDEFAULT;
        rEUSABLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TASKINSTANCE_TYPE__REUSABLE, oldREUSABLE, REUSABLE_EDEFAULT, oldREUSABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetREUSABLE() {
        return rEUSABLEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSERVEROVERRIDE() {
        return sERVEROVERRIDE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSERVEROVERRIDE(Object newSERVEROVERRIDE) {
        Object oldSERVEROVERRIDE = sERVEROVERRIDE;
        sERVEROVERRIDE = newSERVEROVERRIDE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASKINSTANCE_TYPE__SERVEROVERRIDE, oldSERVEROVERRIDE, sERVEROVERRIDE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTASKNAME() {
        return tASKNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTASKNAME(Object newTASKNAME) {
        Object oldTASKNAME = tASKNAME;
        tASKNAME = newTASKNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASKINSTANCE_TYPE__TASKNAME, oldTASKNAME, tASKNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTASKTYPE() {
        return tASKTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTASKTYPE(Object newTASKTYPE) {
        Object oldTASKTYPE = tASKTYPE;
        tASKTYPE = newTASKTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASKINSTANCE_TYPE__TASKTYPE, oldTASKTYPE, tASKTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TREATINPUTLINKASANDType getTREATINPUTLINKASAND() {
        return tREATINPUTLINKASAND;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTREATINPUTLINKASAND(TREATINPUTLINKASANDType newTREATINPUTLINKASAND) {
        TREATINPUTLINKASANDType oldTREATINPUTLINKASAND = tREATINPUTLINKASAND;
        tREATINPUTLINKASAND = newTREATINPUTLINKASAND == null ? TREATINPUTLINKASAND_EDEFAULT : newTREATINPUTLINKASAND;
        boolean oldTREATINPUTLINKASANDESet = tREATINPUTLINKASANDESet;
        tREATINPUTLINKASANDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASKINSTANCE_TYPE__TREATINPUTLINKASAND, oldTREATINPUTLINKASAND, tREATINPUTLINKASAND, !oldTREATINPUTLINKASANDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTREATINPUTLINKASAND() {
        TREATINPUTLINKASANDType oldTREATINPUTLINKASAND = tREATINPUTLINKASAND;
        boolean oldTREATINPUTLINKASANDESet = tREATINPUTLINKASANDESet;
        tREATINPUTLINKASAND = TREATINPUTLINKASAND_EDEFAULT;
        tREATINPUTLINKASANDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TASKINSTANCE_TYPE__TREATINPUTLINKASAND, oldTREATINPUTLINKASAND, TREATINPUTLINKASAND_EDEFAULT, oldTREATINPUTLINKASANDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTREATINPUTLINKASAND() {
        return tREATINPUTLINKASANDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.TASKINSTANCE_TYPE__ATTRIBUTE:
                return ((InternalEList<?>)getATTRIBUTE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TASKINSTANCE_TYPE__WORKFLOWVARIABLE:
                return ((InternalEList<?>)getWORKFLOWVARIABLE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TASKINSTANCE_TYPE__VALUEPAIR:
                return ((InternalEList<?>)getVALUEPAIR()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TASKINSTANCE_TYPE__CONFIGREFERENCE:
                return basicSetCONFIGREFERENCE(null, msgs);
            case PowrmartPackage.TASKINSTANCE_TYPE__SESSIONCOMPONENT:
                return ((InternalEList<?>)getSESSIONCOMPONENT()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TASKINSTANCE_TYPE__SESSIONEXTENSION:
                return ((InternalEList<?>)getSESSIONEXTENSION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TASKINSTANCE_TYPE__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TASKINSTANCE_TYPE__RESOURCEREFERENCE:
                return ((InternalEList<?>)getRESOURCEREFERENCE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TASKINSTANCE_TYPE__TRANSFORMRESOURCEREF:
                return ((InternalEList<?>)getTRANSFORMRESOURCEREF()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.TASKINSTANCE_TYPE__ATTRIBUTE:
                return getATTRIBUTE();
            case PowrmartPackage.TASKINSTANCE_TYPE__WORKFLOWVARIABLE:
                return getWORKFLOWVARIABLE();
            case PowrmartPackage.TASKINSTANCE_TYPE__VALUEPAIR:
                return getVALUEPAIR();
            case PowrmartPackage.TASKINSTANCE_TYPE__CONFIGREFERENCE:
                return getCONFIGREFERENCE();
            case PowrmartPackage.TASKINSTANCE_TYPE__SESSIONCOMPONENT:
                return getSESSIONCOMPONENT();
            case PowrmartPackage.TASKINSTANCE_TYPE__SESSIONEXTENSION:
                return getSESSIONEXTENSION();
            case PowrmartPackage.TASKINSTANCE_TYPE__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case PowrmartPackage.TASKINSTANCE_TYPE__RESOURCEREFERENCE:
                return getRESOURCEREFERENCE();
            case PowrmartPackage.TASKINSTANCE_TYPE__TRANSFORMRESOURCEREF:
                return getTRANSFORMRESOURCEREF();
            case PowrmartPackage.TASKINSTANCE_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEDIDNOTRUN:
                return getFAILPARENTIFINSTANCEDIDNOTRUN();
            case PowrmartPackage.TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEFAILS:
                return getFAILPARENTIFINSTANCEFAILS();
            case PowrmartPackage.TASKINSTANCE_TYPE__ISENABLED:
                return getISENABLED();
            case PowrmartPackage.TASKINSTANCE_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.TASKINSTANCE_TYPE__REUSABLE:
                return getREUSABLE();
            case PowrmartPackage.TASKINSTANCE_TYPE__SERVEROVERRIDE:
                return getSERVEROVERRIDE();
            case PowrmartPackage.TASKINSTANCE_TYPE__TASKNAME:
                return getTASKNAME();
            case PowrmartPackage.TASKINSTANCE_TYPE__TASKTYPE:
                return getTASKTYPE();
            case PowrmartPackage.TASKINSTANCE_TYPE__TREATINPUTLINKASAND:
                return getTREATINPUTLINKASAND();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PowrmartPackage.TASKINSTANCE_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                getATTRIBUTE().addAll((Collection<? extends ATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__WORKFLOWVARIABLE:
                getWORKFLOWVARIABLE().clear();
                getWORKFLOWVARIABLE().addAll((Collection<? extends WORKFLOWVARIABLEType>)newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__VALUEPAIR:
                getVALUEPAIR().clear();
                getVALUEPAIR().addAll((Collection<? extends VALUEPAIRType>)newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__CONFIGREFERENCE:
                setCONFIGREFERENCE((CONFIGREFERENCEType)newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__SESSIONCOMPONENT:
                getSESSIONCOMPONENT().clear();
                getSESSIONCOMPONENT().addAll((Collection<? extends SESSIONCOMPONENTType>)newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__SESSIONEXTENSION:
                getSESSIONEXTENSION().clear();
                getSESSIONEXTENSION().addAll((Collection<? extends SESSIONEXTENSIONType>)newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__RESOURCEREFERENCE:
                getRESOURCEREFERENCE().clear();
                getRESOURCEREFERENCE().addAll((Collection<? extends RESOURCEREFERENCEType>)newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__TRANSFORMRESOURCEREF:
                getTRANSFORMRESOURCEREF().clear();
                getTRANSFORMRESOURCEREF().addAll((Collection<? extends TRANSFORMRESOURCEREFType>)newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEDIDNOTRUN:
                setFAILPARENTIFINSTANCEDIDNOTRUN((FAILPARENTIFINSTANCEDIDNOTRUNType)newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEFAILS:
                setFAILPARENTIFINSTANCEFAILS((FAILPARENTIFINSTANCEFAILSType)newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__ISENABLED:
                setISENABLED((ISENABLEDType1)newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__REUSABLE:
                setREUSABLE((REUSABLEType2)newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__SERVEROVERRIDE:
                setSERVEROVERRIDE(newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__TASKNAME:
                setTASKNAME(newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__TASKTYPE:
                setTASKTYPE(newValue);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__TREATINPUTLINKASAND:
                setTREATINPUTLINKASAND((TREATINPUTLINKASANDType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PowrmartPackage.TASKINSTANCE_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__WORKFLOWVARIABLE:
                getWORKFLOWVARIABLE().clear();
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__VALUEPAIR:
                getVALUEPAIR().clear();
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__CONFIGREFERENCE:
                setCONFIGREFERENCE((CONFIGREFERENCEType)null);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__SESSIONCOMPONENT:
                getSESSIONCOMPONENT().clear();
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__SESSIONEXTENSION:
                getSESSIONEXTENSION().clear();
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__GROUP:
                getGroup().clear();
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__RESOURCEREFERENCE:
                getRESOURCEREFERENCE().clear();
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__TRANSFORMRESOURCEREF:
                getTRANSFORMRESOURCEREF().clear();
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEDIDNOTRUN:
                unsetFAILPARENTIFINSTANCEDIDNOTRUN();
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEFAILS:
                unsetFAILPARENTIFINSTANCEFAILS();
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__ISENABLED:
                unsetISENABLED();
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__REUSABLE:
                unsetREUSABLE();
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__SERVEROVERRIDE:
                setSERVEROVERRIDE(SERVEROVERRIDE_EDEFAULT);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__TASKNAME:
                setTASKNAME(TASKNAME_EDEFAULT);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__TASKTYPE:
                setTASKTYPE(TASKTYPE_EDEFAULT);
                return;
            case PowrmartPackage.TASKINSTANCE_TYPE__TREATINPUTLINKASAND:
                unsetTREATINPUTLINKASAND();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PowrmartPackage.TASKINSTANCE_TYPE__ATTRIBUTE:
                return aTTRIBUTE != null && !aTTRIBUTE.isEmpty();
            case PowrmartPackage.TASKINSTANCE_TYPE__WORKFLOWVARIABLE:
                return wORKFLOWVARIABLE != null && !wORKFLOWVARIABLE.isEmpty();
            case PowrmartPackage.TASKINSTANCE_TYPE__VALUEPAIR:
                return vALUEPAIR != null && !vALUEPAIR.isEmpty();
            case PowrmartPackage.TASKINSTANCE_TYPE__CONFIGREFERENCE:
                return cONFIGREFERENCE != null;
            case PowrmartPackage.TASKINSTANCE_TYPE__SESSIONCOMPONENT:
                return sESSIONCOMPONENT != null && !sESSIONCOMPONENT.isEmpty();
            case PowrmartPackage.TASKINSTANCE_TYPE__SESSIONEXTENSION:
                return sESSIONEXTENSION != null && !sESSIONEXTENSION.isEmpty();
            case PowrmartPackage.TASKINSTANCE_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case PowrmartPackage.TASKINSTANCE_TYPE__RESOURCEREFERENCE:
                return !getRESOURCEREFERENCE().isEmpty();
            case PowrmartPackage.TASKINSTANCE_TYPE__TRANSFORMRESOURCEREF:
                return !getTRANSFORMRESOURCEREF().isEmpty();
            case PowrmartPackage.TASKINSTANCE_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEDIDNOTRUN:
                return isSetFAILPARENTIFINSTANCEDIDNOTRUN();
            case PowrmartPackage.TASKINSTANCE_TYPE__FAILPARENTIFINSTANCEFAILS:
                return isSetFAILPARENTIFINSTANCEFAILS();
            case PowrmartPackage.TASKINSTANCE_TYPE__ISENABLED:
                return isSetISENABLED();
            case PowrmartPackage.TASKINSTANCE_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.TASKINSTANCE_TYPE__REUSABLE:
                return isSetREUSABLE();
            case PowrmartPackage.TASKINSTANCE_TYPE__SERVEROVERRIDE:
                return SERVEROVERRIDE_EDEFAULT == null ? sERVEROVERRIDE != null : !SERVEROVERRIDE_EDEFAULT.equals(sERVEROVERRIDE);
            case PowrmartPackage.TASKINSTANCE_TYPE__TASKNAME:
                return TASKNAME_EDEFAULT == null ? tASKNAME != null : !TASKNAME_EDEFAULT.equals(tASKNAME);
            case PowrmartPackage.TASKINSTANCE_TYPE__TASKTYPE:
                return TASKTYPE_EDEFAULT == null ? tASKTYPE != null : !TASKTYPE_EDEFAULT.equals(tASKTYPE);
            case PowrmartPackage.TASKINSTANCE_TYPE__TREATINPUTLINKASAND:
                return isSetTREATINPUTLINKASAND();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (group: ");
        result.append(group);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", fAILPARENTIFINSTANCEDIDNOTRUN: ");
        if (fAILPARENTIFINSTANCEDIDNOTRUNESet) result.append(fAILPARENTIFINSTANCEDIDNOTRUN); else result.append("<unset>");
        result.append(", fAILPARENTIFINSTANCEFAILS: ");
        if (fAILPARENTIFINSTANCEFAILSESet) result.append(fAILPARENTIFINSTANCEFAILS); else result.append("<unset>");
        result.append(", iSENABLED: ");
        if (iSENABLEDESet) result.append(iSENABLED); else result.append("<unset>");
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", rEUSABLE: ");
        if (rEUSABLEESet) result.append(rEUSABLE); else result.append("<unset>");
        result.append(", sERVEROVERRIDE: ");
        result.append(sERVEROVERRIDE);
        result.append(", tASKNAME: ");
        result.append(tASKNAME);
        result.append(", tASKTYPE: ");
        result.append(tASKTYPE);
        result.append(", tREATINPUTLINKASAND: ");
        if (tREATINPUTLINKASANDESet) result.append(tREATINPUTLINKASAND); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TASKINSTANCETypeImpl
