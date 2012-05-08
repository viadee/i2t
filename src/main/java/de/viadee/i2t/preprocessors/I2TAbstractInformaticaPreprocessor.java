package de.viadee.i2t.preprocessors;

import Powrmart.PowrmartFactory;

/**
 * Abstract super class for all preprocessors on the Informatica structure.
 * The Informatica XML structure is changed before to come closer to the Talend structure.
 * @author GrS 02.11.2011
 */
public abstract class I2TAbstractInformaticaPreprocessor {

    /**
     * Powrmart factory creates Informatica structures
     */
    protected PowrmartFactory pf = PowrmartFactory.eINSTANCE;
}