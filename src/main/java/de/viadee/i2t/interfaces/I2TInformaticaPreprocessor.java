package de.viadee.i2t.interfaces;

import Powrmart.FOLDERType;

/**
 * Interface has to be implemented by each preprocessor.
 * @author GrS 02.11.2011
 */
public interface I2TInformaticaPreprocessor {
    /**
     * Processes the FOLDERType object executing the implemented preprocessor.
     * @author GrS 10.11.2011 Comment method "process".
     * @param object - FOLDERType object
     * @return FOLDERType
     */
    FOLDERType process(FOLDERType object);
}
