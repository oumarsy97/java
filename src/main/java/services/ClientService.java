package services;

import entities.Client;
import entities.User;
import repositories.ClientRepository;
import repositories.UserRepository;

import java.util.List;
import java.util.Optional;
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;


    }

    public void addClient(String surnom, String telephone, String adresse) {
        int id = clientRepository.getAllClients().size() + 1;
        Client client = new Client(id, surnom, telephone, adresse);
        clientRepository.addClient(client);
    }

    public List<Client> getAllClients() {
        List<Client> clients = clientRepository.getAllClients();
        clients.forEach(client ->
                System.out.println("ID: " + client.getId() + ", Surnom: " + client.getSurnom() + ", Téléphone: " + client.getTelephone() + ", Adresse: " + client.getAdresse()
                )
        );
        return clients;
    }

    public Optional<Client> getClientById(int id) {
        return clientRepository.getClientById(id);
    }

    public void updateClient(int id, String surnom, String telephone, String adresse) {
        Client client = new Client(id, surnom, telephone, adresse);
        clientRepository.updateClient(id, client);
    }

    public void deleteClient(int id) {
        clientRepository.deleteClient(id);
    }

    public void createCompte(int id,String nom, String prenom, String telephone, String adresse) {
        Optional<Client> client = clientRepository.getClientById(id);
        if (client.isPresent()) {
        UserRepository userRepository = new UserRepository();
        int user_id = userRepository.getAllUsers().size() + 1;
        User user = new User(user_id, nom, prenom, telephone, adresse);
        userRepository.addUser(user);
        System.out.println("Compte utilisateur créé pour le client avec l'ID " + id + ".");

        } else {
            System.out.println("Client avec l'ID " + id + " non trouvé.");
        }




    }


}
