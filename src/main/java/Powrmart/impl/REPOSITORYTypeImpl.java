/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.FOLDERType;
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
 * An implementation of the model object '<em><b>REPOSITORY Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.REPOSITORYTypeImpl#getFOLDER <em>FOLDER</em>}</li>
 *   <li>{@link Powrmart.impl.REPOSITORYTypeImpl#getCODEPAGE <em>CODEPAGE</em>}</li>
 *   <li>{@link Powrmart.impl.REPOSITORYTypeImpl#getDATABASETYPE <em>DATABASETYPE</em>}</li>
 *   <li>{@link Powrmart.impl.REPOSITORYTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.REPOSITORYTypeImpl#getPARENTREPOSITORY <em>PARENTREPOSITORY</em>}</li>
 *   <li>{@link Powrmart.impl.REPOSITORYTypeImpl#getVERSION <em>VERSION</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class REPOSITORYTypeImpl extends EObjectImpl implements REPOSITORYType {
    /**
     * The cached value of the '{@link #getFOLDER() <em>FOLDER</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFOLDER()
     * @generated
     * @ordered
     */
    protected EList<FOLDERType> fOLDER;

    /**
     * The default value of the '{@link #getCODEPAGE() <em>CODEPAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCODEPAGE()
     * @generated
     * @ordered
     */
    protected static final Object CODEPAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCODEPAGE() <em>CODEPAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCODEPAGE()
     * @generated
     * @ordered
     */
    protected Object cODEPAGE = CODEPAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getDATABASETYPE() <em>DATABASETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATABASETYPE()
     * @generated
     * @ordered
     */
    protected static final Object DATABASETYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDATABASETYPE() <em>DATABASETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATABASETYPE()
     * @generated
     * @ordered
     */
    protected Object dATABASETYPE = DATABASETYPE_EDEFAULT;

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
     * The default value of the '{@link #getPARENTREPOSITORY() <em>PARENTREPOSITORY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENTREPOSITORY()
     * @generated
     * @ordered
     */
    protected static final Object PARENTREPOSITORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPARENTREPOSITORY() <em>PARENTREPOSITORY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENTREPOSITORY()
     * @generated
     * @ordered
     */
    protected Object pARENTREPOSITORY = PARENTREPOSITORY_EDEFAULT;

    /**
     * The default value of the '{@link #getVERSION() <em>VERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVERSION()
     * @generated
     * @ordered
     */
    protected static final Object VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVERSION() <em>VERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVERSION()
     * @generated
     * @ordered
     */
    protected Object vERSION = VERSION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected REPOSITORYTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getREPOSITORYType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FOLDERType> getFOLDER() {
        if (fOLDER == null) {
            fOLDER = new EObjectContainmentEList<FOLDERType>(FOLDERType.class, this, PowrmartPackage.REPOSITORY_TYPE__FOLDER);
        }
        return fOLDER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCODEPAGE() {
        return cODEPAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCODEPAGE(Object newCODEPAGE) {
        Object oldCODEPAGE = cODEPAGE;
        cODEPAGE = newCODEPAGE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.REPOSITORY_TYPE__CODEPAGE, oldCODEPAGE, cODEPAGE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDATABASETYPE() {
        return dATABASETYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATABASETYPE(Object newDATABASETYPE) {
        Object oldDATABASETYPE = dATABASETYPE;
        dATABASETYPE = newDATABASETYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.REPOSITORY_TYPE__DATABASETYPE, oldDATABASETYPE, dATABASETYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.REPOSITORY_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPARENTREPOSITORY() {
        return pARENTREPOSITORY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARENTREPOSITORY(Object newPARENTREPOSITORY) {
        Object oldPARENTREPOSITORY = pARENTREPOSITORY;
        pARENTREPOSITORY = newPARENTREPOSITORY;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.REPOSITORY_TYPE__PARENTREPOSITORY, oldPARENTREPOSITORY, pARENTREPOSITORY));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getVERSION() {
        return vERSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVERSION(Object newVERSION) {
        Object oldVERSION = vERSION;
        vERSION = newVERSION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.REPOSITORY_TYPE__VERSION, oldVERSION, vERSION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.REPOSITORY_TYPE__FOLDER:
                return ((InternalEList<?>)getFOLDER()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.REPOSITORY_TYPE__FOLDER:
                return getFOLDER();
            case PowrmartPackage.REPOSITORY_TYPE__CODEPAGE:
                return getCODEPAGE();
            case PowrmartPackage.REPOSITORY_TYPE__DATABASETYPE:
                return getDATABASETYPE();
            case PowrmartPackage.REPOSITORY_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.REPOSITORY_TYPE__PARENTREPOSITORY:
                return getPARENTREPOSITORY();
            case PowrmartPackage.REPOSITORY_TYPE__VERSION:
                return getVERSION();
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
            case PowrmartPackage.REPOSITORY_TYPE__FOLDER:
                getFOLDER().clear();
                getFOLDER().addAll((Collection<? extends FOLDERType>)newValue);
                return;
            case PowrmartPackage.REPOSITORY_TYPE__CODEPAGE:
                setCODEPAGE(newValue);
                return;
            case PowrmartPackage.REPOSITORY_TYPE__DATABASETYPE:
                setDATABASETYPE(newValue);
                return;
            case PowrmartPackage.REPOSITORY_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.REPOSITORY_TYPE__PARENTREPOSITORY:
                setPARENTREPOSITORY(newValue);
                return;
            case PowrmartPackage.REPOSITORY_TYPE__VERSION:
                setVERSION(newValue);
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
            case PowrmartPackage.REPOSITORY_TYPE__FOLDER:
                getFOLDER().clear();
                return;
            case PowrmartPackage.REPOSITORY_TYPE__CODEPAGE:
                setCODEPAGE(CODEPAGE_EDEFAULT);
                return;
            case PowrmartPackage.REPOSITORY_TYPE__DATABASETYPE:
                setDATABASETYPE(DATABASETYPE_EDEFAULT);
                return;
            case PowrmartPackage.REPOSITORY_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.REPOSITORY_TYPE__PARENTREPOSITORY:
                setPARENTREPOSITORY(PARENTREPOSITORY_EDEFAULT);
                return;
            case PowrmartPackage.REPOSITORY_TYPE__VERSION:
                setVERSION(VERSION_EDEFAULT);
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
            case PowrmartPackage.REPOSITORY_TYPE__FOLDER:
                return fOLDER != null && !fOLDER.isEmpty();
            case PowrmartPackage.REPOSITORY_TYPE__CODEPAGE:
                return CODEPAGE_EDEFAULT == null ? cODEPAGE != null : !CODEPAGE_EDEFAULT.equals(cODEPAGE);
            case PowrmartPackage.REPOSITORY_TYPE__DATABASETYPE:
                return DATABASETYPE_EDEFAULT == null ? dATABASETYPE != null : !DATABASETYPE_EDEFAULT.equals(dATABASETYPE);
            case PowrmartPackage.REPOSITORY_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.REPOSITORY_TYPE__PARENTREPOSITORY:
                return PARENTREPOSITORY_EDEFAULT == null ? pARENTREPOSITORY != null : !PARENTREPOSITORY_EDEFAULT.equals(pARENTREPOSITORY);
            case PowrmartPackage.REPOSITORY_TYPE__VERSION:
                return VERSION_EDEFAULT == null ? vERSION != null : !VERSION_EDEFAULT.equals(vERSION);
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
        result.append(" (cODEPAGE: ");
        result.append(cODEPAGE);
        result.append(", dATABASETYPE: ");
        result.append(dATABASETYPE);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", pARENTREPOSITORY: ");
        result.append(pARENTREPOSITORY);
        result.append(", vERSION: ");
        result.append(vERSION);
        result.append(')');
        return result.toString();
    }

} //REPOSITORYTypeImpl
