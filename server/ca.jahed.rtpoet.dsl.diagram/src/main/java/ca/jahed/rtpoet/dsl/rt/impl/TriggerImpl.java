/**
 * generated by Xtext 2.25.0
 */
package ca.jahed.rtpoet.dsl.rt.impl;

import ca.jahed.rtpoet.dsl.rt.Port;
import ca.jahed.rtpoet.dsl.rt.RtPackage;
import ca.jahed.rtpoet.dsl.rt.Signal;
import ca.jahed.rtpoet.dsl.rt.Trigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.TriggerImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.TriggerImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.TriggerImpl#isAny <em>Any</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.TriggerImpl#isRtBound <em>Rt Bound</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.TriggerImpl#isRtUnbound <em>Rt Unbound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger
{
  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> ports;

  /**
   * The cached value of the '{@link #getSignal() <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignal()
   * @generated
   * @ordered
   */
  protected Signal signal;

  /**
   * The default value of the '{@link #isAny() <em>Any</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAny()
   * @generated
   * @ordered
   */
  protected static final boolean ANY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAny() <em>Any</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAny()
   * @generated
   * @ordered
   */
  protected boolean any = ANY_EDEFAULT;

  /**
   * The default value of the '{@link #isRtBound() <em>Rt Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRtBound()
   * @generated
   * @ordered
   */
  protected static final boolean RT_BOUND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRtBound() <em>Rt Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRtBound()
   * @generated
   * @ordered
   */
  protected boolean rtBound = RT_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #isRtUnbound() <em>Rt Unbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRtUnbound()
   * @generated
   * @ordered
   */
  protected static final boolean RT_UNBOUND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRtUnbound() <em>Rt Unbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRtUnbound()
   * @generated
   * @ordered
   */
  protected boolean rtUnbound = RT_UNBOUND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriggerImpl()
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
    return RtPackage.Literals.TRIGGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Port> getPorts()
  {
    if (ports == null)
    {
      ports = new EObjectResolvingEList<Port>(Port.class, this, RtPackage.TRIGGER__PORTS);
    }
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Signal getSignal()
  {
    if (signal != null && signal.eIsProxy())
    {
      InternalEObject oldSignal = (InternalEObject)signal;
      signal = (Signal)eResolveProxy(oldSignal);
      if (signal != oldSignal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtPackage.TRIGGER__SIGNAL, oldSignal, signal));
      }
    }
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal basicGetSignal()
  {
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSignal(Signal newSignal)
  {
    Signal oldSignal = signal;
    signal = newSignal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.TRIGGER__SIGNAL, oldSignal, signal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isAny()
  {
    return any;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAny(boolean newAny)
  {
    boolean oldAny = any;
    any = newAny;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.TRIGGER__ANY, oldAny, any));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isRtBound()
  {
    return rtBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRtBound(boolean newRtBound)
  {
    boolean oldRtBound = rtBound;
    rtBound = newRtBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.TRIGGER__RT_BOUND, oldRtBound, rtBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isRtUnbound()
  {
    return rtUnbound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRtUnbound(boolean newRtUnbound)
  {
    boolean oldRtUnbound = rtUnbound;
    rtUnbound = newRtUnbound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.TRIGGER__RT_UNBOUND, oldRtUnbound, rtUnbound));
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
      case RtPackage.TRIGGER__PORTS:
        return getPorts();
      case RtPackage.TRIGGER__SIGNAL:
        if (resolve) return getSignal();
        return basicGetSignal();
      case RtPackage.TRIGGER__ANY:
        return isAny();
      case RtPackage.TRIGGER__RT_BOUND:
        return isRtBound();
      case RtPackage.TRIGGER__RT_UNBOUND:
        return isRtUnbound();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RtPackage.TRIGGER__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case RtPackage.TRIGGER__SIGNAL:
        setSignal((Signal)newValue);
        return;
      case RtPackage.TRIGGER__ANY:
        setAny((Boolean)newValue);
        return;
      case RtPackage.TRIGGER__RT_BOUND:
        setRtBound((Boolean)newValue);
        return;
      case RtPackage.TRIGGER__RT_UNBOUND:
        setRtUnbound((Boolean)newValue);
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
      case RtPackage.TRIGGER__PORTS:
        getPorts().clear();
        return;
      case RtPackage.TRIGGER__SIGNAL:
        setSignal((Signal)null);
        return;
      case RtPackage.TRIGGER__ANY:
        setAny(ANY_EDEFAULT);
        return;
      case RtPackage.TRIGGER__RT_BOUND:
        setRtBound(RT_BOUND_EDEFAULT);
        return;
      case RtPackage.TRIGGER__RT_UNBOUND:
        setRtUnbound(RT_UNBOUND_EDEFAULT);
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
      case RtPackage.TRIGGER__PORTS:
        return ports != null && !ports.isEmpty();
      case RtPackage.TRIGGER__SIGNAL:
        return signal != null;
      case RtPackage.TRIGGER__ANY:
        return any != ANY_EDEFAULT;
      case RtPackage.TRIGGER__RT_BOUND:
        return rtBound != RT_BOUND_EDEFAULT;
      case RtPackage.TRIGGER__RT_UNBOUND:
        return rtUnbound != RT_UNBOUND_EDEFAULT;
    }
    return super.eIsSet(featureID);
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
    result.append(" (any: ");
    result.append(any);
    result.append(", rtBound: ");
    result.append(rtBound);
    result.append(", rtUnbound: ");
    result.append(rtUnbound);
    result.append(')');
    return result.toString();
  }

} //TriggerImpl