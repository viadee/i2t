/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ATTRIBUTEType;
import Powrmart.EXPRMACRODEPENDENCYType;
import Powrmart.PARENTTYPEType2;
import Powrmart.PowrmartPackage;
import Powrmart.RESOURCEREFERENCEType;
import Powrmart.REUSABLEType;
import Powrmart.TASKType;
import Powrmart.TIMERType;
import Powrmart.VALUEPAIRType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TASK Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.TASKTypeImpl#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.TASKTypeImpl#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.impl.TASKTypeImpl#getTIMER <em>TIMER</em>}</li>
 *   <li>{@link Powrmart.impl.TASKTypeImpl#getVALUEPAIR <em>VALUEPAIR</em>}</li>
 *   <li>{@link Powrmart.impl.TASKTypeImpl#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}</li>
 *   <li>{@link Powrmart.impl.TASKTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.TASKTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.TASKTypeImpl#getPARENT <em>PARENT</em>}</li>
 *   <li>{@link Powrmart.impl.TASKTypeImpl#getPARENTTYPE <em>PARENTTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TASKTypeImpl#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.impl.TASKTypeImpl#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TASKTypeImpl#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TASKTypeImpl extends EObjectImpl implements TASKType {
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
     * The cached value of the '{@link #getEXPRMACRODEPENDENCY() <em>EXPRMACRODEPENDENCY</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEXPRMACRODEPENDENCY()
     * @generated
     * @ordered
     */
    protected EList<EXPRMACRODEPENDENCYType> eXPRMACRODEPENDENCY;

    /**
     * The cached value of the '{@link #getTIMER() <em>TIMER</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTIMER()
     * @generated
     * @ordered
     */
    protected TIMERType tIMER;

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
     * The cached value of the '{@link #getRESOURCEREFERENCE() <em>RESOURCEREFERENCE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRESOURCEREFERENCE()
     * @generated
     * @ordered
     */
    protected EList<RESOURCEREFERENCEType> rESOURCEREFERENCE;

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
     * The default value of the '{@link #getPARENT() <em>PARENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENT()
     * @generated
     * @ordered
     */
    protected static final Object PARENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPARENT() <em>PARENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENT()
     * @generated
     * @ordered
     */
    protected Object pARENT = PARENT_EDEFAULT;

    /**
     * The default value of the '{@link #getPARENTTYPE() <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENTTYPE()
     * @generated
     * @ordered
     */
    protected static final PARENTTYPEType2 PARENTTYPE_EDEFAULT = PARENTTYPEType2.WORKLET;

    /**
     * The cached value of the '{@link #getPARENTTYPE() <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENTTYPE()
     * @generated
     * @ordered
     */
    protected PARENTTYPEType2 pARENTTYPE = PARENTTYPE_EDEFAULT;

    /**
     * This is true if the PARENTTYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pARENTTYPEESet;

    /**
     * The default value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected static final REUSABLEType REUSABLE_EDEFAULT = REUSABLEType.YES;

    /**
     * The cached value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected REUSABLEType rEUSABLE = REUSABLE_EDEFAULT;

    /**
     * This is true if the REUSABLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEUSABLEESet;

    /**
     * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected static final Object TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected Object tYPE = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getVERSIONNUMBER() <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVERSIONNUMBER()
     * @generated
     * @ordered
     */
    protected static final Object VERSIONNUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVERSIONNUMBER() <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVERSIONNUMBER()
     * @generated
     * @ordered
     */
    protected Object vERSIONNUMBER = VERSIONNUMBER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TASKTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getTASKType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ATTRIBUTEType> getATTRIBUTE() {
        if (aTTRIBUTE == null) {
            aTTRIBUTE = new EObjectContainmentEList<ATTRIBUTEType>(ATTRIBUTEType.class, this, PowrmartPackage.TASK_TYPE__ATTRIBUTE);
        }
        return aTTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EXPRMACRODEPENDENCYType> getEXPRMACRODEPENDENCY() {
        if (eXPRMACRODEPENDENCY == null) {
            eXPRMACRODEPENDENCY = new EObjectContainmentEList<EXPRMACRODEPENDENCYType>(EXPRMACRODEPENDENCYType.class, this, PowrmartPackage.TASK_TYPE__EXPRMACRODEPENDENCY);
        }
        return eXPRMACRODEPENDENCY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TIMERType getTIMER() {
        return tIMER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTIMER(TIMERType newTIMER, NotificationChain msgs) {
        TIMERType oldTIMER = tIMER;
        tIMER = newTIMER;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASK_TYPE__TIMER, oldTIMER, newTIMER);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTIMER(TIMERType newTIMER) {
        if (newTIMER != tIMER) {
            NotificationChain msgs = null;
            if (tIMER != null)
                msgs = ((InternalEObject)tIMER).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TASK_TYPE__TIMER, null, msgs);
            if (newTIMER != null)
                msgs = ((InternalEObject)newTIMER).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TASK_TYPE__TIMER, null, msgs);
            msgs = basicSetTIMER(newTIMER, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASK_TYPE__TIMER, newTIMER, newTIMER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VALUEPAIRType> getVALUEPAIR() {
        if (vALUEPAIR == null) {
            vALUEPAIR = new EObjectContainmentEList<VALUEPAIRType>(VALUEPAIRType.class, this, PowrmartPackage.TASK_TYPE__VALUEPAIR);
        }
        return vALUEPAIR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RESOURCEREFERENCEType> getRESOURCEREFERENCE() {
        if (rESOURCEREFERENCE == null) {
            rESOURCEREFERENCE = new EObjectContainmentEList<RESOURCEREFERENCEType>(RESOURCEREFERENCEType.class, this, PowrmartPackage.TASK_TYPE__RESOURCEREFERENCE);
        }
        return rESOURCEREFERENCE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASK_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASK_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPARENT() {
        return pARENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARENT(Object newPARENT) {
        Object oldPARENT = pARENT;
        pARENT = newPARENT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASK_TYPE__PARENT, oldPARENT, pARENT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARENTTYPEType2 getPARENTTYPE() {
        return pARENTTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARENTTYPE(PARENTTYPEType2 newPARENTTYPE) {
        PARENTTYPEType2 oldPARENTTYPE = pARENTTYPE;
        pARENTTYPE = newPARENTTYPE == null ? PARENTTYPE_EDEFAULT : newPARENTTYPE;
        boolean oldPARENTTYPEESet = pARENTTYPEESet;
        pARENTTYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASK_TYPE__PARENTTYPE, oldPARENTTYPE, pARENTTYPE, !oldPARENTTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPARENTTYPE() {
        PARENTTYPEType2 oldPARENTTYPE = pARENTTYPE;
        boolean oldPARENTTYPEESet = pARENTTYPEESet;
        pARENTTYPE = PARENTTYPE_EDEFAULT;
        pARENTTYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TASK_TYPE__PARENTTYPE, oldPARENTTYPE, PARENTTYPE_EDEFAULT, oldPARENTTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPARENTTYPE() {
        return pARENTTYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType getREUSABLE() {
        return rEUSABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREUSABLE(REUSABLEType newREUSABLE) {
        REUSABLEType oldREUSABLE = rEUSABLE;
        rEUSABLE = newREUSABLE == null ? REUSABLE_EDEFAULT : newREUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASK_TYPE__REUSABLE, oldREUSABLE, rEUSABLE, !oldREUSABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREUSABLE() {
        REUSABLEType oldREUSABLE = rEUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLE = REUSABLE_EDEFAULT;
        rEUSABLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TASK_TYPE__REUSABLE, oldREUSABLE, REUSABLE_EDEFAULT, oldREUSABLEESet));
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
    public Object getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTYPE(Object newTYPE) {
        Object oldTYPE = tYPE;
        tYPE = newTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASK_TYPE__TYPE, oldTYPE, tYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getVERSIONNUMBER() {
        return vERSIONNUMBER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVERSIONNUMBER(Object newVERSIONNUMBER) {
        Object oldVERSIONNUMBER = vERSIONNUMBER;
        vERSIONNUMBER = newVERSIONNUMBER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TASK_TYPE__VERSIONNUMBER, oldVERSIONNUMBER, vERSIONNUMBER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.TASK_TYPE__ATTRIBUTE:
                return ((InternalEList<?>)getATTRIBUTE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TASK_TYPE__EXPRMACRODEPENDENCY:
                return ((InternalEList<?>)getEXPRMACRODEPENDENCY()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TASK_TYPE__TIMER:
                return basicSetTIMER(null, msgs);
            case PowrmartPackage.TASK_TYPE__VALUEPAIR:
                return ((InternalEList<?>)getVALUEPAIR()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TASK_TYPE__RESOURCEREFERENCE:
                return ((InternalEList<?>)getRESOURCEREFERENCE()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.TASK_TYPE__ATTRIBUTE:
                return getATTRIBUTE();
            case PowrmartPackage.TASK_TYPE__EXPRMACRODEPENDENCY:
                return getEXPRMACRODEPENDENCY();
            case PowrmartPackage.TASK_TYPE__TIMER:
                return getTIMER();
            case PowrmartPackage.TASK_TYPE__VALUEPAIR:
                return getVALUEPAIR();
            case PowrmartPackage.TASK_TYPE__RESOURCEREFERENCE:
                return getRESOURCEREFERENCE();
            case PowrmartPackage.TASK_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.TASK_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.TASK_TYPE__PARENT:
                return getPARENT();
            case PowrmartPackage.TASK_TYPE__PARENTTYPE:
                return getPARENTTYPE();
            case PowrmartPackage.TASK_TYPE__REUSABLE:
                return getREUSABLE();
            case PowrmartPackage.TASK_TYPE__TYPE:
                return getTYPE();
            case PowrmartPackage.TASK_TYPE__VERSIONNUMBER:
                return getVERSIONNUMBER();
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
            case PowrmartPackage.TASK_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                getATTRIBUTE().addAll((Collection<? extends ATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.TASK_TYPE__EXPRMACRODEPENDENCY:
                getEXPRMACRODEPENDENCY().clear();
                getEXPRMACRODEPENDENCY().addAll((Collection<? extends EXPRMACRODEPENDENCYType>)newValue);
                return;
            case PowrmartPackage.TASK_TYPE__TIMER:
                setTIMER((TIMERType)newValue);
                return;
            case PowrmartPackage.TASK_TYPE__VALUEPAIR:
                getVALUEPAIR().clear();
                getVALUEPAIR().addAll((Collection<? extends VALUEPAIRType>)newValue);
                return;
            case PowrmartPackage.TASK_TYPE__RESOURCEREFERENCE:
                getRESOURCEREFERENCE().clear();
                getRESOURCEREFERENCE().addAll((Collection<? extends RESOURCEREFERENCEType>)newValue);
                return;
            case PowrmartPackage.TASK_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.TASK_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.TASK_TYPE__PARENT:
                setPARENT(newValue);
                return;
            case PowrmartPackage.TASK_TYPE__PARENTTYPE:
                setPARENTTYPE((PARENTTYPEType2)newValue);
                return;
            case PowrmartPackage.TASK_TYPE__REUSABLE:
                setREUSABLE((REUSABLEType)newValue);
                return;
            case PowrmartPackage.TASK_TYPE__TYPE:
                setTYPE(newValue);
                return;
            case PowrmartPackage.TASK_TYPE__VERSIONNUMBER:
                setVERSIONNUMBER(newValue);
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
            case PowrmartPackage.TASK_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                return;
            case PowrmartPackage.TASK_TYPE__EXPRMACRODEPENDENCY:
                getEXPRMACRODEPENDENCY().clear();
                return;
            case PowrmartPackage.TASK_TYPE__TIMER:
                setTIMER((TIMERType)null);
                return;
            case PowrmartPackage.TASK_TYPE__VALUEPAIR:
                getVALUEPAIR().clear();
                return;
            case PowrmartPackage.TASK_TYPE__RESOURCEREFERENCE:
                getRESOURCEREFERENCE().clear();
                return;
            case PowrmartPackage.TASK_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.TASK_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.TASK_TYPE__PARENT:
                setPARENT(PARENT_EDEFAULT);
                return;
            case PowrmartPackage.TASK_TYPE__PARENTTYPE:
                unsetPARENTTYPE();
                return;
            case PowrmartPackage.TASK_TYPE__REUSABLE:
                unsetREUSABLE();
                return;
            case PowrmartPackage.TASK_TYPE__TYPE:
                setTYPE(TYPE_EDEFAULT);
                return;
            case PowrmartPackage.TASK_TYPE__VERSIONNUMBER:
                setVERSIONNUMBER(VERSIONNUMBER_EDEFAULT);
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
            case PowrmartPackage.TASK_TYPE__ATTRIBUTE:
                return aTTRIBUTE != null && !aTTRIBUTE.isEmpty();
            case PowrmartPackage.TASK_TYPE__EXPRMACRODEPENDENCY:
                return eXPRMACRODEPENDENCY != null && !eXPRMACRODEPENDENCY.isEmpty();
            case PowrmartPackage.TASK_TYPE__TIMER:
                return tIMER != null;
            case PowrmartPackage.TASK_TYPE__VALUEPAIR:
                return vALUEPAIR != null && !vALUEPAIR.isEmpty();
            case PowrmartPackage.TASK_TYPE__RESOURCEREFERENCE:
                return rESOURCEREFERENCE != null && !rESOURCEREFERENCE.isEmpty();
            case PowrmartPackage.TASK_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.TASK_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.TASK_TYPE__PARENT:
                return PARENT_EDEFAULT == null ? pARENT != null : !PARENT_EDEFAULT.equals(pARENT);
            case PowrmartPackage.TASK_TYPE__PARENTTYPE:
                return isSetPARENTTYPE();
            case PowrmartPackage.TASK_TYPE__REUSABLE:
                return isSetREUSABLE();
            case PowrmartPackage.TASK_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? tYPE != null : !TYPE_EDEFAULT.equals(tYPE);
            case PowrmartPackage.TASK_TYPE__VERSIONNUMBER:
                return VERSIONNUMBER_EDEFAULT == null ? vERSIONNUMBER != null : !VERSIONNUMBER_EDEFAULT.equals(vERSIONNUMBER);
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
        result.append(" (dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", pARENT: ");
        result.append(pARENT);
        result.append(", pARENTTYPE: ");
        if (pARENTTYPEESet) result.append(pARENTTYPE); else result.append("<unset>");
        result.append(", rEUSABLE: ");
        if (rEUSABLEESet) result.append(rEUSABLE); else result.append("<unset>");
        result.append(", tYPE: ");
        result.append(tYPE);
        result.append(", vERSIONNUMBER: ");
        result.append(vERSIONNUMBER);
        result.append(')');
        return result.toString();
    }

} //TASKTypeImpl
