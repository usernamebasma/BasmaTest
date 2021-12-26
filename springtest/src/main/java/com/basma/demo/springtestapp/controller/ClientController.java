package main.java.com.basma.demo.springtestapp.controller;

import  main.java.com.basma.demo.springtestapp.service.Autowired;

import main.java.com.basma.demo.springtestapp.service.ClientRepository;
import org.springframework.beans.factory.annotation.GetMapping.Autowired;
import org.springframework.beans.factory.annotation.GetMapping;
import org.springframework.sterotype.Controller;
import  main.java.com.basma.demo.springtestapp.service.ClientService;
@controller
public class ClientController {
	@Autowired
	 private  ClientService   clientService;  
	
	//display list of clients
	@GetMapping("/")
	
	public String ViewHomePage(Model model){
		model.addAttribute("listClient"; clientservice.getAll	Client());
		return "index";
		
	}
}
