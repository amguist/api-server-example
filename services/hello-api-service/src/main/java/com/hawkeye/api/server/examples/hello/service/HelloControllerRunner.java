package com.hawkeye.api.server.examples.hello.service;

public class HelloControllerRunner {
    public static void main(final String[] args) throws Exception {
        final var config = "api-config.yml";
        var service = new HelloApiServer(config);
        service.run(args);
    }
}
