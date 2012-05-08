/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SAPFUNCINSTANCEPARAMType;
import Powrmart.SAPFUNCTIONINSTANCEType;
import Powrmart.SAPTABLEINSTANCEPARAMType;

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
 * An implementation of the model object '<em><b>SAPFUNCTIONINSTANCE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SAPFUNCTIONINSTANCETypeImpl#getSAPFUNCINSTANCEPARAM <em>SAPFUNCINSTANCEPARAM</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCTIONINSTANCETypeImpl#getSAPTABLEINSTANCEPARAM <em>SAPTABLEINSTANCEPARAM</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCTIONINSTANCETypeImpl#getDSQINSTNAME <em>DSQINSTNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPFUNCTIONINSTANCETypeImpl#getFUNCTIONNAME <em>FUNCTIONNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPFUNCTIONINSTANCETypeImpl extends EObjectImpl implements SAPFUNCTIONINSTANCEType {
    /**
     * The cached value of the '{@link #getSAPFUNCINSTANCEPARAM() <em>SAPFUNCINSTANCEPARAM</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAPFUNCINSTANCEPARAM()
     * @generated
     * @ordered
     */
    protected EList<SAPFUNCINSTANCEPARAMType> sAPFUNCINSTANCEPARAM;

    /**
     * The cached value of the '{@link #getSAPTABLEINSTANCEPARAM() <em>SAPTABLEINSTANCEPARAM</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAPTABLEINSTANCEPARAM()
     * @generated
     * @ordered
     */
    protected EList<SAPTABLEINSTANCEPARAMType> sAPTABLEINSTANCEPARAM;

    /**
     * The default value of the '{@link #getDSQINSTNAME() <em>DSQINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDSQINSTNAME()
     * @generated
     * @ordered
     */
    protected static final Object DSQINSTNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDSQINSTNAME() <em>DSQINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDSQINSTNAME()
     * @generated
     * @ordered
     */
    protected Object dSQINSTNAME = DSQINSTNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFUNCTIONNAME() <em>FUNCTIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFUNCTIONNAME()
     * @generated
     * @ordered
     */
    protected static final Object FUNCTIONNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFUNCTIONNAME() <em>FUNCTIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFUNCTIONNAME()
     * @generated
     * @ordered
     */
    protected Object fUNCTIONNAME = FUNCTIONNAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPFUNCTIONINSTANCETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSAPFUNCTIONINSTANCEType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SAPFUNCINSTANCEPARAMType> getSAPFUNCINSTANCEPARAM() {
        if (sAPFUNCINSTANCEPARAM == null) {
            sAPFUNCINSTANCEPARAM = new EObjectContainmentEList<SAPFUNCINSTANCEPARAMType>(SAPFUNCINSTANCEPARAMType.class, this, PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__SAPFUNCINSTANCEPARAM);
        }
        return sAPFUNCINSTANCEPARAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SAPTABLEINSTANCEPARAMType> getSAPTABLEINSTANCEPARAM() {
        if (sAPTABLEINSTANCEPARAM == null) {
            sAPTABLEINSTANCEPARAM = new EObjectContainmentEList<SAPTABLEINSTANCEPARAMType>(SAPTABLEINSTANCEPARAMType.class, this, PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__SAPTABLEINSTANCEPARAM);
        }
        return sAPTABLEINSTANCEPARAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDSQINSTNAME() {
        return dSQINSTNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDSQINSTNAME(Object newDSQINSTNAME) {
        Object oldDSQINSTNAME = dSQINSTNAME;
        dSQINSTNAME = newDSQINSTNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__DSQINSTNAME, oldDSQINSTNAME, dSQINSTNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFUNCTIONNAME() {
        return fUNCTIONNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFUNCTIONNAME(Object newFUNCTIONNAME) {
        Object oldFUNCTIONNAME = fUNCTIONNAME;
        fUNCTIONNAME = newFUNCTIONNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__FUNCTIONNAME, oldFUNCTIONNAME, fUNCTIONNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__SAPFUNCINSTANCEPARAM:
                return ((InternalEList<?>)getSAPFUNCINSTANCEPARAM()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__SAPTABLEINSTANCEPARAM:
                return ((InternalEList<?>)getSAPTABLEINSTANCEPARAM()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__SAPFUNCINSTANCEPARAM:
                return getSAPFUNCINSTANCEPARAM();
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__SAPTABLEINSTANCEPARAM:
                return getSAPTABLEINSTANCEPARAM();
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__DSQINSTNAME:
                return getDSQINSTNAME();
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__FUNCTIONNAME:
                return getFUNCTIONNAME();
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
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__SAPFUNCINSTANCEPARAM:
                getSAPFUNCINSTANCEPARAM().clear();
                getSAPFUNCINSTANCEPARAM().addAll((Collection<? extends SAPFUNCINSTANCEPARAMType>)newValue);
                return;
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__SAPTABLEINSTANCEPARAM:
                getSAPTABLEINSTANCEPARAM().clear();
                getSAPTABLEINSTANCEPARAM().addAll((Collection<? extends SAPTABLEINSTANCEPARAMType>)newValue);
                return;
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__DSQINSTNAME:
                setDSQINSTNAME(newValue);
                return;
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__FUNCTIONNAME:
                setFUNCTIONNAME(newValue);
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
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__SAPFUNCINSTANCEPARAM:
                getSAPFUNCINSTANCEPARAM().clear();
                return;
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__SAPTABLEINSTANCEPARAM:
                getSAPTABLEINSTANCEPARAM().clear();
                return;
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__DSQINSTNAME:
                setDSQINSTNAME(DSQINSTNAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__FUNCTIONNAME:
                setFUNCTIONNAME(FUNCTIONNAME_EDEFAULT);
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
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__SAPFUNCINSTANCEPARAM:
                return sAPFUNCINSTANCEPARAM != null && !sAPFUNCINSTANCEPARAM.isEmpty();
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__SAPTABLEINSTANCEPARAM:
                return sAPTABLEINSTANCEPARAM != null && !sAPTABLEINSTANCEPARAM.isEmpty();
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__DSQINSTNAME:
                return DSQINSTNAME_EDEFAULT == null ? dSQINSTNAME != null : !DSQINSTNAME_EDEFAULT.equals(dSQINSTNAME);
            case PowrmartPackage.SAPFUNCTIONINSTANCE_TYPE__FUNCTIONNAME:
                return FUNCTIONNAME_EDEFAULT == null ? fUNCTIONNAME != null : !FUNCTIONNAME_EDEFAULT.equals(fUNCTIONNAME);
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
        result.append(" (dSQINSTNAME: ");
        result.append(dSQINSTNAME);
        result.append(", fUNCTIONNAME: ");
        result.append(fUNCTIONNAME);
        result.append(')');
        return result.toString();
    }

} //SAPFUNCTIONINSTANCETypeImpl
