package com.hawkeye.api.server.examples.hello.service.controllers;

import com.hawkeye.api.server.examples.hello.service.models.HelloResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloController {

    @GET
    @Path("/{name}")
    public Response sayHelloByName(@PathParam("name") String name) {
        var response = new HelloResponse();
        response.setName(name);

        return Response.ok().entity(response).build();
    }
}
