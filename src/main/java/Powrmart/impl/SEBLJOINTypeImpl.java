/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.OUTERJOINRELType;
import Powrmart.PowrmartPackage;
import Powrmart.SEBLJOINType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SEBLJOIN Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SEBLJOINTypeImpl#getDESTCOL <em>DESTCOL</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLJOINTypeImpl#getFKTABLE <em>FKTABLE</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLJOINTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLJOINTypeImpl#getOUTERJOINREL <em>OUTERJOINREL</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLJOINTypeImpl#getPKTABLE <em>PKTABLE</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLJOINTypeImpl#getSRCCOL <em>SRCCOL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SEBLJOINTypeImpl extends EObjectImpl implements SEBLJOINType {
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
     * The default value of the '{@link #getFKTABLE() <em>FKTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFKTABLE()
     * @generated
     * @ordered
     */
    protected static final Object FKTABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFKTABLE() <em>FKTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFKTABLE()
     * @generated
     * @ordered
     */
    protected Object fKTABLE = FKTABLE_EDEFAULT;

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
     * The default value of the '{@link #getOUTERJOINREL() <em>OUTERJOINREL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOUTERJOINREL()
     * @generated
     * @ordered
     */
    protected static final OUTERJOINRELType OUTERJOINREL_EDEFAULT = OUTERJOINRELType.YES;

    /**
     * The cached value of the '{@link #getOUTERJOINREL() <em>OUTERJOINREL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOUTERJOINREL()
     * @generated
     * @ordered
     */
    protected OUTERJOINRELType oUTERJOINREL = OUTERJOINREL_EDEFAULT;

    /**
     * This is true if the OUTERJOINREL attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oUTERJOINRELESet;

    /**
     * The default value of the '{@link #getPKTABLE() <em>PKTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPKTABLE()
     * @generated
     * @ordered
     */
    protected static final Object PKTABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPKTABLE() <em>PKTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPKTABLE()
     * @generated
     * @ordered
     */
    protected Object pKTABLE = PKTABLE_EDEFAULT;

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
    protected SEBLJOINTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSEBLJOINType();
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLJOIN_TYPE__DESTCOL, oldDESTCOL, dESTCOL));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFKTABLE() {
        return fKTABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFKTABLE(Object newFKTABLE) {
        Object oldFKTABLE = fKTABLE;
        fKTABLE = newFKTABLE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLJOIN_TYPE__FKTABLE, oldFKTABLE, fKTABLE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLJOIN_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OUTERJOINRELType getOUTERJOINREL() {
        return oUTERJOINREL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOUTERJOINREL(OUTERJOINRELType newOUTERJOINREL) {
        OUTERJOINRELType oldOUTERJOINREL = oUTERJOINREL;
        oUTERJOINREL = newOUTERJOINREL == null ? OUTERJOINREL_EDEFAULT : newOUTERJOINREL;
        boolean oldOUTERJOINRELESet = oUTERJOINRELESet;
        oUTERJOINRELESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLJOIN_TYPE__OUTERJOINREL, oldOUTERJOINREL, oUTERJOINREL, !oldOUTERJOINRELESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOUTERJOINREL() {
        OUTERJOINRELType oldOUTERJOINREL = oUTERJOINREL;
        boolean oldOUTERJOINRELESet = oUTERJOINRELESet;
        oUTERJOINREL = OUTERJOINREL_EDEFAULT;
        oUTERJOINRELESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SEBLJOIN_TYPE__OUTERJOINREL, oldOUTERJOINREL, OUTERJOINREL_EDEFAULT, oldOUTERJOINRELESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetOUTERJOINREL() {
        return oUTERJOINRELESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPKTABLE() {
        return pKTABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPKTABLE(Object newPKTABLE) {
        Object oldPKTABLE = pKTABLE;
        pKTABLE = newPKTABLE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLJOIN_TYPE__PKTABLE, oldPKTABLE, pKTABLE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SEBLJOIN_TYPE__SRCCOL, oldSRCCOL, sRCCOL));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SEBLJOIN_TYPE__DESTCOL:
                return getDESTCOL();
            case PowrmartPackage.SEBLJOIN_TYPE__FKTABLE:
                return getFKTABLE();
            case PowrmartPackage.SEBLJOIN_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SEBLJOIN_TYPE__OUTERJOINREL:
                return getOUTERJOINREL();
            case PowrmartPackage.SEBLJOIN_TYPE__PKTABLE:
                return getPKTABLE();
            case PowrmartPackage.SEBLJOIN_TYPE__SRCCOL:
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
            case PowrmartPackage.SEBLJOIN_TYPE__DESTCOL:
                setDESTCOL(newValue);
                return;
            case PowrmartPackage.SEBLJOIN_TYPE__FKTABLE:
                setFKTABLE(newValue);
                return;
            case PowrmartPackage.SEBLJOIN_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SEBLJOIN_TYPE__OUTERJOINREL:
                setOUTERJOINREL((OUTERJOINRELType)newValue);
                return;
            case PowrmartPackage.SEBLJOIN_TYPE__PKTABLE:
                setPKTABLE(newValue);
                return;
            case PowrmartPackage.SEBLJOIN_TYPE__SRCCOL:
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
            case PowrmartPackage.SEBLJOIN_TYPE__DESTCOL:
                setDESTCOL(DESTCOL_EDEFAULT);
                return;
            case PowrmartPackage.SEBLJOIN_TYPE__FKTABLE:
                setFKTABLE(FKTABLE_EDEFAULT);
                return;
            case PowrmartPackage.SEBLJOIN_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SEBLJOIN_TYPE__OUTERJOINREL:
                unsetOUTERJOINREL();
                return;
            case PowrmartPackage.SEBLJOIN_TYPE__PKTABLE:
                setPKTABLE(PKTABLE_EDEFAULT);
                return;
            case PowrmartPackage.SEBLJOIN_TYPE__SRCCOL:
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
            case PowrmartPackage.SEBLJOIN_TYPE__DESTCOL:
                return DESTCOL_EDEFAULT == null ? dESTCOL != null : !DESTCOL_EDEFAULT.equals(dESTCOL);
            case PowrmartPackage.SEBLJOIN_TYPE__FKTABLE:
                return FKTABLE_EDEFAULT == null ? fKTABLE != null : !FKTABLE_EDEFAULT.equals(fKTABLE);
            case PowrmartPackage.SEBLJOIN_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SEBLJOIN_TYPE__OUTERJOINREL:
                return isSetOUTERJOINREL();
            case PowrmartPackage.SEBLJOIN_TYPE__PKTABLE:
                return PKTABLE_EDEFAULT == null ? pKTABLE != null : !PKTABLE_EDEFAULT.equals(pKTABLE);
            case PowrmartPackage.SEBLJOIN_TYPE__SRCCOL:
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
        result.append(" (dESTCOL: ");
        result.append(dESTCOL);
        result.append(", fKTABLE: ");
        result.append(fKTABLE);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", oUTERJOINREL: ");
        if (oUTERJOINRELESet) result.append(oUTERJOINREL); else result.append("<unset>");
        result.append(", pKTABLE: ");
        result.append(pKTABLE);
        result.append(", sRCCOL: ");
        result.append(sRCCOL);
        result.append(')');
        return result.toString();
    }

} //SEBLJOINTypeImpl
