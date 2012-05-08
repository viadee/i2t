/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.RECURRINGType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RECURRING Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.RECURRINGTypeImpl#getDAYS <em>DAYS</em>}</li>
 *   <li>{@link Powrmart.impl.RECURRINGTypeImpl#getHOURS <em>HOURS</em>}</li>
 *   <li>{@link Powrmart.impl.RECURRINGTypeImpl#getMINUTES <em>MINUTES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RECURRINGTypeImpl extends EObjectImpl implements RECURRINGType {
    /**
     * The default value of the '{@link #getDAYS() <em>DAYS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAYS()
     * @generated
     * @ordered
     */
    protected static final Object DAYS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDAYS() <em>DAYS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAYS()
     * @generated
     * @ordered
     */
    protected Object dAYS = DAYS_EDEFAULT;

    /**
     * The default value of the '{@link #getHOURS() <em>HOURS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHOURS()
     * @generated
     * @ordered
     */
    protected static final Object HOURS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHOURS() <em>HOURS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHOURS()
     * @generated
     * @ordered
     */
    protected Object hOURS = HOURS_EDEFAULT;

    /**
     * The default value of the '{@link #getMINUTES() <em>MINUTES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMINUTES()
     * @generated
     * @ordered
     */
    protected static final Object MINUTES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMINUTES() <em>MINUTES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMINUTES()
     * @generated
     * @ordered
     */
    protected Object mINUTES = MINUTES_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RECURRINGTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getRECURRINGType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDAYS() {
        return dAYS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDAYS(Object newDAYS) {
        Object oldDAYS = dAYS;
        dAYS = newDAYS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.RECURRING_TYPE__DAYS, oldDAYS, dAYS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getHOURS() {
        return hOURS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHOURS(Object newHOURS) {
        Object oldHOURS = hOURS;
        hOURS = newHOURS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.RECURRING_TYPE__HOURS, oldHOURS, hOURS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getMINUTES() {
        return mINUTES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMINUTES(Object newMINUTES) {
        Object oldMINUTES = mINUTES;
        mINUTES = newMINUTES;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.RECURRING_TYPE__MINUTES, oldMINUTES, mINUTES));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.RECURRING_TYPE__DAYS:
                return getDAYS();
            case PowrmartPackage.RECURRING_TYPE__HOURS:
                return getHOURS();
            case PowrmartPackage.RECURRING_TYPE__MINUTES:
                return getMINUTES();
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
            case PowrmartPackage.RECURRING_TYPE__DAYS:
                setDAYS(newValue);
                return;
            case PowrmartPackage.RECURRING_TYPE__HOURS:
                setHOURS(newValue);
                return;
            case PowrmartPackage.RECURRING_TYPE__MINUTES:
                setMINUTES(newValue);
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
            case PowrmartPackage.RECURRING_TYPE__DAYS:
                setDAYS(DAYS_EDEFAULT);
                return;
            case PowrmartPackage.RECURRING_TYPE__HOURS:
                setHOURS(HOURS_EDEFAULT);
                return;
            case PowrmartPackage.RECURRING_TYPE__MINUTES:
                setMINUTES(MINUTES_EDEFAULT);
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
            case PowrmartPackage.RECURRING_TYPE__DAYS:
                return DAYS_EDEFAULT == null ? dAYS != null : !DAYS_EDEFAULT.equals(dAYS);
            case PowrmartPackage.RECURRING_TYPE__HOURS:
                return HOURS_EDEFAULT == null ? hOURS != null : !HOURS_EDEFAULT.equals(hOURS);
            case PowrmartPackage.RECURRING_TYPE__MINUTES:
                return MINUTES_EDEFAULT == null ? mINUTES != null : !MINUTES_EDEFAULT.equals(mINUTES);
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
        result.append(" (dAYS: ");
        result.append(dAYS);
        result.append(", hOURS: ");
        result.append(hOURS);
        result.append(", mINUTES: ");
        result.append(mINUTES);
        result.append(')');
        return result.toString();
    }

} //RECURRINGTypeImpl
