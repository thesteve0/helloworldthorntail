package io.steve.helloworld;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.thorntail.Thorntail;

@ApplicationPath("/")
public class HelloWorldApplication extends Application {
    public static void main(String... args) throws Exception {
        Thorntail.run();
    }
}
