/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.example.mydsl4test.otherDsl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.mydsl3test.myDslTest.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl4test.otherDsl.OtherRoot#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl4test.otherDsl.OtherDslPackage#getOtherRoot()
 * @model
 * @generated
 */
public interface OtherRoot extends EObject
{
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Model)
	 * @see org.xtext.example.mydsl4test.otherDsl.OtherDslPackage#getOtherRoot_Value()
	 * @model containment="true"
	 * @generated
	 */
	Model getValue();

	/**
	 * Sets the value of the '{@link org.xtext.example.mydsl4test.otherDsl.OtherRoot#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Model value);

} // OtherRoot
