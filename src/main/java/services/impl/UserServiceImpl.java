package services.impl;

import entities.User;
import repositories.UserRepository;
import services.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(String prenom, String nom, String login, String password, int _id) {
        User user = new User(_id, nom, prenom, login, password);
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }


    @Override
    public User getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void updateUser(int id, User user) {
        userRepository.update(id,user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
