/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ERPSRCINFOType;
import Powrmart.FLATFILEType;
import Powrmart.GROUPType;
import Powrmart.METADATAEXTENSIONType;
import Powrmart.PowrmartPackage;
import Powrmart.SOURCEFIELDType;
import Powrmart.SOURCEType;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.XMLINFOType;

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
 * An implementation of the model object '<em><b>SOURCE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getFLATFILE <em>FLATFILE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getXMLINFO <em>XMLINFO</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getERPSRCINFO <em>ERPSRCINFO</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getSOURCEFIELD <em>SOURCEFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getBUSINESSNAME <em>BUSINESSNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getCRCVALUE <em>CRCVALUE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getDATABASESUBTYPE <em>DATABASESUBTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getDATABASETYPE <em>DATABASETYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getDBDNAME <em>DBDNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getIBMCOMP <em>IBMCOMP</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getOBJECTVERSION <em>OBJECTVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getOWNERNAME <em>OWNERNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCETypeImpl#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SOURCETypeImpl extends EObjectImpl implements SOURCEType {
    /**
     * The cached value of the '{@link #getFLATFILE() <em>FLATFILE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFLATFILE()
     * @generated
     * @ordered
     */
    protected FLATFILEType fLATFILE;

    /**
     * The cached value of the '{@link #getXMLINFO() <em>XMLINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLINFO()
     * @generated
     * @ordered
     */
    protected XMLINFOType xMLINFO;

    /**
     * The cached value of the '{@link #getERPSRCINFO() <em>ERPSRCINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getERPSRCINFO()
     * @generated
     * @ordered
     */
    protected ERPSRCINFOType eRPSRCINFO;

    /**
     * The cached value of the '{@link #getGROUP() <em>GROUP</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGROUP()
     * @generated
     * @ordered
     */
    protected EList<GROUPType> gROUP;

    /**
     * The cached value of the '{@link #getTABLEATTRIBUTE() <em>TABLEATTRIBUTE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTABLEATTRIBUTE()
     * @generated
     * @ordered
     */
    protected EList<TABLEATTRIBUTEType> tABLEATTRIBUTE;

    /**
     * The cached value of the '{@link #getSOURCEFIELD() <em>SOURCEFIELD</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSOURCEFIELD()
     * @generated
     * @ordered
     */
    protected EList<SOURCEFIELDType> sOURCEFIELD;

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
     * The default value of the '{@link #getDATABASESUBTYPE() <em>DATABASESUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATABASESUBTYPE()
     * @generated
     * @ordered
     */
    protected static final Object DATABASESUBTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDATABASESUBTYPE() <em>DATABASESUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATABASESUBTYPE()
     * @generated
     * @ordered
     */
    protected Object dATABASESUBTYPE = DATABASESUBTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getDATABASETYPE() <em>DATABASETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATABASETYPE()
     * @generated
     * @ordered
     */
    protected static final Object DATABASETYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDATABASETYPE() <em>DATABASETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATABASETYPE()
     * @generated
     * @ordered
     */
    protected Object dATABASETYPE = DATABASETYPE_EDEFAULT;

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
     * The default value of the '{@link #getIBMCOMP() <em>IBMCOMP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIBMCOMP()
     * @generated
     * @ordered
     */
    protected static final Object IBMCOMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIBMCOMP() <em>IBMCOMP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIBMCOMP()
     * @generated
     * @ordered
     */
    protected Object iBMCOMP = IBMCOMP_EDEFAULT;

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
     * The default value of the '{@link #getOWNERNAME() <em>OWNERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOWNERNAME()
     * @generated
     * @ordered
     */
    protected static final Object OWNERNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOWNERNAME() <em>OWNERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOWNERNAME()
     * @generated
     * @ordered
     */
    protected Object oWNERNAME = OWNERNAME_EDEFAULT;

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
    protected SOURCETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSOURCEType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FLATFILEType getFLATFILE() {
        return fLATFILE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFLATFILE(FLATFILEType newFLATFILE, NotificationChain msgs) {
        FLATFILEType oldFLATFILE = fLATFILE;
        fLATFILE = newFLATFILE;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__FLATFILE, oldFLATFILE, newFLATFILE);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFLATFILE(FLATFILEType newFLATFILE) {
        if (newFLATFILE != fLATFILE) {
            NotificationChain msgs = null;
            if (fLATFILE != null)
                msgs = ((InternalEObject)fLATFILE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SOURCE_TYPE__FLATFILE, null, msgs);
            if (newFLATFILE != null)
                msgs = ((InternalEObject)newFLATFILE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SOURCE_TYPE__FLATFILE, null, msgs);
            msgs = basicSetFLATFILE(newFLATFILE, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__FLATFILE, newFLATFILE, newFLATFILE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLINFOType getXMLINFO() {
        return xMLINFO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetXMLINFO(XMLINFOType newXMLINFO, NotificationChain msgs) {
        XMLINFOType oldXMLINFO = xMLINFO;
        xMLINFO = newXMLINFO;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__XMLINFO, oldXMLINFO, newXMLINFO);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXMLINFO(XMLINFOType newXMLINFO) {
        if (newXMLINFO != xMLINFO) {
            NotificationChain msgs = null;
            if (xMLINFO != null)
                msgs = ((InternalEObject)xMLINFO).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SOURCE_TYPE__XMLINFO, null, msgs);
            if (newXMLINFO != null)
                msgs = ((InternalEObject)newXMLINFO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SOURCE_TYPE__XMLINFO, null, msgs);
            msgs = basicSetXMLINFO(newXMLINFO, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__XMLINFO, newXMLINFO, newXMLINFO));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ERPSRCINFOType getERPSRCINFO() {
        return eRPSRCINFO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetERPSRCINFO(ERPSRCINFOType newERPSRCINFO, NotificationChain msgs) {
        ERPSRCINFOType oldERPSRCINFO = eRPSRCINFO;
        eRPSRCINFO = newERPSRCINFO;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__ERPSRCINFO, oldERPSRCINFO, newERPSRCINFO);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setERPSRCINFO(ERPSRCINFOType newERPSRCINFO) {
        if (newERPSRCINFO != eRPSRCINFO) {
            NotificationChain msgs = null;
            if (eRPSRCINFO != null)
                msgs = ((InternalEObject)eRPSRCINFO).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SOURCE_TYPE__ERPSRCINFO, null, msgs);
            if (newERPSRCINFO != null)
                msgs = ((InternalEObject)newERPSRCINFO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SOURCE_TYPE__ERPSRCINFO, null, msgs);
            msgs = basicSetERPSRCINFO(newERPSRCINFO, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__ERPSRCINFO, newERPSRCINFO, newERPSRCINFO));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GROUPType> getGROUP() {
        if (gROUP == null) {
            gROUP = new EObjectContainmentEList<GROUPType>(GROUPType.class, this, PowrmartPackage.SOURCE_TYPE__GROUP);
        }
        return gROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TABLEATTRIBUTEType> getTABLEATTRIBUTE() {
        if (tABLEATTRIBUTE == null) {
            tABLEATTRIBUTE = new EObjectContainmentEList<TABLEATTRIBUTEType>(TABLEATTRIBUTEType.class, this, PowrmartPackage.SOURCE_TYPE__TABLEATTRIBUTE);
        }
        return tABLEATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SOURCEFIELDType> getSOURCEFIELD() {
        if (sOURCEFIELD == null) {
            sOURCEFIELD = new EObjectContainmentEList<SOURCEFIELDType>(SOURCEFIELDType.class, this, PowrmartPackage.SOURCE_TYPE__SOURCEFIELD);
        }
        return sOURCEFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<METADATAEXTENSIONType> getMETADATAEXTENSION() {
        if (mETADATAEXTENSION == null) {
            mETADATAEXTENSION = new EObjectContainmentEList<METADATAEXTENSIONType>(METADATAEXTENSIONType.class, this, PowrmartPackage.SOURCE_TYPE__METADATAEXTENSION);
        }
        return mETADATAEXTENSION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__BUSINESSNAME, oldBUSINESSNAME, bUSINESSNAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__COMPONENTVERSION, oldCOMPONENTVERSION, cOMPONENTVERSION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__CRCVALUE, oldCRCVALUE, cRCVALUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDATABASESUBTYPE() {
        return dATABASESUBTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATABASESUBTYPE(Object newDATABASESUBTYPE) {
        Object oldDATABASESUBTYPE = dATABASESUBTYPE;
        dATABASESUBTYPE = newDATABASESUBTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__DATABASESUBTYPE, oldDATABASESUBTYPE, dATABASESUBTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDATABASETYPE() {
        return dATABASETYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATABASETYPE(Object newDATABASETYPE) {
        Object oldDATABASETYPE = dATABASETYPE;
        dATABASETYPE = newDATABASETYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__DATABASETYPE, oldDATABASETYPE, dATABASETYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__DBDNAME, oldDBDNAME, dBDNAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getIBMCOMP() {
        return iBMCOMP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIBMCOMP(Object newIBMCOMP) {
        Object oldIBMCOMP = iBMCOMP;
        iBMCOMP = newIBMCOMP;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__IBMCOMP, oldIBMCOMP, iBMCOMP));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__NAME, oldNAME, nAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__OBJECTVERSION, oldOBJECTVERSION, oBJECTVERSION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getOWNERNAME() {
        return oWNERNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOWNERNAME(Object newOWNERNAME) {
        Object oldOWNERNAME = oWNERNAME;
        oWNERNAME = newOWNERNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__OWNERNAME, oldOWNERNAME, oWNERNAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCE_TYPE__VERSIONNUMBER, oldVERSIONNUMBER, vERSIONNUMBER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SOURCE_TYPE__FLATFILE:
                return basicSetFLATFILE(null, msgs);
            case PowrmartPackage.SOURCE_TYPE__XMLINFO:
                return basicSetXMLINFO(null, msgs);
            case PowrmartPackage.SOURCE_TYPE__ERPSRCINFO:
                return basicSetERPSRCINFO(null, msgs);
            case PowrmartPackage.SOURCE_TYPE__GROUP:
                return ((InternalEList<?>)getGROUP()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SOURCE_TYPE__TABLEATTRIBUTE:
                return ((InternalEList<?>)getTABLEATTRIBUTE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SOURCE_TYPE__SOURCEFIELD:
                return ((InternalEList<?>)getSOURCEFIELD()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SOURCE_TYPE__METADATAEXTENSION:
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
            case PowrmartPackage.SOURCE_TYPE__FLATFILE:
                return getFLATFILE();
            case PowrmartPackage.SOURCE_TYPE__XMLINFO:
                return getXMLINFO();
            case PowrmartPackage.SOURCE_TYPE__ERPSRCINFO:
                return getERPSRCINFO();
            case PowrmartPackage.SOURCE_TYPE__GROUP:
                return getGROUP();
            case PowrmartPackage.SOURCE_TYPE__TABLEATTRIBUTE:
                return getTABLEATTRIBUTE();
            case PowrmartPackage.SOURCE_TYPE__SOURCEFIELD:
                return getSOURCEFIELD();
            case PowrmartPackage.SOURCE_TYPE__METADATAEXTENSION:
                return getMETADATAEXTENSION();
            case PowrmartPackage.SOURCE_TYPE__BUSINESSNAME:
                return getBUSINESSNAME();
            case PowrmartPackage.SOURCE_TYPE__COMPONENTVERSION:
                return getCOMPONENTVERSION();
            case PowrmartPackage.SOURCE_TYPE__CRCVALUE:
                return getCRCVALUE();
            case PowrmartPackage.SOURCE_TYPE__DATABASESUBTYPE:
                return getDATABASESUBTYPE();
            case PowrmartPackage.SOURCE_TYPE__DATABASETYPE:
                return getDATABASETYPE();
            case PowrmartPackage.SOURCE_TYPE__DBDNAME:
                return getDBDNAME();
            case PowrmartPackage.SOURCE_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.SOURCE_TYPE__IBMCOMP:
                return getIBMCOMP();
            case PowrmartPackage.SOURCE_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SOURCE_TYPE__OBJECTVERSION:
                return getOBJECTVERSION();
            case PowrmartPackage.SOURCE_TYPE__OWNERNAME:
                return getOWNERNAME();
            case PowrmartPackage.SOURCE_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.SOURCE_TYPE__FLATFILE:
                setFLATFILE((FLATFILEType)newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__XMLINFO:
                setXMLINFO((XMLINFOType)newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__ERPSRCINFO:
                setERPSRCINFO((ERPSRCINFOType)newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__GROUP:
                getGROUP().clear();
                getGROUP().addAll((Collection<? extends GROUPType>)newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__TABLEATTRIBUTE:
                getTABLEATTRIBUTE().clear();
                getTABLEATTRIBUTE().addAll((Collection<? extends TABLEATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__SOURCEFIELD:
                getSOURCEFIELD().clear();
                getSOURCEFIELD().addAll((Collection<? extends SOURCEFIELDType>)newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                getMETADATAEXTENSION().addAll((Collection<? extends METADATAEXTENSIONType>)newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__BUSINESSNAME:
                setBUSINESSNAME(newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__COMPONENTVERSION:
                setCOMPONENTVERSION(newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__CRCVALUE:
                setCRCVALUE(newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__DATABASESUBTYPE:
                setDATABASESUBTYPE(newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__DATABASETYPE:
                setDATABASETYPE(newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__DBDNAME:
                setDBDNAME(newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__IBMCOMP:
                setIBMCOMP(newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__OBJECTVERSION:
                setOBJECTVERSION(newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__OWNERNAME:
                setOWNERNAME(newValue);
                return;
            case PowrmartPackage.SOURCE_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.SOURCE_TYPE__FLATFILE:
                setFLATFILE((FLATFILEType)null);
                return;
            case PowrmartPackage.SOURCE_TYPE__XMLINFO:
                setXMLINFO((XMLINFOType)null);
                return;
            case PowrmartPackage.SOURCE_TYPE__ERPSRCINFO:
                setERPSRCINFO((ERPSRCINFOType)null);
                return;
            case PowrmartPackage.SOURCE_TYPE__GROUP:
                getGROUP().clear();
                return;
            case PowrmartPackage.SOURCE_TYPE__TABLEATTRIBUTE:
                getTABLEATTRIBUTE().clear();
                return;
            case PowrmartPackage.SOURCE_TYPE__SOURCEFIELD:
                getSOURCEFIELD().clear();
                return;
            case PowrmartPackage.SOURCE_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                return;
            case PowrmartPackage.SOURCE_TYPE__BUSINESSNAME:
                setBUSINESSNAME(BUSINESSNAME_EDEFAULT);
                return;
            case PowrmartPackage.SOURCE_TYPE__COMPONENTVERSION:
                setCOMPONENTVERSION(COMPONENTVERSION_EDEFAULT);
                return;
            case PowrmartPackage.SOURCE_TYPE__CRCVALUE:
                setCRCVALUE(CRCVALUE_EDEFAULT);
                return;
            case PowrmartPackage.SOURCE_TYPE__DATABASESUBTYPE:
                setDATABASESUBTYPE(DATABASESUBTYPE_EDEFAULT);
                return;
            case PowrmartPackage.SOURCE_TYPE__DATABASETYPE:
                setDATABASETYPE(DATABASETYPE_EDEFAULT);
                return;
            case PowrmartPackage.SOURCE_TYPE__DBDNAME:
                setDBDNAME(DBDNAME_EDEFAULT);
                return;
            case PowrmartPackage.SOURCE_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.SOURCE_TYPE__IBMCOMP:
                setIBMCOMP(IBMCOMP_EDEFAULT);
                return;
            case PowrmartPackage.SOURCE_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SOURCE_TYPE__OBJECTVERSION:
                setOBJECTVERSION(OBJECTVERSION_EDEFAULT);
                return;
            case PowrmartPackage.SOURCE_TYPE__OWNERNAME:
                setOWNERNAME(OWNERNAME_EDEFAULT);
                return;
            case PowrmartPackage.SOURCE_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.SOURCE_TYPE__FLATFILE:
                return fLATFILE != null;
            case PowrmartPackage.SOURCE_TYPE__XMLINFO:
                return xMLINFO != null;
            case PowrmartPackage.SOURCE_TYPE__ERPSRCINFO:
                return eRPSRCINFO != null;
            case PowrmartPackage.SOURCE_TYPE__GROUP:
                return gROUP != null && !gROUP.isEmpty();
            case PowrmartPackage.SOURCE_TYPE__TABLEATTRIBUTE:
                return tABLEATTRIBUTE != null && !tABLEATTRIBUTE.isEmpty();
            case PowrmartPackage.SOURCE_TYPE__SOURCEFIELD:
                return sOURCEFIELD != null && !sOURCEFIELD.isEmpty();
            case PowrmartPackage.SOURCE_TYPE__METADATAEXTENSION:
                return mETADATAEXTENSION != null && !mETADATAEXTENSION.isEmpty();
            case PowrmartPackage.SOURCE_TYPE__BUSINESSNAME:
                return BUSINESSNAME_EDEFAULT == null ? bUSINESSNAME != null : !BUSINESSNAME_EDEFAULT.equals(bUSINESSNAME);
            case PowrmartPackage.SOURCE_TYPE__COMPONENTVERSION:
                return COMPONENTVERSION_EDEFAULT == null ? cOMPONENTVERSION != null : !COMPONENTVERSION_EDEFAULT.equals(cOMPONENTVERSION);
            case PowrmartPackage.SOURCE_TYPE__CRCVALUE:
                return CRCVALUE_EDEFAULT == null ? cRCVALUE != null : !CRCVALUE_EDEFAULT.equals(cRCVALUE);
            case PowrmartPackage.SOURCE_TYPE__DATABASESUBTYPE:
                return DATABASESUBTYPE_EDEFAULT == null ? dATABASESUBTYPE != null : !DATABASESUBTYPE_EDEFAULT.equals(dATABASESUBTYPE);
            case PowrmartPackage.SOURCE_TYPE__DATABASETYPE:
                return DATABASETYPE_EDEFAULT == null ? dATABASETYPE != null : !DATABASETYPE_EDEFAULT.equals(dATABASETYPE);
            case PowrmartPackage.SOURCE_TYPE__DBDNAME:
                return DBDNAME_EDEFAULT == null ? dBDNAME != null : !DBDNAME_EDEFAULT.equals(dBDNAME);
            case PowrmartPackage.SOURCE_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.SOURCE_TYPE__IBMCOMP:
                return IBMCOMP_EDEFAULT == null ? iBMCOMP != null : !IBMCOMP_EDEFAULT.equals(iBMCOMP);
            case PowrmartPackage.SOURCE_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SOURCE_TYPE__OBJECTVERSION:
                return OBJECTVERSION_EDEFAULT == null ? oBJECTVERSION != null : !OBJECTVERSION_EDEFAULT.equals(oBJECTVERSION);
            case PowrmartPackage.SOURCE_TYPE__OWNERNAME:
                return OWNERNAME_EDEFAULT == null ? oWNERNAME != null : !OWNERNAME_EDEFAULT.equals(oWNERNAME);
            case PowrmartPackage.SOURCE_TYPE__VERSIONNUMBER:
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
        result.append(" (bUSINESSNAME: ");
        result.append(bUSINESSNAME);
        result.append(", cOMPONENTVERSION: ");
        result.append(cOMPONENTVERSION);
        result.append(", cRCVALUE: ");
        result.append(cRCVALUE);
        result.append(", dATABASESUBTYPE: ");
        result.append(dATABASESUBTYPE);
        result.append(", dATABASETYPE: ");
        result.append(dATABASETYPE);
        result.append(", dBDNAME: ");
        result.append(dBDNAME);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", iBMCOMP: ");
        result.append(iBMCOMP);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", oBJECTVERSION: ");
        result.append(oBJECTVERSION);
        result.append(", oWNERNAME: ");
        result.append(oWNERNAME);
        result.append(", vERSIONNUMBER: ");
        result.append(vERSIONNUMBER);
        result.append(')');
        return result.toString();
    }

} //SOURCETypeImpl
