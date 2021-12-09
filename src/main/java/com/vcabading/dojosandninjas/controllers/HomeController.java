package com.vcabading.dojosandninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/////////////////////////////////////////////////////////////////
//HOME CONTROLLER
/////////////////////////////////////////////////////////////////

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "redirect:/dojos";
	}
}