/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SEBLJOINType;
import Powrmart.SEBLLINKType;
import Powrmart.SEBLMVLINKRELType;
import Powrmart.SEBLMVLINKType;
import Powrmart.SEBLSRCINFOType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SEBLSRCINFO Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SEBLSRCINFOTypeImpl#getSEBLJOIN <em>SEBLJOIN</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLSRCINFOTypeImpl#getSEBLLINK <em>SEBLLINK</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLSRCINFOTypeImpl#getSEBLMVLINK <em>SEBLMVLINK</em>}</li>
 *   <li>{@link Powrmart.impl.SEBLSRCINFOTypeImpl#getSEBLMVLINKREL <em>SEBLMVLINKREL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SEBLSRCINFOTypeImpl extends EObjectImpl implements SEBLSRCINFOType {
    /**
     * The cached value of the '{@link #getSEBLJOIN() <em>SEBLJOIN</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSEBLJOIN()
     * @generated
     * @ordered
     */
    protected EList<SEBLJOINType> sEBLJOIN;

    /**
     * The cached value of the '{@link #getSEBLLINK() <em>SEBLLINK</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSEBLLINK()
     * @generated
     * @ordered
     */
    protected EList<SEBLLINKType> sEBLLINK;

    /**
     * The cached value of the '{@link #getSEBLMVLINK() <em>SEBLMVLINK</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSEBLMVLINK()
     * @generated
     * @ordered
     */
    protected EList<SEBLMVLINKType> sEBLMVLINK;

    /**
     * The cached value of the '{@link #getSEBLMVLINKREL() <em>SEBLMVLINKREL</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSEBLMVLINKREL()
     * @generated
     * @ordered
     */
    protected EList<SEBLMVLINKRELType> sEBLMVLINKREL;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SEBLSRCINFOTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSEBLSRCINFOType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SEBLJOINType> getSEBLJOIN() {
        if (sEBLJOIN == null) {
            sEBLJOIN = new EObjectContainmentEList<SEBLJOINType>(SEBLJOINType.class, this, PowrmartPackage.SEBLSRCINFO_TYPE__SEBLJOIN);
        }
        return sEBLJOIN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SEBLLINKType> getSEBLLINK() {
        if (sEBLLINK == null) {
            sEBLLINK = new EObjectContainmentEList<SEBLLINKType>(SEBLLINKType.class, this, PowrmartPackage.SEBLSRCINFO_TYPE__SEBLLINK);
        }
        return sEBLLINK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SEBLMVLINKType> getSEBLMVLINK() {
        if (sEBLMVLINK == null) {
            sEBLMVLINK = new EObjectContainmentEList<SEBLMVLINKType>(SEBLMVLINKType.class, this, PowrmartPackage.SEBLSRCINFO_TYPE__SEBLMVLINK);
        }
        return sEBLMVLINK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SEBLMVLINKRELType> getSEBLMVLINKREL() {
        if (sEBLMVLINKREL == null) {
            sEBLMVLINKREL = new EObjectContainmentEList<SEBLMVLINKRELType>(SEBLMVLINKRELType.class, this, PowrmartPackage.SEBLSRCINFO_TYPE__SEBLMVLINKREL);
        }
        return sEBLMVLINKREL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLJOIN:
                return ((InternalEList<?>)getSEBLJOIN()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLLINK:
                return ((InternalEList<?>)getSEBLLINK()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLMVLINK:
                return ((InternalEList<?>)getSEBLMVLINK()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLMVLINKREL:
                return ((InternalEList<?>)getSEBLMVLINKREL()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLJOIN:
                return getSEBLJOIN();
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLLINK:
                return getSEBLLINK();
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLMVLINK:
                return getSEBLMVLINK();
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLMVLINKREL:
                return getSEBLMVLINKREL();
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
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLJOIN:
                getSEBLJOIN().clear();
                getSEBLJOIN().addAll((Collection<? extends SEBLJOINType>)newValue);
                return;
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLLINK:
                getSEBLLINK().clear();
                getSEBLLINK().addAll((Collection<? extends SEBLLINKType>)newValue);
                return;
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLMVLINK:
                getSEBLMVLINK().clear();
                getSEBLMVLINK().addAll((Collection<? extends SEBLMVLINKType>)newValue);
                return;
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLMVLINKREL:
                getSEBLMVLINKREL().clear();
                getSEBLMVLINKREL().addAll((Collection<? extends SEBLMVLINKRELType>)newValue);
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
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLJOIN:
                getSEBLJOIN().clear();
                return;
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLLINK:
                getSEBLLINK().clear();
                return;
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLMVLINK:
                getSEBLMVLINK().clear();
                return;
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLMVLINKREL:
                getSEBLMVLINKREL().clear();
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
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLJOIN:
                return sEBLJOIN != null && !sEBLJOIN.isEmpty();
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLLINK:
                return sEBLLINK != null && !sEBLLINK.isEmpty();
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLMVLINK:
                return sEBLMVLINK != null && !sEBLMVLINK.isEmpty();
            case PowrmartPackage.SEBLSRCINFO_TYPE__SEBLMVLINKREL:
                return sEBLMVLINKREL != null && !sEBLMVLINKREL.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SEBLSRCINFOTypeImpl
