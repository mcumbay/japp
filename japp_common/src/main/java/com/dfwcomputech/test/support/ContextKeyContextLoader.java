package com.dfwcomputech.test.support;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;
import org.springframework.test.context.ContextLoader;


public class ContextKeyContextLoader implements ContextLoader{
	@Override
	public ApplicationContext loadContext(String... locations) throws Exception {
		if (locations.length != 1) {
			throw new IllegalArgumentException("Locations must be of size 1 for this type of context loader");
		}
		String contextKey = locations[0];
		BeanFactoryLocator bfl = ContextSingletonBeanFactoryLocator.getInstance();
		BeanFactoryReference bfr = bfl.useBeanFactory(contextKey);
		BeanFactory beanFactory = bfr.getFactory();
		if (!(beanFactory instanceof ConfigurableApplicationContext)) {
			throw new IllegalStateException("Referenced bean factory must be of type ConfigurableApplicationContext");
		}
		return (ConfigurableApplicationContext)beanFactory;
	}
	
	@Override
	public String[] processLocations(Class<?> clazz, String... locations) {
		return locations;
	}

}
