package com.api;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;

public class ApplicationRSV2 extends Application {

	private Set<Class<?>> classes;

	public ApplicationRSV2(@Context ServletContext servletContext) {
		this.classes = new HashSet<Class<?>>();
//		this.classes.add(com.api.v2.UserManagementModule.class);
	}

	@Override
	public Set<Class<?>> getClasses() {
		return this.classes;
	}

}
