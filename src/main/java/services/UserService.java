package services;
import entities.User;
import repositories.UserRepository;

import java.util.List;

public class UserService {
    final UserRepository userRepository;
    public UserService( UserRepository userRepository) {
        this.userRepository = userRepository;

    }
    public void addUser(String nom, String prenom, String login, String password) {
        User user = new User(userRepository.getAllUsers().size() + 1, nom, prenom, login, password);
        userRepository.save(user);
    }
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public List<User> getAllUsers() {

        return userRepository.getAllUsers();
    }

    public User getUserById(int id) {
        return userRepository.findById(id);
    }


}
