/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.CONNECTORType;
import Powrmart.PowrmartPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONNECTOR Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.CONNECTORTypeImpl#getFROMFIELD <em>FROMFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.CONNECTORTypeImpl#getFROMINSTANCE <em>FROMINSTANCE</em>}</li>
 *   <li>{@link Powrmart.impl.CONNECTORTypeImpl#getFROMINSTANCETYPE <em>FROMINSTANCETYPE</em>}</li>
 *   <li>{@link Powrmart.impl.CONNECTORTypeImpl#getTOFIELD <em>TOFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.CONNECTORTypeImpl#getTOINSTANCE <em>TOINSTANCE</em>}</li>
 *   <li>{@link Powrmart.impl.CONNECTORTypeImpl#getTOINSTANCETYPE <em>TOINSTANCETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CONNECTORTypeImpl extends EObjectImpl implements CONNECTORType {
    /**
     * The default value of the '{@link #getFROMFIELD() <em>FROMFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFROMFIELD()
     * @generated
     * @ordered
     */
    protected static final Object FROMFIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFROMFIELD() <em>FROMFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFROMFIELD()
     * @generated
     * @ordered
     */
    protected Object fROMFIELD = FROMFIELD_EDEFAULT;

    /**
     * The default value of the '{@link #getFROMINSTANCE() <em>FROMINSTANCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFROMINSTANCE()
     * @generated
     * @ordered
     */
    protected static final Object FROMINSTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFROMINSTANCE() <em>FROMINSTANCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFROMINSTANCE()
     * @generated
     * @ordered
     */
    protected Object fROMINSTANCE = FROMINSTANCE_EDEFAULT;

    /**
     * The default value of the '{@link #getFROMINSTANCETYPE() <em>FROMINSTANCETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFROMINSTANCETYPE()
     * @generated
     * @ordered
     */
    protected static final Object FROMINSTANCETYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFROMINSTANCETYPE() <em>FROMINSTANCETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFROMINSTANCETYPE()
     * @generated
     * @ordered
     */
    protected Object fROMINSTANCETYPE = FROMINSTANCETYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getTOFIELD() <em>TOFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTOFIELD()
     * @generated
     * @ordered
     */
    protected static final Object TOFIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTOFIELD() <em>TOFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTOFIELD()
     * @generated
     * @ordered
     */
    protected Object tOFIELD = TOFIELD_EDEFAULT;

    /**
     * The default value of the '{@link #getTOINSTANCE() <em>TOINSTANCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTOINSTANCE()
     * @generated
     * @ordered
     */
    protected static final Object TOINSTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTOINSTANCE() <em>TOINSTANCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTOINSTANCE()
     * @generated
     * @ordered
     */
    protected Object tOINSTANCE = TOINSTANCE_EDEFAULT;

    /**
     * The default value of the '{@link #getTOINSTANCETYPE() <em>TOINSTANCETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTOINSTANCETYPE()
     * @generated
     * @ordered
     */
    protected static final Object TOINSTANCETYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTOINSTANCETYPE() <em>TOINSTANCETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTOINSTANCETYPE()
     * @generated
     * @ordered
     */
    protected Object tOINSTANCETYPE = TOINSTANCETYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CONNECTORTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getCONNECTORType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFROMFIELD() {
        return fROMFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFROMFIELD(Object newFROMFIELD) {
        Object oldFROMFIELD = fROMFIELD;
        fROMFIELD = newFROMFIELD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTOR_TYPE__FROMFIELD, oldFROMFIELD, fROMFIELD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFROMINSTANCE() {
        return fROMINSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFROMINSTANCE(Object newFROMINSTANCE) {
        Object oldFROMINSTANCE = fROMINSTANCE;
        fROMINSTANCE = newFROMINSTANCE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTOR_TYPE__FROMINSTANCE, oldFROMINSTANCE, fROMINSTANCE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFROMINSTANCETYPE() {
        return fROMINSTANCETYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFROMINSTANCETYPE(Object newFROMINSTANCETYPE) {
        Object oldFROMINSTANCETYPE = fROMINSTANCETYPE;
        fROMINSTANCETYPE = newFROMINSTANCETYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTOR_TYPE__FROMINSTANCETYPE, oldFROMINSTANCETYPE, fROMINSTANCETYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTOFIELD() {
        return tOFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTOFIELD(Object newTOFIELD) {
        Object oldTOFIELD = tOFIELD;
        tOFIELD = newTOFIELD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTOR_TYPE__TOFIELD, oldTOFIELD, tOFIELD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTOINSTANCE() {
        return tOINSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTOINSTANCE(Object newTOINSTANCE) {
        Object oldTOINSTANCE = tOINSTANCE;
        tOINSTANCE = newTOINSTANCE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTOR_TYPE__TOINSTANCE, oldTOINSTANCE, tOINSTANCE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTOINSTANCETYPE() {
        return tOINSTANCETYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTOINSTANCETYPE(Object newTOINSTANCETYPE) {
        Object oldTOINSTANCETYPE = tOINSTANCETYPE;
        tOINSTANCETYPE = newTOINSTANCETYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTOR_TYPE__TOINSTANCETYPE, oldTOINSTANCETYPE, tOINSTANCETYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.CONNECTOR_TYPE__FROMFIELD:
                return getFROMFIELD();
            case PowrmartPackage.CONNECTOR_TYPE__FROMINSTANCE:
                return getFROMINSTANCE();
            case PowrmartPackage.CONNECTOR_TYPE__FROMINSTANCETYPE:
                return getFROMINSTANCETYPE();
            case PowrmartPackage.CONNECTOR_TYPE__TOFIELD:
                return getTOFIELD();
            case PowrmartPackage.CONNECTOR_TYPE__TOINSTANCE:
                return getTOINSTANCE();
            case PowrmartPackage.CONNECTOR_TYPE__TOINSTANCETYPE:
                return getTOINSTANCETYPE();
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
            case PowrmartPackage.CONNECTOR_TYPE__FROMFIELD:
                setFROMFIELD(newValue);
                return;
            case PowrmartPackage.CONNECTOR_TYPE__FROMINSTANCE:
                setFROMINSTANCE(newValue);
                return;
            case PowrmartPackage.CONNECTOR_TYPE__FROMINSTANCETYPE:
                setFROMINSTANCETYPE(newValue);
                return;
            case PowrmartPackage.CONNECTOR_TYPE__TOFIELD:
                setTOFIELD(newValue);
                return;
            case PowrmartPackage.CONNECTOR_TYPE__TOINSTANCE:
                setTOINSTANCE(newValue);
                return;
            case PowrmartPackage.CONNECTOR_TYPE__TOINSTANCETYPE:
                setTOINSTANCETYPE(newValue);
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
            case PowrmartPackage.CONNECTOR_TYPE__FROMFIELD:
                setFROMFIELD(FROMFIELD_EDEFAULT);
                return;
            case PowrmartPackage.CONNECTOR_TYPE__FROMINSTANCE:
                setFROMINSTANCE(FROMINSTANCE_EDEFAULT);
                return;
            case PowrmartPackage.CONNECTOR_TYPE__FROMINSTANCETYPE:
                setFROMINSTANCETYPE(FROMINSTANCETYPE_EDEFAULT);
                return;
            case PowrmartPackage.CONNECTOR_TYPE__TOFIELD:
                setTOFIELD(TOFIELD_EDEFAULT);
                return;
            case PowrmartPackage.CONNECTOR_TYPE__TOINSTANCE:
                setTOINSTANCE(TOINSTANCE_EDEFAULT);
                return;
            case PowrmartPackage.CONNECTOR_TYPE__TOINSTANCETYPE:
                setTOINSTANCETYPE(TOINSTANCETYPE_EDEFAULT);
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
            case PowrmartPackage.CONNECTOR_TYPE__FROMFIELD:
                return FROMFIELD_EDEFAULT == null ? fROMFIELD != null : !FROMFIELD_EDEFAULT.equals(fROMFIELD);
            case PowrmartPackage.CONNECTOR_TYPE__FROMINSTANCE:
                return FROMINSTANCE_EDEFAULT == null ? fROMINSTANCE != null : !FROMINSTANCE_EDEFAULT.equals(fROMINSTANCE);
            case PowrmartPackage.CONNECTOR_TYPE__FROMINSTANCETYPE:
                return FROMINSTANCETYPE_EDEFAULT == null ? fROMINSTANCETYPE != null : !FROMINSTANCETYPE_EDEFAULT.equals(fROMINSTANCETYPE);
            case PowrmartPackage.CONNECTOR_TYPE__TOFIELD:
                return TOFIELD_EDEFAULT == null ? tOFIELD != null : !TOFIELD_EDEFAULT.equals(tOFIELD);
            case PowrmartPackage.CONNECTOR_TYPE__TOINSTANCE:
                return TOINSTANCE_EDEFAULT == null ? tOINSTANCE != null : !TOINSTANCE_EDEFAULT.equals(tOINSTANCE);
            case PowrmartPackage.CONNECTOR_TYPE__TOINSTANCETYPE:
                return TOINSTANCETYPE_EDEFAULT == null ? tOINSTANCETYPE != null : !TOINSTANCETYPE_EDEFAULT.equals(tOINSTANCETYPE);
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

        StringBuffer result = new StringBuffer(/*super.toString()*/);
        result.append(" (fROMFIELD: ");
        result.append(fROMFIELD);
        result.append(", fROMINSTANCE: ");
        result.append(fROMINSTANCE);
        result.append(", fROMINSTANCETYPE: ");
        result.append(fROMINSTANCETYPE);
        result.append(", tOFIELD: ");
        result.append(tOFIELD);
        result.append(", tOINSTANCE: ");
        result.append(tOINSTANCE);
        result.append(", tOINSTANCETYPE: ");
        result.append(tOINSTANCETYPE);
        result.append(')');
        return result.toString();
    }

} //CONNECTORTypeImpl
