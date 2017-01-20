package fr.inria.diverse.minilang.visitor;

import minilang.Constant;
import minilang.Modulo;
import minilang.Sum;
import minilang.VariableRef;

public class DoubleMinilangVisitorImpl extends DefaultMinilangVisitor<Double>{

	@Override
	public Double visitConstant(Constant constant) {
		return constant.getValue();
	}

	@Override
	public Double visitVariableRef(VariableRef variableRef) {
		return variableRef.getVariable().getValue();
	}

	@Override
	public Double visitModulo(Modulo modulo) {
		return modulo.getLeft().accept(this) % modulo.getRight().accept(this);
	}

	@Override
	public Double visitSum(Sum sum) {
		return sum.getLeft().accept(this) + sum.getRight().accept(this);
	}

}
