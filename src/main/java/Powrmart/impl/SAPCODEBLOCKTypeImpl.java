/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SAPCODEBLOCKType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAPCODEBLOCK Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SAPCODEBLOCKTypeImpl#getCODEBLOCK <em>CODEBLOCK</em>}</li>
 *   <li>{@link Powrmart.impl.SAPCODEBLOCKTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.SAPCODEBLOCKTypeImpl#getDSQINSTNAME <em>DSQINSTNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPCODEBLOCKTypeImpl#getNAME <em>NAME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPCODEBLOCKTypeImpl extends EObjectImpl implements SAPCODEBLOCKType {
    /**
     * The default value of the '{@link #getCODEBLOCK() <em>CODEBLOCK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCODEBLOCK()
     * @generated
     * @ordered
     */
    protected static final Object CODEBLOCK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCODEBLOCK() <em>CODEBLOCK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCODEBLOCK()
     * @generated
     * @ordered
     */
    protected Object cODEBLOCK = CODEBLOCK_EDEFAULT;

    /**
     * The default value of the '{@link #getDESCRIPTION() <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESCRIPTION()
     * @generated
     * @ordered
     */
    protected static final Object DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDESCRIPTION() <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESCRIPTION()
     * @generated
     * @ordered
     */
    protected Object dESCRIPTION = DESCRIPTION_EDEFAULT;

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
     * The default value of the '{@link #getNAME() <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAME()
     * @generated
     * @ordered
     */
    protected static final Object NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNAME() <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAME()
     * @generated
     * @ordered
     */
    protected Object nAME = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPCODEBLOCKTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSAPCODEBLOCKType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCODEBLOCK() {
        return cODEBLOCK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCODEBLOCK(Object newCODEBLOCK) {
        Object oldCODEBLOCK = cODEBLOCK;
        cODEBLOCK = newCODEBLOCK;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPCODEBLOCK_TYPE__CODEBLOCK, oldCODEBLOCK, cODEBLOCK));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDESCRIPTION() {
        return dESCRIPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDESCRIPTION(Object newDESCRIPTION) {
        Object oldDESCRIPTION = dESCRIPTION;
        dESCRIPTION = newDESCRIPTION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPCODEBLOCK_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPCODEBLOCK_TYPE__DSQINSTNAME, oldDSQINSTNAME, dSQINSTNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getNAME() {
        return nAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNAME(Object newNAME) {
        Object oldNAME = nAME;
        nAME = newNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPCODEBLOCK_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.SAPCODEBLOCK_TYPE__CODEBLOCK:
                return getCODEBLOCK();
            case PowrmartPackage.SAPCODEBLOCK_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.SAPCODEBLOCK_TYPE__DSQINSTNAME:
                return getDSQINSTNAME();
            case PowrmartPackage.SAPCODEBLOCK_TYPE__NAME:
                return getNAME();
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
            case PowrmartPackage.SAPCODEBLOCK_TYPE__CODEBLOCK:
                setCODEBLOCK(newValue);
                return;
            case PowrmartPackage.SAPCODEBLOCK_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.SAPCODEBLOCK_TYPE__DSQINSTNAME:
                setDSQINSTNAME(newValue);
                return;
            case PowrmartPackage.SAPCODEBLOCK_TYPE__NAME:
                setNAME(newValue);
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
            case PowrmartPackage.SAPCODEBLOCK_TYPE__CODEBLOCK:
                setCODEBLOCK(CODEBLOCK_EDEFAULT);
                return;
            case PowrmartPackage.SAPCODEBLOCK_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.SAPCODEBLOCK_TYPE__DSQINSTNAME:
                setDSQINSTNAME(DSQINSTNAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPCODEBLOCK_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
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
            case PowrmartPackage.SAPCODEBLOCK_TYPE__CODEBLOCK:
                return CODEBLOCK_EDEFAULT == null ? cODEBLOCK != null : !CODEBLOCK_EDEFAULT.equals(cODEBLOCK);
            case PowrmartPackage.SAPCODEBLOCK_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.SAPCODEBLOCK_TYPE__DSQINSTNAME:
                return DSQINSTNAME_EDEFAULT == null ? dSQINSTNAME != null : !DSQINSTNAME_EDEFAULT.equals(dSQINSTNAME);
            case PowrmartPackage.SAPCODEBLOCK_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
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
        result.append(" (cODEBLOCK: ");
        result.append(cODEBLOCK);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", dSQINSTNAME: ");
        result.append(dSQINSTNAME);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(')');
        return result.toString();
    }

} //SAPCODEBLOCKTypeImpl
