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
 * A representation of the literals of the enumeration '<em><b>TYPE Type4</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getTYPEType4()
 * @model extendedMetaData="name='TYPE_._4_._type'"
 * @generated
 */
public enum TYPEType4 implements Enumerator {
    /**
     * The '<em><b>SOURCE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOURCE_VALUE
     * @generated
     * @ordered
     */
    SOURCE(0, "SOURCE", "SOURCE"),

    /**
     * The '<em><b>FUNCTION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FUNCTION_VALUE
     * @generated
     * @ordered
     */
    FUNCTION(1, "FUNCTION", "FUNCTION"),

    /**
     * The '<em><b>CODEBLOCK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CODEBLOCK_VALUE
     * @generated
     * @ordered
     */
    CODEBLOCK(2, "CODEBLOCK", "CODEBLOCK"),

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
     * The '<em><b>SOURCE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SOURCE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SOURCE
     * @model
     * @generated
     * @ordered
     */
    public static final int SOURCE_VALUE = 0;

    /**
     * The '<em><b>FUNCTION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>FUNCTION</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FUNCTION
     * @model
     * @generated
     * @ordered
     */
    public static final int FUNCTION_VALUE = 1;

    /**
     * The '<em><b>CODEBLOCK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CODEBLOCK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CODEBLOCK
     * @model
     * @generated
     * @ordered
     */
    public static final int CODEBLOCK_VALUE = 2;

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
     * An array of all the '<em><b>TYPE Type4</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TYPEType4[] VALUES_ARRAY =
        new TYPEType4[] {
            SOURCE,
            FUNCTION,
            CODEBLOCK,
            NONE,
        };

    /**
     * A public read-only list of all the '<em><b>TYPE Type4</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<TYPEType4> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>TYPE Type4</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TYPEType4 get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TYPEType4 result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>TYPE Type4</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TYPEType4 getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TYPEType4 result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>TYPE Type4</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TYPEType4 get(int value) {
        switch (value) {
            case SOURCE_VALUE: return SOURCE;
            case FUNCTION_VALUE: return FUNCTION;
            case CODEBLOCK_VALUE: return CODEBLOCK;
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
    private TYPEType4(int value, String name, String literal) {
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
    
} //TYPEType4
