/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.FOLDERVERSIONType;
import Powrmart.MAPPINGType;
import Powrmart.MAPPLETType;
import Powrmart.PowrmartPackage;
import Powrmart.SHORTCUTType;
import Powrmart.SOURCEType;
import Powrmart.TARGETType;
import Powrmart.TRANSFORMATIONType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FOLDERVERSION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.FOLDERVERSIONTypeImpl#getSOURCE <em>SOURCE</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERVERSIONTypeImpl#getTARGET <em>TARGET</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERVERSIONTypeImpl#getTRANSFORMATION <em>TRANSFORMATION</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERVERSIONTypeImpl#getMAPPLET <em>MAPPLET</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERVERSIONTypeImpl#getMAPPING <em>MAPPING</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERVERSIONTypeImpl#getSHORTCUT <em>SHORTCUT</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERVERSIONTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERVERSIONTypeImpl#getNAME <em>NAME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FOLDERVERSIONTypeImpl extends EObjectImpl implements FOLDERVERSIONType {
    /**
     * The cached value of the '{@link #getSOURCE() <em>SOURCE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSOURCE()
     * @generated
     * @ordered
     */
    protected EList<SOURCEType> sOURCE;

    /**
     * The cached value of the '{@link #getTARGET() <em>TARGET</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTARGET()
     * @generated
     * @ordered
     */
    protected EList<TARGETType> tARGET;

    /**
     * The cached value of the '{@link #getTRANSFORMATION() <em>TRANSFORMATION</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTRANSFORMATION()
     * @generated
     * @ordered
     */
    protected EList<TRANSFORMATIONType> tRANSFORMATION;

    /**
     * The cached value of the '{@link #getMAPPLET() <em>MAPPLET</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAPPLET()
     * @generated
     * @ordered
     */
    protected EList<MAPPLETType> mAPPLET;

    /**
     * The cached value of the '{@link #getMAPPING() <em>MAPPING</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAPPING()
     * @generated
     * @ordered
     */
    protected EList<MAPPINGType> mAPPING;

    /**
     * The cached value of the '{@link #getSHORTCUT() <em>SHORTCUT</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSHORTCUT()
     * @generated
     * @ordered
     */
    protected EList<SHORTCUTType> sHORTCUT;

    /**
     * The default value of the '{@link #getDESCRIPTION() <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESCRIPTION()
     * @generated
     * @ordered
     */
    protected static final Object DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDESCRIPTION() <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESCRIPTION()
     * @generated
     * @ordered
     */
    protected Object dESCRIPTION = DESCRIPTION_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FOLDERVERSIONTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getFOLDERVERSIONType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SOURCEType> getSOURCE() {
        if (sOURCE == null) {
            sOURCE = new EObjectContainmentEList<SOURCEType>(SOURCEType.class, this, PowrmartPackage.FOLDERVERSION_TYPE__SOURCE);
        }
        return sOURCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TARGETType> getTARGET() {
        if (tARGET == null) {
            tARGET = new EObjectContainmentEList<TARGETType>(TARGETType.class, this, PowrmartPackage.FOLDERVERSION_TYPE__TARGET);
        }
        return tARGET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TRANSFORMATIONType> getTRANSFORMATION() {
        if (tRANSFORMATION == null) {
            tRANSFORMATION = new EObjectContainmentEList<TRANSFORMATIONType>(TRANSFORMATIONType.class, this, PowrmartPackage.FOLDERVERSION_TYPE__TRANSFORMATION);
        }
        return tRANSFORMATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MAPPLETType> getMAPPLET() {
        if (mAPPLET == null) {
            mAPPLET = new EObjectContainmentEList<MAPPLETType>(MAPPLETType.class, this, PowrmartPackage.FOLDERVERSION_TYPE__MAPPLET);
        }
        return mAPPLET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MAPPINGType> getMAPPING() {
        if (mAPPING == null) {
            mAPPING = new EObjectContainmentEList<MAPPINGType>(MAPPINGType.class, this, PowrmartPackage.FOLDERVERSION_TYPE__MAPPING);
        }
        return mAPPING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SHORTCUTType> getSHORTCUT() {
        if (sHORTCUT == null) {
            sHORTCUT = new EObjectContainmentEList<SHORTCUTType>(SHORTCUTType.class, this, PowrmartPackage.FOLDERVERSION_TYPE__SHORTCUT);
        }
        return sHORTCUT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDESCRIPTION() {
        return dESCRIPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDESCRIPTION(Object newDESCRIPTION) {
        Object oldDESCRIPTION = dESCRIPTION;
        dESCRIPTION = newDESCRIPTION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FOLDERVERSION_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FOLDERVERSION_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.FOLDERVERSION_TYPE__SOURCE:
                return ((InternalEList<?>)getSOURCE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDERVERSION_TYPE__TARGET:
                return ((InternalEList<?>)getTARGET()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDERVERSION_TYPE__TRANSFORMATION:
                return ((InternalEList<?>)getTRANSFORMATION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDERVERSION_TYPE__MAPPLET:
                return ((InternalEList<?>)getMAPPLET()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDERVERSION_TYPE__MAPPING:
                return ((InternalEList<?>)getMAPPING()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDERVERSION_TYPE__SHORTCUT:
                return ((InternalEList<?>)getSHORTCUT()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.FOLDERVERSION_TYPE__SOURCE:
                return getSOURCE();
            case PowrmartPackage.FOLDERVERSION_TYPE__TARGET:
                return getTARGET();
            case PowrmartPackage.FOLDERVERSION_TYPE__TRANSFORMATION:
                return getTRANSFORMATION();
            case PowrmartPackage.FOLDERVERSION_TYPE__MAPPLET:
                return getMAPPLET();
            case PowrmartPackage.FOLDERVERSION_TYPE__MAPPING:
                return getMAPPING();
            case PowrmartPackage.FOLDERVERSION_TYPE__SHORTCUT:
                return getSHORTCUT();
            case PowrmartPackage.FOLDERVERSION_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.FOLDERVERSION_TYPE__NAME:
                return getNAME();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PowrmartPackage.FOLDERVERSION_TYPE__SOURCE:
                getSOURCE().clear();
                getSOURCE().addAll((Collection<? extends SOURCEType>)newValue);
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__TARGET:
                getTARGET().clear();
                getTARGET().addAll((Collection<? extends TARGETType>)newValue);
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__TRANSFORMATION:
                getTRANSFORMATION().clear();
                getTRANSFORMATION().addAll((Collection<? extends TRANSFORMATIONType>)newValue);
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__MAPPLET:
                getMAPPLET().clear();
                getMAPPLET().addAll((Collection<? extends MAPPLETType>)newValue);
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__MAPPING:
                getMAPPING().clear();
                getMAPPING().addAll((Collection<? extends MAPPINGType>)newValue);
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__SHORTCUT:
                getSHORTCUT().clear();
                getSHORTCUT().addAll((Collection<? extends SHORTCUTType>)newValue);
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__NAME:
                setNAME(newValue);
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
            case PowrmartPackage.FOLDERVERSION_TYPE__SOURCE:
                getSOURCE().clear();
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__TARGET:
                getTARGET().clear();
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__TRANSFORMATION:
                getTRANSFORMATION().clear();
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__MAPPLET:
                getMAPPLET().clear();
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__MAPPING:
                getMAPPING().clear();
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__SHORTCUT:
                getSHORTCUT().clear();
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.FOLDERVERSION_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
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
            case PowrmartPackage.FOLDERVERSION_TYPE__SOURCE:
                return sOURCE != null && !sOURCE.isEmpty();
            case PowrmartPackage.FOLDERVERSION_TYPE__TARGET:
                return tARGET != null && !tARGET.isEmpty();
            case PowrmartPackage.FOLDERVERSION_TYPE__TRANSFORMATION:
                return tRANSFORMATION != null && !tRANSFORMATION.isEmpty();
            case PowrmartPackage.FOLDERVERSION_TYPE__MAPPLET:
                return mAPPLET != null && !mAPPLET.isEmpty();
            case PowrmartPackage.FOLDERVERSION_TYPE__MAPPING:
                return mAPPING != null && !mAPPING.isEmpty();
            case PowrmartPackage.FOLDERVERSION_TYPE__SHORTCUT:
                return sHORTCUT != null && !sHORTCUT.isEmpty();
            case PowrmartPackage.FOLDERVERSION_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.FOLDERVERSION_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
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
        result.append(" (dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(')');
        return result.toString();
    }

} //FOLDERVERSIONTypeImpl
