package minilang.algebra;

import minilang.Block;
import minilang.CallMethod;
import minilang.Condition;
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
import minilang.Statement;
import minilang.Sum;
import minilang.Value;
import minilang.Variable;
import minilang.VariableAffect;
import minilang.VariableRef;
import java.util.Map;

public interface MinilangAlgebra<A, B, C, D, E, F, G, H> {

	B block(final Block block);

	C callMethod(final CallMethod callMethod);

	A constant(final Constant constant);

	D greaterThan(final GreaterThan greaterThan);

	C ifStmt(final IfStmt ifStmt);

	E line(final Line line);

	F method(final Method method);

	A modulo(final Modulo modulo);

	C move(final Move move);

	G program(final Program program);

	C rotateLeft(final RotateLeft rotateLeft);

	C rotateRight(final RotateRight rotateRight);

	A sum(final Sum sum);

	H variable(final Variable variable);

	C variableAffect(final VariableAffect variableAffect);

	A variableRef(final VariableRef variableRef);

	
	public default Map<Value, A> getValueMemo() {
		return null;
	}
	
	public default A $(final Value value) {
		final A ret;
		final Map<Value, A> memo = getValueMemo();
		if(memo != null && memo.containsKey(value)) {
			ret = memo.get(value);
		} else {
			if (value.eClass().getName().equals("Constant")) {
				ret = this.constant((Constant) value);
			} else if (value.eClass().getName().equals("Modulo")) {
				ret = this.modulo((Modulo) value);
			} else if (value.eClass().getName().equals("Sum")) {
				ret = this.sum((Sum) value);
			} else if (value.eClass().getName().equals("VariableRef")) {
				ret = this.variableRef((VariableRef) value);
			} else {
							throw new RuntimeException("Unknow Value " + value);
		}
			if(memo != null) memo.put(value, ret);
		}
		return ret;
	}
	
	public default Map<Block, B> getBlockMemo() {
		return null;
	}
	
	public default B $(final Block block) {
		final B ret;
		final Map<Block, B> memo = getBlockMemo();
		if(memo != null && memo.containsKey(block)) {
			ret = memo.get(block);
		} else {
			if (block.eClass().getName().equals("Block")) {
				ret = this.block((Block) block);
			} else {
							throw new RuntimeException("Unknow Block " + block);
		}
			if(memo != null) memo.put(block, ret);
		}
		return ret;
	}
	
	public default Map<Statement, C> getStatementMemo() {
		return null;
	}
	
	public default C $(final Statement statement) {
		final C ret;
		final Map<Statement, C> memo = getStatementMemo();
		if(memo != null && memo.containsKey(statement)) {
			ret = memo.get(statement);
		} else {
			if (statement.eClass().getName().equals("CallMethod")) {
				ret = this.callMethod((CallMethod) statement);
			} else if (statement.eClass().getName().equals("IfStmt")) {
				ret = this.ifStmt((IfStmt) statement);
			} else if (statement.eClass().getName().equals("Move")) {
				ret = this.move((Move) statement);
			} else if (statement.eClass().getName().equals("RotateLeft")) {
				ret = this.rotateLeft((RotateLeft) statement);
			} else if (statement.eClass().getName().equals("RotateRight")) {
				ret = this.rotateRight((RotateRight) statement);
			} else if (statement.eClass().getName().equals("VariableAffect")) {
				ret = this.variableAffect((VariableAffect) statement);
			} else {
							throw new RuntimeException("Unknow Statement " + statement);
		}
			if(memo != null) memo.put(statement, ret);
		}
		return ret;
	}
	
	public default Map<Condition, D> getConditionMemo() {
		return null;
	}
	
	public default D $(final Condition condition) {
		final D ret;
		final Map<Condition, D> memo = getConditionMemo();
		if(memo != null && memo.containsKey(condition)) {
			ret = memo.get(condition);
		} else {
			if (condition.eClass().getName().equals("GreaterThan")) {
				ret = this.greaterThan((GreaterThan) condition);
			} else {
							throw new RuntimeException("Unknow Condition " + condition);
		}
			if(memo != null) memo.put(condition, ret);
		}
		return ret;
	}
	
	public default Map<Line, E> getLineMemo() {
		return null;
	}
	
	public default E $(final Line line) {
		final E ret;
		final Map<Line, E> memo = getLineMemo();
		if(memo != null && memo.containsKey(line)) {
			ret = memo.get(line);
		} else {
			if (line.eClass().getName().equals("Line")) {
				ret = this.line((Line) line);
			} else {
							throw new RuntimeException("Unknow Line " + line);
		}
			if(memo != null) memo.put(line, ret);
		}
		return ret;
	}
	
	public default Map<Method, F> getMethodMemo() {
		return null;
	}
	
	public default F $(final Method method) {
		final F ret;
		final Map<Method, F> memo = getMethodMemo();
		if(memo != null && memo.containsKey(method)) {
			ret = memo.get(method);
		} else {
			if (method.eClass().getName().equals("Method")) {
				ret = this.method((Method) method);
			} else {
							throw new RuntimeException("Unknow Method " + method);
		}
			if(memo != null) memo.put(method, ret);
		}
		return ret;
	}
	
	public default Map<Program, G> getProgramMemo() {
		return null;
	}
	
	public default G $(final Program program) {
		final G ret;
		final Map<Program, G> memo = getProgramMemo();
		if(memo != null && memo.containsKey(program)) {
			ret = memo.get(program);
		} else {
			if (program.eClass().getName().equals("Program")) {
				ret = this.program((Program) program);
			} else {
							throw new RuntimeException("Unknow Program " + program);
		}
			if(memo != null) memo.put(program, ret);
		}
		return ret;
	}
	
	public default Map<Variable, H> getVariableMemo() {
		return null;
	}
	
	public default H $(final Variable variable) {
		final H ret;
		final Map<Variable, H> memo = getVariableMemo();
		if(memo != null && memo.containsKey(variable)) {
			ret = memo.get(variable);
		} else {
			if (variable.eClass().getName().equals("Variable")) {
				ret = this.variable((Variable) variable);
			} else {
							throw new RuntimeException("Unknow Variable " + variable);
		}
			if(memo != null) memo.put(variable, ret);
		}
		return ret;
	}
}