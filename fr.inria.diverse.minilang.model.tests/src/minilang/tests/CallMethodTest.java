/**
 */
package minilang.tests;

import junit.textui.TestRunner;

import minilang.CallMethod;
import minilang.MinilangFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Call Method</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CallMethodTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CallMethodTest.class);
	}

	/**
	 * Constructs a new Call Method test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallMethodTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Call Method test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CallMethod getFixture() {
		return (CallMethod)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinilangFactory.eINSTANCE.createCallMethod());
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

} //CallMethodTest
