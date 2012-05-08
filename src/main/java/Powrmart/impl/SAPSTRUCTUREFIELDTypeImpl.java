/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SAPSTRUCTUREFIELDType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAPSTRUCTUREFIELD Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SAPSTRUCTUREFIELDTypeImpl#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPSTRUCTUREFIELDTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPSTRUCTUREFIELDTypeImpl#getORDER <em>ORDER</em>}</li>
 *   <li>{@link Powrmart.impl.SAPSTRUCTUREFIELDTypeImpl#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.impl.SAPSTRUCTUREFIELDTypeImpl#getSCALE <em>SCALE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPSTRUCTUREFIELDTypeImpl extends EObjectImpl implements SAPSTRUCTUREFIELDType {
    /**
     * The default value of the '{@link #getDATATYPE() <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPE()
     * @generated
     * @ordered
     */
    protected static final Object DATATYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDATATYPE() <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPE()
     * @generated
     * @ordered
     */
    protected Object dATATYPE = DATATYPE_EDEFAULT;

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
     * The default value of the '{@link #getORDER() <em>ORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getORDER()
     * @generated
     * @ordered
     */
    protected static final Object ORDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getORDER() <em>ORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getORDER()
     * @generated
     * @ordered
     */
    protected Object oRDER = ORDER_EDEFAULT;

    /**
     * The default value of the '{@link #getPRECISION() <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPRECISION()
     * @generated
     * @ordered
     */
    protected static final Object PRECISION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPRECISION() <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPRECISION()
     * @generated
     * @ordered
     */
    protected Object pRECISION = PRECISION_EDEFAULT;

    /**
     * The default value of the '{@link #getSCALE() <em>SCALE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCALE()
     * @generated
     * @ordered
     */
    protected static final Object SCALE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSCALE() <em>SCALE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCALE()
     * @generated
     * @ordered
     */
    protected Object sCALE = SCALE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPSTRUCTUREFIELDTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSAPSTRUCTUREFIELDType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDATATYPE() {
        return dATATYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPE(Object newDATATYPE) {
        Object oldDATATYPE = dATATYPE;
        dATATYPE = newDATATYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__DATATYPE, oldDATATYPE, dATATYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getORDER() {
        return oRDER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setORDER(Object newORDER) {
        Object oldORDER = oRDER;
        oRDER = newORDER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__ORDER, oldORDER, oRDER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPRECISION() {
        return pRECISION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPRECISION(Object newPRECISION) {
        Object oldPRECISION = pRECISION;
        pRECISION = newPRECISION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__PRECISION, oldPRECISION, pRECISION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSCALE() {
        return sCALE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCALE(Object newSCALE) {
        Object oldSCALE = sCALE;
        sCALE = newSCALE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__SCALE, oldSCALE, sCALE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__DATATYPE:
                return getDATATYPE();
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__ORDER:
                return getORDER();
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__PRECISION:
                return getPRECISION();
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__SCALE:
                return getSCALE();
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
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__DATATYPE:
                setDATATYPE(newValue);
                return;
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__ORDER:
                setORDER(newValue);
                return;
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__PRECISION:
                setPRECISION(newValue);
                return;
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__SCALE:
                setSCALE(newValue);
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
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__DATATYPE:
                setDATATYPE(DATATYPE_EDEFAULT);
                return;
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__ORDER:
                setORDER(ORDER_EDEFAULT);
                return;
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__PRECISION:
                setPRECISION(PRECISION_EDEFAULT);
                return;
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__SCALE:
                setSCALE(SCALE_EDEFAULT);
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
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__DATATYPE:
                return DATATYPE_EDEFAULT == null ? dATATYPE != null : !DATATYPE_EDEFAULT.equals(dATATYPE);
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__ORDER:
                return ORDER_EDEFAULT == null ? oRDER != null : !ORDER_EDEFAULT.equals(oRDER);
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__PRECISION:
                return PRECISION_EDEFAULT == null ? pRECISION != null : !PRECISION_EDEFAULT.equals(pRECISION);
            case PowrmartPackage.SAPSTRUCTUREFIELD_TYPE__SCALE:
                return SCALE_EDEFAULT == null ? sCALE != null : !SCALE_EDEFAULT.equals(sCALE);
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
        result.append(" (dATATYPE: ");
        result.append(dATATYPE);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", oRDER: ");
        result.append(oRDER);
        result.append(", pRECISION: ");
        result.append(pRECISION);
        result.append(", sCALE: ");
        result.append(sCALE);
        result.append(')');
        return result.toString();
    }

} //SAPSTRUCTUREFIELDTypeImpl
