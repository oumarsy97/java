package repositories.impl;
import entities.Client;
import repositories.ClientRepository;
import java.util.ArrayList;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {
    private final List<Client> clients;
    public ClientRepositoryImpl() {
        clients = new ArrayList<>();
        // Add some dummy clients for testing
        clients.add(new Client(1, "John Doe", "0123456789", "123 Main St"));
        clients.add(new Client(2, "Jane Smith", "9876543210", "456 Elm St"));
        clients.add(new Client(3, "Alice Johnson", "1234567890", "789 Oak St"));
        clients.add(new Client(4, "Bob Brown", "9876543210", "789 Oak St"));
    }
    @Override
    public void save(Client client) {
        clients.add(client);
    }

    @Override
    public void deleteById(int id) {
        clients.removeIf(c -> c.getId() == id);
    }

    @Override
    public void update(int id, Client client) {
        clients.removeIf(c -> c.getId() == id);
        clients.add(client);
    }

    @Override
    public Client findById(int id) {
        return clients.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void deleteAll() {
        clients.clear();
    }

    @Override
    public List<Client> getAllClients() {
        return List.of();
    }
}
