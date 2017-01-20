package minilang.aspects;

import java.util.Map;
import minilang.Modulo;
import minilang.aspects.ModuloAspectModuloAspectProperties;

@SuppressWarnings("all")
public class ModuloAspectModuloAspectContext {
  public final static ModuloAspectModuloAspectContext INSTANCE = new ModuloAspectModuloAspectContext();
  
  public static ModuloAspectModuloAspectProperties getSelf(final Modulo _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minilang.aspects.ModuloAspectModuloAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Modulo, ModuloAspectModuloAspectProperties> map = new java.util.WeakHashMap<minilang.Modulo, minilang.aspects.ModuloAspectModuloAspectProperties>();
  
  public Map<Modulo, ModuloAspectModuloAspectProperties> getMap() {
    return map;
  }
}
