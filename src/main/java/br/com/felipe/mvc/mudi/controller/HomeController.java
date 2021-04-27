package br.com.felipe.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.felipe.mvc.mudi.model.Pedido;
import br.com.felipe.mvc.mudi.repository.PedidoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		List<Pedido> pedidos = pedidoRepository.findAll();
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
	/*// Dessa forma, os parâmetros do método ficam reservados para os dados da requisição (o input) e o retorno do método fica reservado para os dados da view (o output).
	@GetMapping("/home")
	public ModelAndView home() {
	    List<Pedido> pedidos = pedidoRepository.findAll();
	    ModelAndView mv = new ModelAndView("home");
	    mv.addObject("pedidos", pedidos);
	    return mv; 
	}
	*/  
}
