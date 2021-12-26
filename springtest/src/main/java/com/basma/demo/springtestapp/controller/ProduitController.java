package main.java.com.basma.demo.springtestapp.controller;

import  main.java.com.basma.demo.springtestapp.service.Autowired;
import main.java.com.basma.demo.springtestapp.service.ProduitRepository;

import org.springframework.sterotype.Controller;
public class ProduitController {
	@Autowired
	 private ProduitService   clientService;  
	
	//display list of produits
	@GetMapping("/")
	
	public String ViewHomePage(Model model){
		model.addAttribute("listProduits";produitservice.getAllProduit());
		return "index";
		
	}
}
