package minilang.aspects;

import java.util.Map;
import minilang.VariableAffect;
import minilang.aspects.VariableAffectAspectVariableAffectAspectProperties;

@SuppressWarnings("all")
public class VariableAffectAspectVariableAffectAspectContext {
  public final static VariableAffectAspectVariableAffectAspectContext INSTANCE = new VariableAffectAspectVariableAffectAspectContext();
  
  public static VariableAffectAspectVariableAffectAspectProperties getSelf(final VariableAffect _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.VariableAffectAspectVariableAffectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VariableAffect, VariableAffectAspectVariableAffectAspectProperties> map = new java.util.WeakHashMap<minilang.VariableAffect, minilang.aspects.VariableAffectAspectVariableAffectAspectProperties>();
  
  public Map<VariableAffect, VariableAffectAspectVariableAffectAspectProperties> getMap() {
    return map;
  }
}
