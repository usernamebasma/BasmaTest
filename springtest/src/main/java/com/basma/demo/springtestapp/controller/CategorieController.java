package main.java.com.basma.demo.springtestapp.controller;

import  main.java.com.basma.demo.springtestapp.service.Autowired;
import main.java.com.basma.demo.springtestapp.service.CommandeRepository;

import org.springframework.sterotype.Controller;
public class CommandeController {
	@Autowired
	 private  CommandeService   commandeService;  
	
	//display list of clients
	@GetMapping("/")
	
	public String ViewHomePage(Model model){
		model.addAttribute("listClients";commandeservice.getAll	Commande());
		return "index";
		
	}
}
