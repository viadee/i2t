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
 * A representation of the literals of the enumeration '<em><b>TYPE Type8</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getTYPEType8()
 * @model extendedMetaData="name='TYPE_._8_._type'"
 * @generated
 */
public enum TYPEType8 implements Enumerator {
    /**
     * The '<em><b>DAILY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DAILY_VALUE
     * @generated
     * @ordered
     */
    DAILY(0, "DAILY", "DAILY"),

    /**
     * The '<em><b>MONTHLY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MONTHLY_VALUE
     * @generated
     * @ordered
     */
    MONTHLY(1, "MONTHLY", "MONTHLY"),

    /**
     * The '<em><b>WEEKLY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WEEKLY_VALUE
     * @generated
     * @ordered
     */
    WEEKLY(2, "WEEKLY", "WEEKLY");

    /**
     * The '<em><b>DAILY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DAILY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DAILY
     * @model
     * @generated
     * @ordered
     */
    public static final int DAILY_VALUE = 0;

    /**
     * The '<em><b>MONTHLY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MONTHLY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MONTHLY
     * @model
     * @generated
     * @ordered
     */
    public static final int MONTHLY_VALUE = 1;

    /**
     * The '<em><b>WEEKLY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WEEKLY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WEEKLY
     * @model
     * @generated
     * @ordered
     */
    public static final int WEEKLY_VALUE = 2;

    /**
     * An array of all the '<em><b>TYPE Type8</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TYPEType8[] VALUES_ARRAY =
        new TYPEType8[] {
            DAILY,
            MONTHLY,
            WEEKLY,
        };

    /**
     * A public read-only list of all the '<em><b>TYPE Type8</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<TYPEType8> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>TYPE Type8</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TYPEType8 get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TYPEType8 result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>TYPE Type8</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TYPEType8 getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TYPEType8 result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>TYPE Type8</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TYPEType8 get(int value) {
        switch (value) {
            case DAILY_VALUE: return DAILY;
            case MONTHLY_VALUE: return MONTHLY;
            case WEEKLY_VALUE: return WEEKLY;
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
    private TYPEType8(int value, String name, String literal) {
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
    
} //TYPEType8
