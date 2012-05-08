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
 * A representation of the literals of the enumeration '<em><b>SORTDIRECTION Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getSORTDIRECTIONType()
 * @model extendedMetaData="name='SORTDIRECTION_._type'"
 * @generated
 */
public enum SORTDIRECTIONType implements Enumerator {
    /**
     * The '<em><b>ASCENDING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASCENDING_VALUE
     * @generated
     * @ordered
     */
    ASCENDING(0, "ASCENDING", "ASCENDING"),

    /**
     * The '<em><b>DESCENDING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DESCENDING_VALUE
     * @generated
     * @ordered
     */
    DESCENDING(1, "DESCENDING", "DESCENDING");

    /**
     * The '<em><b>ASCENDING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ASCENDING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASCENDING
     * @model
     * @generated
     * @ordered
     */
    public static final int ASCENDING_VALUE = 0;

    /**
     * The '<em><b>DESCENDING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DESCENDING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DESCENDING
     * @model
     * @generated
     * @ordered
     */
    public static final int DESCENDING_VALUE = 1;

    /**
     * An array of all the '<em><b>SORTDIRECTION Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SORTDIRECTIONType[] VALUES_ARRAY =
        new SORTDIRECTIONType[] {
            ASCENDING,
            DESCENDING,
        };

    /**
     * A public read-only list of all the '<em><b>SORTDIRECTION Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SORTDIRECTIONType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>SORTDIRECTION Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SORTDIRECTIONType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SORTDIRECTIONType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>SORTDIRECTION Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SORTDIRECTIONType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SORTDIRECTIONType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>SORTDIRECTION Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SORTDIRECTIONType get(int value) {
        switch (value) {
            case ASCENDING_VALUE: return ASCENDING;
            case DESCENDING_VALUE: return DESCENDING;
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
    private SORTDIRECTIONType(int value, String name, String literal) {
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
    
} //SORTDIRECTIONType
