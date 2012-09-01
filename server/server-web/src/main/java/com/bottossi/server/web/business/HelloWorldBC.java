package com.bottossi.server.web.business;

import javax.inject.Inject;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;

import com.bottossi.server.web.config.Config;

@BusinessController
public class HelloWorldBC {

	@Inject
	Config config;
	
	public String getColor() {
		return config.getColor();
	}
	
}
