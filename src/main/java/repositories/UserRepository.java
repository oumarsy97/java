package repositories;

import entities.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    void save(User user);
    void deleteById(int id);
    User update(int id, User user);
    User findById(int id);
    void deleteAll();
    List<User> getAllUsers();

    public static int lastInsertId() {
        return 0;
    }
}
