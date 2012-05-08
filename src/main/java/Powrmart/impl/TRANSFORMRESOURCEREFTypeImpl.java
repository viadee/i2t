/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.RESOURCEREFERENCEType;
import Powrmart.TRANSFORMRESOURCEREFType;

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
 * An implementation of the model object '<em><b>TRANSFORMRESOURCEREF Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.TRANSFORMRESOURCEREFTypeImpl#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMRESOURCEREFTypeImpl#getSINSTANCENAME <em>SINSTANCENAME</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMRESOURCEREFTypeImpl#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TRANSFORMRESOURCEREFTypeImpl extends EObjectImpl implements TRANSFORMRESOURCEREFType {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TRANSFORMRESOURCEREFTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getTRANSFORMRESOURCEREFType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RESOURCEREFERENCEType> getRESOURCEREFERENCE() {
        if (rESOURCEREFERENCE == null) {
            rESOURCEREFERENCE = new EObjectContainmentEList<RESOURCEREFERENCEType>(RESOURCEREFERENCEType.class, this, PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__RESOURCEREFERENCE);
        }
        return rESOURCEREFERENCE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__SINSTANCENAME, oldSINSTANCENAME, sINSTANCENAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__TRANSFORMATIONTYPE, oldTRANSFORMATIONTYPE, tRANSFORMATIONTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__RESOURCEREFERENCE:
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
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__RESOURCEREFERENCE:
                return getRESOURCEREFERENCE();
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__SINSTANCENAME:
                return getSINSTANCENAME();
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__TRANSFORMATIONTYPE:
                return getTRANSFORMATIONTYPE();
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
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__RESOURCEREFERENCE:
                getRESOURCEREFERENCE().clear();
                getRESOURCEREFERENCE().addAll((Collection<? extends RESOURCEREFERENCEType>)newValue);
                return;
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__SINSTANCENAME:
                setSINSTANCENAME(newValue);
                return;
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__TRANSFORMATIONTYPE:
                setTRANSFORMATIONTYPE(newValue);
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
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__RESOURCEREFERENCE:
                getRESOURCEREFERENCE().clear();
                return;
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__SINSTANCENAME:
                setSINSTANCENAME(SINSTANCENAME_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__TRANSFORMATIONTYPE:
                setTRANSFORMATIONTYPE(TRANSFORMATIONTYPE_EDEFAULT);
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
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__RESOURCEREFERENCE:
                return rESOURCEREFERENCE != null && !rESOURCEREFERENCE.isEmpty();
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__SINSTANCENAME:
                return SINSTANCENAME_EDEFAULT == null ? sINSTANCENAME != null : !SINSTANCENAME_EDEFAULT.equals(sINSTANCENAME);
            case PowrmartPackage.TRANSFORMRESOURCEREF_TYPE__TRANSFORMATIONTYPE:
                return TRANSFORMATIONTYPE_EDEFAULT == null ? tRANSFORMATIONTYPE != null : !TRANSFORMATIONTYPE_EDEFAULT.equals(tRANSFORMATIONTYPE);
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
        result.append(" (sINSTANCENAME: ");
        result.append(sINSTANCENAME);
        result.append(", tRANSFORMATIONTYPE: ");
        result.append(tRANSFORMATIONTYPE);
        result.append(')');
        return result.toString();
    }

} //TRANSFORMRESOURCEREFTypeImpl
