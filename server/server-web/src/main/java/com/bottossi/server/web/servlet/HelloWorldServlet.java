package com.bottossi.server.web.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;

import com.bottossi.server.ejb.HelloFacade;
import com.bottossi.server.web.config.Config;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

	@Inject
	Logger logger;
	
	@Inject
	HelloFacade helloFacade;

	@Inject
	Config config;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		logger.debug("Iniciando processamento da requisição");
		
		String mensagem = helloFacade.hello();
		String color = config.getColor();
					
		response.getWriter().write(
				"<h1 style='color: " + color + "'>" + mensagem + "</h1>");
		
		logger.debug("Cor obtida: " + color);
		logger.debug("Finalizando processamento da requisição");
	}

}
