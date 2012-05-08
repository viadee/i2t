/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import talendfile.LogToStdOutType;
import talendfile.TalendfilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log To Std Out Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talendfile.impl.LogToStdOutTypeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link talendfile.impl.LogToStdOutTypeImpl#isSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogToStdOutTypeImpl extends EObjectImpl implements LogToStdOutType {
    /**
     * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLevel()
     * @generated
     * @ordered
     */
    protected static final int LEVEL_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLevel()
     * @generated
     * @ordered
     */
    protected int level = LEVEL_EDEFAULT;

    /**
     * This is true if the Level attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean levelESet;

    /**
     * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSelected()
     * @generated
     * @ordered
     */
    protected static final boolean SELECTED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSelected()
     * @generated
     * @ordered
     */
    protected boolean selected = SELECTED_EDEFAULT;

    /**
     * This is true if the Selected attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean selectedESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LogToStdOutTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TalendfilePackage.Literals.LOG_TO_STD_OUT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLevel() {
        return level;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLevel(int newLevel) {
        int oldLevel = level;
        level = newLevel;
        boolean oldLevelESet = levelESet;
        levelESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.LOG_TO_STD_OUT_TYPE__LEVEL, oldLevel, level, !oldLevelESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLevel() {
        int oldLevel = level;
        boolean oldLevelESet = levelESet;
        level = LEVEL_EDEFAULT;
        levelESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendfilePackage.LOG_TO_STD_OUT_TYPE__LEVEL, oldLevel, LEVEL_EDEFAULT, oldLevelESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLevel() {
        return levelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelected(boolean newSelected) {
        boolean oldSelected = selected;
        selected = newSelected;
        boolean oldSelectedESet = selectedESet;
        selectedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.LOG_TO_STD_OUT_TYPE__SELECTED, oldSelected, selected, !oldSelectedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSelected() {
        boolean oldSelected = selected;
        boolean oldSelectedESet = selectedESet;
        selected = SELECTED_EDEFAULT;
        selectedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendfilePackage.LOG_TO_STD_OUT_TYPE__SELECTED, oldSelected, SELECTED_EDEFAULT, oldSelectedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSelected() {
        return selectedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TalendfilePackage.LOG_TO_STD_OUT_TYPE__LEVEL:
                return getLevel();
            case TalendfilePackage.LOG_TO_STD_OUT_TYPE__SELECTED:
                return isSelected();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TalendfilePackage.LOG_TO_STD_OUT_TYPE__LEVEL:
                setLevel((Integer)newValue);
                return;
            case TalendfilePackage.LOG_TO_STD_OUT_TYPE__SELECTED:
                setSelected((Boolean)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case TalendfilePackage.LOG_TO_STD_OUT_TYPE__LEVEL:
                unsetLevel();
                return;
            case TalendfilePackage.LOG_TO_STD_OUT_TYPE__SELECTED:
                unsetSelected();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case TalendfilePackage.LOG_TO_STD_OUT_TYPE__LEVEL:
                return isSetLevel();
            case TalendfilePackage.LOG_TO_STD_OUT_TYPE__SELECTED:
                return isSetSelected();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (level: ");
        if (levelESet) result.append(level); else result.append("<unset>");
        result.append(", selected: ");
        if (selectedESet) result.append(selected); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //LogToStdOutTypeImpl
