package pl.awsb.remotefoodappbe.service;

import pl.awsb.remotefoodappbe.entity.Dish;

import java.util.List;

public interface DishService {
    void addDish(Dish dish);
    void updateDish(Dish dish);
    void deleteDish(Long dishId);
    List<Dish> getAllDishByUserId(Long userId);

}
