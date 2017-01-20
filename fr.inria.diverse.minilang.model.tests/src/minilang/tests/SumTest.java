/**
 */
package minilang.tests;

import junit.textui.TestRunner;

import minilang.MinilangFactory;
import minilang.Sum;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SumTest extends BinaryOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SumTest.class);
	}

	/**
	 * Constructs a new Sum test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SumTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sum test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sum getFixture() {
		return (Sum)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinilangFactory.eINSTANCE.createSum());
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

} //SumTest
