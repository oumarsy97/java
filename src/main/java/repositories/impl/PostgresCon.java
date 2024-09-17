package repositories.impl;

import repositories.AccessDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresCon implements AccessDB {

        Connection conn = null;

    public PostgresCon() {
        try {
            String url = "jdbc:postgresql://localhost:5432/dbJava";
            String user = "oumar";
            String password = "passer123";
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    @Override
    public Connection connect() {
        return conn;
    }


    @Override
    public void disconnect() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void executeQuery(String query) {
        try {
            conn.createStatement().executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void commit() {
        try {
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
