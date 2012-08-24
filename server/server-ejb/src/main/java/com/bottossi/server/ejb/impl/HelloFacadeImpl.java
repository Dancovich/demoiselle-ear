package com.bottossi.server.ejb.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

import org.slf4j.Logger;

import com.bottossi.server.ejb.HelloFacade;
import com.bottossi.server.ejb.config.HelloConfig;

@Stateless
@Local(value = HelloFacade.class)
public class HelloFacadeImpl implements HelloFacade {

	@Inject
	Logger logger;
	
	@Inject
	HelloConfig helloConfig;
	
	@Override
	public String hello() {
		String msg = "Hello World - versão " + helloConfig.getVersao();
		logger.debug("Mensagem do EJB: " + msg);
		return msg;
	}

	
	
}
