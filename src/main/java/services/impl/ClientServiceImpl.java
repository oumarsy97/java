package services.impl;

import entities.Client;
import repositories.ClientRepository;
import services.ClientService;
import views.ClientView;

import java.util.List;
import java.util.Optional;

public class ClientServiceImpl  implements ClientService {
    private final ClientRepository clientRepository;
    private final ClientView clientView;
    public ClientServiceImpl(ClientRepository clientRepository, ClientView clientView) {
        this.clientRepository = clientRepository;
        this.clientView = clientView;
    }

    @Override
    public void addClient(String surnom, String telephone, String adresse) {
        int index = clientRepository.getAllClients().size() +  1;
        Client client = new Client(index,surnom,telephone,adresse);
        clientRepository.save(client);
        clientView.create(client);
    }

    @Override
    public List<Client> getAllClients() {
        return List.of();
    }

    @Override
    public Optional<Client> getClientById(int id) {
        return Optional.empty();
    }

    @Override
    public void updateClient(int id, Client client) {

    }

    @Override
    public void deleteClient(int id) {

    }
}
