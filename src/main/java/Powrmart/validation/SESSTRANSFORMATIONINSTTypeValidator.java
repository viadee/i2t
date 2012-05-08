/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.ATTRIBUTEType;
import Powrmart.FLATFILEType;
import Powrmart.HASHKEYType;
import Powrmart.ISREPARTITIONPOINTType;
import Powrmart.PARTITIONType;
import Powrmart.SESSTRANSFORMATIONGROUPType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Powrmart.SESSTRANSFORMATIONINSTType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SESSTRANSFORMATIONINSTTypeValidator {
    boolean validate();

    boolean validateSESSTRANSFORMATIONGROUP(EList<SESSTRANSFORMATIONGROUPType> value);
    boolean validatePARTITION(EList<PARTITIONType> value);
    boolean validateHASHKEY(EList<HASHKEYType> value);
    boolean validateFLATFILE(EList<FLATFILEType> value);
    boolean validateATTRIBUTE(EList<ATTRIBUTEType> value);
    boolean validateISREPARTITIONPOINT(ISREPARTITIONPOINTType value);
    boolean validatePARTITIONTYPE(Object value);
    boolean validatePIPELINE(Object value);
    boolean validateSINSTANCENAME(Object value);
    boolean validateSTAGE(Object value);
    boolean validateTRANSFORMATIONNAME(Object value);
    boolean validateTRANSFORMATIONTYPE(Object value);
}