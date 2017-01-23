package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Block;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Statement;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BlockAdapter extends EObjectAdapter<Block> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Block {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public BlockAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  private EList<Statement> statements_;
  
  @Override
  public EList<Statement> getStatements() {
    if (statements_ == null)
    	statements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getStatements(), adaptersFactory, eResource);
    return statements_;
  }
  
  @Override
  public void executeK3() {
    fr.inria.diverse.minilang.melange.minilanglanguage.aspects.BlockAspect.executeK3(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.BLOCK__STATEMENTS:
    		return getStatements();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.BLOCK__STATEMENTS:
    		return getStatements() != null && !getStatements().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.BLOCK__STATEMENTS:
    		getStatements().clear();
    		getStatements().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
