package pl.awsb.remotefoodappbe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.awsb.remotefoodappbe.entity.Dish;
import pl.awsb.remotefoodappbe.service.DishService;

import java.util.List;

@Controller
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
    public void deleteDish(@RequestBody Long dishId){
        dishService.deleteDish(dishId);
    }
    @PutMapping
    public void updateDish(@RequestBody Dish dish){
        dishService.updateDish(dish);
    }
    @GetMapping
    public List<Dish> getAllDishByUserId(@RequestBody Long userId){
        return dishService.getAllDishByUserId(userId);
    }


}
