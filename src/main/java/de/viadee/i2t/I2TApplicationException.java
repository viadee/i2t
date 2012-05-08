package de.viadee.i2t;

/**
 * Exception for I2TApplication
 * @author GrS 17.11.2011
 */
public class I2TApplicationException extends Exception {
    private static final long serialVersionUID = -1131991386021800317L;
    public I2TApplicationException()
    {
      super();
    }
    public I2TApplicationException( String s )
    {
      super( s );
    }
}
