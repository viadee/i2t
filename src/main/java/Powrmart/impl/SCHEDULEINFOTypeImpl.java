/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ENDOPTIONSType;
import Powrmart.PowrmartPackage;
import Powrmart.SCHEDULEINFOType;
import Powrmart.SCHEDULEOPTIONSType;
import Powrmart.SCHEDULETYPEType;
import Powrmart.STARTOPTIONSType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SCHEDULEINFO Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SCHEDULEINFOTypeImpl#getSTARTOPTIONS <em>STARTOPTIONS</em>}</li>
 *   <li>{@link Powrmart.impl.SCHEDULEINFOTypeImpl#getSCHEDULEOPTIONS <em>SCHEDULEOPTIONS</em>}</li>
 *   <li>{@link Powrmart.impl.SCHEDULEINFOTypeImpl#getENDOPTIONS <em>ENDOPTIONS</em>}</li>
 *   <li>{@link Powrmart.impl.SCHEDULEINFOTypeImpl#getSCHEDULETYPE <em>SCHEDULETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SCHEDULEINFOTypeImpl extends EObjectImpl implements SCHEDULEINFOType {
    /**
     * The cached value of the '{@link #getSTARTOPTIONS() <em>STARTOPTIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTARTOPTIONS()
     * @generated
     * @ordered
     */
    protected STARTOPTIONSType sTARTOPTIONS;

    /**
     * The cached value of the '{@link #getSCHEDULEOPTIONS() <em>SCHEDULEOPTIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCHEDULEOPTIONS()
     * @generated
     * @ordered
     */
    protected SCHEDULEOPTIONSType sCHEDULEOPTIONS;

    /**
     * The cached value of the '{@link #getENDOPTIONS() <em>ENDOPTIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getENDOPTIONS()
     * @generated
     * @ordered
     */
    protected ENDOPTIONSType eNDOPTIONS;

    /**
     * The default value of the '{@link #getSCHEDULETYPE() <em>SCHEDULETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCHEDULETYPE()
     * @generated
     * @ordered
     */
    protected static final SCHEDULETYPEType SCHEDULETYPE_EDEFAULT = SCHEDULETYPEType.ONDEMAND;

    /**
     * The cached value of the '{@link #getSCHEDULETYPE() <em>SCHEDULETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCHEDULETYPE()
     * @generated
     * @ordered
     */
    protected SCHEDULETYPEType sCHEDULETYPE = SCHEDULETYPE_EDEFAULT;

    /**
     * This is true if the SCHEDULETYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sCHEDULETYPEESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SCHEDULEINFOTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSCHEDULEINFOType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public STARTOPTIONSType getSTARTOPTIONS() {
        return sTARTOPTIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSTARTOPTIONS(STARTOPTIONSType newSTARTOPTIONS, NotificationChain msgs) {
        STARTOPTIONSType oldSTARTOPTIONS = sTARTOPTIONS;
        sTARTOPTIONS = newSTARTOPTIONS;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEINFO_TYPE__STARTOPTIONS, oldSTARTOPTIONS, newSTARTOPTIONS);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSTARTOPTIONS(STARTOPTIONSType newSTARTOPTIONS) {
        if (newSTARTOPTIONS != sTARTOPTIONS) {
            NotificationChain msgs = null;
            if (sTARTOPTIONS != null)
                msgs = ((InternalEObject)sTARTOPTIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SCHEDULEINFO_TYPE__STARTOPTIONS, null, msgs);
            if (newSTARTOPTIONS != null)
                msgs = ((InternalEObject)newSTARTOPTIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SCHEDULEINFO_TYPE__STARTOPTIONS, null, msgs);
            msgs = basicSetSTARTOPTIONS(newSTARTOPTIONS, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEINFO_TYPE__STARTOPTIONS, newSTARTOPTIONS, newSTARTOPTIONS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULEOPTIONSType getSCHEDULEOPTIONS() {
        return sCHEDULEOPTIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSCHEDULEOPTIONS(SCHEDULEOPTIONSType newSCHEDULEOPTIONS, NotificationChain msgs) {
        SCHEDULEOPTIONSType oldSCHEDULEOPTIONS = sCHEDULEOPTIONS;
        sCHEDULEOPTIONS = newSCHEDULEOPTIONS;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULEOPTIONS, oldSCHEDULEOPTIONS, newSCHEDULEOPTIONS);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCHEDULEOPTIONS(SCHEDULEOPTIONSType newSCHEDULEOPTIONS) {
        if (newSCHEDULEOPTIONS != sCHEDULEOPTIONS) {
            NotificationChain msgs = null;
            if (sCHEDULEOPTIONS != null)
                msgs = ((InternalEObject)sCHEDULEOPTIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULEOPTIONS, null, msgs);
            if (newSCHEDULEOPTIONS != null)
                msgs = ((InternalEObject)newSCHEDULEOPTIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULEOPTIONS, null, msgs);
            msgs = basicSetSCHEDULEOPTIONS(newSCHEDULEOPTIONS, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULEOPTIONS, newSCHEDULEOPTIONS, newSCHEDULEOPTIONS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ENDOPTIONSType getENDOPTIONS() {
        return eNDOPTIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetENDOPTIONS(ENDOPTIONSType newENDOPTIONS, NotificationChain msgs) {
        ENDOPTIONSType oldENDOPTIONS = eNDOPTIONS;
        eNDOPTIONS = newENDOPTIONS;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEINFO_TYPE__ENDOPTIONS, oldENDOPTIONS, newENDOPTIONS);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setENDOPTIONS(ENDOPTIONSType newENDOPTIONS) {
        if (newENDOPTIONS != eNDOPTIONS) {
            NotificationChain msgs = null;
            if (eNDOPTIONS != null)
                msgs = ((InternalEObject)eNDOPTIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SCHEDULEINFO_TYPE__ENDOPTIONS, null, msgs);
            if (newENDOPTIONS != null)
                msgs = ((InternalEObject)newENDOPTIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SCHEDULEINFO_TYPE__ENDOPTIONS, null, msgs);
            msgs = basicSetENDOPTIONS(newENDOPTIONS, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEINFO_TYPE__ENDOPTIONS, newENDOPTIONS, newENDOPTIONS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULETYPEType getSCHEDULETYPE() {
        return sCHEDULETYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCHEDULETYPE(SCHEDULETYPEType newSCHEDULETYPE) {
        SCHEDULETYPEType oldSCHEDULETYPE = sCHEDULETYPE;
        sCHEDULETYPE = newSCHEDULETYPE == null ? SCHEDULETYPE_EDEFAULT : newSCHEDULETYPE;
        boolean oldSCHEDULETYPEESet = sCHEDULETYPEESet;
        sCHEDULETYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULETYPE, oldSCHEDULETYPE, sCHEDULETYPE, !oldSCHEDULETYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSCHEDULETYPE() {
        SCHEDULETYPEType oldSCHEDULETYPE = sCHEDULETYPE;
        boolean oldSCHEDULETYPEESet = sCHEDULETYPEESet;
        sCHEDULETYPE = SCHEDULETYPE_EDEFAULT;
        sCHEDULETYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULETYPE, oldSCHEDULETYPE, SCHEDULETYPE_EDEFAULT, oldSCHEDULETYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSCHEDULETYPE() {
        return sCHEDULETYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SCHEDULEINFO_TYPE__STARTOPTIONS:
                return basicSetSTARTOPTIONS(null, msgs);
            case PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULEOPTIONS:
                return basicSetSCHEDULEOPTIONS(null, msgs);
            case PowrmartPackage.SCHEDULEINFO_TYPE__ENDOPTIONS:
                return basicSetENDOPTIONS(null, msgs);
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
            case PowrmartPackage.SCHEDULEINFO_TYPE__STARTOPTIONS:
                return getSTARTOPTIONS();
            case PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULEOPTIONS:
                return getSCHEDULEOPTIONS();
            case PowrmartPackage.SCHEDULEINFO_TYPE__ENDOPTIONS:
                return getENDOPTIONS();
            case PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULETYPE:
                return getSCHEDULETYPE();
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
            case PowrmartPackage.SCHEDULEINFO_TYPE__STARTOPTIONS:
                setSTARTOPTIONS((STARTOPTIONSType)newValue);
                return;
            case PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULEOPTIONS:
                setSCHEDULEOPTIONS((SCHEDULEOPTIONSType)newValue);
                return;
            case PowrmartPackage.SCHEDULEINFO_TYPE__ENDOPTIONS:
                setENDOPTIONS((ENDOPTIONSType)newValue);
                return;
            case PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULETYPE:
                setSCHEDULETYPE((SCHEDULETYPEType)newValue);
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
            case PowrmartPackage.SCHEDULEINFO_TYPE__STARTOPTIONS:
                setSTARTOPTIONS((STARTOPTIONSType)null);
                return;
            case PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULEOPTIONS:
                setSCHEDULEOPTIONS((SCHEDULEOPTIONSType)null);
                return;
            case PowrmartPackage.SCHEDULEINFO_TYPE__ENDOPTIONS:
                setENDOPTIONS((ENDOPTIONSType)null);
                return;
            case PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULETYPE:
                unsetSCHEDULETYPE();
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
            case PowrmartPackage.SCHEDULEINFO_TYPE__STARTOPTIONS:
                return sTARTOPTIONS != null;
            case PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULEOPTIONS:
                return sCHEDULEOPTIONS != null;
            case PowrmartPackage.SCHEDULEINFO_TYPE__ENDOPTIONS:
                return eNDOPTIONS != null;
            case PowrmartPackage.SCHEDULEINFO_TYPE__SCHEDULETYPE:
                return isSetSCHEDULETYPE();
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
        result.append(" (sCHEDULETYPE: ");
        if (sCHEDULETYPEESet) result.append(sCHEDULETYPE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //SCHEDULEINFOTypeImpl
