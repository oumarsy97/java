package controllers;

import entities.Client;
import entities.User;
import repositories.UserRepository;
import services.ClientService;
import services.UserService;
import services.impl.UserServiceImpl;
import views.ClientView;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class ClientController {
    private final ClientService clientService;
    private final ClientView clientView;
    Scanner scanner = new Scanner(System.in);


    public ClientController(ClientService clientService, ClientView clientView) {
        this.clientService = clientService;
        this.clientView = clientView;
    }

    public void addClient() {
        System.out.println("ajouter un client");
        System.out.println("Saisir le surnom du Client");
        String surnom = scanner.nextLine();
        System.out.println("Saisir l'adresse du Client");
        String adresse = scanner.nextLine();
        System.out.println("Saisir le numéro de téléphone du Client");
        String telephone = scanner.nextLine();
        Client client = clientService.addClient(surnom, telephone, adresse);
        clientView.create(client);
    }

    public void getAllClients() {
        List<Client> clients = clientService.getAllClients();
        clientView.getAll(clients);
    }

    public void createCompte() {
        System.out.println("Créer un compte utilisateur pour un client");
        System.out.println("Saisir l'id du client");
        int idClient = scanner.nextInt();
        scanner.nextLine();

        // Check if the client exists
        Optional<Client> client = clientService.getClientById(idClient);
        if (client.isEmpty()) {
            System.out.println("Client non trouvé.");

        }

        System.out.println("Saisir le nom du utilisateur");
        String nom = scanner.nextLine();
        System.out.println("Saisir le prenom du utilisateur");
        String prenom = scanner.nextLine();
        System.out.println("Saisir le login du utilisateur");
        String login = scanner.nextLine();
        System.out.println("Saisir le mot de passe du utilisateur");
        String password = scanner.nextLine();
        int userId = UserRepository.lastInsertId();
        // Create the new user
        User user = new User(userId + 1, nom, prenom, login, password);
        // Optionally, associate the user with the client
        clientService.addUserToClient(idClient, user);
        System.out.println("Utilisateur créé avec succès.");

    }

    public void createDette(){
        System.out.println("Créer une dette pour un client");
        System.out.println("Saisir l'id du client");
        int idClient = scanner.nextInt();
        scanner.nextLine();

        // Check if the client exists
        Optional<Client> client = clientService.getClientById(idClient);
        if (client.isEmpty()) {
            System.out.println("Client non trouvé.");
            return;
        }
        System.out.println("Saisir le montant de la dette");
        double montant = scanner.nextDouble();


    }
}


