/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.TRANSFORMFIELDATTRDEFType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TRANSFORMFIELDATTRDEF Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDATTRDEFTypeImpl#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDATTRDEFTypeImpl#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDATTRDEFTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDATTRDEFTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDATTRDEFTypeImpl#getORDER <em>ORDER</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDATTRDEFTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TRANSFORMFIELDATTRDEFTypeImpl extends EObjectImpl implements TRANSFORMFIELDATTRDEFType {
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
     * The default value of the '{@link #getDEFAULTVALUE() <em>DEFAULTVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULTVALUE()
     * @generated
     * @ordered
     */
    protected static final Object DEFAULTVALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDEFAULTVALUE() <em>DEFAULTVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULTVALUE()
     * @generated
     * @ordered
     */
    protected Object dEFAULTVALUE = DEFAULTVALUE_EDEFAULT;

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
     * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected static final Object TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected Object tYPE = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TRANSFORMFIELDATTRDEFTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getTRANSFORMFIELDATTRDEFType();
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DATATYPE, oldDATATYPE, dATATYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDEFAULTVALUE() {
        return dEFAULTVALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDEFAULTVALUE(Object newDEFAULTVALUE) {
        Object oldDEFAULTVALUE = dEFAULTVALUE;
        dEFAULTVALUE = newDEFAULTVALUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DEFAULTVALUE, oldDEFAULTVALUE, dEFAULTVALUE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__NAME, oldNAME, nAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__ORDER, oldORDER, oRDER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTYPE(Object newTYPE) {
        Object oldTYPE = tYPE;
        tYPE = newTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__TYPE, oldTYPE, tYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DATATYPE:
                return getDATATYPE();
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DEFAULTVALUE:
                return getDEFAULTVALUE();
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__ORDER:
                return getORDER();
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__TYPE:
                return getTYPE();
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
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DATATYPE:
                setDATATYPE(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DEFAULTVALUE:
                setDEFAULTVALUE(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__ORDER:
                setORDER(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__TYPE:
                setTYPE(newValue);
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
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DATATYPE:
                setDATATYPE(DATATYPE_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DEFAULTVALUE:
                setDEFAULTVALUE(DEFAULTVALUE_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__ORDER:
                setORDER(ORDER_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__TYPE:
                setTYPE(TYPE_EDEFAULT);
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
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DATATYPE:
                return DATATYPE_EDEFAULT == null ? dATATYPE != null : !DATATYPE_EDEFAULT.equals(dATATYPE);
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DEFAULTVALUE:
                return DEFAULTVALUE_EDEFAULT == null ? dEFAULTVALUE != null : !DEFAULTVALUE_EDEFAULT.equals(dEFAULTVALUE);
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__ORDER:
                return ORDER_EDEFAULT == null ? oRDER != null : !ORDER_EDEFAULT.equals(oRDER);
            case PowrmartPackage.TRANSFORMFIELDATTRDEF_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? tYPE != null : !TYPE_EDEFAULT.equals(tYPE);
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
        result.append(", dEFAULTVALUE: ");
        result.append(dEFAULTVALUE);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", oRDER: ");
        result.append(oRDER);
        result.append(", tYPE: ");
        result.append(tYPE);
        result.append(')');
        return result.toString();
    }

} //TRANSFORMFIELDATTRDEFTypeImpl
