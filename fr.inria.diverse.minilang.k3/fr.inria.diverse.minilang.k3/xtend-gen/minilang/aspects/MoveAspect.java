package minilang.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import minilang.Cardinals;
import minilang.Line;
import minilang.MinilangFactory;
import minilang.Move;
import minilang.Program;
import minilang.aspects.MoveAspectMoveAspectProperties;
import minilang.aspects.StatementAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@Aspect(className = Move.class)
@SuppressWarnings("all")
public class MoveAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void executeK3(final Move _self) {
    final minilang.aspects.MoveAspectMoveAspectProperties _self_ = minilang.aspects.MoveAspectMoveAspectContext.getSelf(_self);
     if (_self instanceof minilang.Move){
    					minilang.aspects.MoveAspect._privk3_executeK3(_self_, (minilang.Move)_self);
    } else  if (_self instanceof minilang.Statement){
    					minilang.aspects.StatementAspect.executeK3((minilang.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static Program findProgram(final Move _self, final EObject obj) {
    final minilang.aspects.MoveAspectMoveAspectProperties _self_ = minilang.aspects.MoveAspectMoveAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_findProgram(_self_, _self,obj);;
    return (minilang.Program)result;
  }
  
  private static double coordinateToAngle(final Move _self, final Program program) {
    final minilang.aspects.MoveAspectMoveAspectProperties _self_ = minilang.aspects.MoveAspectMoveAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_coordinateToAngle(_self_, _self,program);;
    return (double)result;
  }
  
  protected static void _privk3_executeK3(final MoveAspectMoveAspectProperties _self_, final Move _self) {
    final Program program = MoveAspect.findProgram(_self, _self);
    final double x1 = program.getX();
    final double y1 = program.getY();
    final double angle = MoveAspect.coordinateToAngle(_self, program);
    double _distance = program.getDistance();
    double _radians = Math.toRadians(angle);
    double _cos = Math.cos(_radians);
    double _multiply = (_distance * _cos);
    final double x2 = (x1 + _multiply);
    double _distance_1 = program.getDistance();
    double _radians_1 = Math.toRadians(angle);
    double _sin = Math.sin(_radians_1);
    double _multiply_1 = (_distance_1 * _sin);
    final double y2 = (y1 + _multiply_1);
    final Line createLine = MinilangFactory.eINSTANCE.createLine();
    createLine.setX1(x1);
    createLine.setY1(y1);
    createLine.setX2(x2);
    createLine.setY2(y2);
    EList<Line> _lines = program.getLines();
    _lines.add(createLine);
    program.setX(x2);
    program.setY(y2);
  }
  
  protected static Program _privk3_findProgram(final MoveAspectMoveAspectProperties _self_, final Move _self, final EObject obj) {
    Program _xifexpression = null;
    if ((obj instanceof Program)) {
      _xifexpression = ((Program)obj);
    } else {
      Program _xifexpression_1 = null;
      EObject _eContainer = obj.eContainer();
      boolean _notEquals = (!Objects.equal(_eContainer, null));
      if (_notEquals) {
        EObject _eContainer_1 = obj.eContainer();
        _xifexpression_1 = MoveAspect.findProgram(_self, _eContainer_1);
      } else {
        _xifexpression_1 = null;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected static double _privk3_coordinateToAngle(final MoveAspectMoveAspectProperties _self_, final Move _self, final Program program) {
    int _switchResult = (int) 0;
    Cardinals _angle = program.getAngle();
    if (_angle != null) {
      switch (_angle) {
        case EAST:
          _switchResult = 0;
          break;
        case NORTH:
          _switchResult = 270;
          break;
        case SOUTH:
          _switchResult = 90;
          break;
        case WEST:
          _switchResult = 180;
          break;
        default:
          _switchResult = 0;
          break;
      }
    } else {
      _switchResult = 0;
    }
    return _switchResult;
  }
}
