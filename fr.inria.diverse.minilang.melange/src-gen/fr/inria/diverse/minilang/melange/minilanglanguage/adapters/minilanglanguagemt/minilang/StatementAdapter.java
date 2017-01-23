package fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory;
import fr.inria.diverse.minilang.melange.minilanglanguage.minilang.Statement;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class StatementAdapter extends EObjectAdapter<Statement> implements fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.Statement {
  private MinilangLanguageMTAdaptersFactory adaptersFactory;
  
  public StatementAdapter() {
    super(fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageMTAdaptersFactory.getInstance();
  }
  
  @Override
  public void executeK3() {
    fr.inria.diverse.minilang.melange.minilanglanguage.aspects.StatementAspect.executeK3(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangPackage.eINSTANCE.getStatement();
  }
}
