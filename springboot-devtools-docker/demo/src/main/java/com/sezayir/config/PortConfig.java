package com.sezayir.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class PortConfig implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
   
	//You can change also in application.properties
	@Override
	public void customize(ConfigurableWebServerFactory factory) {
		factory.setPort(8090);

	}

}