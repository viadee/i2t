/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.EXPRMACRODEPENDENCYType;
import Powrmart.FIELDDEPENDENCYType;
import Powrmart.FLATFILEType;
import Powrmart.GROUPType;
import Powrmart.INITPROPType;
import Powrmart.METADATAEXTENSIONType;
import Powrmart.PARENTTYPEType3;
import Powrmart.PowrmartPackage;
import Powrmart.SOURCEFIELDType;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TRANSFORMATIONType;
import Powrmart.TRANSFORMFIELDATTRDEFType;
import Powrmart.TRANSFORMFIELDType;

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
 * An implementation of the model object '<em><b>TRANSFORMATION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getSOURCEFIELD <em>SOURCEFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getTRANSFORMFIELD <em>TRANSFORMFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getINITPROP <em>INITPROP</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getTRANSFORMFIELDATTRDEF <em>TRANSFORMFIELDATTRDEF</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getFIELDDEPENDENCY <em>FIELDDEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getFLATFILE <em>FLATFILE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getCRCVALUE <em>CRCVALUE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getISVSAMNORMALIZER <em>ISVSAMNORMALIZER</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getOBJECTVERSION <em>OBJECTVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getPARENT <em>PARENT</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getPARENTTYPE <em>PARENTTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getREFDBDNAME <em>REFDBDNAME</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getREFSOURCENAME <em>REFSOURCENAME</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getTEMPLATEID <em>TEMPLATEID</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getTEMPLATENAME <em>TEMPLATENAME</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMATIONTypeImpl#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TRANSFORMATIONTypeImpl extends EObjectImpl implements TRANSFORMATIONType {
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
     * The cached value of the '{@link #getSOURCEFIELD() <em>SOURCEFIELD</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSOURCEFIELD()
     * @generated
     * @ordered
     */
    protected EList<SOURCEFIELDType> sOURCEFIELD;

    /**
     * The cached value of the '{@link #getTRANSFORMFIELD() <em>TRANSFORMFIELD</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTRANSFORMFIELD()
     * @generated
     * @ordered
     */
    protected EList<TRANSFORMFIELDType> tRANSFORMFIELD;

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
     * The cached value of the '{@link #getINITPROP() <em>INITPROP</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINITPROP()
     * @generated
     * @ordered
     */
    protected EList<INITPROPType> iNITPROP;

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
     * The cached value of the '{@link #getTRANSFORMFIELDATTRDEF() <em>TRANSFORMFIELDATTRDEF</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTRANSFORMFIELDATTRDEF()
     * @generated
     * @ordered
     */
    protected EList<TRANSFORMFIELDATTRDEFType> tRANSFORMFIELDATTRDEF;

    /**
     * The cached value of the '{@link #getFIELDDEPENDENCY() <em>FIELDDEPENDENCY</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELDDEPENDENCY()
     * @generated
     * @ordered
     */
    protected EList<FIELDDEPENDENCYType> fIELDDEPENDENCY;

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
     * The cached value of the '{@link #getEXPRMACRODEPENDENCY() <em>EXPRMACRODEPENDENCY</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEXPRMACRODEPENDENCY()
     * @generated
     * @ordered
     */
    protected EList<EXPRMACRODEPENDENCYType> eXPRMACRODEPENDENCY;

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
     * The default value of the '{@link #getISVSAMNORMALIZER() <em>ISVSAMNORMALIZER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISVSAMNORMALIZER()
     * @generated
     * @ordered
     */
    protected static final Object ISVSAMNORMALIZER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getISVSAMNORMALIZER() <em>ISVSAMNORMALIZER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISVSAMNORMALIZER()
     * @generated
     * @ordered
     */
    protected Object iSVSAMNORMALIZER = ISVSAMNORMALIZER_EDEFAULT;

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
     * The default value of the '{@link #getPARENT() <em>PARENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENT()
     * @generated
     * @ordered
     */
    protected static final Object PARENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPARENT() <em>PARENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENT()
     * @generated
     * @ordered
     */
    protected Object pARENT = PARENT_EDEFAULT;

    /**
     * The default value of the '{@link #getPARENTTYPE() <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENTTYPE()
     * @generated
     * @ordered
     */
    protected static final PARENTTYPEType3 PARENTTYPE_EDEFAULT = PARENTTYPEType3.MAPPING;

    /**
     * The cached value of the '{@link #getPARENTTYPE() <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENTTYPE()
     * @generated
     * @ordered
     */
    protected PARENTTYPEType3 pARENTTYPE = PARENTTYPE_EDEFAULT;

    /**
     * This is true if the PARENTTYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pARENTTYPEESet;

    /**
     * The default value of the '{@link #getREFDBDNAME() <em>REFDBDNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFDBDNAME()
     * @generated
     * @ordered
     */
    protected static final Object REFDBDNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFDBDNAME() <em>REFDBDNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFDBDNAME()
     * @generated
     * @ordered
     */
    protected Object rEFDBDNAME = REFDBDNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getREFSOURCENAME() <em>REFSOURCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFSOURCENAME()
     * @generated
     * @ordered
     */
    protected static final Object REFSOURCENAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFSOURCENAME() <em>REFSOURCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFSOURCENAME()
     * @generated
     * @ordered
     */
    protected Object rEFSOURCENAME = REFSOURCENAME_EDEFAULT;

    /**
     * The default value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected static final Object REUSABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected Object rEUSABLE = REUSABLE_EDEFAULT;

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
     * The default value of the '{@link #getTEMPLATENAME() <em>TEMPLATENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTEMPLATENAME()
     * @generated
     * @ordered
     */
    protected static final Object TEMPLATENAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTEMPLATENAME() <em>TEMPLATENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTEMPLATENAME()
     * @generated
     * @ordered
     */
    protected Object tEMPLATENAME = TEMPLATENAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected static final Object TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected Object tYPE = TYPE_EDEFAULT;

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
    protected TRANSFORMATIONTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getTRANSFORMATIONType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GROUPType> getGROUP() {
        if (gROUP == null) {
            gROUP = new EObjectContainmentEList<GROUPType>(GROUPType.class, this, PowrmartPackage.TRANSFORMATION_TYPE__GROUP);
        }
        return gROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SOURCEFIELDType> getSOURCEFIELD() {
        if (sOURCEFIELD == null) {
            sOURCEFIELD = new EObjectContainmentEList<SOURCEFIELDType>(SOURCEFIELDType.class, this, PowrmartPackage.TRANSFORMATION_TYPE__SOURCEFIELD);
        }
        return sOURCEFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TRANSFORMFIELDType> getTRANSFORMFIELD() {
        if (tRANSFORMFIELD == null) {
            tRANSFORMFIELD = new EObjectContainmentEList<TRANSFORMFIELDType>(TRANSFORMFIELDType.class, this, PowrmartPackage.TRANSFORMATION_TYPE__TRANSFORMFIELD);
        }
        return tRANSFORMFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TABLEATTRIBUTEType> getTABLEATTRIBUTE() {
        if (tABLEATTRIBUTE == null) {
            tABLEATTRIBUTE = new EObjectContainmentEList<TABLEATTRIBUTEType>(TABLEATTRIBUTEType.class, this, PowrmartPackage.TRANSFORMATION_TYPE__TABLEATTRIBUTE);
        }
        return tABLEATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<INITPROPType> getINITPROP() {
        if (iNITPROP == null) {
            iNITPROP = new EObjectContainmentEList<INITPROPType>(INITPROPType.class, this, PowrmartPackage.TRANSFORMATION_TYPE__INITPROP);
        }
        return iNITPROP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<METADATAEXTENSIONType> getMETADATAEXTENSION() {
        if (mETADATAEXTENSION == null) {
            mETADATAEXTENSION = new EObjectContainmentEList<METADATAEXTENSIONType>(METADATAEXTENSIONType.class, this, PowrmartPackage.TRANSFORMATION_TYPE__METADATAEXTENSION);
        }
        return mETADATAEXTENSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TRANSFORMFIELDATTRDEFType> getTRANSFORMFIELDATTRDEF() {
        if (tRANSFORMFIELDATTRDEF == null) {
            tRANSFORMFIELDATTRDEF = new EObjectContainmentEList<TRANSFORMFIELDATTRDEFType>(TRANSFORMFIELDATTRDEFType.class, this, PowrmartPackage.TRANSFORMATION_TYPE__TRANSFORMFIELDATTRDEF);
        }
        return tRANSFORMFIELDATTRDEF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FIELDDEPENDENCYType> getFIELDDEPENDENCY() {
        if (fIELDDEPENDENCY == null) {
            fIELDDEPENDENCY = new EObjectContainmentEList<FIELDDEPENDENCYType>(FIELDDEPENDENCYType.class, this, PowrmartPackage.TRANSFORMATION_TYPE__FIELDDEPENDENCY);
        }
        return fIELDDEPENDENCY;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__FLATFILE, oldFLATFILE, newFLATFILE);
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
                msgs = ((InternalEObject)fLATFILE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TRANSFORMATION_TYPE__FLATFILE, null, msgs);
            if (newFLATFILE != null)
                msgs = ((InternalEObject)newFLATFILE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TRANSFORMATION_TYPE__FLATFILE, null, msgs);
            msgs = basicSetFLATFILE(newFLATFILE, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__FLATFILE, newFLATFILE, newFLATFILE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EXPRMACRODEPENDENCYType> getEXPRMACRODEPENDENCY() {
        if (eXPRMACRODEPENDENCY == null) {
            eXPRMACRODEPENDENCY = new EObjectContainmentEList<EXPRMACRODEPENDENCYType>(EXPRMACRODEPENDENCYType.class, this, PowrmartPackage.TRANSFORMATION_TYPE__EXPRMACRODEPENDENCY);
        }
        return eXPRMACRODEPENDENCY;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__COMPONENTVERSION, oldCOMPONENTVERSION, cOMPONENTVERSION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__CRCVALUE, oldCRCVALUE, cRCVALUE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getISVSAMNORMALIZER() {
        return iSVSAMNORMALIZER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISVSAMNORMALIZER(Object newISVSAMNORMALIZER) {
        Object oldISVSAMNORMALIZER = iSVSAMNORMALIZER;
        iSVSAMNORMALIZER = newISVSAMNORMALIZER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__ISVSAMNORMALIZER, oldISVSAMNORMALIZER, iSVSAMNORMALIZER));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__NAME, oldNAME, nAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__OBJECTVERSION, oldOBJECTVERSION, oBJECTVERSION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPARENT() {
        return pARENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARENT(Object newPARENT) {
        Object oldPARENT = pARENT;
        pARENT = newPARENT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__PARENT, oldPARENT, pARENT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARENTTYPEType3 getPARENTTYPE() {
        return pARENTTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARENTTYPE(PARENTTYPEType3 newPARENTTYPE) {
        PARENTTYPEType3 oldPARENTTYPE = pARENTTYPE;
        pARENTTYPE = newPARENTTYPE == null ? PARENTTYPE_EDEFAULT : newPARENTTYPE;
        boolean oldPARENTTYPEESet = pARENTTYPEESet;
        pARENTTYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__PARENTTYPE, oldPARENTTYPE, pARENTTYPE, !oldPARENTTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPARENTTYPE() {
        PARENTTYPEType3 oldPARENTTYPE = pARENTTYPE;
        boolean oldPARENTTYPEESet = pARENTTYPEESet;
        pARENTTYPE = PARENTTYPE_EDEFAULT;
        pARENTTYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TRANSFORMATION_TYPE__PARENTTYPE, oldPARENTTYPE, PARENTTYPE_EDEFAULT, oldPARENTTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPARENTTYPE() {
        return pARENTTYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFDBDNAME() {
        return rEFDBDNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFDBDNAME(Object newREFDBDNAME) {
        Object oldREFDBDNAME = rEFDBDNAME;
        rEFDBDNAME = newREFDBDNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__REFDBDNAME, oldREFDBDNAME, rEFDBDNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFSOURCENAME() {
        return rEFSOURCENAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFSOURCENAME(Object newREFSOURCENAME) {
        Object oldREFSOURCENAME = rEFSOURCENAME;
        rEFSOURCENAME = newREFSOURCENAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__REFSOURCENAME, oldREFSOURCENAME, rEFSOURCENAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREUSABLE() {
        return rEUSABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREUSABLE(Object newREUSABLE) {
        Object oldREUSABLE = rEUSABLE;
        rEUSABLE = newREUSABLE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__REUSABLE, oldREUSABLE, rEUSABLE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__TEMPLATEID, oldTEMPLATEID, tEMPLATEID));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTEMPLATENAME() {
        return tEMPLATENAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTEMPLATENAME(Object newTEMPLATENAME) {
        Object oldTEMPLATENAME = tEMPLATENAME;
        tEMPLATENAME = newTEMPLATENAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__TEMPLATENAME, oldTEMPLATENAME, tEMPLATENAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTYPE(Object newTYPE) {
        Object oldTYPE = tYPE;
        tYPE = newTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__TYPE, oldTYPE, tYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMATION_TYPE__VERSIONNUMBER, oldVERSIONNUMBER, vERSIONNUMBER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.TRANSFORMATION_TYPE__GROUP:
                return ((InternalEList<?>)getGROUP()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TRANSFORMATION_TYPE__SOURCEFIELD:
                return ((InternalEList<?>)getSOURCEFIELD()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TRANSFORMATION_TYPE__TRANSFORMFIELD:
                return ((InternalEList<?>)getTRANSFORMFIELD()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TRANSFORMATION_TYPE__TABLEATTRIBUTE:
                return ((InternalEList<?>)getTABLEATTRIBUTE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TRANSFORMATION_TYPE__INITPROP:
                return ((InternalEList<?>)getINITPROP()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TRANSFORMATION_TYPE__METADATAEXTENSION:
                return ((InternalEList<?>)getMETADATAEXTENSION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TRANSFORMATION_TYPE__TRANSFORMFIELDATTRDEF:
                return ((InternalEList<?>)getTRANSFORMFIELDATTRDEF()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TRANSFORMATION_TYPE__FIELDDEPENDENCY:
                return ((InternalEList<?>)getFIELDDEPENDENCY()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.TRANSFORMATION_TYPE__FLATFILE:
                return basicSetFLATFILE(null, msgs);
            case PowrmartPackage.TRANSFORMATION_TYPE__EXPRMACRODEPENDENCY:
                return ((InternalEList<?>)getEXPRMACRODEPENDENCY()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.TRANSFORMATION_TYPE__GROUP:
                return getGROUP();
            case PowrmartPackage.TRANSFORMATION_TYPE__SOURCEFIELD:
                return getSOURCEFIELD();
            case PowrmartPackage.TRANSFORMATION_TYPE__TRANSFORMFIELD:
                return getTRANSFORMFIELD();
            case PowrmartPackage.TRANSFORMATION_TYPE__TABLEATTRIBUTE:
                return getTABLEATTRIBUTE();
            case PowrmartPackage.TRANSFORMATION_TYPE__INITPROP:
                return getINITPROP();
            case PowrmartPackage.TRANSFORMATION_TYPE__METADATAEXTENSION:
                return getMETADATAEXTENSION();
            case PowrmartPackage.TRANSFORMATION_TYPE__TRANSFORMFIELDATTRDEF:
                return getTRANSFORMFIELDATTRDEF();
            case PowrmartPackage.TRANSFORMATION_TYPE__FIELDDEPENDENCY:
                return getFIELDDEPENDENCY();
            case PowrmartPackage.TRANSFORMATION_TYPE__FLATFILE:
                return getFLATFILE();
            case PowrmartPackage.TRANSFORMATION_TYPE__EXPRMACRODEPENDENCY:
                return getEXPRMACRODEPENDENCY();
            case PowrmartPackage.TRANSFORMATION_TYPE__COMPONENTVERSION:
                return getCOMPONENTVERSION();
            case PowrmartPackage.TRANSFORMATION_TYPE__CRCVALUE:
                return getCRCVALUE();
            case PowrmartPackage.TRANSFORMATION_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.TRANSFORMATION_TYPE__ISVSAMNORMALIZER:
                return getISVSAMNORMALIZER();
            case PowrmartPackage.TRANSFORMATION_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.TRANSFORMATION_TYPE__OBJECTVERSION:
                return getOBJECTVERSION();
            case PowrmartPackage.TRANSFORMATION_TYPE__PARENT:
                return getPARENT();
            case PowrmartPackage.TRANSFORMATION_TYPE__PARENTTYPE:
                return getPARENTTYPE();
            case PowrmartPackage.TRANSFORMATION_TYPE__REFDBDNAME:
                return getREFDBDNAME();
            case PowrmartPackage.TRANSFORMATION_TYPE__REFSOURCENAME:
                return getREFSOURCENAME();
            case PowrmartPackage.TRANSFORMATION_TYPE__REUSABLE:
                return getREUSABLE();
            case PowrmartPackage.TRANSFORMATION_TYPE__TEMPLATEID:
                return getTEMPLATEID();
            case PowrmartPackage.TRANSFORMATION_TYPE__TEMPLATENAME:
                return getTEMPLATENAME();
            case PowrmartPackage.TRANSFORMATION_TYPE__TYPE:
                return getTYPE();
            case PowrmartPackage.TRANSFORMATION_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.TRANSFORMATION_TYPE__GROUP:
                getGROUP().clear();
                getGROUP().addAll((Collection<? extends GROUPType>)newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__SOURCEFIELD:
                getSOURCEFIELD().clear();
                getSOURCEFIELD().addAll((Collection<? extends SOURCEFIELDType>)newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__TRANSFORMFIELD:
                getTRANSFORMFIELD().clear();
                getTRANSFORMFIELD().addAll((Collection<? extends TRANSFORMFIELDType>)newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__TABLEATTRIBUTE:
                getTABLEATTRIBUTE().clear();
                getTABLEATTRIBUTE().addAll((Collection<? extends TABLEATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__INITPROP:
                getINITPROP().clear();
                getINITPROP().addAll((Collection<? extends INITPROPType>)newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                getMETADATAEXTENSION().addAll((Collection<? extends METADATAEXTENSIONType>)newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__TRANSFORMFIELDATTRDEF:
                getTRANSFORMFIELDATTRDEF().clear();
                getTRANSFORMFIELDATTRDEF().addAll((Collection<? extends TRANSFORMFIELDATTRDEFType>)newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__FIELDDEPENDENCY:
                getFIELDDEPENDENCY().clear();
                getFIELDDEPENDENCY().addAll((Collection<? extends FIELDDEPENDENCYType>)newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__FLATFILE:
                setFLATFILE((FLATFILEType)newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__EXPRMACRODEPENDENCY:
                getEXPRMACRODEPENDENCY().clear();
                getEXPRMACRODEPENDENCY().addAll((Collection<? extends EXPRMACRODEPENDENCYType>)newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__COMPONENTVERSION:
                setCOMPONENTVERSION(newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__CRCVALUE:
                setCRCVALUE(newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__ISVSAMNORMALIZER:
                setISVSAMNORMALIZER(newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__OBJECTVERSION:
                setOBJECTVERSION(newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__PARENT:
                setPARENT(newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__PARENTTYPE:
                setPARENTTYPE((PARENTTYPEType3)newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__REFDBDNAME:
                setREFDBDNAME(newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__REFSOURCENAME:
                setREFSOURCENAME(newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__REUSABLE:
                setREUSABLE(newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__TEMPLATEID:
                setTEMPLATEID(newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__TEMPLATENAME:
                setTEMPLATENAME(newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__TYPE:
                setTYPE(newValue);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.TRANSFORMATION_TYPE__GROUP:
                getGROUP().clear();
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__SOURCEFIELD:
                getSOURCEFIELD().clear();
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__TRANSFORMFIELD:
                getTRANSFORMFIELD().clear();
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__TABLEATTRIBUTE:
                getTABLEATTRIBUTE().clear();
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__INITPROP:
                getINITPROP().clear();
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__TRANSFORMFIELDATTRDEF:
                getTRANSFORMFIELDATTRDEF().clear();
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__FIELDDEPENDENCY:
                getFIELDDEPENDENCY().clear();
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__FLATFILE:
                setFLATFILE((FLATFILEType)null);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__EXPRMACRODEPENDENCY:
                getEXPRMACRODEPENDENCY().clear();
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__COMPONENTVERSION:
                setCOMPONENTVERSION(COMPONENTVERSION_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__CRCVALUE:
                setCRCVALUE(CRCVALUE_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__ISVSAMNORMALIZER:
                setISVSAMNORMALIZER(ISVSAMNORMALIZER_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__OBJECTVERSION:
                setOBJECTVERSION(OBJECTVERSION_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__PARENT:
                setPARENT(PARENT_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__PARENTTYPE:
                unsetPARENTTYPE();
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__REFDBDNAME:
                setREFDBDNAME(REFDBDNAME_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__REFSOURCENAME:
                setREFSOURCENAME(REFSOURCENAME_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__REUSABLE:
                setREUSABLE(REUSABLE_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__TEMPLATEID:
                setTEMPLATEID(TEMPLATEID_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__TEMPLATENAME:
                setTEMPLATENAME(TEMPLATENAME_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__TYPE:
                setTYPE(TYPE_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMATION_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.TRANSFORMATION_TYPE__GROUP:
                return gROUP != null && !gROUP.isEmpty();
            case PowrmartPackage.TRANSFORMATION_TYPE__SOURCEFIELD:
                return sOURCEFIELD != null && !sOURCEFIELD.isEmpty();
            case PowrmartPackage.TRANSFORMATION_TYPE__TRANSFORMFIELD:
                return tRANSFORMFIELD != null && !tRANSFORMFIELD.isEmpty();
            case PowrmartPackage.TRANSFORMATION_TYPE__TABLEATTRIBUTE:
                return tABLEATTRIBUTE != null && !tABLEATTRIBUTE.isEmpty();
            case PowrmartPackage.TRANSFORMATION_TYPE__INITPROP:
                return iNITPROP != null && !iNITPROP.isEmpty();
            case PowrmartPackage.TRANSFORMATION_TYPE__METADATAEXTENSION:
                return mETADATAEXTENSION != null && !mETADATAEXTENSION.isEmpty();
            case PowrmartPackage.TRANSFORMATION_TYPE__TRANSFORMFIELDATTRDEF:
                return tRANSFORMFIELDATTRDEF != null && !tRANSFORMFIELDATTRDEF.isEmpty();
            case PowrmartPackage.TRANSFORMATION_TYPE__FIELDDEPENDENCY:
                return fIELDDEPENDENCY != null && !fIELDDEPENDENCY.isEmpty();
            case PowrmartPackage.TRANSFORMATION_TYPE__FLATFILE:
                return fLATFILE != null;
            case PowrmartPackage.TRANSFORMATION_TYPE__EXPRMACRODEPENDENCY:
                return eXPRMACRODEPENDENCY != null && !eXPRMACRODEPENDENCY.isEmpty();
            case PowrmartPackage.TRANSFORMATION_TYPE__COMPONENTVERSION:
                return COMPONENTVERSION_EDEFAULT == null ? cOMPONENTVERSION != null : !COMPONENTVERSION_EDEFAULT.equals(cOMPONENTVERSION);
            case PowrmartPackage.TRANSFORMATION_TYPE__CRCVALUE:
                return CRCVALUE_EDEFAULT == null ? cRCVALUE != null : !CRCVALUE_EDEFAULT.equals(cRCVALUE);
            case PowrmartPackage.TRANSFORMATION_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.TRANSFORMATION_TYPE__ISVSAMNORMALIZER:
                return ISVSAMNORMALIZER_EDEFAULT == null ? iSVSAMNORMALIZER != null : !ISVSAMNORMALIZER_EDEFAULT.equals(iSVSAMNORMALIZER);
            case PowrmartPackage.TRANSFORMATION_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.TRANSFORMATION_TYPE__OBJECTVERSION:
                return OBJECTVERSION_EDEFAULT == null ? oBJECTVERSION != null : !OBJECTVERSION_EDEFAULT.equals(oBJECTVERSION);
            case PowrmartPackage.TRANSFORMATION_TYPE__PARENT:
                return PARENT_EDEFAULT == null ? pARENT != null : !PARENT_EDEFAULT.equals(pARENT);
            case PowrmartPackage.TRANSFORMATION_TYPE__PARENTTYPE:
                return isSetPARENTTYPE();
            case PowrmartPackage.TRANSFORMATION_TYPE__REFDBDNAME:
                return REFDBDNAME_EDEFAULT == null ? rEFDBDNAME != null : !REFDBDNAME_EDEFAULT.equals(rEFDBDNAME);
            case PowrmartPackage.TRANSFORMATION_TYPE__REFSOURCENAME:
                return REFSOURCENAME_EDEFAULT == null ? rEFSOURCENAME != null : !REFSOURCENAME_EDEFAULT.equals(rEFSOURCENAME);
            case PowrmartPackage.TRANSFORMATION_TYPE__REUSABLE:
                return REUSABLE_EDEFAULT == null ? rEUSABLE != null : !REUSABLE_EDEFAULT.equals(rEUSABLE);
            case PowrmartPackage.TRANSFORMATION_TYPE__TEMPLATEID:
                return TEMPLATEID_EDEFAULT == null ? tEMPLATEID != null : !TEMPLATEID_EDEFAULT.equals(tEMPLATEID);
            case PowrmartPackage.TRANSFORMATION_TYPE__TEMPLATENAME:
                return TEMPLATENAME_EDEFAULT == null ? tEMPLATENAME != null : !TEMPLATENAME_EDEFAULT.equals(tEMPLATENAME);
            case PowrmartPackage.TRANSFORMATION_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? tYPE != null : !TYPE_EDEFAULT.equals(tYPE);
            case PowrmartPackage.TRANSFORMATION_TYPE__VERSIONNUMBER:
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
        result.append(" (cOMPONENTVERSION: ");
        result.append(cOMPONENTVERSION);
        result.append(", cRCVALUE: ");
        result.append(cRCVALUE);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", iSVSAMNORMALIZER: ");
        result.append(iSVSAMNORMALIZER);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", oBJECTVERSION: ");
        result.append(oBJECTVERSION);
        result.append(", pARENT: ");
        result.append(pARENT);
        result.append(", pARENTTYPE: ");
        if (pARENTTYPEESet) result.append(pARENTTYPE); else result.append("<unset>");
        result.append(", rEFDBDNAME: ");
        result.append(rEFDBDNAME);
        result.append(", rEFSOURCENAME: ");
        result.append(rEFSOURCENAME);
        result.append(", rEUSABLE: ");
        result.append(rEUSABLE);
        result.append(", tEMPLATEID: ");
        result.append(tEMPLATEID);
        result.append(", tEMPLATENAME: ");
        result.append(tEMPLATENAME);
        result.append(", tYPE: ");
        result.append(tYPE);
        result.append(", vERSIONNUMBER: ");
        result.append(vERSIONNUMBER);
        result.append(')');
        return result.toString();
    }

} //TRANSFORMATIONTypeImpl
