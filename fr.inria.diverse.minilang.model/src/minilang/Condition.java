/**
 */
package minilang;

import org.eclipse.emf.ecore.EObject;

import minilang.visitor.MinilangVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see minilang.MinilangPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends EObject {

	boolean evaluate();
	
	/**
	 * @generated NOT
	 * @param visitor
	 * @return
	 */
	<T> T accept(MinilangVisitor<T> visitor);
} // Condition
