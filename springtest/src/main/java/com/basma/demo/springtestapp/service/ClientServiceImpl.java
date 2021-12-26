package main.java.springbootfirsttest.test.service;
import java.util.List;

public final class ClientServiceImpl implements ClientsService{
	@Autowired
	 private ClientRepository  clientRepository;  
	@override
	List<Client> getAllClients(){return ClientRepository.findAll();
}
