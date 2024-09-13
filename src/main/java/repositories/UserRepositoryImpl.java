package repositories;

import entities.Article;
import entities.User;

import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    private List<User> users;

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void deleteById(int id) {
        users.removeIf(u -> u.getId() == id);
    }

    @Override
    public User update(int id, User user) {
        users.removeIf(u -> u.getId() == id);
        users.add(user);
        return user;
    }

    @Override
    public User findById(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void deleteAll() {
        users.clear();
    }

    @Override
    public List<User> getAllUsers() {
        return  users;
    }
}
