package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@RequestMapping("/hi")
	public String sayHi(Model model) {
		model.addAttribute("name" , "Dinesh");
		return "Hi";
	}
	
	@RequestMapping("/bye")
	@ResponseBody
	public String sayBye() {
		return "Bye!!!";
	}

}
