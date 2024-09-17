package org.example;

import config.AppConfig;
import controllers.ClientController;
import services.ClientService;
import services.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //UserService userService = AppConfig.getInstance("userService", UserService.class);
        //ClientService clientService = AppConfig.getInstance("clientService", ClientService.class);
        ClientController clientController = AppConfig.getInstance("clientController", ClientController.class);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            // Afficher le menu
            System.out.println("1-Ajouter Client");
            System.out.println("2-Lister Client");
            System.out.println("3-Creer un compte user pour un client");
            System.out.println("4-Creer une Dette pour un Client");
            System.out.println("5-Effectuer un Paiement");
            System.out.println("6-Lister les dettes d'un client");
            System.out.println("7-Lister les Paiements d'une dette");
            System.out.println("8-Quitter");
            System.out.println("Choosiness une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine();


            switch (choix) {
                case 1:
                    clientController.addClient();
                    break;
                case 2:
                    System.out.println("Liste des clients");
                    clientController.getAllClients();
                    break;
                case 3:
                    System.out.println("Création d'un compte utilisateur pour un client");
                    System.out.println("donner l'id du client");
                    int idClient = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("donner le nom du utilisateur");
                    String nom = scanner.nextLine();
                    System.out.println("donner le prenom du utilisateur");
                    String prenom = scanner.nextLine();
                    System.out.println("donner le login du utilisateur");
                    String login = scanner.nextLine();
                    System.out.println("donner le mot de passe du utilisateur");
                    String password = scanner.nextLine();





                    break;
                case 4:
                    // Logique pour créer une dette
                    System.out.println("Création d'une dette pour un client");
                    // Implémenter ici la méthode correspondante
                    break;
                case 5:
                    // Logique pour effectuer un paiement
                    System.out.println("Effectuer un paiement");
                    // Implémenter ici la méthode correspondante
                    break;
                case 6:
                    // Logique pour lister les dettes d'un client
                    System.out.println("Liste des dettes d'un client");
                    // Implémenter ici la méthode correspondante
                    break;
                case 7:
                    // Logique pour lister les paiements d'une dette
                    System.out.println("Liste des paiements d'une dette");
                    // Implémenter ici la méthode correspondante
                    break;
                case 8:
                    // Quitter le programme
                    System.out.println("Au revoir!");
                    running = false;
                    break;
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        }

        // Fermer le scanner
        scanner.close();
    }
}
