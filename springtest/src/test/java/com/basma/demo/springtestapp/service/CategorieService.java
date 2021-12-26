package main.java.com.basma.demo.springtestapp.service;

import main.java.com.basma.demo.springtestapp.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.transaction.Transactional;

public interface CategorieService {

	//List<Categorie> getAllCategories();

@Transactional
@RepositoryRestResource
@CrossOrigin("*") // permit d'accepter les requests
public interface CategorieService extends JpaRepository<Categories,Long> {
    // on peut ajouter les toutes operations qu'on voulait...
}


}
