/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.FIELDATTRIBUTEType;
import Powrmart.NULLABLEType1;
import Powrmart.SOURCEFIELDType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Powrmart.SOURCEFIELDType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SOURCEFIELDTypeValidator {
    boolean validate();

    boolean validateSOURCEFIELD(EList<SOURCEFIELDType> value);
    boolean validateFIELDATTRIBUTE(EList<FIELDATTRIBUTEType> value);
    boolean validateBUSINESSNAME(Object value);
    boolean validateDATATYPE(Object value);
    boolean validateDESCRIPTION(Object value);
    boolean validateFIELDNUMBER(Object value);
    boolean validateFIELDTYPE(Object value);
    boolean validateGROUP(Object value);
    boolean validateHIDDEN(Object value);
    boolean validateKEYTYPE(Object value);
    boolean validateLENGTH(Object value);
    boolean validateLEVEL(Object value);
    boolean validateNAME(Object value);
    boolean validateNULLABLE(NULLABLEType1 value);
    boolean validateOCCURS(Object value);
    boolean validateOFFSET(Object value);
    boolean validatePHYSICALLENGTH(Object value);
    boolean validatePHYSICALOFFSET(Object value);
    boolean validatePICTURETEXT(Object value);
    boolean validatePRECISION(Object value);
    boolean validateREDEFINES(Object value);
    boolean validateREFERENCEDDBD(Object value);
    boolean validateREFERENCEDFIELD(Object value);
    boolean validateREFERENCEDTABLE(Object value);
    boolean validateSCALE(Object value);
    boolean validateSHIFTSTATE(Object value);
    boolean validateUSAGE(Object value);
    boolean validateUSAGEFLAGS(Object value);
}
