package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import minilang.Block;
import minilang.Condition;
import minilang.IfStmt;
import minilang.aspects.BlockAspect;
import minilang.aspects.ConditionAspect;
import minilang.aspects.IfStmtAspectIfStmtAspectProperties;
import minilang.aspects.StatementAspect;

@Aspect(className = IfStmt.class)
@SuppressWarnings("all")
public class IfStmtAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void executeK3(final IfStmt _self) {
    final minilang.aspects.IfStmtAspectIfStmtAspectProperties _self_ = minilang.aspects.IfStmtAspectIfStmtAspectContext.getSelf(_self);
     if (_self instanceof minilang.IfStmt){
    					minilang.aspects.IfStmtAspect._privk3_executeK3(_self_, (minilang.IfStmt)_self);
    } else  if (_self instanceof minilang.Statement){
    					minilang.aspects.StatementAspect.executeK3((minilang.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_executeK3(final IfStmt _self) {
    final minilang.aspects.StatementAspectStatementAspectProperties _self_ = minilang.aspects.StatementAspectStatementAspectContext.getSelf(_self);
     minilang.aspects.StatementAspect._privk3_executeK3(_self_, _self);
  }
  
  protected static void _privk3_executeK3(final IfStmtAspectIfStmtAspectProperties _self_, final IfStmt _self) {
    Condition _condition = _self.getCondition();
    boolean _evalK3 = ConditionAspect.evalK3(_condition);
    if (_evalK3) {
      Block _thenBranch = _self.getThenBranch();
      BlockAspect.executeK3(_thenBranch);
    } else {
      Block _elseBranch = _self.getElseBranch();
      if (_elseBranch!=null) {
        BlockAspect.executeK3(_elseBranch);
      }
    }
  }
}
