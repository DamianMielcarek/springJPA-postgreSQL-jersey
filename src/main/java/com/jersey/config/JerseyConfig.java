package com.jersey.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.jersey.endpoint.TopicJerseyRestService;
import com.jersey.service.UserRestService;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(UserRestService.class);
        register(TopicJerseyRestService.class);
    }

}
