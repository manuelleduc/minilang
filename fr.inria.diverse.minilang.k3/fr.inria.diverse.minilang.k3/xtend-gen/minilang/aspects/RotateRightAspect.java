package minilang.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import minilang.Cardinals;
import minilang.Program;
import minilang.RotateRight;
import minilang.aspects.RotateRightAspectRotateRightAspectProperties;
import minilang.aspects.StatementAspect;
import org.eclipse.emf.ecore.EObject;

@Aspect(className = RotateRight.class)
@SuppressWarnings("all")
public class RotateRightAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void executeK3(final RotateRight _self) {
    final minilang.aspects.RotateRightAspectRotateRightAspectProperties _self_ = minilang.aspects.RotateRightAspectRotateRightAspectContext.getSelf(_self);
     if (_self instanceof minilang.RotateRight){
    					minilang.aspects.RotateRightAspect._privk3_executeK3(_self_, (minilang.RotateRight)_self);
    } else  if (_self instanceof minilang.Statement){
    					minilang.aspects.StatementAspect.executeK3((minilang.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static Program findProgram(final RotateRight _self, final EObject obj) {
    final minilang.aspects.RotateRightAspectRotateRightAspectProperties _self_ = minilang.aspects.RotateRightAspectRotateRightAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_findProgram(_self_, _self,obj);;
    return (minilang.Program)result;
  }
  
  protected static void _privk3_executeK3(final RotateRightAspectRotateRightAspectProperties _self_, final RotateRight _self) {
    final Program program = RotateRightAspect.findProgram(_self, _self);
    Cardinals _switchResult = null;
    Cardinals _angle = program.getAngle();
    if (_angle != null) {
      switch (_angle) {
        case EAST:
          _switchResult = Cardinals.SOUTH;
          break;
        case NORTH:
          _switchResult = Cardinals.EAST;
          break;
        case SOUTH:
          _switchResult = Cardinals.WEST;
          break;
        case WEST:
          _switchResult = Cardinals.NORTH;
          break;
        default:
          break;
      }
    }
    program.setAngle(_switchResult);
  }
  
  protected static Program _privk3_findProgram(final RotateRightAspectRotateRightAspectProperties _self_, final RotateRight _self, final EObject obj) {
    Program _xifexpression = null;
    if ((obj instanceof Program)) {
      _xifexpression = ((Program)obj);
    } else {
      Program _xifexpression_1 = null;
      EObject _eContainer = obj.eContainer();
      boolean _notEquals = (!Objects.equal(_eContainer, null));
      if (_notEquals) {
        EObject _eContainer_1 = obj.eContainer();
        _xifexpression_1 = RotateRightAspect.findProgram(_self, _eContainer_1);
      } else {
        _xifexpression_1 = null;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
