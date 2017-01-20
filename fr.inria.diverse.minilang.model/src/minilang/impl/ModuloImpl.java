/**
 */
package minilang.impl;

import minilang.MinilangPackage;
import minilang.Modulo;
import minilang.visitor.MinilangVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModuloImpl extends BinaryOperationImpl implements Modulo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinilangPackage.Literals.MODULO;
	}

	
	/**
	 * @generated NOT
	 */
	@Override
	public double evaluate() {
		return this.getLeft().evaluate() % this.getRight().evaluate();
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public <T> T accept(MinilangVisitor<T> visitor) {
		return visitor.visitModulo(this);
	}

} //ModuloImpl
