/**
 * generated by Xtext 2.25.0
 */
package ca.jahed.rtpoet.dsl.rt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.Type#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.Type#getCustom <em>Custom</em>}</li>
 * </ul>
 *
 * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Ref</em>' reference.
   * @see #setTypeRef(UserType)
   * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getType_TypeRef()
   * @model
   * @generated
   */
  UserType getTypeRef();

  /**
   * Sets the value of the '{@link ca.jahed.rtpoet.dsl.rt.Type#getTypeRef <em>Type Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Ref</em>' reference.
   * @see #getTypeRef()
   * @generated
   */
  void setTypeRef(UserType value);

  /**
   * Returns the value of the '<em><b>Custom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom</em>' attribute.
   * @see #setCustom(String)
   * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getType_Custom()
   * @model
   * @generated
   */
  String getCustom();

  /**
   * Sets the value of the '{@link ca.jahed.rtpoet.dsl.rt.Type#getCustom <em>Custom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom</em>' attribute.
   * @see #getCustom()
   * @generated
   */
  void setCustom(String value);

} // Type