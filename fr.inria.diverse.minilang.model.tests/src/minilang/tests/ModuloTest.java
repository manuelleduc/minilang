/**
 */
package minilang.tests;

import junit.textui.TestRunner;

import minilang.MinilangFactory;
import minilang.Modulo;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuloTest extends BinaryOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModuloTest.class);
	}

	/**
	 * Constructs a new Modulo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuloTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Modulo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Modulo getFixture() {
		return (Modulo)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinilangFactory.eINSTANCE.createModulo());
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

} //ModuloTest
