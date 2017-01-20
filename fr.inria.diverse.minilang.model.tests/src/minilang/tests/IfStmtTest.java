/**
 */
package minilang.tests;

import junit.textui.TestRunner;

import minilang.IfStmt;
import minilang.MinilangFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IfStmtTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IfStmtTest.class);
	}

	/**
	 * Constructs a new If Stmt test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStmtTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this If Stmt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IfStmt getFixture() {
		return (IfStmt)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinilangFactory.eINSTANCE.createIfStmt());
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

} //IfStmtTest
