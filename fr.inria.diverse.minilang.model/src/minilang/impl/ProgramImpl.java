/**
 */
package minilang.impl;

import java.util.Collection;

import minilang.Cardinals;
import minilang.Line;
import minilang.Method;
import minilang.MinilangPackage;
import minilang.Program;
import minilang.Variable;
import minilang.visitor.MinilangVisitor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minilang.impl.ProgramImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link minilang.impl.ProgramImpl#getMainMethod <em>Main Method</em>}</li>
 *   <li>{@link minilang.impl.ProgramImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link minilang.impl.ProgramImpl#getX <em>X</em>}</li>
 *   <li>{@link minilang.impl.ProgramImpl#getY <em>Y</em>}</li>
 *   <li>{@link minilang.impl.ProgramImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link minilang.impl.ProgramImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link minilang.impl.ProgramImpl#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getMainMethod() <em>Main Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainMethod()
	 * @generated
	 * @ordered
	 */
	protected Method mainMethod;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinals ANGLE_EDEFAULT = Cardinals.NORTH;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected Cardinals angle = ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinilangPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<Method>(Method.class, this, MinilangPackage.PROGRAM__METHODS, MinilangPackage.METHOD__PROGRAM);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMainMethod() {
		if (mainMethod != null && mainMethod.eIsProxy()) {
			InternalEObject oldMainMethod = (InternalEObject)mainMethod;
			mainMethod = (Method)eResolveProxy(oldMainMethod);
			if (mainMethod != oldMainMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MinilangPackage.PROGRAM__MAIN_METHOD, oldMainMethod, mainMethod));
			}
		}
		return mainMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMainMethod() {
		return mainMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainMethod(Method newMainMethod) {
		Method oldMainMethod = mainMethod;
		mainMethod = newMainMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinilangPackage.PROGRAM__MAIN_METHOD, oldMainMethod, mainMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, MinilangPackage.PROGRAM__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(double newX) {
		double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinilangPackage.PROGRAM__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(double newY) {
		double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinilangPackage.PROGRAM__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinals getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(Cardinals newAngle) {
		Cardinals oldAngle = angle;
		angle = newAngle == null ? ANGLE_EDEFAULT : newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinilangPackage.PROGRAM__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinilangPackage.PROGRAM__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new EObjectContainmentEList<Line>(Line.class, this, MinilangPackage.PROGRAM__LINES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MinilangPackage.PROGRAM__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MinilangPackage.PROGRAM__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case MinilangPackage.PROGRAM__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case MinilangPackage.PROGRAM__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MinilangPackage.PROGRAM__METHODS:
				return getMethods();
			case MinilangPackage.PROGRAM__MAIN_METHOD:
				if (resolve) return getMainMethod();
				return basicGetMainMethod();
			case MinilangPackage.PROGRAM__VARIABLES:
				return getVariables();
			case MinilangPackage.PROGRAM__X:
				return getX();
			case MinilangPackage.PROGRAM__Y:
				return getY();
			case MinilangPackage.PROGRAM__ANGLE:
				return getAngle();
			case MinilangPackage.PROGRAM__DISTANCE:
				return getDistance();
			case MinilangPackage.PROGRAM__LINES:
				return getLines();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MinilangPackage.PROGRAM__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case MinilangPackage.PROGRAM__MAIN_METHOD:
				setMainMethod((Method)newValue);
				return;
			case MinilangPackage.PROGRAM__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case MinilangPackage.PROGRAM__X:
				setX((Double)newValue);
				return;
			case MinilangPackage.PROGRAM__Y:
				setY((Double)newValue);
				return;
			case MinilangPackage.PROGRAM__ANGLE:
				setAngle((Cardinals)newValue);
				return;
			case MinilangPackage.PROGRAM__DISTANCE:
				setDistance((Double)newValue);
				return;
			case MinilangPackage.PROGRAM__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends Line>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MinilangPackage.PROGRAM__METHODS:
				getMethods().clear();
				return;
			case MinilangPackage.PROGRAM__MAIN_METHOD:
				setMainMethod((Method)null);
				return;
			case MinilangPackage.PROGRAM__VARIABLES:
				getVariables().clear();
				return;
			case MinilangPackage.PROGRAM__X:
				setX(X_EDEFAULT);
				return;
			case MinilangPackage.PROGRAM__Y:
				setY(Y_EDEFAULT);
				return;
			case MinilangPackage.PROGRAM__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case MinilangPackage.PROGRAM__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case MinilangPackage.PROGRAM__LINES:
				getLines().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MinilangPackage.PROGRAM__METHODS:
				return methods != null && !methods.isEmpty();
			case MinilangPackage.PROGRAM__MAIN_METHOD:
				return mainMethod != null;
			case MinilangPackage.PROGRAM__VARIABLES:
				return variables != null && !variables.isEmpty();
			case MinilangPackage.PROGRAM__X:
				return x != X_EDEFAULT;
			case MinilangPackage.PROGRAM__Y:
				return y != Y_EDEFAULT;
			case MinilangPackage.PROGRAM__ANGLE:
				return angle != ANGLE_EDEFAULT;
			case MinilangPackage.PROGRAM__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case MinilangPackage.PROGRAM__LINES:
				return lines != null && !lines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", angle: ");
		result.append(angle);
		result.append(", distance: ");
		result.append(distance);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * @generated NOT
	 */
	public void execute() {
		this.getMainMethod().call();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public <T> T accept(MinilangVisitor<T> visitor) {
		return visitor.visitProgram(this);
	}
	
} //ProgramImpl
