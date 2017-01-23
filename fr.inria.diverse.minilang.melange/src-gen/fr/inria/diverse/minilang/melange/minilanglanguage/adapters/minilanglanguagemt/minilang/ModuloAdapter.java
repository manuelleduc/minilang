package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Modulo;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Value;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ModuloAdapter extends EObjectAdapter<Modulo> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Modulo {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public ModuloAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Value getRight() {
    return (Value) adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final Value o) {
    if (o != null)
    	adaptee.setRight(((fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ValueAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public Value getLeft() {
    return (Value) adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final Value o) {
    if (o != null)
    	adaptee.setLeft(((fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ValueAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public double valueK3() {
    return fr.inria.diverse.minilang.melange.minilanglanguage.aspects.ModuloAspect.valueK3(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getModulo();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.MODULO__RIGHT:
    		return getRight();
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.MODULO__LEFT:
    		return getLeft();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.MODULO__RIGHT:
    		return getRight() != null;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.MODULO__LEFT:
    		return getLeft() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.MODULO__RIGHT:
    		setRight(
    		(fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Value)
    		 newValue);
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.MODULO__LEFT:
    		setLeft(
    		(fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Value)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
