/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.FOLDERType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Powrmart.REPOSITORYType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface REPOSITORYTypeValidator {
    boolean validate();

    boolean validateFOLDER(EList<FOLDERType> value);
    boolean validateCODEPAGE(Object value);
    boolean validateDATABASETYPE(Object value);
    boolean validateNAME(Object value);
    boolean validatePARENTREPOSITORY(Object value);
    boolean validateVERSION(Object value);
}
