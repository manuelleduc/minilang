package minilang.aspects;

import java.util.Map;
import minilang.Sum;
import minilang.aspects.SumAspectSumAspectProperties;

@SuppressWarnings("all")
public class SumAspectSumAspectContext {
  public final static SumAspectSumAspectContext INSTANCE = new SumAspectSumAspectContext();
  
  public static SumAspectSumAspectProperties getSelf(final Sum _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.SumAspectSumAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Sum, SumAspectSumAspectProperties> map = new java.util.WeakHashMap<minilang.Sum, minilang.aspects.SumAspectSumAspectProperties>();
  
  public Map<Sum, SumAspectSumAspectProperties> getMap() {
    return map;
  }
}
