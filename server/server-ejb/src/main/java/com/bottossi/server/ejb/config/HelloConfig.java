package com.bottossi.server.ejb.config;

import br.gov.frameworkdemoiselle.configuration.Configuration;

@Configuration(resource = "hello")
public class HelloConfig {

	private String versao;
	
	public String getVersao() {
		return versao;
	}
	
}
