package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.VariableAffect;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Value;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class VariableAffectAdapter extends EObjectAdapter<VariableAffect> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableAffect {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public VariableAffectAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Variable getVariable() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getVariable(), eResource);
  }
  
  @Override
  public void setVariable(final Variable o) {
    if (o != null)
    	adaptee.setVariable(((fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.VariableAdapter) o).getAdaptee());
    else adaptee.setVariable(null);
  }
  
  @Override
  public Value getValue() {
    return (Value) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final Value o) {
    if (o != null)
    	adaptee.setValue(((fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ValueAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public void executeK3() {
    fr.inria.diverse.minilang.melange.minilanglanguage.aspects.VariableAffectAspect.executeK3(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getVariableAffect();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE_AFFECT__VARIABLE:
    		return getVariable();
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE_AFFECT__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE_AFFECT__VARIABLE:
    		return getVariable() != null;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE_AFFECT__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE_AFFECT__VARIABLE:
    		setVariable(
    		(fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable)
    		 newValue);
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE_AFFECT__VALUE:
    		setValue(
    		(fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Value)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
