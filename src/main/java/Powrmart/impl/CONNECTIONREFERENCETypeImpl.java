/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ATTRIBUTEType;
import Powrmart.CONNECTIONREFERENCEType;
import Powrmart.PowrmartPackage;

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
 * An implementation of the model object '<em><b>CONNECTIONREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.CONNECTIONREFERENCETypeImpl#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.CONNECTIONREFERENCETypeImpl#getCNXREFNAME <em>CNXREFNAME</em>}</li>
 *   <li>{@link Powrmart.impl.CONNECTIONREFERENCETypeImpl#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.CONNECTIONREFERENCETypeImpl#getCONNECTIONNAME <em>CONNECTIONNAME</em>}</li>
 *   <li>{@link Powrmart.impl.CONNECTIONREFERENCETypeImpl#getCONNECTIONNUMBER <em>CONNECTIONNUMBER</em>}</li>
 *   <li>{@link Powrmart.impl.CONNECTIONREFERENCETypeImpl#getCONNECTIONSUBTYPE <em>CONNECTIONSUBTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.CONNECTIONREFERENCETypeImpl#getCONNECTIONTYPE <em>CONNECTIONTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.CONNECTIONREFERENCETypeImpl#getPARTITIONNAME <em>PARTITIONNAME</em>}</li>
 *   <li>{@link Powrmart.impl.CONNECTIONREFERENCETypeImpl#getVARIABLE <em>VARIABLE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CONNECTIONREFERENCETypeImpl extends EObjectImpl implements CONNECTIONREFERENCEType {
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
     * The default value of the '{@link #getCNXREFNAME() <em>CNXREFNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCNXREFNAME()
     * @generated
     * @ordered
     */
    protected static final Object CNXREFNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCNXREFNAME() <em>CNXREFNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCNXREFNAME()
     * @generated
     * @ordered
     */
    protected Object cNXREFNAME = CNXREFNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getCOMPONENTVERSION() <em>COMPONENTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMPONENTVERSION()
     * @generated
     * @ordered
     */
    protected static final Object COMPONENTVERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCOMPONENTVERSION() <em>COMPONENTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMPONENTVERSION()
     * @generated
     * @ordered
     */
    protected Object cOMPONENTVERSION = COMPONENTVERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getCONNECTIONNAME() <em>CONNECTIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTIONNAME()
     * @generated
     * @ordered
     */
    protected static final Object CONNECTIONNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCONNECTIONNAME() <em>CONNECTIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTIONNAME()
     * @generated
     * @ordered
     */
    protected Object cONNECTIONNAME = CONNECTIONNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getCONNECTIONNUMBER() <em>CONNECTIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTIONNUMBER()
     * @generated
     * @ordered
     */
    protected static final Object CONNECTIONNUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCONNECTIONNUMBER() <em>CONNECTIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTIONNUMBER()
     * @generated
     * @ordered
     */
    protected Object cONNECTIONNUMBER = CONNECTIONNUMBER_EDEFAULT;

    /**
     * The default value of the '{@link #getCONNECTIONSUBTYPE() <em>CONNECTIONSUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTIONSUBTYPE()
     * @generated
     * @ordered
     */
    protected static final Object CONNECTIONSUBTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCONNECTIONSUBTYPE() <em>CONNECTIONSUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTIONSUBTYPE()
     * @generated
     * @ordered
     */
    protected Object cONNECTIONSUBTYPE = CONNECTIONSUBTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getCONNECTIONTYPE() <em>CONNECTIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTIONTYPE()
     * @generated
     * @ordered
     */
    protected static final Object CONNECTIONTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCONNECTIONTYPE() <em>CONNECTIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTIONTYPE()
     * @generated
     * @ordered
     */
    protected Object cONNECTIONTYPE = CONNECTIONTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getPARTITIONNAME() <em>PARTITIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARTITIONNAME()
     * @generated
     * @ordered
     */
    protected static final Object PARTITIONNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPARTITIONNAME() <em>PARTITIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARTITIONNAME()
     * @generated
     * @ordered
     */
    protected Object pARTITIONNAME = PARTITIONNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getVARIABLE() <em>VARIABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVARIABLE()
     * @generated
     * @ordered
     */
    protected static final Object VARIABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVARIABLE() <em>VARIABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVARIABLE()
     * @generated
     * @ordered
     */
    protected Object vARIABLE = VARIABLE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CONNECTIONREFERENCETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getCONNECTIONREFERENCEType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ATTRIBUTEType> getATTRIBUTE() {
        if (aTTRIBUTE == null) {
            aTTRIBUTE = new EObjectContainmentEList<ATTRIBUTEType>(ATTRIBUTEType.class, this, PowrmartPackage.CONNECTIONREFERENCE_TYPE__ATTRIBUTE);
        }
        return aTTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCNXREFNAME() {
        return cNXREFNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCNXREFNAME(Object newCNXREFNAME) {
        Object oldCNXREFNAME = cNXREFNAME;
        cNXREFNAME = newCNXREFNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTIONREFERENCE_TYPE__CNXREFNAME, oldCNXREFNAME, cNXREFNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCOMPONENTVERSION() {
        return cOMPONENTVERSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCOMPONENTVERSION(Object newCOMPONENTVERSION) {
        Object oldCOMPONENTVERSION = cOMPONENTVERSION;
        cOMPONENTVERSION = newCOMPONENTVERSION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTIONREFERENCE_TYPE__COMPONENTVERSION, oldCOMPONENTVERSION, cOMPONENTVERSION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCONNECTIONNAME() {
        return cONNECTIONNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONNECTIONNAME(Object newCONNECTIONNAME) {
        Object oldCONNECTIONNAME = cONNECTIONNAME;
        cONNECTIONNAME = newCONNECTIONNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONNAME, oldCONNECTIONNAME, cONNECTIONNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCONNECTIONNUMBER() {
        return cONNECTIONNUMBER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONNECTIONNUMBER(Object newCONNECTIONNUMBER) {
        Object oldCONNECTIONNUMBER = cONNECTIONNUMBER;
        cONNECTIONNUMBER = newCONNECTIONNUMBER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONNUMBER, oldCONNECTIONNUMBER, cONNECTIONNUMBER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCONNECTIONSUBTYPE() {
        return cONNECTIONSUBTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONNECTIONSUBTYPE(Object newCONNECTIONSUBTYPE) {
        Object oldCONNECTIONSUBTYPE = cONNECTIONSUBTYPE;
        cONNECTIONSUBTYPE = newCONNECTIONSUBTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONSUBTYPE, oldCONNECTIONSUBTYPE, cONNECTIONSUBTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCONNECTIONTYPE() {
        return cONNECTIONTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONNECTIONTYPE(Object newCONNECTIONTYPE) {
        Object oldCONNECTIONTYPE = cONNECTIONTYPE;
        cONNECTIONTYPE = newCONNECTIONTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONTYPE, oldCONNECTIONTYPE, cONNECTIONTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPARTITIONNAME() {
        return pARTITIONNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARTITIONNAME(Object newPARTITIONNAME) {
        Object oldPARTITIONNAME = pARTITIONNAME;
        pARTITIONNAME = newPARTITIONNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTIONREFERENCE_TYPE__PARTITIONNAME, oldPARTITIONNAME, pARTITIONNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getVARIABLE() {
        return vARIABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVARIABLE(Object newVARIABLE) {
        Object oldVARIABLE = vARIABLE;
        vARIABLE = newVARIABLE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONNECTIONREFERENCE_TYPE__VARIABLE, oldVARIABLE, vARIABLE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__ATTRIBUTE:
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
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__ATTRIBUTE:
                return getATTRIBUTE();
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CNXREFNAME:
                return getCNXREFNAME();
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__COMPONENTVERSION:
                return getCOMPONENTVERSION();
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONNAME:
                return getCONNECTIONNAME();
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONNUMBER:
                return getCONNECTIONNUMBER();
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONSUBTYPE:
                return getCONNECTIONSUBTYPE();
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONTYPE:
                return getCONNECTIONTYPE();
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__PARTITIONNAME:
                return getPARTITIONNAME();
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__VARIABLE:
                return getVARIABLE();
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
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                getATTRIBUTE().addAll((Collection<? extends ATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CNXREFNAME:
                setCNXREFNAME(newValue);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__COMPONENTVERSION:
                setCOMPONENTVERSION(newValue);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONNAME:
                setCONNECTIONNAME(newValue);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONNUMBER:
                setCONNECTIONNUMBER(newValue);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONSUBTYPE:
                setCONNECTIONSUBTYPE(newValue);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONTYPE:
                setCONNECTIONTYPE(newValue);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__PARTITIONNAME:
                setPARTITIONNAME(newValue);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__VARIABLE:
                setVARIABLE(newValue);
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
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CNXREFNAME:
                setCNXREFNAME(CNXREFNAME_EDEFAULT);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__COMPONENTVERSION:
                setCOMPONENTVERSION(COMPONENTVERSION_EDEFAULT);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONNAME:
                setCONNECTIONNAME(CONNECTIONNAME_EDEFAULT);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONNUMBER:
                setCONNECTIONNUMBER(CONNECTIONNUMBER_EDEFAULT);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONSUBTYPE:
                setCONNECTIONSUBTYPE(CONNECTIONSUBTYPE_EDEFAULT);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONTYPE:
                setCONNECTIONTYPE(CONNECTIONTYPE_EDEFAULT);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__PARTITIONNAME:
                setPARTITIONNAME(PARTITIONNAME_EDEFAULT);
                return;
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__VARIABLE:
                setVARIABLE(VARIABLE_EDEFAULT);
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
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__ATTRIBUTE:
                return aTTRIBUTE != null && !aTTRIBUTE.isEmpty();
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CNXREFNAME:
                return CNXREFNAME_EDEFAULT == null ? cNXREFNAME != null : !CNXREFNAME_EDEFAULT.equals(cNXREFNAME);
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__COMPONENTVERSION:
                return COMPONENTVERSION_EDEFAULT == null ? cOMPONENTVERSION != null : !COMPONENTVERSION_EDEFAULT.equals(cOMPONENTVERSION);
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONNAME:
                return CONNECTIONNAME_EDEFAULT == null ? cONNECTIONNAME != null : !CONNECTIONNAME_EDEFAULT.equals(cONNECTIONNAME);
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONNUMBER:
                return CONNECTIONNUMBER_EDEFAULT == null ? cONNECTIONNUMBER != null : !CONNECTIONNUMBER_EDEFAULT.equals(cONNECTIONNUMBER);
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONSUBTYPE:
                return CONNECTIONSUBTYPE_EDEFAULT == null ? cONNECTIONSUBTYPE != null : !CONNECTIONSUBTYPE_EDEFAULT.equals(cONNECTIONSUBTYPE);
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__CONNECTIONTYPE:
                return CONNECTIONTYPE_EDEFAULT == null ? cONNECTIONTYPE != null : !CONNECTIONTYPE_EDEFAULT.equals(cONNECTIONTYPE);
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__PARTITIONNAME:
                return PARTITIONNAME_EDEFAULT == null ? pARTITIONNAME != null : !PARTITIONNAME_EDEFAULT.equals(pARTITIONNAME);
            case PowrmartPackage.CONNECTIONREFERENCE_TYPE__VARIABLE:
                return VARIABLE_EDEFAULT == null ? vARIABLE != null : !VARIABLE_EDEFAULT.equals(vARIABLE);
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
        result.append(" (cNXREFNAME: ");
        result.append(cNXREFNAME);
        result.append(", cOMPONENTVERSION: ");
        result.append(cOMPONENTVERSION);
        result.append(", cONNECTIONNAME: ");
        result.append(cONNECTIONNAME);
        result.append(", cONNECTIONNUMBER: ");
        result.append(cONNECTIONNUMBER);
        result.append(", cONNECTIONSUBTYPE: ");
        result.append(cONNECTIONSUBTYPE);
        result.append(", cONNECTIONTYPE: ");
        result.append(cONNECTIONTYPE);
        result.append(", pARTITIONNAME: ");
        result.append(pARTITIONNAME);
        result.append(", vARIABLE: ");
        result.append(vARIABLE);
        result.append(')');
        return result.toString();
    }

} //CONNECTIONREFERENCETypeImpl
