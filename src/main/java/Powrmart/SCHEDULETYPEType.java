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
 * A representation of the literals of the enumeration '<em><b>SCHEDULETYPE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getSCHEDULETYPEType()
 * @model extendedMetaData="name='SCHEDULETYPE_._type'"
 * @generated
 */
public enum SCHEDULETYPEType implements Enumerator {
    /**
     * The '<em><b>ONDEMAND</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ONDEMAND_VALUE
     * @generated
     * @ordered
     */
    ONDEMAND(0, "ONDEMAND", "ONDEMAND"),

    /**
     * The '<em><b>CONTINUOUS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONTINUOUS_VALUE
     * @generated
     * @ordered
     */
    CONTINUOUS(1, "CONTINUOUS", "CONTINUOUS"),

    /**
     * The '<em><b>ONSERVERINIT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ONSERVERINIT_VALUE
     * @generated
     * @ordered
     */
    ONSERVERINIT(2, "ONSERVERINIT", "ONSERVERINIT");

    /**
     * The '<em><b>ONDEMAND</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ONDEMAND</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ONDEMAND
     * @model
     * @generated
     * @ordered
     */
    public static final int ONDEMAND_VALUE = 0;

    /**
     * The '<em><b>CONTINUOUS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CONTINUOUS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONTINUOUS
     * @model
     * @generated
     * @ordered
     */
    public static final int CONTINUOUS_VALUE = 1;

    /**
     * The '<em><b>ONSERVERINIT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ONSERVERINIT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ONSERVERINIT
     * @model
     * @generated
     * @ordered
     */
    public static final int ONSERVERINIT_VALUE = 2;

    /**
     * An array of all the '<em><b>SCHEDULETYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SCHEDULETYPEType[] VALUES_ARRAY =
        new SCHEDULETYPEType[] {
            ONDEMAND,
            CONTINUOUS,
            ONSERVERINIT,
        };

    /**
     * A public read-only list of all the '<em><b>SCHEDULETYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SCHEDULETYPEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>SCHEDULETYPE Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SCHEDULETYPEType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SCHEDULETYPEType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>SCHEDULETYPE Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SCHEDULETYPEType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SCHEDULETYPEType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>SCHEDULETYPE Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SCHEDULETYPEType get(int value) {
        switch (value) {
            case ONDEMAND_VALUE: return ONDEMAND;
            case CONTINUOUS_VALUE: return CONTINUOUS;
            case ONSERVERINIT_VALUE: return ONSERVERINIT;
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
    private SCHEDULETYPEType(int value, String name, String literal) {
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
    
} //SCHEDULETYPEType
