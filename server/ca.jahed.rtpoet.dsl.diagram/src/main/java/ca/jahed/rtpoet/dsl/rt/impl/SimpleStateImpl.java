/**
 * generated by Xtext 2.25.0
 */
package ca.jahed.rtpoet.dsl.rt.impl;

import ca.jahed.rtpoet.dsl.rt.RtPackage;
import ca.jahed.rtpoet.dsl.rt.SimpleState;
import ca.jahed.rtpoet.dsl.rt.StateCommonFragment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.SimpleStateImpl#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.SimpleStateImpl#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.SimpleStateImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleStateImpl extends StateImpl implements SimpleState
{
  /**
   * The default value of the '{@link #getEntryAction() <em>Entry Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryAction()
   * @generated
   * @ordered
   */
  protected static final String ENTRY_ACTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntryAction() <em>Entry Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryAction()
   * @generated
   * @ordered
   */
  protected String entryAction = ENTRY_ACTION_EDEFAULT;

  /**
   * The default value of the '{@link #getExitAction() <em>Exit Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExitAction()
   * @generated
   * @ordered
   */
  protected static final String EXIT_ACTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExitAction() <em>Exit Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExitAction()
   * @generated
   * @ordered
   */
  protected String exitAction = EXIT_ACTION_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleStateImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RtPackage.Literals.SIMPLE_STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEntryAction()
  {
    return entryAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEntryAction(String newEntryAction)
  {
    String oldEntryAction = entryAction;
    entryAction = newEntryAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.SIMPLE_STATE__ENTRY_ACTION, oldEntryAction, entryAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExitAction()
  {
    return exitAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExitAction(String newExitAction)
  {
    String oldExitAction = exitAction;
    exitAction = newExitAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.SIMPLE_STATE__EXIT_ACTION, oldExitAction, exitAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.SIMPLE_STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RtPackage.SIMPLE_STATE__ENTRY_ACTION:
        return getEntryAction();
      case RtPackage.SIMPLE_STATE__EXIT_ACTION:
        return getExitAction();
      case RtPackage.SIMPLE_STATE__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RtPackage.SIMPLE_STATE__ENTRY_ACTION:
        setEntryAction((String)newValue);
        return;
      case RtPackage.SIMPLE_STATE__EXIT_ACTION:
        setExitAction((String)newValue);
        return;
      case RtPackage.SIMPLE_STATE__NAME:
        setName((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RtPackage.SIMPLE_STATE__ENTRY_ACTION:
        setEntryAction(ENTRY_ACTION_EDEFAULT);
        return;
      case RtPackage.SIMPLE_STATE__EXIT_ACTION:
        setExitAction(EXIT_ACTION_EDEFAULT);
        return;
      case RtPackage.SIMPLE_STATE__NAME:
        setName(NAME_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RtPackage.SIMPLE_STATE__ENTRY_ACTION:
        return ENTRY_ACTION_EDEFAULT == null ? entryAction != null : !ENTRY_ACTION_EDEFAULT.equals(entryAction);
      case RtPackage.SIMPLE_STATE__EXIT_ACTION:
        return EXIT_ACTION_EDEFAULT == null ? exitAction != null : !EXIT_ACTION_EDEFAULT.equals(exitAction);
      case RtPackage.SIMPLE_STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == StateCommonFragment.class)
    {
      switch (derivedFeatureID)
      {
        case RtPackage.SIMPLE_STATE__ENTRY_ACTION: return RtPackage.STATE_COMMON_FRAGMENT__ENTRY_ACTION;
        case RtPackage.SIMPLE_STATE__EXIT_ACTION: return RtPackage.STATE_COMMON_FRAGMENT__EXIT_ACTION;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == StateCommonFragment.class)
    {
      switch (baseFeatureID)
      {
        case RtPackage.STATE_COMMON_FRAGMENT__ENTRY_ACTION: return RtPackage.SIMPLE_STATE__ENTRY_ACTION;
        case RtPackage.STATE_COMMON_FRAGMENT__EXIT_ACTION: return RtPackage.SIMPLE_STATE__EXIT_ACTION;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (entryAction: ");
    result.append(entryAction);
    result.append(", exitAction: ");
    result.append(exitAction);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SimpleStateImpl
