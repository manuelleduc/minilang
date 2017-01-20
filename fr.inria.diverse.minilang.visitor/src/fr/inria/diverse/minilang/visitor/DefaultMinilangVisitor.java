package fr.inria.diverse.minilang.visitor;

import minilang.Block;
import minilang.CallMethod;
import minilang.Constant;
import minilang.GreaterThan;
import minilang.IfStmt;
import minilang.Line;
import minilang.Method;
import minilang.Modulo;
import minilang.Move;
import minilang.Program;
import minilang.RotateLeft;
import minilang.RotateRight;
import minilang.Sum;
import minilang.Variable;
import minilang.VariableAffect;
import minilang.VariableRef;
import minilang.visitor.MinilangVisitor;

public abstract class DefaultMinilangVisitor<T> implements MinilangVisitor<T> {

	public T visitBlock(Block block) {
		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitCallMethod(CallMethod callMethod) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitConstant(Constant constant) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitGreaterThan(GreaterThan greaterThan) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitModulo(Modulo modulo) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitMove(Move move) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitProgram(Program program) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitRotateLeft(RotateLeft rotateLeft) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitRotateRight(RotateRight rotateRight) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitSum(Sum sum) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitVariableAffect(VariableAffect variableAffect) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitVariable(Variable variable) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitVariableRef(VariableRef variableRef) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitIfStmt(IfStmt ifStmt) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitLineStmt(Line line) {

		throw new RuntimeException("not implemented");
	}

	@Override
	public T visitMethod(Method method) {

		throw new RuntimeException("not implemented");
	}

}
