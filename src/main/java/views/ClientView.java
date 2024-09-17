package views;

import entities.Client;

import java.util.List;

public interface ClientView {
    public void create(Client value);
    public void destroy(Client client);
    public void update(Client client);
    public void show(Client client);
    public void getAll(List<Client> clients);

}
