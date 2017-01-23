/**
 */
package fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.BinaryOperation#getRight <em>Right</em>}</li>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.BinaryOperation#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getBinaryOperation()
 * @model abstract="true"
 * @generated
 */
public interface BinaryOperation extends Value {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Value)
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getBinaryOperation_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getRight();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.BinaryOperation#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Value value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Value)
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getBinaryOperation_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getLeft();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.BinaryOperation#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Value value);

} // BinaryOperation
