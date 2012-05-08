/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ISOPTIONALType;
import Powrmart.PowrmartPackage;
import Powrmart.SAPTABLEPARAMType;
import Powrmart.TYPEType6;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAPTABLEPARAM Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SAPTABLEPARAMTypeImpl#getDEF <em>DEF</em>}</li>
 *   <li>{@link Powrmart.impl.SAPTABLEPARAMTypeImpl#getISOPTIONAL <em>ISOPTIONAL</em>}</li>
 *   <li>{@link Powrmart.impl.SAPTABLEPARAMTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPTABLEPARAMTypeImpl#getORDER <em>ORDER</em>}</li>
 *   <li>{@link Powrmart.impl.SAPTABLEPARAMTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPTABLEPARAMTypeImpl extends EObjectImpl implements SAPTABLEPARAMType {
    /**
     * The default value of the '{@link #getDEF() <em>DEF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEF()
     * @generated
     * @ordered
     */
    protected static final Object DEF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDEF() <em>DEF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEF()
     * @generated
     * @ordered
     */
    protected Object dEF = DEF_EDEFAULT;

    /**
     * The default value of the '{@link #getISOPTIONAL() <em>ISOPTIONAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISOPTIONAL()
     * @generated
     * @ordered
     */
    protected static final ISOPTIONALType ISOPTIONAL_EDEFAULT = ISOPTIONALType.YES;

    /**
     * The cached value of the '{@link #getISOPTIONAL() <em>ISOPTIONAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISOPTIONAL()
     * @generated
     * @ordered
     */
    protected ISOPTIONALType iSOPTIONAL = ISOPTIONAL_EDEFAULT;

    /**
     * This is true if the ISOPTIONAL attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSOPTIONALESet;

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
    protected static final TYPEType6 TYPE_EDEFAULT = TYPEType6.INPUT;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected TYPEType6 tYPE = TYPE_EDEFAULT;

    /**
     * This is true if the TYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tYPEESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPTABLEPARAMTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSAPTABLEPARAMType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDEF() {
        return dEF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDEF(Object newDEF) {
        Object oldDEF = dEF;
        dEF = newDEF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPTABLEPARAM_TYPE__DEF, oldDEF, dEF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISOPTIONALType getISOPTIONAL() {
        return iSOPTIONAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISOPTIONAL(ISOPTIONALType newISOPTIONAL) {
        ISOPTIONALType oldISOPTIONAL = iSOPTIONAL;
        iSOPTIONAL = newISOPTIONAL == null ? ISOPTIONAL_EDEFAULT : newISOPTIONAL;
        boolean oldISOPTIONALESet = iSOPTIONALESet;
        iSOPTIONALESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPTABLEPARAM_TYPE__ISOPTIONAL, oldISOPTIONAL, iSOPTIONAL, !oldISOPTIONALESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISOPTIONAL() {
        ISOPTIONALType oldISOPTIONAL = iSOPTIONAL;
        boolean oldISOPTIONALESet = iSOPTIONALESet;
        iSOPTIONAL = ISOPTIONAL_EDEFAULT;
        iSOPTIONALESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SAPTABLEPARAM_TYPE__ISOPTIONAL, oldISOPTIONAL, ISOPTIONAL_EDEFAULT, oldISOPTIONALESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISOPTIONAL() {
        return iSOPTIONALESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPTABLEPARAM_TYPE__NAME, oldNAME, nAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPTABLEPARAM_TYPE__ORDER, oldORDER, oRDER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType6 getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTYPE(TYPEType6 newTYPE) {
        TYPEType6 oldTYPE = tYPE;
        tYPE = newTYPE == null ? TYPE_EDEFAULT : newTYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPTABLEPARAM_TYPE__TYPE, oldTYPE, tYPE, !oldTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTYPE() {
        TYPEType6 oldTYPE = tYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPE = TYPE_EDEFAULT;
        tYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SAPTABLEPARAM_TYPE__TYPE, oldTYPE, TYPE_EDEFAULT, oldTYPEESet));
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
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SAPTABLEPARAM_TYPE__DEF:
                return getDEF();
            case PowrmartPackage.SAPTABLEPARAM_TYPE__ISOPTIONAL:
                return getISOPTIONAL();
            case PowrmartPackage.SAPTABLEPARAM_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SAPTABLEPARAM_TYPE__ORDER:
                return getORDER();
            case PowrmartPackage.SAPTABLEPARAM_TYPE__TYPE:
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
            case PowrmartPackage.SAPTABLEPARAM_TYPE__DEF:
                setDEF(newValue);
                return;
            case PowrmartPackage.SAPTABLEPARAM_TYPE__ISOPTIONAL:
                setISOPTIONAL((ISOPTIONALType)newValue);
                return;
            case PowrmartPackage.SAPTABLEPARAM_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SAPTABLEPARAM_TYPE__ORDER:
                setORDER(newValue);
                return;
            case PowrmartPackage.SAPTABLEPARAM_TYPE__TYPE:
                setTYPE((TYPEType6)newValue);
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
            case PowrmartPackage.SAPTABLEPARAM_TYPE__DEF:
                setDEF(DEF_EDEFAULT);
                return;
            case PowrmartPackage.SAPTABLEPARAM_TYPE__ISOPTIONAL:
                unsetISOPTIONAL();
                return;
            case PowrmartPackage.SAPTABLEPARAM_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPTABLEPARAM_TYPE__ORDER:
                setORDER(ORDER_EDEFAULT);
                return;
            case PowrmartPackage.SAPTABLEPARAM_TYPE__TYPE:
                unsetTYPE();
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
            case PowrmartPackage.SAPTABLEPARAM_TYPE__DEF:
                return DEF_EDEFAULT == null ? dEF != null : !DEF_EDEFAULT.equals(dEF);
            case PowrmartPackage.SAPTABLEPARAM_TYPE__ISOPTIONAL:
                return isSetISOPTIONAL();
            case PowrmartPackage.SAPTABLEPARAM_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SAPTABLEPARAM_TYPE__ORDER:
                return ORDER_EDEFAULT == null ? oRDER != null : !ORDER_EDEFAULT.equals(oRDER);
            case PowrmartPackage.SAPTABLEPARAM_TYPE__TYPE:
                return isSetTYPE();
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
        result.append(" (dEF: ");
        result.append(dEF);
        result.append(", iSOPTIONAL: ");
        if (iSOPTIONALESet) result.append(iSOPTIONAL); else result.append("<unset>");
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", oRDER: ");
        result.append(oRDER);
        result.append(", tYPE: ");
        if (tYPEESet) result.append(tYPE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //SAPTABLEPARAMTypeImpl
