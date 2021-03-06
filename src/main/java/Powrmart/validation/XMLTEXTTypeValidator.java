/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.TYPEType;

/**
 * A sample validator interface for {@link Powrmart.XMLTEXTType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface XMLTEXTTypeValidator {
    boolean validate();

    boolean validateNAMESPACE(Object value);
    boolean validateTEXT(Object value);
    boolean validateTYPE(TYPEType value);
}
