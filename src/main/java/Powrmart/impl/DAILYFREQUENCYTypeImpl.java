/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.DAILYFREQUENCYType;
import Powrmart.PowrmartPackage;
import Powrmart.RUNONCEType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAILYFREQUENCY Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.DAILYFREQUENCYTypeImpl#getHOURS <em>HOURS</em>}</li>
 *   <li>{@link Powrmart.impl.DAILYFREQUENCYTypeImpl#getMINUTES <em>MINUTES</em>}</li>
 *   <li>{@link Powrmart.impl.DAILYFREQUENCYTypeImpl#getRUNONCE <em>RUNONCE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAILYFREQUENCYTypeImpl extends EObjectImpl implements DAILYFREQUENCYType {
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
     * The default value of the '{@link #getRUNONCE() <em>RUNONCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRUNONCE()
     * @generated
     * @ordered
     */
    protected static final RUNONCEType RUNONCE_EDEFAULT = RUNONCEType.YES;

    /**
     * The cached value of the '{@link #getRUNONCE() <em>RUNONCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRUNONCE()
     * @generated
     * @ordered
     */
    protected RUNONCEType rUNONCE = RUNONCE_EDEFAULT;

    /**
     * This is true if the RUNONCE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rUNONCEESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DAILYFREQUENCYTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getDAILYFREQUENCYType();
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.DAILYFREQUENCY_TYPE__HOURS, oldHOURS, hOURS));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.DAILYFREQUENCY_TYPE__MINUTES, oldMINUTES, mINUTES));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RUNONCEType getRUNONCE() {
        return rUNONCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRUNONCE(RUNONCEType newRUNONCE) {
        RUNONCEType oldRUNONCE = rUNONCE;
        rUNONCE = newRUNONCE == null ? RUNONCE_EDEFAULT : newRUNONCE;
        boolean oldRUNONCEESet = rUNONCEESet;
        rUNONCEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.DAILYFREQUENCY_TYPE__RUNONCE, oldRUNONCE, rUNONCE, !oldRUNONCEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRUNONCE() {
        RUNONCEType oldRUNONCE = rUNONCE;
        boolean oldRUNONCEESet = rUNONCEESet;
        rUNONCE = RUNONCE_EDEFAULT;
        rUNONCEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.DAILYFREQUENCY_TYPE__RUNONCE, oldRUNONCE, RUNONCE_EDEFAULT, oldRUNONCEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRUNONCE() {
        return rUNONCEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.DAILYFREQUENCY_TYPE__HOURS:
                return getHOURS();
            case PowrmartPackage.DAILYFREQUENCY_TYPE__MINUTES:
                return getMINUTES();
            case PowrmartPackage.DAILYFREQUENCY_TYPE__RUNONCE:
                return getRUNONCE();
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
            case PowrmartPackage.DAILYFREQUENCY_TYPE__HOURS:
                setHOURS(newValue);
                return;
            case PowrmartPackage.DAILYFREQUENCY_TYPE__MINUTES:
                setMINUTES(newValue);
                return;
            case PowrmartPackage.DAILYFREQUENCY_TYPE__RUNONCE:
                setRUNONCE((RUNONCEType)newValue);
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
            case PowrmartPackage.DAILYFREQUENCY_TYPE__HOURS:
                setHOURS(HOURS_EDEFAULT);
                return;
            case PowrmartPackage.DAILYFREQUENCY_TYPE__MINUTES:
                setMINUTES(MINUTES_EDEFAULT);
                return;
            case PowrmartPackage.DAILYFREQUENCY_TYPE__RUNONCE:
                unsetRUNONCE();
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
            case PowrmartPackage.DAILYFREQUENCY_TYPE__HOURS:
                return HOURS_EDEFAULT == null ? hOURS != null : !HOURS_EDEFAULT.equals(hOURS);
            case PowrmartPackage.DAILYFREQUENCY_TYPE__MINUTES:
                return MINUTES_EDEFAULT == null ? mINUTES != null : !MINUTES_EDEFAULT.equals(mINUTES);
            case PowrmartPackage.DAILYFREQUENCY_TYPE__RUNONCE:
                return isSetRUNONCE();
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
        result.append(" (hOURS: ");
        result.append(hOURS);
        result.append(", mINUTES: ");
        result.append(mINUTES);
        result.append(", rUNONCE: ");
        if (rUNONCEESet) result.append(rUNONCE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //DAILYFREQUENCYTypeImpl
