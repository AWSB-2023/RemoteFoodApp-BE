package pl.awsb.remotefoodappbe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.awsb.remotefoodappbe.entity.User;
import pl.awsb.remotefoodappbe.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
    @DeleteMapping
    public void deleteUser(@RequestBody Long userid) {
        userService.deleteUser(userid);
    }
    @PutMapping
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }
    @GetMapping
    public List<User> getUsers(List<Long> userId) {
        return userService.getUser(userId);
    }
}
