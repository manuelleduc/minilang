/**
 */
package minilang;

import org.eclipse.emf.ecore.EObject;

import minilang.visitor.MinilangVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see minilang.MinilangPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends EObject {

	void execute();
	
	/**
	 * @generated NOT
	 * @param visitor
	 * @return
	 */
	<T> T accept(MinilangVisitor<T> visitor);
} // Statement
