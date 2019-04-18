package com.atos.springApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.atos.springApp.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {
	public static final String EXAMPLE_VIEW = "example";
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("people", getPeople() );
		return mav;
	}
	
	private List<Person> getPeople(){
		List<Person> people = new ArrayList<>();
		people.add(new Person("John Snow", 35));
		people.add(new Person("Daenerys Targeryen", 19));
		people.add(new Person("Tyrion Lannister", 43));
		people.add(new Person("Ned Stark", 56));
		people.add(new Person("El Matagigantes", 18));
		return people;
	}
}

