package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import minilang.Condition;
import minilang.aspects.ConditionAspectConditionAspectProperties;

@Aspect(className = Condition.class)
@SuppressWarnings("all")
public abstract class ConditionAspect {
  @Abstract
  public static boolean evalK3(final Condition _self) {
    final minilang.aspects.ConditionAspectConditionAspectProperties _self_ = minilang.aspects.ConditionAspectConditionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof minilang.GreaterThan){
    					result = minilang.aspects.GreaterThanAspect.evalK3((minilang.GreaterThan)_self);
    } else  if (_self instanceof minilang.Condition){
    					result = minilang.aspects.ConditionAspect._privk3_evalK3(_self_, (minilang.Condition)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalK3(final ConditionAspectConditionAspectProperties _self_, final Condition _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
