package minilang.visitor;

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

public interface MinilangVisitor<T> {

	T visitBlock(Block block);

	T visitCallMethod(CallMethod callMethod);

	T visitConstant(Constant constant);

	T visitGreaterThan(GreaterThan greaterThan);

	T visitModulo(Modulo modulo);

	T visitMove(Move move);

	T visitProgram(Program program);

	T visitRotateLeft(RotateLeft rotateLeft);

	T visitRotateRight(RotateRight rotateRight);

	T visitSum(Sum sum);

	T visitVariableAffect(VariableAffect variableAffect);

	T visitVariable(Variable variable);

	T visitVariableRef(VariableRef variableRef);

	T visitIfStmt(IfStmt ifStmt);

	T visitLineStmt(Line line);

	T visitMethod(Method method);

}
