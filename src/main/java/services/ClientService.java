package services;

import entities.Client;
import entities.User;
import repositories.ClientRepository;
import repositories.UserRepository;

import java.util.List;
import java.util.Optional;
public interface ClientService {
    void addClient(String surnom, String telephone, String adresse);
    List<Client> getAllClients();
    Optional<Client> getClientById(int id);
    void updateClient(int id, Client client);
    void deleteClient(int id);

}
