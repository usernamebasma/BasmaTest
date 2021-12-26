package main.java.com.basma.demo.springtestapp.service;
import java.util.List;

public final class ProduitServiceImpl implements ProduitsService{
	@Autowired
	 private ProduitRepository  ProduitRepository;  
	@override
	List<Produit> getAllProduits(){return ProduitRepository.findAll();
}
