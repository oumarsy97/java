package org.example;



import database.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.sql.Connection;
import java.sql.SQLException;

@Component
public class DatabaseTest {

    private final Database database;

    @Autowired
    public DatabaseTest(Database database) {
        this.database = database;
    }


    public void testConnection() {
        try (Connection connection = database.getConnection()) {
            if (connection != null) {
                System.out.println("Connexion réussie à la base de données !");
            } else {
                System.out.println("La connexion à la base de données a échoué.");
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
        }
    }
}
