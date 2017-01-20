package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import minilang.Block;
import minilang.Method;
import minilang.aspects.BlockAspect;
import minilang.aspects.MethodAspectMethodAspectProperties;

@Aspect(className = Method.class)
@SuppressWarnings("all")
public class MethodAspect {
  public static void executeK3(final Method _self) {
    final minilang.aspects.MethodAspectMethodAspectProperties _self_ = minilang.aspects.MethodAspectMethodAspectContext.getSelf(_self);
    _privk3_executeK3(_self_, _self);;
  }
  
  protected static void _privk3_executeK3(final MethodAspectMethodAspectProperties _self_, final Method _self) {
    Block _block = _self.getBlock();
    BlockAspect.executeK3(_block);
  }
}
