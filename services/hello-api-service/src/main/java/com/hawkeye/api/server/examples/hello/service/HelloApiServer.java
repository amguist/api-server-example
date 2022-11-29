package com.hawkeye.api.server.examples.hello.service;

import com.hawkeye.api.server.examples.hello.service.controllers.HelloController;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.util.Resources;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HelloApiServer extends Application<Configuration> {
    private final String        config;

    public HelloApiServer(String config) {
        this.config = config;
    }

    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        final var jersey = environment.jersey();
        jersey.register(createHelloController());
    }

    public String getConfig() throws IOException {
        return Resources.toString(Resources.getResource(this.config), StandardCharsets.UTF_8);
    }

    private HelloController createHelloController() {
        return new HelloController();
    }
    

}
