package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Condition;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ConditionAdapter extends EObjectAdapter<Condition> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Condition {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public ConditionAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean evalK3() {
    return fr.inria.diverse.minilang.melange.minilanglanguage.aspects.ConditionAspect.evalK3(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getCondition();
  }
}
