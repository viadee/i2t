/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.FLATFILEType;
import Powrmart.GROUPType;
import Powrmart.KEYWORDType;
import Powrmart.METADATAEXTENSIONType;
import Powrmart.PowrmartPackage;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TARGETFIELDType;
import Powrmart.TARGETINDEXType;
import Powrmart.TARGETType;
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
 * An implementation of the model object '<em><b>TARGET Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getKEYWORD <em>KEYWORD</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getFLATFILE <em>FLATFILE</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getXMLINFO <em>XMLINFO</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getTARGETFIELD <em>TARGETFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getTARGETINDEX <em>TARGETINDEX</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getBUSINESSNAME <em>BUSINESSNAME</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getCONSTRAINT <em>CONSTRAINT</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getCRCVALUE <em>CRCVALUE</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getDATABASETYPE <em>DATABASETYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getOBJECTVERSION <em>OBJECTVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getTABLEOPTIONS <em>TABLEOPTIONS</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getTABLETYPE <em>TABLETYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TARGETTypeImpl#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TARGETTypeImpl extends EObjectImpl implements TARGETType {
    /**
     * The cached value of the '{@link #getKEYWORD() <em>KEYWORD</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKEYWORD()
     * @generated
     * @ordered
     */
    protected EList<KEYWORDType> kEYWORD;

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
     * The cached value of the '{@link #getGROUP() <em>GROUP</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGROUP()
     * @generated
     * @ordered
     */
    protected EList<GROUPType> gROUP;

    /**
     * The cached value of the '{@link #getTARGETFIELD() <em>TARGETFIELD</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTARGETFIELD()
     * @generated
     * @ordered
     */
    protected EList<TARGETFIELDType> tARGETFIELD;

    /**
     * The cached value of the '{@link #getTARGETINDEX() <em>TARGETINDEX</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTARGETINDEX()
     * @generated
     * @ordered
     */
    protected EList<TARGETINDEXType> tARGETINDEX;

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
     * The default value of the '{@link #getCONSTRAINT() <em>CONSTRAINT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONSTRAINT()
     * @generated
     * @ordered
     */
    protected static final Object CONSTRAINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCONSTRAINT() <em>CONSTRAINT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONSTRAINT()
     * @generated
     * @ordered
     */
    protected Object cONSTRAINT = CONSTRAINT_EDEFAULT;

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
     * The default value of the '{@link #getTABLEOPTIONS() <em>TABLEOPTIONS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTABLEOPTIONS()
     * @generated
     * @ordered
     */
    protected static final Object TABLEOPTIONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTABLEOPTIONS() <em>TABLEOPTIONS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTABLEOPTIONS()
     * @generated
     * @ordered
     */
    protected Object tABLEOPTIONS = TABLEOPTIONS_EDEFAULT;

    /**
     * The default value of the '{@link #getTABLETYPE() <em>TABLETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTABLETYPE()
     * @generated
     * @ordered
     */
    protected static final Object TABLETYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTABLETYPE() <em>TABLETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTABLETYPE()
     * @generated
     * @ordered
     */
    protected Object tABLETYPE = TABLETYPE_EDEFAULT;

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
    protected TARGETTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getTARGETType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KEYWORDType> getKEYWORD() {
        if (kEYWORD == null) {
            kEYWORD = new EObjectContainmentEList<KEYWORDType>(KEYWORDType.class, this, PowrmartPackage.TARGET_TYPE__KEYWORD);
        }
        return kEYWORD;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__FLATFILE, oldFLATFILE, newFLATFILE);
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
                msgs = ((InternalEObject)fLATFILE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TARGET_TYPE__FLATFILE, null, msgs);
            if (newFLATFILE != null)
                msgs = ((InternalEObject)newFLATFILE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TARGET_TYPE__FLATFILE, null, msgs);
            msgs = basicSetFLATFILE(newFLATFILE, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__FLATFILE, newFLATFILE, newFLATFILE));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__XMLINFO, oldXMLINFO, newXMLINFO);
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
                msgs = ((InternalEObject)xMLINFO).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TARGET_TYPE__XMLINFO, null, msgs);
            if (newXMLINFO != null)
                msgs = ((InternalEObject)newXMLINFO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TARGET_TYPE__XMLINFO, null, msgs);
            msgs = basicSetXMLINFO(newXMLINFO, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__XMLINFO, newXMLINFO, newXMLINFO));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GROUPType> getGROUP() {
        if (gROUP == null) {
            gROUP = new EObjectContainmentEList<GROUPType>(GROUPType.class, this, PowrmartPackage.TARGET_TYPE__GROUP);
        }
        return gROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TARGETFIELDType> getTARGETFIELD() {
        if (tARGETFIELD == null) {
            tARGETFIELD = new EObjectContainmentEList<TARGETFIELDType>(TARGETFIELDType.class, this, PowrmartPackage.TARGET_TYPE__TARGETFIELD);
        }
        return tARGETFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TARGETINDEXType> getTARGETINDEX() {
        if (tARGETINDEX == null) {
            tARGETINDEX = new EObjectContainmentEList<TARGETINDEXType>(TARGETINDEXType.class, this, PowrmartPackage.TARGET_TYPE__TARGETINDEX);
        }
        return tARGETINDEX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TABLEATTRIBUTEType> getTABLEATTRIBUTE() {
        if (tABLEATTRIBUTE == null) {
            tABLEATTRIBUTE = new EObjectContainmentEList<TABLEATTRIBUTEType>(TABLEATTRIBUTEType.class, this, PowrmartPackage.TARGET_TYPE__TABLEATTRIBUTE);
        }
        return tABLEATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<METADATAEXTENSIONType> getMETADATAEXTENSION() {
        if (mETADATAEXTENSION == null) {
            mETADATAEXTENSION = new EObjectContainmentEList<METADATAEXTENSIONType>(METADATAEXTENSIONType.class, this, PowrmartPackage.TARGET_TYPE__METADATAEXTENSION);
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__BUSINESSNAME, oldBUSINESSNAME, bUSINESSNAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__COMPONENTVERSION, oldCOMPONENTVERSION, cOMPONENTVERSION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCONSTRAINT() {
        return cONSTRAINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONSTRAINT(Object newCONSTRAINT) {
        Object oldCONSTRAINT = cONSTRAINT;
        cONSTRAINT = newCONSTRAINT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__CONSTRAINT, oldCONSTRAINT, cONSTRAINT));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__CRCVALUE, oldCRCVALUE, cRCVALUE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__DATABASETYPE, oldDATABASETYPE, dATABASETYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__NAME, oldNAME, nAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__OBJECTVERSION, oldOBJECTVERSION, oBJECTVERSION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTABLEOPTIONS() {
        return tABLEOPTIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTABLEOPTIONS(Object newTABLEOPTIONS) {
        Object oldTABLEOPTIONS = tABLEOPTIONS;
        tABLEOPTIONS = newTABLEOPTIONS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__TABLEOPTIONS, oldTABLEOPTIONS, tABLEOPTIONS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTABLETYPE() {
        return tABLETYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTABLETYPE(Object newTABLETYPE) {
        Object oldTABLETYPE = tABLETYPE;
        tABLETYPE = newTABLETYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__TABLETYPE, oldTABLETYPE, tABLETYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TARGET_TYPE__VERSIONNUMBER, oldVERSIONNUMBER, vERSIONNUMBER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.TARGET_TYPE__KEYWORD:
                return ((InternalEList<?>)getKEYWORD()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TARGET_TYPE__FLATFILE:
                return basicSetFLATFILE(null, msgs);
            case PowrmartPackage.TARGET_TYPE__XMLINFO:
                return basicSetXMLINFO(null, msgs);
            case PowrmartPackage.TARGET_TYPE__GROUP:
                return ((InternalEList<?>)getGROUP()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TARGET_TYPE__TARGETFIELD:
                return ((InternalEList<?>)getTARGETFIELD()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TARGET_TYPE__TARGETINDEX:
                return ((InternalEList<?>)getTARGETINDEX()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TARGET_TYPE__TABLEATTRIBUTE:
                return ((InternalEList<?>)getTABLEATTRIBUTE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TARGET_TYPE__METADATAEXTENSION:
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
            case PowrmartPackage.TARGET_TYPE__KEYWORD:
                return getKEYWORD();
            case PowrmartPackage.TARGET_TYPE__FLATFILE:
                return getFLATFILE();
            case PowrmartPackage.TARGET_TYPE__XMLINFO:
                return getXMLINFO();
            case PowrmartPackage.TARGET_TYPE__GROUP:
                return getGROUP();
            case PowrmartPackage.TARGET_TYPE__TARGETFIELD:
                return getTARGETFIELD();
            case PowrmartPackage.TARGET_TYPE__TARGETINDEX:
                return getTARGETINDEX();
            case PowrmartPackage.TARGET_TYPE__TABLEATTRIBUTE:
                return getTABLEATTRIBUTE();
            case PowrmartPackage.TARGET_TYPE__METADATAEXTENSION:
                return getMETADATAEXTENSION();
            case PowrmartPackage.TARGET_TYPE__BUSINESSNAME:
                return getBUSINESSNAME();
            case PowrmartPackage.TARGET_TYPE__COMPONENTVERSION:
                return getCOMPONENTVERSION();
            case PowrmartPackage.TARGET_TYPE__CONSTRAINT:
                return getCONSTRAINT();
            case PowrmartPackage.TARGET_TYPE__CRCVALUE:
                return getCRCVALUE();
            case PowrmartPackage.TARGET_TYPE__DATABASETYPE:
                return getDATABASETYPE();
            case PowrmartPackage.TARGET_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.TARGET_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.TARGET_TYPE__OBJECTVERSION:
                return getOBJECTVERSION();
            case PowrmartPackage.TARGET_TYPE__TABLEOPTIONS:
                return getTABLEOPTIONS();
            case PowrmartPackage.TARGET_TYPE__TABLETYPE:
                return getTABLETYPE();
            case PowrmartPackage.TARGET_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.TARGET_TYPE__KEYWORD:
                getKEYWORD().clear();
                getKEYWORD().addAll((Collection<? extends KEYWORDType>)newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__FLATFILE:
                setFLATFILE((FLATFILEType)newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__XMLINFO:
                setXMLINFO((XMLINFOType)newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__GROUP:
                getGROUP().clear();
                getGROUP().addAll((Collection<? extends GROUPType>)newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__TARGETFIELD:
                getTARGETFIELD().clear();
                getTARGETFIELD().addAll((Collection<? extends TARGETFIELDType>)newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__TARGETINDEX:
                getTARGETINDEX().clear();
                getTARGETINDEX().addAll((Collection<? extends TARGETINDEXType>)newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__TABLEATTRIBUTE:
                getTABLEATTRIBUTE().clear();
                getTABLEATTRIBUTE().addAll((Collection<? extends TABLEATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                getMETADATAEXTENSION().addAll((Collection<? extends METADATAEXTENSIONType>)newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__BUSINESSNAME:
                setBUSINESSNAME(newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__COMPONENTVERSION:
                setCOMPONENTVERSION(newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__CONSTRAINT:
                setCONSTRAINT(newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__CRCVALUE:
                setCRCVALUE(newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__DATABASETYPE:
                setDATABASETYPE(newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__OBJECTVERSION:
                setOBJECTVERSION(newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__TABLEOPTIONS:
                setTABLEOPTIONS(newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__TABLETYPE:
                setTABLETYPE(newValue);
                return;
            case PowrmartPackage.TARGET_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.TARGET_TYPE__KEYWORD:
                getKEYWORD().clear();
                return;
            case PowrmartPackage.TARGET_TYPE__FLATFILE:
                setFLATFILE((FLATFILEType)null);
                return;
            case PowrmartPackage.TARGET_TYPE__XMLINFO:
                setXMLINFO((XMLINFOType)null);
                return;
            case PowrmartPackage.TARGET_TYPE__GROUP:
                getGROUP().clear();
                return;
            case PowrmartPackage.TARGET_TYPE__TARGETFIELD:
                getTARGETFIELD().clear();
                return;
            case PowrmartPackage.TARGET_TYPE__TARGETINDEX:
                getTARGETINDEX().clear();
                return;
            case PowrmartPackage.TARGET_TYPE__TABLEATTRIBUTE:
                getTABLEATTRIBUTE().clear();
                return;
            case PowrmartPackage.TARGET_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                return;
            case PowrmartPackage.TARGET_TYPE__BUSINESSNAME:
                setBUSINESSNAME(BUSINESSNAME_EDEFAULT);
                return;
            case PowrmartPackage.TARGET_TYPE__COMPONENTVERSION:
                setCOMPONENTVERSION(COMPONENTVERSION_EDEFAULT);
                return;
            case PowrmartPackage.TARGET_TYPE__CONSTRAINT:
                setCONSTRAINT(CONSTRAINT_EDEFAULT);
                return;
            case PowrmartPackage.TARGET_TYPE__CRCVALUE:
                setCRCVALUE(CRCVALUE_EDEFAULT);
                return;
            case PowrmartPackage.TARGET_TYPE__DATABASETYPE:
                setDATABASETYPE(DATABASETYPE_EDEFAULT);
                return;
            case PowrmartPackage.TARGET_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.TARGET_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.TARGET_TYPE__OBJECTVERSION:
                setOBJECTVERSION(OBJECTVERSION_EDEFAULT);
                return;
            case PowrmartPackage.TARGET_TYPE__TABLEOPTIONS:
                setTABLEOPTIONS(TABLEOPTIONS_EDEFAULT);
                return;
            case PowrmartPackage.TARGET_TYPE__TABLETYPE:
                setTABLETYPE(TABLETYPE_EDEFAULT);
                return;
            case PowrmartPackage.TARGET_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.TARGET_TYPE__KEYWORD:
                return kEYWORD != null && !kEYWORD.isEmpty();
            case PowrmartPackage.TARGET_TYPE__FLATFILE:
                return fLATFILE != null;
            case PowrmartPackage.TARGET_TYPE__XMLINFO:
                return xMLINFO != null;
            case PowrmartPackage.TARGET_TYPE__GROUP:
                return gROUP != null && !gROUP.isEmpty();
            case PowrmartPackage.TARGET_TYPE__TARGETFIELD:
                return tARGETFIELD != null && !tARGETFIELD.isEmpty();
            case PowrmartPackage.TARGET_TYPE__TARGETINDEX:
                return tARGETINDEX != null && !tARGETINDEX.isEmpty();
            case PowrmartPackage.TARGET_TYPE__TABLEATTRIBUTE:
                return tABLEATTRIBUTE != null && !tABLEATTRIBUTE.isEmpty();
            case PowrmartPackage.TARGET_TYPE__METADATAEXTENSION:
                return mETADATAEXTENSION != null && !mETADATAEXTENSION.isEmpty();
            case PowrmartPackage.TARGET_TYPE__BUSINESSNAME:
                return BUSINESSNAME_EDEFAULT == null ? bUSINESSNAME != null : !BUSINESSNAME_EDEFAULT.equals(bUSINESSNAME);
            case PowrmartPackage.TARGET_TYPE__COMPONENTVERSION:
                return COMPONENTVERSION_EDEFAULT == null ? cOMPONENTVERSION != null : !COMPONENTVERSION_EDEFAULT.equals(cOMPONENTVERSION);
            case PowrmartPackage.TARGET_TYPE__CONSTRAINT:
                return CONSTRAINT_EDEFAULT == null ? cONSTRAINT != null : !CONSTRAINT_EDEFAULT.equals(cONSTRAINT);
            case PowrmartPackage.TARGET_TYPE__CRCVALUE:
                return CRCVALUE_EDEFAULT == null ? cRCVALUE != null : !CRCVALUE_EDEFAULT.equals(cRCVALUE);
            case PowrmartPackage.TARGET_TYPE__DATABASETYPE:
                return DATABASETYPE_EDEFAULT == null ? dATABASETYPE != null : !DATABASETYPE_EDEFAULT.equals(dATABASETYPE);
            case PowrmartPackage.TARGET_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.TARGET_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.TARGET_TYPE__OBJECTVERSION:
                return OBJECTVERSION_EDEFAULT == null ? oBJECTVERSION != null : !OBJECTVERSION_EDEFAULT.equals(oBJECTVERSION);
            case PowrmartPackage.TARGET_TYPE__TABLEOPTIONS:
                return TABLEOPTIONS_EDEFAULT == null ? tABLEOPTIONS != null : !TABLEOPTIONS_EDEFAULT.equals(tABLEOPTIONS);
            case PowrmartPackage.TARGET_TYPE__TABLETYPE:
                return TABLETYPE_EDEFAULT == null ? tABLETYPE != null : !TABLETYPE_EDEFAULT.equals(tABLETYPE);
            case PowrmartPackage.TARGET_TYPE__VERSIONNUMBER:
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
        result.append(", cONSTRAINT: ");
        result.append(cONSTRAINT);
        result.append(", cRCVALUE: ");
        result.append(cRCVALUE);
        result.append(", dATABASETYPE: ");
        result.append(dATABASETYPE);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", oBJECTVERSION: ");
        result.append(oBJECTVERSION);
        result.append(", tABLEOPTIONS: ");
        result.append(tABLEOPTIONS);
        result.append(", tABLETYPE: ");
        result.append(tABLETYPE);
        result.append(", vERSIONNUMBER: ");
        result.append(vERSIONNUMBER);
        result.append(')');
        return result.toString();
    }

} //TARGETTypeImpl
