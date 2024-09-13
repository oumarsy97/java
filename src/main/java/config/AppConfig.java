package config;

import config.yaml.ConfigLoader;
import services.ClientService;
import services.impl.ClientServiceImpl;
import repositories.ClientRepository;
import repositories.impl.ClientRepositoryImpl;

public class AppConfig {

    private static ClientService clientService;

    private static ConfigLoader configLoader = new ConfigLoader();

    public static ClientService getClientService() {
        if (clientService == null) {
            String clientServiceImpl = configLoader.getServiceImpl("clientService");
            if (clientServiceImpl.equals("ClientServiceImpl")) {
                clientService = new ClientServiceImpl(getClientRepository());
            }
        }
        return clientService;
    }

    private static ClientRepository getClientRepository() {
        String clientRepoImpl = configLoader.getRepositoryImpl("clientRepository");
        if (clientRepoImpl.equals("ClientRepositoryImpl")) {
            return new ClientRepositoryImpl();
        }
        // Tu peux ajouter d'autres implémentations ici si nécessaire
        return null;
    }
}
