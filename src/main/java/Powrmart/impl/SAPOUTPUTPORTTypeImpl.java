/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SAPOUTPUTPORTType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAPOUTPUTPORT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SAPOUTPUTPORTTypeImpl#getDSQINSTNAME <em>DSQINSTNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPOUTPUTPORTTypeImpl#getFIELDNAME <em>FIELDNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPOUTPUTPORTTypeImpl#getPORTNAME <em>PORTNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPOUTPUTPORTTypeImpl#getVARNAME <em>VARNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPOUTPUTPORTTypeImpl extends EObjectImpl implements SAPOUTPUTPORTType {
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
     * The default value of the '{@link #getFIELDNAME() <em>FIELDNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELDNAME()
     * @generated
     * @ordered
     */
    protected static final Object FIELDNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFIELDNAME() <em>FIELDNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELDNAME()
     * @generated
     * @ordered
     */
    protected Object fIELDNAME = FIELDNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPORTNAME() <em>PORTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPORTNAME()
     * @generated
     * @ordered
     */
    protected static final Object PORTNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPORTNAME() <em>PORTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPORTNAME()
     * @generated
     * @ordered
     */
    protected Object pORTNAME = PORTNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getVARNAME() <em>VARNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVARNAME()
     * @generated
     * @ordered
     */
    protected static final Object VARNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVARNAME() <em>VARNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVARNAME()
     * @generated
     * @ordered
     */
    protected Object vARNAME = VARNAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPOUTPUTPORTTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSAPOUTPUTPORTType();
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPOUTPUTPORT_TYPE__DSQINSTNAME, oldDSQINSTNAME, dSQINSTNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFIELDNAME() {
        return fIELDNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFIELDNAME(Object newFIELDNAME) {
        Object oldFIELDNAME = fIELDNAME;
        fIELDNAME = newFIELDNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPOUTPUTPORT_TYPE__FIELDNAME, oldFIELDNAME, fIELDNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPORTNAME() {
        return pORTNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPORTNAME(Object newPORTNAME) {
        Object oldPORTNAME = pORTNAME;
        pORTNAME = newPORTNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPOUTPUTPORT_TYPE__PORTNAME, oldPORTNAME, pORTNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getVARNAME() {
        return vARNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVARNAME(Object newVARNAME) {
        Object oldVARNAME = vARNAME;
        vARNAME = newVARNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPOUTPUTPORT_TYPE__VARNAME, oldVARNAME, vARNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__DSQINSTNAME:
                return getDSQINSTNAME();
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__FIELDNAME:
                return getFIELDNAME();
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__PORTNAME:
                return getPORTNAME();
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__VARNAME:
                return getVARNAME();
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
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__DSQINSTNAME:
                setDSQINSTNAME(newValue);
                return;
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__FIELDNAME:
                setFIELDNAME(newValue);
                return;
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__PORTNAME:
                setPORTNAME(newValue);
                return;
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__VARNAME:
                setVARNAME(newValue);
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
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__DSQINSTNAME:
                setDSQINSTNAME(DSQINSTNAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__FIELDNAME:
                setFIELDNAME(FIELDNAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__PORTNAME:
                setPORTNAME(PORTNAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__VARNAME:
                setVARNAME(VARNAME_EDEFAULT);
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
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__DSQINSTNAME:
                return DSQINSTNAME_EDEFAULT == null ? dSQINSTNAME != null : !DSQINSTNAME_EDEFAULT.equals(dSQINSTNAME);
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__FIELDNAME:
                return FIELDNAME_EDEFAULT == null ? fIELDNAME != null : !FIELDNAME_EDEFAULT.equals(fIELDNAME);
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__PORTNAME:
                return PORTNAME_EDEFAULT == null ? pORTNAME != null : !PORTNAME_EDEFAULT.equals(pORTNAME);
            case PowrmartPackage.SAPOUTPUTPORT_TYPE__VARNAME:
                return VARNAME_EDEFAULT == null ? vARNAME != null : !VARNAME_EDEFAULT.equals(vARNAME);
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
        result.append(", fIELDNAME: ");
        result.append(fIELDNAME);
        result.append(", pORTNAME: ");
        result.append(pORTNAME);
        result.append(", vARNAME: ");
        result.append(vARNAME);
        result.append(')');
        return result.toString();
    }

} //SAPOUTPUTPORTTypeImpl
