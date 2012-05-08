/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.CUSTOMType;
import Powrmart.DAILYFREQUENCYType;
import Powrmart.PowrmartPackage;
import Powrmart.REPEATType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CUSTOM Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.CUSTOMTypeImpl#getDAILYFREQUENCY <em>DAILYFREQUENCY</em>}</li>
 *   <li>{@link Powrmart.impl.CUSTOMTypeImpl#getREPEAT <em>REPEAT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CUSTOMTypeImpl extends EObjectImpl implements CUSTOMType {
    /**
     * The cached value of the '{@link #getDAILYFREQUENCY() <em>DAILYFREQUENCY</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAILYFREQUENCY()
     * @generated
     * @ordered
     */
    protected DAILYFREQUENCYType dAILYFREQUENCY;

    /**
     * The cached value of the '{@link #getREPEAT() <em>REPEAT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREPEAT()
     * @generated
     * @ordered
     */
    protected REPEATType rEPEAT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CUSTOMTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getCUSTOMType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DAILYFREQUENCYType getDAILYFREQUENCY() {
        return dAILYFREQUENCY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDAILYFREQUENCY(DAILYFREQUENCYType newDAILYFREQUENCY, NotificationChain msgs) {
        DAILYFREQUENCYType oldDAILYFREQUENCY = dAILYFREQUENCY;
        dAILYFREQUENCY = newDAILYFREQUENCY;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.CUSTOM_TYPE__DAILYFREQUENCY, oldDAILYFREQUENCY, newDAILYFREQUENCY);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDAILYFREQUENCY(DAILYFREQUENCYType newDAILYFREQUENCY) {
        if (newDAILYFREQUENCY != dAILYFREQUENCY) {
            NotificationChain msgs = null;
            if (dAILYFREQUENCY != null)
                msgs = ((InternalEObject)dAILYFREQUENCY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.CUSTOM_TYPE__DAILYFREQUENCY, null, msgs);
            if (newDAILYFREQUENCY != null)
                msgs = ((InternalEObject)newDAILYFREQUENCY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.CUSTOM_TYPE__DAILYFREQUENCY, null, msgs);
            msgs = basicSetDAILYFREQUENCY(newDAILYFREQUENCY, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CUSTOM_TYPE__DAILYFREQUENCY, newDAILYFREQUENCY, newDAILYFREQUENCY));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REPEATType getREPEAT() {
        return rEPEAT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetREPEAT(REPEATType newREPEAT, NotificationChain msgs) {
        REPEATType oldREPEAT = rEPEAT;
        rEPEAT = newREPEAT;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.CUSTOM_TYPE__REPEAT, oldREPEAT, newREPEAT);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREPEAT(REPEATType newREPEAT) {
        if (newREPEAT != rEPEAT) {
            NotificationChain msgs = null;
            if (rEPEAT != null)
                msgs = ((InternalEObject)rEPEAT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.CUSTOM_TYPE__REPEAT, null, msgs);
            if (newREPEAT != null)
                msgs = ((InternalEObject)newREPEAT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.CUSTOM_TYPE__REPEAT, null, msgs);
            msgs = basicSetREPEAT(newREPEAT, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CUSTOM_TYPE__REPEAT, newREPEAT, newREPEAT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.CUSTOM_TYPE__DAILYFREQUENCY:
                return basicSetDAILYFREQUENCY(null, msgs);
            case PowrmartPackage.CUSTOM_TYPE__REPEAT:
                return basicSetREPEAT(null, msgs);
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
            case PowrmartPackage.CUSTOM_TYPE__DAILYFREQUENCY:
                return getDAILYFREQUENCY();
            case PowrmartPackage.CUSTOM_TYPE__REPEAT:
                return getREPEAT();
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
            case PowrmartPackage.CUSTOM_TYPE__DAILYFREQUENCY:
                setDAILYFREQUENCY((DAILYFREQUENCYType)newValue);
                return;
            case PowrmartPackage.CUSTOM_TYPE__REPEAT:
                setREPEAT((REPEATType)newValue);
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
            case PowrmartPackage.CUSTOM_TYPE__DAILYFREQUENCY:
                setDAILYFREQUENCY((DAILYFREQUENCYType)null);
                return;
            case PowrmartPackage.CUSTOM_TYPE__REPEAT:
                setREPEAT((REPEATType)null);
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
            case PowrmartPackage.CUSTOM_TYPE__DAILYFREQUENCY:
                return dAILYFREQUENCY != null;
            case PowrmartPackage.CUSTOM_TYPE__REPEAT:
                return rEPEAT != null;
        }
        return super.eIsSet(featureID);
    }

} //CUSTOMTypeImpl
