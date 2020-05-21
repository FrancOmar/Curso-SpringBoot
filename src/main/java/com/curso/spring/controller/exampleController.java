package com.curso.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.curso.spring.model.Person;

@Controller
@RequestMapping("/example")
public class exampleController {
	
	public static final String EXAMPLE_VIEW = "example";
	
	//Primer metodo
	//@RequestMapping(value="/exampleString", method = RequestMethod.GET)
	@GetMapping("/exampleString")
	public String example(Model model) {
		model.addAttribute("people", getpeople());
		return EXAMPLE_VIEW;
	}
	//segundo metodo
	//@RequestMapping(value="/exampleMAV", method = RequestMethod.GET)
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mv = new ModelAndView(EXAMPLE_VIEW);
		mv.addObject("people", getpeople());
		return mv;
	}
	
	private List<Person> getpeople(){
		List<Person> people = new ArrayList<>();
		people.add(new Person ("Oscar",15));
		people.add(new Person ("Juan",20));
		people.add(new Person ("Oscar",25));
		people.add(new Person ("Alan",30));
		people.add(new Person ("Rosa",35));
		people.add(new Person ("Ana",40));
		return people;
	}
}
