/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.MAPDEPENDENCYType;
import Powrmart.PowrmartPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MAPDEPENDENCY Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.MAPDEPENDENCYTypeImpl#getFROMINSTANCE <em>FROMINSTANCE</em>}</li>
 *   <li>{@link Powrmart.impl.MAPDEPENDENCYTypeImpl#getFROMINSTANCETYPE <em>FROMINSTANCETYPE</em>}</li>
 *   <li>{@link Powrmart.impl.MAPDEPENDENCYTypeImpl#getTOINSTANCE <em>TOINSTANCE</em>}</li>
 *   <li>{@link Powrmart.impl.MAPDEPENDENCYTypeImpl#getTOINSTANCETYPE <em>TOINSTANCETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MAPDEPENDENCYTypeImpl extends EObjectImpl implements MAPDEPENDENCYType {
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
    protected MAPDEPENDENCYTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getMAPDEPENDENCYType();
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPDEPENDENCY_TYPE__FROMINSTANCE, oldFROMINSTANCE, fROMINSTANCE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPDEPENDENCY_TYPE__FROMINSTANCETYPE, oldFROMINSTANCETYPE, fROMINSTANCETYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPDEPENDENCY_TYPE__TOINSTANCE, oldTOINSTANCE, tOINSTANCE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPDEPENDENCY_TYPE__TOINSTANCETYPE, oldTOINSTANCETYPE, tOINSTANCETYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.MAPDEPENDENCY_TYPE__FROMINSTANCE:
                return getFROMINSTANCE();
            case PowrmartPackage.MAPDEPENDENCY_TYPE__FROMINSTANCETYPE:
                return getFROMINSTANCETYPE();
            case PowrmartPackage.MAPDEPENDENCY_TYPE__TOINSTANCE:
                return getTOINSTANCE();
            case PowrmartPackage.MAPDEPENDENCY_TYPE__TOINSTANCETYPE:
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
            case PowrmartPackage.MAPDEPENDENCY_TYPE__FROMINSTANCE:
                setFROMINSTANCE(newValue);
                return;
            case PowrmartPackage.MAPDEPENDENCY_TYPE__FROMINSTANCETYPE:
                setFROMINSTANCETYPE(newValue);
                return;
            case PowrmartPackage.MAPDEPENDENCY_TYPE__TOINSTANCE:
                setTOINSTANCE(newValue);
                return;
            case PowrmartPackage.MAPDEPENDENCY_TYPE__TOINSTANCETYPE:
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
            case PowrmartPackage.MAPDEPENDENCY_TYPE__FROMINSTANCE:
                setFROMINSTANCE(FROMINSTANCE_EDEFAULT);
                return;
            case PowrmartPackage.MAPDEPENDENCY_TYPE__FROMINSTANCETYPE:
                setFROMINSTANCETYPE(FROMINSTANCETYPE_EDEFAULT);
                return;
            case PowrmartPackage.MAPDEPENDENCY_TYPE__TOINSTANCE:
                setTOINSTANCE(TOINSTANCE_EDEFAULT);
                return;
            case PowrmartPackage.MAPDEPENDENCY_TYPE__TOINSTANCETYPE:
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
            case PowrmartPackage.MAPDEPENDENCY_TYPE__FROMINSTANCE:
                return FROMINSTANCE_EDEFAULT == null ? fROMINSTANCE != null : !FROMINSTANCE_EDEFAULT.equals(fROMINSTANCE);
            case PowrmartPackage.MAPDEPENDENCY_TYPE__FROMINSTANCETYPE:
                return FROMINSTANCETYPE_EDEFAULT == null ? fROMINSTANCETYPE != null : !FROMINSTANCETYPE_EDEFAULT.equals(fROMINSTANCETYPE);
            case PowrmartPackage.MAPDEPENDENCY_TYPE__TOINSTANCE:
                return TOINSTANCE_EDEFAULT == null ? tOINSTANCE != null : !TOINSTANCE_EDEFAULT.equals(tOINSTANCE);
            case PowrmartPackage.MAPDEPENDENCY_TYPE__TOINSTANCETYPE:
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (fROMINSTANCE: ");
        result.append(fROMINSTANCE);
        result.append(", fROMINSTANCETYPE: ");
        result.append(fROMINSTANCETYPE);
        result.append(", tOINSTANCE: ");
        result.append(tOINSTANCE);
        result.append(", tOINSTANCETYPE: ");
        result.append(tOINSTANCETYPE);
        result.append(')');
        return result.toString();
    }

} //MAPDEPENDENCYTypeImpl
