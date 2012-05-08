/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.OBJECTTYPEType;
import Powrmart.PowrmartPackage;
import Powrmart.REFERENCETYPEType;
import Powrmart.SHORTCUTType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SHORTCUT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SHORTCUTTypeImpl#getCOMMENTS <em>COMMENTS</em>}</li>
 *   <li>{@link Powrmart.impl.SHORTCUTTypeImpl#getDBDNAME <em>DBDNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SHORTCUTTypeImpl#getFOLDERNAME <em>FOLDERNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SHORTCUTTypeImpl#getFOLDERVERSIONNAME <em>FOLDERVERSIONNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SHORTCUTTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SHORTCUTTypeImpl#getOBJECTSUBTYPE <em>OBJECTSUBTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SHORTCUTTypeImpl#getOBJECTTYPE <em>OBJECTTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SHORTCUTTypeImpl#getREFERENCEDDBD <em>REFERENCEDDBD</em>}</li>
 *   <li>{@link Powrmart.impl.SHORTCUTTypeImpl#getREFERENCETYPE <em>REFERENCETYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SHORTCUTTypeImpl#getREFOBJECTNAME <em>REFOBJECTNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SHORTCUTTypeImpl#getREPOSITORYNAME <em>REPOSITORYNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SHORTCUTTypeImpl#getTEMPLATEID <em>TEMPLATEID</em>}</li>
 *   <li>{@link Powrmart.impl.SHORTCUTTypeImpl#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SHORTCUTTypeImpl extends EObjectImpl implements SHORTCUTType {
    /**
     * The default value of the '{@link #getCOMMENTS() <em>COMMENTS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMMENTS()
     * @generated
     * @ordered
     */
    protected static final Object COMMENTS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCOMMENTS() <em>COMMENTS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMMENTS()
     * @generated
     * @ordered
     */
    protected Object cOMMENTS = COMMENTS_EDEFAULT;

    /**
     * The default value of the '{@link #getDBDNAME() <em>DBDNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDBDNAME()
     * @generated
     * @ordered
     */
    protected static final Object DBDNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDBDNAME() <em>DBDNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDBDNAME()
     * @generated
     * @ordered
     */
    protected Object dBDNAME = DBDNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFOLDERNAME() <em>FOLDERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFOLDERNAME()
     * @generated
     * @ordered
     */
    protected static final Object FOLDERNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFOLDERNAME() <em>FOLDERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFOLDERNAME()
     * @generated
     * @ordered
     */
    protected Object fOLDERNAME = FOLDERNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFOLDERVERSIONNAME() <em>FOLDERVERSIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFOLDERVERSIONNAME()
     * @generated
     * @ordered
     */
    protected static final Object FOLDERVERSIONNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFOLDERVERSIONNAME() <em>FOLDERVERSIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFOLDERVERSIONNAME()
     * @generated
     * @ordered
     */
    protected Object fOLDERVERSIONNAME = FOLDERVERSIONNAME_EDEFAULT;

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
     * The default value of the '{@link #getOBJECTSUBTYPE() <em>OBJECTSUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOBJECTSUBTYPE()
     * @generated
     * @ordered
     */
    protected static final Object OBJECTSUBTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOBJECTSUBTYPE() <em>OBJECTSUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOBJECTSUBTYPE()
     * @generated
     * @ordered
     */
    protected Object oBJECTSUBTYPE = OBJECTSUBTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getOBJECTTYPE() <em>OBJECTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOBJECTTYPE()
     * @generated
     * @ordered
     */
    protected static final OBJECTTYPEType OBJECTTYPE_EDEFAULT = OBJECTTYPEType.SOURCE;

    /**
     * The cached value of the '{@link #getOBJECTTYPE() <em>OBJECTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOBJECTTYPE()
     * @generated
     * @ordered
     */
    protected OBJECTTYPEType oBJECTTYPE = OBJECTTYPE_EDEFAULT;

    /**
     * This is true if the OBJECTTYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oBJECTTYPEESet;

    /**
     * The default value of the '{@link #getREFERENCEDDBD() <em>REFERENCEDDBD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCEDDBD()
     * @generated
     * @ordered
     */
    protected static final Object REFERENCEDDBD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFERENCEDDBD() <em>REFERENCEDDBD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCEDDBD()
     * @generated
     * @ordered
     */
    protected Object rEFERENCEDDBD = REFERENCEDDBD_EDEFAULT;

    /**
     * The default value of the '{@link #getREFERENCETYPE() <em>REFERENCETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCETYPE()
     * @generated
     * @ordered
     */
    protected static final REFERENCETYPEType REFERENCETYPE_EDEFAULT = REFERENCETYPEType.GLOBAL;

    /**
     * The cached value of the '{@link #getREFERENCETYPE() <em>REFERENCETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCETYPE()
     * @generated
     * @ordered
     */
    protected REFERENCETYPEType rEFERENCETYPE = REFERENCETYPE_EDEFAULT;

    /**
     * This is true if the REFERENCETYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEFERENCETYPEESet;

    /**
     * The default value of the '{@link #getREFOBJECTNAME() <em>REFOBJECTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFOBJECTNAME()
     * @generated
     * @ordered
     */
    protected static final Object REFOBJECTNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFOBJECTNAME() <em>REFOBJECTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFOBJECTNAME()
     * @generated
     * @ordered
     */
    protected Object rEFOBJECTNAME = REFOBJECTNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getREPOSITORYNAME() <em>REPOSITORYNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREPOSITORYNAME()
     * @generated
     * @ordered
     */
    protected static final Object REPOSITORYNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREPOSITORYNAME() <em>REPOSITORYNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREPOSITORYNAME()
     * @generated
     * @ordered
     */
    protected Object rEPOSITORYNAME = REPOSITORYNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTEMPLATEID() <em>TEMPLATEID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTEMPLATEID()
     * @generated
     * @ordered
     */
    protected static final Object TEMPLATEID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTEMPLATEID() <em>TEMPLATEID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTEMPLATEID()
     * @generated
     * @ordered
     */
    protected Object tEMPLATEID = TEMPLATEID_EDEFAULT;

    /**
     * The default value of the '{@link #getVERSIONNUMBER() <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVERSIONNUMBER()
     * @generated
     * @ordered
     */
    protected static final Object VERSIONNUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVERSIONNUMBER() <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVERSIONNUMBER()
     * @generated
     * @ordered
     */
    protected Object vERSIONNUMBER = VERSIONNUMBER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SHORTCUTTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSHORTCUTType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCOMMENTS() {
        return cOMMENTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCOMMENTS(Object newCOMMENTS) {
        Object oldCOMMENTS = cOMMENTS;
        cOMMENTS = newCOMMENTS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SHORTCUT_TYPE__COMMENTS, oldCOMMENTS, cOMMENTS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDBDNAME() {
        return dBDNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDBDNAME(Object newDBDNAME) {
        Object oldDBDNAME = dBDNAME;
        dBDNAME = newDBDNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SHORTCUT_TYPE__DBDNAME, oldDBDNAME, dBDNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFOLDERNAME() {
        return fOLDERNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFOLDERNAME(Object newFOLDERNAME) {
        Object oldFOLDERNAME = fOLDERNAME;
        fOLDERNAME = newFOLDERNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SHORTCUT_TYPE__FOLDERNAME, oldFOLDERNAME, fOLDERNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFOLDERVERSIONNAME() {
        return fOLDERVERSIONNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFOLDERVERSIONNAME(Object newFOLDERVERSIONNAME) {
        Object oldFOLDERVERSIONNAME = fOLDERVERSIONNAME;
        fOLDERVERSIONNAME = newFOLDERVERSIONNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SHORTCUT_TYPE__FOLDERVERSIONNAME, oldFOLDERVERSIONNAME, fOLDERVERSIONNAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SHORTCUT_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getOBJECTSUBTYPE() {
        return oBJECTSUBTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOBJECTSUBTYPE(Object newOBJECTSUBTYPE) {
        Object oldOBJECTSUBTYPE = oBJECTSUBTYPE;
        oBJECTSUBTYPE = newOBJECTSUBTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SHORTCUT_TYPE__OBJECTSUBTYPE, oldOBJECTSUBTYPE, oBJECTSUBTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OBJECTTYPEType getOBJECTTYPE() {
        return oBJECTTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOBJECTTYPE(OBJECTTYPEType newOBJECTTYPE) {
        OBJECTTYPEType oldOBJECTTYPE = oBJECTTYPE;
        oBJECTTYPE = newOBJECTTYPE == null ? OBJECTTYPE_EDEFAULT : newOBJECTTYPE;
        boolean oldOBJECTTYPEESet = oBJECTTYPEESet;
        oBJECTTYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SHORTCUT_TYPE__OBJECTTYPE, oldOBJECTTYPE, oBJECTTYPE, !oldOBJECTTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOBJECTTYPE() {
        OBJECTTYPEType oldOBJECTTYPE = oBJECTTYPE;
        boolean oldOBJECTTYPEESet = oBJECTTYPEESet;
        oBJECTTYPE = OBJECTTYPE_EDEFAULT;
        oBJECTTYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SHORTCUT_TYPE__OBJECTTYPE, oldOBJECTTYPE, OBJECTTYPE_EDEFAULT, oldOBJECTTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetOBJECTTYPE() {
        return oBJECTTYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFERENCEDDBD() {
        return rEFERENCEDDBD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFERENCEDDBD(Object newREFERENCEDDBD) {
        Object oldREFERENCEDDBD = rEFERENCEDDBD;
        rEFERENCEDDBD = newREFERENCEDDBD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SHORTCUT_TYPE__REFERENCEDDBD, oldREFERENCEDDBD, rEFERENCEDDBD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REFERENCETYPEType getREFERENCETYPE() {
        return rEFERENCETYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFERENCETYPE(REFERENCETYPEType newREFERENCETYPE) {
        REFERENCETYPEType oldREFERENCETYPE = rEFERENCETYPE;
        rEFERENCETYPE = newREFERENCETYPE == null ? REFERENCETYPE_EDEFAULT : newREFERENCETYPE;
        boolean oldREFERENCETYPEESet = rEFERENCETYPEESet;
        rEFERENCETYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SHORTCUT_TYPE__REFERENCETYPE, oldREFERENCETYPE, rEFERENCETYPE, !oldREFERENCETYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREFERENCETYPE() {
        REFERENCETYPEType oldREFERENCETYPE = rEFERENCETYPE;
        boolean oldREFERENCETYPEESet = rEFERENCETYPEESet;
        rEFERENCETYPE = REFERENCETYPE_EDEFAULT;
        rEFERENCETYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SHORTCUT_TYPE__REFERENCETYPE, oldREFERENCETYPE, REFERENCETYPE_EDEFAULT, oldREFERENCETYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetREFERENCETYPE() {
        return rEFERENCETYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFOBJECTNAME() {
        return rEFOBJECTNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFOBJECTNAME(Object newREFOBJECTNAME) {
        Object oldREFOBJECTNAME = rEFOBJECTNAME;
        rEFOBJECTNAME = newREFOBJECTNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SHORTCUT_TYPE__REFOBJECTNAME, oldREFOBJECTNAME, rEFOBJECTNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREPOSITORYNAME() {
        return rEPOSITORYNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREPOSITORYNAME(Object newREPOSITORYNAME) {
        Object oldREPOSITORYNAME = rEPOSITORYNAME;
        rEPOSITORYNAME = newREPOSITORYNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SHORTCUT_TYPE__REPOSITORYNAME, oldREPOSITORYNAME, rEPOSITORYNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTEMPLATEID() {
        return tEMPLATEID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTEMPLATEID(Object newTEMPLATEID) {
        Object oldTEMPLATEID = tEMPLATEID;
        tEMPLATEID = newTEMPLATEID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SHORTCUT_TYPE__TEMPLATEID, oldTEMPLATEID, tEMPLATEID));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getVERSIONNUMBER() {
        return vERSIONNUMBER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVERSIONNUMBER(Object newVERSIONNUMBER) {
        Object oldVERSIONNUMBER = vERSIONNUMBER;
        vERSIONNUMBER = newVERSIONNUMBER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SHORTCUT_TYPE__VERSIONNUMBER, oldVERSIONNUMBER, vERSIONNUMBER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SHORTCUT_TYPE__COMMENTS:
                return getCOMMENTS();
            case PowrmartPackage.SHORTCUT_TYPE__DBDNAME:
                return getDBDNAME();
            case PowrmartPackage.SHORTCUT_TYPE__FOLDERNAME:
                return getFOLDERNAME();
            case PowrmartPackage.SHORTCUT_TYPE__FOLDERVERSIONNAME:
                return getFOLDERVERSIONNAME();
            case PowrmartPackage.SHORTCUT_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SHORTCUT_TYPE__OBJECTSUBTYPE:
                return getOBJECTSUBTYPE();
            case PowrmartPackage.SHORTCUT_TYPE__OBJECTTYPE:
                return getOBJECTTYPE();
            case PowrmartPackage.SHORTCUT_TYPE__REFERENCEDDBD:
                return getREFERENCEDDBD();
            case PowrmartPackage.SHORTCUT_TYPE__REFERENCETYPE:
                return getREFERENCETYPE();
            case PowrmartPackage.SHORTCUT_TYPE__REFOBJECTNAME:
                return getREFOBJECTNAME();
            case PowrmartPackage.SHORTCUT_TYPE__REPOSITORYNAME:
                return getREPOSITORYNAME();
            case PowrmartPackage.SHORTCUT_TYPE__TEMPLATEID:
                return getTEMPLATEID();
            case PowrmartPackage.SHORTCUT_TYPE__VERSIONNUMBER:
                return getVERSIONNUMBER();
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
            case PowrmartPackage.SHORTCUT_TYPE__COMMENTS:
                setCOMMENTS(newValue);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__DBDNAME:
                setDBDNAME(newValue);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__FOLDERNAME:
                setFOLDERNAME(newValue);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__FOLDERVERSIONNAME:
                setFOLDERVERSIONNAME(newValue);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__OBJECTSUBTYPE:
                setOBJECTSUBTYPE(newValue);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__OBJECTTYPE:
                setOBJECTTYPE((OBJECTTYPEType)newValue);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__REFERENCEDDBD:
                setREFERENCEDDBD(newValue);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__REFERENCETYPE:
                setREFERENCETYPE((REFERENCETYPEType)newValue);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__REFOBJECTNAME:
                setREFOBJECTNAME(newValue);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__REPOSITORYNAME:
                setREPOSITORYNAME(newValue);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__TEMPLATEID:
                setTEMPLATEID(newValue);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__VERSIONNUMBER:
                setVERSIONNUMBER(newValue);
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
            case PowrmartPackage.SHORTCUT_TYPE__COMMENTS:
                setCOMMENTS(COMMENTS_EDEFAULT);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__DBDNAME:
                setDBDNAME(DBDNAME_EDEFAULT);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__FOLDERNAME:
                setFOLDERNAME(FOLDERNAME_EDEFAULT);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__FOLDERVERSIONNAME:
                setFOLDERVERSIONNAME(FOLDERVERSIONNAME_EDEFAULT);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__OBJECTSUBTYPE:
                setOBJECTSUBTYPE(OBJECTSUBTYPE_EDEFAULT);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__OBJECTTYPE:
                unsetOBJECTTYPE();
                return;
            case PowrmartPackage.SHORTCUT_TYPE__REFERENCEDDBD:
                setREFERENCEDDBD(REFERENCEDDBD_EDEFAULT);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__REFERENCETYPE:
                unsetREFERENCETYPE();
                return;
            case PowrmartPackage.SHORTCUT_TYPE__REFOBJECTNAME:
                setREFOBJECTNAME(REFOBJECTNAME_EDEFAULT);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__REPOSITORYNAME:
                setREPOSITORYNAME(REPOSITORYNAME_EDEFAULT);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__TEMPLATEID:
                setTEMPLATEID(TEMPLATEID_EDEFAULT);
                return;
            case PowrmartPackage.SHORTCUT_TYPE__VERSIONNUMBER:
                setVERSIONNUMBER(VERSIONNUMBER_EDEFAULT);
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
            case PowrmartPackage.SHORTCUT_TYPE__COMMENTS:
                return COMMENTS_EDEFAULT == null ? cOMMENTS != null : !COMMENTS_EDEFAULT.equals(cOMMENTS);
            case PowrmartPackage.SHORTCUT_TYPE__DBDNAME:
                return DBDNAME_EDEFAULT == null ? dBDNAME != null : !DBDNAME_EDEFAULT.equals(dBDNAME);
            case PowrmartPackage.SHORTCUT_TYPE__FOLDERNAME:
                return FOLDERNAME_EDEFAULT == null ? fOLDERNAME != null : !FOLDERNAME_EDEFAULT.equals(fOLDERNAME);
            case PowrmartPackage.SHORTCUT_TYPE__FOLDERVERSIONNAME:
                return FOLDERVERSIONNAME_EDEFAULT == null ? fOLDERVERSIONNAME != null : !FOLDERVERSIONNAME_EDEFAULT.equals(fOLDERVERSIONNAME);
            case PowrmartPackage.SHORTCUT_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SHORTCUT_TYPE__OBJECTSUBTYPE:
                return OBJECTSUBTYPE_EDEFAULT == null ? oBJECTSUBTYPE != null : !OBJECTSUBTYPE_EDEFAULT.equals(oBJECTSUBTYPE);
            case PowrmartPackage.SHORTCUT_TYPE__OBJECTTYPE:
                return isSetOBJECTTYPE();
            case PowrmartPackage.SHORTCUT_TYPE__REFERENCEDDBD:
                return REFERENCEDDBD_EDEFAULT == null ? rEFERENCEDDBD != null : !REFERENCEDDBD_EDEFAULT.equals(rEFERENCEDDBD);
            case PowrmartPackage.SHORTCUT_TYPE__REFERENCETYPE:
                return isSetREFERENCETYPE();
            case PowrmartPackage.SHORTCUT_TYPE__REFOBJECTNAME:
                return REFOBJECTNAME_EDEFAULT == null ? rEFOBJECTNAME != null : !REFOBJECTNAME_EDEFAULT.equals(rEFOBJECTNAME);
            case PowrmartPackage.SHORTCUT_TYPE__REPOSITORYNAME:
                return REPOSITORYNAME_EDEFAULT == null ? rEPOSITORYNAME != null : !REPOSITORYNAME_EDEFAULT.equals(rEPOSITORYNAME);
            case PowrmartPackage.SHORTCUT_TYPE__TEMPLATEID:
                return TEMPLATEID_EDEFAULT == null ? tEMPLATEID != null : !TEMPLATEID_EDEFAULT.equals(tEMPLATEID);
            case PowrmartPackage.SHORTCUT_TYPE__VERSIONNUMBER:
                return VERSIONNUMBER_EDEFAULT == null ? vERSIONNUMBER != null : !VERSIONNUMBER_EDEFAULT.equals(vERSIONNUMBER);
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
        result.append(" (cOMMENTS: ");
        result.append(cOMMENTS);
        result.append(", dBDNAME: ");
        result.append(dBDNAME);
        result.append(", fOLDERNAME: ");
        result.append(fOLDERNAME);
        result.append(", fOLDERVERSIONNAME: ");
        result.append(fOLDERVERSIONNAME);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", oBJECTSUBTYPE: ");
        result.append(oBJECTSUBTYPE);
        result.append(", oBJECTTYPE: ");
        if (oBJECTTYPEESet) result.append(oBJECTTYPE); else result.append("<unset>");
        result.append(", rEFERENCEDDBD: ");
        result.append(rEFERENCEDDBD);
        result.append(", rEFERENCETYPE: ");
        if (rEFERENCETYPEESet) result.append(rEFERENCETYPE); else result.append("<unset>");
        result.append(", rEFOBJECTNAME: ");
        result.append(rEFOBJECTNAME);
        result.append(", rEPOSITORYNAME: ");
        result.append(rEPOSITORYNAME);
        result.append(", tEMPLATEID: ");
        result.append(tEMPLATEID);
        result.append(", vERSIONNUMBER: ");
        result.append(vERSIONNUMBER);
        result.append(')');
        return result.toString();
    }

} //SHORTCUTTypeImpl
