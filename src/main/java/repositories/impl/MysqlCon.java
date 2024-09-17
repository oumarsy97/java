package repositories.impl;

import repositories.AccessDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlCon implements AccessDB {

    Connection conn = null;

    public MysqlCon() {
        try {
            String url = "jdbc:mysql://localhost:3306/dbJava";
            String user = "oumar";
            String password = "passer123";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Connection connect() {
        return conn;
    }

    @Override
    public void disconnect() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void executeQuery(String query) {
        try {
            Statement stmt = conn.createStatement();
            stmt.execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
