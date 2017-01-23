/**
 */
package fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt#getThenBranch <em>Then Branch</em>}</li>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt#getElseBranch <em>Else Branch</em>}</li>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getIfStmt()
 * @model
 * @generated
 */
public interface IfStmt extends Statement {
	/**
	 * Returns the value of the '<em><b>Then Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Branch</em>' containment reference.
	 * @see #setThenBranch(Block)
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getIfStmt_ThenBranch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getThenBranch();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt#getThenBranch <em>Then Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Branch</em>' containment reference.
	 * @see #getThenBranch()
	 * @generated
	 */
	void setThenBranch(Block value);

	/**
	 * Returns the value of the '<em><b>Else Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Branch</em>' containment reference.
	 * @see #setElseBranch(Block)
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getIfStmt_ElseBranch()
	 * @model containment="true"
	 * @generated
	 */
	Block getElseBranch();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt#getElseBranch <em>Else Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Branch</em>' containment reference.
	 * @see #getElseBranch()
	 * @generated
	 */
	void setElseBranch(Block value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getIfStmt_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void executeK3();

} // IfStmt
