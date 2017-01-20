package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import minilang.BinaryOperation;
import minilang.aspects.ValueAspect;

@Aspect(className = BinaryOperation.class)
@SuppressWarnings("all")
public abstract class BinaryOperationAspect extends ValueAspect {
}
