/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SESSTRANSFORMATIONGROUPType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SESSTRANSFORMATIONGROUP Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONGROUPTypeImpl#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONGROUPTypeImpl#getPARTITIONTYPE <em>PARTITIONTYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SESSTRANSFORMATIONGROUPTypeImpl extends EObjectImpl implements SESSTRANSFORMATIONGROUPType {
    /**
     * The default value of the '{@link #getGROUP() <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGROUP()
     * @generated
     * @ordered
     */
    protected static final Object GROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGROUP() <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGROUP()
     * @generated
     * @ordered
     */
    protected Object gROUP = GROUP_EDEFAULT;

    /**
     * The default value of the '{@link #getPARTITIONTYPE() <em>PARTITIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARTITIONTYPE()
     * @generated
     * @ordered
     */
    protected static final Object PARTITIONTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPARTITIONTYPE() <em>PARTITIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARTITIONTYPE()
     * @generated
     * @ordered
     */
    protected Object pARTITIONTYPE = PARTITIONTYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SESSTRANSFORMATIONGROUPTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSESSTRANSFORMATIONGROUPType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getGROUP() {
        return gROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGROUP(Object newGROUP) {
        Object oldGROUP = gROUP;
        gROUP = newGROUP;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSTRANSFORMATIONGROUP_TYPE__GROUP, oldGROUP, gROUP));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPARTITIONTYPE() {
        return pARTITIONTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARTITIONTYPE(Object newPARTITIONTYPE) {
        Object oldPARTITIONTYPE = pARTITIONTYPE;
        pARTITIONTYPE = newPARTITIONTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSTRANSFORMATIONGROUP_TYPE__PARTITIONTYPE, oldPARTITIONTYPE, pARTITIONTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SESSTRANSFORMATIONGROUP_TYPE__GROUP:
                return getGROUP();
            case PowrmartPackage.SESSTRANSFORMATIONGROUP_TYPE__PARTITIONTYPE:
                return getPARTITIONTYPE();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PowrmartPackage.SESSTRANSFORMATIONGROUP_TYPE__GROUP:
                setGROUP(newValue);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONGROUP_TYPE__PARTITIONTYPE:
                setPARTITIONTYPE(newValue);
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
            case PowrmartPackage.SESSTRANSFORMATIONGROUP_TYPE__GROUP:
                setGROUP(GROUP_EDEFAULT);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONGROUP_TYPE__PARTITIONTYPE:
                setPARTITIONTYPE(PARTITIONTYPE_EDEFAULT);
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
            case PowrmartPackage.SESSTRANSFORMATIONGROUP_TYPE__GROUP:
                return GROUP_EDEFAULT == null ? gROUP != null : !GROUP_EDEFAULT.equals(gROUP);
            case PowrmartPackage.SESSTRANSFORMATIONGROUP_TYPE__PARTITIONTYPE:
                return PARTITIONTYPE_EDEFAULT == null ? pARTITIONTYPE != null : !PARTITIONTYPE_EDEFAULT.equals(pARTITIONTYPE);
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
        result.append(" (gROUP: ");
        result.append(gROUP);
        result.append(", pARTITIONTYPE: ");
        result.append(pARTITIONTYPE);
        result.append(')');
        return result.toString();
    }

} //SESSTRANSFORMATIONGROUPTypeImpl
