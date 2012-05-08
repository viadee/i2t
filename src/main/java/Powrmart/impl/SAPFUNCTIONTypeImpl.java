/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SAPFUNCPARAMType;
import Powrmart.SAPFUNCTIONType;
import Powrmart.SAPTABLEPARAMType;

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
 * An implementation of the model object '<em><b>SAPFUNCTION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SAPFUNCTIONTypeImpl#getSAPFUNCPARAM <em>SAPFUNCPARAM</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCTIONTypeImpl#getSAPTABLEPARAM <em>SAPTABLEPARAM</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCTIONTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCTIONTypeImpl#getNAME <em>NAME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPFUNCTIONTypeImpl extends EObjectImpl implements SAPFUNCTIONType {
    /**
     * The cached value of the '{@link #getSAPFUNCPARAM() <em>SAPFUNCPARAM</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAPFUNCPARAM()
     * @generated
     * @ordered
     */
    protected EList<SAPFUNCPARAMType> sAPFUNCPARAM;

    /**
     * The cached value of the '{@link #getSAPTABLEPARAM() <em>SAPTABLEPARAM</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAPTABLEPARAM()
     * @generated
     * @ordered
     */
    protected EList<SAPTABLEPARAMType> sAPTABLEPARAM;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPFUNCTIONTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSAPFUNCTIONType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SAPFUNCPARAMType> getSAPFUNCPARAM() {
        if (sAPFUNCPARAM == null) {
            sAPFUNCPARAM = new EObjectContainmentEList<SAPFUNCPARAMType>(SAPFUNCPARAMType.class, this, PowrmartPackage.SAPFUNCTION_TYPE__SAPFUNCPARAM);
        }
        return sAPFUNCPARAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SAPTABLEPARAMType> getSAPTABLEPARAM() {
        if (sAPTABLEPARAM == null) {
            sAPTABLEPARAM = new EObjectContainmentEList<SAPTABLEPARAMType>(SAPTABLEPARAMType.class, this, PowrmartPackage.SAPFUNCTION_TYPE__SAPTABLEPARAM);
        }
        return sAPTABLEPARAM;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCTION_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCTION_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SAPFUNCTION_TYPE__SAPFUNCPARAM:
                return ((InternalEList<?>)getSAPFUNCPARAM()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SAPFUNCTION_TYPE__SAPTABLEPARAM:
                return ((InternalEList<?>)getSAPTABLEPARAM()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.SAPFUNCTION_TYPE__SAPFUNCPARAM:
                return getSAPFUNCPARAM();
            case PowrmartPackage.SAPFUNCTION_TYPE__SAPTABLEPARAM:
                return getSAPTABLEPARAM();
            case PowrmartPackage.SAPFUNCTION_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.SAPFUNCTION_TYPE__NAME:
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
            case PowrmartPackage.SAPFUNCTION_TYPE__SAPFUNCPARAM:
                getSAPFUNCPARAM().clear();
                getSAPFUNCPARAM().addAll((Collection<? extends SAPFUNCPARAMType>)newValue);
                return;
            case PowrmartPackage.SAPFUNCTION_TYPE__SAPTABLEPARAM:
                getSAPTABLEPARAM().clear();
                getSAPTABLEPARAM().addAll((Collection<? extends SAPTABLEPARAMType>)newValue);
                return;
            case PowrmartPackage.SAPFUNCTION_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.SAPFUNCTION_TYPE__NAME:
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
            case PowrmartPackage.SAPFUNCTION_TYPE__SAPFUNCPARAM:
                getSAPFUNCPARAM().clear();
                return;
            case PowrmartPackage.SAPFUNCTION_TYPE__SAPTABLEPARAM:
                getSAPTABLEPARAM().clear();
                return;
            case PowrmartPackage.SAPFUNCTION_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.SAPFUNCTION_TYPE__NAME:
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
            case PowrmartPackage.SAPFUNCTION_TYPE__SAPFUNCPARAM:
                return sAPFUNCPARAM != null && !sAPFUNCPARAM.isEmpty();
            case PowrmartPackage.SAPFUNCTION_TYPE__SAPTABLEPARAM:
                return sAPTABLEPARAM != null && !sAPTABLEPARAM.isEmpty();
            case PowrmartPackage.SAPFUNCTION_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.SAPFUNCTION_TYPE__NAME:
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
        result.append(" (dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(')');
        return result.toString();
    }

} //SAPFUNCTIONTypeImpl
