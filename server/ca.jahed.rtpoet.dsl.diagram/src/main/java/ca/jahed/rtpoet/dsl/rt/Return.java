/**
 * generated by Xtext 2.25.0
 */
package ca.jahed.rtpoet.dsl.rt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.Return#getType <em>Type</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.Return#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ca.jahed.rtpoet.dsl.rt.Type)
   * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getReturn_Type()
   * @model containment="true"
   * @generated
   */
  ca.jahed.rtpoet.dsl.rt.Type getType();

  /**
   * Sets the value of the '{@link ca.jahed.rtpoet.dsl.rt.Return#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' containment reference.
   * @see #setUpperBound(LiteralInteger)
   * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getReturn_UpperBound()
   * @model containment="true"
   * @generated
   */
  LiteralInteger getUpperBound();

  /**
   * Sets the value of the '{@link ca.jahed.rtpoet.dsl.rt.Return#getUpperBound <em>Upper Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' containment reference.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(LiteralInteger value);

} // Return
