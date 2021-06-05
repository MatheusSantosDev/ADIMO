package com.web.boot.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/dashAtendente")
public class AtendenteController {
	
			
	@GetMapping
	public String listarDash(Model model) {		
		
		return "/atendente/dashboard/dashboard";
	}
		
	
}
