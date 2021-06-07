package com.web.boot.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.boot.Model.Imovel;
import com.web.boot.repositories.ImovelRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ImovelRepository imovelRepository;

	@GetMapping
	public String listarDash(Model model) {

		return "/Cliente/Info";
	}
	
	@GetMapping("/imoveis")
	public ModelAndView listarImoveis() {
		
		ModelAndView mv = new ModelAndView("/Cliente/ListaImoveis");
		
		List<Imovel> imoveis = imovelRepository.findAll();
		mv.addObject("imoveis", imoveis);
		
		return mv;
	}

}
