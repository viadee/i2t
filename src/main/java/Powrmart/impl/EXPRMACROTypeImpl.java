/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.EXPRMACROType;
import Powrmart.MACROARGUMENTType;
import Powrmart.MACRODEPENDENCYType;
import Powrmart.MACROTYPEType;
import Powrmart.PowrmartPackage;

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
 * An implementation of the model object '<em><b>EXPRMACRO Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.EXPRMACROTypeImpl#getMACROARGUMENT <em>MACROARGUMENT</em>}</li>
 *   <li>{@link Powrmart.impl.EXPRMACROTypeImpl#getMACRODEPENDENCY <em>MACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.impl.EXPRMACROTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.EXPRMACROTypeImpl#getEXPRESSION <em>EXPRESSION</em>}</li>
 *   <li>{@link Powrmart.impl.EXPRMACROTypeImpl#getMACROTYPE <em>MACROTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.EXPRMACROTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.EXPRMACROTypeImpl#getOBJECTVERSION <em>OBJECTVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.EXPRMACROTypeImpl#getPROTOTYPE <em>PROTOTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.EXPRMACROTypeImpl#getRETURNTYPE <em>RETURNTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.EXPRMACROTypeImpl#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EXPRMACROTypeImpl extends EObjectImpl implements EXPRMACROType {
    /**
     * The cached value of the '{@link #getMACROARGUMENT() <em>MACROARGUMENT</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMACROARGUMENT()
     * @generated
     * @ordered
     */
    protected EList<MACROARGUMENTType> mACROARGUMENT;

    /**
     * The cached value of the '{@link #getMACRODEPENDENCY() <em>MACRODEPENDENCY</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMACRODEPENDENCY()
     * @generated
     * @ordered
     */
    protected EList<MACRODEPENDENCYType> mACRODEPENDENCY;

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
     * The default value of the '{@link #getEXPRESSION() <em>EXPRESSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEXPRESSION()
     * @generated
     * @ordered
     */
    protected static final Object EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEXPRESSION() <em>EXPRESSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEXPRESSION()
     * @generated
     * @ordered
     */
    protected Object eXPRESSION = EXPRESSION_EDEFAULT;

    /**
     * The default value of the '{@link #getMACROTYPE() <em>MACROTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMACROTYPE()
     * @generated
     * @ordered
     */
    protected static final MACROTYPEType MACROTYPE_EDEFAULT = MACROTYPEType.PUBLIC;

    /**
     * The cached value of the '{@link #getMACROTYPE() <em>MACROTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMACROTYPE()
     * @generated
     * @ordered
     */
    protected MACROTYPEType mACROTYPE = MACROTYPE_EDEFAULT;

    /**
     * This is true if the MACROTYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mACROTYPEESet;

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
     * The default value of the '{@link #getOBJECTVERSION() <em>OBJECTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOBJECTVERSION()
     * @generated
     * @ordered
     */
    protected static final Object OBJECTVERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOBJECTVERSION() <em>OBJECTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOBJECTVERSION()
     * @generated
     * @ordered
     */
    protected Object oBJECTVERSION = OBJECTVERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getPROTOTYPE() <em>PROTOTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPROTOTYPE()
     * @generated
     * @ordered
     */
    protected static final Object PROTOTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPROTOTYPE() <em>PROTOTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPROTOTYPE()
     * @generated
     * @ordered
     */
    protected Object pROTOTYPE = PROTOTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getRETURNTYPE() <em>RETURNTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRETURNTYPE()
     * @generated
     * @ordered
     */
    protected static final Object RETURNTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRETURNTYPE() <em>RETURNTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRETURNTYPE()
     * @generated
     * @ordered
     */
    protected Object rETURNTYPE = RETURNTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getVERSIONNUMBER() <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVERSIONNUMBER()
     * @generated
     * @ordered
     */
    protected static final Object VERSIONNUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVERSIONNUMBER() <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVERSIONNUMBER()
     * @generated
     * @ordered
     */
    protected Object vERSIONNUMBER = VERSIONNUMBER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EXPRMACROTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getEXPRMACROType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MACROARGUMENTType> getMACROARGUMENT() {
        if (mACROARGUMENT == null) {
            mACROARGUMENT = new EObjectContainmentEList<MACROARGUMENTType>(MACROARGUMENTType.class, this, PowrmartPackage.EXPRMACRO_TYPE__MACROARGUMENT);
        }
        return mACROARGUMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MACRODEPENDENCYType> getMACRODEPENDENCY() {
        if (mACRODEPENDENCY == null) {
            mACRODEPENDENCY = new EObjectContainmentEList<MACRODEPENDENCYType>(MACRODEPENDENCYType.class, this, PowrmartPackage.EXPRMACRO_TYPE__MACRODEPENDENCY);
        }
        return mACRODEPENDENCY;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.EXPRMACRO_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getEXPRESSION() {
        return eXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEXPRESSION(Object newEXPRESSION) {
        Object oldEXPRESSION = eXPRESSION;
        eXPRESSION = newEXPRESSION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.EXPRMACRO_TYPE__EXPRESSION, oldEXPRESSION, eXPRESSION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MACROTYPEType getMACROTYPE() {
        return mACROTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMACROTYPE(MACROTYPEType newMACROTYPE) {
        MACROTYPEType oldMACROTYPE = mACROTYPE;
        mACROTYPE = newMACROTYPE == null ? MACROTYPE_EDEFAULT : newMACROTYPE;
        boolean oldMACROTYPEESet = mACROTYPEESet;
        mACROTYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.EXPRMACRO_TYPE__MACROTYPE, oldMACROTYPE, mACROTYPE, !oldMACROTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMACROTYPE() {
        MACROTYPEType oldMACROTYPE = mACROTYPE;
        boolean oldMACROTYPEESet = mACROTYPEESet;
        mACROTYPE = MACROTYPE_EDEFAULT;
        mACROTYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.EXPRMACRO_TYPE__MACROTYPE, oldMACROTYPE, MACROTYPE_EDEFAULT, oldMACROTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMACROTYPE() {
        return mACROTYPEESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.EXPRMACRO_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getOBJECTVERSION() {
        return oBJECTVERSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOBJECTVERSION(Object newOBJECTVERSION) {
        Object oldOBJECTVERSION = oBJECTVERSION;
        oBJECTVERSION = newOBJECTVERSION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.EXPRMACRO_TYPE__OBJECTVERSION, oldOBJECTVERSION, oBJECTVERSION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPROTOTYPE() {
        return pROTOTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPROTOTYPE(Object newPROTOTYPE) {
        Object oldPROTOTYPE = pROTOTYPE;
        pROTOTYPE = newPROTOTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.EXPRMACRO_TYPE__PROTOTYPE, oldPROTOTYPE, pROTOTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getRETURNTYPE() {
        return rETURNTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRETURNTYPE(Object newRETURNTYPE) {
        Object oldRETURNTYPE = rETURNTYPE;
        rETURNTYPE = newRETURNTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.EXPRMACRO_TYPE__RETURNTYPE, oldRETURNTYPE, rETURNTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getVERSIONNUMBER() {
        return vERSIONNUMBER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVERSIONNUMBER(Object newVERSIONNUMBER) {
        Object oldVERSIONNUMBER = vERSIONNUMBER;
        vERSIONNUMBER = newVERSIONNUMBER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.EXPRMACRO_TYPE__VERSIONNUMBER, oldVERSIONNUMBER, vERSIONNUMBER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.EXPRMACRO_TYPE__MACROARGUMENT:
                return ((InternalEList<?>)getMACROARGUMENT()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.EXPRMACRO_TYPE__MACRODEPENDENCY:
                return ((InternalEList<?>)getMACRODEPENDENCY()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.EXPRMACRO_TYPE__MACROARGUMENT:
                return getMACROARGUMENT();
            case PowrmartPackage.EXPRMACRO_TYPE__MACRODEPENDENCY:
                return getMACRODEPENDENCY();
            case PowrmartPackage.EXPRMACRO_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.EXPRMACRO_TYPE__EXPRESSION:
                return getEXPRESSION();
            case PowrmartPackage.EXPRMACRO_TYPE__MACROTYPE:
                return getMACROTYPE();
            case PowrmartPackage.EXPRMACRO_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.EXPRMACRO_TYPE__OBJECTVERSION:
                return getOBJECTVERSION();
            case PowrmartPackage.EXPRMACRO_TYPE__PROTOTYPE:
                return getPROTOTYPE();
            case PowrmartPackage.EXPRMACRO_TYPE__RETURNTYPE:
                return getRETURNTYPE();
            case PowrmartPackage.EXPRMACRO_TYPE__VERSIONNUMBER:
                return getVERSIONNUMBER();
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
            case PowrmartPackage.EXPRMACRO_TYPE__MACROARGUMENT:
                getMACROARGUMENT().clear();
                getMACROARGUMENT().addAll((Collection<? extends MACROARGUMENTType>)newValue);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__MACRODEPENDENCY:
                getMACRODEPENDENCY().clear();
                getMACRODEPENDENCY().addAll((Collection<? extends MACRODEPENDENCYType>)newValue);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__EXPRESSION:
                setEXPRESSION(newValue);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__MACROTYPE:
                setMACROTYPE((MACROTYPEType)newValue);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__OBJECTVERSION:
                setOBJECTVERSION(newValue);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__PROTOTYPE:
                setPROTOTYPE(newValue);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__RETURNTYPE:
                setRETURNTYPE(newValue);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__VERSIONNUMBER:
                setVERSIONNUMBER(newValue);
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
            case PowrmartPackage.EXPRMACRO_TYPE__MACROARGUMENT:
                getMACROARGUMENT().clear();
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__MACRODEPENDENCY:
                getMACRODEPENDENCY().clear();
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__EXPRESSION:
                setEXPRESSION(EXPRESSION_EDEFAULT);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__MACROTYPE:
                unsetMACROTYPE();
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__OBJECTVERSION:
                setOBJECTVERSION(OBJECTVERSION_EDEFAULT);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__PROTOTYPE:
                setPROTOTYPE(PROTOTYPE_EDEFAULT);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__RETURNTYPE:
                setRETURNTYPE(RETURNTYPE_EDEFAULT);
                return;
            case PowrmartPackage.EXPRMACRO_TYPE__VERSIONNUMBER:
                setVERSIONNUMBER(VERSIONNUMBER_EDEFAULT);
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
            case PowrmartPackage.EXPRMACRO_TYPE__MACROARGUMENT:
                return mACROARGUMENT != null && !mACROARGUMENT.isEmpty();
            case PowrmartPackage.EXPRMACRO_TYPE__MACRODEPENDENCY:
                return mACRODEPENDENCY != null && !mACRODEPENDENCY.isEmpty();
            case PowrmartPackage.EXPRMACRO_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.EXPRMACRO_TYPE__EXPRESSION:
                return EXPRESSION_EDEFAULT == null ? eXPRESSION != null : !EXPRESSION_EDEFAULT.equals(eXPRESSION);
            case PowrmartPackage.EXPRMACRO_TYPE__MACROTYPE:
                return isSetMACROTYPE();
            case PowrmartPackage.EXPRMACRO_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.EXPRMACRO_TYPE__OBJECTVERSION:
                return OBJECTVERSION_EDEFAULT == null ? oBJECTVERSION != null : !OBJECTVERSION_EDEFAULT.equals(oBJECTVERSION);
            case PowrmartPackage.EXPRMACRO_TYPE__PROTOTYPE:
                return PROTOTYPE_EDEFAULT == null ? pROTOTYPE != null : !PROTOTYPE_EDEFAULT.equals(pROTOTYPE);
            case PowrmartPackage.EXPRMACRO_TYPE__RETURNTYPE:
                return RETURNTYPE_EDEFAULT == null ? rETURNTYPE != null : !RETURNTYPE_EDEFAULT.equals(rETURNTYPE);
            case PowrmartPackage.EXPRMACRO_TYPE__VERSIONNUMBER:
                return VERSIONNUMBER_EDEFAULT == null ? vERSIONNUMBER != null : !VERSIONNUMBER_EDEFAULT.equals(vERSIONNUMBER);
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
        result.append(" (dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", eXPRESSION: ");
        result.append(eXPRESSION);
        result.append(", mACROTYPE: ");
        if (mACROTYPEESet) result.append(mACROTYPE); else result.append("<unset>");
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", oBJECTVERSION: ");
        result.append(oBJECTVERSION);
        result.append(", pROTOTYPE: ");
        result.append(pROTOTYPE);
        result.append(", rETURNTYPE: ");
        result.append(rETURNTYPE);
        result.append(", vERSIONNUMBER: ");
        result.append(vERSIONNUMBER);
        result.append(')');
        return result.toString();
    }

} //EXPRMACROTypeImpl
