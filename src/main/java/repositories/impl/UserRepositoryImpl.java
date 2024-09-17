package repositories.impl;

import entities.User;
import repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private static int lastUserId = 0;
    private final List<User> users;
    public UserRepositoryImpl() {
        users = new ArrayList<>();
    }

    public static int getLastUserId() {
        return lastUserId;
    }

    public static void setLastUserId(int lastUserId) {
        UserRepositoryImpl.lastUserId = lastUserId;
    }

    @Override
    public void save(User user) {
        users.add(user);
        lastUserId = user.getId();
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


    public static int lastInsertId(){
        return lastUserId;
    }


}
