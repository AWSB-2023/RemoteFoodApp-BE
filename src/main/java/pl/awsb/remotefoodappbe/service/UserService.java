package pl.awsb.remotefoodappbe.service;

import pl.awsb.remotefoodappbe.entity.Dish;
import pl.awsb.remotefoodappbe.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addUser(User user);

    void deleteUser(Long userId);

    void updateUser(User user);

    User findByUserName(String name);
    Optional<User> getUserById(Long userId);



}
