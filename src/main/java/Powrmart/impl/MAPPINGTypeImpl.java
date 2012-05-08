/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.CONNECTORType;
import Powrmart.ERPINFOType;
import Powrmart.INSTANCEType;
import Powrmart.ISPROFILEMAPPINGType;
import Powrmart.MAPDEPENDENCYType;
import Powrmart.MAPPINGType;
import Powrmart.MAPPINGVARIABLEType;
import Powrmart.METADATAEXTENSIONType;
import Powrmart.PowrmartPackage;
import Powrmart.TARGETLOADORDERType;
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
 * An implementation of the model object '<em><b>MAPPING Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getTRANSFORMATION <em>TRANSFORMATION</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getINSTANCE <em>INSTANCE</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getCONNECTOR <em>CONNECTOR</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getMAPDEPENDENCY <em>MAPDEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getTARGETLOADORDER <em>TARGETLOADORDER</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getMAPPINGVARIABLE <em>MAPPINGVARIABLE</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getERPINFO <em>ERPINFO</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getCRCVALUE <em>CRCVALUE</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getISPROFILEMAPPING <em>ISPROFILEMAPPING</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getISVALID <em>ISVALID</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getOBJECTVERSION <em>OBJECTVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.MAPPINGTypeImpl#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MAPPINGTypeImpl extends EObjectImpl implements MAPPINGType {
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
     * The cached value of the '{@link #getINSTANCE() <em>INSTANCE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINSTANCE()
     * @generated
     * @ordered
     */
    protected EList<INSTANCEType> iNSTANCE;

    /**
     * The cached value of the '{@link #getCONNECTOR() <em>CONNECTOR</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTOR()
     * @generated
     * @ordered
     */
    protected EList<CONNECTORType> cONNECTOR;

    /**
     * The cached value of the '{@link #getMAPDEPENDENCY() <em>MAPDEPENDENCY</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAPDEPENDENCY()
     * @generated
     * @ordered
     */
    protected EList<MAPDEPENDENCYType> mAPDEPENDENCY;

    /**
     * The cached value of the '{@link #getTARGETLOADORDER() <em>TARGETLOADORDER</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTARGETLOADORDER()
     * @generated
     * @ordered
     */
    protected EList<TARGETLOADORDERType> tARGETLOADORDER;

    /**
     * The cached value of the '{@link #getMAPPINGVARIABLE() <em>MAPPINGVARIABLE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAPPINGVARIABLE()
     * @generated
     * @ordered
     */
    protected EList<MAPPINGVARIABLEType> mAPPINGVARIABLE;

    /**
     * The cached value of the '{@link #getERPINFO() <em>ERPINFO</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getERPINFO()
     * @generated
     * @ordered
     */
    protected EList<ERPINFOType> eRPINFO;

    /**
     * The cached value of the '{@link #getMETADATAEXTENSION() <em>METADATAEXTENSION</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMETADATAEXTENSION()
     * @generated
     * @ordered
     */
    protected EList<METADATAEXTENSIONType> mETADATAEXTENSION;

    /**
     * The default value of the '{@link #getCRCVALUE() <em>CRCVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCRCVALUE()
     * @generated
     * @ordered
     */
    protected static final Object CRCVALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCRCVALUE() <em>CRCVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCRCVALUE()
     * @generated
     * @ordered
     */
    protected Object cRCVALUE = CRCVALUE_EDEFAULT;

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
     * The default value of the '{@link #getISPROFILEMAPPING() <em>ISPROFILEMAPPING</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISPROFILEMAPPING()
     * @generated
     * @ordered
     */
    protected static final ISPROFILEMAPPINGType ISPROFILEMAPPING_EDEFAULT = ISPROFILEMAPPINGType.YES;

    /**
     * The cached value of the '{@link #getISPROFILEMAPPING() <em>ISPROFILEMAPPING</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISPROFILEMAPPING()
     * @generated
     * @ordered
     */
    protected ISPROFILEMAPPINGType iSPROFILEMAPPING = ISPROFILEMAPPING_EDEFAULT;

    /**
     * This is true if the ISPROFILEMAPPING attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSPROFILEMAPPINGESet;

    /**
     * The default value of the '{@link #getISVALID() <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISVALID()
     * @generated
     * @ordered
     */
    protected static final Object ISVALID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getISVALID() <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISVALID()
     * @generated
     * @ordered
     */
    protected Object iSVALID = ISVALID_EDEFAULT;

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
     * The default value of the '{@link #getOBJECTVERSION() <em>OBJECTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOBJECTVERSION()
     * @generated
     * @ordered
     */
    protected static final Object OBJECTVERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOBJECTVERSION() <em>OBJECTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOBJECTVERSION()
     * @generated
     * @ordered
     */
    protected Object oBJECTVERSION = OBJECTVERSION_EDEFAULT;

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
    protected MAPPINGTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getMAPPINGType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TRANSFORMATIONType> getTRANSFORMATION() {
        if (tRANSFORMATION == null) {
            tRANSFORMATION = new EObjectContainmentEList<TRANSFORMATIONType>(TRANSFORMATIONType.class, this, PowrmartPackage.MAPPING_TYPE__TRANSFORMATION);
        }
        return tRANSFORMATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<INSTANCEType> getINSTANCE() {
        if (iNSTANCE == null) {
            iNSTANCE = new EObjectContainmentEList<INSTANCEType>(INSTANCEType.class, this, PowrmartPackage.MAPPING_TYPE__INSTANCE);
        }
        return iNSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CONNECTORType> getCONNECTOR() {
        if (cONNECTOR == null) {
            cONNECTOR = new EObjectContainmentEList<CONNECTORType>(CONNECTORType.class, this, PowrmartPackage.MAPPING_TYPE__CONNECTOR);
        }
        return cONNECTOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MAPDEPENDENCYType> getMAPDEPENDENCY() {
        if (mAPDEPENDENCY == null) {
            mAPDEPENDENCY = new EObjectContainmentEList<MAPDEPENDENCYType>(MAPDEPENDENCYType.class, this, PowrmartPackage.MAPPING_TYPE__MAPDEPENDENCY);
        }
        return mAPDEPENDENCY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TARGETLOADORDERType> getTARGETLOADORDER() {
        if (tARGETLOADORDER == null) {
            tARGETLOADORDER = new EObjectContainmentEList<TARGETLOADORDERType>(TARGETLOADORDERType.class, this, PowrmartPackage.MAPPING_TYPE__TARGETLOADORDER);
        }
        return tARGETLOADORDER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MAPPINGVARIABLEType> getMAPPINGVARIABLE() {
        if (mAPPINGVARIABLE == null) {
            mAPPINGVARIABLE = new EObjectContainmentEList<MAPPINGVARIABLEType>(MAPPINGVARIABLEType.class, this, PowrmartPackage.MAPPING_TYPE__MAPPINGVARIABLE);
        }
        return mAPPINGVARIABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ERPINFOType> getERPINFO() {
        if (eRPINFO == null) {
            eRPINFO = new EObjectContainmentEList<ERPINFOType>(ERPINFOType.class, this, PowrmartPackage.MAPPING_TYPE__ERPINFO);
        }
        return eRPINFO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<METADATAEXTENSIONType> getMETADATAEXTENSION() {
        if (mETADATAEXTENSION == null) {
            mETADATAEXTENSION = new EObjectContainmentEList<METADATAEXTENSIONType>(METADATAEXTENSIONType.class, this, PowrmartPackage.MAPPING_TYPE__METADATAEXTENSION);
        }
        return mETADATAEXTENSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCRCVALUE() {
        return cRCVALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCRCVALUE(Object newCRCVALUE) {
        Object oldCRCVALUE = cRCVALUE;
        cRCVALUE = newCRCVALUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPING_TYPE__CRCVALUE, oldCRCVALUE, cRCVALUE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPING_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISPROFILEMAPPINGType getISPROFILEMAPPING() {
        return iSPROFILEMAPPING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISPROFILEMAPPING(ISPROFILEMAPPINGType newISPROFILEMAPPING) {
        ISPROFILEMAPPINGType oldISPROFILEMAPPING = iSPROFILEMAPPING;
        iSPROFILEMAPPING = newISPROFILEMAPPING == null ? ISPROFILEMAPPING_EDEFAULT : newISPROFILEMAPPING;
        boolean oldISPROFILEMAPPINGESet = iSPROFILEMAPPINGESet;
        iSPROFILEMAPPINGESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPING_TYPE__ISPROFILEMAPPING, oldISPROFILEMAPPING, iSPROFILEMAPPING, !oldISPROFILEMAPPINGESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISPROFILEMAPPING() {
        ISPROFILEMAPPINGType oldISPROFILEMAPPING = iSPROFILEMAPPING;
        boolean oldISPROFILEMAPPINGESet = iSPROFILEMAPPINGESet;
        iSPROFILEMAPPING = ISPROFILEMAPPING_EDEFAULT;
        iSPROFILEMAPPINGESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.MAPPING_TYPE__ISPROFILEMAPPING, oldISPROFILEMAPPING, ISPROFILEMAPPING_EDEFAULT, oldISPROFILEMAPPINGESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISPROFILEMAPPING() {
        return iSPROFILEMAPPINGESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getISVALID() {
        return iSVALID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISVALID(Object newISVALID) {
        Object oldISVALID = iSVALID;
        iSVALID = newISVALID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPING_TYPE__ISVALID, oldISVALID, iSVALID));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPING_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getOBJECTVERSION() {
        return oBJECTVERSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOBJECTVERSION(Object newOBJECTVERSION) {
        Object oldOBJECTVERSION = oBJECTVERSION;
        oBJECTVERSION = newOBJECTVERSION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPING_TYPE__OBJECTVERSION, oldOBJECTVERSION, oBJECTVERSION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.MAPPING_TYPE__VERSIONNUMBER, oldVERSIONNUMBER, vERSIONNUMBER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.MAPPING_TYPE__TRANSFORMATION:
                return ((InternalEList<?>)getTRANSFORMATION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.MAPPING_TYPE__INSTANCE:
                return ((InternalEList<?>)getINSTANCE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.MAPPING_TYPE__CONNECTOR:
                return ((InternalEList<?>)getCONNECTOR()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.MAPPING_TYPE__MAPDEPENDENCY:
                return ((InternalEList<?>)getMAPDEPENDENCY()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.MAPPING_TYPE__TARGETLOADORDER:
                return ((InternalEList<?>)getTARGETLOADORDER()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.MAPPING_TYPE__MAPPINGVARIABLE:
                return ((InternalEList<?>)getMAPPINGVARIABLE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.MAPPING_TYPE__ERPINFO:
                return ((InternalEList<?>)getERPINFO()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.MAPPING_TYPE__METADATAEXTENSION:
                return ((InternalEList<?>)getMETADATAEXTENSION()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.MAPPING_TYPE__TRANSFORMATION:
                return getTRANSFORMATION();
            case PowrmartPackage.MAPPING_TYPE__INSTANCE:
                return getINSTANCE();
            case PowrmartPackage.MAPPING_TYPE__CONNECTOR:
                return getCONNECTOR();
            case PowrmartPackage.MAPPING_TYPE__MAPDEPENDENCY:
                return getMAPDEPENDENCY();
            case PowrmartPackage.MAPPING_TYPE__TARGETLOADORDER:
                return getTARGETLOADORDER();
            case PowrmartPackage.MAPPING_TYPE__MAPPINGVARIABLE:
                return getMAPPINGVARIABLE();
            case PowrmartPackage.MAPPING_TYPE__ERPINFO:
                return getERPINFO();
            case PowrmartPackage.MAPPING_TYPE__METADATAEXTENSION:
                return getMETADATAEXTENSION();
            case PowrmartPackage.MAPPING_TYPE__CRCVALUE:
                return getCRCVALUE();
            case PowrmartPackage.MAPPING_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.MAPPING_TYPE__ISPROFILEMAPPING:
                return getISPROFILEMAPPING();
            case PowrmartPackage.MAPPING_TYPE__ISVALID:
                return getISVALID();
            case PowrmartPackage.MAPPING_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.MAPPING_TYPE__OBJECTVERSION:
                return getOBJECTVERSION();
            case PowrmartPackage.MAPPING_TYPE__VERSIONNUMBER:
                return getVERSIONNUMBER();
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
            case PowrmartPackage.MAPPING_TYPE__TRANSFORMATION:
                getTRANSFORMATION().clear();
                getTRANSFORMATION().addAll((Collection<? extends TRANSFORMATIONType>)newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__INSTANCE:
                getINSTANCE().clear();
                getINSTANCE().addAll((Collection<? extends INSTANCEType>)newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__CONNECTOR:
                getCONNECTOR().clear();
                getCONNECTOR().addAll((Collection<? extends CONNECTORType>)newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__MAPDEPENDENCY:
                getMAPDEPENDENCY().clear();
                getMAPDEPENDENCY().addAll((Collection<? extends MAPDEPENDENCYType>)newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__TARGETLOADORDER:
                getTARGETLOADORDER().clear();
                getTARGETLOADORDER().addAll((Collection<? extends TARGETLOADORDERType>)newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__MAPPINGVARIABLE:
                getMAPPINGVARIABLE().clear();
                getMAPPINGVARIABLE().addAll((Collection<? extends MAPPINGVARIABLEType>)newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__ERPINFO:
                getERPINFO().clear();
                getERPINFO().addAll((Collection<? extends ERPINFOType>)newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                getMETADATAEXTENSION().addAll((Collection<? extends METADATAEXTENSIONType>)newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__CRCVALUE:
                setCRCVALUE(newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__ISPROFILEMAPPING:
                setISPROFILEMAPPING((ISPROFILEMAPPINGType)newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__ISVALID:
                setISVALID(newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__OBJECTVERSION:
                setOBJECTVERSION(newValue);
                return;
            case PowrmartPackage.MAPPING_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.MAPPING_TYPE__TRANSFORMATION:
                getTRANSFORMATION().clear();
                return;
            case PowrmartPackage.MAPPING_TYPE__INSTANCE:
                getINSTANCE().clear();
                return;
            case PowrmartPackage.MAPPING_TYPE__CONNECTOR:
                getCONNECTOR().clear();
                return;
            case PowrmartPackage.MAPPING_TYPE__MAPDEPENDENCY:
                getMAPDEPENDENCY().clear();
                return;
            case PowrmartPackage.MAPPING_TYPE__TARGETLOADORDER:
                getTARGETLOADORDER().clear();
                return;
            case PowrmartPackage.MAPPING_TYPE__MAPPINGVARIABLE:
                getMAPPINGVARIABLE().clear();
                return;
            case PowrmartPackage.MAPPING_TYPE__ERPINFO:
                getERPINFO().clear();
                return;
            case PowrmartPackage.MAPPING_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                return;
            case PowrmartPackage.MAPPING_TYPE__CRCVALUE:
                setCRCVALUE(CRCVALUE_EDEFAULT);
                return;
            case PowrmartPackage.MAPPING_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.MAPPING_TYPE__ISPROFILEMAPPING:
                unsetISPROFILEMAPPING();
                return;
            case PowrmartPackage.MAPPING_TYPE__ISVALID:
                setISVALID(ISVALID_EDEFAULT);
                return;
            case PowrmartPackage.MAPPING_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.MAPPING_TYPE__OBJECTVERSION:
                setOBJECTVERSION(OBJECTVERSION_EDEFAULT);
                return;
            case PowrmartPackage.MAPPING_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.MAPPING_TYPE__TRANSFORMATION:
                return tRANSFORMATION != null && !tRANSFORMATION.isEmpty();
            case PowrmartPackage.MAPPING_TYPE__INSTANCE:
                return iNSTANCE != null && !iNSTANCE.isEmpty();
            case PowrmartPackage.MAPPING_TYPE__CONNECTOR:
                return cONNECTOR != null && !cONNECTOR.isEmpty();
            case PowrmartPackage.MAPPING_TYPE__MAPDEPENDENCY:
                return mAPDEPENDENCY != null && !mAPDEPENDENCY.isEmpty();
            case PowrmartPackage.MAPPING_TYPE__TARGETLOADORDER:
                return tARGETLOADORDER != null && !tARGETLOADORDER.isEmpty();
            case PowrmartPackage.MAPPING_TYPE__MAPPINGVARIABLE:
                return mAPPINGVARIABLE != null && !mAPPINGVARIABLE.isEmpty();
            case PowrmartPackage.MAPPING_TYPE__ERPINFO:
                return eRPINFO != null && !eRPINFO.isEmpty();
            case PowrmartPackage.MAPPING_TYPE__METADATAEXTENSION:
                return mETADATAEXTENSION != null && !mETADATAEXTENSION.isEmpty();
            case PowrmartPackage.MAPPING_TYPE__CRCVALUE:
                return CRCVALUE_EDEFAULT == null ? cRCVALUE != null : !CRCVALUE_EDEFAULT.equals(cRCVALUE);
            case PowrmartPackage.MAPPING_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.MAPPING_TYPE__ISPROFILEMAPPING:
                return isSetISPROFILEMAPPING();
            case PowrmartPackage.MAPPING_TYPE__ISVALID:
                return ISVALID_EDEFAULT == null ? iSVALID != null : !ISVALID_EDEFAULT.equals(iSVALID);
            case PowrmartPackage.MAPPING_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.MAPPING_TYPE__OBJECTVERSION:
                return OBJECTVERSION_EDEFAULT == null ? oBJECTVERSION != null : !OBJECTVERSION_EDEFAULT.equals(oBJECTVERSION);
            case PowrmartPackage.MAPPING_TYPE__VERSIONNUMBER:
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
        result.append(" (cRCVALUE: ");
        result.append(cRCVALUE);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", iSPROFILEMAPPING: ");
        if (iSPROFILEMAPPINGESet) result.append(iSPROFILEMAPPING); else result.append("<unset>");
        result.append(", iSVALID: ");
        result.append(iSVALID);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", oBJECTVERSION: ");
        result.append(oBJECTVERSION);
        result.append(", vERSIONNUMBER: ");
        result.append(vERSIONNUMBER);
        result.append(')');
        return result.toString();
    }

} //MAPPINGTypeImpl
