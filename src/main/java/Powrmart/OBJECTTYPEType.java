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
 * A representation of the literals of the enumeration '<em><b>OBJECTTYPE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getOBJECTTYPEType()
 * @model extendedMetaData="name='OBJECTTYPE_._type'"
 * @generated
 */
public enum OBJECTTYPEType implements Enumerator {
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
     * The '<em><b>TARGET</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TARGET_VALUE
     * @generated
     * @ordered
     */
    TARGET(1, "TARGET", "TARGET"),

    /**
     * The '<em><b>TRANSFORMATION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRANSFORMATION_VALUE
     * @generated
     * @ordered
     */
    TRANSFORMATION(2, "TRANSFORMATION", "TRANSFORMATION"),

    /**
     * The '<em><b>MAPPING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAPPING_VALUE
     * @generated
     * @ordered
     */
    MAPPING(3, "MAPPING", "MAPPING"),

    /**
     * The '<em><b>MAPPLET</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAPPLET_VALUE
     * @generated
     * @ordered
     */
    MAPPLET(4, "MAPPLET", "MAPPLET");

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
     * The '<em><b>TARGET</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>TARGET</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TARGET
     * @model
     * @generated
     * @ordered
     */
    public static final int TARGET_VALUE = 1;

    /**
     * The '<em><b>TRANSFORMATION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>TRANSFORMATION</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRANSFORMATION
     * @model
     * @generated
     * @ordered
     */
    public static final int TRANSFORMATION_VALUE = 2;

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
    public static final int MAPPING_VALUE = 3;

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
    public static final int MAPPLET_VALUE = 4;

    /**
     * An array of all the '<em><b>OBJECTTYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final OBJECTTYPEType[] VALUES_ARRAY =
        new OBJECTTYPEType[] {
            SOURCE,
            TARGET,
            TRANSFORMATION,
            MAPPING,
            MAPPLET,
        };

    /**
     * A public read-only list of all the '<em><b>OBJECTTYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<OBJECTTYPEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>OBJECTTYPE Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static OBJECTTYPEType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            OBJECTTYPEType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>OBJECTTYPE Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static OBJECTTYPEType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            OBJECTTYPEType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>OBJECTTYPE Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static OBJECTTYPEType get(int value) {
        switch (value) {
            case SOURCE_VALUE: return SOURCE;
            case TARGET_VALUE: return TARGET;
            case TRANSFORMATION_VALUE: return TRANSFORMATION;
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
    private OBJECTTYPEType(int value, String name, String literal) {
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
    
} //OBJECTTYPEType
