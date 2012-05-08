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
 * A representation of the literals of the enumeration '<em><b>SCHEDULETYPE Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getSCHEDULETYPEType1()
 * @model extendedMetaData="name='SCHEDULETYPE_._1_._type'"
 * @generated
 */
public enum SCHEDULETYPEType1 implements Enumerator {
    /**
     * The '<em><b>ONCE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ONCE_VALUE
     * @generated
     * @ordered
     */
    ONCE(0, "ONCE", "ONCE"),

    /**
     * The '<em><b>RECURRING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RECURRING_VALUE
     * @generated
     * @ordered
     */
    RECURRING(1, "RECURRING", "RECURRING"),

    /**
     * The '<em><b>CUSTOM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CUSTOM_VALUE
     * @generated
     * @ordered
     */
    CUSTOM(2, "CUSTOM", "CUSTOM");

    /**
     * The '<em><b>ONCE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ONCE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ONCE
     * @model
     * @generated
     * @ordered
     */
    public static final int ONCE_VALUE = 0;

    /**
     * The '<em><b>RECURRING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>RECURRING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RECURRING
     * @model
     * @generated
     * @ordered
     */
    public static final int RECURRING_VALUE = 1;

    /**
     * The '<em><b>CUSTOM</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CUSTOM</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CUSTOM
     * @model
     * @generated
     * @ordered
     */
    public static final int CUSTOM_VALUE = 2;

    /**
     * An array of all the '<em><b>SCHEDULETYPE Type1</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SCHEDULETYPEType1[] VALUES_ARRAY =
        new SCHEDULETYPEType1[] {
            ONCE,
            RECURRING,
            CUSTOM,
        };

    /**
     * A public read-only list of all the '<em><b>SCHEDULETYPE Type1</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SCHEDULETYPEType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>SCHEDULETYPE Type1</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SCHEDULETYPEType1 get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SCHEDULETYPEType1 result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>SCHEDULETYPE Type1</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SCHEDULETYPEType1 getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SCHEDULETYPEType1 result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>SCHEDULETYPE Type1</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SCHEDULETYPEType1 get(int value) {
        switch (value) {
            case ONCE_VALUE: return ONCE;
            case RECURRING_VALUE: return RECURRING;
            case CUSTOM_VALUE: return CUSTOM;
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
    private SCHEDULETYPEType1(int value, String name, String literal) {
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
    
} //SCHEDULETYPEType1
