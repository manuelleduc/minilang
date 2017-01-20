package minilang.aspects;

import java.util.Map;
import minilang.BinaryOperation;
import minilang.aspects.BinaryOperationAspectBinaryOperationAspectProperties;

@SuppressWarnings("all")
public class BinaryOperationAspectBinaryOperationAspectContext {
  public final static BinaryOperationAspectBinaryOperationAspectContext INSTANCE = new BinaryOperationAspectBinaryOperationAspectContext();
  
  public static BinaryOperationAspectBinaryOperationAspectProperties getSelf(final BinaryOperation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.BinaryOperationAspectBinaryOperationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BinaryOperation, BinaryOperationAspectBinaryOperationAspectProperties> map = new java.util.WeakHashMap<minilang.BinaryOperation, minilang.aspects.BinaryOperationAspectBinaryOperationAspectProperties>();
  
  public Map<BinaryOperation, BinaryOperationAspectBinaryOperationAspectProperties> getMap() {
    return map;
  }
}
