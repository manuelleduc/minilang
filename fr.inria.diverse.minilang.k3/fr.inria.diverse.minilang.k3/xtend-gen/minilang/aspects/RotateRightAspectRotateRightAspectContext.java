package minilang.aspects;

import java.util.Map;
import minilang.RotateRight;
import minilang.aspects.RotateRightAspectRotateRightAspectProperties;

@SuppressWarnings("all")
public class RotateRightAspectRotateRightAspectContext {
  public final static RotateRightAspectRotateRightAspectContext INSTANCE = new RotateRightAspectRotateRightAspectContext();
  
  public static RotateRightAspectRotateRightAspectProperties getSelf(final RotateRight _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.RotateRightAspectRotateRightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RotateRight, RotateRightAspectRotateRightAspectProperties> map = new java.util.WeakHashMap<minilang.RotateRight, minilang.aspects.RotateRightAspectRotateRightAspectProperties>();
  
  public Map<RotateRight, RotateRightAspectRotateRightAspectProperties> getMap() {
    return map;
  }
}
