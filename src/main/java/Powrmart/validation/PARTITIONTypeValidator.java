/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.KEYRANGEType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Powrmart.PARTITIONType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PARTITIONTypeValidator {
    boolean validate();

    boolean validateKEYRANGE(EList<KEYRANGEType> value);
    boolean validateDESCRIPTION(Object value);
    boolean validateNAME(Object value);
}