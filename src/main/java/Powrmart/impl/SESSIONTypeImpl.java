/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ATTRIBUTEType;
import Powrmart.CONFIGREFERENCEType;
import Powrmart.ISVALIDType;
import Powrmart.METADATAEXTENSIONType;
import Powrmart.PARENTTYPEType;
import Powrmart.PowrmartPackage;
import Powrmart.RESOURCEREFERENCEType;
import Powrmart.REUSABLEType4;
import Powrmart.SESSIONCOMPONENTType;
import Powrmart.SESSIONEXTENSIONType;
import Powrmart.SESSIONType;
import Powrmart.SESSTRANSFORMATIONINSTType;
import Powrmart.TASKType;
import Powrmart.TRANSFORMRESOURCEREFType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SESSION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getTASK <em>TASK</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getSESSTRANSFORMATIONINST <em>SESSTRANSFORMATIONINST</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getCONFIGREFERENCE <em>CONFIGREFERENCE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getSESSIONCOMPONENT <em>SESSIONCOMPONENT</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getSESSIONEXTENSION <em>SESSIONEXTENSION</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getTRANSFORMRESOURCEREF <em>TRANSFORMRESOURCEREF</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getISVALID <em>ISVALID</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getMAPPINGNAME <em>MAPPINGNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getMAPPINGVERSION <em>MAPPINGVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getPARENT <em>PARENT</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getPARENTTYPE <em>PARENTTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getSORTORDER <em>SORTORDER</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONTypeImpl#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SESSIONTypeImpl extends EObjectImpl implements SESSIONType {
    /**
     * The cached value of the '{@link #getTASK() <em>TASK</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTASK()
     * @generated
     * @ordered
     */
    protected EList<TASKType> tASK;

    /**
     * The cached value of the '{@link #getSESSTRANSFORMATIONINST() <em>SESSTRANSFORMATIONINST</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSESSTRANSFORMATIONINST()
     * @generated
     * @ordered
     */
    protected EList<SESSTRANSFORMATIONINSTType> sESSTRANSFORMATIONINST;

    /**
     * The cached value of the '{@link #getCONFIGREFERENCE() <em>CONFIGREFERENCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONFIGREFERENCE()
     * @generated
     * @ordered
     */
    protected CONFIGREFERENCEType cONFIGREFERENCE;

    /**
     * The cached value of the '{@link #getSESSIONCOMPONENT() <em>SESSIONCOMPONENT</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSESSIONCOMPONENT()
     * @generated
     * @ordered
     */
    protected EList<SESSIONCOMPONENTType> sESSIONCOMPONENT;

    /**
     * The cached value of the '{@link #getSESSIONEXTENSION() <em>SESSIONEXTENSION</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSESSIONEXTENSION()
     * @generated
     * @ordered
     */
    protected EList<SESSIONEXTENSIONType> sESSIONEXTENSION;

    /**
     * The cached value of the '{@link #getATTRIBUTE() <em>ATTRIBUTE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getATTRIBUTE()
     * @generated
     * @ordered
     */
    protected EList<ATTRIBUTEType> aTTRIBUTE;

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
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap group;

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
     * The default value of the '{@link #getISVALID() <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISVALID()
     * @generated
     * @ordered
     */
    protected static final ISVALIDType ISVALID_EDEFAULT = ISVALIDType.YES;

    /**
     * The cached value of the '{@link #getISVALID() <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISVALID()
     * @generated
     * @ordered
     */
    protected ISVALIDType iSVALID = ISVALID_EDEFAULT;

    /**
     * This is true if the ISVALID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSVALIDESet;

    /**
     * The default value of the '{@link #getMAPPINGNAME() <em>MAPPINGNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAPPINGNAME()
     * @generated
     * @ordered
     */
    protected static final Object MAPPINGNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMAPPINGNAME() <em>MAPPINGNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAPPINGNAME()
     * @generated
     * @ordered
     */
    protected Object mAPPINGNAME = MAPPINGNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getMAPPINGVERSION() <em>MAPPINGVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAPPINGVERSION()
     * @generated
     * @ordered
     */
    protected static final Object MAPPINGVERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMAPPINGVERSION() <em>MAPPINGVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAPPINGVERSION()
     * @generated
     * @ordered
     */
    protected Object mAPPINGVERSION = MAPPINGVERSION_EDEFAULT;

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
    protected static final PARENTTYPEType PARENTTYPE_EDEFAULT = PARENTTYPEType.WORKLET;

    /**
     * The cached value of the '{@link #getPARENTTYPE() <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENTTYPE()
     * @generated
     * @ordered
     */
    protected PARENTTYPEType pARENTTYPE = PARENTTYPE_EDEFAULT;

    /**
     * This is true if the PARENTTYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pARENTTYPEESet;

    /**
     * The default value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected static final REUSABLEType4 REUSABLE_EDEFAULT = REUSABLEType4.YES;

    /**
     * The cached value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected REUSABLEType4 rEUSABLE = REUSABLE_EDEFAULT;

    /**
     * This is true if the REUSABLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEUSABLEESet;

    /**
     * The default value of the '{@link #getSORTORDER() <em>SORTORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSORTORDER()
     * @generated
     * @ordered
     */
    protected static final Object SORTORDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSORTORDER() <em>SORTORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSORTORDER()
     * @generated
     * @ordered
     */
    protected Object sORTORDER = SORTORDER_EDEFAULT;

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
    protected SESSIONTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSESSIONType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TASKType> getTASK() {
        if (tASK == null) {
            tASK = new EObjectContainmentEList<TASKType>(TASKType.class, this, PowrmartPackage.SESSION_TYPE__TASK);
        }
        return tASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SESSTRANSFORMATIONINSTType> getSESSTRANSFORMATIONINST() {
        if (sESSTRANSFORMATIONINST == null) {
            sESSTRANSFORMATIONINST = new EObjectContainmentEList<SESSTRANSFORMATIONINSTType>(SESSTRANSFORMATIONINSTType.class, this, PowrmartPackage.SESSION_TYPE__SESSTRANSFORMATIONINST);
        }
        return sESSTRANSFORMATIONINST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONFIGREFERENCEType getCONFIGREFERENCE() {
        return cONFIGREFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCONFIGREFERENCE(CONFIGREFERENCEType newCONFIGREFERENCE, NotificationChain msgs) {
        CONFIGREFERENCEType oldCONFIGREFERENCE = cONFIGREFERENCE;
        cONFIGREFERENCE = newCONFIGREFERENCE;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSION_TYPE__CONFIGREFERENCE, oldCONFIGREFERENCE, newCONFIGREFERENCE);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONFIGREFERENCE(CONFIGREFERENCEType newCONFIGREFERENCE) {
        if (newCONFIGREFERENCE != cONFIGREFERENCE) {
            NotificationChain msgs = null;
            if (cONFIGREFERENCE != null)
                msgs = ((InternalEObject)cONFIGREFERENCE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SESSION_TYPE__CONFIGREFERENCE, null, msgs);
            if (newCONFIGREFERENCE != null)
                msgs = ((InternalEObject)newCONFIGREFERENCE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SESSION_TYPE__CONFIGREFERENCE, null, msgs);
            msgs = basicSetCONFIGREFERENCE(newCONFIGREFERENCE, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSION_TYPE__CONFIGREFERENCE, newCONFIGREFERENCE, newCONFIGREFERENCE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SESSIONCOMPONENTType> getSESSIONCOMPONENT() {
        if (sESSIONCOMPONENT == null) {
            sESSIONCOMPONENT = new EObjectContainmentEList<SESSIONCOMPONENTType>(SESSIONCOMPONENTType.class, this, PowrmartPackage.SESSION_TYPE__SESSIONCOMPONENT);
        }
        return sESSIONCOMPONENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SESSIONEXTENSIONType> getSESSIONEXTENSION() {
        if (sESSIONEXTENSION == null) {
            sESSIONEXTENSION = new EObjectContainmentEList<SESSIONEXTENSIONType>(SESSIONEXTENSIONType.class, this, PowrmartPackage.SESSION_TYPE__SESSIONEXTENSION);
        }
        return sESSIONEXTENSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ATTRIBUTEType> getATTRIBUTE() {
        if (aTTRIBUTE == null) {
            aTTRIBUTE = new EObjectContainmentEList<ATTRIBUTEType>(ATTRIBUTEType.class, this, PowrmartPackage.SESSION_TYPE__ATTRIBUTE);
        }
        return aTTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<METADATAEXTENSIONType> getMETADATAEXTENSION() {
        if (mETADATAEXTENSION == null) {
            mETADATAEXTENSION = new EObjectContainmentEList<METADATAEXTENSIONType>(METADATAEXTENSIONType.class, this, PowrmartPackage.SESSION_TYPE__METADATAEXTENSION);
        }
        return mETADATAEXTENSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, PowrmartPackage.SESSION_TYPE__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RESOURCEREFERENCEType> getRESOURCEREFERENCE() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getSESSIONType_RESOURCEREFERENCE());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TRANSFORMRESOURCEREFType> getTRANSFORMRESOURCEREF() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getSESSIONType_TRANSFORMRESOURCEREF());
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSION_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISVALIDType getISVALID() {
        return iSVALID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISVALID(ISVALIDType newISVALID) {
        ISVALIDType oldISVALID = iSVALID;
        iSVALID = newISVALID == null ? ISVALID_EDEFAULT : newISVALID;
        boolean oldISVALIDESet = iSVALIDESet;
        iSVALIDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSION_TYPE__ISVALID, oldISVALID, iSVALID, !oldISVALIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISVALID() {
        ISVALIDType oldISVALID = iSVALID;
        boolean oldISVALIDESet = iSVALIDESet;
        iSVALID = ISVALID_EDEFAULT;
        iSVALIDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SESSION_TYPE__ISVALID, oldISVALID, ISVALID_EDEFAULT, oldISVALIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISVALID() {
        return iSVALIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getMAPPINGNAME() {
        return mAPPINGNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMAPPINGNAME(Object newMAPPINGNAME) {
        Object oldMAPPINGNAME = mAPPINGNAME;
        mAPPINGNAME = newMAPPINGNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSION_TYPE__MAPPINGNAME, oldMAPPINGNAME, mAPPINGNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getMAPPINGVERSION() {
        return mAPPINGVERSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMAPPINGVERSION(Object newMAPPINGVERSION) {
        Object oldMAPPINGVERSION = mAPPINGVERSION;
        mAPPINGVERSION = newMAPPINGVERSION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSION_TYPE__MAPPINGVERSION, oldMAPPINGVERSION, mAPPINGVERSION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSION_TYPE__NAME, oldNAME, nAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSION_TYPE__PARENT, oldPARENT, pARENT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARENTTYPEType getPARENTTYPE() {
        return pARENTTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARENTTYPE(PARENTTYPEType newPARENTTYPE) {
        PARENTTYPEType oldPARENTTYPE = pARENTTYPE;
        pARENTTYPE = newPARENTTYPE == null ? PARENTTYPE_EDEFAULT : newPARENTTYPE;
        boolean oldPARENTTYPEESet = pARENTTYPEESet;
        pARENTTYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSION_TYPE__PARENTTYPE, oldPARENTTYPE, pARENTTYPE, !oldPARENTTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPARENTTYPE() {
        PARENTTYPEType oldPARENTTYPE = pARENTTYPE;
        boolean oldPARENTTYPEESet = pARENTTYPEESet;
        pARENTTYPE = PARENTTYPE_EDEFAULT;
        pARENTTYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SESSION_TYPE__PARENTTYPE, oldPARENTTYPE, PARENTTYPE_EDEFAULT, oldPARENTTYPEESet));
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
    public REUSABLEType4 getREUSABLE() {
        return rEUSABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREUSABLE(REUSABLEType4 newREUSABLE) {
        REUSABLEType4 oldREUSABLE = rEUSABLE;
        rEUSABLE = newREUSABLE == null ? REUSABLE_EDEFAULT : newREUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSION_TYPE__REUSABLE, oldREUSABLE, rEUSABLE, !oldREUSABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREUSABLE() {
        REUSABLEType4 oldREUSABLE = rEUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLE = REUSABLE_EDEFAULT;
        rEUSABLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SESSION_TYPE__REUSABLE, oldREUSABLE, REUSABLE_EDEFAULT, oldREUSABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetREUSABLE() {
        return rEUSABLEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSORTORDER() {
        return sORTORDER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSORTORDER(Object newSORTORDER) {
        Object oldSORTORDER = sORTORDER;
        sORTORDER = newSORTORDER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSION_TYPE__SORTORDER, oldSORTORDER, sORTORDER));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSION_TYPE__VERSIONNUMBER, oldVERSIONNUMBER, vERSIONNUMBER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SESSION_TYPE__TASK:
                return ((InternalEList<?>)getTASK()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSION_TYPE__SESSTRANSFORMATIONINST:
                return ((InternalEList<?>)getSESSTRANSFORMATIONINST()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSION_TYPE__CONFIGREFERENCE:
                return basicSetCONFIGREFERENCE(null, msgs);
            case PowrmartPackage.SESSION_TYPE__SESSIONCOMPONENT:
                return ((InternalEList<?>)getSESSIONCOMPONENT()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSION_TYPE__SESSIONEXTENSION:
                return ((InternalEList<?>)getSESSIONEXTENSION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSION_TYPE__ATTRIBUTE:
                return ((InternalEList<?>)getATTRIBUTE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSION_TYPE__METADATAEXTENSION:
                return ((InternalEList<?>)getMETADATAEXTENSION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSION_TYPE__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSION_TYPE__RESOURCEREFERENCE:
                return ((InternalEList<?>)getRESOURCEREFERENCE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSION_TYPE__TRANSFORMRESOURCEREF:
                return ((InternalEList<?>)getTRANSFORMRESOURCEREF()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.SESSION_TYPE__TASK:
                return getTASK();
            case PowrmartPackage.SESSION_TYPE__SESSTRANSFORMATIONINST:
                return getSESSTRANSFORMATIONINST();
            case PowrmartPackage.SESSION_TYPE__CONFIGREFERENCE:
                return getCONFIGREFERENCE();
            case PowrmartPackage.SESSION_TYPE__SESSIONCOMPONENT:
                return getSESSIONCOMPONENT();
            case PowrmartPackage.SESSION_TYPE__SESSIONEXTENSION:
                return getSESSIONEXTENSION();
            case PowrmartPackage.SESSION_TYPE__ATTRIBUTE:
                return getATTRIBUTE();
            case PowrmartPackage.SESSION_TYPE__METADATAEXTENSION:
                return getMETADATAEXTENSION();
            case PowrmartPackage.SESSION_TYPE__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case PowrmartPackage.SESSION_TYPE__RESOURCEREFERENCE:
                return getRESOURCEREFERENCE();
            case PowrmartPackage.SESSION_TYPE__TRANSFORMRESOURCEREF:
                return getTRANSFORMRESOURCEREF();
            case PowrmartPackage.SESSION_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.SESSION_TYPE__ISVALID:
                return getISVALID();
            case PowrmartPackage.SESSION_TYPE__MAPPINGNAME:
                return getMAPPINGNAME();
            case PowrmartPackage.SESSION_TYPE__MAPPINGVERSION:
                return getMAPPINGVERSION();
            case PowrmartPackage.SESSION_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SESSION_TYPE__PARENT:
                return getPARENT();
            case PowrmartPackage.SESSION_TYPE__PARENTTYPE:
                return getPARENTTYPE();
            case PowrmartPackage.SESSION_TYPE__REUSABLE:
                return getREUSABLE();
            case PowrmartPackage.SESSION_TYPE__SORTORDER:
                return getSORTORDER();
            case PowrmartPackage.SESSION_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.SESSION_TYPE__TASK:
                getTASK().clear();
                getTASK().addAll((Collection<? extends TASKType>)newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__SESSTRANSFORMATIONINST:
                getSESSTRANSFORMATIONINST().clear();
                getSESSTRANSFORMATIONINST().addAll((Collection<? extends SESSTRANSFORMATIONINSTType>)newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__CONFIGREFERENCE:
                setCONFIGREFERENCE((CONFIGREFERENCEType)newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__SESSIONCOMPONENT:
                getSESSIONCOMPONENT().clear();
                getSESSIONCOMPONENT().addAll((Collection<? extends SESSIONCOMPONENTType>)newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__SESSIONEXTENSION:
                getSESSIONEXTENSION().clear();
                getSESSIONEXTENSION().addAll((Collection<? extends SESSIONEXTENSIONType>)newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                getATTRIBUTE().addAll((Collection<? extends ATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                getMETADATAEXTENSION().addAll((Collection<? extends METADATAEXTENSIONType>)newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__RESOURCEREFERENCE:
                getRESOURCEREFERENCE().clear();
                getRESOURCEREFERENCE().addAll((Collection<? extends RESOURCEREFERENCEType>)newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__TRANSFORMRESOURCEREF:
                getTRANSFORMRESOURCEREF().clear();
                getTRANSFORMRESOURCEREF().addAll((Collection<? extends TRANSFORMRESOURCEREFType>)newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__ISVALID:
                setISVALID((ISVALIDType)newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__MAPPINGNAME:
                setMAPPINGNAME(newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__MAPPINGVERSION:
                setMAPPINGVERSION(newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__PARENT:
                setPARENT(newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__PARENTTYPE:
                setPARENTTYPE((PARENTTYPEType)newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__REUSABLE:
                setREUSABLE((REUSABLEType4)newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__SORTORDER:
                setSORTORDER(newValue);
                return;
            case PowrmartPackage.SESSION_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.SESSION_TYPE__TASK:
                getTASK().clear();
                return;
            case PowrmartPackage.SESSION_TYPE__SESSTRANSFORMATIONINST:
                getSESSTRANSFORMATIONINST().clear();
                return;
            case PowrmartPackage.SESSION_TYPE__CONFIGREFERENCE:
                setCONFIGREFERENCE((CONFIGREFERENCEType)null);
                return;
            case PowrmartPackage.SESSION_TYPE__SESSIONCOMPONENT:
                getSESSIONCOMPONENT().clear();
                return;
            case PowrmartPackage.SESSION_TYPE__SESSIONEXTENSION:
                getSESSIONEXTENSION().clear();
                return;
            case PowrmartPackage.SESSION_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                return;
            case PowrmartPackage.SESSION_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                return;
            case PowrmartPackage.SESSION_TYPE__GROUP:
                getGroup().clear();
                return;
            case PowrmartPackage.SESSION_TYPE__RESOURCEREFERENCE:
                getRESOURCEREFERENCE().clear();
                return;
            case PowrmartPackage.SESSION_TYPE__TRANSFORMRESOURCEREF:
                getTRANSFORMRESOURCEREF().clear();
                return;
            case PowrmartPackage.SESSION_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.SESSION_TYPE__ISVALID:
                unsetISVALID();
                return;
            case PowrmartPackage.SESSION_TYPE__MAPPINGNAME:
                setMAPPINGNAME(MAPPINGNAME_EDEFAULT);
                return;
            case PowrmartPackage.SESSION_TYPE__MAPPINGVERSION:
                setMAPPINGVERSION(MAPPINGVERSION_EDEFAULT);
                return;
            case PowrmartPackage.SESSION_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SESSION_TYPE__PARENT:
                setPARENT(PARENT_EDEFAULT);
                return;
            case PowrmartPackage.SESSION_TYPE__PARENTTYPE:
                unsetPARENTTYPE();
                return;
            case PowrmartPackage.SESSION_TYPE__REUSABLE:
                unsetREUSABLE();
                return;
            case PowrmartPackage.SESSION_TYPE__SORTORDER:
                setSORTORDER(SORTORDER_EDEFAULT);
                return;
            case PowrmartPackage.SESSION_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.SESSION_TYPE__TASK:
                return tASK != null && !tASK.isEmpty();
            case PowrmartPackage.SESSION_TYPE__SESSTRANSFORMATIONINST:
                return sESSTRANSFORMATIONINST != null && !sESSTRANSFORMATIONINST.isEmpty();
            case PowrmartPackage.SESSION_TYPE__CONFIGREFERENCE:
                return cONFIGREFERENCE != null;
            case PowrmartPackage.SESSION_TYPE__SESSIONCOMPONENT:
                return sESSIONCOMPONENT != null && !sESSIONCOMPONENT.isEmpty();
            case PowrmartPackage.SESSION_TYPE__SESSIONEXTENSION:
                return sESSIONEXTENSION != null && !sESSIONEXTENSION.isEmpty();
            case PowrmartPackage.SESSION_TYPE__ATTRIBUTE:
                return aTTRIBUTE != null && !aTTRIBUTE.isEmpty();
            case PowrmartPackage.SESSION_TYPE__METADATAEXTENSION:
                return mETADATAEXTENSION != null && !mETADATAEXTENSION.isEmpty();
            case PowrmartPackage.SESSION_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case PowrmartPackage.SESSION_TYPE__RESOURCEREFERENCE:
                return !getRESOURCEREFERENCE().isEmpty();
            case PowrmartPackage.SESSION_TYPE__TRANSFORMRESOURCEREF:
                return !getTRANSFORMRESOURCEREF().isEmpty();
            case PowrmartPackage.SESSION_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.SESSION_TYPE__ISVALID:
                return isSetISVALID();
            case PowrmartPackage.SESSION_TYPE__MAPPINGNAME:
                return MAPPINGNAME_EDEFAULT == null ? mAPPINGNAME != null : !MAPPINGNAME_EDEFAULT.equals(mAPPINGNAME);
            case PowrmartPackage.SESSION_TYPE__MAPPINGVERSION:
                return MAPPINGVERSION_EDEFAULT == null ? mAPPINGVERSION != null : !MAPPINGVERSION_EDEFAULT.equals(mAPPINGVERSION);
            case PowrmartPackage.SESSION_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SESSION_TYPE__PARENT:
                return PARENT_EDEFAULT == null ? pARENT != null : !PARENT_EDEFAULT.equals(pARENT);
            case PowrmartPackage.SESSION_TYPE__PARENTTYPE:
                return isSetPARENTTYPE();
            case PowrmartPackage.SESSION_TYPE__REUSABLE:
                return isSetREUSABLE();
            case PowrmartPackage.SESSION_TYPE__SORTORDER:
                return SORTORDER_EDEFAULT == null ? sORTORDER != null : !SORTORDER_EDEFAULT.equals(sORTORDER);
            case PowrmartPackage.SESSION_TYPE__VERSIONNUMBER:
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
        result.append(" (group: ");
        result.append(group);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", iSVALID: ");
        if (iSVALIDESet) result.append(iSVALID); else result.append("<unset>");
        result.append(", mAPPINGNAME: ");
        result.append(mAPPINGNAME);
        result.append(", mAPPINGVERSION: ");
        result.append(mAPPINGVERSION);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", pARENT: ");
        result.append(pARENT);
        result.append(", pARENTTYPE: ");
        if (pARENTTYPEESet) result.append(pARENTTYPE); else result.append("<unset>");
        result.append(", rEUSABLE: ");
        if (rEUSABLEESet) result.append(rEUSABLE); else result.append("<unset>");
        result.append(", sORTORDER: ");
        result.append(sORTORDER);
        result.append(", vERSIONNUMBER: ");
        result.append(vERSIONNUMBER);
        result.append(')');
        return result.toString();
    }

} //SESSIONTypeImpl
