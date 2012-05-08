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
 * A representation of the literals of the enumeration '<em><b>DATATYPE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getDATATYPEType()
 * @model extendedMetaData="name='DATATYPE_._type'"
 * @generated
 */
public enum DATATYPEType implements Enumerator {
    /**
     * The '<em><b>STRING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRING_VALUE
     * @generated
     * @ordered
     */
    STRING(0, "STRING", "STRING"),

    /**
     * The '<em><b>NUMERIC</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NUMERIC_VALUE
     * @generated
     * @ordered
     */
    NUMERIC(1, "NUMERIC", "NUMERIC"),

    /**
     * The '<em><b>BOOLEAN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOOLEAN_VALUE
     * @generated
     * @ordered
     */
    BOOLEAN(2, "BOOLEAN", "BOOLEAN"),

    /**
     * The '<em><b>XML</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #XML_VALUE
     * @generated
     * @ordered
     */
    XML(3, "XML", "XML");

    /**
     * The '<em><b>STRING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STRING
     * @model
     * @generated
     * @ordered
     */
    public static final int STRING_VALUE = 0;

    /**
     * The '<em><b>NUMERIC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NUMERIC</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NUMERIC
     * @model
     * @generated
     * @ordered
     */
    public static final int NUMERIC_VALUE = 1;

    /**
     * The '<em><b>BOOLEAN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BOOLEAN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BOOLEAN
     * @model
     * @generated
     * @ordered
     */
    public static final int BOOLEAN_VALUE = 2;

    /**
     * The '<em><b>XML</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>XML</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #XML
     * @model
     * @generated
     * @ordered
     */
    public static final int XML_VALUE = 3;

    /**
     * An array of all the '<em><b>DATATYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DATATYPEType[] VALUES_ARRAY =
        new DATATYPEType[] {
            STRING,
            NUMERIC,
            BOOLEAN,
            XML,
        };

    /**
     * A public read-only list of all the '<em><b>DATATYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<DATATYPEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>DATATYPE Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DATATYPEType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DATATYPEType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>DATATYPE Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DATATYPEType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DATATYPEType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>DATATYPE Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DATATYPEType get(int value) {
        switch (value) {
            case STRING_VALUE: return STRING;
            case NUMERIC_VALUE: return NUMERIC;
            case BOOLEAN_VALUE: return BOOLEAN;
            case XML_VALUE: return XML;
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
    private DATATYPEType(int value, String name, String literal) {
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
    
} //DATATYPEType
