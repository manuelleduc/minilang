package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import minilang.Method;
import minilang.Program;
import minilang.aspects.MethodAspect;
import minilang.aspects.ProgramAspectProgramAspectProperties;

@Aspect(className = Program.class)
@SuppressWarnings("all")
public class ProgramAspect {
  @Main
  public static void mainK3(final Program _self) {
    final minilang.aspects.ProgramAspectProgramAspectProperties _self_ = minilang.aspects.ProgramAspectProgramAspectContext.getSelf(_self);
    _privk3_mainK3(_self_, _self);;
  }
  
  protected static void _privk3_mainK3(final ProgramAspectProgramAspectProperties _self_, final Program _self) {
    Method _mainMethod = _self.getMainMethod();
    MethodAspect.executeK3(_mainMethod);
  }
}
