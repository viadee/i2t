/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

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

import Powrmart.CONFIGType;
import Powrmart.EXPRMACROType;
import Powrmart.FOLDERType;
import Powrmart.FOLDERVERSIONType;
import Powrmart.MAPPINGType;
import Powrmart.MAPPLETType;
import Powrmart.PowrmartPackage;
import Powrmart.SCHEDULERType;
import Powrmart.SESSIONType;
import Powrmart.SHAREDType;
import Powrmart.SHORTCUTType;
import Powrmart.SOURCEType;
import Powrmart.TARGETType;
import Powrmart.TASKType;
import Powrmart.TRANSFORMATIONType;
import Powrmart.WORKFLOWType;
import Powrmart.WORKLETType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FOLDER Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getFOLDERVERSION <em>FOLDERVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getCONFIG <em>CONFIG</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getSCHEDULER <em>SCHEDULER</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getTASK <em>TASK</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getSESSION <em>SESSION</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getWORKLET <em>WORKLET</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getWORKFLOW <em>WORKFLOW</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getSOURCE <em>SOURCE</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getTARGET <em>TARGET</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getTRANSFORMATION <em>TRANSFORMATION</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getMAPPLET <em>MAPPLET</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getMAPPING <em>MAPPING</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getSHORTCUT <em>SHORTCUT</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getEXPRMACRO <em>EXPRMACRO</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getGROUP1 <em>GROUP1</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getOWNER <em>OWNER</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getPERMISSIONS <em>PERMISSIONS</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getSHARED <em>SHARED</em>}</li>
 *   <li>{@link Powrmart.impl.FOLDERTypeImpl#getUUID <em>UUID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FOLDERTypeImpl extends EObjectImpl implements FOLDERType {
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
     * The default value of the '{@link #getGROUP1() <em>GROUP1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGROUP1()
     * @generated
     * @ordered
     */
    protected static final Object GROUP1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGROUP1() <em>GROUP1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGROUP1()
     * @generated
     * @ordered
     */
    protected Object gROUP1 = GROUP1_EDEFAULT;

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
     * The default value of the '{@link #getOWNER() <em>OWNER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOWNER()
     * @generated
     * @ordered
     */
    protected static final Object OWNER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOWNER() <em>OWNER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOWNER()
     * @generated
     * @ordered
     */
    protected Object oWNER = OWNER_EDEFAULT;

    /**
     * The default value of the '{@link #getPERMISSIONS() <em>PERMISSIONS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPERMISSIONS()
     * @generated
     * @ordered
     */
    protected static final Object PERMISSIONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPERMISSIONS() <em>PERMISSIONS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPERMISSIONS()
     * @generated
     * @ordered
     */
    protected Object pERMISSIONS = PERMISSIONS_EDEFAULT;

    /**
     * The default value of the '{@link #getSHARED() <em>SHARED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSHARED()
     * @generated
     * @ordered
     */
    protected static final SHAREDType SHARED_EDEFAULT = SHAREDType.SHARED;

    /**
     * The cached value of the '{@link #getSHARED() <em>SHARED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSHARED()
     * @generated
     * @ordered
     */
    protected SHAREDType sHARED = SHARED_EDEFAULT;

    /**
     * This is true if the SHARED attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sHAREDESet;

    /**
     * The default value of the '{@link #getUUID() <em>UUID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUUID()
     * @generated
     * @ordered
     */
    protected static final Object UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUUID() <em>UUID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUUID()
     * @generated
     * @ordered
     */
    protected Object uUID = UUID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FOLDERTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getFOLDERType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, PowrmartPackage.FOLDER_TYPE__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FOLDERVERSIONType> getFOLDERVERSION() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_FOLDERVERSION());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CONFIGType> getCONFIG() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_CONFIG());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SCHEDULERType> getSCHEDULER() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_SCHEDULER());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TASKType> getTASK() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_TASK());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SESSIONType> getSESSION() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_SESSION());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<WORKLETType> getWORKLET() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_WORKLET());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<WORKFLOWType> getWORKFLOW() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_WORKFLOW());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SOURCEType> getSOURCE() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_SOURCE());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TARGETType> getTARGET() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_TARGET());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TRANSFORMATIONType> getTRANSFORMATION() {
    // return
    // getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_TRANSFORMATION());
    EList<TRANSFORMATIONType> node = new EObjectContainmentEList<TRANSFORMATIONType>(TRANSFORMATIONType.class, this, PowrmartPackage.TRANSFORMATION_TYPE);
    return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MAPPLETType> getMAPPLET() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_MAPPLET());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MAPPINGType> getMAPPING() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_MAPPING());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SHORTCUTType> getSHORTCUT() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_SHORTCUT());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EXPRMACROType> getEXPRMACRO() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getFOLDERType_EXPRMACRO());
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
    public void setDESCRIPTION(final Object newDESCRIPTION) {
        Object oldDESCRIPTION = dESCRIPTION;
        dESCRIPTION = newDESCRIPTION;
        if (eNotificationRequired()) {
          eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FOLDER_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getGROUP1() {
        return gROUP1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGROUP1(final Object newGROUP1) {
        Object oldGROUP1 = gROUP1;
        gROUP1 = newGROUP1;
        if (eNotificationRequired()) {
          eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FOLDER_TYPE__GROUP1, oldGROUP1, gROUP1));
        }
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
    public void setNAME(final Object newNAME) {
        Object oldNAME = nAME;
        nAME = newNAME;
        if (eNotificationRequired()) {
          eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FOLDER_TYPE__NAME, oldNAME, nAME));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getOWNER() {
        return oWNER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOWNER(final Object newOWNER) {
        Object oldOWNER = oWNER;
        oWNER = newOWNER;
        if (eNotificationRequired()) {
          eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FOLDER_TYPE__OWNER, oldOWNER, oWNER));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPERMISSIONS() {
        return pERMISSIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPERMISSIONS(final Object newPERMISSIONS) {
        Object oldPERMISSIONS = pERMISSIONS;
        pERMISSIONS = newPERMISSIONS;
        if (eNotificationRequired()) {
          eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FOLDER_TYPE__PERMISSIONS, oldPERMISSIONS, pERMISSIONS));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SHAREDType getSHARED() {
        return sHARED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSHARED(final SHAREDType newSHARED) {
        SHAREDType oldSHARED = sHARED;
        sHARED = newSHARED == null ? SHARED_EDEFAULT : newSHARED;
        boolean oldSHAREDESet = sHAREDESet;
        sHAREDESet = true;
        if (eNotificationRequired()) {
          eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FOLDER_TYPE__SHARED, oldSHARED, sHARED, !oldSHAREDESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSHARED() {
        SHAREDType oldSHARED = sHARED;
        boolean oldSHAREDESet = sHAREDESet;
        sHARED = SHARED_EDEFAULT;
        sHAREDESet = false;
        if (eNotificationRequired()) {
          eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.FOLDER_TYPE__SHARED, oldSHARED, SHARED_EDEFAULT, oldSHAREDESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSHARED() {
        return sHAREDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getUUID() {
        return uUID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUUID(final Object newUUID) {
        Object oldUUID = uUID;
        uUID = newUUID;
        if (eNotificationRequired()) {
          eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FOLDER_TYPE__UUID, oldUUID, uUID));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.FOLDER_TYPE__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__FOLDERVERSION:
                return ((InternalEList<?>)getFOLDERVERSION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__CONFIG:
                return ((InternalEList<?>)getCONFIG()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__SCHEDULER:
                return ((InternalEList<?>)getSCHEDULER()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__TASK:
                return ((InternalEList<?>)getTASK()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__SESSION:
                return ((InternalEList<?>)getSESSION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__WORKLET:
                return ((InternalEList<?>)getWORKLET()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__WORKFLOW:
                return ((InternalEList<?>)getWORKFLOW()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__SOURCE:
                return ((InternalEList<?>)getSOURCE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__TARGET:
                return ((InternalEList<?>)getTARGET()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__TRANSFORMATION:
                return ((InternalEList<?>)getTRANSFORMATION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__MAPPLET:
                return ((InternalEList<?>)getMAPPLET()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__MAPPING:
                return ((InternalEList<?>)getMAPPING()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__SHORTCUT:
                return ((InternalEList<?>)getSHORTCUT()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.FOLDER_TYPE__EXPRMACRO:
                return ((InternalEList<?>)getEXPRMACRO()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.FOLDER_TYPE__GROUP:
                if (coreType) {
                  return getGroup();
                }
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case PowrmartPackage.FOLDER_TYPE__FOLDERVERSION:
                return getFOLDERVERSION();
            case PowrmartPackage.FOLDER_TYPE__CONFIG:
                return getCONFIG();
            case PowrmartPackage.FOLDER_TYPE__SCHEDULER:
                return getSCHEDULER();
            case PowrmartPackage.FOLDER_TYPE__TASK:
                return getTASK();
            case PowrmartPackage.FOLDER_TYPE__SESSION:
                return getSESSION();
            case PowrmartPackage.FOLDER_TYPE__WORKLET:
                return getWORKLET();
            case PowrmartPackage.FOLDER_TYPE__WORKFLOW:
                return getWORKFLOW();
            case PowrmartPackage.FOLDER_TYPE__SOURCE:
                return getSOURCE();
            case PowrmartPackage.FOLDER_TYPE__TARGET:
                return getTARGET();
            case PowrmartPackage.FOLDER_TYPE__TRANSFORMATION:
                return getTRANSFORMATION();
            case PowrmartPackage.FOLDER_TYPE__MAPPLET:
                return getMAPPLET();
            case PowrmartPackage.FOLDER_TYPE__MAPPING:
                return getMAPPING();
            case PowrmartPackage.FOLDER_TYPE__SHORTCUT:
                return getSHORTCUT();
            case PowrmartPackage.FOLDER_TYPE__EXPRMACRO:
                return getEXPRMACRO();
            case PowrmartPackage.FOLDER_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.FOLDER_TYPE__GROUP1:
                return getGROUP1();
            case PowrmartPackage.FOLDER_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.FOLDER_TYPE__OWNER:
                return getOWNER();
            case PowrmartPackage.FOLDER_TYPE__PERMISSIONS:
                return getPERMISSIONS();
            case PowrmartPackage.FOLDER_TYPE__SHARED:
                return getSHARED();
            case PowrmartPackage.FOLDER_TYPE__UUID:
                return getUUID();
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
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case PowrmartPackage.FOLDER_TYPE__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__FOLDERVERSION:
                getFOLDERVERSION().clear();
                getFOLDERVERSION().addAll((Collection<? extends FOLDERVERSIONType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__CONFIG:
                getCONFIG().clear();
                getCONFIG().addAll((Collection<? extends CONFIGType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__SCHEDULER:
                getSCHEDULER().clear();
                getSCHEDULER().addAll((Collection<? extends SCHEDULERType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__TASK:
                getTASK().clear();
                getTASK().addAll((Collection<? extends TASKType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__SESSION:
                getSESSION().clear();
                getSESSION().addAll((Collection<? extends SESSIONType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__WORKLET:
                getWORKLET().clear();
                getWORKLET().addAll((Collection<? extends WORKLETType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__WORKFLOW:
                getWORKFLOW().clear();
                getWORKFLOW().addAll((Collection<? extends WORKFLOWType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__SOURCE:
                getSOURCE().clear();
                getSOURCE().addAll((Collection<? extends SOURCEType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__TARGET:
                getTARGET().clear();
                getTARGET().addAll((Collection<? extends TARGETType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__TRANSFORMATION:
                getTRANSFORMATION().clear();
                getTRANSFORMATION().addAll((Collection<? extends TRANSFORMATIONType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__MAPPLET:
                getMAPPLET().clear();
                getMAPPLET().addAll((Collection<? extends MAPPLETType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__MAPPING:
                getMAPPING().clear();
                getMAPPING().addAll((Collection<? extends MAPPINGType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__SHORTCUT:
                getSHORTCUT().clear();
                getSHORTCUT().addAll((Collection<? extends SHORTCUTType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__EXPRMACRO:
                getEXPRMACRO().clear();
                getEXPRMACRO().addAll((Collection<? extends EXPRMACROType>)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__GROUP1:
                setGROUP1(newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__OWNER:
                setOWNER(newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__PERMISSIONS:
                setPERMISSIONS(newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__SHARED:
                setSHARED((SHAREDType)newValue);
                return;
            case PowrmartPackage.FOLDER_TYPE__UUID:
                setUUID(newValue);
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
    public void eUnset(final int featureID) {
        switch (featureID) {
            case PowrmartPackage.FOLDER_TYPE__GROUP:
                getGroup().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__FOLDERVERSION:
                getFOLDERVERSION().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__CONFIG:
                getCONFIG().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__SCHEDULER:
                getSCHEDULER().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__TASK:
                getTASK().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__SESSION:
                getSESSION().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__WORKLET:
                getWORKLET().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__WORKFLOW:
                getWORKFLOW().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__SOURCE:
                getSOURCE().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__TARGET:
                getTARGET().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__TRANSFORMATION:
                getTRANSFORMATION().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__MAPPLET:
                getMAPPLET().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__MAPPING:
                getMAPPING().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__SHORTCUT:
                getSHORTCUT().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__EXPRMACRO:
                getEXPRMACRO().clear();
                return;
            case PowrmartPackage.FOLDER_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.FOLDER_TYPE__GROUP1:
                setGROUP1(GROUP1_EDEFAULT);
                return;
            case PowrmartPackage.FOLDER_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.FOLDER_TYPE__OWNER:
                setOWNER(OWNER_EDEFAULT);
                return;
            case PowrmartPackage.FOLDER_TYPE__PERMISSIONS:
                setPERMISSIONS(PERMISSIONS_EDEFAULT);
                return;
            case PowrmartPackage.FOLDER_TYPE__SHARED:
                unsetSHARED();
                return;
            case PowrmartPackage.FOLDER_TYPE__UUID:
                setUUID(UUID_EDEFAULT);
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
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case PowrmartPackage.FOLDER_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case PowrmartPackage.FOLDER_TYPE__FOLDERVERSION:
                return !getFOLDERVERSION().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__CONFIG:
                return !getCONFIG().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__SCHEDULER:
                return !getSCHEDULER().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__TASK:
                return !getTASK().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__SESSION:
                return !getSESSION().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__WORKLET:
                return !getWORKLET().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__WORKFLOW:
                return !getWORKFLOW().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__SOURCE:
                return !getSOURCE().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__TARGET:
                return !getTARGET().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__TRANSFORMATION:
                return !getTRANSFORMATION().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__MAPPLET:
                return !getMAPPLET().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__MAPPING:
                return !getMAPPING().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__SHORTCUT:
                return !getSHORTCUT().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__EXPRMACRO:
                return !getEXPRMACRO().isEmpty();
            case PowrmartPackage.FOLDER_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.FOLDER_TYPE__GROUP1:
                return GROUP1_EDEFAULT == null ? gROUP1 != null : !GROUP1_EDEFAULT.equals(gROUP1);
            case PowrmartPackage.FOLDER_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.FOLDER_TYPE__OWNER:
                return OWNER_EDEFAULT == null ? oWNER != null : !OWNER_EDEFAULT.equals(oWNER);
            case PowrmartPackage.FOLDER_TYPE__PERMISSIONS:
                return PERMISSIONS_EDEFAULT == null ? pERMISSIONS != null : !PERMISSIONS_EDEFAULT.equals(pERMISSIONS);
            case PowrmartPackage.FOLDER_TYPE__SHARED:
                return isSetSHARED();
            case PowrmartPackage.FOLDER_TYPE__UUID:
                return UUID_EDEFAULT == null ? uUID != null : !UUID_EDEFAULT.equals(uUID);
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
        if (eIsProxy()) {
          return super.toString();
        }

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (group: ");
        result.append(group);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", gROUP1: ");
        result.append(gROUP1);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", oWNER: ");
        result.append(oWNER);
        result.append(", pERMISSIONS: ");
        result.append(pERMISSIONS);
        result.append(", sHARED: ");
        if (sHAREDESet) {
          result.append(sHARED);
        } else {
          result.append("<unset>");
        }
        result.append(", uUID: ");
        result.append(uUID);
        result.append(')');
        return result.toString();
    }

} //FOLDERTypeImpl
