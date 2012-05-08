/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ATTRIBUTEType;
import Powrmart.FLATFILEType;
import Powrmart.HASHKEYType;
import Powrmart.ISREPARTITIONPOINTType;
import Powrmart.PARTITIONType;
import Powrmart.PowrmartPackage;
import Powrmart.SESSTRANSFORMATIONGROUPType;
import Powrmart.SESSTRANSFORMATIONINSTType;

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
 * An implementation of the model object '<em><b>SESSTRANSFORMATIONINST Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl#getSESSTRANSFORMATIONGROUP <em>SESSTRANSFORMATIONGROUP</em>}</li>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl#getPARTITION <em>PARTITION</em>}</li>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl#getHASHKEY <em>HASHKEY</em>}</li>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl#getFLATFILE <em>FLATFILE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl#getISREPARTITIONPOINT <em>ISREPARTITIONPOINT</em>}</li>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl#getPARTITIONTYPE <em>PARTITIONTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl#getPIPELINE <em>PIPELINE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl#getSINSTANCENAME <em>SINSTANCENAME</em>}</li>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl#getSTAGE <em>STAGE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl#getTRANSFORMATIONNAME <em>TRANSFORMATIONNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SESSTRANSFORMATIONINSTTypeImpl#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SESSTRANSFORMATIONINSTTypeImpl extends EObjectImpl implements SESSTRANSFORMATIONINSTType {
    /**
     * The cached value of the '{@link #getSESSTRANSFORMATIONGROUP() <em>SESSTRANSFORMATIONGROUP</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSESSTRANSFORMATIONGROUP()
     * @generated
     * @ordered
     */
    protected EList<SESSTRANSFORMATIONGROUPType> sESSTRANSFORMATIONGROUP;

    /**
     * The cached value of the '{@link #getPARTITION() <em>PARTITION</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARTITION()
     * @generated
     * @ordered
     */
    protected EList<PARTITIONType> pARTITION;

    /**
     * The cached value of the '{@link #getHASHKEY() <em>HASHKEY</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHASHKEY()
     * @generated
     * @ordered
     */
    protected EList<HASHKEYType> hASHKEY;

    /**
     * The cached value of the '{@link #getFLATFILE() <em>FLATFILE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFLATFILE()
     * @generated
     * @ordered
     */
    protected EList<FLATFILEType> fLATFILE;

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
     * The default value of the '{@link #getISREPARTITIONPOINT() <em>ISREPARTITIONPOINT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISREPARTITIONPOINT()
     * @generated
     * @ordered
     */
    protected static final ISREPARTITIONPOINTType ISREPARTITIONPOINT_EDEFAULT = ISREPARTITIONPOINTType.YES;

    /**
     * The cached value of the '{@link #getISREPARTITIONPOINT() <em>ISREPARTITIONPOINT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISREPARTITIONPOINT()
     * @generated
     * @ordered
     */
    protected ISREPARTITIONPOINTType iSREPARTITIONPOINT = ISREPARTITIONPOINT_EDEFAULT;

    /**
     * This is true if the ISREPARTITIONPOINT attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSREPARTITIONPOINTESet;

    /**
     * The default value of the '{@link #getPARTITIONTYPE() <em>PARTITIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARTITIONTYPE()
     * @generated
     * @ordered
     */
    protected static final Object PARTITIONTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPARTITIONTYPE() <em>PARTITIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARTITIONTYPE()
     * @generated
     * @ordered
     */
    protected Object pARTITIONTYPE = PARTITIONTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getPIPELINE() <em>PIPELINE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPIPELINE()
     * @generated
     * @ordered
     */
    protected static final Object PIPELINE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPIPELINE() <em>PIPELINE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPIPELINE()
     * @generated
     * @ordered
     */
    protected Object pIPELINE = PIPELINE_EDEFAULT;

    /**
     * The default value of the '{@link #getSINSTANCENAME() <em>SINSTANCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSINSTANCENAME()
     * @generated
     * @ordered
     */
    protected static final Object SINSTANCENAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSINSTANCENAME() <em>SINSTANCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSINSTANCENAME()
     * @generated
     * @ordered
     */
    protected Object sINSTANCENAME = SINSTANCENAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSTAGE() <em>STAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTAGE()
     * @generated
     * @ordered
     */
    protected static final Object STAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSTAGE() <em>STAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTAGE()
     * @generated
     * @ordered
     */
    protected Object sTAGE = STAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getTRANSFORMATIONNAME() <em>TRANSFORMATIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTRANSFORMATIONNAME()
     * @generated
     * @ordered
     */
    protected static final Object TRANSFORMATIONNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTRANSFORMATIONNAME() <em>TRANSFORMATIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTRANSFORMATIONNAME()
     * @generated
     * @ordered
     */
    protected Object tRANSFORMATIONNAME = TRANSFORMATIONNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTRANSFORMATIONTYPE() <em>TRANSFORMATIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTRANSFORMATIONTYPE()
     * @generated
     * @ordered
     */
    protected static final Object TRANSFORMATIONTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTRANSFORMATIONTYPE() <em>TRANSFORMATIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTRANSFORMATIONTYPE()
     * @generated
     * @ordered
     */
    protected Object tRANSFORMATIONTYPE = TRANSFORMATIONTYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SESSTRANSFORMATIONINSTTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSESSTRANSFORMATIONINSTType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SESSTRANSFORMATIONGROUPType> getSESSTRANSFORMATIONGROUP() {
        if (sESSTRANSFORMATIONGROUP == null) {
            sESSTRANSFORMATIONGROUP = new EObjectContainmentEList<SESSTRANSFORMATIONGROUPType>(SESSTRANSFORMATIONGROUPType.class, this, PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__SESSTRANSFORMATIONGROUP);
        }
        return sESSTRANSFORMATIONGROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PARTITIONType> getPARTITION() {
        if (pARTITION == null) {
            pARTITION = new EObjectContainmentEList<PARTITIONType>(PARTITIONType.class, this, PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PARTITION);
        }
        return pARTITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<HASHKEYType> getHASHKEY() {
        if (hASHKEY == null) {
            hASHKEY = new EObjectContainmentEList<HASHKEYType>(HASHKEYType.class, this, PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__HASHKEY);
        }
        return hASHKEY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FLATFILEType> getFLATFILE() {
        if (fLATFILE == null) {
            fLATFILE = new EObjectContainmentEList<FLATFILEType>(FLATFILEType.class, this, PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__FLATFILE);
        }
        return fLATFILE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ATTRIBUTEType> getATTRIBUTE() {
        if (aTTRIBUTE == null) {
            aTTRIBUTE = new EObjectContainmentEList<ATTRIBUTEType>(ATTRIBUTEType.class, this, PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__ATTRIBUTE);
        }
        return aTTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISREPARTITIONPOINTType getISREPARTITIONPOINT() {
        return iSREPARTITIONPOINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISREPARTITIONPOINT(ISREPARTITIONPOINTType newISREPARTITIONPOINT) {
        ISREPARTITIONPOINTType oldISREPARTITIONPOINT = iSREPARTITIONPOINT;
        iSREPARTITIONPOINT = newISREPARTITIONPOINT == null ? ISREPARTITIONPOINT_EDEFAULT : newISREPARTITIONPOINT;
        boolean oldISREPARTITIONPOINTESet = iSREPARTITIONPOINTESet;
        iSREPARTITIONPOINTESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__ISREPARTITIONPOINT, oldISREPARTITIONPOINT, iSREPARTITIONPOINT, !oldISREPARTITIONPOINTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISREPARTITIONPOINT() {
        ISREPARTITIONPOINTType oldISREPARTITIONPOINT = iSREPARTITIONPOINT;
        boolean oldISREPARTITIONPOINTESet = iSREPARTITIONPOINTESet;
        iSREPARTITIONPOINT = ISREPARTITIONPOINT_EDEFAULT;
        iSREPARTITIONPOINTESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__ISREPARTITIONPOINT, oldISREPARTITIONPOINT, ISREPARTITIONPOINT_EDEFAULT, oldISREPARTITIONPOINTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISREPARTITIONPOINT() {
        return iSREPARTITIONPOINTESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPARTITIONTYPE() {
        return pARTITIONTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARTITIONTYPE(Object newPARTITIONTYPE) {
        Object oldPARTITIONTYPE = pARTITIONTYPE;
        pARTITIONTYPE = newPARTITIONTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PARTITIONTYPE, oldPARTITIONTYPE, pARTITIONTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPIPELINE() {
        return pIPELINE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPIPELINE(Object newPIPELINE) {
        Object oldPIPELINE = pIPELINE;
        pIPELINE = newPIPELINE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PIPELINE, oldPIPELINE, pIPELINE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSINSTANCENAME() {
        return sINSTANCENAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSINSTANCENAME(Object newSINSTANCENAME) {
        Object oldSINSTANCENAME = sINSTANCENAME;
        sINSTANCENAME = newSINSTANCENAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__SINSTANCENAME, oldSINSTANCENAME, sINSTANCENAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSTAGE() {
        return sTAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSTAGE(Object newSTAGE) {
        Object oldSTAGE = sTAGE;
        sTAGE = newSTAGE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__STAGE, oldSTAGE, sTAGE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTRANSFORMATIONNAME() {
        return tRANSFORMATIONNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTRANSFORMATIONNAME(Object newTRANSFORMATIONNAME) {
        Object oldTRANSFORMATIONNAME = tRANSFORMATIONNAME;
        tRANSFORMATIONNAME = newTRANSFORMATIONNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__TRANSFORMATIONNAME, oldTRANSFORMATIONNAME, tRANSFORMATIONNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTRANSFORMATIONTYPE() {
        return tRANSFORMATIONTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTRANSFORMATIONTYPE(Object newTRANSFORMATIONTYPE) {
        Object oldTRANSFORMATIONTYPE = tRANSFORMATIONTYPE;
        tRANSFORMATIONTYPE = newTRANSFORMATIONTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__TRANSFORMATIONTYPE, oldTRANSFORMATIONTYPE, tRANSFORMATIONTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__SESSTRANSFORMATIONGROUP:
                return ((InternalEList<?>)getSESSTRANSFORMATIONGROUP()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PARTITION:
                return ((InternalEList<?>)getPARTITION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__HASHKEY:
                return ((InternalEList<?>)getHASHKEY()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__FLATFILE:
                return ((InternalEList<?>)getFLATFILE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__ATTRIBUTE:
                return ((InternalEList<?>)getATTRIBUTE()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__SESSTRANSFORMATIONGROUP:
                return getSESSTRANSFORMATIONGROUP();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PARTITION:
                return getPARTITION();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__HASHKEY:
                return getHASHKEY();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__FLATFILE:
                return getFLATFILE();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__ATTRIBUTE:
                return getATTRIBUTE();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__ISREPARTITIONPOINT:
                return getISREPARTITIONPOINT();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PARTITIONTYPE:
                return getPARTITIONTYPE();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PIPELINE:
                return getPIPELINE();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__SINSTANCENAME:
                return getSINSTANCENAME();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__STAGE:
                return getSTAGE();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__TRANSFORMATIONNAME:
                return getTRANSFORMATIONNAME();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__TRANSFORMATIONTYPE:
                return getTRANSFORMATIONTYPE();
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
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__SESSTRANSFORMATIONGROUP:
                getSESSTRANSFORMATIONGROUP().clear();
                getSESSTRANSFORMATIONGROUP().addAll((Collection<? extends SESSTRANSFORMATIONGROUPType>)newValue);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PARTITION:
                getPARTITION().clear();
                getPARTITION().addAll((Collection<? extends PARTITIONType>)newValue);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__HASHKEY:
                getHASHKEY().clear();
                getHASHKEY().addAll((Collection<? extends HASHKEYType>)newValue);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__FLATFILE:
                getFLATFILE().clear();
                getFLATFILE().addAll((Collection<? extends FLATFILEType>)newValue);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                getATTRIBUTE().addAll((Collection<? extends ATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__ISREPARTITIONPOINT:
                setISREPARTITIONPOINT((ISREPARTITIONPOINTType)newValue);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PARTITIONTYPE:
                setPARTITIONTYPE(newValue);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PIPELINE:
                setPIPELINE(newValue);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__SINSTANCENAME:
                setSINSTANCENAME(newValue);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__STAGE:
                setSTAGE(newValue);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__TRANSFORMATIONNAME:
                setTRANSFORMATIONNAME(newValue);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__TRANSFORMATIONTYPE:
                setTRANSFORMATIONTYPE(newValue);
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
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__SESSTRANSFORMATIONGROUP:
                getSESSTRANSFORMATIONGROUP().clear();
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PARTITION:
                getPARTITION().clear();
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__HASHKEY:
                getHASHKEY().clear();
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__FLATFILE:
                getFLATFILE().clear();
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__ISREPARTITIONPOINT:
                unsetISREPARTITIONPOINT();
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PARTITIONTYPE:
                setPARTITIONTYPE(PARTITIONTYPE_EDEFAULT);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PIPELINE:
                setPIPELINE(PIPELINE_EDEFAULT);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__SINSTANCENAME:
                setSINSTANCENAME(SINSTANCENAME_EDEFAULT);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__STAGE:
                setSTAGE(STAGE_EDEFAULT);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__TRANSFORMATIONNAME:
                setTRANSFORMATIONNAME(TRANSFORMATIONNAME_EDEFAULT);
                return;
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__TRANSFORMATIONTYPE:
                setTRANSFORMATIONTYPE(TRANSFORMATIONTYPE_EDEFAULT);
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
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__SESSTRANSFORMATIONGROUP:
                return sESSTRANSFORMATIONGROUP != null && !sESSTRANSFORMATIONGROUP.isEmpty();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PARTITION:
                return pARTITION != null && !pARTITION.isEmpty();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__HASHKEY:
                return hASHKEY != null && !hASHKEY.isEmpty();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__FLATFILE:
                return fLATFILE != null && !fLATFILE.isEmpty();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__ATTRIBUTE:
                return aTTRIBUTE != null && !aTTRIBUTE.isEmpty();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__ISREPARTITIONPOINT:
                return isSetISREPARTITIONPOINT();
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PARTITIONTYPE:
                return PARTITIONTYPE_EDEFAULT == null ? pARTITIONTYPE != null : !PARTITIONTYPE_EDEFAULT.equals(pARTITIONTYPE);
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__PIPELINE:
                return PIPELINE_EDEFAULT == null ? pIPELINE != null : !PIPELINE_EDEFAULT.equals(pIPELINE);
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__SINSTANCENAME:
                return SINSTANCENAME_EDEFAULT == null ? sINSTANCENAME != null : !SINSTANCENAME_EDEFAULT.equals(sINSTANCENAME);
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__STAGE:
                return STAGE_EDEFAULT == null ? sTAGE != null : !STAGE_EDEFAULT.equals(sTAGE);
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__TRANSFORMATIONNAME:
                return TRANSFORMATIONNAME_EDEFAULT == null ? tRANSFORMATIONNAME != null : !TRANSFORMATIONNAME_EDEFAULT.equals(tRANSFORMATIONNAME);
            case PowrmartPackage.SESSTRANSFORMATIONINST_TYPE__TRANSFORMATIONTYPE:
                return TRANSFORMATIONTYPE_EDEFAULT == null ? tRANSFORMATIONTYPE != null : !TRANSFORMATIONTYPE_EDEFAULT.equals(tRANSFORMATIONTYPE);
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
        result.append(" (iSREPARTITIONPOINT: ");
        if (iSREPARTITIONPOINTESet) result.append(iSREPARTITIONPOINT); else result.append("<unset>");
        result.append(", pARTITIONTYPE: ");
        result.append(pARTITIONTYPE);
        result.append(", pIPELINE: ");
        result.append(pIPELINE);
        result.append(", sINSTANCENAME: ");
        result.append(sINSTANCENAME);
        result.append(", sTAGE: ");
        result.append(sTAGE);
        result.append(", tRANSFORMATIONNAME: ");
        result.append(tRANSFORMATIONNAME);
        result.append(", tRANSFORMATIONTYPE: ");
        result.append(tRANSFORMATIONTYPE);
        result.append(')');
        return result.toString();
    }

} //SESSTRANSFORMATIONINSTTypeImpl
