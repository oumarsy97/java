package repositories;



import entities.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public interface ClientRepository {
    void save(Client client);
    void deleteById(int id);
    void update(int id, Client client);
    Client findById(int id);
    void deleteAll();
    List<Client> getAllClients();


    }
