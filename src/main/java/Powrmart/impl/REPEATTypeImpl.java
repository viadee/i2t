/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.FILTERType;
import Powrmart.PowrmartPackage;
import Powrmart.REPEATType;
import Powrmart.TYPEType8;

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
 * An implementation of the model object '<em><b>REPEAT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.REPEATTypeImpl#getFILTER <em>FILTER</em>}</li>
 *   <li>{@link Powrmart.impl.REPEATTypeImpl#getINTERVAL <em>INTERVAL</em>}</li>
 *   <li>{@link Powrmart.impl.REPEATTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class REPEATTypeImpl extends EObjectImpl implements REPEATType {
    /**
     * The cached value of the '{@link #getFILTER() <em>FILTER</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFILTER()
     * @generated
     * @ordered
     */
    protected EList<FILTERType> fILTER;

    /**
     * The default value of the '{@link #getINTERVAL() <em>INTERVAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINTERVAL()
     * @generated
     * @ordered
     */
    protected static final Object INTERVAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getINTERVAL() <em>INTERVAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINTERVAL()
     * @generated
     * @ordered
     */
    protected Object iNTERVAL = INTERVAL_EDEFAULT;

    /**
     * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected static final TYPEType8 TYPE_EDEFAULT = TYPEType8.DAILY;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected TYPEType8 tYPE = TYPE_EDEFAULT;

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
    protected REPEATTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getREPEATType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FILTERType> getFILTER() {
        if (fILTER == null) {
            fILTER = new EObjectContainmentEList<FILTERType>(FILTERType.class, this, PowrmartPackage.REPEAT_TYPE__FILTER);
        }
        return fILTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getINTERVAL() {
        return iNTERVAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setINTERVAL(Object newINTERVAL) {
        Object oldINTERVAL = iNTERVAL;
        iNTERVAL = newINTERVAL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.REPEAT_TYPE__INTERVAL, oldINTERVAL, iNTERVAL));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType8 getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTYPE(TYPEType8 newTYPE) {
        TYPEType8 oldTYPE = tYPE;
        tYPE = newTYPE == null ? TYPE_EDEFAULT : newTYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.REPEAT_TYPE__TYPE, oldTYPE, tYPE, !oldTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTYPE() {
        TYPEType8 oldTYPE = tYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPE = TYPE_EDEFAULT;
        tYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.REPEAT_TYPE__TYPE, oldTYPE, TYPE_EDEFAULT, oldTYPEESet));
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
            case PowrmartPackage.REPEAT_TYPE__FILTER:
                return ((InternalEList<?>)getFILTER()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.REPEAT_TYPE__FILTER:
                return getFILTER();
            case PowrmartPackage.REPEAT_TYPE__INTERVAL:
                return getINTERVAL();
            case PowrmartPackage.REPEAT_TYPE__TYPE:
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
            case PowrmartPackage.REPEAT_TYPE__FILTER:
                getFILTER().clear();
                getFILTER().addAll((Collection<? extends FILTERType>)newValue);
                return;
            case PowrmartPackage.REPEAT_TYPE__INTERVAL:
                setINTERVAL(newValue);
                return;
            case PowrmartPackage.REPEAT_TYPE__TYPE:
                setTYPE((TYPEType8)newValue);
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
            case PowrmartPackage.REPEAT_TYPE__FILTER:
                getFILTER().clear();
                return;
            case PowrmartPackage.REPEAT_TYPE__INTERVAL:
                setINTERVAL(INTERVAL_EDEFAULT);
                return;
            case PowrmartPackage.REPEAT_TYPE__TYPE:
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
            case PowrmartPackage.REPEAT_TYPE__FILTER:
                return fILTER != null && !fILTER.isEmpty();
            case PowrmartPackage.REPEAT_TYPE__INTERVAL:
                return INTERVAL_EDEFAULT == null ? iNTERVAL != null : !INTERVAL_EDEFAULT.equals(iNTERVAL);
            case PowrmartPackage.REPEAT_TYPE__TYPE:
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
        result.append(" (iNTERVAL: ");
        result.append(iNTERVAL);
        result.append(", tYPE: ");
        if (tYPEESet) result.append(tYPE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //REPEATTypeImpl
