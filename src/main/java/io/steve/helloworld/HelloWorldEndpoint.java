package io.steve.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HelloWorldEndpoint {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String saySomething(){
        return "Hummingbirds R0X0R";
    }
}
