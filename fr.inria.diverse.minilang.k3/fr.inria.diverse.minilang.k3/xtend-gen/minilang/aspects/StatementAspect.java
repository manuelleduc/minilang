package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import minilang.Statement;
import minilang.aspects.StatementAspectStatementAspectProperties;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public abstract class StatementAspect {
  @Abstract
  public static void executeK3(final Statement _self) {
    final minilang.aspects.StatementAspectStatementAspectProperties _self_ = minilang.aspects.StatementAspectStatementAspectContext.getSelf(_self);
     if (_self instanceof minilang.Move){
    					minilang.aspects.MoveAspect.executeK3((minilang.Move)_self);
    } else  if (_self instanceof minilang.RotateRight){
    					minilang.aspects.RotateRightAspect.executeK3((minilang.RotateRight)_self);
    } else  if (_self instanceof minilang.VariableAffect){
    					minilang.aspects.VariableAffectAspect.executeK3((minilang.VariableAffect)_self);
    } else  if (_self instanceof minilang.CallMethod){
    					minilang.aspects.CallMethodAspect.executeK3((minilang.CallMethod)_self);
    } else  if (_self instanceof minilang.IfStmt){
    					minilang.aspects.IfStmtAspect.executeK3((minilang.IfStmt)_self);
    } else  if (_self instanceof minilang.RotateLeft){
    					minilang.aspects.RotateLeftAspect.executeK3((minilang.RotateLeft)_self);
    } else  if (_self instanceof minilang.Statement){
    					minilang.aspects.StatementAspect._privk3_executeK3(_self_, (minilang.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_executeK3(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
