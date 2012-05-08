/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.DAYType;
import Powrmart.OCCURRENCEType;

/**
 * A sample validator interface for {@link Powrmart.FILTERType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FILTERTypeValidator {
    boolean validate();

    boolean validateDAY(DAYType value);
    boolean validateDAYOFMONTH(Object value);
    boolean validateOCCURRENCE(OCCURRENCEType value);
}
