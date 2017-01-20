package minilang.aspects;

import java.util.Map;
import minilang.GreaterThan;
import minilang.aspects.GreaterThanAspectGreaterThanAspectProperties;

@SuppressWarnings("all")
public class GreaterThanAspectGreaterThanAspectContext {
  public final static GreaterThanAspectGreaterThanAspectContext INSTANCE = new GreaterThanAspectGreaterThanAspectContext();
  
  public static GreaterThanAspectGreaterThanAspectProperties getSelf(final GreaterThan _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.GreaterThanAspectGreaterThanAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GreaterThan, GreaterThanAspectGreaterThanAspectProperties> map = new java.util.WeakHashMap<minilang.GreaterThan, minilang.aspects.GreaterThanAspectGreaterThanAspectProperties>();
  
  public Map<GreaterThan, GreaterThanAspectGreaterThanAspectProperties> getMap() {
    return map;
  }
}
