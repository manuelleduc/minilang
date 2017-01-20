/**
 */
package minilang.impl;

import minilang.Cardinals;
import minilang.MinilangPackage;
import minilang.Program;
import minilang.RotateRight;
import minilang.visitor.MinilangVisitor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotate Right</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RotateRightImpl extends StatementImpl implements RotateRight {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotateRightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinilangPackage.Literals.ROTATE_RIGHT;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void execute() {
		Program program = findProgram(this);
		switch (program.getAngle()) {
		case EAST:
			program.setAngle(Cardinals.SOUTH);
			break;
		case NORTH:
			program.setAngle(Cardinals.EAST);
			break;
		case SOUTH:
			program.setAngle(Cardinals.WEST);
			break;
		case WEST:
			program.setAngle(Cardinals.NORTH);
			break;

		default:
			program.setAngle(Cardinals.NORTH);
			break;
		}
		
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
	 */
	@Override
	public <T> T accept(MinilangVisitor<T> visitor) {
		return visitor.visitRotateRight(this);
	}
	
} //RotateRightImpl
