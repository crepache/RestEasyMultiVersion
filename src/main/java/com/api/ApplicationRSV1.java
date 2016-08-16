package com.api;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;

public class ApplicationRSV1 extends Application {

	private Set<Class<?>> classes;

	public ApplicationRSV1(@Context ServletContext servletContext) {
		this.classes = new HashSet<Class<?>>();
		this.classes.add(com.api.v1.UserManagementModule.class);
//		this.classes.add(com.wordnik.swagger.jaxrs.listing.ApiListingResource.class);
//		this.classes.add(com.wordnik.swagger.jaxrs.listing.ApiDeclarationProvider.class);
//		this.classes.add(com.wordnik.swagger.jaxrs.listing.ApiListingResourceJSON.class);
//		this.classes.add(com.wordnik.swagger.jaxrs.listing.ResourceListingProvider.class);
		
		
	}

	@Override
	public Set<Class<?>> getClasses() {
		return this.classes;
	}

}
