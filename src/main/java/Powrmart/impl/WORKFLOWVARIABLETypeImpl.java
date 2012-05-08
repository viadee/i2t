/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ISNULLType;
import Powrmart.ISPERSISTENTType;
import Powrmart.PowrmartPackage;
import Powrmart.USERDEFINEDType;
import Powrmart.WORKFLOWVARIABLEType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WORKFLOWVARIABLE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.WORKFLOWVARIABLETypeImpl#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWVARIABLETypeImpl#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWVARIABLETypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWVARIABLETypeImpl#getISNULL <em>ISNULL</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWVARIABLETypeImpl#getISPERSISTENT <em>ISPERSISTENT</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWVARIABLETypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWVARIABLETypeImpl#getUSERDEFINED <em>USERDEFINED</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WORKFLOWVARIABLETypeImpl extends EObjectImpl implements WORKFLOWVARIABLEType {
    /**
     * The default value of the '{@link #getDATATYPE() <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPE()
     * @generated
     * @ordered
     */
    protected static final Object DATATYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDATATYPE() <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDATATYPE()
     * @generated
     * @ordered
     */
    protected Object dATATYPE = DATATYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getDEFAULTVALUE() <em>DEFAULTVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULTVALUE()
     * @generated
     * @ordered
     */
    protected static final Object DEFAULTVALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDEFAULTVALUE() <em>DEFAULTVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULTVALUE()
     * @generated
     * @ordered
     */
    protected Object dEFAULTVALUE = DEFAULTVALUE_EDEFAULT;

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
     * The default value of the '{@link #getISNULL() <em>ISNULL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISNULL()
     * @generated
     * @ordered
     */
    protected static final ISNULLType ISNULL_EDEFAULT = ISNULLType.YES;

    /**
     * The cached value of the '{@link #getISNULL() <em>ISNULL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISNULL()
     * @generated
     * @ordered
     */
    protected ISNULLType iSNULL = ISNULL_EDEFAULT;

    /**
     * This is true if the ISNULL attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSNULLESet;

    /**
     * The default value of the '{@link #getISPERSISTENT() <em>ISPERSISTENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISPERSISTENT()
     * @generated
     * @ordered
     */
    protected static final ISPERSISTENTType ISPERSISTENT_EDEFAULT = ISPERSISTENTType.YES;

    /**
     * The cached value of the '{@link #getISPERSISTENT() <em>ISPERSISTENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISPERSISTENT()
     * @generated
     * @ordered
     */
    protected ISPERSISTENTType iSPERSISTENT = ISPERSISTENT_EDEFAULT;

    /**
     * This is true if the ISPERSISTENT attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSPERSISTENTESet;

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
     * The default value of the '{@link #getUSERDEFINED() <em>USERDEFINED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUSERDEFINED()
     * @generated
     * @ordered
     */
    protected static final USERDEFINEDType USERDEFINED_EDEFAULT = USERDEFINEDType.YES;

    /**
     * The cached value of the '{@link #getUSERDEFINED() <em>USERDEFINED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUSERDEFINED()
     * @generated
     * @ordered
     */
    protected USERDEFINEDType uSERDEFINED = USERDEFINED_EDEFAULT;

    /**
     * This is true if the USERDEFINED attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uSERDEFINEDESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WORKFLOWVARIABLETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getWORKFLOWVARIABLEType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDATATYPE() {
        return dATATYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDATATYPE(Object newDATATYPE) {
        Object oldDATATYPE = dATATYPE;
        dATATYPE = newDATATYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOWVARIABLE_TYPE__DATATYPE, oldDATATYPE, dATATYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDEFAULTVALUE() {
        return dEFAULTVALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDEFAULTVALUE(Object newDEFAULTVALUE) {
        Object oldDEFAULTVALUE = dEFAULTVALUE;
        dEFAULTVALUE = newDEFAULTVALUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOWVARIABLE_TYPE__DEFAULTVALUE, oldDEFAULTVALUE, dEFAULTVALUE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOWVARIABLE_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISNULLType getISNULL() {
        return iSNULL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISNULL(ISNULLType newISNULL) {
        ISNULLType oldISNULL = iSNULL;
        iSNULL = newISNULL == null ? ISNULL_EDEFAULT : newISNULL;
        boolean oldISNULLESet = iSNULLESet;
        iSNULLESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOWVARIABLE_TYPE__ISNULL, oldISNULL, iSNULL, !oldISNULLESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISNULL() {
        ISNULLType oldISNULL = iSNULL;
        boolean oldISNULLESet = iSNULLESet;
        iSNULL = ISNULL_EDEFAULT;
        iSNULLESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.WORKFLOWVARIABLE_TYPE__ISNULL, oldISNULL, ISNULL_EDEFAULT, oldISNULLESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISNULL() {
        return iSNULLESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISPERSISTENTType getISPERSISTENT() {
        return iSPERSISTENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISPERSISTENT(ISPERSISTENTType newISPERSISTENT) {
        ISPERSISTENTType oldISPERSISTENT = iSPERSISTENT;
        iSPERSISTENT = newISPERSISTENT == null ? ISPERSISTENT_EDEFAULT : newISPERSISTENT;
        boolean oldISPERSISTENTESet = iSPERSISTENTESet;
        iSPERSISTENTESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOWVARIABLE_TYPE__ISPERSISTENT, oldISPERSISTENT, iSPERSISTENT, !oldISPERSISTENTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISPERSISTENT() {
        ISPERSISTENTType oldISPERSISTENT = iSPERSISTENT;
        boolean oldISPERSISTENTESet = iSPERSISTENTESet;
        iSPERSISTENT = ISPERSISTENT_EDEFAULT;
        iSPERSISTENTESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.WORKFLOWVARIABLE_TYPE__ISPERSISTENT, oldISPERSISTENT, ISPERSISTENT_EDEFAULT, oldISPERSISTENTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISPERSISTENT() {
        return iSPERSISTENTESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOWVARIABLE_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public USERDEFINEDType getUSERDEFINED() {
        return uSERDEFINED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUSERDEFINED(USERDEFINEDType newUSERDEFINED) {
        USERDEFINEDType oldUSERDEFINED = uSERDEFINED;
        uSERDEFINED = newUSERDEFINED == null ? USERDEFINED_EDEFAULT : newUSERDEFINED;
        boolean oldUSERDEFINEDESet = uSERDEFINEDESet;
        uSERDEFINEDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOWVARIABLE_TYPE__USERDEFINED, oldUSERDEFINED, uSERDEFINED, !oldUSERDEFINEDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetUSERDEFINED() {
        USERDEFINEDType oldUSERDEFINED = uSERDEFINED;
        boolean oldUSERDEFINEDESet = uSERDEFINEDESet;
        uSERDEFINED = USERDEFINED_EDEFAULT;
        uSERDEFINEDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.WORKFLOWVARIABLE_TYPE__USERDEFINED, oldUSERDEFINED, USERDEFINED_EDEFAULT, oldUSERDEFINEDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetUSERDEFINED() {
        return uSERDEFINEDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__DATATYPE:
                return getDATATYPE();
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__DEFAULTVALUE:
                return getDEFAULTVALUE();
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__ISNULL:
                return getISNULL();
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__ISPERSISTENT:
                return getISPERSISTENT();
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__USERDEFINED:
                return getUSERDEFINED();
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
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__DATATYPE:
                setDATATYPE(newValue);
                return;
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__DEFAULTVALUE:
                setDEFAULTVALUE(newValue);
                return;
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__ISNULL:
                setISNULL((ISNULLType)newValue);
                return;
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__ISPERSISTENT:
                setISPERSISTENT((ISPERSISTENTType)newValue);
                return;
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__USERDEFINED:
                setUSERDEFINED((USERDEFINEDType)newValue);
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
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__DATATYPE:
                setDATATYPE(DATATYPE_EDEFAULT);
                return;
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__DEFAULTVALUE:
                setDEFAULTVALUE(DEFAULTVALUE_EDEFAULT);
                return;
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__ISNULL:
                unsetISNULL();
                return;
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__ISPERSISTENT:
                unsetISPERSISTENT();
                return;
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__USERDEFINED:
                unsetUSERDEFINED();
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
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__DATATYPE:
                return DATATYPE_EDEFAULT == null ? dATATYPE != null : !DATATYPE_EDEFAULT.equals(dATATYPE);
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__DEFAULTVALUE:
                return DEFAULTVALUE_EDEFAULT == null ? dEFAULTVALUE != null : !DEFAULTVALUE_EDEFAULT.equals(dEFAULTVALUE);
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__ISNULL:
                return isSetISNULL();
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__ISPERSISTENT:
                return isSetISPERSISTENT();
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.WORKFLOWVARIABLE_TYPE__USERDEFINED:
                return isSetUSERDEFINED();
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
        result.append(" (dATATYPE: ");
        result.append(dATATYPE);
        result.append(", dEFAULTVALUE: ");
        result.append(dEFAULTVALUE);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", iSNULL: ");
        if (iSNULLESet) result.append(iSNULL); else result.append("<unset>");
        result.append(", iSPERSISTENT: ");
        if (iSPERSISTENTESet) result.append(iSPERSISTENT); else result.append("<unset>");
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", uSERDEFINED: ");
        if (uSERDEFINEDESet) result.append(uSERDEFINED); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //WORKFLOWVARIABLETypeImpl
