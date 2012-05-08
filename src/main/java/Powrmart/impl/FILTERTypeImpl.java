/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.DAYType;
import Powrmart.FILTERType;
import Powrmart.OCCURRENCEType;
import Powrmart.PowrmartPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FILTER Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.FILTERTypeImpl#getDAY <em>DAY</em>}</li>
 *   <li>{@link Powrmart.impl.FILTERTypeImpl#getDAYOFMONTH <em>DAYOFMONTH</em>}</li>
 *   <li>{@link Powrmart.impl.FILTERTypeImpl#getOCCURRENCE <em>OCCURRENCE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FILTERTypeImpl extends EObjectImpl implements FILTERType {
    /**
     * The default value of the '{@link #getDAY() <em>DAY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAY()
     * @generated
     * @ordered
     */
    protected static final DAYType DAY_EDEFAULT = DAYType.MONDAY;

    /**
     * The cached value of the '{@link #getDAY() <em>DAY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAY()
     * @generated
     * @ordered
     */
    protected DAYType dAY = DAY_EDEFAULT;

    /**
     * This is true if the DAY attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dAYESet;

    /**
     * The default value of the '{@link #getDAYOFMONTH() <em>DAYOFMONTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAYOFMONTH()
     * @generated
     * @ordered
     */
    protected static final Object DAYOFMONTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDAYOFMONTH() <em>DAYOFMONTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAYOFMONTH()
     * @generated
     * @ordered
     */
    protected Object dAYOFMONTH = DAYOFMONTH_EDEFAULT;

    /**
     * The default value of the '{@link #getOCCURRENCE() <em>OCCURRENCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOCCURRENCE()
     * @generated
     * @ordered
     */
    protected static final OCCURRENCEType OCCURRENCE_EDEFAULT = OCCURRENCEType.FIRST;

    /**
     * The cached value of the '{@link #getOCCURRENCE() <em>OCCURRENCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOCCURRENCE()
     * @generated
     * @ordered
     */
    protected OCCURRENCEType oCCURRENCE = OCCURRENCE_EDEFAULT;

    /**
     * This is true if the OCCURRENCE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oCCURRENCEESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FILTERTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getFILTERType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DAYType getDAY() {
        return dAY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDAY(DAYType newDAY) {
        DAYType oldDAY = dAY;
        dAY = newDAY == null ? DAY_EDEFAULT : newDAY;
        boolean oldDAYESet = dAYESet;
        dAYESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FILTER_TYPE__DAY, oldDAY, dAY, !oldDAYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDAY() {
        DAYType oldDAY = dAY;
        boolean oldDAYESet = dAYESet;
        dAY = DAY_EDEFAULT;
        dAYESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.FILTER_TYPE__DAY, oldDAY, DAY_EDEFAULT, oldDAYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDAY() {
        return dAYESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDAYOFMONTH() {
        return dAYOFMONTH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDAYOFMONTH(Object newDAYOFMONTH) {
        Object oldDAYOFMONTH = dAYOFMONTH;
        dAYOFMONTH = newDAYOFMONTH;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FILTER_TYPE__DAYOFMONTH, oldDAYOFMONTH, dAYOFMONTH));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OCCURRENCEType getOCCURRENCE() {
        return oCCURRENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOCCURRENCE(OCCURRENCEType newOCCURRENCE) {
        OCCURRENCEType oldOCCURRENCE = oCCURRENCE;
        oCCURRENCE = newOCCURRENCE == null ? OCCURRENCE_EDEFAULT : newOCCURRENCE;
        boolean oldOCCURRENCEESet = oCCURRENCEESet;
        oCCURRENCEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FILTER_TYPE__OCCURRENCE, oldOCCURRENCE, oCCURRENCE, !oldOCCURRENCEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOCCURRENCE() {
        OCCURRENCEType oldOCCURRENCE = oCCURRENCE;
        boolean oldOCCURRENCEESet = oCCURRENCEESet;
        oCCURRENCE = OCCURRENCE_EDEFAULT;
        oCCURRENCEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.FILTER_TYPE__OCCURRENCE, oldOCCURRENCE, OCCURRENCE_EDEFAULT, oldOCCURRENCEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetOCCURRENCE() {
        return oCCURRENCEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.FILTER_TYPE__DAY:
                return getDAY();
            case PowrmartPackage.FILTER_TYPE__DAYOFMONTH:
                return getDAYOFMONTH();
            case PowrmartPackage.FILTER_TYPE__OCCURRENCE:
                return getOCCURRENCE();
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
            case PowrmartPackage.FILTER_TYPE__DAY:
                setDAY((DAYType)newValue);
                return;
            case PowrmartPackage.FILTER_TYPE__DAYOFMONTH:
                setDAYOFMONTH(newValue);
                return;
            case PowrmartPackage.FILTER_TYPE__OCCURRENCE:
                setOCCURRENCE((OCCURRENCEType)newValue);
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
            case PowrmartPackage.FILTER_TYPE__DAY:
                unsetDAY();
                return;
            case PowrmartPackage.FILTER_TYPE__DAYOFMONTH:
                setDAYOFMONTH(DAYOFMONTH_EDEFAULT);
                return;
            case PowrmartPackage.FILTER_TYPE__OCCURRENCE:
                unsetOCCURRENCE();
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
            case PowrmartPackage.FILTER_TYPE__DAY:
                return isSetDAY();
            case PowrmartPackage.FILTER_TYPE__DAYOFMONTH:
                return DAYOFMONTH_EDEFAULT == null ? dAYOFMONTH != null : !DAYOFMONTH_EDEFAULT.equals(dAYOFMONTH);
            case PowrmartPackage.FILTER_TYPE__OCCURRENCE:
                return isSetOCCURRENCE();
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
        result.append(" (dAY: ");
        if (dAYESet) result.append(dAY); else result.append("<unset>");
        result.append(", dAYOFMONTH: ");
        result.append(dAYOFMONTH);
        result.append(", oCCURRENCE: ");
        if (oCCURRENCEESet) result.append(oCCURRENCE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //FILTERTypeImpl
