/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ENDOPTIONSType;
import Powrmart.ENDTYPEType;
import Powrmart.PowrmartPackage;
import Powrmart.RUNFOREVERType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENDOPTIONS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.ENDOPTIONSTypeImpl#getENDAFTER <em>ENDAFTER</em>}</li>
 *   <li>{@link Powrmart.impl.ENDOPTIONSTypeImpl#getENDON <em>ENDON</em>}</li>
 *   <li>{@link Powrmart.impl.ENDOPTIONSTypeImpl#getENDTYPE <em>ENDTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.ENDOPTIONSTypeImpl#getRUNFOREVER <em>RUNFOREVER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ENDOPTIONSTypeImpl extends EObjectImpl implements ENDOPTIONSType {
    /**
     * The default value of the '{@link #getENDAFTER() <em>ENDAFTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getENDAFTER()
     * @generated
     * @ordered
     */
    protected static final Object ENDAFTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getENDAFTER() <em>ENDAFTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getENDAFTER()
     * @generated
     * @ordered
     */
    protected Object eNDAFTER = ENDAFTER_EDEFAULT;

    /**
     * The default value of the '{@link #getENDON() <em>ENDON</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getENDON()
     * @generated
     * @ordered
     */
    protected static final Object ENDON_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getENDON() <em>ENDON</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getENDON()
     * @generated
     * @ordered
     */
    protected Object eNDON = ENDON_EDEFAULT;

    /**
     * The default value of the '{@link #getENDTYPE() <em>ENDTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getENDTYPE()
     * @generated
     * @ordered
     */
    protected static final ENDTYPEType ENDTYPE_EDEFAULT = ENDTYPEType.ENDON;

    /**
     * The cached value of the '{@link #getENDTYPE() <em>ENDTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getENDTYPE()
     * @generated
     * @ordered
     */
    protected ENDTYPEType eNDTYPE = ENDTYPE_EDEFAULT;

    /**
     * This is true if the ENDTYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eNDTYPEESet;

    /**
     * The default value of the '{@link #getRUNFOREVER() <em>RUNFOREVER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRUNFOREVER()
     * @generated
     * @ordered
     */
    protected static final RUNFOREVERType RUNFOREVER_EDEFAULT = RUNFOREVERType.YES;

    /**
     * The cached value of the '{@link #getRUNFOREVER() <em>RUNFOREVER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRUNFOREVER()
     * @generated
     * @ordered
     */
    protected RUNFOREVERType rUNFOREVER = RUNFOREVER_EDEFAULT;

    /**
     * This is true if the RUNFOREVER attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rUNFOREVERESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ENDOPTIONSTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getENDOPTIONSType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getENDAFTER() {
        return eNDAFTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setENDAFTER(Object newENDAFTER) {
        Object oldENDAFTER = eNDAFTER;
        eNDAFTER = newENDAFTER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.ENDOPTIONS_TYPE__ENDAFTER, oldENDAFTER, eNDAFTER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getENDON() {
        return eNDON;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setENDON(Object newENDON) {
        Object oldENDON = eNDON;
        eNDON = newENDON;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.ENDOPTIONS_TYPE__ENDON, oldENDON, eNDON));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ENDTYPEType getENDTYPE() {
        return eNDTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setENDTYPE(ENDTYPEType newENDTYPE) {
        ENDTYPEType oldENDTYPE = eNDTYPE;
        eNDTYPE = newENDTYPE == null ? ENDTYPE_EDEFAULT : newENDTYPE;
        boolean oldENDTYPEESet = eNDTYPEESet;
        eNDTYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.ENDOPTIONS_TYPE__ENDTYPE, oldENDTYPE, eNDTYPE, !oldENDTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetENDTYPE() {
        ENDTYPEType oldENDTYPE = eNDTYPE;
        boolean oldENDTYPEESet = eNDTYPEESet;
        eNDTYPE = ENDTYPE_EDEFAULT;
        eNDTYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.ENDOPTIONS_TYPE__ENDTYPE, oldENDTYPE, ENDTYPE_EDEFAULT, oldENDTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetENDTYPE() {
        return eNDTYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RUNFOREVERType getRUNFOREVER() {
        return rUNFOREVER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRUNFOREVER(RUNFOREVERType newRUNFOREVER) {
        RUNFOREVERType oldRUNFOREVER = rUNFOREVER;
        rUNFOREVER = newRUNFOREVER == null ? RUNFOREVER_EDEFAULT : newRUNFOREVER;
        boolean oldRUNFOREVERESet = rUNFOREVERESet;
        rUNFOREVERESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.ENDOPTIONS_TYPE__RUNFOREVER, oldRUNFOREVER, rUNFOREVER, !oldRUNFOREVERESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRUNFOREVER() {
        RUNFOREVERType oldRUNFOREVER = rUNFOREVER;
        boolean oldRUNFOREVERESet = rUNFOREVERESet;
        rUNFOREVER = RUNFOREVER_EDEFAULT;
        rUNFOREVERESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.ENDOPTIONS_TYPE__RUNFOREVER, oldRUNFOREVER, RUNFOREVER_EDEFAULT, oldRUNFOREVERESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRUNFOREVER() {
        return rUNFOREVERESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.ENDOPTIONS_TYPE__ENDAFTER:
                return getENDAFTER();
            case PowrmartPackage.ENDOPTIONS_TYPE__ENDON:
                return getENDON();
            case PowrmartPackage.ENDOPTIONS_TYPE__ENDTYPE:
                return getENDTYPE();
            case PowrmartPackage.ENDOPTIONS_TYPE__RUNFOREVER:
                return getRUNFOREVER();
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
            case PowrmartPackage.ENDOPTIONS_TYPE__ENDAFTER:
                setENDAFTER(newValue);
                return;
            case PowrmartPackage.ENDOPTIONS_TYPE__ENDON:
                setENDON(newValue);
                return;
            case PowrmartPackage.ENDOPTIONS_TYPE__ENDTYPE:
                setENDTYPE((ENDTYPEType)newValue);
                return;
            case PowrmartPackage.ENDOPTIONS_TYPE__RUNFOREVER:
                setRUNFOREVER((RUNFOREVERType)newValue);
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
            case PowrmartPackage.ENDOPTIONS_TYPE__ENDAFTER:
                setENDAFTER(ENDAFTER_EDEFAULT);
                return;
            case PowrmartPackage.ENDOPTIONS_TYPE__ENDON:
                setENDON(ENDON_EDEFAULT);
                return;
            case PowrmartPackage.ENDOPTIONS_TYPE__ENDTYPE:
                unsetENDTYPE();
                return;
            case PowrmartPackage.ENDOPTIONS_TYPE__RUNFOREVER:
                unsetRUNFOREVER();
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
            case PowrmartPackage.ENDOPTIONS_TYPE__ENDAFTER:
                return ENDAFTER_EDEFAULT == null ? eNDAFTER != null : !ENDAFTER_EDEFAULT.equals(eNDAFTER);
            case PowrmartPackage.ENDOPTIONS_TYPE__ENDON:
                return ENDON_EDEFAULT == null ? eNDON != null : !ENDON_EDEFAULT.equals(eNDON);
            case PowrmartPackage.ENDOPTIONS_TYPE__ENDTYPE:
                return isSetENDTYPE();
            case PowrmartPackage.ENDOPTIONS_TYPE__RUNFOREVER:
                return isSetRUNFOREVER();
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
        result.append(" (eNDAFTER: ");
        result.append(eNDAFTER);
        result.append(", eNDON: ");
        result.append(eNDON);
        result.append(", eNDTYPE: ");
        if (eNDTYPEESet) result.append(eNDTYPE); else result.append("<unset>");
        result.append(", rUNFOREVER: ");
        if (rUNFOREVERESet) result.append(rUNFOREVER); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ENDOPTIONSTypeImpl
