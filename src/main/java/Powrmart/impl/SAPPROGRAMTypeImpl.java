/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ISVALIDType3;
import Powrmart.PowrmartPackage;
import Powrmart.SAPPROGRAMType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAPPROGRAM Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SAPPROGRAMTypeImpl#getCLIENTSPACE <em>CLIENTSPACE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMTypeImpl#getHOSTNAME <em>HOSTNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMTypeImpl#getINSTALLTIME <em>INSTALLTIME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMTypeImpl#getISVALID <em>ISVALID</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMTypeImpl#getPROGRAMTYPE <em>PROGRAMTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMTypeImpl#getUSERNAME <em>USERNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPPROGRAMTypeImpl extends EObjectImpl implements SAPPROGRAMType {
    /**
     * The default value of the '{@link #getCLIENTSPACE() <em>CLIENTSPACE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCLIENTSPACE()
     * @generated
     * @ordered
     */
    protected static final Object CLIENTSPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCLIENTSPACE() <em>CLIENTSPACE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCLIENTSPACE()
     * @generated
     * @ordered
     */
    protected Object cLIENTSPACE = CLIENTSPACE_EDEFAULT;

    /**
     * The default value of the '{@link #getHOSTNAME() <em>HOSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHOSTNAME()
     * @generated
     * @ordered
     */
    protected static final Object HOSTNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHOSTNAME() <em>HOSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHOSTNAME()
     * @generated
     * @ordered
     */
    protected Object hOSTNAME = HOSTNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getINSTALLTIME() <em>INSTALLTIME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINSTALLTIME()
     * @generated
     * @ordered
     */
    protected static final Object INSTALLTIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getINSTALLTIME() <em>INSTALLTIME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINSTALLTIME()
     * @generated
     * @ordered
     */
    protected Object iNSTALLTIME = INSTALLTIME_EDEFAULT;

    /**
     * The default value of the '{@link #getISVALID() <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISVALID()
     * @generated
     * @ordered
     */
    protected static final ISVALIDType3 ISVALID_EDEFAULT = ISVALIDType3.YES;

    /**
     * The cached value of the '{@link #getISVALID() <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISVALID()
     * @generated
     * @ordered
     */
    protected ISVALIDType3 iSVALID = ISVALID_EDEFAULT;

    /**
     * This is true if the ISVALID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSVALIDESet;

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
     * The default value of the '{@link #getPROGRAMTYPE() <em>PROGRAMTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPROGRAMTYPE()
     * @generated
     * @ordered
     */
    protected static final Object PROGRAMTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPROGRAMTYPE() <em>PROGRAMTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPROGRAMTYPE()
     * @generated
     * @ordered
     */
    protected Object pROGRAMTYPE = PROGRAMTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getUSERNAME() <em>USERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUSERNAME()
     * @generated
     * @ordered
     */
    protected static final Object USERNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUSERNAME() <em>USERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUSERNAME()
     * @generated
     * @ordered
     */
    protected Object uSERNAME = USERNAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPPROGRAMTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSAPPROGRAMType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCLIENTSPACE() {
        return cLIENTSPACE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCLIENTSPACE(Object newCLIENTSPACE) {
        Object oldCLIENTSPACE = cLIENTSPACE;
        cLIENTSPACE = newCLIENTSPACE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAM_TYPE__CLIENTSPACE, oldCLIENTSPACE, cLIENTSPACE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getHOSTNAME() {
        return hOSTNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHOSTNAME(Object newHOSTNAME) {
        Object oldHOSTNAME = hOSTNAME;
        hOSTNAME = newHOSTNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAM_TYPE__HOSTNAME, oldHOSTNAME, hOSTNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getINSTALLTIME() {
        return iNSTALLTIME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setINSTALLTIME(Object newINSTALLTIME) {
        Object oldINSTALLTIME = iNSTALLTIME;
        iNSTALLTIME = newINSTALLTIME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAM_TYPE__INSTALLTIME, oldINSTALLTIME, iNSTALLTIME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISVALIDType3 getISVALID() {
        return iSVALID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISVALID(ISVALIDType3 newISVALID) {
        ISVALIDType3 oldISVALID = iSVALID;
        iSVALID = newISVALID == null ? ISVALID_EDEFAULT : newISVALID;
        boolean oldISVALIDESet = iSVALIDESet;
        iSVALIDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAM_TYPE__ISVALID, oldISVALID, iSVALID, !oldISVALIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISVALID() {
        ISVALIDType3 oldISVALID = iSVALID;
        boolean oldISVALIDESet = iSVALIDESet;
        iSVALID = ISVALID_EDEFAULT;
        iSVALIDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SAPPROGRAM_TYPE__ISVALID, oldISVALID, ISVALID_EDEFAULT, oldISVALIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISVALID() {
        return iSVALIDESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAM_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPROGRAMTYPE() {
        return pROGRAMTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPROGRAMTYPE(Object newPROGRAMTYPE) {
        Object oldPROGRAMTYPE = pROGRAMTYPE;
        pROGRAMTYPE = newPROGRAMTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAM_TYPE__PROGRAMTYPE, oldPROGRAMTYPE, pROGRAMTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getUSERNAME() {
        return uSERNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUSERNAME(Object newUSERNAME) {
        Object oldUSERNAME = uSERNAME;
        uSERNAME = newUSERNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAM_TYPE__USERNAME, oldUSERNAME, uSERNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SAPPROGRAM_TYPE__CLIENTSPACE:
                return getCLIENTSPACE();
            case PowrmartPackage.SAPPROGRAM_TYPE__HOSTNAME:
                return getHOSTNAME();
            case PowrmartPackage.SAPPROGRAM_TYPE__INSTALLTIME:
                return getINSTALLTIME();
            case PowrmartPackage.SAPPROGRAM_TYPE__ISVALID:
                return getISVALID();
            case PowrmartPackage.SAPPROGRAM_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SAPPROGRAM_TYPE__PROGRAMTYPE:
                return getPROGRAMTYPE();
            case PowrmartPackage.SAPPROGRAM_TYPE__USERNAME:
                return getUSERNAME();
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
            case PowrmartPackage.SAPPROGRAM_TYPE__CLIENTSPACE:
                setCLIENTSPACE(newValue);
                return;
            case PowrmartPackage.SAPPROGRAM_TYPE__HOSTNAME:
                setHOSTNAME(newValue);
                return;
            case PowrmartPackage.SAPPROGRAM_TYPE__INSTALLTIME:
                setINSTALLTIME(newValue);
                return;
            case PowrmartPackage.SAPPROGRAM_TYPE__ISVALID:
                setISVALID((ISVALIDType3)newValue);
                return;
            case PowrmartPackage.SAPPROGRAM_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SAPPROGRAM_TYPE__PROGRAMTYPE:
                setPROGRAMTYPE(newValue);
                return;
            case PowrmartPackage.SAPPROGRAM_TYPE__USERNAME:
                setUSERNAME(newValue);
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
            case PowrmartPackage.SAPPROGRAM_TYPE__CLIENTSPACE:
                setCLIENTSPACE(CLIENTSPACE_EDEFAULT);
                return;
            case PowrmartPackage.SAPPROGRAM_TYPE__HOSTNAME:
                setHOSTNAME(HOSTNAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPPROGRAM_TYPE__INSTALLTIME:
                setINSTALLTIME(INSTALLTIME_EDEFAULT);
                return;
            case PowrmartPackage.SAPPROGRAM_TYPE__ISVALID:
                unsetISVALID();
                return;
            case PowrmartPackage.SAPPROGRAM_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPPROGRAM_TYPE__PROGRAMTYPE:
                setPROGRAMTYPE(PROGRAMTYPE_EDEFAULT);
                return;
            case PowrmartPackage.SAPPROGRAM_TYPE__USERNAME:
                setUSERNAME(USERNAME_EDEFAULT);
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
            case PowrmartPackage.SAPPROGRAM_TYPE__CLIENTSPACE:
                return CLIENTSPACE_EDEFAULT == null ? cLIENTSPACE != null : !CLIENTSPACE_EDEFAULT.equals(cLIENTSPACE);
            case PowrmartPackage.SAPPROGRAM_TYPE__HOSTNAME:
                return HOSTNAME_EDEFAULT == null ? hOSTNAME != null : !HOSTNAME_EDEFAULT.equals(hOSTNAME);
            case PowrmartPackage.SAPPROGRAM_TYPE__INSTALLTIME:
                return INSTALLTIME_EDEFAULT == null ? iNSTALLTIME != null : !INSTALLTIME_EDEFAULT.equals(iNSTALLTIME);
            case PowrmartPackage.SAPPROGRAM_TYPE__ISVALID:
                return isSetISVALID();
            case PowrmartPackage.SAPPROGRAM_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SAPPROGRAM_TYPE__PROGRAMTYPE:
                return PROGRAMTYPE_EDEFAULT == null ? pROGRAMTYPE != null : !PROGRAMTYPE_EDEFAULT.equals(pROGRAMTYPE);
            case PowrmartPackage.SAPPROGRAM_TYPE__USERNAME:
                return USERNAME_EDEFAULT == null ? uSERNAME != null : !USERNAME_EDEFAULT.equals(uSERNAME);
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
        result.append(" (cLIENTSPACE: ");
        result.append(cLIENTSPACE);
        result.append(", hOSTNAME: ");
        result.append(hOSTNAME);
        result.append(", iNSTALLTIME: ");
        result.append(iNSTALLTIME);
        result.append(", iSVALID: ");
        if (iSVALIDESet) result.append(iSVALID); else result.append("<unset>");
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", pROGRAMTYPE: ");
        result.append(pROGRAMTYPE);
        result.append(", uSERNAME: ");
        result.append(uSERNAME);
        result.append(')');
        return result.toString();
    }

} //SAPPROGRAMTypeImpl
