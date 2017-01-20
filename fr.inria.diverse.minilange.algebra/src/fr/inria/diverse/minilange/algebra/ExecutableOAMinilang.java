package fr.inria.diverse.minilange.algebra;

import org.eclipse.emf.ecore.EObject;

import minilang.Block;
import minilang.CallMethod;
import minilang.Cardinals;
import minilang.Constant;
import minilang.GreaterThan;
import minilang.IfStmt;
import minilang.Line;
import minilang.Method;
import minilang.MinilangFactory;
import minilang.Modulo;
import minilang.Move;
import minilang.Program;
import minilang.RotateLeft;
import minilang.RotateRight;
import minilang.Sum;
import minilang.Variable;
import minilang.VariableAffect;
import minilang.VariableRef;
import minilang.algebra.MinilangAlgebra;

public class ExecutableOAMinilang implements MinilangAlgebra<Double, Void, Void, Boolean, Void, Void, Void, Void> {

	@Override
	public Void block(Block block) {
		block.getStatements().forEach(t -> {
			$(t);
		});
		return null;
	}

	@Override
	public Void callMethod(CallMethod callMethod) {
		$(callMethod.getMethod());
		return null;
	}

	@Override
	public Double constant(Constant constant) {
		return constant.getValue();
	}

	@Override
	public Boolean greaterThan(GreaterThan greaterThan) {
		Double $ = $(greaterThan.getLeft());
		return $ > $(greaterThan.getRight());
	}

	@Override
	public Void ifStmt(IfStmt ifStmt) {
		if ($(ifStmt.getCondition())) {
			$(ifStmt.getThenBranch());
		} else {
			if (ifStmt.getElseBranch() != null) {
				$(ifStmt.getElseBranch());
			}
		}

		return null;
	}

	@Override
	public Void line(Line line) {
		// TODO Auto-generated method stub
		throw new RuntimeException("not implemented");
	}

	@Override
	public Void method(Method method) {
		$(method.getBlock());
		return null;
	}

	@Override
	public Double modulo(Modulo modulo) {
		return $(modulo.getLeft()) % $(modulo.getRight());
	}

	@Override
	public Void move(Move move) {
		final Program program = findProgram(move);
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

		return null;
	}

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

	@Override
	public Void program(Program program) {
		$(program.getMainMethod());
		return null;
	}

	@Override
	public Void rotateLeft(RotateLeft rotateLeft) {
		Program program = findProgram(rotateLeft);
		switch (program.getAngle()) {
		case EAST:
			program.setAngle(Cardinals.NORTH);
			break;
		case NORTH:
			program.setAngle(Cardinals.WEST);
			break;
		case SOUTH:
			program.setAngle(Cardinals.EAST);
			break;
		case WEST:
			program.setAngle(Cardinals.SOUTH);
			break;

		default:
			program.setAngle(Cardinals.NORTH);
			break;
		}
		
		return null;
	}

	@Override
	public Void rotateRight(RotateRight rotateRight) {
		Program program = findProgram(rotateRight);
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
		
		return null;
	}

	@Override
	public Double sum(Sum sum) {
		return $(sum.getLeft()) + $(sum.getRight());
	}

	@Override
	public Void variable(Variable variable) {
		// TODO Auto-generated method stub
		throw new RuntimeException("not implemented");
	}

	@Override
	public Void variableAffect(VariableAffect variableAffect) {
		variableAffect.getVariable().setValue($(variableAffect.getValue()));
		return null;
	}

	@Override
	public Double variableRef(VariableRef variableRef) {
		return variableRef.getVariable().getValue();
	}

}
