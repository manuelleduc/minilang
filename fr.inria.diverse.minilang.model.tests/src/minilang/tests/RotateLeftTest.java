/**
 */
package minilang.tests;

import junit.textui.TestRunner;

import minilang.MinilangFactory;
import minilang.RotateLeft;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rotate Left</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RotateLeftTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RotateLeftTest.class);
	}

	/**
	 * Constructs a new Rotate Left test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotateLeftTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rotate Left test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RotateLeft getFixture() {
		return (RotateLeft)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinilangFactory.eINSTANCE.createRotateLeft());
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

} //RotateLeftTest
