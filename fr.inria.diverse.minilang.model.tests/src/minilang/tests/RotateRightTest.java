/**
 */
package minilang.tests;

import junit.textui.TestRunner;

import minilang.MinilangFactory;
import minilang.RotateRight;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rotate Right</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RotateRightTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RotateRightTest.class);
	}

	/**
	 * Constructs a new Rotate Right test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotateRightTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rotate Right test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RotateRight getFixture() {
		return (RotateRight)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinilangFactory.eINSTANCE.createRotateRight());
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

} //RotateRightTest
