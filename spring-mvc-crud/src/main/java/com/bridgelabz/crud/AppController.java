package com.bridgelabz.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> products = productService.listAll();
		model.addAttribute("products", products);
		return "index";
	}

	@RequestMapping("/new")
	public String showNewProductFrom(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "new_product";
	}
}
