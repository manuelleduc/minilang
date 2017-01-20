package minilang.aspects;

import java.util.Map;
import minilang.CallMethod;
import minilang.aspects.CallMethodAspectCallMethodAspectProperties;

@SuppressWarnings("all")
public class CallMethodAspectCallMethodAspectContext {
  public final static CallMethodAspectCallMethodAspectContext INSTANCE = new CallMethodAspectCallMethodAspectContext();
  
  public static CallMethodAspectCallMethodAspectProperties getSelf(final CallMethod _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.CallMethodAspectCallMethodAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CallMethod, CallMethodAspectCallMethodAspectProperties> map = new java.util.WeakHashMap<minilang.CallMethod, minilang.aspects.CallMethodAspectCallMethodAspectProperties>();
  
  public Map<CallMethod, CallMethodAspectCallMethodAspectProperties> getMap() {
    return map;
  }
}
