package com.mvcexample.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/path")
public class PathVariableController {

	@RequestMapping("/hello/{name}")
	public String sayHelloName(@PathVariable("name") String name,Model model) {
		
		model.addAttribute("helloMsg","Hello"+name);
		return "hello";
	}
}
