package org.example;

import config.yaml.ConfigLoader;

public class TestConfigLoader {
    public static void main(String[] args) {
        try {
            String className = "services.impl.UserServiceImpl"; // Remplacez par le nom de votre classe
            System.out.println("Tentative de chargement de la classe : " + className);
            Class<?> implClass = Class.forName(className);
            System.out.println("Classe chargée avec succès : " + implClass.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
