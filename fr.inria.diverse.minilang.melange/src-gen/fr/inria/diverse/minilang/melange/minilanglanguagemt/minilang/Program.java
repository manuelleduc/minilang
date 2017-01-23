/**
 */
package fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getMethods <em>Methods</em>}</li>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getMainMethod <em>Main Method</em>}</li>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getVariables <em>Variables</em>}</li>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getX <em>X</em>}</li>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getY <em>Y</em>}</li>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getAngle <em>Angle</em>}</li>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getDistance <em>Distance</em>}</li>
 *   <li>{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getProgram_Methods()
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Main Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Method</em>' reference.
	 * @see #setMainMethod(Method)
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getProgram_MainMethod()
	 * @model required="true"
	 * @generated
	 */
	Method getMainMethod();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getMainMethod <em>Main Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Method</em>' reference.
	 * @see #getMainMethod()
	 * @generated
	 */
	void setMainMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getProgram_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getProgram_X()
	 * @model
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getProgram_Y()
	 * @model
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Cardinals}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Cardinals
	 * @see #setAngle(Cardinals)
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getProgram_Angle()
	 * @model
	 * @generated
	 */
	Cardinals getAngle();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Cardinals
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Cardinals value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getProgram_Distance()
	 * @model
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage#getProgram_Lines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line> getLines();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void mainK3();

} // Program
