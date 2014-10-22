package com.mvcexample.myapp;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/path")
public class PathVariableController {

	/*
	 * @RequestMapping("/hello/{name}") public String
	 * sayHelloName(@PathVariable("name") String name,Model model) {
	 * 
	 * model.addAttribute("helloMsg","Hello"+name); return "hello"; }
	 * 
	 * @RequestMapping("/hello/{name}/{address}") public String
	 * sayHelloNameAndAddress(@PathVariable("name") String
	 * name,@PathVariable("address") String address,Model model) {
	 * 
	 * model.addAttribute("helloMsg","Hello:"+name+":Welcome from:"+address);
	 * return "hello"; }
	 */

	@RequestMapping("/hello/{name}/{address}/{phoneno}")
	public String sayHelloAll(@PathVariable Map<String, String> pathVal,
			Model model) {
		String name = pathVal.get("name");
		String address = pathVal.get("address");
		String phnumber = pathVal.get("phoneno");
		model.addAttribute("helloMsg", "Hello:" + name + ":Welcome from:"
				+ address + ": I will call you at " + phnumber);
		return "hello";
	}
}
