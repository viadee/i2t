/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.REUSABLEType1;
import Powrmart.SCHEDULERType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SCHEDULER Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SCHEDULERTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.SCHEDULERTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SCHEDULERTypeImpl#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.impl.SCHEDULERTypeImpl#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SCHEDULERTypeImpl extends SCHEDULEINFOImpl implements SCHEDULERType {
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
     * The default value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected static final REUSABLEType1 REUSABLE_EDEFAULT = REUSABLEType1.YES;

    /**
     * The cached value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected REUSABLEType1 rEUSABLE = REUSABLE_EDEFAULT;

    /**
     * This is true if the REUSABLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEUSABLEESet;

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
    protected SCHEDULERTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSCHEDULERType();
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULER_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULER_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType1 getREUSABLE() {
        return rEUSABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREUSABLE(REUSABLEType1 newREUSABLE) {
        REUSABLEType1 oldREUSABLE = rEUSABLE;
        rEUSABLE = newREUSABLE == null ? REUSABLE_EDEFAULT : newREUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULER_TYPE__REUSABLE, oldREUSABLE, rEUSABLE, !oldREUSABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREUSABLE() {
        REUSABLEType1 oldREUSABLE = rEUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLE = REUSABLE_EDEFAULT;
        rEUSABLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SCHEDULER_TYPE__REUSABLE, oldREUSABLE, REUSABLE_EDEFAULT, oldREUSABLEESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULER_TYPE__VERSIONNUMBER, oldVERSIONNUMBER, vERSIONNUMBER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SCHEDULER_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.SCHEDULER_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SCHEDULER_TYPE__REUSABLE:
                return getREUSABLE();
            case PowrmartPackage.SCHEDULER_TYPE__VERSIONNUMBER:
                return getVERSIONNUMBER();
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
            case PowrmartPackage.SCHEDULER_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.SCHEDULER_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SCHEDULER_TYPE__REUSABLE:
                setREUSABLE((REUSABLEType1)newValue);
                return;
            case PowrmartPackage.SCHEDULER_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.SCHEDULER_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.SCHEDULER_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SCHEDULER_TYPE__REUSABLE:
                unsetREUSABLE();
                return;
            case PowrmartPackage.SCHEDULER_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.SCHEDULER_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.SCHEDULER_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SCHEDULER_TYPE__REUSABLE:
                return isSetREUSABLE();
            case PowrmartPackage.SCHEDULER_TYPE__VERSIONNUMBER:
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
        result.append(", rEUSABLE: ");
        if (rEUSABLEESet) result.append(rEUSABLE); else result.append("<unset>");
        result.append(", vERSIONNUMBER: ");
        result.append(vERSIONNUMBER);
        result.append(')');
        return result.toString();
    }

} //SCHEDULERTypeImpl
