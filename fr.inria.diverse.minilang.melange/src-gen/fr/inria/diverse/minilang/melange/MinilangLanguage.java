package fr.inria.diverse.minilang.melange;

import fr.inria.diverse.melange.lib.IMetamodel;
import fr.inria.diverse.minilang.melange.MinilangLanguageMT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class MinilangLanguage implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static MinilangLanguage load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    MinilangLanguage mm = new MinilangLanguage();
    mm.setResource(res);
    return mm ;
  }
  
  public MinilangLanguageMT toMinilangLanguageMT() {
    fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageAdapter adaptee = new fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
