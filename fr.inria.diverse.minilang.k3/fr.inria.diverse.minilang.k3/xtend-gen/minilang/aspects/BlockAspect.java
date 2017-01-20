package minilang.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import minilang.Block;
import minilang.Statement;
import minilang.aspects.BlockAspectBlockAspectProperties;
import minilang.aspects.StatementAspect;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect {
  public static void executeK3(final Block _self) {
    final minilang.aspects.BlockAspectBlockAspectProperties _self_ = minilang.aspects.BlockAspectBlockAspectContext.getSelf(_self);
    _privk3_executeK3(_self_, _self);;
  }
  
  protected static void _privk3_executeK3(final BlockAspectBlockAspectProperties _self_, final Block _self) {
    EList<Statement> _statements = _self.getStatements();
    for (final Statement statement : _statements) {
      StatementAspect.executeK3(statement);
    }
  }
}
