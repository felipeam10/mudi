package br.com.felipe.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.felipe.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Echo Dot ");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/61a%2BK6x-RML._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/dp/B084DWCZY6?pf_rd_r=MYJHMSEKPAZQDCAA9R9G&pf_rd_p=420e9734-142f-449a-98e4-ffa0e3ec33ff");
		pedido.setDescricao("exemplo qquer de descricao");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
