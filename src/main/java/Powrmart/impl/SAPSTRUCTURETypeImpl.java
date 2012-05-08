/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SAPSTRUCTUREFIELDType;
import Powrmart.SAPSTRUCTUREType;

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
 * An implementation of the model object '<em><b>SAPSTRUCTURE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SAPSTRUCTURETypeImpl#getSAPSTRUCTUREFIELD <em>SAPSTRUCTUREFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.SAPSTRUCTURETypeImpl#getNAME <em>NAME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPSTRUCTURETypeImpl extends EObjectImpl implements SAPSTRUCTUREType {
    /**
     * The cached value of the '{@link #getSAPSTRUCTUREFIELD() <em>SAPSTRUCTUREFIELD</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAPSTRUCTUREFIELD()
     * @generated
     * @ordered
     */
    protected EList<SAPSTRUCTUREFIELDType> sAPSTRUCTUREFIELD;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPSTRUCTURETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSAPSTRUCTUREType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SAPSTRUCTUREFIELDType> getSAPSTRUCTUREFIELD() {
        if (sAPSTRUCTUREFIELD == null) {
            sAPSTRUCTUREFIELD = new EObjectContainmentEList<SAPSTRUCTUREFIELDType>(SAPSTRUCTUREFIELDType.class, this, PowrmartPackage.SAPSTRUCTURE_TYPE__SAPSTRUCTUREFIELD);
        }
        return sAPSTRUCTUREFIELD;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPSTRUCTURE_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SAPSTRUCTURE_TYPE__SAPSTRUCTUREFIELD:
                return ((InternalEList<?>)getSAPSTRUCTUREFIELD()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.SAPSTRUCTURE_TYPE__SAPSTRUCTUREFIELD:
                return getSAPSTRUCTUREFIELD();
            case PowrmartPackage.SAPSTRUCTURE_TYPE__NAME:
                return getNAME();
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
            case PowrmartPackage.SAPSTRUCTURE_TYPE__SAPSTRUCTUREFIELD:
                getSAPSTRUCTUREFIELD().clear();
                getSAPSTRUCTUREFIELD().addAll((Collection<? extends SAPSTRUCTUREFIELDType>)newValue);
                return;
            case PowrmartPackage.SAPSTRUCTURE_TYPE__NAME:
                setNAME(newValue);
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
            case PowrmartPackage.SAPSTRUCTURE_TYPE__SAPSTRUCTUREFIELD:
                getSAPSTRUCTUREFIELD().clear();
                return;
            case PowrmartPackage.SAPSTRUCTURE_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
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
            case PowrmartPackage.SAPSTRUCTURE_TYPE__SAPSTRUCTUREFIELD:
                return sAPSTRUCTUREFIELD != null && !sAPSTRUCTUREFIELD.isEmpty();
            case PowrmartPackage.SAPSTRUCTURE_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
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
        result.append(" (nAME: ");
        result.append(nAME);
        result.append(')');
        return result.toString();
    }

} //SAPSTRUCTURETypeImpl
