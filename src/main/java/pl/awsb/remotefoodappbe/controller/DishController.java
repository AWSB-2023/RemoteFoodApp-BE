package pl.awsb.remotefoodappbe.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.awsb.remotefoodappbe.entity.CurrentUser;
import pl.awsb.remotefoodappbe.entity.Dish;
import pl.awsb.remotefoodappbe.service.DishService;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dishes")
public class DishController {
    private  final DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }
    @PostMapping
    public void  addDish(@RequestBody Dish dish){
        dishService.addDish(dish);
    }
    @DeleteMapping
    public void deleteDish(@RequestParam(name = "dish_id") Long dishId){
        dishService.deleteDish(dishId);
    }
    @PutMapping
    public void updateDish(@RequestBody Dish dish){
        dishService.updateDish(dish);
    }
    @GetMapping
    public Optional<Dish> getDishById(@RequestParam(name = "dish_id")  Long dishId){
        return dishService.getDishById(dishId);
    }

    @GetMapping("/users")
    public List<Dish> getAllDishByUserId(@RequestParam(name = "user_id") Long userId){
        return dishService.getAllDishByUserId(userId);
    }

    @GetMapping("/countries")
    public List<Dish> getAllDishByCountryId(@RequestParam(name = "country_id") Long countryId){
        return dishService.getAllDishByCountryId(countryId);
    }
    @GetMapping("/favorites")
    public List<Dish> getAllFavoritesDish(@AuthenticationPrincipal CurrentUser currentUser){
        return dishService.getAllUserFavoritesDish(currentUser.getUser().getId());
    }
    @GetMapping("/my")
    public List<Dish> getAllMyDish(@AuthenticationPrincipal CurrentUser currentUser){
        return dishService.getAllDishByUserId(currentUser.getUser().getId());
    }
    @GetMapping("/top")
    public List<Dish> getAllMyDish(){
        return dishService.getAllDishByTopRated();
    }

}
