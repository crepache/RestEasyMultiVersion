package com.api.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/testev1")
public class UserManagementModule {
	
	@GET
	public Response getAllUsers() {
		String result = "Hello World v1";
		return Response.status(200).entity(result).build();
	}
}
