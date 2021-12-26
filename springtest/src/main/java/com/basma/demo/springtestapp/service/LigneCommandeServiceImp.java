package main.java.com.basma.demo.springtestapp.service;
import java.util.List;

public final class LigneCommandeServiceImpl implements LigneCommandesService{
	@Autowired
	 private LigneCommandeRepository  LigneCommandeRepository;  
	@override
	List<LigneCommande> getAllLigneCommandes(){return LigneCommandeRepository.findAll();
}
