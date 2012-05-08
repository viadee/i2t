/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.TYPEType2;
import Powrmart.XMLINFOType;
import Powrmart.XMLTEXTType;

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
 * An implementation of the model object '<em><b>XMLINFO Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.XMLINFOTypeImpl#getXMLTEXT <em>XMLTEXT</em>}</li>
 *   <li>{@link Powrmart.impl.XMLINFOTypeImpl#getTEXT <em>TEXT</em>}</li>
 *   <li>{@link Powrmart.impl.XMLINFOTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLINFOTypeImpl extends EObjectImpl implements XMLINFOType {
    /**
     * The cached value of the '{@link #getXMLTEXT() <em>XMLTEXT</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLTEXT()
     * @generated
     * @ordered
     */
    protected EList<XMLTEXTType> xMLTEXT;

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
    protected static final TYPEType2 TYPE_EDEFAULT = TYPEType2.DTD;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected TYPEType2 tYPE = TYPE_EDEFAULT;

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
    protected XMLINFOTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getXMLINFOType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XMLTEXTType> getXMLTEXT() {
        if (xMLTEXT == null) {
            xMLTEXT = new EObjectContainmentEList<XMLTEXTType>(XMLTEXTType.class, this, PowrmartPackage.XMLINFO_TYPE__XMLTEXT);
        }
        return xMLTEXT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.XMLINFO_TYPE__TEXT, oldTEXT, tEXT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType2 getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTYPE(TYPEType2 newTYPE) {
        TYPEType2 oldTYPE = tYPE;
        tYPE = newTYPE == null ? TYPE_EDEFAULT : newTYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.XMLINFO_TYPE__TYPE, oldTYPE, tYPE, !oldTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTYPE() {
        TYPEType2 oldTYPE = tYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPE = TYPE_EDEFAULT;
        tYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.XMLINFO_TYPE__TYPE, oldTYPE, TYPE_EDEFAULT, oldTYPEESet));
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
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.XMLINFO_TYPE__XMLTEXT:
                return ((InternalEList<?>)getXMLTEXT()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.XMLINFO_TYPE__XMLTEXT:
                return getXMLTEXT();
            case PowrmartPackage.XMLINFO_TYPE__TEXT:
                return getTEXT();
            case PowrmartPackage.XMLINFO_TYPE__TYPE:
                return getTYPE();
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
            case PowrmartPackage.XMLINFO_TYPE__XMLTEXT:
                getXMLTEXT().clear();
                getXMLTEXT().addAll((Collection<? extends XMLTEXTType>)newValue);
                return;
            case PowrmartPackage.XMLINFO_TYPE__TEXT:
                setTEXT(newValue);
                return;
            case PowrmartPackage.XMLINFO_TYPE__TYPE:
                setTYPE((TYPEType2)newValue);
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
            case PowrmartPackage.XMLINFO_TYPE__XMLTEXT:
                getXMLTEXT().clear();
                return;
            case PowrmartPackage.XMLINFO_TYPE__TEXT:
                setTEXT(TEXT_EDEFAULT);
                return;
            case PowrmartPackage.XMLINFO_TYPE__TYPE:
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
            case PowrmartPackage.XMLINFO_TYPE__XMLTEXT:
                return xMLTEXT != null && !xMLTEXT.isEmpty();
            case PowrmartPackage.XMLINFO_TYPE__TEXT:
                return TEXT_EDEFAULT == null ? tEXT != null : !TEXT_EDEFAULT.equals(tEXT);
            case PowrmartPackage.XMLINFO_TYPE__TYPE:
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
        result.append(" (tEXT: ");
        result.append(tEXT);
        result.append(", tYPE: ");
        if (tYPEESet) result.append(tYPE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //XMLINFOTypeImpl
