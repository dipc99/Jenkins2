package com.BikkadIT.SendingDataUItoController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	public WelcomeController() {
		System.out.println("Class Constructor");
	}

	@GetMapping("/welcomeMsg")
	public String welcomeMsg(@RequestParam String name,Model model) {
		
		String msg="Hi " +name+ " Welcome to BikkadIT.";
		System.out.println(msg);
		
		model.addAttribute("MSG", msg);
		return "welcome";
		
	}

}
