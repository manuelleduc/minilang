/**
 */
package minilang.tests;

import junit.textui.TestRunner;

import minilang.MinilangFactory;
import minilang.VariableAffect;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable Affect</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableAffectTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariableAffectTest.class);
	}

	/**
	 * Constructs a new Variable Affect test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAffectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variable Affect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VariableAffect getFixture() {
		return (VariableAffect)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinilangFactory.eINSTANCE.createVariableAffect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VariableAffectTest
