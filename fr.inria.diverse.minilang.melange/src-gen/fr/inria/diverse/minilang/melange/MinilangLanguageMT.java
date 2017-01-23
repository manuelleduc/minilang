package fr.inria.diverse.minilang.melange;

import fr.inria.diverse.melange.lib.IModelType;
import fr.inria.diverse.minilang.melange.minilanglanguagemt.minilang.MinilangFactory;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface MinilangLanguageMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract MinilangFactory getMinilangFactory();
  
  public abstract void save(final String uri) throws IOException;
}
