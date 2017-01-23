package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.RotateRight;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class RotateRightAdapter extends EObjectAdapter<RotateRight> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.RotateRight {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public RotateRightAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  @Override
  public void executeK3() {
    fr.inria.diverse.minilang.melange.minilanglanguage.aspects.RotateRightAspect.executeK3(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getRotateRight();
  }
}
