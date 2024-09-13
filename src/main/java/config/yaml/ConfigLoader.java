package config.yaml;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class ConfigLoader {
    private Map<String, Object> config;

    @SuppressWarnings("unchecked")
    public ConfigLoader() {
        Yaml yaml = new Yaml();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.yaml")) {
            config = yaml.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getServiceImpl(String serviceName) {
        Map<String, String> services = (Map<String, String>) config.get("services");
        return services.get(serviceName);
    }

    public String getRepositoryImpl(String repoName) {
        Map<String, String> repositories = (Map<String, String>) config.get("repositories");
        return repositories.get(repoName);
    }
}
