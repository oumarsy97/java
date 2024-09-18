package services.impl;
//
//import clients.interfaces.ClientRepo;
//import entities.Client;
//import entities.User;
//import services.ClientService;
//import views.ClientView;
//
//import java.sql.SQLException;
//import java.util.List;
//import java.util.Optional;
//
//
//public class ClientServiceImpl  implements ClientService {
//    private final ClientRepo clientRepository;
//    private final ClientView clientView;
//    public ClientServiceImpl(ClientRepo clientRepository, ClientView clientView) {
//        this.clientRepository = clientRepository;
//        this.clientView = clientView;
//    }
//
//    @Override
//    public Client save(String surnom, String telephone, String adresse) throws SQLException {
//        int index = clientRepository.findAll().size() +  1;
//        Client client = new Client(index,surnom,telephone,adresse);
//        clientRepository.save(client);
//       return client;
//    }
//
//    @Override
//    public List<Client> findAll() throws SQLException {
//       List<Client> clients = clientRepository.findAll();
//       clientView.getAll(clients);
//       return clients;
//    }
//
//    @Override
//    public Optional<Client> findById(int id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public void update(int id, Client client) {
//         // update client
//        clientRepository.update(id, client);
//
//    }
//
//    @Override
//    public void delete(long id) {
//         // delete client
//        clientRepository.deleteById(id);
//
//    }
//
//    @Override
//    public void addUserToClient(long idClient, User user) {
//     Optional<Client> client = clientRepository.findById(idClient);
////        client.stream();
//        client.ifPresent(c -> c.setUserId(user.getId()));
//        //update client
////        clientRepository.update(idClient, client);
//    }
//}
