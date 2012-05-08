/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.ATTRIBUTEType;
import Powrmart.CONNECTIONREFERENCEType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Powrmart.SESSIONEXTENSIONType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SESSIONEXTENSIONTypeValidator {
    boolean validate();

    boolean validateCONNECTIONREFERENCE(EList<CONNECTIONREFERENCEType> value);
    boolean validateATTRIBUTE(EList<ATTRIBUTEType> value);
    boolean validateCOMPONENTVERSION(Object value);
    boolean validateDSQINSTNAME(Object value);
    boolean validateDSQINSTTYPE(Object value);
    boolean validateNAME(Object value);
    boolean validateSINSTANCENAME(Object value);
    boolean validateSUBTYPE(Object value);
    boolean validateTRANSFORMATIONTYPE(Object value);
    boolean validateTYPE(Object value);
}
