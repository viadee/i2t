/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.TARGETINDEXFIELDType;
import Powrmart.TARGETINDEXType;

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
 * An implementation of the model object '<em><b>TARGETINDEX Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.TARGETINDEXTypeImpl#getTARGETINDEXFIELD <em>TARGETINDEXFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETINDEXTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETINDEXTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETINDEXTypeImpl#getUNIQUE <em>UNIQUE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TARGETINDEXTypeImpl extends EObjectImpl implements TARGETINDEXType {
    /**
     * The cached value of the '{@link #getTARGETINDEXFIELD() <em>TARGETINDEXFIELD</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTARGETINDEXFIELD()
     * @generated
     * @ordered
     */
    protected EList<TARGETINDEXFIELDType> tARGETINDEXFIELD;

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
     * The default value of the '{@link #getUNIQUE() <em>UNIQUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUNIQUE()
     * @generated
     * @ordered
     */
    protected static final Object UNIQUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUNIQUE() <em>UNIQUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUNIQUE()
     * @generated
     * @ordered
     */
    protected Object uNIQUE = UNIQUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TARGETINDEXTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getTARGETINDEXType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TARGETINDEXFIELDType> getTARGETINDEXFIELD() {
        if (tARGETINDEXFIELD == null) {
            tARGETINDEXFIELD = new EObjectContainmentEList<TARGETINDEXFIELDType>(TARGETINDEXFIELDType.class, this, PowrmartPackage.TARGETINDEX_TYPE__TARGETINDEXFIELD);
        }
        return tARGETINDEXFIELD;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETINDEX_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETINDEX_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getUNIQUE() {
        return uNIQUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUNIQUE(Object newUNIQUE) {
        Object oldUNIQUE = uNIQUE;
        uNIQUE = newUNIQUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETINDEX_TYPE__UNIQUE, oldUNIQUE, uNIQUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.TARGETINDEX_TYPE__TARGETINDEXFIELD:
                return ((InternalEList<?>)getTARGETINDEXFIELD()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.TARGETINDEX_TYPE__TARGETINDEXFIELD:
                return getTARGETINDEXFIELD();
            case PowrmartPackage.TARGETINDEX_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.TARGETINDEX_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.TARGETINDEX_TYPE__UNIQUE:
                return getUNIQUE();
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
            case PowrmartPackage.TARGETINDEX_TYPE__TARGETINDEXFIELD:
                getTARGETINDEXFIELD().clear();
                getTARGETINDEXFIELD().addAll((Collection<? extends TARGETINDEXFIELDType>)newValue);
                return;
            case PowrmartPackage.TARGETINDEX_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.TARGETINDEX_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.TARGETINDEX_TYPE__UNIQUE:
                setUNIQUE(newValue);
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
            case PowrmartPackage.TARGETINDEX_TYPE__TARGETINDEXFIELD:
                getTARGETINDEXFIELD().clear();
                return;
            case PowrmartPackage.TARGETINDEX_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.TARGETINDEX_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.TARGETINDEX_TYPE__UNIQUE:
                setUNIQUE(UNIQUE_EDEFAULT);
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
            case PowrmartPackage.TARGETINDEX_TYPE__TARGETINDEXFIELD:
                return tARGETINDEXFIELD != null && !tARGETINDEXFIELD.isEmpty();
            case PowrmartPackage.TARGETINDEX_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.TARGETINDEX_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.TARGETINDEX_TYPE__UNIQUE:
                return UNIQUE_EDEFAULT == null ? uNIQUE != null : !UNIQUE_EDEFAULT.equals(uNIQUE);
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
        result.append(", uNIQUE: ");
        result.append(uNIQUE);
        result.append(')');
        return result.toString();
    }

} //TARGETINDEXTypeImpl
