package main.java.springbootfirsttest.test.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.sterotype.Repository;
import net.javaguides.springboot.model.Client;
@Repository
public interface LigneCommandeRepository extends JpaRepository<LigneCommande, Long> {
Iterable<LigneCommande> findAllByNumero(string numero);
@Modifying
@Transactional 
@Query("delete From LigneCommande e where numero= ?")
}
