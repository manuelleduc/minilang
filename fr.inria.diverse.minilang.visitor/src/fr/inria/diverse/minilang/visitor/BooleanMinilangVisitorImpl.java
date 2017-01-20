package fr.inria.diverse.minilang.visitor;

import minilang.GreaterThan;

public class BooleanMinilangVisitorImpl extends DefaultMinilangVisitor<Boolean> {

	private DoubleMinilangVisitorImpl visitorDouble = new DoubleMinilangVisitorImpl();

	@Override
	public Boolean visitGreaterThan(GreaterThan greaterThan) {
		return greaterThan.getLeft().accept(visitorDouble) > greaterThan.getRight().accept(visitorDouble);
	}

}
