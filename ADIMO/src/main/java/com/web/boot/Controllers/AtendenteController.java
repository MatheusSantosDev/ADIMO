package com.web.boot.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.boot.Model.FichaCliente;
import com.web.boot.Model.Imovel;
import com.web.boot.Model.Locacao;
import com.web.boot.repositories.FichaClienteRepository;
import com.web.boot.repositories.ImovelRepository;
import com.web.boot.repositories.LocacaoRepository;

@Controller
@RequestMapping("/dashAtendente")
public class AtendenteController {

	@Autowired
	private ImovelRepository imovelRepository;

	@Autowired
	private LocacaoRepository locacaoRepository;

	@Autowired
	private FichaClienteRepository fichaRepository;

	@GetMapping
	public String listarDash(Model model) {

		return "/atendente/dashboard/dashboard";
	}

	@GetMapping("/criarFicha")
	public ModelAndView formularioFicha() {

		ModelAndView mv = new ModelAndView("");

		FichaCliente ficha = new FichaCliente();
		mv.addObject(ficha);
		
		return mv;
	}

	@PostMapping("/criarFicha")
	public ModelAndView criarFicha(FichaCliente ficha) {

		ModelAndView mv = new ModelAndView("redirect:/dashAtendente");

		fichaRepository.save(ficha);
		
		return mv;
	}
	
	@GetMapping("/locacao")
	public ModelAndView formularioLocacao() {
		
		ModelAndView mv = new ModelAndView("");

		Locacao locacao = new Locacao();
		
		List<Imovel> imoveis = imovelRepository.findAll();
		List<FichaCliente> fichas = fichaRepository.findAll();
		
		mv.addObject(fichas);
		mv.addObject(imoveis);
		mv.addObject(locacao);
		
		return mv;
	}

	@PostMapping("/locacao")
	public ModelAndView registraLocacao(Locacao locacao) {
		
		ModelAndView mv = new ModelAndView("redirect:/dashAtendente");

		locacaoRepository.save(locacao);
		
		return mv;
	}
}
