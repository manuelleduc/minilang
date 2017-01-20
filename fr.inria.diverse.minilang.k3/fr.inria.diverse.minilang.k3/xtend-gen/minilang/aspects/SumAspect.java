package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import minilang.Sum;
import minilang.Value;
import minilang.aspects.BinaryOperationAspect;
import minilang.aspects.SumAspectSumAspectProperties;
import minilang.aspects.ValueAspect;

@Aspect(className = Sum.class)
@SuppressWarnings("all")
public class SumAspect extends BinaryOperationAspect {
  @OverrideAspectMethod
  public static double valueK3(final Sum _self) {
    final minilang.aspects.SumAspectSumAspectProperties _self_ = minilang.aspects.SumAspectSumAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof minilang.Sum){
    					result = minilang.aspects.SumAspect._privk3_valueK3(_self_, (minilang.Sum)_self);
    } else  if (_self instanceof minilang.Value){
    					result = minilang.aspects.ValueAspect.valueK3((minilang.Value)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static double _privk3_valueK3(final SumAspectSumAspectProperties _self_, final Sum _self) {
    Value _left = _self.getLeft();
    double _valueK3 = ValueAspect.valueK3(_left);
    Value _right = _self.getRight();
    double _valueK3_1 = ValueAspect.valueK3(_right);
    return (_valueK3 + _valueK3_1);
  }
}
