/**
 * generated by Xtext 2.25.0
 */
package ca.jahed.rtpoet.dsl.rt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.Protocol#getName <em>Name</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.Protocol#getSignals <em>Signals</em>}</li>
 * </ul>
 *
 * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getProtocol()
 * @model
 * @generated
 */
public interface Protocol extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getProtocol_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ca.jahed.rtpoet.dsl.rt.Protocol#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
   * The list contents are of type {@link ca.jahed.rtpoet.dsl.rt.Signal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signals</em>' containment reference list.
   * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getProtocol_Signals()
   * @model containment="true"
   * @generated
   */
  EList<Signal> getSignals();

} // Protocol
