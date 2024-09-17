package repositories;

import java.sql.Connection;

public interface AccessDB {
    Connection connect();
    void disconnect();
    void executeQuery(String query);
}
