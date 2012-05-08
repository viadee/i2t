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
 * A representation of the literals of the enumeration '<em><b>PARENTTYPE Type3</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getPARENTTYPEType3()
 * @model extendedMetaData="name='PARENT_TYPE_._3_._type'"
 * @generated
 */
public enum PARENTTYPEType3 implements Enumerator {
    /**
     * The '<em><b>MAPPING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAPPING_VALUE
     * @generated
     * @ordered
     */
    MAPPING(0, "MAPPING", "MAPPING"),

    /**
     * The '<em><b>MAPPLET</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAPPLET_VALUE
     * @generated
     * @ordered
     */
    MAPPLET(1, "MAPPLET", "MAPPLET");

    /**
     * The '<em><b>MAPPING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MAPPING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAPPING
     * @model
     * @generated
     * @ordered
     */
    public static final int MAPPING_VALUE = 0;

    /**
     * The '<em><b>MAPPLET</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MAPPLET</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAPPLET
     * @model
     * @generated
     * @ordered
     */
    public static final int MAPPLET_VALUE = 1;

    /**
     * An array of all the '<em><b>PARENTTYPE Type3</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final PARENTTYPEType3[] VALUES_ARRAY =
        new PARENTTYPEType3[] {
            MAPPING,
            MAPPLET,
        };

    /**
     * A public read-only list of all the '<em><b>PARENTTYPE Type3</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<PARENTTYPEType3> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>PARENTTYPE Type3</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PARENTTYPEType3 get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PARENTTYPEType3 result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>PARENTTYPE Type3</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PARENTTYPEType3 getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PARENTTYPEType3 result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>PARENTTYPE Type3</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PARENTTYPEType3 get(int value) {
        switch (value) {
            case MAPPING_VALUE: return MAPPING;
            case MAPPLET_VALUE: return MAPPLET;
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
    private PARENTTYPEType3(int value, String name, String literal) {
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
    
} //PARENTTYPEType3
