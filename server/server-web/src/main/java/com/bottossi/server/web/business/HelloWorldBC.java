package com.bottossi.server.web.business;

import javax.inject.Inject;

import com.bottossi.server.web.config.Config;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;

@BusinessController
public class HelloWorldBC {

	@Inject
	Config config;
	
	public String getColor() {
		return config.getColor();
	}
	
}
