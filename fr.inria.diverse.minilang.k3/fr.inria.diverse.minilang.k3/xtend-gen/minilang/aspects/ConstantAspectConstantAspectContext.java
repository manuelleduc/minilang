package minilang.aspects;

import java.util.Map;
import minilang.Constant;
import minilang.aspects.ConstantAspectConstantAspectProperties;

@SuppressWarnings("all")
public class ConstantAspectConstantAspectContext {
  public final static ConstantAspectConstantAspectContext INSTANCE = new ConstantAspectConstantAspectContext();
  
  public static ConstantAspectConstantAspectProperties getSelf(final Constant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.ConstantAspectConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Constant, ConstantAspectConstantAspectProperties> map = new java.util.WeakHashMap<minilang.Constant, minilang.aspects.ConstantAspectConstantAspectProperties>();
  
  public Map<Constant, ConstantAspectConstantAspectProperties> getMap() {
    return map;
  }
}
