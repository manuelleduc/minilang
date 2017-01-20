package minilang.aspects;

import java.util.Map;
import minilang.Method;
import minilang.aspects.MethodAspectMethodAspectProperties;

@SuppressWarnings("all")
public class MethodAspectMethodAspectContext {
  public final static MethodAspectMethodAspectContext INSTANCE = new MethodAspectMethodAspectContext();
  
  public static MethodAspectMethodAspectProperties getSelf(final Method _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.MethodAspectMethodAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Method, MethodAspectMethodAspectProperties> map = new java.util.WeakHashMap<minilang.Method, minilang.aspects.MethodAspectMethodAspectProperties>();
  
  public Map<Method, MethodAspectMethodAspectProperties> getMap() {
    return map;
  }
}
