package minilang.aspects;

import java.util.Map;
import minilang.Line;
import minilang.aspects.LineAspectLineAspectProperties;

@SuppressWarnings("all")
public class LineAspectLineAspectContext {
  public final static LineAspectLineAspectContext INSTANCE = new LineAspectLineAspectContext();
  
  public static LineAspectLineAspectProperties getSelf(final Line _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.LineAspectLineAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Line, LineAspectLineAspectProperties> map = new java.util.WeakHashMap<minilang.Line, minilang.aspects.LineAspectLineAspectProperties>();
  
  public Map<Line, LineAspectLineAspectProperties> getMap() {
    return map;
  }
}
