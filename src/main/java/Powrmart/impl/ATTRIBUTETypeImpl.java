/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ATTRIBUTEType;
import Powrmart.PowrmartPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATTRIBUTE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.ATTRIBUTETypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.ATTRIBUTETypeImpl#getPARTITIONNAME <em>PARTITIONNAME</em>}</li>
 *   <li>{@link Powrmart.impl.ATTRIBUTETypeImpl#getVALUE <em>VALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATTRIBUTETypeImpl extends EObjectImpl implements ATTRIBUTEType {
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
     * The default value of the '{@link #getPARTITIONNAME() <em>PARTITIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARTITIONNAME()
     * @generated
     * @ordered
     */
    protected static final Object PARTITIONNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPARTITIONNAME() <em>PARTITIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARTITIONNAME()
     * @generated
     * @ordered
     */
    protected Object pARTITIONNAME = PARTITIONNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUE()
     * @generated
     * @ordered
     */
    protected static final Object VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUE()
     * @generated
     * @ordered
     */
    protected Object vALUE = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ATTRIBUTETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getATTRIBUTEType();
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.ATTRIBUTE_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPARTITIONNAME() {
        return pARTITIONNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARTITIONNAME(Object newPARTITIONNAME) {
        Object oldPARTITIONNAME = pARTITIONNAME;
        pARTITIONNAME = newPARTITIONNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.ATTRIBUTE_TYPE__PARTITIONNAME, oldPARTITIONNAME, pARTITIONNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getVALUE() {
        return vALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVALUE(Object newVALUE) {
        Object oldVALUE = vALUE;
        vALUE = newVALUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.ATTRIBUTE_TYPE__VALUE, oldVALUE, vALUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.ATTRIBUTE_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.ATTRIBUTE_TYPE__PARTITIONNAME:
                return getPARTITIONNAME();
            case PowrmartPackage.ATTRIBUTE_TYPE__VALUE:
                return getVALUE();
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
            case PowrmartPackage.ATTRIBUTE_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.ATTRIBUTE_TYPE__PARTITIONNAME:
                setPARTITIONNAME(newValue);
                return;
            case PowrmartPackage.ATTRIBUTE_TYPE__VALUE:
                setVALUE(newValue);
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
            case PowrmartPackage.ATTRIBUTE_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.ATTRIBUTE_TYPE__PARTITIONNAME:
                setPARTITIONNAME(PARTITIONNAME_EDEFAULT);
                return;
            case PowrmartPackage.ATTRIBUTE_TYPE__VALUE:
                setVALUE(VALUE_EDEFAULT);
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
            case PowrmartPackage.ATTRIBUTE_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.ATTRIBUTE_TYPE__PARTITIONNAME:
                return PARTITIONNAME_EDEFAULT == null ? pARTITIONNAME != null : !PARTITIONNAME_EDEFAULT.equals(pARTITIONNAME);
            case PowrmartPackage.ATTRIBUTE_TYPE__VALUE:
                return VALUE_EDEFAULT == null ? vALUE != null : !VALUE_EDEFAULT.equals(vALUE);
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
        result.append(", pARTITIONNAME: ");
        result.append(pARTITIONNAME);
        result.append(", vALUE: ");
        result.append(vALUE);
        result.append(')');
        return result.toString();
    }

} //ATTRIBUTETypeImpl
