package services.impl;

import clients.interfaces.ClientRepo;
import entities.Client;
import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.ClientService;
import clients.interfaces.ClientView;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Optional;



@Service
public class ClientServiceImpl  implements ClientService {
    private final ClientRepo clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepo clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client save(int id,String surnom, String telephone, String adresse) throws SQLException {
        int index = clientRepository.findAll().size() +  1;
        Client client = new Client(index,surnom,telephone,adresse);
        clientRepository.save(client);

       return client;
    }

    @Override
    public Collection<Client> findAll() throws SQLException {
        //clientView.getAll(clients);
       return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findById(int id) {
        return Optional.empty();
    }

    @Override
    public void update(int id, Client client) {
         // update client
        clientRepository.save( client);

    }

    @Override
    public void delete(long id) {
         // delete client


    }

    @Override
    public void addUserToClient(long idClient, User user) {
     Optional<Client> client = clientRepository.findById((int) idClient);
//        client.stream();
//        client.ifPresent(c -> c.setUserId(user.getId()));
        //update client
//       clientRepository.update(idClient, client);
    }
}
