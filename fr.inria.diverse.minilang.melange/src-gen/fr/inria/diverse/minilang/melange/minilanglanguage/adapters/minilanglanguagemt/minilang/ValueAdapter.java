package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Value;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ValueAdapter extends EObjectAdapter<Value> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Value {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public ValueAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  @Override
  public double valueK3() {
    return fr.inria.diverse.minilang.melange.minilanglanguage.aspects.ValueAspect.valueK3(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getValue();
  }
}
