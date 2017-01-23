package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Variable;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class VariableAdapter extends EObjectAdapter<Variable> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public VariableAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public double getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final double o) {
    adaptee.setValue(o);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static double VALUE_EDEFAULT = 0.0;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE__NAME:
    		return getName();
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE__VALUE:
    		return new java.lang.Double(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE__VALUE:
    		setValue(((java.lang.Double) newValue).doubleValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
