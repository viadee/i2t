/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile.impl;

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

import talendfile.ContextParameterType;
import talendfile.ContextType;
import talendfile.TalendfilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talendfile.impl.ContextTypeImpl#getContextParameter <em>Context Parameter</em>}</li>
 *   <li>{@link talendfile.impl.ContextTypeImpl#isConfirmationNeeded <em>Confirmation Needed</em>}</li>
 *   <li>{@link talendfile.impl.ContextTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextTypeImpl extends EObjectImpl implements ContextType {
    /**
     * The cached value of the '{@link #getContextParameter() <em>Context Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextParameter()
     * @generated
     * @ordered
     */
    protected EList<ContextParameterType> contextParameter;

    /**
     * The default value of the '{@link #isConfirmationNeeded() <em>Confirmation Needed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConfirmationNeeded()
     * @generated
     * @ordered
     */
    protected static final boolean CONFIRMATION_NEEDED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isConfirmationNeeded() <em>Confirmation Needed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConfirmationNeeded()
     * @generated
     * @ordered
     */
    protected boolean confirmationNeeded = CONFIRMATION_NEEDED_EDEFAULT;

    /**
     * This is true if the Confirmation Needed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean confirmationNeededESet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TalendfilePackage.Literals.CONTEXT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ContextParameterType> getContextParameter() {
        if (contextParameter == null) {
            contextParameter = new EObjectContainmentEList<ContextParameterType>(ContextParameterType.class, this, TalendfilePackage.CONTEXT_TYPE__CONTEXT_PARAMETER);
        }
        return contextParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isConfirmationNeeded() {
        return confirmationNeeded;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfirmationNeeded(boolean newConfirmationNeeded) {
        boolean oldConfirmationNeeded = confirmationNeeded;
        confirmationNeeded = newConfirmationNeeded;
        boolean oldConfirmationNeededESet = confirmationNeededESet;
        confirmationNeededESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.CONTEXT_TYPE__CONFIRMATION_NEEDED, oldConfirmationNeeded, confirmationNeeded, !oldConfirmationNeededESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConfirmationNeeded() {
        boolean oldConfirmationNeeded = confirmationNeeded;
        boolean oldConfirmationNeededESet = confirmationNeededESet;
        confirmationNeeded = CONFIRMATION_NEEDED_EDEFAULT;
        confirmationNeededESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendfilePackage.CONTEXT_TYPE__CONFIRMATION_NEEDED, oldConfirmationNeeded, CONFIRMATION_NEEDED_EDEFAULT, oldConfirmationNeededESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConfirmationNeeded() {
        return confirmationNeededESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.CONTEXT_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TalendfilePackage.CONTEXT_TYPE__CONTEXT_PARAMETER:
                return ((InternalEList<?>)getContextParameter()).basicRemove(otherEnd, msgs);
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
            case TalendfilePackage.CONTEXT_TYPE__CONTEXT_PARAMETER:
                return getContextParameter();
            case TalendfilePackage.CONTEXT_TYPE__CONFIRMATION_NEEDED:
                return isConfirmationNeeded();
            case TalendfilePackage.CONTEXT_TYPE__NAME:
                return getName();
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
            case TalendfilePackage.CONTEXT_TYPE__CONTEXT_PARAMETER:
                getContextParameter().clear();
                getContextParameter().addAll((Collection<? extends ContextParameterType>)newValue);
                return;
            case TalendfilePackage.CONTEXT_TYPE__CONFIRMATION_NEEDED:
                setConfirmationNeeded((Boolean)newValue);
                return;
            case TalendfilePackage.CONTEXT_TYPE__NAME:
                setName((String)newValue);
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
            case TalendfilePackage.CONTEXT_TYPE__CONTEXT_PARAMETER:
                getContextParameter().clear();
                return;
            case TalendfilePackage.CONTEXT_TYPE__CONFIRMATION_NEEDED:
                unsetConfirmationNeeded();
                return;
            case TalendfilePackage.CONTEXT_TYPE__NAME:
                setName(NAME_EDEFAULT);
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
            case TalendfilePackage.CONTEXT_TYPE__CONTEXT_PARAMETER:
                return contextParameter != null && !contextParameter.isEmpty();
            case TalendfilePackage.CONTEXT_TYPE__CONFIRMATION_NEEDED:
                return isSetConfirmationNeeded();
            case TalendfilePackage.CONTEXT_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
        result.append(" (confirmationNeeded: ");
        if (confirmationNeededESet) result.append(confirmationNeeded); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ContextTypeImpl
