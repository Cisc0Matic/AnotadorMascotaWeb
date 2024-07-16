package com.softwareventas.spring.app;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.classic.Logger;

@SpringBootApplication

public class AppApplication {

	private static Logger logger = (Logger) LoggerFactory.getLogger(AppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		
		logger.info("mi mensaje info");
		logger.debug("mi mensaje debug");
		logger.warn("mi mensaje warning");
		logger.error("mi mensaje error");
		
	}
	@GetMapping("/")

	@RequestMapping("/error")
	public String err(){
return "error";

	}
	@GetMapping("/error")
	@ResponseBody
	public String Msg1(){
return "Hola! bienvenido a mi primera pagina web";
	}
}
