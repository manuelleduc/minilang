/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import fr.inria.diverse.minilang.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XtextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XtextActivator.getInstance().getInjector(XtextActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL);
	}
	
}
