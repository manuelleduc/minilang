/**
 */
package minilang;

import minilang.visitor.MinilangVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see minilang.MinilangPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends Statement {
	/**
	 * @generated NOT
	 * @param visitor
	 * @return
	 */
	<T> T accept(MinilangVisitor<T> visitor);
} // Move
