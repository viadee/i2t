/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ISOPTIONALType1;
import Powrmart.ISREFERENCEType;
import Powrmart.PowrmartPackage;
import Powrmart.SAPFUNCPARAMType;
import Powrmart.SUBTYPEType1;
import Powrmart.TYPEType3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAPFUNCPARAM Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SAPFUNCPARAMTypeImpl#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCPARAMTypeImpl#getDEF <em>DEF</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCPARAMTypeImpl#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCPARAMTypeImpl#getISOPTIONAL <em>ISOPTIONAL</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCPARAMTypeImpl#getISREFERENCE <em>ISREFERENCE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCPARAMTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCPARAMTypeImpl#getORDER <em>ORDER</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCPARAMTypeImpl#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCPARAMTypeImpl#getSCALE <em>SCALE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCPARAMTypeImpl#getSUBTYPE <em>SUBTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCPARAMTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPFUNCPARAMTypeImpl extends EObjectImpl implements SAPFUNCPARAMType {
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
     * The default value of the '{@link #getDEF() <em>DEF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEF()
     * @generated
     * @ordered
     */
    protected static final Object DEF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDEF() <em>DEF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEF()
     * @generated
     * @ordered
     */
    protected Object dEF = DEF_EDEFAULT;

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
     * The default value of the '{@link #getISOPTIONAL() <em>ISOPTIONAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISOPTIONAL()
     * @generated
     * @ordered
     */
    protected static final ISOPTIONALType1 ISOPTIONAL_EDEFAULT = ISOPTIONALType1.YES;

    /**
     * The cached value of the '{@link #getISOPTIONAL() <em>ISOPTIONAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISOPTIONAL()
     * @generated
     * @ordered
     */
    protected ISOPTIONALType1 iSOPTIONAL = ISOPTIONAL_EDEFAULT;

    /**
     * This is true if the ISOPTIONAL attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSOPTIONALESet;

    /**
     * The default value of the '{@link #getISREFERENCE() <em>ISREFERENCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISREFERENCE()
     * @generated
     * @ordered
     */
    protected static final ISREFERENCEType ISREFERENCE_EDEFAULT = ISREFERENCEType.YES;

    /**
     * The cached value of the '{@link #getISREFERENCE() <em>ISREFERENCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISREFERENCE()
     * @generated
     * @ordered
     */
    protected ISREFERENCEType iSREFERENCE = ISREFERENCE_EDEFAULT;

    /**
     * This is true if the ISREFERENCE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSREFERENCEESet;

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
     * The default value of the '{@link #getORDER() <em>ORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getORDER()
     * @generated
     * @ordered
     */
    protected static final Object ORDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getORDER() <em>ORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getORDER()
     * @generated
     * @ordered
     */
    protected Object oRDER = ORDER_EDEFAULT;

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
    protected static final SUBTYPEType1 SUBTYPE_EDEFAULT = SUBTYPEType1.STRUCTURETYPE;

    /**
     * The cached value of the '{@link #getSUBTYPE() <em>SUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSUBTYPE()
     * @generated
     * @ordered
     */
    protected SUBTYPEType1 sUBTYPE = SUBTYPE_EDEFAULT;

    /**
     * This is true if the SUBTYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sUBTYPEESet;

    /**
     * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected static final TYPEType3 TYPE_EDEFAULT = TYPEType3.INPUT;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected TYPEType3 tYPE = TYPE_EDEFAULT;

    /**
     * This is true if the TYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tYPEESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPFUNCPARAMTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSAPFUNCPARAMType();
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCPARAM_TYPE__DATATYPE, oldDATATYPE, dATATYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDEF() {
        return dEF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDEF(Object newDEF) {
        Object oldDEF = dEF;
        dEF = newDEF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCPARAM_TYPE__DEF, oldDEF, dEF));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCPARAM_TYPE__DEFAULTVALUE, oldDEFAULTVALUE, dEFAULTVALUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISOPTIONALType1 getISOPTIONAL() {
        return iSOPTIONAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISOPTIONAL(ISOPTIONALType1 newISOPTIONAL) {
        ISOPTIONALType1 oldISOPTIONAL = iSOPTIONAL;
        iSOPTIONAL = newISOPTIONAL == null ? ISOPTIONAL_EDEFAULT : newISOPTIONAL;
        boolean oldISOPTIONALESet = iSOPTIONALESet;
        iSOPTIONALESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCPARAM_TYPE__ISOPTIONAL, oldISOPTIONAL, iSOPTIONAL, !oldISOPTIONALESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISOPTIONAL() {
        ISOPTIONALType1 oldISOPTIONAL = iSOPTIONAL;
        boolean oldISOPTIONALESet = iSOPTIONALESet;
        iSOPTIONAL = ISOPTIONAL_EDEFAULT;
        iSOPTIONALESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SAPFUNCPARAM_TYPE__ISOPTIONAL, oldISOPTIONAL, ISOPTIONAL_EDEFAULT, oldISOPTIONALESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISOPTIONAL() {
        return iSOPTIONALESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISREFERENCEType getISREFERENCE() {
        return iSREFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISREFERENCE(ISREFERENCEType newISREFERENCE) {
        ISREFERENCEType oldISREFERENCE = iSREFERENCE;
        iSREFERENCE = newISREFERENCE == null ? ISREFERENCE_EDEFAULT : newISREFERENCE;
        boolean oldISREFERENCEESet = iSREFERENCEESet;
        iSREFERENCEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCPARAM_TYPE__ISREFERENCE, oldISREFERENCE, iSREFERENCE, !oldISREFERENCEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISREFERENCE() {
        ISREFERENCEType oldISREFERENCE = iSREFERENCE;
        boolean oldISREFERENCEESet = iSREFERENCEESet;
        iSREFERENCE = ISREFERENCE_EDEFAULT;
        iSREFERENCEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SAPFUNCPARAM_TYPE__ISREFERENCE, oldISREFERENCE, ISREFERENCE_EDEFAULT, oldISREFERENCEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISREFERENCE() {
        return iSREFERENCEESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCPARAM_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getORDER() {
        return oRDER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setORDER(Object newORDER) {
        Object oldORDER = oRDER;
        oRDER = newORDER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCPARAM_TYPE__ORDER, oldORDER, oRDER));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCPARAM_TYPE__PRECISION, oldPRECISION, pRECISION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCPARAM_TYPE__SCALE, oldSCALE, sCALE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SUBTYPEType1 getSUBTYPE() {
        return sUBTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSUBTYPE(SUBTYPEType1 newSUBTYPE) {
        SUBTYPEType1 oldSUBTYPE = sUBTYPE;
        sUBTYPE = newSUBTYPE == null ? SUBTYPE_EDEFAULT : newSUBTYPE;
        boolean oldSUBTYPEESet = sUBTYPEESet;
        sUBTYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCPARAM_TYPE__SUBTYPE, oldSUBTYPE, sUBTYPE, !oldSUBTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSUBTYPE() {
        SUBTYPEType1 oldSUBTYPE = sUBTYPE;
        boolean oldSUBTYPEESet = sUBTYPEESet;
        sUBTYPE = SUBTYPE_EDEFAULT;
        sUBTYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SAPFUNCPARAM_TYPE__SUBTYPE, oldSUBTYPE, SUBTYPE_EDEFAULT, oldSUBTYPEESet));
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
    public TYPEType3 getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTYPE(TYPEType3 newTYPE) {
        TYPEType3 oldTYPE = tYPE;
        tYPE = newTYPE == null ? TYPE_EDEFAULT : newTYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCPARAM_TYPE__TYPE, oldTYPE, tYPE, !oldTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTYPE() {
        TYPEType3 oldTYPE = tYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPE = TYPE_EDEFAULT;
        tYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SAPFUNCPARAM_TYPE__TYPE, oldTYPE, TYPE_EDEFAULT, oldTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTYPE() {
        return tYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SAPFUNCPARAM_TYPE__DATATYPE:
                return getDATATYPE();
            case PowrmartPackage.SAPFUNCPARAM_TYPE__DEF:
                return getDEF();
            case PowrmartPackage.SAPFUNCPARAM_TYPE__DEFAULTVALUE:
                return getDEFAULTVALUE();
            case PowrmartPackage.SAPFUNCPARAM_TYPE__ISOPTIONAL:
                return getISOPTIONAL();
            case PowrmartPackage.SAPFUNCPARAM_TYPE__ISREFERENCE:
                return getISREFERENCE();
            case PowrmartPackage.SAPFUNCPARAM_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SAPFUNCPARAM_TYPE__ORDER:
                return getORDER();
            case PowrmartPackage.SAPFUNCPARAM_TYPE__PRECISION:
                return getPRECISION();
            case PowrmartPackage.SAPFUNCPARAM_TYPE__SCALE:
                return getSCALE();
            case PowrmartPackage.SAPFUNCPARAM_TYPE__SUBTYPE:
                return getSUBTYPE();
            case PowrmartPackage.SAPFUNCPARAM_TYPE__TYPE:
                return getTYPE();
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
            case PowrmartPackage.SAPFUNCPARAM_TYPE__DATATYPE:
                setDATATYPE(newValue);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__DEF:
                setDEF(newValue);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__DEFAULTVALUE:
                setDEFAULTVALUE(newValue);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__ISOPTIONAL:
                setISOPTIONAL((ISOPTIONALType1)newValue);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__ISREFERENCE:
                setISREFERENCE((ISREFERENCEType)newValue);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__ORDER:
                setORDER(newValue);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__PRECISION:
                setPRECISION(newValue);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__SCALE:
                setSCALE(newValue);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__SUBTYPE:
                setSUBTYPE((SUBTYPEType1)newValue);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__TYPE:
                setTYPE((TYPEType3)newValue);
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
            case PowrmartPackage.SAPFUNCPARAM_TYPE__DATATYPE:
                setDATATYPE(DATATYPE_EDEFAULT);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__DEF:
                setDEF(DEF_EDEFAULT);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__DEFAULTVALUE:
                setDEFAULTVALUE(DEFAULTVALUE_EDEFAULT);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__ISOPTIONAL:
                unsetISOPTIONAL();
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__ISREFERENCE:
                unsetISREFERENCE();
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__ORDER:
                setORDER(ORDER_EDEFAULT);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__PRECISION:
                setPRECISION(PRECISION_EDEFAULT);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__SCALE:
                setSCALE(SCALE_EDEFAULT);
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__SUBTYPE:
                unsetSUBTYPE();
                return;
            case PowrmartPackage.SAPFUNCPARAM_TYPE__TYPE:
                unsetTYPE();
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
            case PowrmartPackage.SAPFUNCPARAM_TYPE__DATATYPE:
                return DATATYPE_EDEFAULT == null ? dATATYPE != null : !DATATYPE_EDEFAULT.equals(dATATYPE);
            case PowrmartPackage.SAPFUNCPARAM_TYPE__DEF:
                return DEF_EDEFAULT == null ? dEF != null : !DEF_EDEFAULT.equals(dEF);
            case PowrmartPackage.SAPFUNCPARAM_TYPE__DEFAULTVALUE:
                return DEFAULTVALUE_EDEFAULT == null ? dEFAULTVALUE != null : !DEFAULTVALUE_EDEFAULT.equals(dEFAULTVALUE);
            case PowrmartPackage.SAPFUNCPARAM_TYPE__ISOPTIONAL:
                return isSetISOPTIONAL();
            case PowrmartPackage.SAPFUNCPARAM_TYPE__ISREFERENCE:
                return isSetISREFERENCE();
            case PowrmartPackage.SAPFUNCPARAM_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SAPFUNCPARAM_TYPE__ORDER:
                return ORDER_EDEFAULT == null ? oRDER != null : !ORDER_EDEFAULT.equals(oRDER);
            case PowrmartPackage.SAPFUNCPARAM_TYPE__PRECISION:
                return PRECISION_EDEFAULT == null ? pRECISION != null : !PRECISION_EDEFAULT.equals(pRECISION);
            case PowrmartPackage.SAPFUNCPARAM_TYPE__SCALE:
                return SCALE_EDEFAULT == null ? sCALE != null : !SCALE_EDEFAULT.equals(sCALE);
            case PowrmartPackage.SAPFUNCPARAM_TYPE__SUBTYPE:
                return isSetSUBTYPE();
            case PowrmartPackage.SAPFUNCPARAM_TYPE__TYPE:
                return isSetTYPE();
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
        result.append(", dEF: ");
        result.append(dEF);
        result.append(", dEFAULTVALUE: ");
        result.append(dEFAULTVALUE);
        result.append(", iSOPTIONAL: ");
        if (iSOPTIONALESet) result.append(iSOPTIONAL); else result.append("<unset>");
        result.append(", iSREFERENCE: ");
        if (iSREFERENCEESet) result.append(iSREFERENCE); else result.append("<unset>");
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", oRDER: ");
        result.append(oRDER);
        result.append(", pRECISION: ");
        result.append(pRECISION);
        result.append(", sCALE: ");
        result.append(sCALE);
        result.append(", sUBTYPE: ");
        if (sUBTYPEESet) result.append(sUBTYPE); else result.append("<unset>");
        result.append(", tYPE: ");
        if (tYPEESet) result.append(tYPE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //SAPFUNCPARAMTypeImpl
