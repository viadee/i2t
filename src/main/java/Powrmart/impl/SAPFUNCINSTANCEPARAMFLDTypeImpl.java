/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SAPFUNCINSTANCEPARAMFLDType;
import Powrmart.VALUETYPEType2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAPFUNCINSTANCEPARAMFLD Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SAPFUNCINSTANCEPARAMFLDTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCINSTANCEPARAMFLDTypeImpl#getVALUE <em>VALUE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCINSTANCEPARAMFLDTypeImpl#getVALUETYPE <em>VALUETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPFUNCINSTANCEPARAMFLDTypeImpl extends EObjectImpl implements SAPFUNCINSTANCEPARAMFLDType {
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
     * The default value of the '{@link #getVALUETYPE() <em>VALUETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUETYPE()
     * @generated
     * @ordered
     */
    protected static final VALUETYPEType2 VALUETYPE_EDEFAULT = VALUETYPEType2.CONSTANT;

    /**
     * The cached value of the '{@link #getVALUETYPE() <em>VALUETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUETYPE()
     * @generated
     * @ordered
     */
    protected VALUETYPEType2 vALUETYPE = VALUETYPE_EDEFAULT;

    /**
     * This is true if the VALUETYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vALUETYPEESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPFUNCINSTANCEPARAMFLDTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSAPFUNCINSTANCEPARAMFLDType();
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__NAME, oldNAME, nAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__VALUE, oldVALUE, vALUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VALUETYPEType2 getVALUETYPE() {
        return vALUETYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVALUETYPE(VALUETYPEType2 newVALUETYPE) {
        VALUETYPEType2 oldVALUETYPE = vALUETYPE;
        vALUETYPE = newVALUETYPE == null ? VALUETYPE_EDEFAULT : newVALUETYPE;
        boolean oldVALUETYPEESet = vALUETYPEESet;
        vALUETYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__VALUETYPE, oldVALUETYPE, vALUETYPE, !oldVALUETYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVALUETYPE() {
        VALUETYPEType2 oldVALUETYPE = vALUETYPE;
        boolean oldVALUETYPEESet = vALUETYPEESet;
        vALUETYPE = VALUETYPE_EDEFAULT;
        vALUETYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__VALUETYPE, oldVALUETYPE, VALUETYPE_EDEFAULT, oldVALUETYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVALUETYPE() {
        return vALUETYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__VALUE:
                return getVALUE();
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__VALUETYPE:
                return getVALUETYPE();
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
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__VALUE:
                setVALUE(newValue);
                return;
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__VALUETYPE:
                setVALUETYPE((VALUETYPEType2)newValue);
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
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__VALUE:
                setVALUE(VALUE_EDEFAULT);
                return;
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__VALUETYPE:
                unsetVALUETYPE();
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
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__VALUE:
                return VALUE_EDEFAULT == null ? vALUE != null : !VALUE_EDEFAULT.equals(vALUE);
            case PowrmartPackage.SAPFUNCINSTANCEPARAMFLD_TYPE__VALUETYPE:
                return isSetVALUETYPE();
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
        result.append(", vALUE: ");
        result.append(vALUE);
        result.append(", vALUETYPE: ");
        if (vALUETYPEESet) result.append(vALUETYPE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //SAPFUNCINSTANCEPARAMFLDTypeImpl
