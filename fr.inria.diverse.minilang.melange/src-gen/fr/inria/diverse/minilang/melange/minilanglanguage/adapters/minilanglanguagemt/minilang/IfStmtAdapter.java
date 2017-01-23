package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.IfStmt;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Block;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Condition;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IfStmtAdapter extends EObjectAdapter<IfStmt> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.IfStmt {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public IfStmtAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Block getThenBranch() {
    return (Block) adaptersFactory.createAdapter(adaptee.getThenBranch(), eResource);
  }
  
  @Override
  public void setThenBranch(final Block o) {
    if (o != null)
    	adaptee.setThenBranch(((fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.BlockAdapter) o).getAdaptee());
    else adaptee.setThenBranch(null);
  }
  
  @Override
  public Block getElseBranch() {
    return (Block) adaptersFactory.createAdapter(adaptee.getElseBranch(), eResource);
  }
  
  @Override
  public void setElseBranch(final Block o) {
    if (o != null)
    	adaptee.setElseBranch(((fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.BlockAdapter) o).getAdaptee());
    else adaptee.setElseBranch(null);
  }
  
  @Override
  public Condition getCondition() {
    return (Condition) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final Condition o) {
    if (o != null)
    	adaptee.setCondition(((fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang.ConditionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
  }
  
  @Override
  public void executeK3() {
    fr.inria.diverse.minilang.melange.minilanglanguage.aspects.IfStmtAspect.executeK3(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getIfStmt();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.IF_STMT__THEN_BRANCH:
    		return getThenBranch();
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.IF_STMT__ELSE_BRANCH:
    		return getElseBranch();
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.IF_STMT__CONDITION:
    		return getCondition();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.IF_STMT__THEN_BRANCH:
    		return getThenBranch() != null;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.IF_STMT__ELSE_BRANCH:
    		return getElseBranch() != null;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.IF_STMT__CONDITION:
    		return getCondition() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.IF_STMT__THEN_BRANCH:
    		setThenBranch(
    		(fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Block)
    		 newValue);
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.IF_STMT__ELSE_BRANCH:
    		setElseBranch(
    		(fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Block)
    		 newValue);
    		return;
    	case fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.IF_STMT__CONDITION:
    		setCondition(
    		(fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Condition)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
