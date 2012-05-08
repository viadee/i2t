/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ATTRIBUTEType;
import Powrmart.CONNECTIONREFERENCEType;
import Powrmart.PowrmartPackage;
import Powrmart.SESSIONEXTENSIONType;

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
 * An implementation of the model object '<em><b>SESSIONEXTENSION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SESSIONEXTENSIONTypeImpl#getCONNECTIONREFERENCE <em>CONNECTIONREFERENCE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONEXTENSIONTypeImpl#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONEXTENSIONTypeImpl#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONEXTENSIONTypeImpl#getDSQINSTNAME <em>DSQINSTNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONEXTENSIONTypeImpl#getDSQINSTTYPE <em>DSQINSTTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONEXTENSIONTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONEXTENSIONTypeImpl#getSINSTANCENAME <em>SINSTANCENAME</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONEXTENSIONTypeImpl#getSUBTYPE <em>SUBTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONEXTENSIONTypeImpl#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONEXTENSIONTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SESSIONEXTENSIONTypeImpl extends EObjectImpl implements SESSIONEXTENSIONType {
    /**
     * The cached value of the '{@link #getCONNECTIONREFERENCE() <em>CONNECTIONREFERENCE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTIONREFERENCE()
     * @generated
     * @ordered
     */
    protected EList<CONNECTIONREFERENCEType> cONNECTIONREFERENCE;

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
     * The default value of the '{@link #getCOMPONENTVERSION() <em>COMPONENTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMPONENTVERSION()
     * @generated
     * @ordered
     */
    protected static final Object COMPONENTVERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCOMPONENTVERSION() <em>COMPONENTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMPONENTVERSION()
     * @generated
     * @ordered
     */
    protected Object cOMPONENTVERSION = COMPONENTVERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getDSQINSTNAME() <em>DSQINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDSQINSTNAME()
     * @generated
     * @ordered
     */
    protected static final Object DSQINSTNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDSQINSTNAME() <em>DSQINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDSQINSTNAME()
     * @generated
     * @ordered
     */
    protected Object dSQINSTNAME = DSQINSTNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getDSQINSTTYPE() <em>DSQINSTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDSQINSTTYPE()
     * @generated
     * @ordered
     */
    protected static final Object DSQINSTTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDSQINSTTYPE() <em>DSQINSTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDSQINSTTYPE()
     * @generated
     * @ordered
     */
    protected Object dSQINSTTYPE = DSQINSTTYPE_EDEFAULT;

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
     * The default value of the '{@link #getSINSTANCENAME() <em>SINSTANCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSINSTANCENAME()
     * @generated
     * @ordered
     */
    protected static final Object SINSTANCENAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSINSTANCENAME() <em>SINSTANCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSINSTANCENAME()
     * @generated
     * @ordered
     */
    protected Object sINSTANCENAME = SINSTANCENAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSUBTYPE() <em>SUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSUBTYPE()
     * @generated
     * @ordered
     */
    protected static final Object SUBTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSUBTYPE() <em>SUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSUBTYPE()
     * @generated
     * @ordered
     */
    protected Object sUBTYPE = SUBTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getTRANSFORMATIONTYPE() <em>TRANSFORMATIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTRANSFORMATIONTYPE()
     * @generated
     * @ordered
     */
    protected static final Object TRANSFORMATIONTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTRANSFORMATIONTYPE() <em>TRANSFORMATIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTRANSFORMATIONTYPE()
     * @generated
     * @ordered
     */
    protected Object tRANSFORMATIONTYPE = TRANSFORMATIONTYPE_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SESSIONEXTENSIONTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSESSIONEXTENSIONType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CONNECTIONREFERENCEType> getCONNECTIONREFERENCE() {
        if (cONNECTIONREFERENCE == null) {
            cONNECTIONREFERENCE = new EObjectContainmentEList<CONNECTIONREFERENCEType>(CONNECTIONREFERENCEType.class, this, PowrmartPackage.SESSIONEXTENSION_TYPE__CONNECTIONREFERENCE);
        }
        return cONNECTIONREFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ATTRIBUTEType> getATTRIBUTE() {
        if (aTTRIBUTE == null) {
            aTTRIBUTE = new EObjectContainmentEList<ATTRIBUTEType>(ATTRIBUTEType.class, this, PowrmartPackage.SESSIONEXTENSION_TYPE__ATTRIBUTE);
        }
        return aTTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCOMPONENTVERSION() {
        return cOMPONENTVERSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCOMPONENTVERSION(Object newCOMPONENTVERSION) {
        Object oldCOMPONENTVERSION = cOMPONENTVERSION;
        cOMPONENTVERSION = newCOMPONENTVERSION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONEXTENSION_TYPE__COMPONENTVERSION, oldCOMPONENTVERSION, cOMPONENTVERSION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDSQINSTNAME() {
        return dSQINSTNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDSQINSTNAME(Object newDSQINSTNAME) {
        Object oldDSQINSTNAME = dSQINSTNAME;
        dSQINSTNAME = newDSQINSTNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONEXTENSION_TYPE__DSQINSTNAME, oldDSQINSTNAME, dSQINSTNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDSQINSTTYPE() {
        return dSQINSTTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDSQINSTTYPE(Object newDSQINSTTYPE) {
        Object oldDSQINSTTYPE = dSQINSTTYPE;
        dSQINSTTYPE = newDSQINSTTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONEXTENSION_TYPE__DSQINSTTYPE, oldDSQINSTTYPE, dSQINSTTYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONEXTENSION_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSINSTANCENAME() {
        return sINSTANCENAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSINSTANCENAME(Object newSINSTANCENAME) {
        Object oldSINSTANCENAME = sINSTANCENAME;
        sINSTANCENAME = newSINSTANCENAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONEXTENSION_TYPE__SINSTANCENAME, oldSINSTANCENAME, sINSTANCENAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSUBTYPE() {
        return sUBTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSUBTYPE(Object newSUBTYPE) {
        Object oldSUBTYPE = sUBTYPE;
        sUBTYPE = newSUBTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONEXTENSION_TYPE__SUBTYPE, oldSUBTYPE, sUBTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTRANSFORMATIONTYPE() {
        return tRANSFORMATIONTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTRANSFORMATIONTYPE(Object newTRANSFORMATIONTYPE) {
        Object oldTRANSFORMATIONTYPE = tRANSFORMATIONTYPE;
        tRANSFORMATIONTYPE = newTRANSFORMATIONTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONEXTENSION_TYPE__TRANSFORMATIONTYPE, oldTRANSFORMATIONTYPE, tRANSFORMATIONTYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONEXTENSION_TYPE__TYPE, oldTYPE, tYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SESSIONEXTENSION_TYPE__CONNECTIONREFERENCE:
                return ((InternalEList<?>)getCONNECTIONREFERENCE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSIONEXTENSION_TYPE__ATTRIBUTE:
                return ((InternalEList<?>)getATTRIBUTE()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.SESSIONEXTENSION_TYPE__CONNECTIONREFERENCE:
                return getCONNECTIONREFERENCE();
            case PowrmartPackage.SESSIONEXTENSION_TYPE__ATTRIBUTE:
                return getATTRIBUTE();
            case PowrmartPackage.SESSIONEXTENSION_TYPE__COMPONENTVERSION:
                return getCOMPONENTVERSION();
            case PowrmartPackage.SESSIONEXTENSION_TYPE__DSQINSTNAME:
                return getDSQINSTNAME();
            case PowrmartPackage.SESSIONEXTENSION_TYPE__DSQINSTTYPE:
                return getDSQINSTTYPE();
            case PowrmartPackage.SESSIONEXTENSION_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SESSIONEXTENSION_TYPE__SINSTANCENAME:
                return getSINSTANCENAME();
            case PowrmartPackage.SESSIONEXTENSION_TYPE__SUBTYPE:
                return getSUBTYPE();
            case PowrmartPackage.SESSIONEXTENSION_TYPE__TRANSFORMATIONTYPE:
                return getTRANSFORMATIONTYPE();
            case PowrmartPackage.SESSIONEXTENSION_TYPE__TYPE:
                return getTYPE();
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
            case PowrmartPackage.SESSIONEXTENSION_TYPE__CONNECTIONREFERENCE:
                getCONNECTIONREFERENCE().clear();
                getCONNECTIONREFERENCE().addAll((Collection<? extends CONNECTIONREFERENCEType>)newValue);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                getATTRIBUTE().addAll((Collection<? extends ATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__COMPONENTVERSION:
                setCOMPONENTVERSION(newValue);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__DSQINSTNAME:
                setDSQINSTNAME(newValue);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__DSQINSTTYPE:
                setDSQINSTTYPE(newValue);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__SINSTANCENAME:
                setSINSTANCENAME(newValue);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__SUBTYPE:
                setSUBTYPE(newValue);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__TRANSFORMATIONTYPE:
                setTRANSFORMATIONTYPE(newValue);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__TYPE:
                setTYPE(newValue);
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
            case PowrmartPackage.SESSIONEXTENSION_TYPE__CONNECTIONREFERENCE:
                getCONNECTIONREFERENCE().clear();
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__COMPONENTVERSION:
                setCOMPONENTVERSION(COMPONENTVERSION_EDEFAULT);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__DSQINSTNAME:
                setDSQINSTNAME(DSQINSTNAME_EDEFAULT);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__DSQINSTTYPE:
                setDSQINSTTYPE(DSQINSTTYPE_EDEFAULT);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__SINSTANCENAME:
                setSINSTANCENAME(SINSTANCENAME_EDEFAULT);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__SUBTYPE:
                setSUBTYPE(SUBTYPE_EDEFAULT);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__TRANSFORMATIONTYPE:
                setTRANSFORMATIONTYPE(TRANSFORMATIONTYPE_EDEFAULT);
                return;
            case PowrmartPackage.SESSIONEXTENSION_TYPE__TYPE:
                setTYPE(TYPE_EDEFAULT);
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
            case PowrmartPackage.SESSIONEXTENSION_TYPE__CONNECTIONREFERENCE:
                return cONNECTIONREFERENCE != null && !cONNECTIONREFERENCE.isEmpty();
            case PowrmartPackage.SESSIONEXTENSION_TYPE__ATTRIBUTE:
                return aTTRIBUTE != null && !aTTRIBUTE.isEmpty();
            case PowrmartPackage.SESSIONEXTENSION_TYPE__COMPONENTVERSION:
                return COMPONENTVERSION_EDEFAULT == null ? cOMPONENTVERSION != null : !COMPONENTVERSION_EDEFAULT.equals(cOMPONENTVERSION);
            case PowrmartPackage.SESSIONEXTENSION_TYPE__DSQINSTNAME:
                return DSQINSTNAME_EDEFAULT == null ? dSQINSTNAME != null : !DSQINSTNAME_EDEFAULT.equals(dSQINSTNAME);
            case PowrmartPackage.SESSIONEXTENSION_TYPE__DSQINSTTYPE:
                return DSQINSTTYPE_EDEFAULT == null ? dSQINSTTYPE != null : !DSQINSTTYPE_EDEFAULT.equals(dSQINSTTYPE);
            case PowrmartPackage.SESSIONEXTENSION_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SESSIONEXTENSION_TYPE__SINSTANCENAME:
                return SINSTANCENAME_EDEFAULT == null ? sINSTANCENAME != null : !SINSTANCENAME_EDEFAULT.equals(sINSTANCENAME);
            case PowrmartPackage.SESSIONEXTENSION_TYPE__SUBTYPE:
                return SUBTYPE_EDEFAULT == null ? sUBTYPE != null : !SUBTYPE_EDEFAULT.equals(sUBTYPE);
            case PowrmartPackage.SESSIONEXTENSION_TYPE__TRANSFORMATIONTYPE:
                return TRANSFORMATIONTYPE_EDEFAULT == null ? tRANSFORMATIONTYPE != null : !TRANSFORMATIONTYPE_EDEFAULT.equals(tRANSFORMATIONTYPE);
            case PowrmartPackage.SESSIONEXTENSION_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? tYPE != null : !TYPE_EDEFAULT.equals(tYPE);
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
        result.append(" (cOMPONENTVERSION: ");
        result.append(cOMPONENTVERSION);
        result.append(", dSQINSTNAME: ");
        result.append(dSQINSTNAME);
        result.append(", dSQINSTTYPE: ");
        result.append(dSQINSTTYPE);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", sINSTANCENAME: ");
        result.append(sINSTANCENAME);
        result.append(", sUBTYPE: ");
        result.append(sUBTYPE);
        result.append(", tRANSFORMATIONTYPE: ");
        result.append(tRANSFORMATIONTYPE);
        result.append(", tYPE: ");
        result.append(tYPE);
        result.append(')');
        return result.toString();
    }

} //SESSIONEXTENSIONTypeImpl
