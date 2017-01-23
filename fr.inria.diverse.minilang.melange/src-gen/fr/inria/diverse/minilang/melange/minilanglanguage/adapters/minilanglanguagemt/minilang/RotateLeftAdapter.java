package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.RotateLeft;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class RotateLeftAdapter extends EObjectAdapter<RotateLeft> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.RotateLeft {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public RotateLeftAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  @Override
  public void executeK3() {
    fr.inria.diverse.minilang.melange.minilanglanguage.aspects.RotateLeftAspect.executeK3(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getRotateLeft();
  }
}
