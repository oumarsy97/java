package views.impl;

import entities.Client;
import org.springframework.stereotype.Component;
import views.ClientView;

import java.util.List;

@Component
public class ClientViewImpl implements ClientView {
    @Override
    public void create(Client value) {
        System.out.println("Client créé : " + 
                "ID : " + value.getId() +
                ", Surnom : " + value.getSurnom() +
                ", Téléphone : " + value.getTelephone() +
                ", Adresse : " + value.getAdresse()
        );
    }

    @Override
    public void destroy(Client client) {
        System.out.println("Client"+client.getSurnom()+" supprimé avec succés");

    }

    @Override
    public void update( Client client) {
        System.out.println("Client "+client.getSurnom()+" mis à jour : " +
                "ID : " + client.getId() +
                ", Surnom : " + client.getSurnom() +
                ", Téléphone : " + client.getTelephone() +
                ", Adresse : " + client.getAdresse()
        );

    }




    @Override
    public void getAll(List<Client> clients) {
        for (Client client : clients) {
            show(client);
            System.out.println("------------------------");
        }
    }


    @Override
    public void show(Client client) {
        System.out.println("Client : " +
                "ID : " + client.getId() +
                ", Surnom : " + client.getSurnom() +
                ", Téléphone : " + client.getTelephone() +
                ", Adresse : " + client.getAdresse()
        );
    }
}
