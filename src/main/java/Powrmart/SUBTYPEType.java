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
 * A representation of the literals of the enumeration '<em><b>SUBTYPE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getSUBTYPEType()
 * @model extendedMetaData="name='SUBTYPE_._type'"
 * @generated
 */
public enum SUBTYPEType implements Enumerator {
    /**
     * The '<em><b>STRUCTURETYPE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRUCTURETYPE_VALUE
     * @generated
     * @ordered
     */
    STRUCTURETYPE(0, "STRUCTURETYPE", "STRUCTURETYPE"),

    /**
     * The '<em><b>STRUCTUREFIELDTYPE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRUCTUREFIELDTYPE_VALUE
     * @generated
     * @ordered
     */
    STRUCTUREFIELDTYPE(1, "STRUCTUREFIELDTYPE", "STRUCTUREFIELDTYPE"),

    /**
     * The '<em><b>ABAPTYPE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ABAPTYPE_VALUE
     * @generated
     * @ordered
     */
    ABAPTYPE(2, "ABAPTYPE", "ABAPTYPE"),

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
     * The '<em><b>STRUCTURETYPE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>STRUCTURETYPE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STRUCTURETYPE
     * @model
     * @generated
     * @ordered
     */
    public static final int STRUCTURETYPE_VALUE = 0;

    /**
     * The '<em><b>STRUCTUREFIELDTYPE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>STRUCTUREFIELDTYPE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STRUCTUREFIELDTYPE
     * @model
     * @generated
     * @ordered
     */
    public static final int STRUCTUREFIELDTYPE_VALUE = 1;

    /**
     * The '<em><b>ABAPTYPE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ABAPTYPE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ABAPTYPE
     * @model
     * @generated
     * @ordered
     */
    public static final int ABAPTYPE_VALUE = 2;

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
     * An array of all the '<em><b>SUBTYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SUBTYPEType[] VALUES_ARRAY =
        new SUBTYPEType[] {
            STRUCTURETYPE,
            STRUCTUREFIELDTYPE,
            ABAPTYPE,
            NONE,
        };

    /**
     * A public read-only list of all the '<em><b>SUBTYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SUBTYPEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>SUBTYPE Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SUBTYPEType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SUBTYPEType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>SUBTYPE Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SUBTYPEType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SUBTYPEType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>SUBTYPE Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SUBTYPEType get(int value) {
        switch (value) {
            case STRUCTURETYPE_VALUE: return STRUCTURETYPE;
            case STRUCTUREFIELDTYPE_VALUE: return STRUCTUREFIELDTYPE;
            case ABAPTYPE_VALUE: return ABAPTYPE;
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
    private SUBTYPEType(int value, String name, String literal) {
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
    
} //SUBTYPEType
