package pl.awsb.remotefoodappbe.controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.awsb.remotefoodappbe.entity.User;
import pl.awsb.remotefoodappbe.service.DishService;
import pl.awsb.remotefoodappbe.service.UserService;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class LoginController {
    private  final UserService userService;
    private  final DishService dishService;

    public LoginController(UserService userService, DishService dishService) {
        this.userService = userService;
        this.dishService = dishService;
    }


    @GetMapping
    public String login() {
        return "login";
    }

}
