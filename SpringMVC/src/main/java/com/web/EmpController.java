package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.EmployeeDao;
import com.dto.Employee;

@Controller
public class EmpController {

	@Autowired
	private EmployeeDao empdao;
	
	@RequestMapping("getLoginForm")
	public ModelAndView getLoginForm() {
		ModelAndView mv = new ModelAndView ("Login");
		return mv;
	}
	
	
	

	@RequestMapping(value="LoginController", method=RequestMethod.POST )
	public ModelAndView LoginController(@RequestParam("loginId") String loginId,@RequestParam("password") String password ) {
		ModelAndView mv = null;
		
		if(loginId.equalsIgnoreCase("hr")&& password.equalsIgnoreCase("hr")) {
			 mv = new ModelAndView ("HrHomePage");
			 mv.addObject("loginId", loginId);
			return mv;			
		}else {
			mv = new ModelAndView ("Login");
			mv.addObject("message", "Login failed...");
		}
		return mv;
		
		
	}
	
	@RequestMapping("getRegisterForm")
	public ModelAndView getRegisterForm() {
		ModelAndView mv = new ModelAndView ("Register");
		return mv;
	}
	
	
	

	@RequestMapping(value="RegisterController", method=RequestMethod.POST )
	public ModelAndView RegisterController(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv = null;
		
		
		int x = empdao.register(employee);
		
		return mv;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}