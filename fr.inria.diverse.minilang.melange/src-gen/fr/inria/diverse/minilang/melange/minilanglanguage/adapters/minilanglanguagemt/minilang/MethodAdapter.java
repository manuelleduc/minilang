package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Method;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Block;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class MethodAdapter extends EObjectAdapter<Method> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Method {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public MethodAdapter() {
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
  public Program getProgram() {
    return (Program) adaptersFactory.createAdapter(adaptee.getProgram(), eResource);
  }
  
  @Override
  public void setProgram(final Program o) {
    if (o != null)
    	adaptee.setProgram(((fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ProgramAdapter) o).getAdaptee());
    else adaptee.setProgram(null);
  }
  
  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.BlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public void executeK3() {
    fr.inria.diverse.minilang.melange.minilanglanguage.aspects.MethodAspect.executeK3(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getMethod();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.METHOD__PROGRAM:
    		return getProgram();
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.METHOD__NAME:
    		return getName();
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.METHOD__BLOCK:
    		return getBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.METHOD__PROGRAM:
    		return getProgram() != null;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.METHOD__NAME:
    		return getName() != NAME_EDEFAULT;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.METHOD__BLOCK:
    		return getBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.METHOD__PROGRAM:
    		setProgram(
    		(fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Program)
    		 newValue);
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.METHOD__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.METHOD__BLOCK:
    		setBlock(
    		(fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
