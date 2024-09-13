package config;

import config.yaml.ConfigLoader;

import java.lang.reflect.Constructor;

public class AppConfig {

    private static final ConfigLoader configLoader = new ConfigLoader();

    // Méthode générique pour instancier dynamiquement un service ou repository
    public static <T> T getInstance(String configKey, Class<T> clazz) {
        try {
            String className = configLoader.getServiceImpl(configKey); // Charger à partir du YAML
            Class<?> implClass = Class.forName(className);
            Constructor<?> constructor = implClass.getDeclaredConstructors()[0]; // Récupérer le constructeur
            constructor.setAccessible(true); // Déclencher le constructeur en privé




            if (constructor.getParameterCount() > 0) {
                Class<?>[] paramTypes = constructor.getParameterTypes();
                Object[] params = new Object[paramTypes.length];
                System.out.println("Construct"+params.length);

                for (int i = 0; i < paramTypes.length; i++) {

                    params[i] = getInstance(getDependencyKey(paramTypes[i]), paramTypes[i]);
                }

                return clazz.cast(constructor.newInstance(params)); // Utilisation de newInstance avec paramètres
            }

            return clazz.cast(implClass.getDeclaredConstructor().newInstance()); // Utilisation de getDeclaredConstructor().newInstance()
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors de la création de l'instance pour " + configKey, e);
        }
    }

    // Méthode pour mapper les classes aux noms de dépendances dans le YAML
  /*  private static String getDependencyKey(Class<?> clazz) {
        if (clazz.getSimpleName().contains("UserRepository")) {
            return "userRepository";
        }else if (clazz.getSimpleName().contains("UserService")){
            return "userService";
        }
        else if (clazz.getSimpleName().contains("ClientService")) {
            return "clientService";
        }else if (clazz.getSimpleName().contains("ClientRepository")){
            return "clientRepository";
        }else if (clazz.getSimpleName().contains("ClientView")){
            return "clientView";
        }

        return null;
    }*/

    private static String getDependencyKey(Class<?> clazz) {
        String className = clazz.getSimpleName();
        return Character.toLowerCase(className.charAt(0)) + className.substring(1);
    }
}
