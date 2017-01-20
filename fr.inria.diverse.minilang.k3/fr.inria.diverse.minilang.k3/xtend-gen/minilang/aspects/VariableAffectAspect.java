package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import minilang.Value;
import minilang.Variable;
import minilang.VariableAffect;
import minilang.aspects.StatementAspect;
import minilang.aspects.ValueAspect;
import minilang.aspects.VariableAffectAspectVariableAffectAspectProperties;

@Aspect(className = VariableAffect.class)
@SuppressWarnings("all")
public class VariableAffectAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void executeK3(final VariableAffect _self) {
    final minilang.aspects.VariableAffectAspectVariableAffectAspectProperties _self_ = minilang.aspects.VariableAffectAspectVariableAffectAspectContext.getSelf(_self);
     if (_self instanceof minilang.VariableAffect){
    					minilang.aspects.VariableAffectAspect._privk3_executeK3(_self_, (minilang.VariableAffect)_self);
    } else  if (_self instanceof minilang.Statement){
    					minilang.aspects.StatementAspect.executeK3((minilang.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_executeK3(final VariableAffectAspectVariableAffectAspectProperties _self_, final VariableAffect _self) {
    Variable _variable = _self.getVariable();
    Value _value = _self.getValue();
    double _valueK3 = ValueAspect.valueK3(_value);
    _variable.setValue(_valueK3);
  }
}
