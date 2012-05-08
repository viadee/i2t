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
 * A representation of the literals of the enumeration '<em><b>AGGFUNCTION Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getAGGFUNCTIONType()
 * @model extendedMetaData="name='AGGFUNCTION_._type'"
 * @generated
 */
public enum AGGFUNCTIONType implements Enumerator {
    /**
     * The '<em><b>COUNT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COUNT_VALUE
     * @generated
     * @ordered
     */
    COUNT(0, "COUNT", "COUNT"),

    /**
     * The '<em><b>MIN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MIN_VALUE
     * @generated
     * @ordered
     */
    MIN(1, "MIN", "MIN"),

    /**
     * The '<em><b>MAX</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAX_VALUE
     * @generated
     * @ordered
     */
    MAX(2, "MAX", "MAX"),

    /**
     * The '<em><b>NONE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE(3, "NONE", "NONE");

    /**
     * The '<em><b>COUNT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>COUNT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COUNT
     * @model
     * @generated
     * @ordered
     */
    public static final int COUNT_VALUE = 0;

    /**
     * The '<em><b>MIN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MIN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MIN
     * @model
     * @generated
     * @ordered
     */
    public static final int MIN_VALUE = 1;

    /**
     * The '<em><b>MAX</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MAX</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAX
     * @model
     * @generated
     * @ordered
     */
    public static final int MAX_VALUE = 2;

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
    public static final int NONE_VALUE = 3;

    /**
     * An array of all the '<em><b>AGGFUNCTION Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AGGFUNCTIONType[] VALUES_ARRAY =
        new AGGFUNCTIONType[] {
            COUNT,
            MIN,
            MAX,
            NONE,
        };

    /**
     * A public read-only list of all the '<em><b>AGGFUNCTION Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<AGGFUNCTIONType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>AGGFUNCTION Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AGGFUNCTIONType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AGGFUNCTIONType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>AGGFUNCTION Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AGGFUNCTIONType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AGGFUNCTIONType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>AGGFUNCTION Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AGGFUNCTIONType get(int value) {
        switch (value) {
            case COUNT_VALUE: return COUNT;
            case MIN_VALUE: return MIN;
            case MAX_VALUE: return MAX;
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
    private AGGFUNCTIONType(int value, String name, String literal) {
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
    
} //AGGFUNCTIONType
