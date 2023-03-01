package com.BikkadIT.SendingDataUItoController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdditionController {
	@GetMapping("/printValue/{a}/adiitionController")
	public String printValue(@PathVariable int a,Model model) {
		String msg="Value of a: "+ a;
		System.out.println("a= "+a);
		model.addAttribute("PRINT", msg);
		return "print";
		
	}
	
}
