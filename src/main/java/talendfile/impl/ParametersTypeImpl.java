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
import talendfile.ParametersType;
import talendfile.RoutinesParameterType;
import talendfile.TalendfilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talendfile.impl.ParametersTypeImpl#getElementParameter <em>Element Parameter</em>}</li>
 *   <li>{@link talendfile.impl.ParametersTypeImpl#getRoutinesParameter <em>Routines Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametersTypeImpl extends EObjectImpl implements ParametersType {
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
     * The cached value of the '{@link #getRoutinesParameter() <em>Routines Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoutinesParameter()
     * @generated
     * @ordered
     */
    protected EList<RoutinesParameterType> routinesParameter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParametersTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TalendfilePackage.Literals.PARAMETERS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ElementParameterType> getElementParameter() {
        if (elementParameter == null) {
            elementParameter = new EObjectContainmentEList<ElementParameterType>(ElementParameterType.class, this, TalendfilePackage.PARAMETERS_TYPE__ELEMENT_PARAMETER);
        }
        return elementParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RoutinesParameterType> getRoutinesParameter() {
        if (routinesParameter == null) {
            routinesParameter = new EObjectContainmentEList<RoutinesParameterType>(RoutinesParameterType.class, this, TalendfilePackage.PARAMETERS_TYPE__ROUTINES_PARAMETER);
        }
        return routinesParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TalendfilePackage.PARAMETERS_TYPE__ELEMENT_PARAMETER:
                return ((InternalEList<?>)getElementParameter()).basicRemove(otherEnd, msgs);
            case TalendfilePackage.PARAMETERS_TYPE__ROUTINES_PARAMETER:
                return ((InternalEList<?>)getRoutinesParameter()).basicRemove(otherEnd, msgs);
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
            case TalendfilePackage.PARAMETERS_TYPE__ELEMENT_PARAMETER:
                return getElementParameter();
            case TalendfilePackage.PARAMETERS_TYPE__ROUTINES_PARAMETER:
                return getRoutinesParameter();
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
            case TalendfilePackage.PARAMETERS_TYPE__ELEMENT_PARAMETER:
                getElementParameter().clear();
                getElementParameter().addAll((Collection<? extends ElementParameterType>)newValue);
                return;
            case TalendfilePackage.PARAMETERS_TYPE__ROUTINES_PARAMETER:
                getRoutinesParameter().clear();
                getRoutinesParameter().addAll((Collection<? extends RoutinesParameterType>)newValue);
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
            case TalendfilePackage.PARAMETERS_TYPE__ELEMENT_PARAMETER:
                getElementParameter().clear();
                return;
            case TalendfilePackage.PARAMETERS_TYPE__ROUTINES_PARAMETER:
                getRoutinesParameter().clear();
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
            case TalendfilePackage.PARAMETERS_TYPE__ELEMENT_PARAMETER:
                return elementParameter != null && !elementParameter.isEmpty();
            case TalendfilePackage.PARAMETERS_TYPE__ROUTINES_PARAMETER:
                return routinesParameter != null && !routinesParameter.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ParametersTypeImpl
