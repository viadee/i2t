/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.FLATFILEType;
import Powrmart.NULLCHARTYPEType;
import Powrmart.PowrmartPackage;
import Powrmart.STAGEFILEPERSISTType;
import Powrmart.STAGEFILEREINITType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FLATFILE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getCODEPAGE <em>CODEPAGE</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getCONSECDELIMITERSASONE <em>CONSECDELIMITERSASONE</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getDELIMITED <em>DELIMITED</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getDELIMITERS <em>DELIMITERS</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getDELIMITERSINBINARY <em>DELIMITERSINBINARY</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getESCAPECHARACTER <em>ESCAPECHARACTER</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getFILENAME <em>FILENAME</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getFILETYPE <em>FILETYPE</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getKEEPESCAPECHAR <em>KEEPESCAPECHAR</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getLINESEQUENTIAL <em>LINESEQUENTIAL</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getNULLCHARACTER <em>NULLCHARACTER</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getNULLCHARTYPE <em>NULLCHARTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getPADBYTES <em>PADBYTES</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getQUOTECHARACTER <em>QUOTECHARACTER</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getREPEATABLE <em>REPEATABLE</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getROWDELIMITER <em>ROWDELIMITER</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getSHIFTSENSITIVEDATA <em>SHIFTSENSITIVEDATA</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getSKIPLEADINGBYTES <em>SKIPLEADINGBYTES</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getSKIPROWS <em>SKIPROWS</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getSKIPTRAILINGBYTES <em>SKIPTRAILINGBYTES</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getSTAGEFILEPERSIST <em>STAGEFILEPERSIST</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getSTAGEFILEREINIT <em>STAGEFILEREINIT</em>}</li>
 *   <li>{@link Powrmart.impl.FLATFILETypeImpl#getSTRIPTRAILINGBLANKS <em>STRIPTRAILINGBLANKS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FLATFILETypeImpl extends EObjectImpl implements FLATFILEType {
    /**
     * The default value of the '{@link #getCODEPAGE() <em>CODEPAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCODEPAGE()
     * @generated
     * @ordered
     */
    protected static final Object CODEPAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCODEPAGE() <em>CODEPAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCODEPAGE()
     * @generated
     * @ordered
     */
    protected Object cODEPAGE = CODEPAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getCONSECDELIMITERSASONE() <em>CONSECDELIMITERSASONE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONSECDELIMITERSASONE()
     * @generated
     * @ordered
     */
    protected static final Object CONSECDELIMITERSASONE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCONSECDELIMITERSASONE() <em>CONSECDELIMITERSASONE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONSECDELIMITERSASONE()
     * @generated
     * @ordered
     */
    protected Object cONSECDELIMITERSASONE = CONSECDELIMITERSASONE_EDEFAULT;

    /**
     * The default value of the '{@link #getDELIMITED() <em>DELIMITED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDELIMITED()
     * @generated
     * @ordered
     */
    protected static final Object DELIMITED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDELIMITED() <em>DELIMITED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDELIMITED()
     * @generated
     * @ordered
     */
    protected Object dELIMITED = DELIMITED_EDEFAULT;

    /**
     * The default value of the '{@link #getDELIMITERS() <em>DELIMITERS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDELIMITERS()
     * @generated
     * @ordered
     */
    protected static final Object DELIMITERS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDELIMITERS() <em>DELIMITERS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDELIMITERS()
     * @generated
     * @ordered
     */
    protected Object dELIMITERS = DELIMITERS_EDEFAULT;

    /**
     * The default value of the '{@link #getDELIMITERSINBINARY() <em>DELIMITERSINBINARY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDELIMITERSINBINARY()
     * @generated
     * @ordered
     */
    protected static final Object DELIMITERSINBINARY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDELIMITERSINBINARY() <em>DELIMITERSINBINARY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDELIMITERSINBINARY()
     * @generated
     * @ordered
     */
    protected Object dELIMITERSINBINARY = DELIMITERSINBINARY_EDEFAULT;

    /**
     * The default value of the '{@link #getESCAPECHARACTER() <em>ESCAPECHARACTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getESCAPECHARACTER()
     * @generated
     * @ordered
     */
    protected static final Object ESCAPECHARACTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getESCAPECHARACTER() <em>ESCAPECHARACTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getESCAPECHARACTER()
     * @generated
     * @ordered
     */
    protected Object eSCAPECHARACTER = ESCAPECHARACTER_EDEFAULT;

    /**
     * The default value of the '{@link #getFILENAME() <em>FILENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFILENAME()
     * @generated
     * @ordered
     */
    protected static final Object FILENAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFILENAME() <em>FILENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFILENAME()
     * @generated
     * @ordered
     */
    protected Object fILENAME = FILENAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFILETYPE() <em>FILETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFILETYPE()
     * @generated
     * @ordered
     */
    protected static final Object FILETYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFILETYPE() <em>FILETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFILETYPE()
     * @generated
     * @ordered
     */
    protected Object fILETYPE = FILETYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getKEEPESCAPECHAR() <em>KEEPESCAPECHAR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKEEPESCAPECHAR()
     * @generated
     * @ordered
     */
    protected static final Object KEEPESCAPECHAR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKEEPESCAPECHAR() <em>KEEPESCAPECHAR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKEEPESCAPECHAR()
     * @generated
     * @ordered
     */
    protected Object kEEPESCAPECHAR = KEEPESCAPECHAR_EDEFAULT;

    /**
     * The default value of the '{@link #getLINESEQUENTIAL() <em>LINESEQUENTIAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLINESEQUENTIAL()
     * @generated
     * @ordered
     */
    protected static final Object LINESEQUENTIAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLINESEQUENTIAL() <em>LINESEQUENTIAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLINESEQUENTIAL()
     * @generated
     * @ordered
     */
    protected Object lINESEQUENTIAL = LINESEQUENTIAL_EDEFAULT;

    /**
     * The default value of the '{@link #getNULLCHARACTER() <em>NULLCHARACTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNULLCHARACTER()
     * @generated
     * @ordered
     */
    protected static final Object NULLCHARACTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNULLCHARACTER() <em>NULLCHARACTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNULLCHARACTER()
     * @generated
     * @ordered
     */
    protected Object nULLCHARACTER = NULLCHARACTER_EDEFAULT;

    /**
     * The default value of the '{@link #getNULLCHARTYPE() <em>NULLCHARTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNULLCHARTYPE()
     * @generated
     * @ordered
     */
    protected static final NULLCHARTYPEType NULLCHARTYPE_EDEFAULT = NULLCHARTYPEType.BINARY;

    /**
     * The cached value of the '{@link #getNULLCHARTYPE() <em>NULLCHARTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNULLCHARTYPE()
     * @generated
     * @ordered
     */
    protected NULLCHARTYPEType nULLCHARTYPE = NULLCHARTYPE_EDEFAULT;

    /**
     * This is true if the NULLCHARTYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nULLCHARTYPEESet;

    /**
     * The default value of the '{@link #getPADBYTES() <em>PADBYTES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPADBYTES()
     * @generated
     * @ordered
     */
    protected static final Object PADBYTES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPADBYTES() <em>PADBYTES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPADBYTES()
     * @generated
     * @ordered
     */
    protected Object pADBYTES = PADBYTES_EDEFAULT;

    /**
     * The default value of the '{@link #getQUOTECHARACTER() <em>QUOTECHARACTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQUOTECHARACTER()
     * @generated
     * @ordered
     */
    protected static final Object QUOTECHARACTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQUOTECHARACTER() <em>QUOTECHARACTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQUOTECHARACTER()
     * @generated
     * @ordered
     */
    protected Object qUOTECHARACTER = QUOTECHARACTER_EDEFAULT;

    /**
     * The default value of the '{@link #getREPEATABLE() <em>REPEATABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREPEATABLE()
     * @generated
     * @ordered
     */
    protected static final Object REPEATABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREPEATABLE() <em>REPEATABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREPEATABLE()
     * @generated
     * @ordered
     */
    protected Object rEPEATABLE = REPEATABLE_EDEFAULT;

    /**
     * The default value of the '{@link #getROWDELIMITER() <em>ROWDELIMITER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getROWDELIMITER()
     * @generated
     * @ordered
     */
    protected static final Object ROWDELIMITER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getROWDELIMITER() <em>ROWDELIMITER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getROWDELIMITER()
     * @generated
     * @ordered
     */
    protected Object rOWDELIMITER = ROWDELIMITER_EDEFAULT;

    /**
     * The default value of the '{@link #getSHIFTSENSITIVEDATA() <em>SHIFTSENSITIVEDATA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSHIFTSENSITIVEDATA()
     * @generated
     * @ordered
     */
    protected static final Object SHIFTSENSITIVEDATA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSHIFTSENSITIVEDATA() <em>SHIFTSENSITIVEDATA</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSHIFTSENSITIVEDATA()
     * @generated
     * @ordered
     */
    protected Object sHIFTSENSITIVEDATA = SHIFTSENSITIVEDATA_EDEFAULT;

    /**
     * The default value of the '{@link #getSKIPLEADINGBYTES() <em>SKIPLEADINGBYTES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSKIPLEADINGBYTES()
     * @generated
     * @ordered
     */
    protected static final Object SKIPLEADINGBYTES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSKIPLEADINGBYTES() <em>SKIPLEADINGBYTES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSKIPLEADINGBYTES()
     * @generated
     * @ordered
     */
    protected Object sKIPLEADINGBYTES = SKIPLEADINGBYTES_EDEFAULT;

    /**
     * The default value of the '{@link #getSKIPROWS() <em>SKIPROWS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSKIPROWS()
     * @generated
     * @ordered
     */
    protected static final Object SKIPROWS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSKIPROWS() <em>SKIPROWS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSKIPROWS()
     * @generated
     * @ordered
     */
    protected Object sKIPROWS = SKIPROWS_EDEFAULT;

    /**
     * The default value of the '{@link #getSKIPTRAILINGBYTES() <em>SKIPTRAILINGBYTES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSKIPTRAILINGBYTES()
     * @generated
     * @ordered
     */
    protected static final Object SKIPTRAILINGBYTES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSKIPTRAILINGBYTES() <em>SKIPTRAILINGBYTES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSKIPTRAILINGBYTES()
     * @generated
     * @ordered
     */
    protected Object sKIPTRAILINGBYTES = SKIPTRAILINGBYTES_EDEFAULT;

    /**
     * The default value of the '{@link #getSTAGEFILEPERSIST() <em>STAGEFILEPERSIST</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTAGEFILEPERSIST()
     * @generated
     * @ordered
     */
    protected static final STAGEFILEPERSISTType STAGEFILEPERSIST_EDEFAULT = STAGEFILEPERSISTType.YES;

    /**
     * The cached value of the '{@link #getSTAGEFILEPERSIST() <em>STAGEFILEPERSIST</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTAGEFILEPERSIST()
     * @generated
     * @ordered
     */
    protected STAGEFILEPERSISTType sTAGEFILEPERSIST = STAGEFILEPERSIST_EDEFAULT;

    /**
     * This is true if the STAGEFILEPERSIST attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sTAGEFILEPERSISTESet;

    /**
     * The default value of the '{@link #getSTAGEFILEREINIT() <em>STAGEFILEREINIT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTAGEFILEREINIT()
     * @generated
     * @ordered
     */
    protected static final STAGEFILEREINITType STAGEFILEREINIT_EDEFAULT = STAGEFILEREINITType.YES;

    /**
     * The cached value of the '{@link #getSTAGEFILEREINIT() <em>STAGEFILEREINIT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTAGEFILEREINIT()
     * @generated
     * @ordered
     */
    protected STAGEFILEREINITType sTAGEFILEREINIT = STAGEFILEREINIT_EDEFAULT;

    /**
     * This is true if the STAGEFILEREINIT attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sTAGEFILEREINITESet;

    /**
     * The default value of the '{@link #getSTRIPTRAILINGBLANKS() <em>STRIPTRAILINGBLANKS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTRIPTRAILINGBLANKS()
     * @generated
     * @ordered
     */
    protected static final Object STRIPTRAILINGBLANKS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSTRIPTRAILINGBLANKS() <em>STRIPTRAILINGBLANKS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTRIPTRAILINGBLANKS()
     * @generated
     * @ordered
     */
    protected Object sTRIPTRAILINGBLANKS = STRIPTRAILINGBLANKS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FLATFILETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getFLATFILEType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCODEPAGE() {
        return cODEPAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCODEPAGE(Object newCODEPAGE) {
        Object oldCODEPAGE = cODEPAGE;
        cODEPAGE = newCODEPAGE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__CODEPAGE, oldCODEPAGE, cODEPAGE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCONSECDELIMITERSASONE() {
        return cONSECDELIMITERSASONE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONSECDELIMITERSASONE(Object newCONSECDELIMITERSASONE) {
        Object oldCONSECDELIMITERSASONE = cONSECDELIMITERSASONE;
        cONSECDELIMITERSASONE = newCONSECDELIMITERSASONE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__CONSECDELIMITERSASONE, oldCONSECDELIMITERSASONE, cONSECDELIMITERSASONE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDELIMITED() {
        return dELIMITED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDELIMITED(Object newDELIMITED) {
        Object oldDELIMITED = dELIMITED;
        dELIMITED = newDELIMITED;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__DELIMITED, oldDELIMITED, dELIMITED));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDELIMITERS() {
        return dELIMITERS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDELIMITERS(Object newDELIMITERS) {
        Object oldDELIMITERS = dELIMITERS;
        dELIMITERS = newDELIMITERS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__DELIMITERS, oldDELIMITERS, dELIMITERS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDELIMITERSINBINARY() {
        return dELIMITERSINBINARY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDELIMITERSINBINARY(Object newDELIMITERSINBINARY) {
        Object oldDELIMITERSINBINARY = dELIMITERSINBINARY;
        dELIMITERSINBINARY = newDELIMITERSINBINARY;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__DELIMITERSINBINARY, oldDELIMITERSINBINARY, dELIMITERSINBINARY));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getESCAPECHARACTER() {
        return eSCAPECHARACTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setESCAPECHARACTER(Object newESCAPECHARACTER) {
        Object oldESCAPECHARACTER = eSCAPECHARACTER;
        eSCAPECHARACTER = newESCAPECHARACTER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__ESCAPECHARACTER, oldESCAPECHARACTER, eSCAPECHARACTER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFILENAME() {
        return fILENAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFILENAME(Object newFILENAME) {
        Object oldFILENAME = fILENAME;
        fILENAME = newFILENAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__FILENAME, oldFILENAME, fILENAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFILETYPE() {
        return fILETYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFILETYPE(Object newFILETYPE) {
        Object oldFILETYPE = fILETYPE;
        fILETYPE = newFILETYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__FILETYPE, oldFILETYPE, fILETYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getKEEPESCAPECHAR() {
        return kEEPESCAPECHAR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKEEPESCAPECHAR(Object newKEEPESCAPECHAR) {
        Object oldKEEPESCAPECHAR = kEEPESCAPECHAR;
        kEEPESCAPECHAR = newKEEPESCAPECHAR;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__KEEPESCAPECHAR, oldKEEPESCAPECHAR, kEEPESCAPECHAR));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getLINESEQUENTIAL() {
        return lINESEQUENTIAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLINESEQUENTIAL(Object newLINESEQUENTIAL) {
        Object oldLINESEQUENTIAL = lINESEQUENTIAL;
        lINESEQUENTIAL = newLINESEQUENTIAL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__LINESEQUENTIAL, oldLINESEQUENTIAL, lINESEQUENTIAL));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getNULLCHARACTER() {
        return nULLCHARACTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNULLCHARACTER(Object newNULLCHARACTER) {
        Object oldNULLCHARACTER = nULLCHARACTER;
        nULLCHARACTER = newNULLCHARACTER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__NULLCHARACTER, oldNULLCHARACTER, nULLCHARACTER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NULLCHARTYPEType getNULLCHARTYPE() {
        return nULLCHARTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNULLCHARTYPE(NULLCHARTYPEType newNULLCHARTYPE) {
        NULLCHARTYPEType oldNULLCHARTYPE = nULLCHARTYPE;
        nULLCHARTYPE = newNULLCHARTYPE == null ? NULLCHARTYPE_EDEFAULT : newNULLCHARTYPE;
        boolean oldNULLCHARTYPEESet = nULLCHARTYPEESet;
        nULLCHARTYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__NULLCHARTYPE, oldNULLCHARTYPE, nULLCHARTYPE, !oldNULLCHARTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNULLCHARTYPE() {
        NULLCHARTYPEType oldNULLCHARTYPE = nULLCHARTYPE;
        boolean oldNULLCHARTYPEESet = nULLCHARTYPEESet;
        nULLCHARTYPE = NULLCHARTYPE_EDEFAULT;
        nULLCHARTYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.FLATFILE_TYPE__NULLCHARTYPE, oldNULLCHARTYPE, NULLCHARTYPE_EDEFAULT, oldNULLCHARTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNULLCHARTYPE() {
        return nULLCHARTYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPADBYTES() {
        return pADBYTES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPADBYTES(Object newPADBYTES) {
        Object oldPADBYTES = pADBYTES;
        pADBYTES = newPADBYTES;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__PADBYTES, oldPADBYTES, pADBYTES));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getQUOTECHARACTER() {
        return qUOTECHARACTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setQUOTECHARACTER(Object newQUOTECHARACTER) {
        Object oldQUOTECHARACTER = qUOTECHARACTER;
        qUOTECHARACTER = newQUOTECHARACTER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__QUOTECHARACTER, oldQUOTECHARACTER, qUOTECHARACTER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREPEATABLE() {
        return rEPEATABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREPEATABLE(Object newREPEATABLE) {
        Object oldREPEATABLE = rEPEATABLE;
        rEPEATABLE = newREPEATABLE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__REPEATABLE, oldREPEATABLE, rEPEATABLE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getROWDELIMITER() {
        return rOWDELIMITER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setROWDELIMITER(Object newROWDELIMITER) {
        Object oldROWDELIMITER = rOWDELIMITER;
        rOWDELIMITER = newROWDELIMITER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__ROWDELIMITER, oldROWDELIMITER, rOWDELIMITER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSHIFTSENSITIVEDATA() {
        return sHIFTSENSITIVEDATA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSHIFTSENSITIVEDATA(Object newSHIFTSENSITIVEDATA) {
        Object oldSHIFTSENSITIVEDATA = sHIFTSENSITIVEDATA;
        sHIFTSENSITIVEDATA = newSHIFTSENSITIVEDATA;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__SHIFTSENSITIVEDATA, oldSHIFTSENSITIVEDATA, sHIFTSENSITIVEDATA));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSKIPLEADINGBYTES() {
        return sKIPLEADINGBYTES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSKIPLEADINGBYTES(Object newSKIPLEADINGBYTES) {
        Object oldSKIPLEADINGBYTES = sKIPLEADINGBYTES;
        sKIPLEADINGBYTES = newSKIPLEADINGBYTES;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__SKIPLEADINGBYTES, oldSKIPLEADINGBYTES, sKIPLEADINGBYTES));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSKIPROWS() {
        return sKIPROWS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSKIPROWS(Object newSKIPROWS) {
        Object oldSKIPROWS = sKIPROWS;
        sKIPROWS = newSKIPROWS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__SKIPROWS, oldSKIPROWS, sKIPROWS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSKIPTRAILINGBYTES() {
        return sKIPTRAILINGBYTES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSKIPTRAILINGBYTES(Object newSKIPTRAILINGBYTES) {
        Object oldSKIPTRAILINGBYTES = sKIPTRAILINGBYTES;
        sKIPTRAILINGBYTES = newSKIPTRAILINGBYTES;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__SKIPTRAILINGBYTES, oldSKIPTRAILINGBYTES, sKIPTRAILINGBYTES));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public STAGEFILEPERSISTType getSTAGEFILEPERSIST() {
        return sTAGEFILEPERSIST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSTAGEFILEPERSIST(STAGEFILEPERSISTType newSTAGEFILEPERSIST) {
        STAGEFILEPERSISTType oldSTAGEFILEPERSIST = sTAGEFILEPERSIST;
        sTAGEFILEPERSIST = newSTAGEFILEPERSIST == null ? STAGEFILEPERSIST_EDEFAULT : newSTAGEFILEPERSIST;
        boolean oldSTAGEFILEPERSISTESet = sTAGEFILEPERSISTESet;
        sTAGEFILEPERSISTESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__STAGEFILEPERSIST, oldSTAGEFILEPERSIST, sTAGEFILEPERSIST, !oldSTAGEFILEPERSISTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSTAGEFILEPERSIST() {
        STAGEFILEPERSISTType oldSTAGEFILEPERSIST = sTAGEFILEPERSIST;
        boolean oldSTAGEFILEPERSISTESet = sTAGEFILEPERSISTESet;
        sTAGEFILEPERSIST = STAGEFILEPERSIST_EDEFAULT;
        sTAGEFILEPERSISTESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.FLATFILE_TYPE__STAGEFILEPERSIST, oldSTAGEFILEPERSIST, STAGEFILEPERSIST_EDEFAULT, oldSTAGEFILEPERSISTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSTAGEFILEPERSIST() {
        return sTAGEFILEPERSISTESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public STAGEFILEREINITType getSTAGEFILEREINIT() {
        return sTAGEFILEREINIT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSTAGEFILEREINIT(STAGEFILEREINITType newSTAGEFILEREINIT) {
        STAGEFILEREINITType oldSTAGEFILEREINIT = sTAGEFILEREINIT;
        sTAGEFILEREINIT = newSTAGEFILEREINIT == null ? STAGEFILEREINIT_EDEFAULT : newSTAGEFILEREINIT;
        boolean oldSTAGEFILEREINITESet = sTAGEFILEREINITESet;
        sTAGEFILEREINITESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__STAGEFILEREINIT, oldSTAGEFILEREINIT, sTAGEFILEREINIT, !oldSTAGEFILEREINITESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSTAGEFILEREINIT() {
        STAGEFILEREINITType oldSTAGEFILEREINIT = sTAGEFILEREINIT;
        boolean oldSTAGEFILEREINITESet = sTAGEFILEREINITESet;
        sTAGEFILEREINIT = STAGEFILEREINIT_EDEFAULT;
        sTAGEFILEREINITESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.FLATFILE_TYPE__STAGEFILEREINIT, oldSTAGEFILEREINIT, STAGEFILEREINIT_EDEFAULT, oldSTAGEFILEREINITESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSTAGEFILEREINIT() {
        return sTAGEFILEREINITESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSTRIPTRAILINGBLANKS() {
        return sTRIPTRAILINGBLANKS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSTRIPTRAILINGBLANKS(Object newSTRIPTRAILINGBLANKS) {
        Object oldSTRIPTRAILINGBLANKS = sTRIPTRAILINGBLANKS;
        sTRIPTRAILINGBLANKS = newSTRIPTRAILINGBLANKS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FLATFILE_TYPE__STRIPTRAILINGBLANKS, oldSTRIPTRAILINGBLANKS, sTRIPTRAILINGBLANKS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.FLATFILE_TYPE__CODEPAGE:
                return getCODEPAGE();
            case PowrmartPackage.FLATFILE_TYPE__CONSECDELIMITERSASONE:
                return getCONSECDELIMITERSASONE();
            case PowrmartPackage.FLATFILE_TYPE__DELIMITED:
                return getDELIMITED();
            case PowrmartPackage.FLATFILE_TYPE__DELIMITERS:
                return getDELIMITERS();
            case PowrmartPackage.FLATFILE_TYPE__DELIMITERSINBINARY:
                return getDELIMITERSINBINARY();
            case PowrmartPackage.FLATFILE_TYPE__ESCAPECHARACTER:
                return getESCAPECHARACTER();
            case PowrmartPackage.FLATFILE_TYPE__FILENAME:
                return getFILENAME();
            case PowrmartPackage.FLATFILE_TYPE__FILETYPE:
                return getFILETYPE();
            case PowrmartPackage.FLATFILE_TYPE__KEEPESCAPECHAR:
                return getKEEPESCAPECHAR();
            case PowrmartPackage.FLATFILE_TYPE__LINESEQUENTIAL:
                return getLINESEQUENTIAL();
            case PowrmartPackage.FLATFILE_TYPE__NULLCHARACTER:
                return getNULLCHARACTER();
            case PowrmartPackage.FLATFILE_TYPE__NULLCHARTYPE:
                return getNULLCHARTYPE();
            case PowrmartPackage.FLATFILE_TYPE__PADBYTES:
                return getPADBYTES();
            case PowrmartPackage.FLATFILE_TYPE__QUOTECHARACTER:
                return getQUOTECHARACTER();
            case PowrmartPackage.FLATFILE_TYPE__REPEATABLE:
                return getREPEATABLE();
            case PowrmartPackage.FLATFILE_TYPE__ROWDELIMITER:
                return getROWDELIMITER();
            case PowrmartPackage.FLATFILE_TYPE__SHIFTSENSITIVEDATA:
                return getSHIFTSENSITIVEDATA();
            case PowrmartPackage.FLATFILE_TYPE__SKIPLEADINGBYTES:
                return getSKIPLEADINGBYTES();
            case PowrmartPackage.FLATFILE_TYPE__SKIPROWS:
                return getSKIPROWS();
            case PowrmartPackage.FLATFILE_TYPE__SKIPTRAILINGBYTES:
                return getSKIPTRAILINGBYTES();
            case PowrmartPackage.FLATFILE_TYPE__STAGEFILEPERSIST:
                return getSTAGEFILEPERSIST();
            case PowrmartPackage.FLATFILE_TYPE__STAGEFILEREINIT:
                return getSTAGEFILEREINIT();
            case PowrmartPackage.FLATFILE_TYPE__STRIPTRAILINGBLANKS:
                return getSTRIPTRAILINGBLANKS();
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
            case PowrmartPackage.FLATFILE_TYPE__CODEPAGE:
                setCODEPAGE(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__CONSECDELIMITERSASONE:
                setCONSECDELIMITERSASONE(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__DELIMITED:
                setDELIMITED(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__DELIMITERS:
                setDELIMITERS(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__DELIMITERSINBINARY:
                setDELIMITERSINBINARY(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__ESCAPECHARACTER:
                setESCAPECHARACTER(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__FILENAME:
                setFILENAME(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__FILETYPE:
                setFILETYPE(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__KEEPESCAPECHAR:
                setKEEPESCAPECHAR(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__LINESEQUENTIAL:
                setLINESEQUENTIAL(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__NULLCHARACTER:
                setNULLCHARACTER(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__NULLCHARTYPE:
                setNULLCHARTYPE((NULLCHARTYPEType)newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__PADBYTES:
                setPADBYTES(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__QUOTECHARACTER:
                setQUOTECHARACTER(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__REPEATABLE:
                setREPEATABLE(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__ROWDELIMITER:
                setROWDELIMITER(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__SHIFTSENSITIVEDATA:
                setSHIFTSENSITIVEDATA(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__SKIPLEADINGBYTES:
                setSKIPLEADINGBYTES(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__SKIPROWS:
                setSKIPROWS(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__SKIPTRAILINGBYTES:
                setSKIPTRAILINGBYTES(newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__STAGEFILEPERSIST:
                setSTAGEFILEPERSIST((STAGEFILEPERSISTType)newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__STAGEFILEREINIT:
                setSTAGEFILEREINIT((STAGEFILEREINITType)newValue);
                return;
            case PowrmartPackage.FLATFILE_TYPE__STRIPTRAILINGBLANKS:
                setSTRIPTRAILINGBLANKS(newValue);
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
            case PowrmartPackage.FLATFILE_TYPE__CODEPAGE:
                setCODEPAGE(CODEPAGE_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__CONSECDELIMITERSASONE:
                setCONSECDELIMITERSASONE(CONSECDELIMITERSASONE_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__DELIMITED:
                setDELIMITED(DELIMITED_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__DELIMITERS:
                setDELIMITERS(DELIMITERS_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__DELIMITERSINBINARY:
                setDELIMITERSINBINARY(DELIMITERSINBINARY_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__ESCAPECHARACTER:
                setESCAPECHARACTER(ESCAPECHARACTER_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__FILENAME:
                setFILENAME(FILENAME_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__FILETYPE:
                setFILETYPE(FILETYPE_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__KEEPESCAPECHAR:
                setKEEPESCAPECHAR(KEEPESCAPECHAR_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__LINESEQUENTIAL:
                setLINESEQUENTIAL(LINESEQUENTIAL_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__NULLCHARACTER:
                setNULLCHARACTER(NULLCHARACTER_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__NULLCHARTYPE:
                unsetNULLCHARTYPE();
                return;
            case PowrmartPackage.FLATFILE_TYPE__PADBYTES:
                setPADBYTES(PADBYTES_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__QUOTECHARACTER:
                setQUOTECHARACTER(QUOTECHARACTER_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__REPEATABLE:
                setREPEATABLE(REPEATABLE_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__ROWDELIMITER:
                setROWDELIMITER(ROWDELIMITER_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__SHIFTSENSITIVEDATA:
                setSHIFTSENSITIVEDATA(SHIFTSENSITIVEDATA_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__SKIPLEADINGBYTES:
                setSKIPLEADINGBYTES(SKIPLEADINGBYTES_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__SKIPROWS:
                setSKIPROWS(SKIPROWS_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__SKIPTRAILINGBYTES:
                setSKIPTRAILINGBYTES(SKIPTRAILINGBYTES_EDEFAULT);
                return;
            case PowrmartPackage.FLATFILE_TYPE__STAGEFILEPERSIST:
                unsetSTAGEFILEPERSIST();
                return;
            case PowrmartPackage.FLATFILE_TYPE__STAGEFILEREINIT:
                unsetSTAGEFILEREINIT();
                return;
            case PowrmartPackage.FLATFILE_TYPE__STRIPTRAILINGBLANKS:
                setSTRIPTRAILINGBLANKS(STRIPTRAILINGBLANKS_EDEFAULT);
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
            case PowrmartPackage.FLATFILE_TYPE__CODEPAGE:
                return CODEPAGE_EDEFAULT == null ? cODEPAGE != null : !CODEPAGE_EDEFAULT.equals(cODEPAGE);
            case PowrmartPackage.FLATFILE_TYPE__CONSECDELIMITERSASONE:
                return CONSECDELIMITERSASONE_EDEFAULT == null ? cONSECDELIMITERSASONE != null : !CONSECDELIMITERSASONE_EDEFAULT.equals(cONSECDELIMITERSASONE);
            case PowrmartPackage.FLATFILE_TYPE__DELIMITED:
                return DELIMITED_EDEFAULT == null ? dELIMITED != null : !DELIMITED_EDEFAULT.equals(dELIMITED);
            case PowrmartPackage.FLATFILE_TYPE__DELIMITERS:
                return DELIMITERS_EDEFAULT == null ? dELIMITERS != null : !DELIMITERS_EDEFAULT.equals(dELIMITERS);
            case PowrmartPackage.FLATFILE_TYPE__DELIMITERSINBINARY:
                return DELIMITERSINBINARY_EDEFAULT == null ? dELIMITERSINBINARY != null : !DELIMITERSINBINARY_EDEFAULT.equals(dELIMITERSINBINARY);
            case PowrmartPackage.FLATFILE_TYPE__ESCAPECHARACTER:
                return ESCAPECHARACTER_EDEFAULT == null ? eSCAPECHARACTER != null : !ESCAPECHARACTER_EDEFAULT.equals(eSCAPECHARACTER);
            case PowrmartPackage.FLATFILE_TYPE__FILENAME:
                return FILENAME_EDEFAULT == null ? fILENAME != null : !FILENAME_EDEFAULT.equals(fILENAME);
            case PowrmartPackage.FLATFILE_TYPE__FILETYPE:
                return FILETYPE_EDEFAULT == null ? fILETYPE != null : !FILETYPE_EDEFAULT.equals(fILETYPE);
            case PowrmartPackage.FLATFILE_TYPE__KEEPESCAPECHAR:
                return KEEPESCAPECHAR_EDEFAULT == null ? kEEPESCAPECHAR != null : !KEEPESCAPECHAR_EDEFAULT.equals(kEEPESCAPECHAR);
            case PowrmartPackage.FLATFILE_TYPE__LINESEQUENTIAL:
                return LINESEQUENTIAL_EDEFAULT == null ? lINESEQUENTIAL != null : !LINESEQUENTIAL_EDEFAULT.equals(lINESEQUENTIAL);
            case PowrmartPackage.FLATFILE_TYPE__NULLCHARACTER:
                return NULLCHARACTER_EDEFAULT == null ? nULLCHARACTER != null : !NULLCHARACTER_EDEFAULT.equals(nULLCHARACTER);
            case PowrmartPackage.FLATFILE_TYPE__NULLCHARTYPE:
                return isSetNULLCHARTYPE();
            case PowrmartPackage.FLATFILE_TYPE__PADBYTES:
                return PADBYTES_EDEFAULT == null ? pADBYTES != null : !PADBYTES_EDEFAULT.equals(pADBYTES);
            case PowrmartPackage.FLATFILE_TYPE__QUOTECHARACTER:
                return QUOTECHARACTER_EDEFAULT == null ? qUOTECHARACTER != null : !QUOTECHARACTER_EDEFAULT.equals(qUOTECHARACTER);
            case PowrmartPackage.FLATFILE_TYPE__REPEATABLE:
                return REPEATABLE_EDEFAULT == null ? rEPEATABLE != null : !REPEATABLE_EDEFAULT.equals(rEPEATABLE);
            case PowrmartPackage.FLATFILE_TYPE__ROWDELIMITER:
                return ROWDELIMITER_EDEFAULT == null ? rOWDELIMITER != null : !ROWDELIMITER_EDEFAULT.equals(rOWDELIMITER);
            case PowrmartPackage.FLATFILE_TYPE__SHIFTSENSITIVEDATA:
                return SHIFTSENSITIVEDATA_EDEFAULT == null ? sHIFTSENSITIVEDATA != null : !SHIFTSENSITIVEDATA_EDEFAULT.equals(sHIFTSENSITIVEDATA);
            case PowrmartPackage.FLATFILE_TYPE__SKIPLEADINGBYTES:
                return SKIPLEADINGBYTES_EDEFAULT == null ? sKIPLEADINGBYTES != null : !SKIPLEADINGBYTES_EDEFAULT.equals(sKIPLEADINGBYTES);
            case PowrmartPackage.FLATFILE_TYPE__SKIPROWS:
                return SKIPROWS_EDEFAULT == null ? sKIPROWS != null : !SKIPROWS_EDEFAULT.equals(sKIPROWS);
            case PowrmartPackage.FLATFILE_TYPE__SKIPTRAILINGBYTES:
                return SKIPTRAILINGBYTES_EDEFAULT == null ? sKIPTRAILINGBYTES != null : !SKIPTRAILINGBYTES_EDEFAULT.equals(sKIPTRAILINGBYTES);
            case PowrmartPackage.FLATFILE_TYPE__STAGEFILEPERSIST:
                return isSetSTAGEFILEPERSIST();
            case PowrmartPackage.FLATFILE_TYPE__STAGEFILEREINIT:
                return isSetSTAGEFILEREINIT();
            case PowrmartPackage.FLATFILE_TYPE__STRIPTRAILINGBLANKS:
                return STRIPTRAILINGBLANKS_EDEFAULT == null ? sTRIPTRAILINGBLANKS != null : !STRIPTRAILINGBLANKS_EDEFAULT.equals(sTRIPTRAILINGBLANKS);
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
        result.append(" (cODEPAGE: ");
        result.append(cODEPAGE);
        result.append(", cONSECDELIMITERSASONE: ");
        result.append(cONSECDELIMITERSASONE);
        result.append(", dELIMITED: ");
        result.append(dELIMITED);
        result.append(", dELIMITERS: ");
        result.append(dELIMITERS);
        result.append(", dELIMITERSINBINARY: ");
        result.append(dELIMITERSINBINARY);
        result.append(", eSCAPECHARACTER: ");
        result.append(eSCAPECHARACTER);
        result.append(", fILENAME: ");
        result.append(fILENAME);
        result.append(", fILETYPE: ");
        result.append(fILETYPE);
        result.append(", kEEPESCAPECHAR: ");
        result.append(kEEPESCAPECHAR);
        result.append(", lINESEQUENTIAL: ");
        result.append(lINESEQUENTIAL);
        result.append(", nULLCHARACTER: ");
        result.append(nULLCHARACTER);
        result.append(", nULLCHARTYPE: ");
        if (nULLCHARTYPEESet) result.append(nULLCHARTYPE); else result.append("<unset>");
        result.append(", pADBYTES: ");
        result.append(pADBYTES);
        result.append(", qUOTECHARACTER: ");
        result.append(qUOTECHARACTER);
        result.append(", rEPEATABLE: ");
        result.append(rEPEATABLE);
        result.append(", rOWDELIMITER: ");
        result.append(rOWDELIMITER);
        result.append(", sHIFTSENSITIVEDATA: ");
        result.append(sHIFTSENSITIVEDATA);
        result.append(", sKIPLEADINGBYTES: ");
        result.append(sKIPLEADINGBYTES);
        result.append(", sKIPROWS: ");
        result.append(sKIPROWS);
        result.append(", sKIPTRAILINGBYTES: ");
        result.append(sKIPTRAILINGBYTES);
        result.append(", sTAGEFILEPERSIST: ");
        if (sTAGEFILEPERSISTESet) result.append(sTAGEFILEPERSIST); else result.append("<unset>");
        result.append(", sTAGEFILEREINIT: ");
        if (sTAGEFILEREINITESet) result.append(sTAGEFILEREINIT); else result.append("<unset>");
        result.append(", sTRIPTRAILINGBLANKS: ");
        result.append(sTRIPTRAILINGBLANKS);
        result.append(')');
        return result.toString();
    }

} //FLATFILETypeImpl
