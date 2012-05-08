/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ASSOCIATEDSOURCEINSTANCEType;
import Powrmart.EXPRMACRODEPENDENCYType;
import Powrmart.INITPROPType;
import Powrmart.INSTANCEType;
import Powrmart.PowrmartPackage;
import Powrmart.REUSABLEType6;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TYPEType5;

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
 * An implementation of the model object '<em><b>INSTANCE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.INSTANCETypeImpl#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.INSTANCETypeImpl#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.impl.INSTANCETypeImpl#getINITPROP <em>INITPROP</em>}</li>
 *   <li>{@link Powrmart.impl.INSTANCETypeImpl#getASSOCIATEDSOURCEINSTANCE <em>ASSOCIATEDSOURCEINSTANCE</em>}</li>
 *   <li>{@link Powrmart.impl.INSTANCETypeImpl#getASSOCIATEDDSQ <em>ASSOCIATEDDSQ</em>}</li>
 *   <li>{@link Powrmart.impl.INSTANCETypeImpl#getASSOCIATEDDSQTYPE <em>ASSOCIATEDDSQTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.INSTANCETypeImpl#getDBDNAME <em>DBDNAME</em>}</li>
 *   <li>{@link Powrmart.impl.INSTANCETypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.INSTANCETypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.INSTANCETypeImpl#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.impl.INSTANCETypeImpl#getTRANSFORMATIONNAME <em>TRANSFORMATIONNAME</em>}</li>
 *   <li>{@link Powrmart.impl.INSTANCETypeImpl#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.INSTANCETypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class INSTANCETypeImpl extends EObjectImpl implements INSTANCEType {
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
     * The cached value of the '{@link #getEXPRMACRODEPENDENCY() <em>EXPRMACRODEPENDENCY</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEXPRMACRODEPENDENCY()
     * @generated
     * @ordered
     */
    protected EList<EXPRMACRODEPENDENCYType> eXPRMACRODEPENDENCY;

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
     * The cached value of the '{@link #getASSOCIATEDSOURCEINSTANCE() <em>ASSOCIATEDSOURCEINSTANCE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getASSOCIATEDSOURCEINSTANCE()
     * @generated
     * @ordered
     */
    protected EList<ASSOCIATEDSOURCEINSTANCEType> aSSOCIATEDSOURCEINSTANCE;

    /**
     * The default value of the '{@link #getASSOCIATEDDSQ() <em>ASSOCIATEDDSQ</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getASSOCIATEDDSQ()
     * @generated
     * @ordered
     */
    protected static final Object ASSOCIATEDDSQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getASSOCIATEDDSQ() <em>ASSOCIATEDDSQ</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getASSOCIATEDDSQ()
     * @generated
     * @ordered
     */
    protected Object aSSOCIATEDDSQ = ASSOCIATEDDSQ_EDEFAULT;

    /**
     * The default value of the '{@link #getASSOCIATEDDSQTYPE() <em>ASSOCIATEDDSQTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getASSOCIATEDDSQTYPE()
     * @generated
     * @ordered
     */
    protected static final Object ASSOCIATEDDSQTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getASSOCIATEDDSQTYPE() <em>ASSOCIATEDDSQTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getASSOCIATEDDSQTYPE()
     * @generated
     * @ordered
     */
    protected Object aSSOCIATEDDSQTYPE = ASSOCIATEDDSQTYPE_EDEFAULT;

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
     * The default value of the '{@link #getFIELD() <em>FIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELD()
     * @ordered
     */
//    protected static final Object FIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFIELD() <em>FIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELD()
     * @ordered
     */
//    protected Object fIELD = FIELD_EDEFAULT;

    /**
     * The default value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected static final REUSABLEType6 REUSABLE_EDEFAULT = REUSABLEType6.YES;

    /**
     * The cached value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected REUSABLEType6 rEUSABLE = REUSABLE_EDEFAULT;

    /**
     * This is true if the REUSABLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEUSABLEESet;

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
     * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected static final TYPEType5 TYPE_EDEFAULT = TYPEType5.SOURCE;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected TYPEType5 tYPE = TYPE_EDEFAULT;

    /**
     * This is true if the TYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tYPEESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public INSTANCETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getINSTANCEType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TABLEATTRIBUTEType> getTABLEATTRIBUTE() {
        if (tABLEATTRIBUTE == null) {
            tABLEATTRIBUTE = new EObjectContainmentEList<TABLEATTRIBUTEType>(TABLEATTRIBUTEType.class, this, PowrmartPackage.INSTANCE_TYPE__TABLEATTRIBUTE);
        }
        return tABLEATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EXPRMACRODEPENDENCYType> getEXPRMACRODEPENDENCY() {
        if (eXPRMACRODEPENDENCY == null) {
            eXPRMACRODEPENDENCY = new EObjectContainmentEList<EXPRMACRODEPENDENCYType>(EXPRMACRODEPENDENCYType.class, this, PowrmartPackage.INSTANCE_TYPE__EXPRMACRODEPENDENCY);
        }
        return eXPRMACRODEPENDENCY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<INITPROPType> getINITPROP() {
        if (iNITPROP == null) {
            iNITPROP = new EObjectContainmentEList<INITPROPType>(INITPROPType.class, this, PowrmartPackage.INSTANCE_TYPE__INITPROP);
        }
        return iNITPROP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ASSOCIATEDSOURCEINSTANCEType> getASSOCIATEDSOURCEINSTANCE() {
        if (aSSOCIATEDSOURCEINSTANCE == null) {
            aSSOCIATEDSOURCEINSTANCE = new EObjectContainmentEList<ASSOCIATEDSOURCEINSTANCEType>(ASSOCIATEDSOURCEINSTANCEType.class, this, PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDSOURCEINSTANCE);
        }
        return aSSOCIATEDSOURCEINSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getASSOCIATEDDSQ() {
        return aSSOCIATEDDSQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setASSOCIATEDDSQ(Object newASSOCIATEDDSQ) {
        Object oldASSOCIATEDDSQ = aSSOCIATEDDSQ;
        aSSOCIATEDDSQ = newASSOCIATEDDSQ;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDDSQ, oldASSOCIATEDDSQ, aSSOCIATEDDSQ));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getASSOCIATEDDSQTYPE() {
        return aSSOCIATEDDSQTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setASSOCIATEDDSQTYPE(Object newASSOCIATEDDSQTYPE) {
        Object oldASSOCIATEDDSQTYPE = aSSOCIATEDDSQTYPE;
        aSSOCIATEDDSQTYPE = newASSOCIATEDDSQTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDDSQTYPE, oldASSOCIATEDDSQTYPE, aSSOCIATEDDSQTYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INSTANCE_TYPE__DBDNAME, oldDBDNAME, dBDNAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INSTANCE_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
//    public Object getFIELD() {
//        return fIELD;
//    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
//    public void setFIELD(Object newFIELD) {
//        Object oldFIELD = fIELD;
//        fIELD = newFIELD;
//        if (eNotificationRequired())
//            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INSTANCE_TYPE__FIELD, oldFIELD, fIELD));
//    }
    
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INSTANCE_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType6 getREUSABLE() {
        return rEUSABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREUSABLE(REUSABLEType6 newREUSABLE) {
        REUSABLEType6 oldREUSABLE = rEUSABLE;
        rEUSABLE = newREUSABLE == null ? REUSABLE_EDEFAULT : newREUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INSTANCE_TYPE__REUSABLE, oldREUSABLE, rEUSABLE, !oldREUSABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREUSABLE() {
        REUSABLEType6 oldREUSABLE = rEUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLE = REUSABLE_EDEFAULT;
        rEUSABLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.INSTANCE_TYPE__REUSABLE, oldREUSABLE, REUSABLE_EDEFAULT, oldREUSABLEESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INSTANCE_TYPE__TRANSFORMATIONNAME, oldTRANSFORMATIONNAME, tRANSFORMATIONNAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INSTANCE_TYPE__TRANSFORMATIONTYPE, oldTRANSFORMATIONTYPE, tRANSFORMATIONTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType5 getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTYPE(TYPEType5 newTYPE) {
        TYPEType5 oldTYPE = tYPE;
        tYPE = newTYPE == null ? TYPE_EDEFAULT : newTYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INSTANCE_TYPE__TYPE, oldTYPE, tYPE, !oldTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTYPE() {
        TYPEType5 oldTYPE = tYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPE = TYPE_EDEFAULT;
        tYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.INSTANCE_TYPE__TYPE, oldTYPE, TYPE_EDEFAULT, oldTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTYPE() {
        return tYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.INSTANCE_TYPE__TABLEATTRIBUTE:
                return ((InternalEList<?>)getTABLEATTRIBUTE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.INSTANCE_TYPE__EXPRMACRODEPENDENCY:
                return ((InternalEList<?>)getEXPRMACRODEPENDENCY()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.INSTANCE_TYPE__INITPROP:
                return ((InternalEList<?>)getINITPROP()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDSOURCEINSTANCE:
                return ((InternalEList<?>)getASSOCIATEDSOURCEINSTANCE()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.INSTANCE_TYPE__TABLEATTRIBUTE:
                return getTABLEATTRIBUTE();
            case PowrmartPackage.INSTANCE_TYPE__EXPRMACRODEPENDENCY:
                return getEXPRMACRODEPENDENCY();
            case PowrmartPackage.INSTANCE_TYPE__INITPROP:
                return getINITPROP();
            case PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDSOURCEINSTANCE:
                return getASSOCIATEDSOURCEINSTANCE();
            case PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDDSQ:
                return getASSOCIATEDDSQ();
            case PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDDSQTYPE:
                return getASSOCIATEDDSQTYPE();
            case PowrmartPackage.INSTANCE_TYPE__DBDNAME:
                return getDBDNAME();
            case PowrmartPackage.INSTANCE_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.INSTANCE_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.INSTANCE_TYPE__REUSABLE:
                return getREUSABLE();
            case PowrmartPackage.INSTANCE_TYPE__TRANSFORMATIONNAME:
                return getTRANSFORMATIONNAME();
            case PowrmartPackage.INSTANCE_TYPE__TRANSFORMATIONTYPE:
                return getTRANSFORMATIONTYPE();
            case PowrmartPackage.INSTANCE_TYPE__TYPE:
                return getTYPE();
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
            case PowrmartPackage.INSTANCE_TYPE__TABLEATTRIBUTE:
                getTABLEATTRIBUTE().clear();
                getTABLEATTRIBUTE().addAll((Collection<? extends TABLEATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.INSTANCE_TYPE__EXPRMACRODEPENDENCY:
                getEXPRMACRODEPENDENCY().clear();
                getEXPRMACRODEPENDENCY().addAll((Collection<? extends EXPRMACRODEPENDENCYType>)newValue);
                return;
            case PowrmartPackage.INSTANCE_TYPE__INITPROP:
                getINITPROP().clear();
                getINITPROP().addAll((Collection<? extends INITPROPType>)newValue);
                return;
            case PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDSOURCEINSTANCE:
                getASSOCIATEDSOURCEINSTANCE().clear();
                getASSOCIATEDSOURCEINSTANCE().addAll((Collection<? extends ASSOCIATEDSOURCEINSTANCEType>)newValue);
                return;
            case PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDDSQ:
                setASSOCIATEDDSQ(newValue);
                return;
            case PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDDSQTYPE:
                setASSOCIATEDDSQTYPE(newValue);
                return;
            case PowrmartPackage.INSTANCE_TYPE__DBDNAME:
                setDBDNAME(newValue);
                return;
            case PowrmartPackage.INSTANCE_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.INSTANCE_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.INSTANCE_TYPE__REUSABLE:
                setREUSABLE((REUSABLEType6)newValue);
                return;
            case PowrmartPackage.INSTANCE_TYPE__TRANSFORMATIONNAME:
                setTRANSFORMATIONNAME(newValue);
                return;
            case PowrmartPackage.INSTANCE_TYPE__TRANSFORMATIONTYPE:
                setTRANSFORMATIONTYPE(newValue);
                return;
            case PowrmartPackage.INSTANCE_TYPE__TYPE:
                setTYPE((TYPEType5)newValue);
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
            case PowrmartPackage.INSTANCE_TYPE__TABLEATTRIBUTE:
                getTABLEATTRIBUTE().clear();
                return;
            case PowrmartPackage.INSTANCE_TYPE__EXPRMACRODEPENDENCY:
                getEXPRMACRODEPENDENCY().clear();
                return;
            case PowrmartPackage.INSTANCE_TYPE__INITPROP:
                getINITPROP().clear();
                return;
            case PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDSOURCEINSTANCE:
                getASSOCIATEDSOURCEINSTANCE().clear();
                return;
            case PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDDSQ:
                setASSOCIATEDDSQ(ASSOCIATEDDSQ_EDEFAULT);
                return;
            case PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDDSQTYPE:
                setASSOCIATEDDSQTYPE(ASSOCIATEDDSQTYPE_EDEFAULT);
                return;
            case PowrmartPackage.INSTANCE_TYPE__DBDNAME:
                setDBDNAME(DBDNAME_EDEFAULT);
                return;
            case PowrmartPackage.INSTANCE_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.INSTANCE_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.INSTANCE_TYPE__REUSABLE:
                unsetREUSABLE();
                return;
            case PowrmartPackage.INSTANCE_TYPE__TRANSFORMATIONNAME:
                setTRANSFORMATIONNAME(TRANSFORMATIONNAME_EDEFAULT);
                return;
            case PowrmartPackage.INSTANCE_TYPE__TRANSFORMATIONTYPE:
                setTRANSFORMATIONTYPE(TRANSFORMATIONTYPE_EDEFAULT);
                return;
            case PowrmartPackage.INSTANCE_TYPE__TYPE:
                unsetTYPE();
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
            case PowrmartPackage.INSTANCE_TYPE__TABLEATTRIBUTE:
                return tABLEATTRIBUTE != null && !tABLEATTRIBUTE.isEmpty();
            case PowrmartPackage.INSTANCE_TYPE__EXPRMACRODEPENDENCY:
                return eXPRMACRODEPENDENCY != null && !eXPRMACRODEPENDENCY.isEmpty();
            case PowrmartPackage.INSTANCE_TYPE__INITPROP:
                return iNITPROP != null && !iNITPROP.isEmpty();
            case PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDSOURCEINSTANCE:
                return aSSOCIATEDSOURCEINSTANCE != null && !aSSOCIATEDSOURCEINSTANCE.isEmpty();
            case PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDDSQ:
                return ASSOCIATEDDSQ_EDEFAULT == null ? aSSOCIATEDDSQ != null : !ASSOCIATEDDSQ_EDEFAULT.equals(aSSOCIATEDDSQ);
            case PowrmartPackage.INSTANCE_TYPE__ASSOCIATEDDSQTYPE:
                return ASSOCIATEDDSQTYPE_EDEFAULT == null ? aSSOCIATEDDSQTYPE != null : !ASSOCIATEDDSQTYPE_EDEFAULT.equals(aSSOCIATEDDSQTYPE);
            case PowrmartPackage.INSTANCE_TYPE__DBDNAME:
                return DBDNAME_EDEFAULT == null ? dBDNAME != null : !DBDNAME_EDEFAULT.equals(dBDNAME);
            case PowrmartPackage.INSTANCE_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.INSTANCE_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.INSTANCE_TYPE__REUSABLE:
                return isSetREUSABLE();
            case PowrmartPackage.INSTANCE_TYPE__TRANSFORMATIONNAME:
                return TRANSFORMATIONNAME_EDEFAULT == null ? tRANSFORMATIONNAME != null : !TRANSFORMATIONNAME_EDEFAULT.equals(tRANSFORMATIONNAME);
            case PowrmartPackage.INSTANCE_TYPE__TRANSFORMATIONTYPE:
                return TRANSFORMATIONTYPE_EDEFAULT == null ? tRANSFORMATIONTYPE != null : !TRANSFORMATIONTYPE_EDEFAULT.equals(tRANSFORMATIONTYPE);
            case PowrmartPackage.INSTANCE_TYPE__TYPE:
                return isSetTYPE();
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
        result.append(" (aSSOCIATEDDSQ: ");
        result.append(aSSOCIATEDDSQ);
        result.append(", aSSOCIATEDDSQTYPE: ");
        result.append(aSSOCIATEDDSQTYPE);
        result.append(", dBDNAME: ");
        result.append(dBDNAME);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", rEUSABLE: ");
        if (rEUSABLEESet) result.append(rEUSABLE); else result.append("<unset>");
        result.append(", tRANSFORMATIONNAME: ");
        result.append(tRANSFORMATIONNAME);
        result.append(", tRANSFORMATIONTYPE: ");
        result.append(tRANSFORMATIONTYPE);
        result.append(", tYPE: ");
        if (tYPEESet) result.append(tYPE); else result.append("<unset>");
//        result.append(", fIELD: ");
//        if (fIELD != null) result.append(fIELD); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nAME == null) ? 0 : nAME.hashCode());
        result = prime * result + ((tRANSFORMATIONNAME == null) ? 0 : tRANSFORMATIONNAME.hashCode());
        result = prime * result + ((tRANSFORMATIONTYPE == null) ? 0 : tRANSFORMATIONTYPE.hashCode());
        result = prime * result + ((tYPE == null) ? 0 : tYPE.hashCode());
//        result = prime * result + ((fIELD == null) ? 0 : fIELD.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof INSTANCETypeImpl))
            return false;
        INSTANCETypeImpl other = (INSTANCETypeImpl) obj;
        if (nAME == null) {
            if (other.nAME != null)
                return false;
        } else if (!nAME.equals(other.nAME))
            return false;
        if (tRANSFORMATIONNAME == null) {
            if (other.tRANSFORMATIONNAME != null)
                return false;
        } else if (!tRANSFORMATIONNAME.equals(other.tRANSFORMATIONNAME))
            return false;
        if (tRANSFORMATIONTYPE == null) {
            if (other.tRANSFORMATIONTYPE != null)
                return false;
        } else if (!tRANSFORMATIONTYPE.equals(other.tRANSFORMATIONTYPE))
            return false;
        if (tYPE == null) {
            if (other.tYPE != null)
                return false;
        } else if (!tYPE.equals(other.tYPE))
            return false;
//        if (fIELD == null) {
//            if (other.fIELD != null)
//                return false;
//        } else if (!fIELD.equals(other.fIELD))
//            return false;
        return true;
    }

} //INSTANCETypeImpl
