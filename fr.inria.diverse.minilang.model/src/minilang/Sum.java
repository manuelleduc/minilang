/**
 */
package minilang;

import minilang.visitor.MinilangVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see minilang.MinilangPackage#getSum()
 * @model
 * @generated
 */
public interface Sum extends BinaryOperation {
	/**
	 * @generated NOT
	 * @param visitor
	 * @return
	 */
	<T> T accept(MinilangVisitor<T> visitor);
} // Sum
