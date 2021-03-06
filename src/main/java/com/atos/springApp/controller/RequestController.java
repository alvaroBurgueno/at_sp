package com.atos.springApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class RequestController {

	private static final String REQUEST_VIEW = "request2";
	
	//localhost:8080/example2/request2 + nm
	@GetMapping("request2/{nm}")
	public ModelAndView request2(@PathVariable("nm") String name) {
		ModelAndView mav = new ModelAndView(REQUEST_VIEW);
		mav.addObject("nm_in_model", name);
		return mav;
	}
	
	
}
