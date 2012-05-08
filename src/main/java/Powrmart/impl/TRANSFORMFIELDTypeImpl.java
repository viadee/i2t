/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.IGNOREINCOMPAREType;
import Powrmart.IGNORENULLINPUTSType;
import Powrmart.ISSORTKEYType;
import Powrmart.PowrmartPackage;
import Powrmart.SORTDIRECTIONType;
import Powrmart.TRANSFORMFIELDATTRType;
import Powrmart.TRANSFORMFIELDType;

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
 * An implementation of the model object '<em><b>TRANSFORMFIELD Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getTRANSFORMFIELDATTR <em>TRANSFORMFIELDATTR</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getEXPRESSION <em>EXPRESSION</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getEXPRESSIONDESCRIPTION <em>EXPRESSIONDESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getEXPRESSIONTYPE <em>EXPRESSIONTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getFIELDNUMBER <em>FIELDNUMBER</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getIGNOREINCOMPARE <em>IGNOREINCOMPARE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getIGNORENULLINPUTS <em>IGNORENULLINPUTS</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getISSORTKEY <em>ISSORTKEY</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getMAPPLETGROUP <em>MAPPLETGROUP</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getOUTPUTGROUP <em>OUTPUTGROUP</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getPICTURETEXT <em>PICTURETEXT</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getPORTTYPE <em>PORTTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getREFFIELD <em>REFFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getREFINSTANCETYPE <em>REFINSTANCETYPE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getREFSOURCEFIELD <em>REFSOURCEFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getREFTRANSFORMATION <em>REFTRANSFORMATION</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getSCALE <em>SCALE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getSEQUENCEGENERATORVALUE <em>SEQUENCEGENERATORVALUE</em>}</li>
 *   <li>{@link Powrmart.impl.TRANSFORMFIELDTypeImpl#getSORTDIRECTION <em>SORTDIRECTION</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TRANSFORMFIELDTypeImpl extends EObjectImpl implements TRANSFORMFIELDType {
    /**
     * The cached value of the '{@link #getTRANSFORMFIELDATTR() <em>TRANSFORMFIELDATTR</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTRANSFORMFIELDATTR()
     * @generated
     * @ordered
     */
    protected EList<TRANSFORMFIELDATTRType> tRANSFORMFIELDATTR;

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
    protected Object nULLABLE = DATATYPE_EDEFAULT;
    
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
     * The default value of the '{@link #getEXPRESSIONDESCRIPTION() <em>EXPRESSIONDESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEXPRESSIONDESCRIPTION()
     * @generated
     * @ordered
     */
    protected static final Object EXPRESSIONDESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEXPRESSIONDESCRIPTION() <em>EXPRESSIONDESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEXPRESSIONDESCRIPTION()
     * @generated
     * @ordered
     */
    protected Object eXPRESSIONDESCRIPTION = EXPRESSIONDESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getEXPRESSIONTYPE() <em>EXPRESSIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEXPRESSIONTYPE()
     * @generated
     * @ordered
     */
    protected static final Object EXPRESSIONTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEXPRESSIONTYPE() <em>EXPRESSIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEXPRESSIONTYPE()
     * @generated
     * @ordered
     */
    protected Object eXPRESSIONTYPE = EXPRESSIONTYPE_EDEFAULT;

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
     * The default value of the '{@link #getIGNOREINCOMPARE() <em>IGNOREINCOMPARE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIGNOREINCOMPARE()
     * @generated
     * @ordered
     */
    protected static final IGNOREINCOMPAREType IGNOREINCOMPARE_EDEFAULT = IGNOREINCOMPAREType.YES;

    /**
     * The cached value of the '{@link #getIGNOREINCOMPARE() <em>IGNOREINCOMPARE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIGNOREINCOMPARE()
     * @generated
     * @ordered
     */
    protected IGNOREINCOMPAREType iGNOREINCOMPARE = IGNOREINCOMPARE_EDEFAULT;

    /**
     * This is true if the IGNOREINCOMPARE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iGNOREINCOMPAREESet;

    /**
     * The default value of the '{@link #getIGNORENULLINPUTS() <em>IGNORENULLINPUTS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIGNORENULLINPUTS()
     * @generated
     * @ordered
     */
    protected static final IGNORENULLINPUTSType IGNORENULLINPUTS_EDEFAULT = IGNORENULLINPUTSType.YES;

    /**
     * The cached value of the '{@link #getIGNORENULLINPUTS() <em>IGNORENULLINPUTS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIGNORENULLINPUTS()
     * @generated
     * @ordered
     */
    protected IGNORENULLINPUTSType iGNORENULLINPUTS = IGNORENULLINPUTS_EDEFAULT;

    /**
     * This is true if the IGNORENULLINPUTS attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iGNORENULLINPUTSESet;

    /**
     * The default value of the '{@link #getISSORTKEY() <em>ISSORTKEY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISSORTKEY()
     * @generated
     * @ordered
     */
    protected static final ISSORTKEYType ISSORTKEY_EDEFAULT = ISSORTKEYType.YES;

    /**
     * The cached value of the '{@link #getISSORTKEY() <em>ISSORTKEY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISSORTKEY()
     * @generated
     * @ordered
     */
    protected ISSORTKEYType iSSORTKEY = ISSORTKEY_EDEFAULT;

    /**
     * This is true if the ISSORTKEY attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSSORTKEYESet;

    /**
     * The default value of the '{@link #getMAPPLETGROUP() <em>MAPPLETGROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAPPLETGROUP()
     * @generated
     * @ordered
     */
    protected static final Object MAPPLETGROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMAPPLETGROUP() <em>MAPPLETGROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAPPLETGROUP()
     * @generated
     * @ordered
     */
    protected Object mAPPLETGROUP = MAPPLETGROUP_EDEFAULT;

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
     * The default value of the '{@link #getOUTPUTGROUP() <em>OUTPUTGROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOUTPUTGROUP()
     * @generated
     * @ordered
     */
    protected static final Object OUTPUTGROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOUTPUTGROUP() <em>OUTPUTGROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOUTPUTGROUP()
     * @generated
     * @ordered
     */
    protected Object oUTPUTGROUP = OUTPUTGROUP_EDEFAULT;

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
     * The default value of the '{@link #getPORTTYPE() <em>PORTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPORTTYPE()
     * @generated
     * @ordered
     */
    protected static final Object PORTTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPORTTYPE() <em>PORTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPORTTYPE()
     * @generated
     * @ordered
     */
    protected Object pORTTYPE = PORTTYPE_EDEFAULT;

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
     * The default value of the '{@link #getREFFIELD() <em>REFFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFFIELD()
     * @generated
     * @ordered
     */
    protected static final Object REFFIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFFIELD() <em>REFFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFFIELD()
     * @generated
     * @ordered
     */
    protected Object rEFFIELD = REFFIELD_EDEFAULT;

    /**
     * The default value of the '{@link #getREFINSTANCETYPE() <em>REFINSTANCETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFINSTANCETYPE()
     * @generated
     * @ordered
     */
    protected static final Object REFINSTANCETYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFINSTANCETYPE() <em>REFINSTANCETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFINSTANCETYPE()
     * @generated
     * @ordered
     */
    protected Object rEFINSTANCETYPE = REFINSTANCETYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getREFSOURCEFIELD() <em>REFSOURCEFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFSOURCEFIELD()
     * @generated
     * @ordered
     */
    protected static final Object REFSOURCEFIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFSOURCEFIELD() <em>REFSOURCEFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFSOURCEFIELD()
     * @generated
     * @ordered
     */
    protected Object rEFSOURCEFIELD = REFSOURCEFIELD_EDEFAULT;

    /**
     * The default value of the '{@link #getREFTRANSFORMATION() <em>REFTRANSFORMATION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFTRANSFORMATION()
     * @generated
     * @ordered
     */
    protected static final Object REFTRANSFORMATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFTRANSFORMATION() <em>REFTRANSFORMATION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFTRANSFORMATION()
     * @generated
     * @ordered
     */
    protected Object rEFTRANSFORMATION = REFTRANSFORMATION_EDEFAULT;

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
     * The default value of the '{@link #getSEQUENCEGENERATORVALUE() <em>SEQUENCEGENERATORVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSEQUENCEGENERATORVALUE()
     * @generated
     * @ordered
     */
    protected static final Object SEQUENCEGENERATORVALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSEQUENCEGENERATORVALUE() <em>SEQUENCEGENERATORVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSEQUENCEGENERATORVALUE()
     * @generated
     * @ordered
     */
    protected Object sEQUENCEGENERATORVALUE = SEQUENCEGENERATORVALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getSORTDIRECTION() <em>SORTDIRECTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSORTDIRECTION()
     * @generated
     * @ordered
     */
    protected static final SORTDIRECTIONType SORTDIRECTION_EDEFAULT = SORTDIRECTIONType.ASCENDING;

    /**
     * The cached value of the '{@link #getSORTDIRECTION() <em>SORTDIRECTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSORTDIRECTION()
     * @generated
     * @ordered
     */
    protected SORTDIRECTIONType sORTDIRECTION = SORTDIRECTION_EDEFAULT;

    /**
     * This is true if the SORTDIRECTION attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sORTDIRECTIONESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TRANSFORMFIELDTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getTRANSFORMFIELDType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TRANSFORMFIELDATTRType> getTRANSFORMFIELDATTR() {
        if (tRANSFORMFIELDATTR == null) {
            tRANSFORMFIELDATTR = new EObjectContainmentEList<TRANSFORMFIELDATTRType>(TRANSFORMFIELDATTRType.class, this, PowrmartPackage.TRANSFORMFIELD_TYPE__TRANSFORMFIELDATTR);
        }
        return tRANSFORMFIELDATTR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    public Object getNULLABLE() {
        return nULLABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    public void setNULLABLE(Object newNULLABLE) {
        Object oldNULLABLE = nULLABLE;
        nULLABLE = newNULLABLE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__NULLABLE, oldNULLABLE, nULLABLE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__DATATYPE, oldDATATYPE, dATATYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__DEFAULTVALUE, oldDEFAULTVALUE, dEFAULTVALUE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSION, oldEXPRESSION, eXPRESSION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getEXPRESSIONDESCRIPTION() {
        return eXPRESSIONDESCRIPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEXPRESSIONDESCRIPTION(Object newEXPRESSIONDESCRIPTION) {
        Object oldEXPRESSIONDESCRIPTION = eXPRESSIONDESCRIPTION;
        eXPRESSIONDESCRIPTION = newEXPRESSIONDESCRIPTION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSIONDESCRIPTION, oldEXPRESSIONDESCRIPTION, eXPRESSIONDESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getEXPRESSIONTYPE() {
        return eXPRESSIONTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEXPRESSIONTYPE(Object newEXPRESSIONTYPE) {
        Object oldEXPRESSIONTYPE = eXPRESSIONTYPE;
        eXPRESSIONTYPE = newEXPRESSIONTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSIONTYPE, oldEXPRESSIONTYPE, eXPRESSIONTYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__FIELDNUMBER, oldFIELDNUMBER, fIELDNUMBER));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__GROUP, oldGROUP, gROUP));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IGNOREINCOMPAREType getIGNOREINCOMPARE() {
        return iGNOREINCOMPARE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIGNOREINCOMPARE(IGNOREINCOMPAREType newIGNOREINCOMPARE) {
        IGNOREINCOMPAREType oldIGNOREINCOMPARE = iGNOREINCOMPARE;
        iGNOREINCOMPARE = newIGNOREINCOMPARE == null ? IGNOREINCOMPARE_EDEFAULT : newIGNOREINCOMPARE;
        boolean oldIGNOREINCOMPAREESet = iGNOREINCOMPAREESet;
        iGNOREINCOMPAREESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__IGNOREINCOMPARE, oldIGNOREINCOMPARE, iGNOREINCOMPARE, !oldIGNOREINCOMPAREESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIGNOREINCOMPARE() {
        IGNOREINCOMPAREType oldIGNOREINCOMPARE = iGNOREINCOMPARE;
        boolean oldIGNOREINCOMPAREESet = iGNOREINCOMPAREESet;
        iGNOREINCOMPARE = IGNOREINCOMPARE_EDEFAULT;
        iGNOREINCOMPAREESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TRANSFORMFIELD_TYPE__IGNOREINCOMPARE, oldIGNOREINCOMPARE, IGNOREINCOMPARE_EDEFAULT, oldIGNOREINCOMPAREESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIGNOREINCOMPARE() {
        return iGNOREINCOMPAREESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IGNORENULLINPUTSType getIGNORENULLINPUTS() {
        return iGNORENULLINPUTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIGNORENULLINPUTS(IGNORENULLINPUTSType newIGNORENULLINPUTS) {
        IGNORENULLINPUTSType oldIGNORENULLINPUTS = iGNORENULLINPUTS;
        iGNORENULLINPUTS = newIGNORENULLINPUTS == null ? IGNORENULLINPUTS_EDEFAULT : newIGNORENULLINPUTS;
        boolean oldIGNORENULLINPUTSESet = iGNORENULLINPUTSESet;
        iGNORENULLINPUTSESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__IGNORENULLINPUTS, oldIGNORENULLINPUTS, iGNORENULLINPUTS, !oldIGNORENULLINPUTSESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIGNORENULLINPUTS() {
        IGNORENULLINPUTSType oldIGNORENULLINPUTS = iGNORENULLINPUTS;
        boolean oldIGNORENULLINPUTSESet = iGNORENULLINPUTSESet;
        iGNORENULLINPUTS = IGNORENULLINPUTS_EDEFAULT;
        iGNORENULLINPUTSESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TRANSFORMFIELD_TYPE__IGNORENULLINPUTS, oldIGNORENULLINPUTS, IGNORENULLINPUTS_EDEFAULT, oldIGNORENULLINPUTSESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIGNORENULLINPUTS() {
        return iGNORENULLINPUTSESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISSORTKEYType getISSORTKEY() {
        return iSSORTKEY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISSORTKEY(ISSORTKEYType newISSORTKEY) {
        ISSORTKEYType oldISSORTKEY = iSSORTKEY;
        iSSORTKEY = newISSORTKEY == null ? ISSORTKEY_EDEFAULT : newISSORTKEY;
        boolean oldISSORTKEYESet = iSSORTKEYESet;
        iSSORTKEYESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__ISSORTKEY, oldISSORTKEY, iSSORTKEY, !oldISSORTKEYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISSORTKEY() {
        ISSORTKEYType oldISSORTKEY = iSSORTKEY;
        boolean oldISSORTKEYESet = iSSORTKEYESet;
        iSSORTKEY = ISSORTKEY_EDEFAULT;
        iSSORTKEYESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TRANSFORMFIELD_TYPE__ISSORTKEY, oldISSORTKEY, ISSORTKEY_EDEFAULT, oldISSORTKEYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISSORTKEY() {
        return iSSORTKEYESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getMAPPLETGROUP() {
        return mAPPLETGROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMAPPLETGROUP(Object newMAPPLETGROUP) {
        Object oldMAPPLETGROUP = mAPPLETGROUP;
        mAPPLETGROUP = newMAPPLETGROUP;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__MAPPLETGROUP, oldMAPPLETGROUP, mAPPLETGROUP));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getOUTPUTGROUP() {
        return oUTPUTGROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOUTPUTGROUP(Object newOUTPUTGROUP) {
        Object oldOUTPUTGROUP = oUTPUTGROUP;
        oUTPUTGROUP = newOUTPUTGROUP;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__OUTPUTGROUP, oldOUTPUTGROUP, oUTPUTGROUP));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__PICTURETEXT, oldPICTURETEXT, pICTURETEXT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPORTTYPE() {
        return pORTTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPORTTYPE(Object newPORTTYPE) {
        Object oldPORTTYPE = pORTTYPE;
        pORTTYPE = newPORTTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__PORTTYPE, oldPORTTYPE, pORTTYPE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__PRECISION, oldPRECISION, pRECISION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFFIELD() {
        return rEFFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFFIELD(Object newREFFIELD) {
        Object oldREFFIELD = rEFFIELD;
        rEFFIELD = newREFFIELD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__REFFIELD, oldREFFIELD, rEFFIELD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFINSTANCETYPE() {
        return rEFINSTANCETYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFINSTANCETYPE(Object newREFINSTANCETYPE) {
        Object oldREFINSTANCETYPE = rEFINSTANCETYPE;
        rEFINSTANCETYPE = newREFINSTANCETYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__REFINSTANCETYPE, oldREFINSTANCETYPE, rEFINSTANCETYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFSOURCEFIELD() {
        return rEFSOURCEFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFSOURCEFIELD(Object newREFSOURCEFIELD) {
        Object oldREFSOURCEFIELD = rEFSOURCEFIELD;
        rEFSOURCEFIELD = newREFSOURCEFIELD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__REFSOURCEFIELD, oldREFSOURCEFIELD, rEFSOURCEFIELD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFTRANSFORMATION() {
        return rEFTRANSFORMATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFTRANSFORMATION(Object newREFTRANSFORMATION) {
        Object oldREFTRANSFORMATION = rEFTRANSFORMATION;
        rEFTRANSFORMATION = newREFTRANSFORMATION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__REFTRANSFORMATION, oldREFTRANSFORMATION, rEFTRANSFORMATION));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__SCALE, oldSCALE, sCALE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSEQUENCEGENERATORVALUE() {
        return sEQUENCEGENERATORVALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSEQUENCEGENERATORVALUE(Object newSEQUENCEGENERATORVALUE) {
        Object oldSEQUENCEGENERATORVALUE = sEQUENCEGENERATORVALUE;
        sEQUENCEGENERATORVALUE = newSEQUENCEGENERATORVALUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__SEQUENCEGENERATORVALUE, oldSEQUENCEGENERATORVALUE, sEQUENCEGENERATORVALUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SORTDIRECTIONType getSORTDIRECTION() {
        return sORTDIRECTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSORTDIRECTION(SORTDIRECTIONType newSORTDIRECTION) {
        SORTDIRECTIONType oldSORTDIRECTION = sORTDIRECTION;
        sORTDIRECTION = newSORTDIRECTION == null ? SORTDIRECTION_EDEFAULT : newSORTDIRECTION;
        boolean oldSORTDIRECTIONESet = sORTDIRECTIONESet;
        sORTDIRECTIONESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TRANSFORMFIELD_TYPE__SORTDIRECTION, oldSORTDIRECTION, sORTDIRECTION, !oldSORTDIRECTIONESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSORTDIRECTION() {
        SORTDIRECTIONType oldSORTDIRECTION = sORTDIRECTION;
        boolean oldSORTDIRECTIONESet = sORTDIRECTIONESet;
        sORTDIRECTION = SORTDIRECTION_EDEFAULT;
        sORTDIRECTIONESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TRANSFORMFIELD_TYPE__SORTDIRECTION, oldSORTDIRECTION, SORTDIRECTION_EDEFAULT, oldSORTDIRECTIONESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSORTDIRECTION() {
        return sORTDIRECTIONESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.TRANSFORMFIELD_TYPE__TRANSFORMFIELDATTR:
                return ((InternalEList<?>)getTRANSFORMFIELDATTR()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.TRANSFORMFIELD_TYPE__TRANSFORMFIELDATTR:
                return getTRANSFORMFIELDATTR();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__DATATYPE:
                return getDATATYPE();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__DEFAULTVALUE:
                return getDEFAULTVALUE();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSION:
                return getEXPRESSION();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSIONDESCRIPTION:
                return getEXPRESSIONDESCRIPTION();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSIONTYPE:
                return getEXPRESSIONTYPE();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__FIELDNUMBER:
                return getFIELDNUMBER();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__GROUP:
                return getGROUP();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__IGNOREINCOMPARE:
                return getIGNOREINCOMPARE();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__IGNORENULLINPUTS:
                return getIGNORENULLINPUTS();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__ISSORTKEY:
                return getISSORTKEY();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__MAPPLETGROUP:
                return getMAPPLETGROUP();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__OUTPUTGROUP:
                return getOUTPUTGROUP();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__PICTURETEXT:
                return getPICTURETEXT();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__PORTTYPE:
                return getPORTTYPE();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__PRECISION:
                return getPRECISION();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFFIELD:
                return getREFFIELD();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFINSTANCETYPE:
                return getREFINSTANCETYPE();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFSOURCEFIELD:
                return getREFSOURCEFIELD();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFTRANSFORMATION:
                return getREFTRANSFORMATION();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__SCALE:
                return getSCALE();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__SEQUENCEGENERATORVALUE:
                return getSEQUENCEGENERATORVALUE();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__SORTDIRECTION:
                return getSORTDIRECTION();
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
            case PowrmartPackage.TRANSFORMFIELD_TYPE__TRANSFORMFIELDATTR:
                getTRANSFORMFIELDATTR().clear();
                getTRANSFORMFIELDATTR().addAll((Collection<? extends TRANSFORMFIELDATTRType>)newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__DATATYPE:
                setDATATYPE(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__DEFAULTVALUE:
                setDEFAULTVALUE(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSION:
                setEXPRESSION(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSIONDESCRIPTION:
                setEXPRESSIONDESCRIPTION(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSIONTYPE:
                setEXPRESSIONTYPE(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__FIELDNUMBER:
                setFIELDNUMBER(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__GROUP:
                setGROUP(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__IGNOREINCOMPARE:
                setIGNOREINCOMPARE((IGNOREINCOMPAREType)newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__IGNORENULLINPUTS:
                setIGNORENULLINPUTS((IGNORENULLINPUTSType)newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__ISSORTKEY:
                setISSORTKEY((ISSORTKEYType)newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__MAPPLETGROUP:
                setMAPPLETGROUP(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__OUTPUTGROUP:
                setOUTPUTGROUP(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__PICTURETEXT:
                setPICTURETEXT(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__PORTTYPE:
                setPORTTYPE(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__PRECISION:
                setPRECISION(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFFIELD:
                setREFFIELD(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFINSTANCETYPE:
                setREFINSTANCETYPE(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFSOURCEFIELD:
                setREFSOURCEFIELD(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFTRANSFORMATION:
                setREFTRANSFORMATION(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__SCALE:
                setSCALE(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__SEQUENCEGENERATORVALUE:
                setSEQUENCEGENERATORVALUE(newValue);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__SORTDIRECTION:
                setSORTDIRECTION((SORTDIRECTIONType)newValue);
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
            case PowrmartPackage.TRANSFORMFIELD_TYPE__TRANSFORMFIELDATTR:
                getTRANSFORMFIELDATTR().clear();
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__DATATYPE:
                setDATATYPE(DATATYPE_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__DEFAULTVALUE:
                setDEFAULTVALUE(DEFAULTVALUE_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSION:
                setEXPRESSION(EXPRESSION_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSIONDESCRIPTION:
                setEXPRESSIONDESCRIPTION(EXPRESSIONDESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSIONTYPE:
                setEXPRESSIONTYPE(EXPRESSIONTYPE_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__FIELDNUMBER:
                setFIELDNUMBER(FIELDNUMBER_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__GROUP:
                setGROUP(GROUP_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__IGNOREINCOMPARE:
                unsetIGNOREINCOMPARE();
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__IGNORENULLINPUTS:
                unsetIGNORENULLINPUTS();
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__ISSORTKEY:
                unsetISSORTKEY();
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__MAPPLETGROUP:
                setMAPPLETGROUP(MAPPLETGROUP_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__OUTPUTGROUP:
                setOUTPUTGROUP(OUTPUTGROUP_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__PICTURETEXT:
                setPICTURETEXT(PICTURETEXT_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__PORTTYPE:
                setPORTTYPE(PORTTYPE_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__PRECISION:
                setPRECISION(PRECISION_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFFIELD:
                setREFFIELD(REFFIELD_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFINSTANCETYPE:
                setREFINSTANCETYPE(REFINSTANCETYPE_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFSOURCEFIELD:
                setREFSOURCEFIELD(REFSOURCEFIELD_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFTRANSFORMATION:
                setREFTRANSFORMATION(REFTRANSFORMATION_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__SCALE:
                setSCALE(SCALE_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__SEQUENCEGENERATORVALUE:
                setSEQUENCEGENERATORVALUE(SEQUENCEGENERATORVALUE_EDEFAULT);
                return;
            case PowrmartPackage.TRANSFORMFIELD_TYPE__SORTDIRECTION:
                unsetSORTDIRECTION();
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
            case PowrmartPackage.TRANSFORMFIELD_TYPE__TRANSFORMFIELDATTR:
                return tRANSFORMFIELDATTR != null && !tRANSFORMFIELDATTR.isEmpty();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__NULLABLE:
                return DATATYPE_EDEFAULT == null ? nULLABLE != null : !DATATYPE_EDEFAULT.equals(nULLABLE);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__DATATYPE:
                return DATATYPE_EDEFAULT == null ? dATATYPE != null : !DATATYPE_EDEFAULT.equals(dATATYPE);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__DEFAULTVALUE:
                return DEFAULTVALUE_EDEFAULT == null ? dEFAULTVALUE != null : !DEFAULTVALUE_EDEFAULT.equals(dEFAULTVALUE);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSION:
                return EXPRESSION_EDEFAULT == null ? eXPRESSION != null : !EXPRESSION_EDEFAULT.equals(eXPRESSION);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSIONDESCRIPTION:
                return EXPRESSIONDESCRIPTION_EDEFAULT == null ? eXPRESSIONDESCRIPTION != null : !EXPRESSIONDESCRIPTION_EDEFAULT.equals(eXPRESSIONDESCRIPTION);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__EXPRESSIONTYPE:
                return EXPRESSIONTYPE_EDEFAULT == null ? eXPRESSIONTYPE != null : !EXPRESSIONTYPE_EDEFAULT.equals(eXPRESSIONTYPE);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__FIELDNUMBER:
                return FIELDNUMBER_EDEFAULT == null ? fIELDNUMBER != null : !FIELDNUMBER_EDEFAULT.equals(fIELDNUMBER);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__GROUP:
                return GROUP_EDEFAULT == null ? gROUP != null : !GROUP_EDEFAULT.equals(gROUP);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__IGNOREINCOMPARE:
                return isSetIGNOREINCOMPARE();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__IGNORENULLINPUTS:
                return isSetIGNORENULLINPUTS();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__ISSORTKEY:
                return isSetISSORTKEY();
            case PowrmartPackage.TRANSFORMFIELD_TYPE__MAPPLETGROUP:
                return MAPPLETGROUP_EDEFAULT == null ? mAPPLETGROUP != null : !MAPPLETGROUP_EDEFAULT.equals(mAPPLETGROUP);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__OUTPUTGROUP:
                return OUTPUTGROUP_EDEFAULT == null ? oUTPUTGROUP != null : !OUTPUTGROUP_EDEFAULT.equals(oUTPUTGROUP);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__PICTURETEXT:
                return PICTURETEXT_EDEFAULT == null ? pICTURETEXT != null : !PICTURETEXT_EDEFAULT.equals(pICTURETEXT);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__PORTTYPE:
                return PORTTYPE_EDEFAULT == null ? pORTTYPE != null : !PORTTYPE_EDEFAULT.equals(pORTTYPE);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__PRECISION:
                return PRECISION_EDEFAULT == null ? pRECISION != null : !PRECISION_EDEFAULT.equals(pRECISION);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFFIELD:
                return REFFIELD_EDEFAULT == null ? rEFFIELD != null : !REFFIELD_EDEFAULT.equals(rEFFIELD);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFINSTANCETYPE:
                return REFINSTANCETYPE_EDEFAULT == null ? rEFINSTANCETYPE != null : !REFINSTANCETYPE_EDEFAULT.equals(rEFINSTANCETYPE);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFSOURCEFIELD:
                return REFSOURCEFIELD_EDEFAULT == null ? rEFSOURCEFIELD != null : !REFSOURCEFIELD_EDEFAULT.equals(rEFSOURCEFIELD);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__REFTRANSFORMATION:
                return REFTRANSFORMATION_EDEFAULT == null ? rEFTRANSFORMATION != null : !REFTRANSFORMATION_EDEFAULT.equals(rEFTRANSFORMATION);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__SCALE:
                return SCALE_EDEFAULT == null ? sCALE != null : !SCALE_EDEFAULT.equals(sCALE);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__SEQUENCEGENERATORVALUE:
                return SEQUENCEGENERATORVALUE_EDEFAULT == null ? sEQUENCEGENERATORVALUE != null : !SEQUENCEGENERATORVALUE_EDEFAULT.equals(sEQUENCEGENERATORVALUE);
            case PowrmartPackage.TRANSFORMFIELD_TYPE__SORTDIRECTION:
                return isSetSORTDIRECTION();
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
        result.append(" (nULLABLE: ");
        result.append(nULLABLE);
        result.append(", dEFAULTVALUE: ");
        result.append(dEFAULTVALUE);
        result.append(", dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", eXPRESSION: ");
        result.append(eXPRESSION);
        result.append(", eXPRESSIONDESCRIPTION: ");
        result.append(eXPRESSIONDESCRIPTION);
        result.append(", eXPRESSIONTYPE: ");
        result.append(eXPRESSIONTYPE);
        result.append(", fIELDNUMBER: ");
        result.append(fIELDNUMBER);
        result.append(", gROUP: ");
        result.append(gROUP);
        result.append(", iGNOREINCOMPARE: ");
        if (iGNOREINCOMPAREESet) result.append(iGNOREINCOMPARE); else result.append("<unset>");
        result.append(", iGNORENULLINPUTS: ");
        if (iGNORENULLINPUTSESet) result.append(iGNORENULLINPUTS); else result.append("<unset>");
        result.append(", iSSORTKEY: ");
        if (iSSORTKEYESet) result.append(iSSORTKEY); else result.append("<unset>");
        result.append(", mAPPLETGROUP: ");
        result.append(mAPPLETGROUP);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", oUTPUTGROUP: ");
        result.append(oUTPUTGROUP);
        result.append(", pICTURETEXT: ");
        result.append(pICTURETEXT);
        result.append(", pORTTYPE: ");
        result.append(pORTTYPE);
        result.append(", pRECISION: ");
        result.append(pRECISION);
        result.append(", rEFFIELD: ");
        result.append(rEFFIELD);
        result.append(", rEFINSTANCETYPE: ");
        result.append(rEFINSTANCETYPE);
        result.append(", rEFSOURCEFIELD: ");
        result.append(rEFSOURCEFIELD);
        result.append(", rEFTRANSFORMATION: ");
        result.append(rEFTRANSFORMATION);
        result.append(", sCALE: ");
        result.append(sCALE);
        result.append(", sEQUENCEGENERATORVALUE: ");
        result.append(sEQUENCEGENERATORVALUE);
        result.append(", sORTDIRECTION: ");
        if (sORTDIRECTIONESet) result.append(sORTDIRECTION); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TRANSFORMFIELDTypeImpl
