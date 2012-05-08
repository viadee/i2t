/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.FLATFILEType;
import Powrmart.GROUPType;
import Powrmart.KEYWORDType;
import Powrmart.METADATAEXTENSIONType;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TARGETFIELDType;
import Powrmart.TARGETINDEXType;
import Powrmart.XMLINFOType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Powrmart.TARGETType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TARGETTypeValidator {
    boolean validate();

    boolean validateKEYWORD(EList<KEYWORDType> value);
    boolean validateFLATFILE(FLATFILEType value);
    boolean validateXMLINFO(XMLINFOType value);
    boolean validateGROUP(EList<GROUPType> value);
    boolean validateTARGETFIELD(EList<TARGETFIELDType> value);
    boolean validateTARGETINDEX(EList<TARGETINDEXType> value);
    boolean validateTABLEATTRIBUTE(EList<TABLEATTRIBUTEType> value);
    boolean validateMETADATAEXTENSION(EList<METADATAEXTENSIONType> value);
    boolean validateBUSINESSNAME(Object value);
    boolean validateCOMPONENTVERSION(Object value);
    boolean validateCONSTRAINT(Object value);
    boolean validateCRCVALUE(Object value);
    boolean validateDATABASETYPE(Object value);
    boolean validateDESCRIPTION(Object value);
    boolean validateNAME(Object value);
    boolean validateOBJECTVERSION(Object value);
    boolean validateTABLEOPTIONS(Object value);
    boolean validateTABLETYPE(Object value);
    boolean validateVERSIONNUMBER(Object value);
}
