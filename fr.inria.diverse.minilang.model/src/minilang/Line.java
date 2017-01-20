/**
 */
package minilang;

import org.eclipse.emf.ecore.EObject;

import minilang.visitor.MinilangVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minilang.Line#getX1 <em>X1</em>}</li>
 *   <li>{@link minilang.Line#getY1 <em>Y1</em>}</li>
 *   <li>{@link minilang.Line#getX2 <em>X2</em>}</li>
 *   <li>{@link minilang.Line#getY2 <em>Y2</em>}</li>
 * </ul>
 *
 * @see minilang.MinilangPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X1</em>' attribute.
	 * @see #setX1(double)
	 * @see minilang.MinilangPackage#getLine_X1()
	 * @model
	 * @generated
	 */
	double getX1();

	/**
	 * Sets the value of the '{@link minilang.Line#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1</em>' attribute.
	 * @see #getX1()
	 * @generated
	 */
	void setX1(double value);

	/**
	 * Returns the value of the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1</em>' attribute.
	 * @see #setY1(double)
	 * @see minilang.MinilangPackage#getLine_Y1()
	 * @model
	 * @generated
	 */
	double getY1();

	/**
	 * Sets the value of the '{@link minilang.Line#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1</em>' attribute.
	 * @see #getY1()
	 * @generated
	 */
	void setY1(double value);

	/**
	 * Returns the value of the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X2</em>' attribute.
	 * @see #setX2(double)
	 * @see minilang.MinilangPackage#getLine_X2()
	 * @model
	 * @generated
	 */
	double getX2();

	/**
	 * Sets the value of the '{@link minilang.Line#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X2</em>' attribute.
	 * @see #getX2()
	 * @generated
	 */
	void setX2(double value);

	/**
	 * Returns the value of the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2</em>' attribute.
	 * @see #setY2(double)
	 * @see minilang.MinilangPackage#getLine_Y2()
	 * @model
	 * @generated
	 */
	double getY2();

	/**
	 * Sets the value of the '{@link minilang.Line#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2</em>' attribute.
	 * @see #getY2()
	 * @generated
	 */
	void setY2(double value);
	
	/**
	 * @generated NOT
	 * @param visitor
	 * @return
	 */
	<T> T accept(MinilangVisitor<T> visitor);

} // Line
