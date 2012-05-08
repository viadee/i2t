/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.EXPRMACRODEPENDENCYType;
import Powrmart.FIELDDEPENDENCYType;
import Powrmart.FLATFILEType;
import Powrmart.GROUPType;
import Powrmart.INITPROPType;
import Powrmart.METADATAEXTENSIONType;
import Powrmart.PARENTTYPEType3;
import Powrmart.SOURCEFIELDType;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TRANSFORMFIELDATTRDEFType;
import Powrmart.TRANSFORMFIELDType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Powrmart.TRANSFORMATIONType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TRANSFORMATIONTypeValidator {
    boolean validate();

    boolean validateGROUP(EList<GROUPType> value);
    boolean validateSOURCEFIELD(EList<SOURCEFIELDType> value);
    boolean validateTRANSFORMFIELD(EList<TRANSFORMFIELDType> value);
    boolean validateTABLEATTRIBUTE(EList<TABLEATTRIBUTEType> value);
    boolean validateINITPROP(EList<INITPROPType> value);
    boolean validateMETADATAEXTENSION(EList<METADATAEXTENSIONType> value);
    boolean validateTRANSFORMFIELDATTRDEF(EList<TRANSFORMFIELDATTRDEFType> value);
    boolean validateFIELDDEPENDENCY(EList<FIELDDEPENDENCYType> value);
    boolean validateFLATFILE(FLATFILEType value);
    boolean validateEXPRMACRODEPENDENCY(EList<EXPRMACRODEPENDENCYType> value);
    boolean validateCOMPONENTVERSION(Object value);
    boolean validateCRCVALUE(Object value);
    boolean validateDESCRIPTION(Object value);
    boolean validateISVSAMNORMALIZER(Object value);
    boolean validateNAME(Object value);
    boolean validateOBJECTVERSION(Object value);
    boolean validatePARENT(Object value);
    boolean validatePARENTTYPE(PARENTTYPEType3 value);
    boolean validateREFDBDNAME(Object value);
    boolean validateREFSOURCENAME(Object value);
    boolean validateREUSABLE(Object value);
    boolean validateTEMPLATEID(Object value);
    boolean validateTEMPLATENAME(Object value);
    boolean validateTYPE(Object value);
    boolean validateVERSIONNUMBER(Object value);
}