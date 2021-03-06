/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.validation;

import Powrmart.OBJECTTYPEType;
import Powrmart.REFERENCETYPEType;

/**
 * A sample validator interface for {@link Powrmart.SHORTCUTType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SHORTCUTTypeValidator {
    boolean validate();

    boolean validateCOMMENTS(Object value);
    boolean validateDBDNAME(Object value);
    boolean validateFOLDERNAME(Object value);
    boolean validateFOLDERVERSIONNAME(Object value);
    boolean validateNAME(Object value);
    boolean validateOBJECTSUBTYPE(Object value);
    boolean validateOBJECTTYPE(OBJECTTYPEType value);
    boolean validateREFERENCEDDBD(Object value);
    boolean validateREFERENCETYPE(REFERENCETYPEType value);
    boolean validateREFOBJECTNAME(Object value);
    boolean validateREPOSITORYNAME(Object value);
    boolean validateTEMPLATEID(Object value);
    boolean validateVERSIONNUMBER(Object value);
}
