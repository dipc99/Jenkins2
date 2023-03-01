package com.BikkadIT.SendingDataUItoController.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoggingController {

	private static Logger logger=LoggerFactory.getLogger(LoggingController.class);
	
	
	@GetMapping("/web")
	public String LoggingWeb(){
	
		logger.info("logging level info");
		logger.error("logging level error");
		
		return "successfully run";
		
	}
	
	
}
