/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ERPINFOType;
import Powrmart.PowrmartPackage;
import Powrmart.SAPFUNCTIONType;
import Powrmart.SAPOUTPUTPORTType;
import Powrmart.SAPPROGRAMFLOWOBJECTType;
import Powrmart.SAPPROGRAMType;
import Powrmart.SAPSTRUCTUREType;
import Powrmart.SAPVARIABLEType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERPINFO Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.ERPINFOTypeImpl#getSAPFUNCTION <em>SAPFUNCTION</em>}</li>
 *   <li>{@link Powrmart.impl.ERPINFOTypeImpl#getSAPSTRUCTURE <em>SAPSTRUCTURE</em>}</li>
 *   <li>{@link Powrmart.impl.ERPINFOTypeImpl#getSAPPROGRAM <em>SAPPROGRAM</em>}</li>
 *   <li>{@link Powrmart.impl.ERPINFOTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Powrmart.impl.ERPINFOTypeImpl#getSAPOUTPUTPORT <em>SAPOUTPUTPORT</em>}</li>
 *   <li>{@link Powrmart.impl.ERPINFOTypeImpl#getSAPVARIABLE <em>SAPVARIABLE</em>}</li>
 *   <li>{@link Powrmart.impl.ERPINFOTypeImpl#getSAPPROGRAMFLOWOBJECT <em>SAPPROGRAMFLOWOBJECT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERPINFOTypeImpl extends EObjectImpl implements ERPINFOType {
    /**
     * The cached value of the '{@link #getSAPFUNCTION() <em>SAPFUNCTION</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAPFUNCTION()
     * @generated
     * @ordered
     */
    protected EList<SAPFUNCTIONType> sAPFUNCTION;

    /**
     * The cached value of the '{@link #getSAPSTRUCTURE() <em>SAPSTRUCTURE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAPSTRUCTURE()
     * @generated
     * @ordered
     */
    protected EList<SAPSTRUCTUREType> sAPSTRUCTURE;

    /**
     * The cached value of the '{@link #getSAPPROGRAM() <em>SAPPROGRAM</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAPPROGRAM()
     * @generated
     * @ordered
     */
    protected EList<SAPPROGRAMType> sAPPROGRAM;

    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap group;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ERPINFOTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getERPINFOType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SAPFUNCTIONType> getSAPFUNCTION() {
        if (sAPFUNCTION == null) {
            sAPFUNCTION = new EObjectContainmentEList<SAPFUNCTIONType>(SAPFUNCTIONType.class, this, PowrmartPackage.ERPINFO_TYPE__SAPFUNCTION);
        }
        return sAPFUNCTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SAPSTRUCTUREType> getSAPSTRUCTURE() {
        if (sAPSTRUCTURE == null) {
            sAPSTRUCTURE = new EObjectContainmentEList<SAPSTRUCTUREType>(SAPSTRUCTUREType.class, this, PowrmartPackage.ERPINFO_TYPE__SAPSTRUCTURE);
        }
        return sAPSTRUCTURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SAPPROGRAMType> getSAPPROGRAM() {
        if (sAPPROGRAM == null) {
            sAPPROGRAM = new EObjectContainmentEList<SAPPROGRAMType>(SAPPROGRAMType.class, this, PowrmartPackage.ERPINFO_TYPE__SAPPROGRAM);
        }
        return sAPPROGRAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, PowrmartPackage.ERPINFO_TYPE__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SAPOUTPUTPORTType> getSAPOUTPUTPORT() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getERPINFOType_SAPOUTPUTPORT());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SAPVARIABLEType> getSAPVARIABLE() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getERPINFOType_SAPVARIABLE());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SAPPROGRAMFLOWOBJECTType> getSAPPROGRAMFLOWOBJECT() {
        return getGroup().list(PowrmartPackage.eINSTANCE.getERPINFOType_SAPPROGRAMFLOWOBJECT());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.ERPINFO_TYPE__SAPFUNCTION:
                return ((InternalEList<?>)getSAPFUNCTION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.ERPINFO_TYPE__SAPSTRUCTURE:
                return ((InternalEList<?>)getSAPSTRUCTURE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.ERPINFO_TYPE__SAPPROGRAM:
                return ((InternalEList<?>)getSAPPROGRAM()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.ERPINFO_TYPE__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.ERPINFO_TYPE__SAPOUTPUTPORT:
                return ((InternalEList<?>)getSAPOUTPUTPORT()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.ERPINFO_TYPE__SAPVARIABLE:
                return ((InternalEList<?>)getSAPVARIABLE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.ERPINFO_TYPE__SAPPROGRAMFLOWOBJECT:
                return ((InternalEList<?>)getSAPPROGRAMFLOWOBJECT()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.ERPINFO_TYPE__SAPFUNCTION:
                return getSAPFUNCTION();
            case PowrmartPackage.ERPINFO_TYPE__SAPSTRUCTURE:
                return getSAPSTRUCTURE();
            case PowrmartPackage.ERPINFO_TYPE__SAPPROGRAM:
                return getSAPPROGRAM();
            case PowrmartPackage.ERPINFO_TYPE__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case PowrmartPackage.ERPINFO_TYPE__SAPOUTPUTPORT:
                return getSAPOUTPUTPORT();
            case PowrmartPackage.ERPINFO_TYPE__SAPVARIABLE:
                return getSAPVARIABLE();
            case PowrmartPackage.ERPINFO_TYPE__SAPPROGRAMFLOWOBJECT:
                return getSAPPROGRAMFLOWOBJECT();
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
            case PowrmartPackage.ERPINFO_TYPE__SAPFUNCTION:
                getSAPFUNCTION().clear();
                getSAPFUNCTION().addAll((Collection<? extends SAPFUNCTIONType>)newValue);
                return;
            case PowrmartPackage.ERPINFO_TYPE__SAPSTRUCTURE:
                getSAPSTRUCTURE().clear();
                getSAPSTRUCTURE().addAll((Collection<? extends SAPSTRUCTUREType>)newValue);
                return;
            case PowrmartPackage.ERPINFO_TYPE__SAPPROGRAM:
                getSAPPROGRAM().clear();
                getSAPPROGRAM().addAll((Collection<? extends SAPPROGRAMType>)newValue);
                return;
            case PowrmartPackage.ERPINFO_TYPE__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case PowrmartPackage.ERPINFO_TYPE__SAPOUTPUTPORT:
                getSAPOUTPUTPORT().clear();
                getSAPOUTPUTPORT().addAll((Collection<? extends SAPOUTPUTPORTType>)newValue);
                return;
            case PowrmartPackage.ERPINFO_TYPE__SAPVARIABLE:
                getSAPVARIABLE().clear();
                getSAPVARIABLE().addAll((Collection<? extends SAPVARIABLEType>)newValue);
                return;
            case PowrmartPackage.ERPINFO_TYPE__SAPPROGRAMFLOWOBJECT:
                getSAPPROGRAMFLOWOBJECT().clear();
                getSAPPROGRAMFLOWOBJECT().addAll((Collection<? extends SAPPROGRAMFLOWOBJECTType>)newValue);
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
            case PowrmartPackage.ERPINFO_TYPE__SAPFUNCTION:
                getSAPFUNCTION().clear();
                return;
            case PowrmartPackage.ERPINFO_TYPE__SAPSTRUCTURE:
                getSAPSTRUCTURE().clear();
                return;
            case PowrmartPackage.ERPINFO_TYPE__SAPPROGRAM:
                getSAPPROGRAM().clear();
                return;
            case PowrmartPackage.ERPINFO_TYPE__GROUP:
                getGroup().clear();
                return;
            case PowrmartPackage.ERPINFO_TYPE__SAPOUTPUTPORT:
                getSAPOUTPUTPORT().clear();
                return;
            case PowrmartPackage.ERPINFO_TYPE__SAPVARIABLE:
                getSAPVARIABLE().clear();
                return;
            case PowrmartPackage.ERPINFO_TYPE__SAPPROGRAMFLOWOBJECT:
                getSAPPROGRAMFLOWOBJECT().clear();
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
            case PowrmartPackage.ERPINFO_TYPE__SAPFUNCTION:
                return sAPFUNCTION != null && !sAPFUNCTION.isEmpty();
            case PowrmartPackage.ERPINFO_TYPE__SAPSTRUCTURE:
                return sAPSTRUCTURE != null && !sAPSTRUCTURE.isEmpty();
            case PowrmartPackage.ERPINFO_TYPE__SAPPROGRAM:
                return sAPPROGRAM != null && !sAPPROGRAM.isEmpty();
            case PowrmartPackage.ERPINFO_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case PowrmartPackage.ERPINFO_TYPE__SAPOUTPUTPORT:
                return !getSAPOUTPUTPORT().isEmpty();
            case PowrmartPackage.ERPINFO_TYPE__SAPVARIABLE:
                return !getSAPVARIABLE().isEmpty();
            case PowrmartPackage.ERPINFO_TYPE__SAPPROGRAMFLOWOBJECT:
                return !getSAPPROGRAMFLOWOBJECT().isEmpty();
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
        result.append(" (group: ");
        result.append(group);
        result.append(')');
        return result.toString();
    }

} //ERPINFOTypeImpl
