package fr.inria.diverse.minilang.visitor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.springframework.beans.factory.annotation.Autowired;

import minilang.Block;
import minilang.CallMethod;
import minilang.Cardinals;
import minilang.IfStmt;
import minilang.Line;
import minilang.Method;
import minilang.MinilangFactory;
import minilang.Move;
import minilang.Program;
import minilang.RotateLeft;
import minilang.RotateRight;
import minilang.Statement;
import minilang.VariableAffect;

public class VoidMinilangVisitorImpl extends DefaultMinilangVisitor<Void> {

	@Autowired
	private BooleanMinilangVisitorImpl conditionVisitor = new BooleanMinilangVisitorImpl();
	private DoubleMinilangVisitorImpl doubleVisitor = new DoubleMinilangVisitorImpl();

	@Override
	public Void visitProgram(Program program) {
		program.getMainMethod().accept(this);
		return null;
	}

	@Override
	public Void visitMethod(Method method) {
		method.getBlock().accept(this);
		return null;
	}

	@Override
	public Void visitBlock(Block block) {
		EList<Statement> statements = block.getStatements();
		statements.forEach(t -> {
			t.accept(this);
		});
		return null;
	}

	@Override
	public Void visitCallMethod(CallMethod callMethod) {
		callMethod.getMethod().accept(this);
		return null;
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

	@Override
	public Void visitMove(Move move) {
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

	@Override
	public Void visitRotateLeft(RotateLeft rotateLeft) {
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
	public Void visitRotateRight(RotateRight rotateRight) {
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
	public Void visitIfStmt(IfStmt ifStmt) {
		if (ifStmt.getCondition().accept(conditionVisitor)) {
			ifStmt.getThenBranch().accept(this);
		} else {
			if (ifStmt.getElseBranch() != null) {
				ifStmt.getElseBranch().accept(this);
			}
		}

		return null;
	}

	@Override
	public Void visitVariableAffect(VariableAffect variableAffect) {
		variableAffect.getVariable().setValue(variableAffect.getValue().accept(doubleVisitor));
		return null;
	}

}
