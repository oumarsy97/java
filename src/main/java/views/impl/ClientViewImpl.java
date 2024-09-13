package views.impl;

import entities.Client;
import views.ClientView;

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
    public void destroy() {

    }

    @Override
    public void update(Object value) {

    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public void show() {

    }
}
