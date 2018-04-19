package com.jersey.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.jersey.endpoint.TopicJerseyRestService;
import com.jersey.service.UserRestService;

@Component
@ApplicationPath("/api")
@Configuration
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig() {
    register(UserRestService.class);
    register(TopicJerseyRestService.class);
  }
}
