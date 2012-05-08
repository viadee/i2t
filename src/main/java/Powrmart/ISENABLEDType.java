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
 * A representation of the literals of the enumeration '<em><b>ISENABLED Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getISENABLEDType()
 * @model extendedMetaData="name='ISENABLED_._type'"
 * @generated
 */
public enum ISENABLEDType implements Enumerator {
    /**
     * The '<em><b>YES</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #YES_VALUE
     * @generated
     * @ordered
     */
    YES(0, "YES", "YES"),

    /**
     * The '<em><b>NO</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NO_VALUE
     * @generated
     * @ordered
     */
    NO(1, "NO", "NO");

    /**
     * The '<em><b>YES</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>YES</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #YES
     * @model
     * @generated
     * @ordered
     */
    public static final int YES_VALUE = 0;

    /**
     * The '<em><b>NO</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NO</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NO
     * @model
     * @generated
     * @ordered
     */
    public static final int NO_VALUE = 1;

    /**
     * An array of all the '<em><b>ISENABLED Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ISENABLEDType[] VALUES_ARRAY =
        new ISENABLEDType[] {
            YES,
            NO,
        };

    /**
     * A public read-only list of all the '<em><b>ISENABLED Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ISENABLEDType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>ISENABLED Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ISENABLEDType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ISENABLEDType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ISENABLED Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ISENABLEDType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ISENABLEDType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ISENABLED Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ISENABLEDType get(int value) {
        switch (value) {
            case YES_VALUE: return YES;
            case NO_VALUE: return NO;
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
    private ISENABLEDType(int value, String name, String literal) {
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
    
} //ISENABLEDType
