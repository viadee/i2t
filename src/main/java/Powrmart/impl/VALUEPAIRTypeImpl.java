/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.REVERSEASSIGNMENTType;
import Powrmart.VALUEPAIRType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VALUEPAIR Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.VALUEPAIRTypeImpl#getCOMMENTS <em>COMMENTS</em>}</li>
 *   <li>{@link Powrmart.impl.VALUEPAIRTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.VALUEPAIRTypeImpl#getREVERSEASSIGNMENT <em>REVERSEASSIGNMENT</em>}</li>
 *   <li>{@link Powrmart.impl.VALUEPAIRTypeImpl#getVALUE <em>VALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VALUEPAIRTypeImpl extends EObjectImpl implements VALUEPAIRType {
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
     * The default value of the '{@link #getREVERSEASSIGNMENT() <em>REVERSEASSIGNMENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREVERSEASSIGNMENT()
     * @generated
     * @ordered
     */
    protected static final REVERSEASSIGNMENTType REVERSEASSIGNMENT_EDEFAULT = REVERSEASSIGNMENTType.YES;

    /**
     * The cached value of the '{@link #getREVERSEASSIGNMENT() <em>REVERSEASSIGNMENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREVERSEASSIGNMENT()
     * @generated
     * @ordered
     */
    protected REVERSEASSIGNMENTType rEVERSEASSIGNMENT = REVERSEASSIGNMENT_EDEFAULT;

    /**
     * This is true if the REVERSEASSIGNMENT attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEVERSEASSIGNMENTESet;

    /**
     * The default value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUE()
     * @generated
     * @ordered
     */
    protected static final Object VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUE()
     * @generated
     * @ordered
     */
    protected Object vALUE = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VALUEPAIRTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getVALUEPAIRType();
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.VALUEPAIR_TYPE__COMMENTS, oldCOMMENTS, cOMMENTS));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.VALUEPAIR_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REVERSEASSIGNMENTType getREVERSEASSIGNMENT() {
        return rEVERSEASSIGNMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREVERSEASSIGNMENT(REVERSEASSIGNMENTType newREVERSEASSIGNMENT) {
        REVERSEASSIGNMENTType oldREVERSEASSIGNMENT = rEVERSEASSIGNMENT;
        rEVERSEASSIGNMENT = newREVERSEASSIGNMENT == null ? REVERSEASSIGNMENT_EDEFAULT : newREVERSEASSIGNMENT;
        boolean oldREVERSEASSIGNMENTESet = rEVERSEASSIGNMENTESet;
        rEVERSEASSIGNMENTESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.VALUEPAIR_TYPE__REVERSEASSIGNMENT, oldREVERSEASSIGNMENT, rEVERSEASSIGNMENT, !oldREVERSEASSIGNMENTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREVERSEASSIGNMENT() {
        REVERSEASSIGNMENTType oldREVERSEASSIGNMENT = rEVERSEASSIGNMENT;
        boolean oldREVERSEASSIGNMENTESet = rEVERSEASSIGNMENTESet;
        rEVERSEASSIGNMENT = REVERSEASSIGNMENT_EDEFAULT;
        rEVERSEASSIGNMENTESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.VALUEPAIR_TYPE__REVERSEASSIGNMENT, oldREVERSEASSIGNMENT, REVERSEASSIGNMENT_EDEFAULT, oldREVERSEASSIGNMENTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetREVERSEASSIGNMENT() {
        return rEVERSEASSIGNMENTESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getVALUE() {
        return vALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVALUE(Object newVALUE) {
        Object oldVALUE = vALUE;
        vALUE = newVALUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.VALUEPAIR_TYPE__VALUE, oldVALUE, vALUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.VALUEPAIR_TYPE__COMMENTS:
                return getCOMMENTS();
            case PowrmartPackage.VALUEPAIR_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.VALUEPAIR_TYPE__REVERSEASSIGNMENT:
                return getREVERSEASSIGNMENT();
            case PowrmartPackage.VALUEPAIR_TYPE__VALUE:
                return getVALUE();
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
            case PowrmartPackage.VALUEPAIR_TYPE__COMMENTS:
                setCOMMENTS(newValue);
                return;
            case PowrmartPackage.VALUEPAIR_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.VALUEPAIR_TYPE__REVERSEASSIGNMENT:
                setREVERSEASSIGNMENT((REVERSEASSIGNMENTType)newValue);
                return;
            case PowrmartPackage.VALUEPAIR_TYPE__VALUE:
                setVALUE(newValue);
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
            case PowrmartPackage.VALUEPAIR_TYPE__COMMENTS:
                setCOMMENTS(COMMENTS_EDEFAULT);
                return;
            case PowrmartPackage.VALUEPAIR_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.VALUEPAIR_TYPE__REVERSEASSIGNMENT:
                unsetREVERSEASSIGNMENT();
                return;
            case PowrmartPackage.VALUEPAIR_TYPE__VALUE:
                setVALUE(VALUE_EDEFAULT);
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
            case PowrmartPackage.VALUEPAIR_TYPE__COMMENTS:
                return COMMENTS_EDEFAULT == null ? cOMMENTS != null : !COMMENTS_EDEFAULT.equals(cOMMENTS);
            case PowrmartPackage.VALUEPAIR_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.VALUEPAIR_TYPE__REVERSEASSIGNMENT:
                return isSetREVERSEASSIGNMENT();
            case PowrmartPackage.VALUEPAIR_TYPE__VALUE:
                return VALUE_EDEFAULT == null ? vALUE != null : !VALUE_EDEFAULT.equals(vALUE);
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
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", rEVERSEASSIGNMENT: ");
        if (rEVERSEASSIGNMENTESet) result.append(rEVERSEASSIGNMENT); else result.append("<unset>");
        result.append(", vALUE: ");
        result.append(vALUE);
        result.append(')');
        return result.toString();
    }

} //VALUEPAIRTypeImpl
