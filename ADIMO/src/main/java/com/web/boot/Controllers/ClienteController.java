package com.web.boot.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.boot.Model.Imovel;
import com.web.boot.Model.Interesses;
import com.web.boot.repositories.ImovelRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	Interesses interesse = new Interesses();

	@Autowired
	private ImovelRepository imovelRepository;

	@GetMapping("/imoveis")
	public ModelAndView listarImoveis() {

		ModelAndView mv = new ModelAndView("Cliente/ListaImoveis");

		List<Imovel> imoveis = imovelRepository.findAll();
		mv.addObject("imoveis", imoveis);

		return mv;
	}

	@PostMapping("/imoveis/interesses")
	public ModelAndView postImoveis(Interesses interesse) {

		this.interesse.setEmail(interesse.getEmail());
		this.interesse.setImoveis(interesse.getImoveis());
		
		return new ModelAndView("redirect:/cliente/imoveis/interesses/listar");
	}

	@GetMapping("/imoveis/interesses")
	public ModelAndView interesses() {
		ModelAndView mv = new ModelAndView("Cliente/interesses");

		List<Imovel> imoveis = imovelRepository.findAll();
		mv.addObject("imoveis", imoveis);
		mv.addObject("interesses", this.interesse);
		
		return mv;

	}
	
	@GetMapping("/imoveis/interesses/listar")
	public ModelAndView listarInteresses() {
		ModelAndView mv = new ModelAndView("Cliente/listarInteresses");

		mv.addObject("interesses", this.interesse);

		return mv;

	}
	
}
