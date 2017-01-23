/**
 */
package fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Affect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableAffect#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableAffect#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getVariableAffect()
 * @model
 * @generated
 */
public interface VariableAffect extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getVariableAffect_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableAffect#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getVariableAffect_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableAffect#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void executeK3();

} // VariableAffect
