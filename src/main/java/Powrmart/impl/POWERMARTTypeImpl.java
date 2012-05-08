/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.POWERMARTType;
import Powrmart.PowrmartPackage;
import Powrmart.REPOSITORYType;

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
 * An implementation of the model object '<em><b>POWERMART Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.POWERMARTTypeImpl#getREPOSITORY <em>REPOSITORY</em>}</li>
 *   <li>{@link Powrmart.impl.POWERMARTTypeImpl#getCREATIONDATE <em>CREATIONDATE</em>}</li>
 *   <li>{@link Powrmart.impl.POWERMARTTypeImpl#getREPOSITORYVERSION <em>REPOSITORYVERSION</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class POWERMARTTypeImpl extends EObjectImpl implements POWERMARTType {
    /**
     * The cached value of the '{@link #getREPOSITORY() <em>REPOSITORY</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREPOSITORY()
     * @generated
     * @ordered
     */
    protected EList<REPOSITORYType> rEPOSITORY;

    /**
     * The default value of the '{@link #getCREATIONDATE() <em>CREATIONDATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCREATIONDATE()
     * @generated
     * @ordered
     */
    protected static final Object CREATIONDATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCREATIONDATE() <em>CREATIONDATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCREATIONDATE()
     * @generated
     * @ordered
     */
    protected Object cREATIONDATE = CREATIONDATE_EDEFAULT;

    /**
     * The default value of the '{@link #getREPOSITORYVERSION() <em>REPOSITORYVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREPOSITORYVERSION()
     * @generated
     * @ordered
     */
    protected static final Object REPOSITORYVERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREPOSITORYVERSION() <em>REPOSITORYVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREPOSITORYVERSION()
     * @generated
     * @ordered
     */
    protected Object rEPOSITORYVERSION = REPOSITORYVERSION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected POWERMARTTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getPOWERMARTType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<REPOSITORYType> getREPOSITORY() {
        if (rEPOSITORY == null) {
            rEPOSITORY = new EObjectContainmentEList<REPOSITORYType>(REPOSITORYType.class, this, PowrmartPackage.POWERMART_TYPE__REPOSITORY);
        }
        return rEPOSITORY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCREATIONDATE() {
        return cREATIONDATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCREATIONDATE(Object newCREATIONDATE) {
        Object oldCREATIONDATE = cREATIONDATE;
        cREATIONDATE = newCREATIONDATE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.POWERMART_TYPE__CREATIONDATE, oldCREATIONDATE, cREATIONDATE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREPOSITORYVERSION() {
        return rEPOSITORYVERSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREPOSITORYVERSION(Object newREPOSITORYVERSION) {
        Object oldREPOSITORYVERSION = rEPOSITORYVERSION;
        rEPOSITORYVERSION = newREPOSITORYVERSION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.POWERMART_TYPE__REPOSITORYVERSION, oldREPOSITORYVERSION, rEPOSITORYVERSION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.POWERMART_TYPE__REPOSITORY:
                return ((InternalEList<?>)getREPOSITORY()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.POWERMART_TYPE__REPOSITORY:
                return getREPOSITORY();
            case PowrmartPackage.POWERMART_TYPE__CREATIONDATE:
                return getCREATIONDATE();
            case PowrmartPackage.POWERMART_TYPE__REPOSITORYVERSION:
                return getREPOSITORYVERSION();
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
            case PowrmartPackage.POWERMART_TYPE__REPOSITORY:
                getREPOSITORY().clear();
                getREPOSITORY().addAll((Collection<? extends REPOSITORYType>)newValue);
                return;
            case PowrmartPackage.POWERMART_TYPE__CREATIONDATE:
                setCREATIONDATE(newValue);
                return;
            case PowrmartPackage.POWERMART_TYPE__REPOSITORYVERSION:
                setREPOSITORYVERSION(newValue);
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
            case PowrmartPackage.POWERMART_TYPE__REPOSITORY:
                getREPOSITORY().clear();
                return;
            case PowrmartPackage.POWERMART_TYPE__CREATIONDATE:
                setCREATIONDATE(CREATIONDATE_EDEFAULT);
                return;
            case PowrmartPackage.POWERMART_TYPE__REPOSITORYVERSION:
                setREPOSITORYVERSION(REPOSITORYVERSION_EDEFAULT);
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
            case PowrmartPackage.POWERMART_TYPE__REPOSITORY:
                return rEPOSITORY != null && !rEPOSITORY.isEmpty();
            case PowrmartPackage.POWERMART_TYPE__CREATIONDATE:
                return CREATIONDATE_EDEFAULT == null ? cREATIONDATE != null : !CREATIONDATE_EDEFAULT.equals(cREATIONDATE);
            case PowrmartPackage.POWERMART_TYPE__REPOSITORYVERSION:
                return REPOSITORYVERSION_EDEFAULT == null ? rEPOSITORYVERSION != null : !REPOSITORYVERSION_EDEFAULT.equals(rEPOSITORYVERSION);
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
        result.append(" (cREATIONDATE: ");
        result.append(cREATIONDATE);
        result.append(", rEPOSITORYVERSION: ");
        result.append(rEPOSITORYVERSION);
        result.append(')');
        return result.toString();
    }

} //POWERMARTTypeImpl
