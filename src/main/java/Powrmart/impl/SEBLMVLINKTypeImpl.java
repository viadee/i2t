/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SEBLMVLINKType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SEBLMVLINK Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SEBLMVLINKTypeImpl#getBCNAME <em>BCNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLMVLINKTypeImpl#getDESTBC <em>DESTBC</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLMVLINKTypeImpl#getDESTLINK <em>DESTLINK</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLMVLINKTypeImpl#getMVLINK <em>MVLINK</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLMVLINKTypeImpl#getPRIMARYID <em>PRIMARYID</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLMVLINKTypeImpl#getSRCFIELD <em>SRCFIELD</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SEBLMVLINKTypeImpl extends EObjectImpl implements SEBLMVLINKType {
    /**
     * The default value of the '{@link #getBCNAME() <em>BCNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBCNAME()
     * @generated
     * @ordered
     */
    protected static final Object BCNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBCNAME() <em>BCNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBCNAME()
     * @generated
     * @ordered
     */
    protected Object bCNAME = BCNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getDESTBC() <em>DESTBC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESTBC()
     * @generated
     * @ordered
     */
    protected static final Object DESTBC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDESTBC() <em>DESTBC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESTBC()
     * @generated
     * @ordered
     */
    protected Object dESTBC = DESTBC_EDEFAULT;

    /**
     * The default value of the '{@link #getDESTLINK() <em>DESTLINK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESTLINK()
     * @generated
     * @ordered
     */
    protected static final Object DESTLINK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDESTLINK() <em>DESTLINK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESTLINK()
     * @generated
     * @ordered
     */
    protected Object dESTLINK = DESTLINK_EDEFAULT;

    /**
     * The default value of the '{@link #getMVLINK() <em>MVLINK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMVLINK()
     * @generated
     * @ordered
     */
    protected static final Object MVLINK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMVLINK() <em>MVLINK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMVLINK()
     * @generated
     * @ordered
     */
    protected Object mVLINK = MVLINK_EDEFAULT;

    /**
     * The default value of the '{@link #getPRIMARYID() <em>PRIMARYID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPRIMARYID()
     * @generated
     * @ordered
     */
    protected static final Object PRIMARYID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPRIMARYID() <em>PRIMARYID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPRIMARYID()
     * @generated
     * @ordered
     */
    protected Object pRIMARYID = PRIMARYID_EDEFAULT;

    /**
     * The default value of the '{@link #getSRCFIELD() <em>SRCFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSRCFIELD()
     * @generated
     * @ordered
     */
    protected static final Object SRCFIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSRCFIELD() <em>SRCFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSRCFIELD()
     * @generated
     * @ordered
     */
    protected Object sRCFIELD = SRCFIELD_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SEBLMVLINKTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSEBLMVLINKType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getBCNAME() {
        return bCNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBCNAME(Object newBCNAME) {
        Object oldBCNAME = bCNAME;
        bCNAME = newBCNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLMVLINK_TYPE__BCNAME, oldBCNAME, bCNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDESTBC() {
        return dESTBC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDESTBC(Object newDESTBC) {
        Object oldDESTBC = dESTBC;
        dESTBC = newDESTBC;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLMVLINK_TYPE__DESTBC, oldDESTBC, dESTBC));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDESTLINK() {
        return dESTLINK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDESTLINK(Object newDESTLINK) {
        Object oldDESTLINK = dESTLINK;
        dESTLINK = newDESTLINK;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLMVLINK_TYPE__DESTLINK, oldDESTLINK, dESTLINK));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getMVLINK() {
        return mVLINK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMVLINK(Object newMVLINK) {
        Object oldMVLINK = mVLINK;
        mVLINK = newMVLINK;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLMVLINK_TYPE__MVLINK, oldMVLINK, mVLINK));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPRIMARYID() {
        return pRIMARYID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPRIMARYID(Object newPRIMARYID) {
        Object oldPRIMARYID = pRIMARYID;
        pRIMARYID = newPRIMARYID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLMVLINK_TYPE__PRIMARYID, oldPRIMARYID, pRIMARYID));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSRCFIELD() {
        return sRCFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSRCFIELD(Object newSRCFIELD) {
        Object oldSRCFIELD = sRCFIELD;
        sRCFIELD = newSRCFIELD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLMVLINK_TYPE__SRCFIELD, oldSRCFIELD, sRCFIELD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SEBLMVLINK_TYPE__BCNAME:
                return getBCNAME();
            case PowrmartPackage.SEBLMVLINK_TYPE__DESTBC:
                return getDESTBC();
            case PowrmartPackage.SEBLMVLINK_TYPE__DESTLINK:
                return getDESTLINK();
            case PowrmartPackage.SEBLMVLINK_TYPE__MVLINK:
                return getMVLINK();
            case PowrmartPackage.SEBLMVLINK_TYPE__PRIMARYID:
                return getPRIMARYID();
            case PowrmartPackage.SEBLMVLINK_TYPE__SRCFIELD:
                return getSRCFIELD();
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
            case PowrmartPackage.SEBLMVLINK_TYPE__BCNAME:
                setBCNAME(newValue);
                return;
            case PowrmartPackage.SEBLMVLINK_TYPE__DESTBC:
                setDESTBC(newValue);
                return;
            case PowrmartPackage.SEBLMVLINK_TYPE__DESTLINK:
                setDESTLINK(newValue);
                return;
            case PowrmartPackage.SEBLMVLINK_TYPE__MVLINK:
                setMVLINK(newValue);
                return;
            case PowrmartPackage.SEBLMVLINK_TYPE__PRIMARYID:
                setPRIMARYID(newValue);
                return;
            case PowrmartPackage.SEBLMVLINK_TYPE__SRCFIELD:
                setSRCFIELD(newValue);
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
            case PowrmartPackage.SEBLMVLINK_TYPE__BCNAME:
                setBCNAME(BCNAME_EDEFAULT);
                return;
            case PowrmartPackage.SEBLMVLINK_TYPE__DESTBC:
                setDESTBC(DESTBC_EDEFAULT);
                return;
            case PowrmartPackage.SEBLMVLINK_TYPE__DESTLINK:
                setDESTLINK(DESTLINK_EDEFAULT);
                return;
            case PowrmartPackage.SEBLMVLINK_TYPE__MVLINK:
                setMVLINK(MVLINK_EDEFAULT);
                return;
            case PowrmartPackage.SEBLMVLINK_TYPE__PRIMARYID:
                setPRIMARYID(PRIMARYID_EDEFAULT);
                return;
            case PowrmartPackage.SEBLMVLINK_TYPE__SRCFIELD:
                setSRCFIELD(SRCFIELD_EDEFAULT);
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
            case PowrmartPackage.SEBLMVLINK_TYPE__BCNAME:
                return BCNAME_EDEFAULT == null ? bCNAME != null : !BCNAME_EDEFAULT.equals(bCNAME);
            case PowrmartPackage.SEBLMVLINK_TYPE__DESTBC:
                return DESTBC_EDEFAULT == null ? dESTBC != null : !DESTBC_EDEFAULT.equals(dESTBC);
            case PowrmartPackage.SEBLMVLINK_TYPE__DESTLINK:
                return DESTLINK_EDEFAULT == null ? dESTLINK != null : !DESTLINK_EDEFAULT.equals(dESTLINK);
            case PowrmartPackage.SEBLMVLINK_TYPE__MVLINK:
                return MVLINK_EDEFAULT == null ? mVLINK != null : !MVLINK_EDEFAULT.equals(mVLINK);
            case PowrmartPackage.SEBLMVLINK_TYPE__PRIMARYID:
                return PRIMARYID_EDEFAULT == null ? pRIMARYID != null : !PRIMARYID_EDEFAULT.equals(pRIMARYID);
            case PowrmartPackage.SEBLMVLINK_TYPE__SRCFIELD:
                return SRCFIELD_EDEFAULT == null ? sRCFIELD != null : !SRCFIELD_EDEFAULT.equals(sRCFIELD);
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
        result.append(" (bCNAME: ");
        result.append(bCNAME);
        result.append(", dESTBC: ");
        result.append(dESTBC);
        result.append(", dESTLINK: ");
        result.append(dESTLINK);
        result.append(", mVLINK: ");
        result.append(mVLINK);
        result.append(", pRIMARYID: ");
        result.append(pRIMARYID);
        result.append(", sRCFIELD: ");
        result.append(sRCFIELD);
        result.append(')');
        return result.toString();
    }

} //SEBLMVLINKTypeImpl
