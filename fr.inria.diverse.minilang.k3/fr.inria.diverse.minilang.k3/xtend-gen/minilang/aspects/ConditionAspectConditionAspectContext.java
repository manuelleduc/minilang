package minilang.aspects;

import java.util.Map;
import minilang.Condition;
import minilang.aspects.ConditionAspectConditionAspectProperties;

@SuppressWarnings("all")
public class ConditionAspectConditionAspectContext {
  public final static ConditionAspectConditionAspectContext INSTANCE = new ConditionAspectConditionAspectContext();
  
  public static ConditionAspectConditionAspectProperties getSelf(final Condition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.ConditionAspectConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Condition, ConditionAspectConditionAspectProperties> map = new java.util.WeakHashMap<minilang.Condition, minilang.aspects.ConditionAspectConditionAspectProperties>();
  
  public Map<Condition, ConditionAspectConditionAspectProperties> getMap() {
    return map;
  }
}
