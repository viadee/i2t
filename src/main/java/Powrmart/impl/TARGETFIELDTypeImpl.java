/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.FIELDATTRIBUTEType;
import Powrmart.ISFILENAMEFIELDType;
import Powrmart.NULLABLEType;
import Powrmart.PowrmartPackage;
import Powrmart.TARGETFIELDType;

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
 * An implementation of the model object '<em><b>TARGETFIELD Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getFIELDATTRIBUTE <em>FIELDATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getBUSINESSNAME <em>BUSINESSNAME</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getFIELDNUMBER <em>FIELDNUMBER</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getISFILENAMEFIELD <em>ISFILENAMEFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getKEYTYPE <em>KEYTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getNULLABLE <em>NULLABLE</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getPICTURETEXT <em>PICTURETEXT</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getREFERENCEDFIELD <em>REFERENCEDFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getREFERENCEDTABLE <em>REFERENCEDTABLE</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETFIELDTypeImpl#getSCALE <em>SCALE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TARGETFIELDTypeImpl extends EObjectImpl implements TARGETFIELDType {
    /**
     * The cached value of the '{@link #getFIELDATTRIBUTE() <em>FIELDATTRIBUTE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELDATTRIBUTE()
     * @generated
     * @ordered
     */
    protected EList<FIELDATTRIBUTEType> fIELDATTRIBUTE;

    /**
     * The default value of the '{@link #getBUSINESSNAME() <em>BUSINESSNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBUSINESSNAME()
     * @generated
     * @ordered
     */
    protected static final Object BUSINESSNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBUSINESSNAME() <em>BUSINESSNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBUSINESSNAME()
     * @generated
     * @ordered
     */
    protected Object bUSINESSNAME = BUSINESSNAME_EDEFAULT;

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
     * The default value of the '{@link #getFIELDNUMBER() <em>FIELDNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELDNUMBER()
     * @generated
     * @ordered
     */
    protected static final Object FIELDNUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFIELDNUMBER() <em>FIELDNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELDNUMBER()
     * @generated
     * @ordered
     */
    protected Object fIELDNUMBER = FIELDNUMBER_EDEFAULT;

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
     * The default value of the '{@link #getISFILENAMEFIELD() <em>ISFILENAMEFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISFILENAMEFIELD()
     * @generated
     * @ordered
     */
    protected static final ISFILENAMEFIELDType ISFILENAMEFIELD_EDEFAULT = ISFILENAMEFIELDType.YES;

    /**
     * The cached value of the '{@link #getISFILENAMEFIELD() <em>ISFILENAMEFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISFILENAMEFIELD()
     * @generated
     * @ordered
     */
    protected ISFILENAMEFIELDType iSFILENAMEFIELD = ISFILENAMEFIELD_EDEFAULT;

    /**
     * This is true if the ISFILENAMEFIELD attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSFILENAMEFIELDESet;

    /**
     * The default value of the '{@link #getKEYTYPE() <em>KEYTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKEYTYPE()
     * @generated
     * @ordered
     */
    protected static final Object KEYTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKEYTYPE() <em>KEYTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKEYTYPE()
     * @generated
     * @ordered
     */
    protected Object kEYTYPE = KEYTYPE_EDEFAULT;

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
     * The default value of the '{@link #getNULLABLE() <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNULLABLE()
     * @generated
     * @ordered
     */
    protected static final NULLABLEType NULLABLE_EDEFAULT = NULLABLEType.NOTNULL;

    /**
     * The cached value of the '{@link #getNULLABLE() <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNULLABLE()
     * @generated
     * @ordered
     */
    protected NULLABLEType nULLABLE = NULLABLE_EDEFAULT;

    /**
     * This is true if the NULLABLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nULLABLEESet;

    /**
     * The default value of the '{@link #getPICTURETEXT() <em>PICTURETEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPICTURETEXT()
     * @generated
     * @ordered
     */
    protected static final Object PICTURETEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPICTURETEXT() <em>PICTURETEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPICTURETEXT()
     * @generated
     * @ordered
     */
    protected Object pICTURETEXT = PICTURETEXT_EDEFAULT;

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
     * The default value of the '{@link #getREFERENCEDFIELD() <em>REFERENCEDFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCEDFIELD()
     * @generated
     * @ordered
     */
    protected static final Object REFERENCEDFIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFERENCEDFIELD() <em>REFERENCEDFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCEDFIELD()
     * @generated
     * @ordered
     */
    protected Object rEFERENCEDFIELD = REFERENCEDFIELD_EDEFAULT;

    /**
     * The default value of the '{@link #getREFERENCEDTABLE() <em>REFERENCEDTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCEDTABLE()
     * @generated
     * @ordered
     */
    protected static final Object REFERENCEDTABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFERENCEDTABLE() <em>REFERENCEDTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCEDTABLE()
     * @generated
     * @ordered
     */
    protected Object rEFERENCEDTABLE = REFERENCEDTABLE_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TARGETFIELDTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getTARGETFIELDType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FIELDATTRIBUTEType> getFIELDATTRIBUTE() {
        if (fIELDATTRIBUTE == null) {
            fIELDATTRIBUTE = new EObjectContainmentEList<FIELDATTRIBUTEType>(FIELDATTRIBUTEType.class, this, PowrmartPackage.TARGETFIELD_TYPE__FIELDATTRIBUTE);
        }
        return fIELDATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getBUSINESSNAME() {
        return bUSINESSNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBUSINESSNAME(Object newBUSINESSNAME) {
        Object oldBUSINESSNAME = bUSINESSNAME;
        bUSINESSNAME = newBUSINESSNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__BUSINESSNAME, oldBUSINESSNAME, bUSINESSNAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__DATATYPE, oldDATATYPE, dATATYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFIELDNUMBER() {
        return fIELDNUMBER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFIELDNUMBER(Object newFIELDNUMBER) {
        Object oldFIELDNUMBER = fIELDNUMBER;
        fIELDNUMBER = newFIELDNUMBER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__FIELDNUMBER, oldFIELDNUMBER, fIELDNUMBER));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__GROUP, oldGROUP, gROUP));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISFILENAMEFIELDType getISFILENAMEFIELD() {
        return iSFILENAMEFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISFILENAMEFIELD(ISFILENAMEFIELDType newISFILENAMEFIELD) {
        ISFILENAMEFIELDType oldISFILENAMEFIELD = iSFILENAMEFIELD;
        iSFILENAMEFIELD = newISFILENAMEFIELD == null ? ISFILENAMEFIELD_EDEFAULT : newISFILENAMEFIELD;
        boolean oldISFILENAMEFIELDESet = iSFILENAMEFIELDESet;
        iSFILENAMEFIELDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__ISFILENAMEFIELD, oldISFILENAMEFIELD, iSFILENAMEFIELD, !oldISFILENAMEFIELDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISFILENAMEFIELD() {
        ISFILENAMEFIELDType oldISFILENAMEFIELD = iSFILENAMEFIELD;
        boolean oldISFILENAMEFIELDESet = iSFILENAMEFIELDESet;
        iSFILENAMEFIELD = ISFILENAMEFIELD_EDEFAULT;
        iSFILENAMEFIELDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TARGETFIELD_TYPE__ISFILENAMEFIELD, oldISFILENAMEFIELD, ISFILENAMEFIELD_EDEFAULT, oldISFILENAMEFIELDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISFILENAMEFIELD() {
        return iSFILENAMEFIELDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getKEYTYPE() {
        return kEYTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKEYTYPE(Object newKEYTYPE) {
        Object oldKEYTYPE = kEYTYPE;
        kEYTYPE = newKEYTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__KEYTYPE, oldKEYTYPE, kEYTYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NULLABLEType getNULLABLE() {
        return nULLABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNULLABLE(NULLABLEType newNULLABLE) {
        NULLABLEType oldNULLABLE = nULLABLE;
        nULLABLE = newNULLABLE == null ? NULLABLE_EDEFAULT : newNULLABLE;
        boolean oldNULLABLEESet = nULLABLEESet;
        nULLABLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__NULLABLE, oldNULLABLE, nULLABLE, !oldNULLABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNULLABLE() {
        NULLABLEType oldNULLABLE = nULLABLE;
        boolean oldNULLABLEESet = nULLABLEESet;
        nULLABLE = NULLABLE_EDEFAULT;
        nULLABLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TARGETFIELD_TYPE__NULLABLE, oldNULLABLE, NULLABLE_EDEFAULT, oldNULLABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNULLABLE() {
        return nULLABLEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPICTURETEXT() {
        return pICTURETEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPICTURETEXT(Object newPICTURETEXT) {
        Object oldPICTURETEXT = pICTURETEXT;
        pICTURETEXT = newPICTURETEXT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__PICTURETEXT, oldPICTURETEXT, pICTURETEXT));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__PRECISION, oldPRECISION, pRECISION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFERENCEDFIELD() {
        return rEFERENCEDFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFERENCEDFIELD(Object newREFERENCEDFIELD) {
        Object oldREFERENCEDFIELD = rEFERENCEDFIELD;
        rEFERENCEDFIELD = newREFERENCEDFIELD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__REFERENCEDFIELD, oldREFERENCEDFIELD, rEFERENCEDFIELD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFERENCEDTABLE() {
        return rEFERENCEDTABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFERENCEDTABLE(Object newREFERENCEDTABLE) {
        Object oldREFERENCEDTABLE = rEFERENCEDTABLE;
        rEFERENCEDTABLE = newREFERENCEDTABLE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__REFERENCEDTABLE, oldREFERENCEDTABLE, rEFERENCEDTABLE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGETFIELD_TYPE__SCALE, oldSCALE, sCALE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.TARGETFIELD_TYPE__FIELDATTRIBUTE:
                return ((InternalEList<?>)getFIELDATTRIBUTE()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.TARGETFIELD_TYPE__FIELDATTRIBUTE:
                return getFIELDATTRIBUTE();
            case PowrmartPackage.TARGETFIELD_TYPE__BUSINESSNAME:
                return getBUSINESSNAME();
            case PowrmartPackage.TARGETFIELD_TYPE__DATATYPE:
                return getDATATYPE();
            case PowrmartPackage.TARGETFIELD_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.TARGETFIELD_TYPE__FIELDNUMBER:
                return getFIELDNUMBER();
            case PowrmartPackage.TARGETFIELD_TYPE__GROUP:
                return getGROUP();
            case PowrmartPackage.TARGETFIELD_TYPE__ISFILENAMEFIELD:
                return getISFILENAMEFIELD();
            case PowrmartPackage.TARGETFIELD_TYPE__KEYTYPE:
                return getKEYTYPE();
            case PowrmartPackage.TARGETFIELD_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.TARGETFIELD_TYPE__NULLABLE:
                return getNULLABLE();
            case PowrmartPackage.TARGETFIELD_TYPE__PICTURETEXT:
                return getPICTURETEXT();
            case PowrmartPackage.TARGETFIELD_TYPE__PRECISION:
                return getPRECISION();
            case PowrmartPackage.TARGETFIELD_TYPE__REFERENCEDFIELD:
                return getREFERENCEDFIELD();
            case PowrmartPackage.TARGETFIELD_TYPE__REFERENCEDTABLE:
                return getREFERENCEDTABLE();
            case PowrmartPackage.TARGETFIELD_TYPE__SCALE:
                return getSCALE();
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
            case PowrmartPackage.TARGETFIELD_TYPE__FIELDATTRIBUTE:
                getFIELDATTRIBUTE().clear();
                getFIELDATTRIBUTE().addAll((Collection<? extends FIELDATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__BUSINESSNAME:
                setBUSINESSNAME(newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__DATATYPE:
                setDATATYPE(newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__FIELDNUMBER:
                setFIELDNUMBER(newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__GROUP:
                setGROUP(newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__ISFILENAMEFIELD:
                setISFILENAMEFIELD((ISFILENAMEFIELDType)newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__KEYTYPE:
                setKEYTYPE(newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__NULLABLE:
                setNULLABLE((NULLABLEType)newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__PICTURETEXT:
                setPICTURETEXT(newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__PRECISION:
                setPRECISION(newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__REFERENCEDFIELD:
                setREFERENCEDFIELD(newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__REFERENCEDTABLE:
                setREFERENCEDTABLE(newValue);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__SCALE:
                setSCALE(newValue);
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
            case PowrmartPackage.TARGETFIELD_TYPE__FIELDATTRIBUTE:
                getFIELDATTRIBUTE().clear();
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__BUSINESSNAME:
                setBUSINESSNAME(BUSINESSNAME_EDEFAULT);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__DATATYPE:
                setDATATYPE(DATATYPE_EDEFAULT);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__FIELDNUMBER:
                setFIELDNUMBER(FIELDNUMBER_EDEFAULT);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__GROUP:
                setGROUP(GROUP_EDEFAULT);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__ISFILENAMEFIELD:
                unsetISFILENAMEFIELD();
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__KEYTYPE:
                setKEYTYPE(KEYTYPE_EDEFAULT);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__NULLABLE:
                unsetNULLABLE();
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__PICTURETEXT:
                setPICTURETEXT(PICTURETEXT_EDEFAULT);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__PRECISION:
                setPRECISION(PRECISION_EDEFAULT);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__REFERENCEDFIELD:
                setREFERENCEDFIELD(REFERENCEDFIELD_EDEFAULT);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__REFERENCEDTABLE:
                setREFERENCEDTABLE(REFERENCEDTABLE_EDEFAULT);
                return;
            case PowrmartPackage.TARGETFIELD_TYPE__SCALE:
                setSCALE(SCALE_EDEFAULT);
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
            case PowrmartPackage.TARGETFIELD_TYPE__FIELDATTRIBUTE:
                return fIELDATTRIBUTE != null && !fIELDATTRIBUTE.isEmpty();
            case PowrmartPackage.TARGETFIELD_TYPE__BUSINESSNAME:
                return BUSINESSNAME_EDEFAULT == null ? bUSINESSNAME != null : !BUSINESSNAME_EDEFAULT.equals(bUSINESSNAME);
            case PowrmartPackage.TARGETFIELD_TYPE__DATATYPE:
                return DATATYPE_EDEFAULT == null ? dATATYPE != null : !DATATYPE_EDEFAULT.equals(dATATYPE);
            case PowrmartPackage.TARGETFIELD_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.TARGETFIELD_TYPE__FIELDNUMBER:
                return FIELDNUMBER_EDEFAULT == null ? fIELDNUMBER != null : !FIELDNUMBER_EDEFAULT.equals(fIELDNUMBER);
            case PowrmartPackage.TARGETFIELD_TYPE__GROUP:
                return GROUP_EDEFAULT == null ? gROUP != null : !GROUP_EDEFAULT.equals(gROUP);
            case PowrmartPackage.TARGETFIELD_TYPE__ISFILENAMEFIELD:
                return isSetISFILENAMEFIELD();
            case PowrmartPackage.TARGETFIELD_TYPE__KEYTYPE:
                return KEYTYPE_EDEFAULT == null ? kEYTYPE != null : !KEYTYPE_EDEFAULT.equals(kEYTYPE);
            case PowrmartPackage.TARGETFIELD_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.TARGETFIELD_TYPE__NULLABLE:
                return isSetNULLABLE();
            case PowrmartPackage.TARGETFIELD_TYPE__PICTURETEXT:
                return PICTURETEXT_EDEFAULT == null ? pICTURETEXT != null : !PICTURETEXT_EDEFAULT.equals(pICTURETEXT);
            case PowrmartPackage.TARGETFIELD_TYPE__PRECISION:
                return PRECISION_EDEFAULT == null ? pRECISION != null : !PRECISION_EDEFAULT.equals(pRECISION);
            case PowrmartPackage.TARGETFIELD_TYPE__REFERENCEDFIELD:
                return REFERENCEDFIELD_EDEFAULT == null ? rEFERENCEDFIELD != null : !REFERENCEDFIELD_EDEFAULT.equals(rEFERENCEDFIELD);
            case PowrmartPackage.TARGETFIELD_TYPE__REFERENCEDTABLE:
                return REFERENCEDTABLE_EDEFAULT == null ? rEFERENCEDTABLE != null : !REFERENCEDTABLE_EDEFAULT.equals(rEFERENCEDTABLE);
            case PowrmartPackage.TARGETFIELD_TYPE__SCALE:
                return SCALE_EDEFAULT == null ? sCALE != null : !SCALE_EDEFAULT.equals(sCALE);
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
        result.append(" (bUSINESSNAME: ");
        result.append(bUSINESSNAME);
        result.append(", dATATYPE: ");
        result.append(dATATYPE);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", fIELDNUMBER: ");
        result.append(fIELDNUMBER);
        result.append(", gROUP: ");
        result.append(gROUP);
        result.append(", iSFILENAMEFIELD: ");
        if (iSFILENAMEFIELDESet) result.append(iSFILENAMEFIELD); else result.append("<unset>");
        result.append(", kEYTYPE: ");
        result.append(kEYTYPE);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", nULLABLE: ");
        if (nULLABLEESet) result.append(nULLABLE); else result.append("<unset>");
        result.append(", pICTURETEXT: ");
        result.append(pICTURETEXT);
        result.append(", pRECISION: ");
        result.append(pRECISION);
        result.append(", rEFERENCEDFIELD: ");
        result.append(rEFERENCEDFIELD);
        result.append(", rEFERENCEDTABLE: ");
        result.append(rEFERENCEDTABLE);
        result.append(", sCALE: ");
        result.append(sCALE);
        result.append(')');
        return result.toString();
    }

} //TARGETFIELDTypeImpl
