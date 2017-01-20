package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import minilang.Constant;
import minilang.aspects.ConstantAspectConstantAspectProperties;
import minilang.aspects.ValueAspect;

@Aspect(className = Constant.class)
@SuppressWarnings("all")
public class ConstantAspect extends ValueAspect {
  @OverrideAspectMethod
  public static double valueK3(final Constant _self) {
    final minilang.aspects.ConstantAspectConstantAspectProperties _self_ = minilang.aspects.ConstantAspectConstantAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof minilang.Constant){
    					result = minilang.aspects.ConstantAspect._privk3_valueK3(_self_, (minilang.Constant)_self);
    } else  if (_self instanceof minilang.Value){
    					result = minilang.aspects.ValueAspect.valueK3((minilang.Value)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static double _privk3_valueK3(final ConstantAspectConstantAspectProperties _self_, final Constant _self) {
    return _self.getValue();
  }
}
