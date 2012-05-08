/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import talendfile.ElementParameterType;
import talendfile.SubjobType;
import talendfile.TalendfilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subjob Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talendfile.impl.SubjobTypeImpl#getElementParameter <em>Element Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjobTypeImpl extends EObjectImpl implements SubjobType {
    /**
     * The cached value of the '{@link #getElementParameter() <em>Element Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementParameter()
     * @generated
     * @ordered
     */
    protected EList<ElementParameterType> elementParameter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubjobTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TalendfilePackage.Literals.SUBJOB_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ElementParameterType> getElementParameter() {
        if (elementParameter == null) {
            elementParameter = new EObjectContainmentEList<ElementParameterType>(ElementParameterType.class, this, TalendfilePackage.SUBJOB_TYPE__ELEMENT_PARAMETER);
        }
        return elementParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TalendfilePackage.SUBJOB_TYPE__ELEMENT_PARAMETER:
                return ((InternalEList<?>)getElementParameter()).basicRemove(otherEnd, msgs);
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
            case TalendfilePackage.SUBJOB_TYPE__ELEMENT_PARAMETER:
                return getElementParameter();
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
            case TalendfilePackage.SUBJOB_TYPE__ELEMENT_PARAMETER:
                getElementParameter().clear();
                getElementParameter().addAll((Collection<? extends ElementParameterType>)newValue);
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
            case TalendfilePackage.SUBJOB_TYPE__ELEMENT_PARAMETER:
                getElementParameter().clear();
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
            case TalendfilePackage.SUBJOB_TYPE__ELEMENT_PARAMETER:
                return elementParameter != null && !elementParameter.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SubjobTypeImpl
