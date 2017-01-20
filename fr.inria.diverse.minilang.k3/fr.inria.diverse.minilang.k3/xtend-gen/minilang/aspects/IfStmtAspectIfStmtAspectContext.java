package minilang.aspects;

import java.util.Map;
import minilang.IfStmt;
import minilang.aspects.IfStmtAspectIfStmtAspectProperties;

@SuppressWarnings("all")
public class IfStmtAspectIfStmtAspectContext {
  public final static IfStmtAspectIfStmtAspectContext INSTANCE = new IfStmtAspectIfStmtAspectContext();
  
  public static IfStmtAspectIfStmtAspectProperties getSelf(final IfStmt _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.IfStmtAspectIfStmtAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IfStmt, IfStmtAspectIfStmtAspectProperties> map = new java.util.WeakHashMap<minilang.IfStmt, minilang.aspects.IfStmtAspectIfStmtAspectProperties>();
  
  public Map<IfStmt, IfStmtAspectIfStmtAspectProperties> getMap() {
    return map;
  }
}
