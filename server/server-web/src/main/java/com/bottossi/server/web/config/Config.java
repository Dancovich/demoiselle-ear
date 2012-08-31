package com.bottossi.server.web.config;

import br.gov.frameworkdemoiselle.configuration.ConfigType;
import br.gov.frameworkdemoiselle.configuration.Configuration;

@Configuration(resource = "config", type=ConfigType.PROPERTIES)
public class Config {

	private String color;
	
	public String getColor() {
		return color;
	}
	
}
