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
 * A representation of the literals of the enumeration '<em><b>VALUETYPE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getVALUETYPEType()
 * @model extendedMetaData="name='VALUETYPE_._type'"
 * @generated
 */
public enum VALUETYPEType implements Enumerator {
    /**
     * The '<em><b>CONSTANT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONSTANT_VALUE
     * @generated
     * @ordered
     */
    CONSTANT(0, "CONSTANT", "CONSTANT"),

    /**
     * The '<em><b>VARIABLE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VARIABLE_VALUE
     * @generated
     * @ordered
     */
    VARIABLE(1, "VARIABLE", "VARIABLE"),

    /**
     * The '<em><b>SOURCEFIELD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOURCEFIELD_VALUE
     * @generated
     * @ordered
     */
    SOURCEFIELD(2, "SOURCEFIELD", "SOURCEFIELD"),

    /**
     * The '<em><b>DEFAULT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEFAULT_VALUE
     * @generated
     * @ordered
     */
    DEFAULT(3, "DEFAULT", "DEFAULT"),

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
     * The '<em><b>CONSTANT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CONSTANT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONSTANT
     * @model
     * @generated
     * @ordered
     */
    public static final int CONSTANT_VALUE = 0;

    /**
     * The '<em><b>VARIABLE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VARIABLE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VARIABLE
     * @model
     * @generated
     * @ordered
     */
    public static final int VARIABLE_VALUE = 1;

    /**
     * The '<em><b>SOURCEFIELD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SOURCEFIELD</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SOURCEFIELD
     * @model
     * @generated
     * @ordered
     */
    public static final int SOURCEFIELD_VALUE = 2;

    /**
     * The '<em><b>DEFAULT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DEFAULT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEFAULT
     * @model
     * @generated
     * @ordered
     */
    public static final int DEFAULT_VALUE = 3;

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
     * An array of all the '<em><b>VALUETYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final VALUETYPEType[] VALUES_ARRAY =
        new VALUETYPEType[] {
            CONSTANT,
            VARIABLE,
            SOURCEFIELD,
            DEFAULT,
            NONE,
        };

    /**
     * A public read-only list of all the '<em><b>VALUETYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<VALUETYPEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>VALUETYPE Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static VALUETYPEType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            VALUETYPEType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>VALUETYPE Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static VALUETYPEType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            VALUETYPEType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>VALUETYPE Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static VALUETYPEType get(int value) {
        switch (value) {
            case CONSTANT_VALUE: return CONSTANT;
            case VARIABLE_VALUE: return VARIABLE;
            case SOURCEFIELD_VALUE: return SOURCEFIELD;
            case DEFAULT_VALUE: return DEFAULT;
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
    private VALUETYPEType(int value, String name, String literal) {
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
    
} //VALUETYPEType
