/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile.validation;

import org.eclipse.emf.common.util.EList;

import talendfile.ContextParameterType;

/**
 * A sample validator interface for {@link talendfile.ContextType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ContextTypeValidator {
    boolean validate();

    boolean validateContextParameter(EList<ContextParameterType> value);
    boolean validateConfirmationNeeded(boolean value);
    boolean validateName(String value);
}