package main.java.springbootfirsttest.test.service;
import java.util.List;

public final class CategorieServiceImpl implements CategorieService{
	@Autowired
	 private CategorieRepository  categorieRepository;  
	@override
	List<Categorie> getAllCategories(){return CategorieRepository.findAll();
}
