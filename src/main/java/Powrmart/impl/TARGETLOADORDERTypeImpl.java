/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.TARGETLOADORDERType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TARGETLOADORDER Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.TARGETLOADORDERTypeImpl#getORDER <em>ORDER</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETLOADORDERTypeImpl#getTARGETINSTANCE <em>TARGETINSTANCE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TARGETLOADORDERTypeImpl extends EObjectImpl implements TARGETLOADORDERType {
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
     * The default value of the '{@link #getTARGETINSTANCE() <em>TARGETINSTANCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTARGETINSTANCE()
     * @generated
     * @ordered
     */
    protected static final Object TARGETINSTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTARGETINSTANCE() <em>TARGETINSTANCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTARGETINSTANCE()
     * @generated
     * @ordered
     */
    protected Object tARGETINSTANCE = TARGETINSTANCE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TARGETLOADORDERTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getTARGETLOADORDERType();
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETLOADORDER_TYPE__ORDER, oldORDER, oRDER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTARGETINSTANCE() {
        return tARGETINSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTARGETINSTANCE(Object newTARGETINSTANCE) {
        Object oldTARGETINSTANCE = tARGETINSTANCE;
        tARGETINSTANCE = newTARGETINSTANCE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETLOADORDER_TYPE__TARGETINSTANCE, oldTARGETINSTANCE, tARGETINSTANCE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.TARGETLOADORDER_TYPE__ORDER:
                return getORDER();
            case PowrmartPackage.TARGETLOADORDER_TYPE__TARGETINSTANCE:
                return getTARGETINSTANCE();
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
            case PowrmartPackage.TARGETLOADORDER_TYPE__ORDER:
                setORDER(newValue);
                return;
            case PowrmartPackage.TARGETLOADORDER_TYPE__TARGETINSTANCE:
                setTARGETINSTANCE(newValue);
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
            case PowrmartPackage.TARGETLOADORDER_TYPE__ORDER:
                setORDER(ORDER_EDEFAULT);
                return;
            case PowrmartPackage.TARGETLOADORDER_TYPE__TARGETINSTANCE:
                setTARGETINSTANCE(TARGETINSTANCE_EDEFAULT);
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
            case PowrmartPackage.TARGETLOADORDER_TYPE__ORDER:
                return ORDER_EDEFAULT == null ? oRDER != null : !ORDER_EDEFAULT.equals(oRDER);
            case PowrmartPackage.TARGETLOADORDER_TYPE__TARGETINSTANCE:
                return TARGETINSTANCE_EDEFAULT == null ? tARGETINSTANCE != null : !TARGETINSTANCE_EDEFAULT.equals(tARGETINSTANCE);
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
        result.append(" (oRDER: ");
        result.append(oRDER);
        result.append(", tARGETINSTANCE: ");
        result.append(tARGETINSTANCE);
        result.append(')');
        return result.toString();
    }

} //TARGETLOADORDERTypeImpl
