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
 * A representation of the literals of the enumeration '<em><b>TIMERTYPE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Powrmart.PowrmartPackage#getTIMERTYPEType()
 * @model extendedMetaData="name='TIMERTYPE_._type'"
 * @generated
 */
public enum TIMERTYPEType implements Enumerator {
    /**
     * The '<em><b>STARTATABSOLUTETIME</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STARTATABSOLUTETIME_VALUE
     * @generated
     * @ordered
     */
    STARTATABSOLUTETIME(0, "STARTATABSOLUTETIME", "START_AT_ABSOLUTE_TIME"),

    /**
     * The '<em><b>STARTATABSOLUTEVARIABLE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STARTATABSOLUTEVARIABLE_VALUE
     * @generated
     * @ordered
     */
    STARTATABSOLUTEVARIABLE(1, "STARTATABSOLUTEVARIABLE", "START_AT_ABSOLUTE_VARIABLE"),

    /**
     * The '<em><b>STARTRELATIVETOPREVIOUSTASK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STARTRELATIVETOPREVIOUSTASK_VALUE
     * @generated
     * @ordered
     */
    STARTRELATIVETOPREVIOUSTASK(2, "STARTRELATIVETOPREVIOUSTASK", "START_RELATIVE_TO_PREVIOUSTASK"),

    /**
     * The '<em><b>STARTRELATIVETOPARENTWORKFLOW</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STARTRELATIVETOPARENTWORKFLOW_VALUE
     * @generated
     * @ordered
     */
    STARTRELATIVETOPARENTWORKFLOW(3, "STARTRELATIVETOPARENTWORKFLOW", "START_RELATIVE_TO_PARENT_WORKFLOW"),

    /**
     * The '<em><b>STARTRELATIVETOTOPLEVELWORKFLOW</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STARTRELATIVETOTOPLEVELWORKFLOW_VALUE
     * @generated
     * @ordered
     */
    STARTRELATIVETOTOPLEVELWORKFLOW(4, "STARTRELATIVETOTOPLEVELWORKFLOW", "START_RELATIVE_TO_TOPLEVEL_WORKFLOW");

    /**
     * The '<em><b>STARTATABSOLUTETIME</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>STARTATABSOLUTETIME</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STARTATABSOLUTETIME
     * @model literal="START_AT_ABSOLUTE_TIME"
     * @generated
     * @ordered
     */
    public static final int STARTATABSOLUTETIME_VALUE = 0;

    /**
     * The '<em><b>STARTATABSOLUTEVARIABLE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>STARTATABSOLUTEVARIABLE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STARTATABSOLUTEVARIABLE
     * @model literal="START_AT_ABSOLUTE_VARIABLE"
     * @generated
     * @ordered
     */
    public static final int STARTATABSOLUTEVARIABLE_VALUE = 1;

    /**
     * The '<em><b>STARTRELATIVETOPREVIOUSTASK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>STARTRELATIVETOPREVIOUSTASK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STARTRELATIVETOPREVIOUSTASK
     * @model literal="START_RELATIVE_TO_PREVIOUSTASK"
     * @generated
     * @ordered
     */
    public static final int STARTRELATIVETOPREVIOUSTASK_VALUE = 2;

    /**
     * The '<em><b>STARTRELATIVETOPARENTWORKFLOW</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>STARTRELATIVETOPARENTWORKFLOW</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STARTRELATIVETOPARENTWORKFLOW
     * @model literal="START_RELATIVE_TO_PARENT_WORKFLOW"
     * @generated
     * @ordered
     */
    public static final int STARTRELATIVETOPARENTWORKFLOW_VALUE = 3;

    /**
     * The '<em><b>STARTRELATIVETOTOPLEVELWORKFLOW</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>STARTRELATIVETOTOPLEVELWORKFLOW</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STARTRELATIVETOTOPLEVELWORKFLOW
     * @model literal="START_RELATIVE_TO_TOPLEVEL_WORKFLOW"
     * @generated
     * @ordered
     */
    public static final int STARTRELATIVETOTOPLEVELWORKFLOW_VALUE = 4;

    /**
     * An array of all the '<em><b>TIMERTYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TIMERTYPEType[] VALUES_ARRAY =
        new TIMERTYPEType[] {
            STARTATABSOLUTETIME,
            STARTATABSOLUTEVARIABLE,
            STARTRELATIVETOPREVIOUSTASK,
            STARTRELATIVETOPARENTWORKFLOW,
            STARTRELATIVETOTOPLEVELWORKFLOW,
        };

    /**
     * A public read-only list of all the '<em><b>TIMERTYPE Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<TIMERTYPEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>TIMERTYPE Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TIMERTYPEType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TIMERTYPEType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>TIMERTYPE Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TIMERTYPEType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TIMERTYPEType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>TIMERTYPE Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TIMERTYPEType get(int value) {
        switch (value) {
            case STARTATABSOLUTETIME_VALUE: return STARTATABSOLUTETIME;
            case STARTATABSOLUTEVARIABLE_VALUE: return STARTATABSOLUTEVARIABLE;
            case STARTRELATIVETOPREVIOUSTASK_VALUE: return STARTRELATIVETOPREVIOUSTASK;
            case STARTRELATIVETOPARENTWORKFLOW_VALUE: return STARTRELATIVETOPARENTWORKFLOW;
            case STARTRELATIVETOTOPLEVELWORKFLOW_VALUE: return STARTRELATIVETOTOPLEVELWORKFLOW;
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
    private TIMERTYPEType(int value, String name, String literal) {
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
    
} //TIMERTYPEType
