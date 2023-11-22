package pl.awsb.remotefoodappbe.service;

import pl.awsb.remotefoodappbe.entity.Dish;

import java.util.List;
import java.util.Optional;

public interface DishService {
    void addDish(Dish dish);
    void updateDish(Dish dish);
    void deleteDish(Long dishId);

    Optional<Dish> getDishById(Long dishId);
    List<Dish> getAllDishByUserId(Long userId);

    List<Dish> getAllDishByCountryId(Long countryId);
    List<Dish> getDishByPage(int offset, int limit);

}
