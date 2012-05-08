/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ISOUTPUTPORTType;
import Powrmart.PowrmartPackage;
import Powrmart.SAPVARIABLEType;
import Powrmart.SUBTYPEType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAPVARIABLE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SAPVARIABLETypeImpl#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPVARIABLETypeImpl#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPVARIABLETypeImpl#getDSQINSTNAME <em>DSQINSTNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPVARIABLETypeImpl#getISOUTPUTPORT <em>ISOUTPUTPORT</em>}</li>
 *   <li>{@link Powrmart.impl.SAPVARIABLETypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPVARIABLETypeImpl#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.impl.SAPVARIABLETypeImpl#getSCALE <em>SCALE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPVARIABLETypeImpl#getSUBTYPE <em>SUBTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPVARIABLETypeImpl#getVARDEF <em>VARDEF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPVARIABLETypeImpl extends EObjectImpl implements SAPVARIABLEType {
    /**
     * The default value of the '{@link #getDATATYPE() <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPE()
     * @generated
     * @ordered
     */
    protected static final Object DATATYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDATATYPE() <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPE()
     * @generated
     * @ordered
     */
    protected Object dATATYPE = DATATYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getDEFAULTVALUE() <em>DEFAULTVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULTVALUE()
     * @generated
     * @ordered
     */
    protected static final Object DEFAULTVALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDEFAULTVALUE() <em>DEFAULTVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULTVALUE()
     * @generated
     * @ordered
     */
    protected Object dEFAULTVALUE = DEFAULTVALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getDSQINSTNAME() <em>DSQINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDSQINSTNAME()
     * @generated
     * @ordered
     */
    protected static final Object DSQINSTNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDSQINSTNAME() <em>DSQINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDSQINSTNAME()
     * @generated
     * @ordered
     */
    protected Object dSQINSTNAME = DSQINSTNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getISOUTPUTPORT() <em>ISOUTPUTPORT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISOUTPUTPORT()
     * @generated
     * @ordered
     */
    protected static final ISOUTPUTPORTType ISOUTPUTPORT_EDEFAULT = ISOUTPUTPORTType.YES;

    /**
     * The cached value of the '{@link #getISOUTPUTPORT() <em>ISOUTPUTPORT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISOUTPUTPORT()
     * @generated
     * @ordered
     */
    protected ISOUTPUTPORTType iSOUTPUTPORT = ISOUTPUTPORT_EDEFAULT;

    /**
     * This is true if the ISOUTPUTPORT attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSOUTPUTPORTESet;

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
     * The default value of the '{@link #getPRECISION() <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPRECISION()
     * @generated
     * @ordered
     */
    protected static final Object PRECISION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPRECISION() <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPRECISION()
     * @generated
     * @ordered
     */
    protected Object pRECISION = PRECISION_EDEFAULT;

    /**
     * The default value of the '{@link #getSCALE() <em>SCALE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCALE()
     * @generated
     * @ordered
     */
    protected static final Object SCALE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSCALE() <em>SCALE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCALE()
     * @generated
     * @ordered
     */
    protected Object sCALE = SCALE_EDEFAULT;

    /**
     * The default value of the '{@link #getSUBTYPE() <em>SUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSUBTYPE()
     * @generated
     * @ordered
     */
    protected static final SUBTYPEType SUBTYPE_EDEFAULT = SUBTYPEType.STRUCTURETYPE;

    /**
     * The cached value of the '{@link #getSUBTYPE() <em>SUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSUBTYPE()
     * @generated
     * @ordered
     */
    protected SUBTYPEType sUBTYPE = SUBTYPE_EDEFAULT;

    /**
     * This is true if the SUBTYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sUBTYPEESet;

    /**
     * The default value of the '{@link #getVARDEF() <em>VARDEF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVARDEF()
     * @generated
     * @ordered
     */
    protected static final Object VARDEF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVARDEF() <em>VARDEF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVARDEF()
     * @generated
     * @ordered
     */
    protected Object vARDEF = VARDEF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPVARIABLETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSAPVARIABLEType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDATATYPE() {
        return dATATYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPE(Object newDATATYPE) {
        Object oldDATATYPE = dATATYPE;
        dATATYPE = newDATATYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPVARIABLE_TYPE__DATATYPE, oldDATATYPE, dATATYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDEFAULTVALUE() {
        return dEFAULTVALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDEFAULTVALUE(Object newDEFAULTVALUE) {
        Object oldDEFAULTVALUE = dEFAULTVALUE;
        dEFAULTVALUE = newDEFAULTVALUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPVARIABLE_TYPE__DEFAULTVALUE, oldDEFAULTVALUE, dEFAULTVALUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDSQINSTNAME() {
        return dSQINSTNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDSQINSTNAME(Object newDSQINSTNAME) {
        Object oldDSQINSTNAME = dSQINSTNAME;
        dSQINSTNAME = newDSQINSTNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPVARIABLE_TYPE__DSQINSTNAME, oldDSQINSTNAME, dSQINSTNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISOUTPUTPORTType getISOUTPUTPORT() {
        return iSOUTPUTPORT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISOUTPUTPORT(ISOUTPUTPORTType newISOUTPUTPORT) {
        ISOUTPUTPORTType oldISOUTPUTPORT = iSOUTPUTPORT;
        iSOUTPUTPORT = newISOUTPUTPORT == null ? ISOUTPUTPORT_EDEFAULT : newISOUTPUTPORT;
        boolean oldISOUTPUTPORTESet = iSOUTPUTPORTESet;
        iSOUTPUTPORTESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPVARIABLE_TYPE__ISOUTPUTPORT, oldISOUTPUTPORT, iSOUTPUTPORT, !oldISOUTPUTPORTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISOUTPUTPORT() {
        ISOUTPUTPORTType oldISOUTPUTPORT = iSOUTPUTPORT;
        boolean oldISOUTPUTPORTESet = iSOUTPUTPORTESet;
        iSOUTPUTPORT = ISOUTPUTPORT_EDEFAULT;
        iSOUTPUTPORTESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SAPVARIABLE_TYPE__ISOUTPUTPORT, oldISOUTPUTPORT, ISOUTPUTPORT_EDEFAULT, oldISOUTPUTPORTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISOUTPUTPORT() {
        return iSOUTPUTPORTESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPVARIABLE_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPRECISION() {
        return pRECISION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPRECISION(Object newPRECISION) {
        Object oldPRECISION = pRECISION;
        pRECISION = newPRECISION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPVARIABLE_TYPE__PRECISION, oldPRECISION, pRECISION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSCALE() {
        return sCALE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCALE(Object newSCALE) {
        Object oldSCALE = sCALE;
        sCALE = newSCALE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPVARIABLE_TYPE__SCALE, oldSCALE, sCALE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SUBTYPEType getSUBTYPE() {
        return sUBTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSUBTYPE(SUBTYPEType newSUBTYPE) {
        SUBTYPEType oldSUBTYPE = sUBTYPE;
        sUBTYPE = newSUBTYPE == null ? SUBTYPE_EDEFAULT : newSUBTYPE;
        boolean oldSUBTYPEESet = sUBTYPEESet;
        sUBTYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPVARIABLE_TYPE__SUBTYPE, oldSUBTYPE, sUBTYPE, !oldSUBTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSUBTYPE() {
        SUBTYPEType oldSUBTYPE = sUBTYPE;
        boolean oldSUBTYPEESet = sUBTYPEESet;
        sUBTYPE = SUBTYPE_EDEFAULT;
        sUBTYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SAPVARIABLE_TYPE__SUBTYPE, oldSUBTYPE, SUBTYPE_EDEFAULT, oldSUBTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSUBTYPE() {
        return sUBTYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getVARDEF() {
        return vARDEF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVARDEF(Object newVARDEF) {
        Object oldVARDEF = vARDEF;
        vARDEF = newVARDEF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPVARIABLE_TYPE__VARDEF, oldVARDEF, vARDEF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SAPVARIABLE_TYPE__DATATYPE:
                return getDATATYPE();
            case PowrmartPackage.SAPVARIABLE_TYPE__DEFAULTVALUE:
                return getDEFAULTVALUE();
            case PowrmartPackage.SAPVARIABLE_TYPE__DSQINSTNAME:
                return getDSQINSTNAME();
            case PowrmartPackage.SAPVARIABLE_TYPE__ISOUTPUTPORT:
                return getISOUTPUTPORT();
            case PowrmartPackage.SAPVARIABLE_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SAPVARIABLE_TYPE__PRECISION:
                return getPRECISION();
            case PowrmartPackage.SAPVARIABLE_TYPE__SCALE:
                return getSCALE();
            case PowrmartPackage.SAPVARIABLE_TYPE__SUBTYPE:
                return getSUBTYPE();
            case PowrmartPackage.SAPVARIABLE_TYPE__VARDEF:
                return getVARDEF();
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
            case PowrmartPackage.SAPVARIABLE_TYPE__DATATYPE:
                setDATATYPE(newValue);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__DEFAULTVALUE:
                setDEFAULTVALUE(newValue);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__DSQINSTNAME:
                setDSQINSTNAME(newValue);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__ISOUTPUTPORT:
                setISOUTPUTPORT((ISOUTPUTPORTType)newValue);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__PRECISION:
                setPRECISION(newValue);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__SCALE:
                setSCALE(newValue);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__SUBTYPE:
                setSUBTYPE((SUBTYPEType)newValue);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__VARDEF:
                setVARDEF(newValue);
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
            case PowrmartPackage.SAPVARIABLE_TYPE__DATATYPE:
                setDATATYPE(DATATYPE_EDEFAULT);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__DEFAULTVALUE:
                setDEFAULTVALUE(DEFAULTVALUE_EDEFAULT);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__DSQINSTNAME:
                setDSQINSTNAME(DSQINSTNAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__ISOUTPUTPORT:
                unsetISOUTPUTPORT();
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__PRECISION:
                setPRECISION(PRECISION_EDEFAULT);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__SCALE:
                setSCALE(SCALE_EDEFAULT);
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__SUBTYPE:
                unsetSUBTYPE();
                return;
            case PowrmartPackage.SAPVARIABLE_TYPE__VARDEF:
                setVARDEF(VARDEF_EDEFAULT);
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
            case PowrmartPackage.SAPVARIABLE_TYPE__DATATYPE:
                return DATATYPE_EDEFAULT == null ? dATATYPE != null : !DATATYPE_EDEFAULT.equals(dATATYPE);
            case PowrmartPackage.SAPVARIABLE_TYPE__DEFAULTVALUE:
                return DEFAULTVALUE_EDEFAULT == null ? dEFAULTVALUE != null : !DEFAULTVALUE_EDEFAULT.equals(dEFAULTVALUE);
            case PowrmartPackage.SAPVARIABLE_TYPE__DSQINSTNAME:
                return DSQINSTNAME_EDEFAULT == null ? dSQINSTNAME != null : !DSQINSTNAME_EDEFAULT.equals(dSQINSTNAME);
            case PowrmartPackage.SAPVARIABLE_TYPE__ISOUTPUTPORT:
                return isSetISOUTPUTPORT();
            case PowrmartPackage.SAPVARIABLE_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SAPVARIABLE_TYPE__PRECISION:
                return PRECISION_EDEFAULT == null ? pRECISION != null : !PRECISION_EDEFAULT.equals(pRECISION);
            case PowrmartPackage.SAPVARIABLE_TYPE__SCALE:
                return SCALE_EDEFAULT == null ? sCALE != null : !SCALE_EDEFAULT.equals(sCALE);
            case PowrmartPackage.SAPVARIABLE_TYPE__SUBTYPE:
                return isSetSUBTYPE();
            case PowrmartPackage.SAPVARIABLE_TYPE__VARDEF:
                return VARDEF_EDEFAULT == null ? vARDEF != null : !VARDEF_EDEFAULT.equals(vARDEF);
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
        result.append(" (dATATYPE: ");
        result.append(dATATYPE);
        result.append(", dEFAULTVALUE: ");
        result.append(dEFAULTVALUE);
        result.append(", dSQINSTNAME: ");
        result.append(dSQINSTNAME);
        result.append(", iSOUTPUTPORT: ");
        if (iSOUTPUTPORTESet) result.append(iSOUTPUTPORT); else result.append("<unset>");
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", pRECISION: ");
        result.append(pRECISION);
        result.append(", sCALE: ");
        result.append(sCALE);
        result.append(", sUBTYPE: ");
        if (sUBTYPEESet) result.append(sUBTYPE); else result.append("<unset>");
        result.append(", vARDEF: ");
        result.append(vARDEF);
        result.append(')');
        return result.toString();
    }

} //SAPVARIABLETypeImpl
