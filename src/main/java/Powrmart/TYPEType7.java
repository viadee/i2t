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
 * A representation of the literals of the enumeration '<em><b>TYPE Type7</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getTYPEType7()
 * @model extendedMetaData="name='TYPE_._7_._type'"
 * @generated
 */
public enum TYPEType7 implements Enumerator {
    /**
     * The '<em><b>INPUT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INPUT_VALUE
     * @generated
     * @ordered
     */
    INPUT(0, "INPUT", "INPUT"),

    /**
     * The '<em><b>OUTPUT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OUTPUT_VALUE
     * @generated
     * @ordered
     */
    OUTPUT(1, "OUTPUT", "OUTPUT"),

    /**
     * The '<em><b>TABLE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TABLE_VALUE
     * @generated
     * @ordered
     */
    TABLE(2, "TABLE", "TABLE"),

    /**
     * The '<em><b>CHANGING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHANGING_VALUE
     * @generated
     * @ordered
     */
    CHANGING(3, "CHANGING", "CHANGING"),

    /**
     * The '<em><b>NONE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE(4, "NONE", "NONE");

    /**
     * The '<em><b>INPUT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>INPUT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INPUT
     * @model
     * @generated
     * @ordered
     */
    public static final int INPUT_VALUE = 0;

    /**
     * The '<em><b>OUTPUT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>OUTPUT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OUTPUT
     * @model
     * @generated
     * @ordered
     */
    public static final int OUTPUT_VALUE = 1;

    /**
     * The '<em><b>TABLE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>TABLE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TABLE
     * @model
     * @generated
     * @ordered
     */
    public static final int TABLE_VALUE = 2;

    /**
     * The '<em><b>CHANGING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CHANGING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CHANGING
     * @model
     * @generated
     * @ordered
     */
    public static final int CHANGING_VALUE = 3;

    /**
     * The '<em><b>NONE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NONE
     * @model
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 4;

    /**
     * An array of all the '<em><b>TYPE Type7</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TYPEType7[] VALUES_ARRAY =
        new TYPEType7[] {
            INPUT,
            OUTPUT,
            TABLE,
            CHANGING,
            NONE,
        };

    /**
     * A public read-only list of all the '<em><b>TYPE Type7</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<TYPEType7> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>TYPE Type7</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TYPEType7 get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TYPEType7 result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>TYPE Type7</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TYPEType7 getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TYPEType7 result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>TYPE Type7</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TYPEType7 get(int value) {
        switch (value) {
            case INPUT_VALUE: return INPUT;
            case OUTPUT_VALUE: return OUTPUT;
            case TABLE_VALUE: return TABLE;
            case CHANGING_VALUE: return CHANGING;
            case NONE_VALUE: return NONE;
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
    private TYPEType7(int value, String name, String literal) {
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
    
} //TYPEType7
