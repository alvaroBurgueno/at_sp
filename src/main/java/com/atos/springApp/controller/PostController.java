package com.atos.springApp.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

	private static final Log LOGGER = LogFactory.getLog(PostController.class);
	
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
		//int i = 6/0;
		return FORM_VIEW;
	}

	@PostMapping("/addperson")
	public ModelAndView addPerson(@Valid @ModelAttribute("person") Person person, BindingResult bindingResult) {
		LOGGER.info("METHOD: 'addPerson'-- PARAMS: '"+person.getName()+"' de edad '"+person.getAge()+"'.");
		//LOGGER.warn("WARNING TRACE");
		//LOGGER.error("ERROR TRACE");
		//LOGGER.debug("DEBUG TRACE");
		ModelAndView mav = new ModelAndView();
		if (bindingResult.hasErrors() ) {
			mav.setViewName(FORM_VIEW);
		} else {
			mav.setViewName(RESULT_VIEW);
			mav.addObject("person", person);
			LOGGER.info("TEMPLATE: '"+ RESULT_VIEW + "' -- DATA: '"+ person +"'" );
		}
		
		return mav;
	}

}
