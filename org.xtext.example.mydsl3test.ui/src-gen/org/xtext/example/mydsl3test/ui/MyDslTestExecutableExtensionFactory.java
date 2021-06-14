/*
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.example.mydsl3test.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.mydsl3test.ui.internal.Mydsl3testActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslTestExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Mydsl3testActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Mydsl3testActivator activator = Mydsl3testActivator.getInstance();
		return activator != null ? activator.getInjector(Mydsl3testActivator.ORG_XTEXT_EXAMPLE_MYDSL3TEST_MYDSLTEST) : null;
	}

}
