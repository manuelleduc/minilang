package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import minilang.GreaterThan;
import minilang.Value;
import minilang.aspects.ConditionAspect;
import minilang.aspects.GreaterThanAspectGreaterThanAspectProperties;
import minilang.aspects.ValueAspect;

@Aspect(className = GreaterThan.class)
@SuppressWarnings("all")
public class GreaterThanAspect extends ConditionAspect {
  public static boolean evalK3(final GreaterThan _self) {
    final minilang.aspects.GreaterThanAspectGreaterThanAspectProperties _self_ = minilang.aspects.GreaterThanAspectGreaterThanAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof minilang.GreaterThan){
    					result = minilang.aspects.GreaterThanAspect._privk3_evalK3(_self_, (minilang.GreaterThan)_self);
    } else  if (_self instanceof minilang.Condition){
    					result = minilang.aspects.ConditionAspect.evalK3((minilang.Condition)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_evalK3(final GreaterThanAspectGreaterThanAspectProperties _self_, final GreaterThan _self) {
    Value _left = _self.getLeft();
    double _valueK3 = ValueAspect.valueK3(_left);
    Value _right = _self.getRight();
    double _valueK3_1 = ValueAspect.valueK3(_right);
    return (_valueK3 > _valueK3_1);
  }
}
