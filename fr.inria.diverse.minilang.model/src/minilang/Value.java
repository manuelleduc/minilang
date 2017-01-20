/**
 */
package minilang;

import org.eclipse.emf.ecore.EObject;

import minilang.visitor.MinilangVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see minilang.MinilangPackage#getValue()
 * @model abstract="true"
 * @generated
 */
public interface Value extends EObject {

	/**
	 * @generated NOT
	 * @return
	 */
	double evaluate();
	
	/**
	 * @generated NOT
	 * @param visitor
	 * @return
	 */
	<T> T accept(MinilangVisitor<T> visitor);

} // Value
