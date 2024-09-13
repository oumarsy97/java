package services;
import entities.User;
import repositories.UserRepository;

import java.util.List;

public interface UserService {
    void addUser(String prenom,String nom,String login, String password, int _id);
    List<User> getAllUsers();
    User getUserById(int id);
    void updateUser(int id, User user);
    void deleteUser(int id);




}
