/**
 */
package minilang.impl;

import minilang.Line;
import minilang.MinilangFactory;
import minilang.MinilangPackage;
import minilang.Move;
import minilang.Program;
import minilang.visitor.MinilangVisitor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MoveImpl extends StatementImpl implements Move {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinilangPackage.Literals.MOVE;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void execute() {
		final Program program = findProgram(this);
		final double x1 = program.getX();
		final double y1 = program.getX();
		final double angle = coordinatesToAngle(program);
		final double x2 = x1 + program.getDistance() * Math.cos(Math.toRadians(angle));
		final double y2 = y1 + program.getDistance() * Math.sin(Math.toRadians(angle));
		
		final Line createLine = MinilangFactory.eINSTANCE.createLine();
		createLine.setX1(x1);
		createLine.setY1(y1);
		createLine.setX2(x2);
		createLine.setY2(y2);
		program.getLines().add(createLine);
		
		program.setX(x2);
		program.setY(y2);

		
	}
	
	/**
	 * @generated NOT
	 * @param obj
	 * @return
	 */
	private Program findProgram(EObject obj) {
		final Program ret;
		if (obj instanceof Program) {
			ret = (Program) obj;
		} else if (obj.eContainer() != null) {
			ret = findProgram(obj.eContainer());
		} else {
			ret = null;
		}

		return ret;

	}

	/**
	 * @generated NOT
	 * @param program
	 * @return
	 */
	
	private double coordinatesToAngle(final Program program) {
		double angle;

		switch (program.getAngle()) {

		case EAST:
			angle = 0;
			break;
		case NORTH:
			angle = 270;
			break;
		case SOUTH:
			angle = 90;
			break;
		case WEST:
			angle = 180;
			break;
		default:
			angle = 0;
			break;
		}
		return angle;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public <T> T accept(MinilangVisitor<T> visitor) {
		return visitor.visitMove(this);
	}
} //MoveImpl
