/**
 * generated by Xtext 2.25.0
 */
package ca.jahed.rtpoet.dsl.rt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link ca.jahed.rtpoet.dsl.rt.Artifact#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getArtifact_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ca.jahed.rtpoet.dsl.rt.Artifact#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' attribute.
   * @see #setFile(String)
   * @see ca.jahed.rtpoet.dsl.rt.RtPackage#getArtifact_File()
   * @model
   * @generated
   */
  String getFile();

  /**
   * Sets the value of the '{@link ca.jahed.rtpoet.dsl.rt.Artifact#getFile <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' attribute.
   * @see #getFile()
   * @generated
   */
  void setFile(String value);

} // Artifact
