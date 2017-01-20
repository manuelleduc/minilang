/**
 */
package minilang;

import minilang.visitor.MinilangVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minilang.CallMethod#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see minilang.MinilangPackage#getCallMethod()
 * @model
 * @generated
 */
public interface CallMethod extends Statement {

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(Method)
	 * @see minilang.MinilangPackage#getCallMethod_Method()
	 * @model required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link minilang.CallMethod#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);
	
	/**
	 * @generated NOT
	 * @param visitor
	 * @return
	 */
	<T> T accept(MinilangVisitor<T> visitor);
} // CallMethod
