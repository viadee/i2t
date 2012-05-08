/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.TYPEType;
import Powrmart.XMLTEXTType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMLTEXT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.XMLTEXTTypeImpl#getNAMESPACE <em>NAMESPACE</em>}</li>
 *   <li>{@link Powrmart.impl.XMLTEXTTypeImpl#getTEXT <em>TEXT</em>}</li>
 *   <li>{@link Powrmart.impl.XMLTEXTTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLTEXTTypeImpl extends EObjectImpl implements XMLTEXTType {
    /**
     * The default value of the '{@link #getNAMESPACE() <em>NAMESPACE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAMESPACE()
     * @generated
     * @ordered
     */
    protected static final Object NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNAMESPACE() <em>NAMESPACE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAMESPACE()
     * @generated
     * @ordered
     */
    protected Object nAMESPACE = NAMESPACE_EDEFAULT;

    /**
     * The default value of the '{@link #getTEXT() <em>TEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTEXT()
     * @generated
     * @ordered
     */
    protected static final Object TEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTEXT() <em>TEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTEXT()
     * @generated
     * @ordered
     */
    protected Object tEXT = TEXT_EDEFAULT;

    /**
     * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected static final TYPEType TYPE_EDEFAULT = TYPEType.SCHEMA;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected TYPEType tYPE = TYPE_EDEFAULT;

    /**
     * This is true if the TYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tYPEESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XMLTEXTTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getXMLTEXTType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getNAMESPACE() {
        return nAMESPACE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNAMESPACE(Object newNAMESPACE) {
        Object oldNAMESPACE = nAMESPACE;
        nAMESPACE = newNAMESPACE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.XMLTEXT_TYPE__NAMESPACE, oldNAMESPACE, nAMESPACE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTEXT() {
        return tEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTEXT(Object newTEXT) {
        Object oldTEXT = tEXT;
        tEXT = newTEXT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.XMLTEXT_TYPE__TEXT, oldTEXT, tEXT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTYPE(TYPEType newTYPE) {
        TYPEType oldTYPE = tYPE;
        tYPE = newTYPE == null ? TYPE_EDEFAULT : newTYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.XMLTEXT_TYPE__TYPE, oldTYPE, tYPE, !oldTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTYPE() {
        TYPEType oldTYPE = tYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPE = TYPE_EDEFAULT;
        tYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.XMLTEXT_TYPE__TYPE, oldTYPE, TYPE_EDEFAULT, oldTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTYPE() {
        return tYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.XMLTEXT_TYPE__NAMESPACE:
                return getNAMESPACE();
            case PowrmartPackage.XMLTEXT_TYPE__TEXT:
                return getTEXT();
            case PowrmartPackage.XMLTEXT_TYPE__TYPE:
                return getTYPE();
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
            case PowrmartPackage.XMLTEXT_TYPE__NAMESPACE:
                setNAMESPACE(newValue);
                return;
            case PowrmartPackage.XMLTEXT_TYPE__TEXT:
                setTEXT(newValue);
                return;
            case PowrmartPackage.XMLTEXT_TYPE__TYPE:
                setTYPE((TYPEType)newValue);
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
            case PowrmartPackage.XMLTEXT_TYPE__NAMESPACE:
                setNAMESPACE(NAMESPACE_EDEFAULT);
                return;
            case PowrmartPackage.XMLTEXT_TYPE__TEXT:
                setTEXT(TEXT_EDEFAULT);
                return;
            case PowrmartPackage.XMLTEXT_TYPE__TYPE:
                unsetTYPE();
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
            case PowrmartPackage.XMLTEXT_TYPE__NAMESPACE:
                return NAMESPACE_EDEFAULT == null ? nAMESPACE != null : !NAMESPACE_EDEFAULT.equals(nAMESPACE);
            case PowrmartPackage.XMLTEXT_TYPE__TEXT:
                return TEXT_EDEFAULT == null ? tEXT != null : !TEXT_EDEFAULT.equals(tEXT);
            case PowrmartPackage.XMLTEXT_TYPE__TYPE:
                return isSetTYPE();
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
        result.append(" (nAMESPACE: ");
        result.append(nAMESPACE);
        result.append(", tEXT: ");
        result.append(tEXT);
        result.append(", tYPE: ");
        if (tYPEESet) result.append(tYPE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //XMLTEXTTypeImpl
