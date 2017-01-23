package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import minilang.Value;
import minilang.aspects.ValueAspectValueAspectProperties;

@Aspect(className = Value.class)
@SuppressWarnings("all")
public abstract class ValueAspect {
  @Abstract
  public static double valueK3(final Value _self) {
    final minilang.aspects.ValueAspectValueAspectProperties _self_ = minilang.aspects.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof minilang.Modulo){
    					result = minilang.aspects.ModuloAspect.valueK3((minilang.Modulo)_self);
    } else  if (_self instanceof minilang.VariableRef){
    					result = minilang.aspects.VariableRefAspect.valueK3((minilang.VariableRef)_self);
    } else  if (_self instanceof minilang.Sum){
    					result = minilang.aspects.SumAspect.valueK3((minilang.Sum)_self);
    } else  if (_self instanceof minilang.Constant){
    					result = minilang.aspects.ConstantAspect.valueK3((minilang.Constant)_self);
    } else  if (_self instanceof minilang.Value){
    					result = minilang.aspects.ValueAspect._privk3_valueK3(_self_, (minilang.Value)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static double _privk3_valueK3(final ValueAspectValueAspectProperties _self_, final Value _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
