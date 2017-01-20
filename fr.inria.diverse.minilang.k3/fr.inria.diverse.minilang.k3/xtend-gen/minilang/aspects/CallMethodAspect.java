package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import minilang.CallMethod;
import minilang.Method;
import minilang.aspects.CallMethodAspectCallMethodAspectProperties;
import minilang.aspects.MethodAspect;
import minilang.aspects.StatementAspect;

@Aspect(className = CallMethod.class)
@SuppressWarnings("all")
public class CallMethodAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void executeK3(final CallMethod _self) {
    final minilang.aspects.CallMethodAspectCallMethodAspectProperties _self_ = minilang.aspects.CallMethodAspectCallMethodAspectContext.getSelf(_self);
     if (_self instanceof minilang.CallMethod){
    					minilang.aspects.CallMethodAspect._privk3_executeK3(_self_, (minilang.CallMethod)_self);
    } else  if (_self instanceof minilang.Statement){
    					minilang.aspects.StatementAspect.executeK3((minilang.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_executeK3(final CallMethodAspectCallMethodAspectProperties _self_, final CallMethod _self) {
    Method _method = _self.getMethod();
    MethodAspect.executeK3(_method);
  }
}
