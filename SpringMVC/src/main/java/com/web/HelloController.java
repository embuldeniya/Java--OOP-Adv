package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	@RequestMapping("hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView ("hello");
		return mv;
	}
	
	
	@RequestMapping("hi")
	public ModelAndView hi() {
		ModelAndView mv = new ModelAndView ("hi");
		return mv;
	}
	
	
	@RequestMapping("greet")
	public ModelAndView greet() {
		ModelAndView mv = new ModelAndView ("greet");
		mv.addObject("message","Good Morning!! Welcome to Spring MVC world ");
		return mv;
	}
	

}
