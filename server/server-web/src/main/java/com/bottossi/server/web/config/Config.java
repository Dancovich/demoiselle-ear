package com.bottossi.server.web.config;

import br.gov.frameworkdemoiselle.configuration.Configuration;

@Configuration(resource = "config")
public class Config {

	private String color;
	
	public String getColor() {
		return color;
	}
	
}
