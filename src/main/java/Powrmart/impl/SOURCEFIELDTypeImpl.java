/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.FIELDATTRIBUTEType;
import Powrmart.NULLABLEType1;
import Powrmart.PowrmartPackage;
import Powrmart.SOURCEFIELDType;

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
 * An implementation of the model object '<em><b>SOURCEFIELD Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getSOURCEFIELD <em>SOURCEFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getFIELDATTRIBUTE <em>FIELDATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getBUSINESSNAME <em>BUSINESSNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getFIELDNUMBER <em>FIELDNUMBER</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getFIELDTYPE <em>FIELDTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getHIDDEN <em>HIDDEN</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getKEYTYPE <em>KEYTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getLENGTH <em>LENGTH</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getLEVEL <em>LEVEL</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getNULLABLE <em>NULLABLE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getOCCURS <em>OCCURS</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getOFFSET <em>OFFSET</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getPHYSICALLENGTH <em>PHYSICALLENGTH</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getPHYSICALOFFSET <em>PHYSICALOFFSET</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getPICTURETEXT <em>PICTURETEXT</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getREDEFINES <em>REDEFINES</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getREFERENCEDDBD <em>REFERENCEDDBD</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getREFERENCEDFIELD <em>REFERENCEDFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getREFERENCEDTABLE <em>REFERENCEDTABLE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getSCALE <em>SCALE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getSHIFTSTATE <em>SHIFTSTATE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getUSAGE <em>USAGE</em>}</li>
 *   <li>{@link Powrmart.impl.SOURCEFIELDTypeImpl#getUSAGEFLAGS <em>USAGEFLAGS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SOURCEFIELDTypeImpl extends EObjectImpl implements SOURCEFIELDType {
    /**
     * The cached value of the '{@link #getSOURCEFIELD() <em>SOURCEFIELD</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSOURCEFIELD()
     * @generated
     * @ordered
     */
    protected EList<SOURCEFIELDType> sOURCEFIELD;

    /**
     * The cached value of the '{@link #getFIELDATTRIBUTE() <em>FIELDATTRIBUTE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELDATTRIBUTE()
     * @generated
     * @ordered
     */
    protected EList<FIELDATTRIBUTEType> fIELDATTRIBUTE;

    /**
     * The default value of the '{@link #getBUSINESSNAME() <em>BUSINESSNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBUSINESSNAME()
     * @generated
     * @ordered
     */
    protected static final Object BUSINESSNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBUSINESSNAME() <em>BUSINESSNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBUSINESSNAME()
     * @generated
     * @ordered
     */
    protected Object bUSINESSNAME = BUSINESSNAME_EDEFAULT;

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
     * The default value of the '{@link #getFIELDNUMBER() <em>FIELDNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELDNUMBER()
     * @generated
     * @ordered
     */
    protected static final Object FIELDNUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFIELDNUMBER() <em>FIELDNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELDNUMBER()
     * @generated
     * @ordered
     */
    protected Object fIELDNUMBER = FIELDNUMBER_EDEFAULT;

    /**
     * The default value of the '{@link #getFIELDTYPE() <em>FIELDTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELDTYPE()
     * @generated
     * @ordered
     */
    protected static final Object FIELDTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFIELDTYPE() <em>FIELDTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELDTYPE()
     * @generated
     * @ordered
     */
    protected Object fIELDTYPE = FIELDTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getGROUP() <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGROUP()
     * @generated
     * @ordered
     */
    protected static final Object GROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGROUP() <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGROUP()
     * @generated
     * @ordered
     */
    protected Object gROUP = GROUP_EDEFAULT;

    /**
     * The default value of the '{@link #getHIDDEN() <em>HIDDEN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHIDDEN()
     * @generated
     * @ordered
     */
    protected static final Object HIDDEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHIDDEN() <em>HIDDEN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHIDDEN()
     * @generated
     * @ordered
     */
    protected Object hIDDEN = HIDDEN_EDEFAULT;

    /**
     * The default value of the '{@link #getKEYTYPE() <em>KEYTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKEYTYPE()
     * @generated
     * @ordered
     */
    protected static final Object KEYTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKEYTYPE() <em>KEYTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKEYTYPE()
     * @generated
     * @ordered
     */
    protected Object kEYTYPE = KEYTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getLENGTH() <em>LENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLENGTH()
     * @generated
     * @ordered
     */
    protected static final Object LENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLENGTH() <em>LENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLENGTH()
     * @generated
     * @ordered
     */
    protected Object lENGTH = LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getLEVEL() <em>LEVEL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLEVEL()
     * @generated
     * @ordered
     */
    protected static final Object LEVEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLEVEL() <em>LEVEL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLEVEL()
     * @generated
     * @ordered
     */
    protected Object lEVEL = LEVEL_EDEFAULT;

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
     * The default value of the '{@link #getNULLABLE() <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNULLABLE()
     * @generated
     * @ordered
     */
    protected static final NULLABLEType1 NULLABLE_EDEFAULT = NULLABLEType1.NOTNULL;

    /**
     * The cached value of the '{@link #getNULLABLE() <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNULLABLE()
     * @generated
     * @ordered
     */
    protected NULLABLEType1 nULLABLE = NULLABLE_EDEFAULT;

    /**
     * This is true if the NULLABLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nULLABLEESet;

    /**
     * The default value of the '{@link #getOCCURS() <em>OCCURS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOCCURS()
     * @generated
     * @ordered
     */
    protected static final Object OCCURS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOCCURS() <em>OCCURS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOCCURS()
     * @generated
     * @ordered
     */
    protected Object oCCURS = OCCURS_EDEFAULT;

    /**
     * The default value of the '{@link #getOFFSET() <em>OFFSET</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOFFSET()
     * @generated
     * @ordered
     */
    protected static final Object OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOFFSET() <em>OFFSET</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOFFSET()
     * @generated
     * @ordered
     */
    protected Object oFFSET = OFFSET_EDEFAULT;

    /**
     * The default value of the '{@link #getPHYSICALLENGTH() <em>PHYSICALLENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPHYSICALLENGTH()
     * @generated
     * @ordered
     */
    protected static final Object PHYSICALLENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPHYSICALLENGTH() <em>PHYSICALLENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPHYSICALLENGTH()
     * @generated
     * @ordered
     */
    protected Object pHYSICALLENGTH = PHYSICALLENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getPHYSICALOFFSET() <em>PHYSICALOFFSET</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPHYSICALOFFSET()
     * @generated
     * @ordered
     */
    protected static final Object PHYSICALOFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPHYSICALOFFSET() <em>PHYSICALOFFSET</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPHYSICALOFFSET()
     * @generated
     * @ordered
     */
    protected Object pHYSICALOFFSET = PHYSICALOFFSET_EDEFAULT;

    /**
     * The default value of the '{@link #getPICTURETEXT() <em>PICTURETEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPICTURETEXT()
     * @generated
     * @ordered
     */
    protected static final Object PICTURETEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPICTURETEXT() <em>PICTURETEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPICTURETEXT()
     * @generated
     * @ordered
     */
    protected Object pICTURETEXT = PICTURETEXT_EDEFAULT;

    /**
     * The default value of the '{@link #getPRECISION() <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPRECISION()
     * @generated
     * @ordered
     */
    protected static final Object PRECISION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPRECISION() <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPRECISION()
     * @generated
     * @ordered
     */
    protected Object pRECISION = PRECISION_EDEFAULT;

    /**
     * The default value of the '{@link #getREDEFINES() <em>REDEFINES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREDEFINES()
     * @generated
     * @ordered
     */
    protected static final Object REDEFINES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREDEFINES() <em>REDEFINES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREDEFINES()
     * @generated
     * @ordered
     */
    protected Object rEDEFINES = REDEFINES_EDEFAULT;

    /**
     * The default value of the '{@link #getREFERENCEDDBD() <em>REFERENCEDDBD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCEDDBD()
     * @generated
     * @ordered
     */
    protected static final Object REFERENCEDDBD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFERENCEDDBD() <em>REFERENCEDDBD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCEDDBD()
     * @generated
     * @ordered
     */
    protected Object rEFERENCEDDBD = REFERENCEDDBD_EDEFAULT;

    /**
     * The default value of the '{@link #getREFERENCEDFIELD() <em>REFERENCEDFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCEDFIELD()
     * @generated
     * @ordered
     */
    protected static final Object REFERENCEDFIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFERENCEDFIELD() <em>REFERENCEDFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCEDFIELD()
     * @generated
     * @ordered
     */
    protected Object rEFERENCEDFIELD = REFERENCEDFIELD_EDEFAULT;

    /**
     * The default value of the '{@link #getREFERENCEDTABLE() <em>REFERENCEDTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCEDTABLE()
     * @generated
     * @ordered
     */
    protected static final Object REFERENCEDTABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFERENCEDTABLE() <em>REFERENCEDTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFERENCEDTABLE()
     * @generated
     * @ordered
     */
    protected Object rEFERENCEDTABLE = REFERENCEDTABLE_EDEFAULT;

    /**
     * The default value of the '{@link #getSCALE() <em>SCALE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCALE()
     * @generated
     * @ordered
     */
    protected static final Object SCALE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSCALE() <em>SCALE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCALE()
     * @generated
     * @ordered
     */
    protected Object sCALE = SCALE_EDEFAULT;

    /**
     * The default value of the '{@link #getSHIFTSTATE() <em>SHIFTSTATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSHIFTSTATE()
     * @generated
     * @ordered
     */
    protected static final Object SHIFTSTATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSHIFTSTATE() <em>SHIFTSTATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSHIFTSTATE()
     * @generated
     * @ordered
     */
    protected Object sHIFTSTATE = SHIFTSTATE_EDEFAULT;

    /**
     * The default value of the '{@link #getUSAGE() <em>USAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUSAGE()
     * @generated
     * @ordered
     */
    protected static final Object USAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUSAGE() <em>USAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUSAGE()
     * @generated
     * @ordered
     */
    protected Object uSAGE = USAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getUSAGEFLAGS() <em>USAGEFLAGS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUSAGEFLAGS()
     * @generated
     * @ordered
     */
    protected static final Object USAGEFLAGS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUSAGEFLAGS() <em>USAGEFLAGS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUSAGEFLAGS()
     * @generated
     * @ordered
     */
    protected Object uSAGEFLAGS = USAGEFLAGS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SOURCEFIELDTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSOURCEFIELDType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SOURCEFIELDType> getSOURCEFIELD() {
        if (sOURCEFIELD == null) {
            sOURCEFIELD = new EObjectContainmentEList<SOURCEFIELDType>(SOURCEFIELDType.class, this, PowrmartPackage.SOURCEFIELD_TYPE__SOURCEFIELD);
        }
        return sOURCEFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FIELDATTRIBUTEType> getFIELDATTRIBUTE() {
        if (fIELDATTRIBUTE == null) {
            fIELDATTRIBUTE = new EObjectContainmentEList<FIELDATTRIBUTEType>(FIELDATTRIBUTEType.class, this, PowrmartPackage.SOURCEFIELD_TYPE__FIELDATTRIBUTE);
        }
        return fIELDATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getBUSINESSNAME() {
        return bUSINESSNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBUSINESSNAME(Object newBUSINESSNAME) {
        Object oldBUSINESSNAME = bUSINESSNAME;
        bUSINESSNAME = newBUSINESSNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__BUSINESSNAME, oldBUSINESSNAME, bUSINESSNAME));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__DATATYPE, oldDATATYPE, dATATYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFIELDNUMBER() {
        return fIELDNUMBER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFIELDNUMBER(Object newFIELDNUMBER) {
        Object oldFIELDNUMBER = fIELDNUMBER;
        fIELDNUMBER = newFIELDNUMBER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__FIELDNUMBER, oldFIELDNUMBER, fIELDNUMBER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFIELDTYPE() {
        return fIELDTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFIELDTYPE(Object newFIELDTYPE) {
        Object oldFIELDTYPE = fIELDTYPE;
        fIELDTYPE = newFIELDTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__FIELDTYPE, oldFIELDTYPE, fIELDTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getGROUP() {
        return gROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGROUP(Object newGROUP) {
        Object oldGROUP = gROUP;
        gROUP = newGROUP;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__GROUP, oldGROUP, gROUP));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getHIDDEN() {
        return hIDDEN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHIDDEN(Object newHIDDEN) {
        Object oldHIDDEN = hIDDEN;
        hIDDEN = newHIDDEN;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__HIDDEN, oldHIDDEN, hIDDEN));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getKEYTYPE() {
        return kEYTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKEYTYPE(Object newKEYTYPE) {
        Object oldKEYTYPE = kEYTYPE;
        kEYTYPE = newKEYTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__KEYTYPE, oldKEYTYPE, kEYTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getLENGTH() {
        return lENGTH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLENGTH(Object newLENGTH) {
        Object oldLENGTH = lENGTH;
        lENGTH = newLENGTH;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__LENGTH, oldLENGTH, lENGTH));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getLEVEL() {
        return lEVEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLEVEL(Object newLEVEL) {
        Object oldLEVEL = lEVEL;
        lEVEL = newLEVEL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__LEVEL, oldLEVEL, lEVEL));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NULLABLEType1 getNULLABLE() {
        return nULLABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNULLABLE(NULLABLEType1 newNULLABLE) {
        NULLABLEType1 oldNULLABLE = nULLABLE;
        nULLABLE = newNULLABLE == null ? NULLABLE_EDEFAULT : newNULLABLE;
        boolean oldNULLABLEESet = nULLABLEESet;
        nULLABLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__NULLABLE, oldNULLABLE, nULLABLE, !oldNULLABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNULLABLE() {
        NULLABLEType1 oldNULLABLE = nULLABLE;
        boolean oldNULLABLEESet = nULLABLEESet;
        nULLABLE = NULLABLE_EDEFAULT;
        nULLABLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SOURCEFIELD_TYPE__NULLABLE, oldNULLABLE, NULLABLE_EDEFAULT, oldNULLABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNULLABLE() {
        return nULLABLEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getOCCURS() {
        return oCCURS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOCCURS(Object newOCCURS) {
        Object oldOCCURS = oCCURS;
        oCCURS = newOCCURS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__OCCURS, oldOCCURS, oCCURS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getOFFSET() {
        return oFFSET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOFFSET(Object newOFFSET) {
        Object oldOFFSET = oFFSET;
        oFFSET = newOFFSET;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__OFFSET, oldOFFSET, oFFSET));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPHYSICALLENGTH() {
        return pHYSICALLENGTH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPHYSICALLENGTH(Object newPHYSICALLENGTH) {
        Object oldPHYSICALLENGTH = pHYSICALLENGTH;
        pHYSICALLENGTH = newPHYSICALLENGTH;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__PHYSICALLENGTH, oldPHYSICALLENGTH, pHYSICALLENGTH));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPHYSICALOFFSET() {
        return pHYSICALOFFSET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPHYSICALOFFSET(Object newPHYSICALOFFSET) {
        Object oldPHYSICALOFFSET = pHYSICALOFFSET;
        pHYSICALOFFSET = newPHYSICALOFFSET;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__PHYSICALOFFSET, oldPHYSICALOFFSET, pHYSICALOFFSET));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPICTURETEXT() {
        return pICTURETEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPICTURETEXT(Object newPICTURETEXT) {
        Object oldPICTURETEXT = pICTURETEXT;
        pICTURETEXT = newPICTURETEXT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__PICTURETEXT, oldPICTURETEXT, pICTURETEXT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPRECISION() {
        return pRECISION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPRECISION(Object newPRECISION) {
        Object oldPRECISION = pRECISION;
        pRECISION = newPRECISION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__PRECISION, oldPRECISION, pRECISION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREDEFINES() {
        return rEDEFINES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREDEFINES(Object newREDEFINES) {
        Object oldREDEFINES = rEDEFINES;
        rEDEFINES = newREDEFINES;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__REDEFINES, oldREDEFINES, rEDEFINES));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFERENCEDDBD() {
        return rEFERENCEDDBD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFERENCEDDBD(Object newREFERENCEDDBD) {
        Object oldREFERENCEDDBD = rEFERENCEDDBD;
        rEFERENCEDDBD = newREFERENCEDDBD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDDBD, oldREFERENCEDDBD, rEFERENCEDDBD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFERENCEDFIELD() {
        return rEFERENCEDFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFERENCEDFIELD(Object newREFERENCEDFIELD) {
        Object oldREFERENCEDFIELD = rEFERENCEDFIELD;
        rEFERENCEDFIELD = newREFERENCEDFIELD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDFIELD, oldREFERENCEDFIELD, rEFERENCEDFIELD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFERENCEDTABLE() {
        return rEFERENCEDTABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFERENCEDTABLE(Object newREFERENCEDTABLE) {
        Object oldREFERENCEDTABLE = rEFERENCEDTABLE;
        rEFERENCEDTABLE = newREFERENCEDTABLE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDTABLE, oldREFERENCEDTABLE, rEFERENCEDTABLE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSCALE() {
        return sCALE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCALE(Object newSCALE) {
        Object oldSCALE = sCALE;
        sCALE = newSCALE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__SCALE, oldSCALE, sCALE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSHIFTSTATE() {
        return sHIFTSTATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSHIFTSTATE(Object newSHIFTSTATE) {
        Object oldSHIFTSTATE = sHIFTSTATE;
        sHIFTSTATE = newSHIFTSTATE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__SHIFTSTATE, oldSHIFTSTATE, sHIFTSTATE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getUSAGE() {
        return uSAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUSAGE(Object newUSAGE) {
        Object oldUSAGE = uSAGE;
        uSAGE = newUSAGE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__USAGE, oldUSAGE, uSAGE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getUSAGEFLAGS() {
        return uSAGEFLAGS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUSAGEFLAGS(Object newUSAGEFLAGS) {
        Object oldUSAGEFLAGS = uSAGEFLAGS;
        uSAGEFLAGS = newUSAGEFLAGS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SOURCEFIELD_TYPE__USAGEFLAGS, oldUSAGEFLAGS, uSAGEFLAGS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SOURCEFIELD_TYPE__SOURCEFIELD:
                return ((InternalEList<?>)getSOURCEFIELD()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SOURCEFIELD_TYPE__FIELDATTRIBUTE:
                return ((InternalEList<?>)getFIELDATTRIBUTE()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.SOURCEFIELD_TYPE__SOURCEFIELD:
                return getSOURCEFIELD();
            case PowrmartPackage.SOURCEFIELD_TYPE__FIELDATTRIBUTE:
                return getFIELDATTRIBUTE();
            case PowrmartPackage.SOURCEFIELD_TYPE__BUSINESSNAME:
                return getBUSINESSNAME();
            case PowrmartPackage.SOURCEFIELD_TYPE__DATATYPE:
                return getDATATYPE();
            case PowrmartPackage.SOURCEFIELD_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.SOURCEFIELD_TYPE__FIELDNUMBER:
                return getFIELDNUMBER();
            case PowrmartPackage.SOURCEFIELD_TYPE__FIELDTYPE:
                return getFIELDTYPE();
            case PowrmartPackage.SOURCEFIELD_TYPE__GROUP:
                return getGROUP();
            case PowrmartPackage.SOURCEFIELD_TYPE__HIDDEN:
                return getHIDDEN();
            case PowrmartPackage.SOURCEFIELD_TYPE__KEYTYPE:
                return getKEYTYPE();
            case PowrmartPackage.SOURCEFIELD_TYPE__LENGTH:
                return getLENGTH();
            case PowrmartPackage.SOURCEFIELD_TYPE__LEVEL:
                return getLEVEL();
            case PowrmartPackage.SOURCEFIELD_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.SOURCEFIELD_TYPE__NULLABLE:
                return getNULLABLE();
            case PowrmartPackage.SOURCEFIELD_TYPE__OCCURS:
                return getOCCURS();
            case PowrmartPackage.SOURCEFIELD_TYPE__OFFSET:
                return getOFFSET();
            case PowrmartPackage.SOURCEFIELD_TYPE__PHYSICALLENGTH:
                return getPHYSICALLENGTH();
            case PowrmartPackage.SOURCEFIELD_TYPE__PHYSICALOFFSET:
                return getPHYSICALOFFSET();
            case PowrmartPackage.SOURCEFIELD_TYPE__PICTURETEXT:
                return getPICTURETEXT();
            case PowrmartPackage.SOURCEFIELD_TYPE__PRECISION:
                return getPRECISION();
            case PowrmartPackage.SOURCEFIELD_TYPE__REDEFINES:
                return getREDEFINES();
            case PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDDBD:
                return getREFERENCEDDBD();
            case PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDFIELD:
                return getREFERENCEDFIELD();
            case PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDTABLE:
                return getREFERENCEDTABLE();
            case PowrmartPackage.SOURCEFIELD_TYPE__SCALE:
                return getSCALE();
            case PowrmartPackage.SOURCEFIELD_TYPE__SHIFTSTATE:
                return getSHIFTSTATE();
            case PowrmartPackage.SOURCEFIELD_TYPE__USAGE:
                return getUSAGE();
            case PowrmartPackage.SOURCEFIELD_TYPE__USAGEFLAGS:
                return getUSAGEFLAGS();
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
            case PowrmartPackage.SOURCEFIELD_TYPE__SOURCEFIELD:
                getSOURCEFIELD().clear();
                getSOURCEFIELD().addAll((Collection<? extends SOURCEFIELDType>)newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__FIELDATTRIBUTE:
                getFIELDATTRIBUTE().clear();
                getFIELDATTRIBUTE().addAll((Collection<? extends FIELDATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__BUSINESSNAME:
                setBUSINESSNAME(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__DATATYPE:
                setDATATYPE(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__FIELDNUMBER:
                setFIELDNUMBER(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__FIELDTYPE:
                setFIELDTYPE(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__GROUP:
                setGROUP(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__HIDDEN:
                setHIDDEN(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__KEYTYPE:
                setKEYTYPE(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__LENGTH:
                setLENGTH(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__LEVEL:
                setLEVEL(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__NULLABLE:
                setNULLABLE((NULLABLEType1)newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__OCCURS:
                setOCCURS(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__OFFSET:
                setOFFSET(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__PHYSICALLENGTH:
                setPHYSICALLENGTH(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__PHYSICALOFFSET:
                setPHYSICALOFFSET(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__PICTURETEXT:
                setPICTURETEXT(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__PRECISION:
                setPRECISION(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__REDEFINES:
                setREDEFINES(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDDBD:
                setREFERENCEDDBD(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDFIELD:
                setREFERENCEDFIELD(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDTABLE:
                setREFERENCEDTABLE(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__SCALE:
                setSCALE(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__SHIFTSTATE:
                setSHIFTSTATE(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__USAGE:
                setUSAGE(newValue);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__USAGEFLAGS:
                setUSAGEFLAGS(newValue);
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
            case PowrmartPackage.SOURCEFIELD_TYPE__SOURCEFIELD:
                getSOURCEFIELD().clear();
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__FIELDATTRIBUTE:
                getFIELDATTRIBUTE().clear();
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__BUSINESSNAME:
                setBUSINESSNAME(BUSINESSNAME_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__DATATYPE:
                setDATATYPE(DATATYPE_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__FIELDNUMBER:
                setFIELDNUMBER(FIELDNUMBER_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__FIELDTYPE:
                setFIELDTYPE(FIELDTYPE_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__GROUP:
                setGROUP(GROUP_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__HIDDEN:
                setHIDDEN(HIDDEN_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__KEYTYPE:
                setKEYTYPE(KEYTYPE_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__LENGTH:
                setLENGTH(LENGTH_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__LEVEL:
                setLEVEL(LEVEL_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__NULLABLE:
                unsetNULLABLE();
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__OCCURS:
                setOCCURS(OCCURS_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__OFFSET:
                setOFFSET(OFFSET_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__PHYSICALLENGTH:
                setPHYSICALLENGTH(PHYSICALLENGTH_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__PHYSICALOFFSET:
                setPHYSICALOFFSET(PHYSICALOFFSET_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__PICTURETEXT:
                setPICTURETEXT(PICTURETEXT_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__PRECISION:
                setPRECISION(PRECISION_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__REDEFINES:
                setREDEFINES(REDEFINES_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDDBD:
                setREFERENCEDDBD(REFERENCEDDBD_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDFIELD:
                setREFERENCEDFIELD(REFERENCEDFIELD_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDTABLE:
                setREFERENCEDTABLE(REFERENCEDTABLE_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__SCALE:
                setSCALE(SCALE_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__SHIFTSTATE:
                setSHIFTSTATE(SHIFTSTATE_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__USAGE:
                setUSAGE(USAGE_EDEFAULT);
                return;
            case PowrmartPackage.SOURCEFIELD_TYPE__USAGEFLAGS:
                setUSAGEFLAGS(USAGEFLAGS_EDEFAULT);
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
            case PowrmartPackage.SOURCEFIELD_TYPE__SOURCEFIELD:
                return sOURCEFIELD != null && !sOURCEFIELD.isEmpty();
            case PowrmartPackage.SOURCEFIELD_TYPE__FIELDATTRIBUTE:
                return fIELDATTRIBUTE != null && !fIELDATTRIBUTE.isEmpty();
            case PowrmartPackage.SOURCEFIELD_TYPE__BUSINESSNAME:
                return BUSINESSNAME_EDEFAULT == null ? bUSINESSNAME != null : !BUSINESSNAME_EDEFAULT.equals(bUSINESSNAME);
            case PowrmartPackage.SOURCEFIELD_TYPE__DATATYPE:
                return DATATYPE_EDEFAULT == null ? dATATYPE != null : !DATATYPE_EDEFAULT.equals(dATATYPE);
            case PowrmartPackage.SOURCEFIELD_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.SOURCEFIELD_TYPE__FIELDNUMBER:
                return FIELDNUMBER_EDEFAULT == null ? fIELDNUMBER != null : !FIELDNUMBER_EDEFAULT.equals(fIELDNUMBER);
            case PowrmartPackage.SOURCEFIELD_TYPE__FIELDTYPE:
                return FIELDTYPE_EDEFAULT == null ? fIELDTYPE != null : !FIELDTYPE_EDEFAULT.equals(fIELDTYPE);
            case PowrmartPackage.SOURCEFIELD_TYPE__GROUP:
                return GROUP_EDEFAULT == null ? gROUP != null : !GROUP_EDEFAULT.equals(gROUP);
            case PowrmartPackage.SOURCEFIELD_TYPE__HIDDEN:
                return HIDDEN_EDEFAULT == null ? hIDDEN != null : !HIDDEN_EDEFAULT.equals(hIDDEN);
            case PowrmartPackage.SOURCEFIELD_TYPE__KEYTYPE:
                return KEYTYPE_EDEFAULT == null ? kEYTYPE != null : !KEYTYPE_EDEFAULT.equals(kEYTYPE);
            case PowrmartPackage.SOURCEFIELD_TYPE__LENGTH:
                return LENGTH_EDEFAULT == null ? lENGTH != null : !LENGTH_EDEFAULT.equals(lENGTH);
            case PowrmartPackage.SOURCEFIELD_TYPE__LEVEL:
                return LEVEL_EDEFAULT == null ? lEVEL != null : !LEVEL_EDEFAULT.equals(lEVEL);
            case PowrmartPackage.SOURCEFIELD_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.SOURCEFIELD_TYPE__NULLABLE:
                return isSetNULLABLE();
            case PowrmartPackage.SOURCEFIELD_TYPE__OCCURS:
                return OCCURS_EDEFAULT == null ? oCCURS != null : !OCCURS_EDEFAULT.equals(oCCURS);
            case PowrmartPackage.SOURCEFIELD_TYPE__OFFSET:
                return OFFSET_EDEFAULT == null ? oFFSET != null : !OFFSET_EDEFAULT.equals(oFFSET);
            case PowrmartPackage.SOURCEFIELD_TYPE__PHYSICALLENGTH:
                return PHYSICALLENGTH_EDEFAULT == null ? pHYSICALLENGTH != null : !PHYSICALLENGTH_EDEFAULT.equals(pHYSICALLENGTH);
            case PowrmartPackage.SOURCEFIELD_TYPE__PHYSICALOFFSET:
                return PHYSICALOFFSET_EDEFAULT == null ? pHYSICALOFFSET != null : !PHYSICALOFFSET_EDEFAULT.equals(pHYSICALOFFSET);
            case PowrmartPackage.SOURCEFIELD_TYPE__PICTURETEXT:
                return PICTURETEXT_EDEFAULT == null ? pICTURETEXT != null : !PICTURETEXT_EDEFAULT.equals(pICTURETEXT);
            case PowrmartPackage.SOURCEFIELD_TYPE__PRECISION:
                return PRECISION_EDEFAULT == null ? pRECISION != null : !PRECISION_EDEFAULT.equals(pRECISION);
            case PowrmartPackage.SOURCEFIELD_TYPE__REDEFINES:
                return REDEFINES_EDEFAULT == null ? rEDEFINES != null : !REDEFINES_EDEFAULT.equals(rEDEFINES);
            case PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDDBD:
                return REFERENCEDDBD_EDEFAULT == null ? rEFERENCEDDBD != null : !REFERENCEDDBD_EDEFAULT.equals(rEFERENCEDDBD);
            case PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDFIELD:
                return REFERENCEDFIELD_EDEFAULT == null ? rEFERENCEDFIELD != null : !REFERENCEDFIELD_EDEFAULT.equals(rEFERENCEDFIELD);
            case PowrmartPackage.SOURCEFIELD_TYPE__REFERENCEDTABLE:
                return REFERENCEDTABLE_EDEFAULT == null ? rEFERENCEDTABLE != null : !REFERENCEDTABLE_EDEFAULT.equals(rEFERENCEDTABLE);
            case PowrmartPackage.SOURCEFIELD_TYPE__SCALE:
                return SCALE_EDEFAULT == null ? sCALE != null : !SCALE_EDEFAULT.equals(sCALE);
            case PowrmartPackage.SOURCEFIELD_TYPE__SHIFTSTATE:
                return SHIFTSTATE_EDEFAULT == null ? sHIFTSTATE != null : !SHIFTSTATE_EDEFAULT.equals(sHIFTSTATE);
            case PowrmartPackage.SOURCEFIELD_TYPE__USAGE:
                return USAGE_EDEFAULT == null ? uSAGE != null : !USAGE_EDEFAULT.equals(uSAGE);
            case PowrmartPackage.SOURCEFIELD_TYPE__USAGEFLAGS:
                return USAGEFLAGS_EDEFAULT == null ? uSAGEFLAGS != null : !USAGEFLAGS_EDEFAULT.equals(uSAGEFLAGS);
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
        result.append(" (bUSINESSNAME: ");
        result.append(bUSINESSNAME);
        result.append(", dATATYPE: ");
        result.append(dATATYPE);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", fIELDNUMBER: ");
        result.append(fIELDNUMBER);
        result.append(", fIELDTYPE: ");
        result.append(fIELDTYPE);
        result.append(", gROUP: ");
        result.append(gROUP);
        result.append(", hIDDEN: ");
        result.append(hIDDEN);
        result.append(", kEYTYPE: ");
        result.append(kEYTYPE);
        result.append(", lENGTH: ");
        result.append(lENGTH);
        result.append(", lEVEL: ");
        result.append(lEVEL);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", nULLABLE: ");
        if (nULLABLEESet) result.append(nULLABLE); else result.append("<unset>");
        result.append(", oCCURS: ");
        result.append(oCCURS);
        result.append(", oFFSET: ");
        result.append(oFFSET);
        result.append(", pHYSICALLENGTH: ");
        result.append(pHYSICALLENGTH);
        result.append(", pHYSICALOFFSET: ");
        result.append(pHYSICALOFFSET);
        result.append(", pICTURETEXT: ");
        result.append(pICTURETEXT);
        result.append(", pRECISION: ");
        result.append(pRECISION);
        result.append(", rEDEFINES: ");
        result.append(rEDEFINES);
        result.append(", rEFERENCEDDBD: ");
        result.append(rEFERENCEDDBD);
        result.append(", rEFERENCEDFIELD: ");
        result.append(rEFERENCEDFIELD);
        result.append(", rEFERENCEDTABLE: ");
        result.append(rEFERENCEDTABLE);
        result.append(", sCALE: ");
        result.append(sCALE);
        result.append(", sHIFTSTATE: ");
        result.append(sHIFTSTATE);
        result.append(", uSAGE: ");
        result.append(uSAGE);
        result.append(", uSAGEFLAGS: ");
        result.append(uSAGEFLAGS);
        result.append(')');
        return result.toString();
    }

} //SOURCEFIELDTypeImpl
