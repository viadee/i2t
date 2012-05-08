/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.KEYRANGEType;
import Powrmart.PowrmartPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KEYRANGE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.KEYRANGETypeImpl#getENDRANGE <em>ENDRANGE</em>}</li>
 *   <li>{@link Powrmart.impl.KEYRANGETypeImpl#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.impl.KEYRANGETypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.KEYRANGETypeImpl#getSRCINSTANCENAME <em>SRCINSTANCENAME</em>}</li>
 *   <li>{@link Powrmart.impl.KEYRANGETypeImpl#getSTARTRANGE <em>STARTRANGE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KEYRANGETypeImpl extends EObjectImpl implements KEYRANGEType {
    /**
     * The default value of the '{@link #getENDRANGE() <em>ENDRANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getENDRANGE()
     * @generated
     * @ordered
     */
    protected static final Object ENDRANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getENDRANGE() <em>ENDRANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getENDRANGE()
     * @generated
     * @ordered
     */
    protected Object eNDRANGE = ENDRANGE_EDEFAULT;

    /**
     * The default value of the '{@link #getGROUP() <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGROUP()
     * @generated
     * @ordered
     */
    protected static final Object GROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGROUP() <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGROUP()
     * @generated
     * @ordered
     */
    protected Object gROUP = GROUP_EDEFAULT;

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
     * The default value of the '{@link #getSRCINSTANCENAME() <em>SRCINSTANCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSRCINSTANCENAME()
     * @generated
     * @ordered
     */
    protected static final Object SRCINSTANCENAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSRCINSTANCENAME() <em>SRCINSTANCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSRCINSTANCENAME()
     * @generated
     * @ordered
     */
    protected Object sRCINSTANCENAME = SRCINSTANCENAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSTARTRANGE() <em>STARTRANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTARTRANGE()
     * @generated
     * @ordered
     */
    protected static final Object STARTRANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSTARTRANGE() <em>STARTRANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTARTRANGE()
     * @generated
     * @ordered
     */
    protected Object sTARTRANGE = STARTRANGE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KEYRANGETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getKEYRANGEType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getENDRANGE() {
        return eNDRANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setENDRANGE(Object newENDRANGE) {
        Object oldENDRANGE = eNDRANGE;
        eNDRANGE = newENDRANGE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.KEYRANGE_TYPE__ENDRANGE, oldENDRANGE, eNDRANGE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getGROUP() {
        return gROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGROUP(Object newGROUP) {
        Object oldGROUP = gROUP;
        gROUP = newGROUP;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.KEYRANGE_TYPE__GROUP, oldGROUP, gROUP));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.KEYRANGE_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSRCINSTANCENAME() {
        return sRCINSTANCENAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSRCINSTANCENAME(Object newSRCINSTANCENAME) {
        Object oldSRCINSTANCENAME = sRCINSTANCENAME;
        sRCINSTANCENAME = newSRCINSTANCENAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.KEYRANGE_TYPE__SRCINSTANCENAME, oldSRCINSTANCENAME, sRCINSTANCENAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSTARTRANGE() {
        return sTARTRANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSTARTRANGE(Object newSTARTRANGE) {
        Object oldSTARTRANGE = sTARTRANGE;
        sTARTRANGE = newSTARTRANGE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.KEYRANGE_TYPE__STARTRANGE, oldSTARTRANGE, sTARTRANGE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.KEYRANGE_TYPE__ENDRANGE:
                return getENDRANGE();
            case PowrmartPackage.KEYRANGE_TYPE__GROUP:
                return getGROUP();
            case PowrmartPackage.KEYRANGE_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.KEYRANGE_TYPE__SRCINSTANCENAME:
                return getSRCINSTANCENAME();
            case PowrmartPackage.KEYRANGE_TYPE__STARTRANGE:
                return getSTARTRANGE();
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
            case PowrmartPackage.KEYRANGE_TYPE__ENDRANGE:
                setENDRANGE(newValue);
                return;
            case PowrmartPackage.KEYRANGE_TYPE__GROUP:
                setGROUP(newValue);
                return;
            case PowrmartPackage.KEYRANGE_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.KEYRANGE_TYPE__SRCINSTANCENAME:
                setSRCINSTANCENAME(newValue);
                return;
            case PowrmartPackage.KEYRANGE_TYPE__STARTRANGE:
                setSTARTRANGE(newValue);
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
            case PowrmartPackage.KEYRANGE_TYPE__ENDRANGE:
                setENDRANGE(ENDRANGE_EDEFAULT);
                return;
            case PowrmartPackage.KEYRANGE_TYPE__GROUP:
                setGROUP(GROUP_EDEFAULT);
                return;
            case PowrmartPackage.KEYRANGE_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.KEYRANGE_TYPE__SRCINSTANCENAME:
                setSRCINSTANCENAME(SRCINSTANCENAME_EDEFAULT);
                return;
            case PowrmartPackage.KEYRANGE_TYPE__STARTRANGE:
                setSTARTRANGE(STARTRANGE_EDEFAULT);
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
            case PowrmartPackage.KEYRANGE_TYPE__ENDRANGE:
                return ENDRANGE_EDEFAULT == null ? eNDRANGE != null : !ENDRANGE_EDEFAULT.equals(eNDRANGE);
            case PowrmartPackage.KEYRANGE_TYPE__GROUP:
                return GROUP_EDEFAULT == null ? gROUP != null : !GROUP_EDEFAULT.equals(gROUP);
            case PowrmartPackage.KEYRANGE_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.KEYRANGE_TYPE__SRCINSTANCENAME:
                return SRCINSTANCENAME_EDEFAULT == null ? sRCINSTANCENAME != null : !SRCINSTANCENAME_EDEFAULT.equals(sRCINSTANCENAME);
            case PowrmartPackage.KEYRANGE_TYPE__STARTRANGE:
                return STARTRANGE_EDEFAULT == null ? sTARTRANGE != null : !STARTRANGE_EDEFAULT.equals(sTARTRANGE);
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
        result.append(" (eNDRANGE: ");
        result.append(eNDRANGE);
        result.append(", gROUP: ");
        result.append(gROUP);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", sRCINSTANCENAME: ");
        result.append(sRCINSTANCENAME);
        result.append(", sTARTRANGE: ");
        result.append(sTARTRANGE);
        result.append(')');
        return result.toString();
    }

} //KEYRANGETypeImpl
