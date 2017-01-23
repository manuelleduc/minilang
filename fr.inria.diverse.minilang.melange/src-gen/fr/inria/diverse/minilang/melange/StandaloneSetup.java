package fr.inria.diverse.minilang.melange;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	fr.inria.diverse.minilang.melange.minilanglanguage.minilang.MinilangPackage.eNS_URI,
    	fr.inria.diverse.minilang.melange.minilanglanguage.minilang.MinilangPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor minilangLanguage = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"fr.inria.diverse.minilang.melange.MinilangLanguage", "", "http://fr.inria.diverse.minilang.melange.minilanglanguage/minilang/", "fr.inria.diverse.minilang.melange.MinilangLanguageMT"
    );
    minilangLanguage.addAdapter("fr.inria.diverse.minilang.melange.MinilangLanguageMT", fr.inria.diverse.minilang.melange.minilanglanguage.adapters.minilanglanguagemt.MinilangLanguageAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"fr.inria.diverse.minilang.melange.MinilangLanguage",
    	minilangLanguage
    );
    MelangeRegistry.ModelTypeDescriptor minilangLanguageMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"fr.inria.diverse.minilang.melange.MinilangLanguageMT", "", "http://fr.inria.diverse.minilang.melange.minilanglanguagemt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"fr.inria.diverse.minilang.melange.MinilangLanguageMT",
    	minilangLanguageMT
    );
  }
}
