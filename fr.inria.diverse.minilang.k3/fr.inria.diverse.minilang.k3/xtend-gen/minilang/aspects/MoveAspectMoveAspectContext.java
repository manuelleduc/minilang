package minilang.aspects;

import java.util.Map;
import minilang.Move;
import minilang.aspects.MoveAspectMoveAspectProperties;

@SuppressWarnings("all")
public class MoveAspectMoveAspectContext {
  public final static MoveAspectMoveAspectContext INSTANCE = new MoveAspectMoveAspectContext();
  
  public static MoveAspectMoveAspectProperties getSelf(final Move _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.MoveAspectMoveAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Move, MoveAspectMoveAspectProperties> map = new java.util.WeakHashMap<minilang.Move, minilang.aspects.MoveAspectMoveAspectProperties>();
  
  public Map<Move, MoveAspectMoveAspectProperties> getMap() {
    return map;
  }
}
