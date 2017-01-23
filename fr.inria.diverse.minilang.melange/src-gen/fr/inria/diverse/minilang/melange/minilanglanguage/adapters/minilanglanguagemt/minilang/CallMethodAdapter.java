package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.CallMethod;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class CallMethodAdapter extends EObjectAdapter<CallMethod> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.CallMethod {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public CallMethodAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Method getMethod() {
    return (Method) adaptersFactory.createAdapter(adaptee.getMethod(), eResource);
  }
  
  @Override
  public void setMethod(final Method o) {
    if (o != null)
    	adaptee.setMethod(((fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.MethodAdapter) o).getAdaptee());
    else adaptee.setMethod(null);
  }
  
  @Override
  public void executeK3() {
    fr.inria.diverse.minilang.melange.minilanglanguage.aspects.CallMethodAspect.executeK3(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getCallMethod();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.CALL_METHOD__METHOD:
    		return getMethod();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.CALL_METHOD__METHOD:
    		return getMethod() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.CALL_METHOD__METHOD:
    		setMethod(
    		(fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
