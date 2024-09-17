package repositories.impl;

import com.mongodb.client.MongoClients;
import repositories.AccessDB;

import java.sql.Connection;

public class MongoCon implements AccessDB {

    @Override
    public Connection connect() {
        String con = "mongodb+srv://syoumar505:LpkTfSb6wXnjrgNu@laravel.vqpoa.mongodb.net/?retryWrites=true&w=majority&appName=laravel";
        // Connect to MongoDB
        return (Connection) MongoClients.create(con).getDatabase("mydb");
    }

    @Override
    public void disconnect() {
        // Close MongoDB connection
        MongoClients.create().close();
    }

    @Override
    public void executeQuery(String query) {
        // Execute MongoDB query



    }

    @Override
    public void commit() {

    }

    @Override
    public void rollback() {

    }
}
