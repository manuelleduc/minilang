package minilang.aspects;

import java.util.Map;
import minilang.VariableRef;
import minilang.aspects.VariableRefAspectVariableRefAspectProperties;

@SuppressWarnings("all")
public class VariableRefAspectVariableRefAspectContext {
  public final static VariableRefAspectVariableRefAspectContext INSTANCE = new VariableRefAspectVariableRefAspectContext();
  
  public static VariableRefAspectVariableRefAspectProperties getSelf(final VariableRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.VariableRefAspectVariableRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VariableRef, VariableRefAspectVariableRefAspectProperties> map = new java.util.WeakHashMap<minilang.VariableRef, minilang.aspects.VariableRefAspectVariableRefAspectProperties>();
  
  public Map<VariableRef, VariableRefAspectVariableRefAspectProperties> getMap() {
    return map;
  }
}
