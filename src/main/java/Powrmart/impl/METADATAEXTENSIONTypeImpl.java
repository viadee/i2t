/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.DATATYPEType;
import Powrmart.ISCLIENTEDITABLEType;
import Powrmart.ISCLIENTVISIBLEType;
import Powrmart.ISREUSABLEType;
import Powrmart.ISSHAREREADType;
import Powrmart.ISSHAREWRITEType;
import Powrmart.METADATAEXTENSIONType;
import Powrmart.PowrmartPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>METADATAEXTENSION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.METADATAEXTENSIONTypeImpl#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.METADATAEXTENSIONTypeImpl#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.impl.METADATAEXTENSIONTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.METADATAEXTENSIONTypeImpl#getDOMAINNAME <em>DOMAINNAME</em>}</li>
 *   <li>{@link Powrmart.impl.METADATAEXTENSIONTypeImpl#getISCLIENTEDITABLE <em>ISCLIENTEDITABLE</em>}</li>
 *   <li>{@link Powrmart.impl.METADATAEXTENSIONTypeImpl#getISCLIENTVISIBLE <em>ISCLIENTVISIBLE</em>}</li>
 *   <li>{@link Powrmart.impl.METADATAEXTENSIONTypeImpl#getISREUSABLE <em>ISREUSABLE</em>}</li>
 *   <li>{@link Powrmart.impl.METADATAEXTENSIONTypeImpl#getISSHAREREAD <em>ISSHAREREAD</em>}</li>
 *   <li>{@link Powrmart.impl.METADATAEXTENSIONTypeImpl#getISSHAREWRITE <em>ISSHAREWRITE</em>}</li>
 *   <li>{@link Powrmart.impl.METADATAEXTENSIONTypeImpl#getMAXLENGTH <em>MAXLENGTH</em>}</li>
 *   <li>{@link Powrmart.impl.METADATAEXTENSIONTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.METADATAEXTENSIONTypeImpl#getVALUE <em>VALUE</em>}</li>
 *   <li>{@link Powrmart.impl.METADATAEXTENSIONTypeImpl#getVENDORNAME <em>VENDORNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class METADATAEXTENSIONTypeImpl extends EObjectImpl implements METADATAEXTENSIONType {
    /**
     * The default value of the '{@link #getCOMPONENTVERSION() <em>COMPONENTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMPONENTVERSION()
     * @generated
     * @ordered
     */
    protected static final Object COMPONENTVERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCOMPONENTVERSION() <em>COMPONENTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMPONENTVERSION()
     * @generated
     * @ordered
     */
    protected Object cOMPONENTVERSION = COMPONENTVERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getDATATYPE() <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPE()
     * @generated
     * @ordered
     */
    protected static final DATATYPEType DATATYPE_EDEFAULT = DATATYPEType.STRING;

    /**
     * The cached value of the '{@link #getDATATYPE() <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPE()
     * @generated
     * @ordered
     */
    protected DATATYPEType dATATYPE = DATATYPE_EDEFAULT;

    /**
     * This is true if the DATATYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dATATYPEESet;

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
     * The default value of the '{@link #getDOMAINNAME() <em>DOMAINNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDOMAINNAME()
     * @generated
     * @ordered
     */
    protected static final Object DOMAINNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDOMAINNAME() <em>DOMAINNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDOMAINNAME()
     * @generated
     * @ordered
     */
    protected Object dOMAINNAME = DOMAINNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getISCLIENTEDITABLE() <em>ISCLIENTEDITABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISCLIENTEDITABLE()
     * @generated
     * @ordered
     */
    protected static final ISCLIENTEDITABLEType ISCLIENTEDITABLE_EDEFAULT = ISCLIENTEDITABLEType.YES;

    /**
     * The cached value of the '{@link #getISCLIENTEDITABLE() <em>ISCLIENTEDITABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISCLIENTEDITABLE()
     * @generated
     * @ordered
     */
    protected ISCLIENTEDITABLEType iSCLIENTEDITABLE = ISCLIENTEDITABLE_EDEFAULT;

    /**
     * This is true if the ISCLIENTEDITABLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSCLIENTEDITABLEESet;

    /**
     * The default value of the '{@link #getISCLIENTVISIBLE() <em>ISCLIENTVISIBLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISCLIENTVISIBLE()
     * @generated
     * @ordered
     */
    protected static final ISCLIENTVISIBLEType ISCLIENTVISIBLE_EDEFAULT = ISCLIENTVISIBLEType.YES;

    /**
     * The cached value of the '{@link #getISCLIENTVISIBLE() <em>ISCLIENTVISIBLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISCLIENTVISIBLE()
     * @generated
     * @ordered
     */
    protected ISCLIENTVISIBLEType iSCLIENTVISIBLE = ISCLIENTVISIBLE_EDEFAULT;

    /**
     * This is true if the ISCLIENTVISIBLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSCLIENTVISIBLEESet;

    /**
     * The default value of the '{@link #getISREUSABLE() <em>ISREUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISREUSABLE()
     * @generated
     * @ordered
     */
    protected static final ISREUSABLEType ISREUSABLE_EDEFAULT = ISREUSABLEType.YES;

    /**
     * The cached value of the '{@link #getISREUSABLE() <em>ISREUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISREUSABLE()
     * @generated
     * @ordered
     */
    protected ISREUSABLEType iSREUSABLE = ISREUSABLE_EDEFAULT;

    /**
     * This is true if the ISREUSABLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSREUSABLEESet;

    /**
     * The default value of the '{@link #getISSHAREREAD() <em>ISSHAREREAD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISSHAREREAD()
     * @generated
     * @ordered
     */
    protected static final ISSHAREREADType ISSHAREREAD_EDEFAULT = ISSHAREREADType.YES;

    /**
     * The cached value of the '{@link #getISSHAREREAD() <em>ISSHAREREAD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISSHAREREAD()
     * @generated
     * @ordered
     */
    protected ISSHAREREADType iSSHAREREAD = ISSHAREREAD_EDEFAULT;

    /**
     * This is true if the ISSHAREREAD attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSSHAREREADESet;

    /**
     * The default value of the '{@link #getISSHAREWRITE() <em>ISSHAREWRITE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISSHAREWRITE()
     * @generated
     * @ordered
     */
    protected static final ISSHAREWRITEType ISSHAREWRITE_EDEFAULT = ISSHAREWRITEType.YES;

    /**
     * The cached value of the '{@link #getISSHAREWRITE() <em>ISSHAREWRITE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISSHAREWRITE()
     * @generated
     * @ordered
     */
    protected ISSHAREWRITEType iSSHAREWRITE = ISSHAREWRITE_EDEFAULT;

    /**
     * This is true if the ISSHAREWRITE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSSHAREWRITEESet;

    /**
     * The default value of the '{@link #getMAXLENGTH() <em>MAXLENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAXLENGTH()
     * @generated
     * @ordered
     */
    protected static final Object MAXLENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMAXLENGTH() <em>MAXLENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAXLENGTH()
     * @generated
     * @ordered
     */
    protected Object mAXLENGTH = MAXLENGTH_EDEFAULT;

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
     * The default value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUE()
     * @generated
     * @ordered
     */
    protected static final Object VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUE()
     * @generated
     * @ordered
     */
    protected Object vALUE = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getVENDORNAME() <em>VENDORNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVENDORNAME()
     * @generated
     * @ordered
     */
    protected static final Object VENDORNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVENDORNAME() <em>VENDORNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVENDORNAME()
     * @generated
     * @ordered
     */
    protected Object vENDORNAME = VENDORNAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected METADATAEXTENSIONTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getMETADATAEXTENSIONType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCOMPONENTVERSION() {
        return cOMPONENTVERSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCOMPONENTVERSION(Object newCOMPONENTVERSION) {
        Object oldCOMPONENTVERSION = cOMPONENTVERSION;
        cOMPONENTVERSION = newCOMPONENTVERSION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.METADATAEXTENSION_TYPE__COMPONENTVERSION, oldCOMPONENTVERSION, cOMPONENTVERSION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DATATYPEType getDATATYPE() {
        return dATATYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPE(DATATYPEType newDATATYPE) {
        DATATYPEType oldDATATYPE = dATATYPE;
        dATATYPE = newDATATYPE == null ? DATATYPE_EDEFAULT : newDATATYPE;
        boolean oldDATATYPEESet = dATATYPEESet;
        dATATYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.METADATAEXTENSION_TYPE__DATATYPE, oldDATATYPE, dATATYPE, !oldDATATYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDATATYPE() {
        DATATYPEType oldDATATYPE = dATATYPE;
        boolean oldDATATYPEESet = dATATYPEESet;
        dATATYPE = DATATYPE_EDEFAULT;
        dATATYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.METADATAEXTENSION_TYPE__DATATYPE, oldDATATYPE, DATATYPE_EDEFAULT, oldDATATYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDATATYPE() {
        return dATATYPEESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.METADATAEXTENSION_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDOMAINNAME() {
        return dOMAINNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDOMAINNAME(Object newDOMAINNAME) {
        Object oldDOMAINNAME = dOMAINNAME;
        dOMAINNAME = newDOMAINNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.METADATAEXTENSION_TYPE__DOMAINNAME, oldDOMAINNAME, dOMAINNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISCLIENTEDITABLEType getISCLIENTEDITABLE() {
        return iSCLIENTEDITABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISCLIENTEDITABLE(ISCLIENTEDITABLEType newISCLIENTEDITABLE) {
        ISCLIENTEDITABLEType oldISCLIENTEDITABLE = iSCLIENTEDITABLE;
        iSCLIENTEDITABLE = newISCLIENTEDITABLE == null ? ISCLIENTEDITABLE_EDEFAULT : newISCLIENTEDITABLE;
        boolean oldISCLIENTEDITABLEESet = iSCLIENTEDITABLEESet;
        iSCLIENTEDITABLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.METADATAEXTENSION_TYPE__ISCLIENTEDITABLE, oldISCLIENTEDITABLE, iSCLIENTEDITABLE, !oldISCLIENTEDITABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISCLIENTEDITABLE() {
        ISCLIENTEDITABLEType oldISCLIENTEDITABLE = iSCLIENTEDITABLE;
        boolean oldISCLIENTEDITABLEESet = iSCLIENTEDITABLEESet;
        iSCLIENTEDITABLE = ISCLIENTEDITABLE_EDEFAULT;
        iSCLIENTEDITABLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.METADATAEXTENSION_TYPE__ISCLIENTEDITABLE, oldISCLIENTEDITABLE, ISCLIENTEDITABLE_EDEFAULT, oldISCLIENTEDITABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISCLIENTEDITABLE() {
        return iSCLIENTEDITABLEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISCLIENTVISIBLEType getISCLIENTVISIBLE() {
        return iSCLIENTVISIBLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISCLIENTVISIBLE(ISCLIENTVISIBLEType newISCLIENTVISIBLE) {
        ISCLIENTVISIBLEType oldISCLIENTVISIBLE = iSCLIENTVISIBLE;
        iSCLIENTVISIBLE = newISCLIENTVISIBLE == null ? ISCLIENTVISIBLE_EDEFAULT : newISCLIENTVISIBLE;
        boolean oldISCLIENTVISIBLEESet = iSCLIENTVISIBLEESet;
        iSCLIENTVISIBLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.METADATAEXTENSION_TYPE__ISCLIENTVISIBLE, oldISCLIENTVISIBLE, iSCLIENTVISIBLE, !oldISCLIENTVISIBLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISCLIENTVISIBLE() {
        ISCLIENTVISIBLEType oldISCLIENTVISIBLE = iSCLIENTVISIBLE;
        boolean oldISCLIENTVISIBLEESet = iSCLIENTVISIBLEESet;
        iSCLIENTVISIBLE = ISCLIENTVISIBLE_EDEFAULT;
        iSCLIENTVISIBLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.METADATAEXTENSION_TYPE__ISCLIENTVISIBLE, oldISCLIENTVISIBLE, ISCLIENTVISIBLE_EDEFAULT, oldISCLIENTVISIBLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISCLIENTVISIBLE() {
        return iSCLIENTVISIBLEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISREUSABLEType getISREUSABLE() {
        return iSREUSABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISREUSABLE(ISREUSABLEType newISREUSABLE) {
        ISREUSABLEType oldISREUSABLE = iSREUSABLE;
        iSREUSABLE = newISREUSABLE == null ? ISREUSABLE_EDEFAULT : newISREUSABLE;
        boolean oldISREUSABLEESet = iSREUSABLEESet;
        iSREUSABLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.METADATAEXTENSION_TYPE__ISREUSABLE, oldISREUSABLE, iSREUSABLE, !oldISREUSABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISREUSABLE() {
        ISREUSABLEType oldISREUSABLE = iSREUSABLE;
        boolean oldISREUSABLEESet = iSREUSABLEESet;
        iSREUSABLE = ISREUSABLE_EDEFAULT;
        iSREUSABLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.METADATAEXTENSION_TYPE__ISREUSABLE, oldISREUSABLE, ISREUSABLE_EDEFAULT, oldISREUSABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISREUSABLE() {
        return iSREUSABLEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISSHAREREADType getISSHAREREAD() {
        return iSSHAREREAD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISSHAREREAD(ISSHAREREADType newISSHAREREAD) {
        ISSHAREREADType oldISSHAREREAD = iSSHAREREAD;
        iSSHAREREAD = newISSHAREREAD == null ? ISSHAREREAD_EDEFAULT : newISSHAREREAD;
        boolean oldISSHAREREADESet = iSSHAREREADESet;
        iSSHAREREADESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.METADATAEXTENSION_TYPE__ISSHAREREAD, oldISSHAREREAD, iSSHAREREAD, !oldISSHAREREADESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISSHAREREAD() {
        ISSHAREREADType oldISSHAREREAD = iSSHAREREAD;
        boolean oldISSHAREREADESet = iSSHAREREADESet;
        iSSHAREREAD = ISSHAREREAD_EDEFAULT;
        iSSHAREREADESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.METADATAEXTENSION_TYPE__ISSHAREREAD, oldISSHAREREAD, ISSHAREREAD_EDEFAULT, oldISSHAREREADESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISSHAREREAD() {
        return iSSHAREREADESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISSHAREWRITEType getISSHAREWRITE() {
        return iSSHAREWRITE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISSHAREWRITE(ISSHAREWRITEType newISSHAREWRITE) {
        ISSHAREWRITEType oldISSHAREWRITE = iSSHAREWRITE;
        iSSHAREWRITE = newISSHAREWRITE == null ? ISSHAREWRITE_EDEFAULT : newISSHAREWRITE;
        boolean oldISSHAREWRITEESet = iSSHAREWRITEESet;
        iSSHAREWRITEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.METADATAEXTENSION_TYPE__ISSHAREWRITE, oldISSHAREWRITE, iSSHAREWRITE, !oldISSHAREWRITEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISSHAREWRITE() {
        ISSHAREWRITEType oldISSHAREWRITE = iSSHAREWRITE;
        boolean oldISSHAREWRITEESet = iSSHAREWRITEESet;
        iSSHAREWRITE = ISSHAREWRITE_EDEFAULT;
        iSSHAREWRITEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.METADATAEXTENSION_TYPE__ISSHAREWRITE, oldISSHAREWRITE, ISSHAREWRITE_EDEFAULT, oldISSHAREWRITEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISSHAREWRITE() {
        return iSSHAREWRITEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getMAXLENGTH() {
        return mAXLENGTH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMAXLENGTH(Object newMAXLENGTH) {
        Object oldMAXLENGTH = mAXLENGTH;
        mAXLENGTH = newMAXLENGTH;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.METADATAEXTENSION_TYPE__MAXLENGTH, oldMAXLENGTH, mAXLENGTH));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.METADATAEXTENSION_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getVALUE() {
        return vALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVALUE(Object newVALUE) {
        Object oldVALUE = vALUE;
        vALUE = newVALUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.METADATAEXTENSION_TYPE__VALUE, oldVALUE, vALUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getVENDORNAME() {
        return vENDORNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVENDORNAME(Object newVENDORNAME) {
        Object oldVENDORNAME = vENDORNAME;
        vENDORNAME = newVENDORNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.METADATAEXTENSION_TYPE__VENDORNAME, oldVENDORNAME, vENDORNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.METADATAEXTENSION_TYPE__COMPONENTVERSION:
                return getCOMPONENTVERSION();
            case PowrmartPackage.METADATAEXTENSION_TYPE__DATATYPE:
                return getDATATYPE();
            case PowrmartPackage.METADATAEXTENSION_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.METADATAEXTENSION_TYPE__DOMAINNAME:
                return getDOMAINNAME();
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISCLIENTEDITABLE:
                return getISCLIENTEDITABLE();
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISCLIENTVISIBLE:
                return getISCLIENTVISIBLE();
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISREUSABLE:
                return getISREUSABLE();
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISSHAREREAD:
                return getISSHAREREAD();
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISSHAREWRITE:
                return getISSHAREWRITE();
            case PowrmartPackage.METADATAEXTENSION_TYPE__MAXLENGTH:
                return getMAXLENGTH();
            case PowrmartPackage.METADATAEXTENSION_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.METADATAEXTENSION_TYPE__VALUE:
                return getVALUE();
            case PowrmartPackage.METADATAEXTENSION_TYPE__VENDORNAME:
                return getVENDORNAME();
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
            case PowrmartPackage.METADATAEXTENSION_TYPE__COMPONENTVERSION:
                setCOMPONENTVERSION(newValue);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__DATATYPE:
                setDATATYPE((DATATYPEType)newValue);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__DOMAINNAME:
                setDOMAINNAME(newValue);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISCLIENTEDITABLE:
                setISCLIENTEDITABLE((ISCLIENTEDITABLEType)newValue);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISCLIENTVISIBLE:
                setISCLIENTVISIBLE((ISCLIENTVISIBLEType)newValue);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISREUSABLE:
                setISREUSABLE((ISREUSABLEType)newValue);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISSHAREREAD:
                setISSHAREREAD((ISSHAREREADType)newValue);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISSHAREWRITE:
                setISSHAREWRITE((ISSHAREWRITEType)newValue);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__MAXLENGTH:
                setMAXLENGTH(newValue);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__VALUE:
                setVALUE(newValue);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__VENDORNAME:
                setVENDORNAME(newValue);
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
            case PowrmartPackage.METADATAEXTENSION_TYPE__COMPONENTVERSION:
                setCOMPONENTVERSION(COMPONENTVERSION_EDEFAULT);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__DATATYPE:
                unsetDATATYPE();
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__DOMAINNAME:
                setDOMAINNAME(DOMAINNAME_EDEFAULT);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISCLIENTEDITABLE:
                unsetISCLIENTEDITABLE();
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISCLIENTVISIBLE:
                unsetISCLIENTVISIBLE();
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISREUSABLE:
                unsetISREUSABLE();
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISSHAREREAD:
                unsetISSHAREREAD();
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISSHAREWRITE:
                unsetISSHAREWRITE();
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__MAXLENGTH:
                setMAXLENGTH(MAXLENGTH_EDEFAULT);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__VALUE:
                setVALUE(VALUE_EDEFAULT);
                return;
            case PowrmartPackage.METADATAEXTENSION_TYPE__VENDORNAME:
                setVENDORNAME(VENDORNAME_EDEFAULT);
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
            case PowrmartPackage.METADATAEXTENSION_TYPE__COMPONENTVERSION:
                return COMPONENTVERSION_EDEFAULT == null ? cOMPONENTVERSION != null : !COMPONENTVERSION_EDEFAULT.equals(cOMPONENTVERSION);
            case PowrmartPackage.METADATAEXTENSION_TYPE__DATATYPE:
                return isSetDATATYPE();
            case PowrmartPackage.METADATAEXTENSION_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.METADATAEXTENSION_TYPE__DOMAINNAME:
                return DOMAINNAME_EDEFAULT == null ? dOMAINNAME != null : !DOMAINNAME_EDEFAULT.equals(dOMAINNAME);
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISCLIENTEDITABLE:
                return isSetISCLIENTEDITABLE();
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISCLIENTVISIBLE:
                return isSetISCLIENTVISIBLE();
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISREUSABLE:
                return isSetISREUSABLE();
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISSHAREREAD:
                return isSetISSHAREREAD();
            case PowrmartPackage.METADATAEXTENSION_TYPE__ISSHAREWRITE:
                return isSetISSHAREWRITE();
            case PowrmartPackage.METADATAEXTENSION_TYPE__MAXLENGTH:
                return MAXLENGTH_EDEFAULT == null ? mAXLENGTH != null : !MAXLENGTH_EDEFAULT.equals(mAXLENGTH);
            case PowrmartPackage.METADATAEXTENSION_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.METADATAEXTENSION_TYPE__VALUE:
                return VALUE_EDEFAULT == null ? vALUE != null : !VALUE_EDEFAULT.equals(vALUE);
            case PowrmartPackage.METADATAEXTENSION_TYPE__VENDORNAME:
                return VENDORNAME_EDEFAULT == null ? vENDORNAME != null : !VENDORNAME_EDEFAULT.equals(vENDORNAME);
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
        result.append(" (cOMPONENTVERSION: ");
        result.append(cOMPONENTVERSION);
        result.append(", dATATYPE: ");
        if (dATATYPEESet) result.append(dATATYPE); else result.append("<unset>");
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", dOMAINNAME: ");
        result.append(dOMAINNAME);
        result.append(", iSCLIENTEDITABLE: ");
        if (iSCLIENTEDITABLEESet) result.append(iSCLIENTEDITABLE); else result.append("<unset>");
        result.append(", iSCLIENTVISIBLE: ");
        if (iSCLIENTVISIBLEESet) result.append(iSCLIENTVISIBLE); else result.append("<unset>");
        result.append(", iSREUSABLE: ");
        if (iSREUSABLEESet) result.append(iSREUSABLE); else result.append("<unset>");
        result.append(", iSSHAREREAD: ");
        if (iSSHAREREADESet) result.append(iSSHAREREAD); else result.append("<unset>");
        result.append(", iSSHAREWRITE: ");
        if (iSSHAREWRITEESet) result.append(iSSHAREWRITE); else result.append("<unset>");
        result.append(", mAXLENGTH: ");
        result.append(mAXLENGTH);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", vALUE: ");
        result.append(vALUE);
        result.append(", vENDORNAME: ");
        result.append(vENDORNAME);
        result.append(')');
        return result.toString();
    }

} //METADATAEXTENSIONTypeImpl
