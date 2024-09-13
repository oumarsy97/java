package repositories.impl;

import entities.User;
import repositories.UserRepository;

import java.util.List;

public class UserRepositoryJDBCImpl implements UserRepository {
    @Override
    public void save(User user) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public User update(int id, User user) {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }
}
