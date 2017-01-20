package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import minilang.Variable;
import minilang.VariableRef;
import minilang.aspects.ValueAspect;
import minilang.aspects.VariableRefAspectVariableRefAspectProperties;

@Aspect(className = VariableRef.class)
@SuppressWarnings("all")
public class VariableRefAspect extends ValueAspect {
  @OverrideAspectMethod
  public static double valueK3(final VariableRef _self) {
    final minilang.aspects.VariableRefAspectVariableRefAspectProperties _self_ = minilang.aspects.VariableRefAspectVariableRefAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof minilang.VariableRef){
    					result = minilang.aspects.VariableRefAspect._privk3_valueK3(_self_, (minilang.VariableRef)_self);
    } else  if (_self instanceof minilang.Value){
    					result = minilang.aspects.ValueAspect.valueK3((minilang.Value)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static double _privk3_valueK3(final VariableRefAspectVariableRefAspectProperties _self_, final VariableRef _self) {
    Variable _variable = _self.getVariable();
    return _variable.getValue();
  }
}
