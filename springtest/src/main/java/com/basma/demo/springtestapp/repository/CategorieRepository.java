
package main.java.com.basma.demo.springtestapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.sterotype.Repository;
import net.javaguides.springboot.model.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

}
