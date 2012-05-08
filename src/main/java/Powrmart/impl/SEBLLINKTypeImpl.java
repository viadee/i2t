/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SEBLLINKType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SEBLLINK Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SEBLLINKTypeImpl#getCHILDBC <em>CHILDBC</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLLINKTypeImpl#getDESTBCBASETABLE <em>DESTBCBASETABLE</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLLINKTypeImpl#getDESTCOL <em>DESTCOL</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLLINKTypeImpl#getINTERCHILDCOL <em>INTERCHILDCOL</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLLINKTypeImpl#getINTERPARENTCOL <em>INTERPARENTCOL</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLLINKTypeImpl#getINTERTABLE <em>INTERTABLE</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLLINKTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLLINKTypeImpl#getPARENTBC <em>PARENTBC</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLLINKTypeImpl#getPRIMARYID <em>PRIMARYID</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLLINKTypeImpl#getSRCCOL <em>SRCCOL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SEBLLINKTypeImpl extends EObjectImpl implements SEBLLINKType {
    /**
     * The default value of the '{@link #getCHILDBC() <em>CHILDBC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCHILDBC()
     * @generated
     * @ordered
     */
    protected static final Object CHILDBC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCHILDBC() <em>CHILDBC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCHILDBC()
     * @generated
     * @ordered
     */
    protected Object cHILDBC = CHILDBC_EDEFAULT;

    /**
     * The default value of the '{@link #getDESTBCBASETABLE() <em>DESTBCBASETABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESTBCBASETABLE()
     * @generated
     * @ordered
     */
    protected static final Object DESTBCBASETABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDESTBCBASETABLE() <em>DESTBCBASETABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESTBCBASETABLE()
     * @generated
     * @ordered
     */
    protected Object dESTBCBASETABLE = DESTBCBASETABLE_EDEFAULT;

    /**
     * The default value of the '{@link #getDESTCOL() <em>DESTCOL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESTCOL()
     * @generated
     * @ordered
     */
    protected static final Object DESTCOL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDESTCOL() <em>DESTCOL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESTCOL()
     * @generated
     * @ordered
     */
    protected Object dESTCOL = DESTCOL_EDEFAULT;

    /**
     * The default value of the '{@link #getINTERCHILDCOL() <em>INTERCHILDCOL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINTERCHILDCOL()
     * @generated
     * @ordered
     */
    protected static final Object INTERCHILDCOL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getINTERCHILDCOL() <em>INTERCHILDCOL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINTERCHILDCOL()
     * @generated
     * @ordered
     */
    protected Object iNTERCHILDCOL = INTERCHILDCOL_EDEFAULT;

    /**
     * The default value of the '{@link #getINTERPARENTCOL() <em>INTERPARENTCOL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINTERPARENTCOL()
     * @generated
     * @ordered
     */
    protected static final Object INTERPARENTCOL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getINTERPARENTCOL() <em>INTERPARENTCOL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINTERPARENTCOL()
     * @generated
     * @ordered
     */
    protected Object iNTERPARENTCOL = INTERPARENTCOL_EDEFAULT;

    /**
     * The default value of the '{@link #getINTERTABLE() <em>INTERTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINTERTABLE()
     * @generated
     * @ordered
     */
    protected static final Object INTERTABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getINTERTABLE() <em>INTERTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINTERTABLE()
     * @generated
     * @ordered
     */
    protected Object iNTERTABLE = INTERTABLE_EDEFAULT;

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
     * The default value of the '{@link #getPARENTBC() <em>PARENTBC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENTBC()
     * @generated
     * @ordered
     */
    protected static final Object PARENTBC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPARENTBC() <em>PARENTBC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENTBC()
     * @generated
     * @ordered
     */
    protected Object pARENTBC = PARENTBC_EDEFAULT;

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
     * The default value of the '{@link #getSRCCOL() <em>SRCCOL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSRCCOL()
     * @generated
     * @ordered
     */
    protected static final Object SRCCOL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSRCCOL() <em>SRCCOL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSRCCOL()
     * @generated
     * @ordered
     */
    protected Object sRCCOL = SRCCOL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SEBLLINKTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSEBLLINKType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCHILDBC() {
        return cHILDBC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCHILDBC(Object newCHILDBC) {
        Object oldCHILDBC = cHILDBC;
        cHILDBC = newCHILDBC;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLLINK_TYPE__CHILDBC, oldCHILDBC, cHILDBC));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDESTBCBASETABLE() {
        return dESTBCBASETABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDESTBCBASETABLE(Object newDESTBCBASETABLE) {
        Object oldDESTBCBASETABLE = dESTBCBASETABLE;
        dESTBCBASETABLE = newDESTBCBASETABLE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLLINK_TYPE__DESTBCBASETABLE, oldDESTBCBASETABLE, dESTBCBASETABLE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDESTCOL() {
        return dESTCOL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDESTCOL(Object newDESTCOL) {
        Object oldDESTCOL = dESTCOL;
        dESTCOL = newDESTCOL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLLINK_TYPE__DESTCOL, oldDESTCOL, dESTCOL));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getINTERCHILDCOL() {
        return iNTERCHILDCOL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setINTERCHILDCOL(Object newINTERCHILDCOL) {
        Object oldINTERCHILDCOL = iNTERCHILDCOL;
        iNTERCHILDCOL = newINTERCHILDCOL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLLINK_TYPE__INTERCHILDCOL, oldINTERCHILDCOL, iNTERCHILDCOL));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getINTERPARENTCOL() {
        return iNTERPARENTCOL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setINTERPARENTCOL(Object newINTERPARENTCOL) {
        Object oldINTERPARENTCOL = iNTERPARENTCOL;
        iNTERPARENTCOL = newINTERPARENTCOL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLLINK_TYPE__INTERPARENTCOL, oldINTERPARENTCOL, iNTERPARENTCOL));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getINTERTABLE() {
        return iNTERTABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setINTERTABLE(Object newINTERTABLE) {
        Object oldINTERTABLE = iNTERTABLE;
        iNTERTABLE = newINTERTABLE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLLINK_TYPE__INTERTABLE, oldINTERTABLE, iNTERTABLE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLLINK_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPARENTBC() {
        return pARENTBC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARENTBC(Object newPARENTBC) {
        Object oldPARENTBC = pARENTBC;
        pARENTBC = newPARENTBC;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLLINK_TYPE__PARENTBC, oldPARENTBC, pARENTBC));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLLINK_TYPE__PRIMARYID, oldPRIMARYID, pRIMARYID));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSRCCOL() {
        return sRCCOL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSRCCOL(Object newSRCCOL) {
        Object oldSRCCOL = sRCCOL;
        sRCCOL = newSRCCOL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLLINK_TYPE__SRCCOL, oldSRCCOL, sRCCOL));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SEBLLINK_TYPE__CHILDBC:
                return getCHILDBC();
            case PowrmartPackage.SEBLLINK_TYPE__DESTBCBASETABLE:
                return getDESTBCBASETABLE();
            case PowrmartPackage.SEBLLINK_TYPE__DESTCOL:
                return getDESTCOL();
            case PowrmartPackage.SEBLLINK_TYPE__INTERCHILDCOL:
                return getINTERCHILDCOL();
            case PowrmartPackage.SEBLLINK_TYPE__INTERPARENTCOL:
                return getINTERPARENTCOL();
            case PowrmartPackage.SEBLLINK_TYPE__INTERTABLE:
                return getINTERTABLE();
            case PowrmartPackage.SEBLLINK_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SEBLLINK_TYPE__PARENTBC:
                return getPARENTBC();
            case PowrmartPackage.SEBLLINK_TYPE__PRIMARYID:
                return getPRIMARYID();
            case PowrmartPackage.SEBLLINK_TYPE__SRCCOL:
                return getSRCCOL();
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
            case PowrmartPackage.SEBLLINK_TYPE__CHILDBC:
                setCHILDBC(newValue);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__DESTBCBASETABLE:
                setDESTBCBASETABLE(newValue);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__DESTCOL:
                setDESTCOL(newValue);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__INTERCHILDCOL:
                setINTERCHILDCOL(newValue);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__INTERPARENTCOL:
                setINTERPARENTCOL(newValue);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__INTERTABLE:
                setINTERTABLE(newValue);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__PARENTBC:
                setPARENTBC(newValue);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__PRIMARYID:
                setPRIMARYID(newValue);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__SRCCOL:
                setSRCCOL(newValue);
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
            case PowrmartPackage.SEBLLINK_TYPE__CHILDBC:
                setCHILDBC(CHILDBC_EDEFAULT);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__DESTBCBASETABLE:
                setDESTBCBASETABLE(DESTBCBASETABLE_EDEFAULT);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__DESTCOL:
                setDESTCOL(DESTCOL_EDEFAULT);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__INTERCHILDCOL:
                setINTERCHILDCOL(INTERCHILDCOL_EDEFAULT);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__INTERPARENTCOL:
                setINTERPARENTCOL(INTERPARENTCOL_EDEFAULT);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__INTERTABLE:
                setINTERTABLE(INTERTABLE_EDEFAULT);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__PARENTBC:
                setPARENTBC(PARENTBC_EDEFAULT);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__PRIMARYID:
                setPRIMARYID(PRIMARYID_EDEFAULT);
                return;
            case PowrmartPackage.SEBLLINK_TYPE__SRCCOL:
                setSRCCOL(SRCCOL_EDEFAULT);
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
            case PowrmartPackage.SEBLLINK_TYPE__CHILDBC:
                return CHILDBC_EDEFAULT == null ? cHILDBC != null : !CHILDBC_EDEFAULT.equals(cHILDBC);
            case PowrmartPackage.SEBLLINK_TYPE__DESTBCBASETABLE:
                return DESTBCBASETABLE_EDEFAULT == null ? dESTBCBASETABLE != null : !DESTBCBASETABLE_EDEFAULT.equals(dESTBCBASETABLE);
            case PowrmartPackage.SEBLLINK_TYPE__DESTCOL:
                return DESTCOL_EDEFAULT == null ? dESTCOL != null : !DESTCOL_EDEFAULT.equals(dESTCOL);
            case PowrmartPackage.SEBLLINK_TYPE__INTERCHILDCOL:
                return INTERCHILDCOL_EDEFAULT == null ? iNTERCHILDCOL != null : !INTERCHILDCOL_EDEFAULT.equals(iNTERCHILDCOL);
            case PowrmartPackage.SEBLLINK_TYPE__INTERPARENTCOL:
                return INTERPARENTCOL_EDEFAULT == null ? iNTERPARENTCOL != null : !INTERPARENTCOL_EDEFAULT.equals(iNTERPARENTCOL);
            case PowrmartPackage.SEBLLINK_TYPE__INTERTABLE:
                return INTERTABLE_EDEFAULT == null ? iNTERTABLE != null : !INTERTABLE_EDEFAULT.equals(iNTERTABLE);
            case PowrmartPackage.SEBLLINK_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SEBLLINK_TYPE__PARENTBC:
                return PARENTBC_EDEFAULT == null ? pARENTBC != null : !PARENTBC_EDEFAULT.equals(pARENTBC);
            case PowrmartPackage.SEBLLINK_TYPE__PRIMARYID:
                return PRIMARYID_EDEFAULT == null ? pRIMARYID != null : !PRIMARYID_EDEFAULT.equals(pRIMARYID);
            case PowrmartPackage.SEBLLINK_TYPE__SRCCOL:
                return SRCCOL_EDEFAULT == null ? sRCCOL != null : !SRCCOL_EDEFAULT.equals(sRCCOL);
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
        result.append(" (cHILDBC: ");
        result.append(cHILDBC);
        result.append(", dESTBCBASETABLE: ");
        result.append(dESTBCBASETABLE);
        result.append(", dESTCOL: ");
        result.append(dESTCOL);
        result.append(", iNTERCHILDCOL: ");
        result.append(iNTERCHILDCOL);
        result.append(", iNTERPARENTCOL: ");
        result.append(iNTERPARENTCOL);
        result.append(", iNTERTABLE: ");
        result.append(iNTERTABLE);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", pARENTBC: ");
        result.append(pARENTBC);
        result.append(", pRIMARYID: ");
        result.append(pRIMARYID);
        result.append(", sRCCOL: ");
        result.append(sRCCOL);
        result.append(')');
        return result.toString();
    }

} //SEBLLINKTypeImpl
