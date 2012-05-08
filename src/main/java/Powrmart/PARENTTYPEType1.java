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
 * A representation of the literals of the enumeration '<em><b>PARENTTYPE Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getPARENTTYPEType1()
 * @model extendedMetaData="name='PARENT_TYPE_._1_._type'"
 * @generated
 */
public enum PARENTTYPEType1 implements Enumerator {
    /**
     * The '<em><b>WORKLET</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WORKLET_VALUE
     * @generated
     * @ordered
     */
    WORKLET(0, "WORKLET", "WORKLET"),

    /**
     * The '<em><b>WORKFLOW</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WORKFLOW_VALUE
     * @generated
     * @ordered
     */
    WORKFLOW(1, "WORKFLOW", "WORKFLOW");

    /**
     * The '<em><b>WORKLET</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WORKLET</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WORKLET
     * @model
     * @generated
     * @ordered
     */
    public static final int WORKLET_VALUE = 0;

    /**
     * The '<em><b>WORKFLOW</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WORKFLOW</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WORKFLOW
     * @model
     * @generated
     * @ordered
     */
    public static final int WORKFLOW_VALUE = 1;

    /**
     * An array of all the '<em><b>PARENTTYPE Type1</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final PARENTTYPEType1[] VALUES_ARRAY =
        new PARENTTYPEType1[] {
            WORKLET,
            WORKFLOW,
        };

    /**
     * A public read-only list of all the '<em><b>PARENTTYPE Type1</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<PARENTTYPEType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>PARENTTYPE Type1</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PARENTTYPEType1 get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PARENTTYPEType1 result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>PARENTTYPE Type1</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PARENTTYPEType1 getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PARENTTYPEType1 result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>PARENTTYPE Type1</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PARENTTYPEType1 get(int value) {
        switch (value) {
            case WORKLET_VALUE: return WORKLET;
            case WORKFLOW_VALUE: return WORKFLOW;
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
    private PARENTTYPEType1(int value, String name, String literal) {
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
    
} //PARENTTYPEType1
