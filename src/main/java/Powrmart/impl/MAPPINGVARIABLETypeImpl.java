/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.AGGFUNCTIONType;
import Powrmart.ISEXPRESSIONVARIABLEType;
import Powrmart.ISPARAMType;
import Powrmart.MAPPINGVARIABLEType;
import Powrmart.PowrmartPackage;
import Powrmart.USERDEFINEDType1;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MAPPINGVARIABLE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.MAPPINGVARIABLETypeImpl#getAGGFUNCTION <em>AGGFUNCTION</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGVARIABLETypeImpl#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGVARIABLETypeImpl#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGVARIABLETypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGVARIABLETypeImpl#getISEXPRESSIONVARIABLE <em>ISEXPRESSIONVARIABLE</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGVARIABLETypeImpl#getISPARAM <em>ISPARAM</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGVARIABLETypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGVARIABLETypeImpl#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGVARIABLETypeImpl#getSCALE <em>SCALE</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGVARIABLETypeImpl#getUSERDEFINED <em>USERDEFINED</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MAPPINGVARIABLETypeImpl extends EObjectImpl implements MAPPINGVARIABLEType {
    /**
     * The default value of the '{@link #getAGGFUNCTION() <em>AGGFUNCTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAGGFUNCTION()
     * @generated
     * @ordered
     */
    protected static final AGGFUNCTIONType AGGFUNCTION_EDEFAULT = AGGFUNCTIONType.COUNT;

    /**
     * The cached value of the '{@link #getAGGFUNCTION() <em>AGGFUNCTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAGGFUNCTION()
     * @generated
     * @ordered
     */
    protected AGGFUNCTIONType aGGFUNCTION = AGGFUNCTION_EDEFAULT;

    /**
     * This is true if the AGGFUNCTION attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aGGFUNCTIONESet;

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
     * The default value of the '{@link #getISEXPRESSIONVARIABLE() <em>ISEXPRESSIONVARIABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISEXPRESSIONVARIABLE()
     * @generated
     * @ordered
     */
    protected static final ISEXPRESSIONVARIABLEType ISEXPRESSIONVARIABLE_EDEFAULT = ISEXPRESSIONVARIABLEType.YES;

    /**
     * The cached value of the '{@link #getISEXPRESSIONVARIABLE() <em>ISEXPRESSIONVARIABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISEXPRESSIONVARIABLE()
     * @generated
     * @ordered
     */
    protected ISEXPRESSIONVARIABLEType iSEXPRESSIONVARIABLE = ISEXPRESSIONVARIABLE_EDEFAULT;

    /**
     * This is true if the ISEXPRESSIONVARIABLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSEXPRESSIONVARIABLEESet;

    /**
     * The default value of the '{@link #getISPARAM() <em>ISPARAM</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISPARAM()
     * @generated
     * @ordered
     */
    protected static final ISPARAMType ISPARAM_EDEFAULT = ISPARAMType.YES;

    /**
     * The cached value of the '{@link #getISPARAM() <em>ISPARAM</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISPARAM()
     * @generated
     * @ordered
     */
    protected ISPARAMType iSPARAM = ISPARAM_EDEFAULT;

    /**
     * This is true if the ISPARAM attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSPARAMESet;

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
     * The default value of the '{@link #getUSERDEFINED() <em>USERDEFINED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUSERDEFINED()
     * @generated
     * @ordered
     */
    protected static final USERDEFINEDType1 USERDEFINED_EDEFAULT = USERDEFINEDType1.YES;

    /**
     * The cached value of the '{@link #getUSERDEFINED() <em>USERDEFINED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUSERDEFINED()
     * @generated
     * @ordered
     */
    protected USERDEFINEDType1 uSERDEFINED = USERDEFINED_EDEFAULT;

    /**
     * This is true if the USERDEFINED attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uSERDEFINEDESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MAPPINGVARIABLETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getMAPPINGVARIABLEType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AGGFUNCTIONType getAGGFUNCTION() {
        return aGGFUNCTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAGGFUNCTION(AGGFUNCTIONType newAGGFUNCTION) {
        AGGFUNCTIONType oldAGGFUNCTION = aGGFUNCTION;
        aGGFUNCTION = newAGGFUNCTION == null ? AGGFUNCTION_EDEFAULT : newAGGFUNCTION;
        boolean oldAGGFUNCTIONESet = aGGFUNCTIONESet;
        aGGFUNCTIONESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPINGVARIABLE_TYPE__AGGFUNCTION, oldAGGFUNCTION, aGGFUNCTION, !oldAGGFUNCTIONESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAGGFUNCTION() {
        AGGFUNCTIONType oldAGGFUNCTION = aGGFUNCTION;
        boolean oldAGGFUNCTIONESet = aGGFUNCTIONESet;
        aGGFUNCTION = AGGFUNCTION_EDEFAULT;
        aGGFUNCTIONESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.MAPPINGVARIABLE_TYPE__AGGFUNCTION, oldAGGFUNCTION, AGGFUNCTION_EDEFAULT, oldAGGFUNCTIONESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAGGFUNCTION() {
        return aGGFUNCTIONESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPINGVARIABLE_TYPE__DATATYPE, oldDATATYPE, dATATYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPINGVARIABLE_TYPE__DEFAULTVALUE, oldDEFAULTVALUE, dEFAULTVALUE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPINGVARIABLE_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISEXPRESSIONVARIABLEType getISEXPRESSIONVARIABLE() {
        return iSEXPRESSIONVARIABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISEXPRESSIONVARIABLE(ISEXPRESSIONVARIABLEType newISEXPRESSIONVARIABLE) {
        ISEXPRESSIONVARIABLEType oldISEXPRESSIONVARIABLE = iSEXPRESSIONVARIABLE;
        iSEXPRESSIONVARIABLE = newISEXPRESSIONVARIABLE == null ? ISEXPRESSIONVARIABLE_EDEFAULT : newISEXPRESSIONVARIABLE;
        boolean oldISEXPRESSIONVARIABLEESet = iSEXPRESSIONVARIABLEESet;
        iSEXPRESSIONVARIABLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPINGVARIABLE_TYPE__ISEXPRESSIONVARIABLE, oldISEXPRESSIONVARIABLE, iSEXPRESSIONVARIABLE, !oldISEXPRESSIONVARIABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISEXPRESSIONVARIABLE() {
        ISEXPRESSIONVARIABLEType oldISEXPRESSIONVARIABLE = iSEXPRESSIONVARIABLE;
        boolean oldISEXPRESSIONVARIABLEESet = iSEXPRESSIONVARIABLEESet;
        iSEXPRESSIONVARIABLE = ISEXPRESSIONVARIABLE_EDEFAULT;
        iSEXPRESSIONVARIABLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.MAPPINGVARIABLE_TYPE__ISEXPRESSIONVARIABLE, oldISEXPRESSIONVARIABLE, ISEXPRESSIONVARIABLE_EDEFAULT, oldISEXPRESSIONVARIABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISEXPRESSIONVARIABLE() {
        return iSEXPRESSIONVARIABLEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISPARAMType getISPARAM() {
        return iSPARAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISPARAM(ISPARAMType newISPARAM) {
        ISPARAMType oldISPARAM = iSPARAM;
        iSPARAM = newISPARAM == null ? ISPARAM_EDEFAULT : newISPARAM;
        boolean oldISPARAMESet = iSPARAMESet;
        iSPARAMESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPINGVARIABLE_TYPE__ISPARAM, oldISPARAM, iSPARAM, !oldISPARAMESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISPARAM() {
        ISPARAMType oldISPARAM = iSPARAM;
        boolean oldISPARAMESet = iSPARAMESet;
        iSPARAM = ISPARAM_EDEFAULT;
        iSPARAMESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.MAPPINGVARIABLE_TYPE__ISPARAM, oldISPARAM, ISPARAM_EDEFAULT, oldISPARAMESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISPARAM() {
        return iSPARAMESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPINGVARIABLE_TYPE__NAME, oldNAME, nAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPINGVARIABLE_TYPE__PRECISION, oldPRECISION, pRECISION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPINGVARIABLE_TYPE__SCALE, oldSCALE, sCALE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public USERDEFINEDType1 getUSERDEFINED() {
        return uSERDEFINED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUSERDEFINED(USERDEFINEDType1 newUSERDEFINED) {
        USERDEFINEDType1 oldUSERDEFINED = uSERDEFINED;
        uSERDEFINED = newUSERDEFINED == null ? USERDEFINED_EDEFAULT : newUSERDEFINED;
        boolean oldUSERDEFINEDESet = uSERDEFINEDESet;
        uSERDEFINEDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPINGVARIABLE_TYPE__USERDEFINED, oldUSERDEFINED, uSERDEFINED, !oldUSERDEFINEDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUSERDEFINED() {
        USERDEFINEDType1 oldUSERDEFINED = uSERDEFINED;
        boolean oldUSERDEFINEDESet = uSERDEFINEDESet;
        uSERDEFINED = USERDEFINED_EDEFAULT;
        uSERDEFINEDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.MAPPINGVARIABLE_TYPE__USERDEFINED, oldUSERDEFINED, USERDEFINED_EDEFAULT, oldUSERDEFINEDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUSERDEFINED() {
        return uSERDEFINEDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__AGGFUNCTION:
                return getAGGFUNCTION();
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__DATATYPE:
                return getDATATYPE();
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__DEFAULTVALUE:
                return getDEFAULTVALUE();
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__ISEXPRESSIONVARIABLE:
                return getISEXPRESSIONVARIABLE();
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__ISPARAM:
                return getISPARAM();
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__PRECISION:
                return getPRECISION();
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__SCALE:
                return getSCALE();
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__USERDEFINED:
                return getUSERDEFINED();
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
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__AGGFUNCTION:
                setAGGFUNCTION((AGGFUNCTIONType)newValue);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__DATATYPE:
                setDATATYPE(newValue);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__DEFAULTVALUE:
                setDEFAULTVALUE(newValue);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__ISEXPRESSIONVARIABLE:
                setISEXPRESSIONVARIABLE((ISEXPRESSIONVARIABLEType)newValue);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__ISPARAM:
                setISPARAM((ISPARAMType)newValue);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__PRECISION:
                setPRECISION(newValue);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__SCALE:
                setSCALE(newValue);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__USERDEFINED:
                setUSERDEFINED((USERDEFINEDType1)newValue);
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
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__AGGFUNCTION:
                unsetAGGFUNCTION();
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__DATATYPE:
                setDATATYPE(DATATYPE_EDEFAULT);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__DEFAULTVALUE:
                setDEFAULTVALUE(DEFAULTVALUE_EDEFAULT);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__ISEXPRESSIONVARIABLE:
                unsetISEXPRESSIONVARIABLE();
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__ISPARAM:
                unsetISPARAM();
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__PRECISION:
                setPRECISION(PRECISION_EDEFAULT);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__SCALE:
                setSCALE(SCALE_EDEFAULT);
                return;
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__USERDEFINED:
                unsetUSERDEFINED();
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
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__AGGFUNCTION:
                return isSetAGGFUNCTION();
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__DATATYPE:
                return DATATYPE_EDEFAULT == null ? dATATYPE != null : !DATATYPE_EDEFAULT.equals(dATATYPE);
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__DEFAULTVALUE:
                return DEFAULTVALUE_EDEFAULT == null ? dEFAULTVALUE != null : !DEFAULTVALUE_EDEFAULT.equals(dEFAULTVALUE);
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__ISEXPRESSIONVARIABLE:
                return isSetISEXPRESSIONVARIABLE();
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__ISPARAM:
                return isSetISPARAM();
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__PRECISION:
                return PRECISION_EDEFAULT == null ? pRECISION != null : !PRECISION_EDEFAULT.equals(pRECISION);
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__SCALE:
                return SCALE_EDEFAULT == null ? sCALE != null : !SCALE_EDEFAULT.equals(sCALE);
            case PowrmartPackage.MAPPINGVARIABLE_TYPE__USERDEFINED:
                return isSetUSERDEFINED();
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
        result.append(" (aGGFUNCTION: ");
        if (aGGFUNCTIONESet) result.append(aGGFUNCTION); else result.append("<unset>");
        result.append(", dATATYPE: ");
        result.append(dATATYPE);
        result.append(", dEFAULTVALUE: ");
        result.append(dEFAULTVALUE);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", iSEXPRESSIONVARIABLE: ");
        if (iSEXPRESSIONVARIABLEESet) result.append(iSEXPRESSIONVARIABLE); else result.append("<unset>");
        result.append(", iSPARAM: ");
        if (iSPARAMESet) result.append(iSPARAM); else result.append("<unset>");
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", pRECISION: ");
        result.append(pRECISION);
        result.append(", sCALE: ");
        result.append(sCALE);
        result.append(", uSERDEFINED: ");
        if (uSERDEFINEDESet) result.append(uSERDEFINED); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //MAPPINGVARIABLETypeImpl
