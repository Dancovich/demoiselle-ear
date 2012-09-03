package com.bottossi.server.web.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;

import com.bottossi.server.web.business.HelloWorldBC;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	Logger logger;
	
//	@Inject
//	HelloFacade helloFacade;

	@Inject
	HelloWorldBC helloWorldBC;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		logger.info("Iniciando processamento da requisição");
		
//		String mensagem = helloFacade.hello();
		String mensagem = "Hello World"; 
		String color = helloWorldBC.getColor();
					
		response.getWriter().write(
				"<h1 style='color: " + color + "'>" + mensagem + "</h1>");
		
		logger.info("Cor obtida: " + color);
		logger.info("Finalizando processamento da requisição");
	}

}
