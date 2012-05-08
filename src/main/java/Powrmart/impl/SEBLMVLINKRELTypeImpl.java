/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SEBLMVLINKRELType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SEBLMVLINKREL Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SEBLMVLINKRELTypeImpl#getDESTMVLINK <em>DESTMVLINK</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLMVLINKRELTypeImpl#getFIELD <em>FIELD</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLMVLINKRELTypeImpl#getSRCMVLINK <em>SRCMVLINK</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SEBLMVLINKRELTypeImpl extends EObjectImpl implements SEBLMVLINKRELType {
    /**
     * The default value of the '{@link #getDESTMVLINK() <em>DESTMVLINK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESTMVLINK()
     * @generated
     * @ordered
     */
    protected static final Object DESTMVLINK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDESTMVLINK() <em>DESTMVLINK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESTMVLINK()
     * @generated
     * @ordered
     */
    protected Object dESTMVLINK = DESTMVLINK_EDEFAULT;

    /**
     * The default value of the '{@link #getFIELD() <em>FIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELD()
     * @generated
     * @ordered
     */
    protected static final Object FIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFIELD() <em>FIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELD()
     * @generated
     * @ordered
     */
    protected Object fIELD = FIELD_EDEFAULT;

    /**
     * The default value of the '{@link #getSRCMVLINK() <em>SRCMVLINK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSRCMVLINK()
     * @generated
     * @ordered
     */
    protected static final Object SRCMVLINK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSRCMVLINK() <em>SRCMVLINK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSRCMVLINK()
     * @generated
     * @ordered
     */
    protected Object sRCMVLINK = SRCMVLINK_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SEBLMVLINKRELTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSEBLMVLINKRELType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDESTMVLINK() {
        return dESTMVLINK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDESTMVLINK(Object newDESTMVLINK) {
        Object oldDESTMVLINK = dESTMVLINK;
        dESTMVLINK = newDESTMVLINK;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLMVLINKREL_TYPE__DESTMVLINK, oldDESTMVLINK, dESTMVLINK));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFIELD() {
        return fIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFIELD(Object newFIELD) {
        Object oldFIELD = fIELD;
        fIELD = newFIELD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLMVLINKREL_TYPE__FIELD, oldFIELD, fIELD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSRCMVLINK() {
        return sRCMVLINK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSRCMVLINK(Object newSRCMVLINK) {
        Object oldSRCMVLINK = sRCMVLINK;
        sRCMVLINK = newSRCMVLINK;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLMVLINKREL_TYPE__SRCMVLINK, oldSRCMVLINK, sRCMVLINK));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SEBLMVLINKREL_TYPE__DESTMVLINK:
                return getDESTMVLINK();
            case PowrmartPackage.SEBLMVLINKREL_TYPE__FIELD:
                return getFIELD();
            case PowrmartPackage.SEBLMVLINKREL_TYPE__SRCMVLINK:
                return getSRCMVLINK();
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
            case PowrmartPackage.SEBLMVLINKREL_TYPE__DESTMVLINK:
                setDESTMVLINK(newValue);
                return;
            case PowrmartPackage.SEBLMVLINKREL_TYPE__FIELD:
                setFIELD(newValue);
                return;
            case PowrmartPackage.SEBLMVLINKREL_TYPE__SRCMVLINK:
                setSRCMVLINK(newValue);
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
            case PowrmartPackage.SEBLMVLINKREL_TYPE__DESTMVLINK:
                setDESTMVLINK(DESTMVLINK_EDEFAULT);
                return;
            case PowrmartPackage.SEBLMVLINKREL_TYPE__FIELD:
                setFIELD(FIELD_EDEFAULT);
                return;
            case PowrmartPackage.SEBLMVLINKREL_TYPE__SRCMVLINK:
                setSRCMVLINK(SRCMVLINK_EDEFAULT);
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
            case PowrmartPackage.SEBLMVLINKREL_TYPE__DESTMVLINK:
                return DESTMVLINK_EDEFAULT == null ? dESTMVLINK != null : !DESTMVLINK_EDEFAULT.equals(dESTMVLINK);
            case PowrmartPackage.SEBLMVLINKREL_TYPE__FIELD:
                return FIELD_EDEFAULT == null ? fIELD != null : !FIELD_EDEFAULT.equals(fIELD);
            case PowrmartPackage.SEBLMVLINKREL_TYPE__SRCMVLINK:
                return SRCMVLINK_EDEFAULT == null ? sRCMVLINK != null : !SRCMVLINK_EDEFAULT.equals(sRCMVLINK);
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
        result.append(" (dESTMVLINK: ");
        result.append(dESTMVLINK);
        result.append(", fIELD: ");
        result.append(fIELD);
        result.append(", sRCMVLINK: ");
        result.append(sRCMVLINK);
        result.append(')');
        return result.toString();
    }

} //SEBLMVLINKRELTypeImpl
