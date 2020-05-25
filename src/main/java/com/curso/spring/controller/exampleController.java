package com.curso.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.curso.spring.componet.ExampleComponent;
import com.curso.spring.service.ExampleService;

@Controller
@RequestMapping("/example")
public class exampleController {
	
	public static final String EXAMPLE_VIEW = "example";
	
	@Autowired
	@Qualifier("/exampleService")
	private ExampleService exampleService;
	
	@Autowired
	@Qualifier("/exampleComponent")
	private ExampleComponent exampleComponent;
	
	//Primer metodo
	//@RequestMapping(value="/exampleString", method = RequestMethod.GET)
	@GetMapping("/exampleString")
	public String example(Model model) {
		exampleComponent.sayHello();
		model.addAttribute("people", exampleService.getListPeople());
		return EXAMPLE_VIEW;
	}
	//segundo metodo
	//@RequestMapping(value="/exampleMAV", method = RequestMethod.GET)
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mv = new ModelAndView(EXAMPLE_VIEW);
		mv.addObject("people", exampleService.getListPeople());
		return mv;
	}
	
	
}
