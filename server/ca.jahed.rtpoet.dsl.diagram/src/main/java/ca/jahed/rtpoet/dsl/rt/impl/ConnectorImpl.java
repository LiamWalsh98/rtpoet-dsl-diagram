/**
 * generated by Xtext 2.25.0
 */
package ca.jahed.rtpoet.dsl.rt.impl;

import ca.jahed.rtpoet.dsl.rt.Connector;
import ca.jahed.rtpoet.dsl.rt.Part;
import ca.jahed.rtpoet.dsl.rt.Port;
import ca.jahed.rtpoet.dsl.rt.RtPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.ConnectorImpl#getPart1 <em>Part1</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.ConnectorImpl#getPort1 <em>Port1</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.ConnectorImpl#getPart2 <em>Part2</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.impl.ConnectorImpl#getPort2 <em>Port2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector
{
  /**
   * The cached value of the '{@link #getPart1() <em>Part1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart1()
   * @generated
   * @ordered
   */
  protected Part part1;

  /**
   * The cached value of the '{@link #getPort1() <em>Port1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort1()
   * @generated
   * @ordered
   */
  protected Port port1;

  /**
   * The cached value of the '{@link #getPart2() <em>Part2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart2()
   * @generated
   * @ordered
   */
  protected Part part2;

  /**
   * The cached value of the '{@link #getPort2() <em>Port2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort2()
   * @generated
   * @ordered
   */
  protected Port port2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectorImpl()
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
    return RtPackage.Literals.CONNECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Part getPart1()
  {
    if (part1 != null && part1.eIsProxy())
    {
      InternalEObject oldPart1 = (InternalEObject)part1;
      part1 = (Part)eResolveProxy(oldPart1);
      if (part1 != oldPart1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtPackage.CONNECTOR__PART1, oldPart1, part1));
      }
    }
    return part1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Part basicGetPart1()
  {
    return part1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPart1(Part newPart1)
  {
    Part oldPart1 = part1;
    part1 = newPart1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.CONNECTOR__PART1, oldPart1, part1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Port getPort1()
  {
    if (port1 != null && port1.eIsProxy())
    {
      InternalEObject oldPort1 = (InternalEObject)port1;
      port1 = (Port)eResolveProxy(oldPort1);
      if (port1 != oldPort1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtPackage.CONNECTOR__PORT1, oldPort1, port1));
      }
    }
    return port1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port basicGetPort1()
  {
    return port1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPort1(Port newPort1)
  {
    Port oldPort1 = port1;
    port1 = newPort1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.CONNECTOR__PORT1, oldPort1, port1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Part getPart2()
  {
    if (part2 != null && part2.eIsProxy())
    {
      InternalEObject oldPart2 = (InternalEObject)part2;
      part2 = (Part)eResolveProxy(oldPart2);
      if (part2 != oldPart2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtPackage.CONNECTOR__PART2, oldPart2, part2));
      }
    }
    return part2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Part basicGetPart2()
  {
    return part2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPart2(Part newPart2)
  {
    Part oldPart2 = part2;
    part2 = newPart2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.CONNECTOR__PART2, oldPart2, part2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Port getPort2()
  {
    if (port2 != null && port2.eIsProxy())
    {
      InternalEObject oldPort2 = (InternalEObject)port2;
      port2 = (Port)eResolveProxy(oldPort2);
      if (port2 != oldPort2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtPackage.CONNECTOR__PORT2, oldPort2, port2));
      }
    }
    return port2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port basicGetPort2()
  {
    return port2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPort2(Port newPort2)
  {
    Port oldPort2 = port2;
    port2 = newPort2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RtPackage.CONNECTOR__PORT2, oldPort2, port2));
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
      case RtPackage.CONNECTOR__PART1:
        if (resolve) return getPart1();
        return basicGetPart1();
      case RtPackage.CONNECTOR__PORT1:
        if (resolve) return getPort1();
        return basicGetPort1();
      case RtPackage.CONNECTOR__PART2:
        if (resolve) return getPart2();
        return basicGetPart2();
      case RtPackage.CONNECTOR__PORT2:
        if (resolve) return getPort2();
        return basicGetPort2();
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
      case RtPackage.CONNECTOR__PART1:
        setPart1((Part)newValue);
        return;
      case RtPackage.CONNECTOR__PORT1:
        setPort1((Port)newValue);
        return;
      case RtPackage.CONNECTOR__PART2:
        setPart2((Part)newValue);
        return;
      case RtPackage.CONNECTOR__PORT2:
        setPort2((Port)newValue);
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
      case RtPackage.CONNECTOR__PART1:
        setPart1((Part)null);
        return;
      case RtPackage.CONNECTOR__PORT1:
        setPort1((Port)null);
        return;
      case RtPackage.CONNECTOR__PART2:
        setPart2((Part)null);
        return;
      case RtPackage.CONNECTOR__PORT2:
        setPort2((Port)null);
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
      case RtPackage.CONNECTOR__PART1:
        return part1 != null;
      case RtPackage.CONNECTOR__PORT1:
        return port1 != null;
      case RtPackage.CONNECTOR__PART2:
        return part2 != null;
      case RtPackage.CONNECTOR__PORT2:
        return port2 != null;
    }
    return super.eIsSet(featureID);
  }

} //ConnectorImpl
