package com.mvcexample.myapp;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvcexample.myapp.model.Student;

@Controller
@RequestMapping("/form")
public class UserFormController {

	@RequestMapping(value="/display", method =RequestMethod.GET)
	public String displayForm(Model model) {
		
		return "userform";
	}
	
	@RequestMapping(value="/submitFormNotUse", method =RequestMethod.POST)
	//....@RequestParam Map<String,String> paramList //we can do like this also
	//public String submitForm(@RequestParam("studentName") String name, @RequestParam("studentAddress") String address,Model model) {
	public String submitForm(@RequestParam Map<String,String> paramList,Model model) {
		String name = paramList.get("studentName");
		String address=paramList.get("studentAddress");
		model.addAttribute("submitMsg","You submitted:name:"+ name+":Address:" + address);
		return "submitform";
	}
	
	@RequestMapping(value="/submitForm", method =RequestMethod.POST)
	//....@RequestParam Map<String,String> paramList //we can do like this also
	public String submitForm(@ModelAttribute("student1") Student student,Model model,BindingResult result) {
		
		if(result.hasErrors()) {

			return "userform";
		}
		model.addAttribute("submitMsg","You submitted:name:"+ student.getStudentName()+":Address:" + student.getStudentAddress());
		
		return "submitform";
	}
}
