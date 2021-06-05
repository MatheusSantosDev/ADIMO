package com.web.boot.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	
	
	@GetMapping("/")
	public ModelAndView home() {		
		
		ModelAndView mv = new ModelAndView("home");
		
		
		return mv;
	}
	
	@GetMapping("/entrar")
    public String entrar() {
        return "entrar";
    }
	
	@GetMapping("/acessoNegado")
    public String negar() {
        return "acessoNegado";
    }
	
}
