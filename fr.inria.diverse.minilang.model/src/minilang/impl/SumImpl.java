/**
 */
package minilang.impl;

import minilang.MinilangPackage;
import minilang.Sum;
import minilang.visitor.MinilangVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SumImpl extends BinaryOperationImpl implements Sum {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinilangPackage.Literals.SUM;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public double evaluate() {
		return this.getLeft().evaluate() + this.getRight().evaluate();
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public <T> T accept(MinilangVisitor<T> visitor) {
		return visitor.visitSum(this);
	}

} //SumImpl
