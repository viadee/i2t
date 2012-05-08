/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>NULLCHARTYPE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getNULLCHARTYPEType()
 * @model extendedMetaData="name='NULLCHARTYPE_._type'"
 * @generated
 */
public enum NULLCHARTYPEType implements Enumerator {
    /**
     * The '<em><b>BINARY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BINARY_VALUE
     * @generated
     * @ordered
     */
    BINARY(0, "BINARY", "BINARY"),

    /**
     * The '<em><b>ASCII</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASCII_VALUE
     * @generated
     * @ordered
     */
    ASCII(1, "ASCII", "ASCII");

    /**
     * The '<em><b>BINARY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BINARY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BINARY
     * @model
     * @generated
     * @ordered
     */
    public static final int BINARY_VALUE = 0;

    /**
     * The '<em><b>ASCII</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ASCII</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASCII
     * @model
     * @generated
     * @ordered
     */
    public static final int ASCII_VALUE = 1;

    /**
     * An array of all the '<em><b>NULLCHARTYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final NULLCHARTYPEType[] VALUES_ARRAY =
        new NULLCHARTYPEType[] {
            BINARY,
            ASCII,
        };

    /**
     * A public read-only list of all the '<em><b>NULLCHARTYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<NULLCHARTYPEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>NULLCHARTYPE Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NULLCHARTYPEType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            NULLCHARTYPEType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>NULLCHARTYPE Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NULLCHARTYPEType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            NULLCHARTYPEType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>NULLCHARTYPE Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NULLCHARTYPEType get(int value) {
        switch (value) {
            case BINARY_VALUE: return BINARY;
            case ASCII_VALUE: return ASCII;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private NULLCHARTYPEType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //NULLCHARTYPEType
