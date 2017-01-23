package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Constant;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ConstantAdapter extends EObjectAdapter<Constant> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Constant {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public ConstantAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  @Override
  public double getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final double o) {
    adaptee.setValue(o);
  }
  
  @Override
  public double valueK3() {
    return fr.inria.diverse.minilang.melange.minilanglanguage.aspects.ConstantAspect.valueK3(adaptee);
  }
  
  protected final static double VALUE_EDEFAULT = 0.0;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getConstant();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.CONSTANT__VALUE:
    		return new java.lang.Double(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.CONSTANT__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.CONSTANT__VALUE:
    		setValue(((java.lang.Double) newValue).doubleValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
