package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import minilang.Modulo;
import minilang.Value;
import minilang.aspects.BinaryOperationAspect;
import minilang.aspects.ModuloAspectModuloAspectProperties;
import minilang.aspects.ValueAspect;

@Aspect(className = Modulo.class)
@SuppressWarnings("all")
public class ModuloAspect extends BinaryOperationAspect {
  @OverrideAspectMethod
  public static double valueK3(final Modulo _self) {
    final minilang.aspects.ModuloAspectModuloAspectProperties _self_ = minilang.aspects.ModuloAspectModuloAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof minilang.Modulo){
    					result = minilang.aspects.ModuloAspect._privk3_valueK3(_self_, (minilang.Modulo)_self);
    } else  if (_self instanceof minilang.Value){
    					result = minilang.aspects.ValueAspect.valueK3((minilang.Value)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static double _privk3_valueK3(final ModuloAspectModuloAspectProperties _self_, final Modulo _self) {
    Value _left = _self.getLeft();
    double _valueK3 = ValueAspect.valueK3(_left);
    Value _right = _self.getRight();
    double _valueK3_1 = ValueAspect.valueK3(_right);
    return (_valueK3 % _valueK3_1);
  }
}
