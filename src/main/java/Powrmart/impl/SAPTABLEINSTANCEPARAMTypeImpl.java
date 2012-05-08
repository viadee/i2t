/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SAPFUNCINSTANCEPARAMFLDType;
import Powrmart.SAPTABLEINSTANCEPARAMType;
import Powrmart.TYPEType7;
import Powrmart.VALUETYPEType1;

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
 * An implementation of the model object '<em><b>SAPTABLEINSTANCEPARAM Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SAPTABLEINSTANCEPARAMTypeImpl#getSAPFUNCINSTANCEPARAMFLD <em>SAPFUNCINSTANCEPARAMFLD</em>}</li>
 *   <li>{@link Powrmart.impl.SAPTABLEINSTANCEPARAMTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPTABLEINSTANCEPARAMTypeImpl#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPTABLEINSTANCEPARAMTypeImpl#getVALUE <em>VALUE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPTABLEINSTANCEPARAMTypeImpl#getVALUETYPE <em>VALUETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPTABLEINSTANCEPARAMTypeImpl extends EObjectImpl implements SAPTABLEINSTANCEPARAMType {
    /**
     * The cached value of the '{@link #getSAPFUNCINSTANCEPARAMFLD() <em>SAPFUNCINSTANCEPARAMFLD</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAPFUNCINSTANCEPARAMFLD()
     * @generated
     * @ordered
     */
    protected EList<SAPFUNCINSTANCEPARAMFLDType> sAPFUNCINSTANCEPARAMFLD;

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
     * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected static final TYPEType7 TYPE_EDEFAULT = TYPEType7.INPUT;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected TYPEType7 tYPE = TYPE_EDEFAULT;

    /**
     * This is true if the TYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tYPEESet;

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
    protected static final VALUETYPEType1 VALUETYPE_EDEFAULT = VALUETYPEType1.CONSTANT;

    /**
     * The cached value of the '{@link #getVALUETYPE() <em>VALUETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUETYPE()
     * @generated
     * @ordered
     */
    protected VALUETYPEType1 vALUETYPE = VALUETYPE_EDEFAULT;

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
    protected SAPTABLEINSTANCEPARAMTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSAPTABLEINSTANCEPARAMType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SAPFUNCINSTANCEPARAMFLDType> getSAPFUNCINSTANCEPARAMFLD() {
        if (sAPFUNCINSTANCEPARAMFLD == null) {
            sAPFUNCINSTANCEPARAMFLD = new EObjectContainmentEList<SAPFUNCINSTANCEPARAMFLDType>(SAPFUNCINSTANCEPARAMFLDType.class, this, PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__SAPFUNCINSTANCEPARAMFLD);
        }
        return sAPFUNCINSTANCEPARAMFLD;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType7 getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTYPE(TYPEType7 newTYPE) {
        TYPEType7 oldTYPE = tYPE;
        tYPE = newTYPE == null ? TYPE_EDEFAULT : newTYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__TYPE, oldTYPE, tYPE, !oldTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTYPE() {
        TYPEType7 oldTYPE = tYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPE = TYPE_EDEFAULT;
        tYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__TYPE, oldTYPE, TYPE_EDEFAULT, oldTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTYPE() {
        return tYPEESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__VALUE, oldVALUE, vALUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VALUETYPEType1 getVALUETYPE() {
        return vALUETYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVALUETYPE(VALUETYPEType1 newVALUETYPE) {
        VALUETYPEType1 oldVALUETYPE = vALUETYPE;
        vALUETYPE = newVALUETYPE == null ? VALUETYPE_EDEFAULT : newVALUETYPE;
        boolean oldVALUETYPEESet = vALUETYPEESet;
        vALUETYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__VALUETYPE, oldVALUETYPE, vALUETYPE, !oldVALUETYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVALUETYPE() {
        VALUETYPEType1 oldVALUETYPE = vALUETYPE;
        boolean oldVALUETYPEESet = vALUETYPEESet;
        vALUETYPE = VALUETYPE_EDEFAULT;
        vALUETYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__VALUETYPE, oldVALUETYPE, VALUETYPE_EDEFAULT, oldVALUETYPEESet));
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
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__SAPFUNCINSTANCEPARAMFLD:
                return ((InternalEList<?>)getSAPFUNCINSTANCEPARAMFLD()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__SAPFUNCINSTANCEPARAMFLD:
                return getSAPFUNCINSTANCEPARAMFLD();
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__TYPE:
                return getTYPE();
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__VALUE:
                return getVALUE();
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__VALUETYPE:
                return getVALUETYPE();
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
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__SAPFUNCINSTANCEPARAMFLD:
                getSAPFUNCINSTANCEPARAMFLD().clear();
                getSAPFUNCINSTANCEPARAMFLD().addAll((Collection<? extends SAPFUNCINSTANCEPARAMFLDType>)newValue);
                return;
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__TYPE:
                setTYPE((TYPEType7)newValue);
                return;
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__VALUE:
                setVALUE(newValue);
                return;
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__VALUETYPE:
                setVALUETYPE((VALUETYPEType1)newValue);
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
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__SAPFUNCINSTANCEPARAMFLD:
                getSAPFUNCINSTANCEPARAMFLD().clear();
                return;
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__TYPE:
                unsetTYPE();
                return;
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__VALUE:
                setVALUE(VALUE_EDEFAULT);
                return;
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__VALUETYPE:
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
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__SAPFUNCINSTANCEPARAMFLD:
                return sAPFUNCINSTANCEPARAMFLD != null && !sAPFUNCINSTANCEPARAMFLD.isEmpty();
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__TYPE:
                return isSetTYPE();
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__VALUE:
                return VALUE_EDEFAULT == null ? vALUE != null : !VALUE_EDEFAULT.equals(vALUE);
            case PowrmartPackage.SAPTABLEINSTANCEPARAM_TYPE__VALUETYPE:
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
        result.append(", tYPE: ");
        if (tYPEESet) result.append(tYPE); else result.append("<unset>");
        result.append(", vALUE: ");
        result.append(vALUE);
        result.append(", vALUETYPE: ");
        if (vALUETYPEESet) result.append(vALUETYPE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //SAPTABLEINSTANCEPARAMTypeImpl
