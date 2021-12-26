package main.java.com.basma.demo.springtestapp.service;
import java.util.List;

public final class CommandeServiceImpl implements CommandesService{
	@Autowired
	 private CommandeRepository  commandeRepository;  
	@override
	List<Commande> getAllCommandes(){return CommandeRepository.findAll();
}
