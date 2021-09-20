/**
 * generated by Xtext 2.25.0
 */
package ca.jahed.rtpoet.dsl.rt.impl;

import ca.jahed.rtpoet.dsl.rt.RtPackage;
import ca.jahed.rtpoet.dsl.rt.State;
import ca.jahed.rtpoet.dsl.rt.Transition;
import ca.jahed.rtpoet.dsl.rt.TransitionAction;
import ca.jahed.rtpoet.dsl.rt.TransitionGuard;
import ca.jahed.rtpoet.dsl.rt.Trigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.TransitionImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.TransitionImpl#getActionChain <em>Action Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected State source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected State target;

  /**
   * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggers()
   * @generated
   * @ordered
   */
  protected EList<Trigger> triggers;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected TransitionGuard guard;

  /**
   * The cached value of the '{@link #getActionChain() <em>Action Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionChain()
   * @generated
   * @ordered
   */
  protected TransitionAction actionChain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return RtPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (State)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtPackage.TRANSITION__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSource(State newSource)
  {
    State oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.TRANSITION__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (State)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtPackage.TRANSITION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(State newTarget)
  {
    State oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.TRANSITION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Trigger> getTriggers()
  {
    if (triggers == null)
    {
      triggers = new EObjectContainmentEList<Trigger>(Trigger.class, this, RtPackage.TRANSITION__TRIGGERS);
    }
    return triggers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TransitionGuard getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuard(TransitionGuard newGuard, NotificationChain msgs)
  {
    TransitionGuard oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtPackage.TRANSITION__GUARD, oldGuard, newGuard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGuard(TransitionGuard newGuard)
  {
    if (newGuard != guard)
    {
      NotificationChain msgs = null;
      if (guard != null)
        msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtPackage.TRANSITION__GUARD, null, msgs);
      if (newGuard != null)
        msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtPackage.TRANSITION__GUARD, null, msgs);
      msgs = basicSetGuard(newGuard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.TRANSITION__GUARD, newGuard, newGuard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TransitionAction getActionChain()
  {
    return actionChain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionChain(TransitionAction newActionChain, NotificationChain msgs)
  {
    TransitionAction oldActionChain = actionChain;
    actionChain = newActionChain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtPackage.TRANSITION__ACTION_CHAIN, oldActionChain, newActionChain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setActionChain(TransitionAction newActionChain)
  {
    if (newActionChain != actionChain)
    {
      NotificationChain msgs = null;
      if (actionChain != null)
        msgs = ((InternalEObject)actionChain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtPackage.TRANSITION__ACTION_CHAIN, null, msgs);
      if (newActionChain != null)
        msgs = ((InternalEObject)newActionChain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtPackage.TRANSITION__ACTION_CHAIN, null, msgs);
      msgs = basicSetActionChain(newActionChain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.TRANSITION__ACTION_CHAIN, newActionChain, newActionChain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RtPackage.TRANSITION__TRIGGERS:
        return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
      case RtPackage.TRANSITION__GUARD:
        return basicSetGuard(null, msgs);
      case RtPackage.TRANSITION__ACTION_CHAIN:
        return basicSetActionChain(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RtPackage.TRANSITION__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case RtPackage.TRANSITION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case RtPackage.TRANSITION__TRIGGERS:
        return getTriggers();
      case RtPackage.TRANSITION__GUARD:
        return getGuard();
      case RtPackage.TRANSITION__ACTION_CHAIN:
        return getActionChain();
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
      case RtPackage.TRANSITION__SOURCE:
        setSource((State)newValue);
        return;
      case RtPackage.TRANSITION__TARGET:
        setTarget((State)newValue);
        return;
      case RtPackage.TRANSITION__TRIGGERS:
        getTriggers().clear();
        getTriggers().addAll((Collection<? extends Trigger>)newValue);
        return;
      case RtPackage.TRANSITION__GUARD:
        setGuard((TransitionGuard)newValue);
        return;
      case RtPackage.TRANSITION__ACTION_CHAIN:
        setActionChain((TransitionAction)newValue);
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
      case RtPackage.TRANSITION__SOURCE:
        setSource((State)null);
        return;
      case RtPackage.TRANSITION__TARGET:
        setTarget((State)null);
        return;
      case RtPackage.TRANSITION__TRIGGERS:
        getTriggers().clear();
        return;
      case RtPackage.TRANSITION__GUARD:
        setGuard((TransitionGuard)null);
        return;
      case RtPackage.TRANSITION__ACTION_CHAIN:
        setActionChain((TransitionAction)null);
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
      case RtPackage.TRANSITION__SOURCE:
        return source != null;
      case RtPackage.TRANSITION__TARGET:
        return target != null;
      case RtPackage.TRANSITION__TRIGGERS:
        return triggers != null && !triggers.isEmpty();
      case RtPackage.TRANSITION__GUARD:
        return guard != null;
      case RtPackage.TRANSITION__ACTION_CHAIN:
        return actionChain != null;
    }
    return super.eIsSet(featureID);
  }

} //TransitionImpl