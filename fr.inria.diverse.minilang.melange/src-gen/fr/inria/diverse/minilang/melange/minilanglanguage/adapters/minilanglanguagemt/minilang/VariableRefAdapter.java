package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.VariableRef;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class VariableRefAdapter extends EObjectAdapter<VariableRef> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.VariableRef {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public VariableRefAdapter() {
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
  public double valueK3() {
    return fr.inria.diverse.minilang.melange.minilanglanguage.aspects.VariableRefAspect.valueK3(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getVariableRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE_REF__VARIABLE:
    		return getVariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE_REF__VARIABLE:
    		return getVariable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.VARIABLE_REF__VARIABLE:
    		setVariable(
    		(fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Variable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
