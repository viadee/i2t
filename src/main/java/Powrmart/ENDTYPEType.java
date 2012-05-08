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
 * A representation of the literals of the enumeration '<em><b>ENDTYPE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getENDTYPEType()
 * @model extendedMetaData="name='ENDTYPE_._type'"
 * @generated
 */
public enum ENDTYPEType implements Enumerator {
    /**
     * The '<em><b>ENDON</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENDON_VALUE
     * @generated
     * @ordered
     */
    ENDON(0, "ENDON", "ENDON"),

    /**
     * The '<em><b>ENDAFTER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENDAFTER_VALUE
     * @generated
     * @ordered
     */
    ENDAFTER(1, "ENDAFTER", "ENDAFTER"),

    /**
     * The '<em><b>RUNFOREVER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RUNFOREVER_VALUE
     * @generated
     * @ordered
     */
    RUNFOREVER(2, "RUNFOREVER", "RUNFOREVER");

    /**
     * The '<em><b>ENDON</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ENDON</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENDON
     * @model
     * @generated
     * @ordered
     */
    public static final int ENDON_VALUE = 0;

    /**
     * The '<em><b>ENDAFTER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ENDAFTER</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENDAFTER
     * @model
     * @generated
     * @ordered
     */
    public static final int ENDAFTER_VALUE = 1;

    /**
     * The '<em><b>RUNFOREVER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>RUNFOREVER</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RUNFOREVER
     * @model
     * @generated
     * @ordered
     */
    public static final int RUNFOREVER_VALUE = 2;

    /**
     * An array of all the '<em><b>ENDTYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ENDTYPEType[] VALUES_ARRAY =
        new ENDTYPEType[] {
            ENDON,
            ENDAFTER,
            RUNFOREVER,
        };

    /**
     * A public read-only list of all the '<em><b>ENDTYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ENDTYPEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>ENDTYPE Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ENDTYPEType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ENDTYPEType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ENDTYPE Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ENDTYPEType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ENDTYPEType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ENDTYPE Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ENDTYPEType get(int value) {
        switch (value) {
            case ENDON_VALUE: return ENDON;
            case ENDAFTER_VALUE: return ENDAFTER;
            case RUNFOREVER_VALUE: return RUNFOREVER;
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
    private ENDTYPEType(int value, String name, String literal) {
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
    
} //ENDTYPEType
