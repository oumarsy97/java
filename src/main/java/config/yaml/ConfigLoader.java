package config.yaml;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class ConfigLoader {
    private final Map<String, Object> config;

    public ConfigLoader() {
        Yaml yaml = new Yaml();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.yaml")) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Fishier de configuration non trouvé dans le classpath.");
            }
            config = yaml.load(inputStream);
            if (config == null) {
                throw new IllegalStateException("Configuration vide ou invalide");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erreur lors du chargement de la configuration", e);
        }
    }

    @SuppressWarnings("unchecked")
    public String getServiceImpl(String serviceName) {
        if (config == null) {
            throw new IllegalStateException("Configuration non chargée");
        }
        Map<String, String> services = (Map<String, String>) config.get("services");
        if (services == null) {
            throw new IllegalStateException("Section 'services' non trouvée dans la configuration");
        }
        if (!services.containsKey(serviceName)) {
            throw new IllegalArgumentException("Service '" + serviceName + "' non trouvé dans la configuration");
        }

        return services.get(serviceName);
    }

    @SuppressWarnings("unchecked")
    public String getRepositoryImpl(String repoName) {
        if (config == null) {
            throw new IllegalStateException("Configuration non chargée");
        }
        Map<String, String> repositories = (Map<String, String>) config.get("repositories");
        if (repositories == null) {
            throw new IllegalStateException("Section 'repositories' non trouvée dans la configuration");
        }

        return repositories.get(repoName);
    }


}
