/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.CUSTOMType;
import Powrmart.RECURRINGType;
import Powrmart.SCHEDULETYPEType1;

/**
 * A sample validator interface for {@link Powrmart.SCHEDULEOPTIONSType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SCHEDULEOPTIONSTypeValidator {
    boolean validate();

    boolean validateRECURRING(RECURRINGType value);
    boolean validateCUSTOM(CUSTOMType value);
    boolean validateSCHEDULETYPE(SCHEDULETYPEType1 value);
}
