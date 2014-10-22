package com.mvcexample.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class UserFormController {

	@RequestMapping(value="/display", method =RequestMethod.GET)
	public String displayForm(Model model) {
		
		return "userform";
	}
	
	@RequestMapping(value="/submitForm", method =RequestMethod.POST)
	public String submitForm(@RequestParam("studentName") String name, @RequestParam("studentAddress") String address,Model model) {
		
		model.addAttribute("submitMsg","You submitted:name:"+ name+":Address:" + address);
		return "submitform";
	}
}
