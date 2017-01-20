package minilang.aspects;

import java.util.Map;
import minilang.RotateLeft;
import minilang.aspects.RotateLeftAspectRotateLeftAspectProperties;

@SuppressWarnings("all")
public class RotateLeftAspectRotateLeftAspectContext {
  public final static RotateLeftAspectRotateLeftAspectContext INSTANCE = new RotateLeftAspectRotateLeftAspectContext();
  
  public static RotateLeftAspectRotateLeftAspectProperties getSelf(final RotateLeft _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.RotateLeftAspectRotateLeftAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RotateLeft, RotateLeftAspectRotateLeftAspectProperties> map = new java.util.WeakHashMap<minilang.RotateLeft, minilang.aspects.RotateLeftAspectRotateLeftAspectProperties>();
  
  public Map<RotateLeft, RotateLeftAspectRotateLeftAspectProperties> getMap() {
    return map;
  }
}
