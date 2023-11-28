package pl.awsb.remotefoodappbe.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.awsb.remotefoodappbe.entity.CurrentUser;
import pl.awsb.remotefoodappbe.entity.User;
import pl.awsb.remotefoodappbe.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
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
    public void deleteUser(@RequestParam(name = "user_id") Long userid) {
        userService.deleteUser(userid);
    }
    @PutMapping
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }
    @GetMapping()
    public Optional<User> getUser(@AuthenticationPrincipal CurrentUser currentUser) {
        return userService.getUserById(currentUser.getUser().getId());
    }

}
