/**
 * generated by Xtext 2.25.0
 */
package ca.jahed.rtpoet.dsl.rt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Common Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.StateCommonFragment#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.StateCommonFragment#getExitAction <em>Exit Action</em>}</li>
 * </ul>
 *
 * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getStateCommonFragment()
 * @model
 * @generated
 */
public interface StateCommonFragment extends EObject
{
  /**
   * Returns the value of the '<em><b>Entry Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Action</em>' attribute.
   * @see #setEntryAction(String)
   * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getStateCommonFragment_EntryAction()
   * @model
   * @generated
   */
  String getEntryAction();

  /**
   * Sets the value of the '{@link ca.jahed.rtpoet.dsl.rt.StateCommonFragment#getEntryAction <em>Entry Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry Action</em>' attribute.
   * @see #getEntryAction()
   * @generated
   */
  void setEntryAction(String value);

  /**
   * Returns the value of the '<em><b>Exit Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exit Action</em>' attribute.
   * @see #setExitAction(String)
   * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getStateCommonFragment_ExitAction()
   * @model
   * @generated
   */
  String getExitAction();

  /**
   * Sets the value of the '{@link ca.jahed.rtpoet.dsl.rt.StateCommonFragment#getExitAction <em>Exit Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exit Action</em>' attribute.
   * @see #getExitAction()
   * @generated
   */
  void setExitAction(String value);

} // StateCommonFragment
