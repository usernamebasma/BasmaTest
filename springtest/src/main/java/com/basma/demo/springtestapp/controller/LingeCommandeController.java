package main.java.com.basma.demo.springtestapp.controller;

import  main.java.com.basma.demo.springtestapp.service.Autowired;
import  main.java.com.basma.demo.springtestapp.service.LigneCommandeRepository;

import org.springframework.sterotype.Controller;
public class LigneCommandeController {
	@Autowired
	 private  LigneCommandeService   lignecommandeService;  
	
	//display list of lignecommande 
	@GetMapping("/")
	
	public String ViewHomePage(Model model){
		model.addAttribute("listCommandes";lignecommandeservice.getAll	LigneCommande());
		return "index";
		
	}
}
