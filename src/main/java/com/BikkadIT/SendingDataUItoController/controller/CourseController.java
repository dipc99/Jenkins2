package com.BikkadIT.SendingDataUItoController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
	
	@GetMapping("/course")
	public ModelAndView getCourseConttroller(@RequestParam String cname, @RequestParam String tname) {
		
		String msg=cname+" New Batch From 1 January By "+tname;
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("COURSE", msg);
		mav.setViewName("course");
		
		return mav;
		
	}

}
