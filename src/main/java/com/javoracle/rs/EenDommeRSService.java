package com.javoracle.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("rick")
public class EenDommeRSService {
	
	

	@Path("something")
	@GET
	public Response doSomething() {
		System.out.println("Hallo!");
		return Response.ok().build();
	}
}
