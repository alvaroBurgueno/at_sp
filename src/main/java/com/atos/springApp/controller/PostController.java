package com.atos.springApp.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.atos.springApp.model.Person;

@Controller
@RequestMapping("/example3")
public class PostController {

	public static final String FORM_VIEW = "form";
	public static final String RESULT_VIEW = "result";
	
	// Redirecciona de /example3/ a /example3/showform
	@GetMapping("/")
	public RedirectView redirect(){
		return new RedirectView("/example3/showform");
	}

	@GetMapping("/showform")
	// para meter datos cuando se devuelve un string no un mav -> model
	// se van a meter datos desde un formulario
	public String showForm(Model model) {
		model.addAttribute("person", new Person());
		return FORM_VIEW;
	}

	@PostMapping("/addperson")
	public ModelAndView addPerson(@ModelAttribute("person") Person person) {
		ModelAndView mav = new ModelAndView(RESULT_VIEW);
		mav.addObject("person", person);
		return mav;
	}

}
