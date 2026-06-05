package com.app.config;

import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ServerConfig {
	  @Bean
	    @Profile("dev")
	    public ConfigurableServletWebServerFactory tomcatServer() {
	        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
	       
	        return factory;
	    }

	    @Bean
	    @Profile("prod")
	    public ConfigurableServletWebServerFactory jettyServer() {
	        JettyServletWebServerFactory factory = new JettyServletWebServerFactory();
	      
	        return factory;
	    }
}
