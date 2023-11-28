package pl.awsb.remotefoodappbe.serviceimpl;

import org.springframework.stereotype.Service;
import pl.awsb.remotefoodappbe.entity.Dish;
import pl.awsb.remotefoodappbe.repository.DishRepo;
import pl.awsb.remotefoodappbe.service.DishService;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class DishServiceImpl implements DishService {
    private final DishRepo dishRepo;

    public DishServiceImpl(DishRepo dishRepo) {
        this.dishRepo = dishRepo;
    }


    @Override
    public void addDish(Dish dish) {
        dishRepo.save(dish);
    }

    @Override
    public void updateDish(Dish dish) {
        dishRepo.save(dish);
    }

    @Override
    public void deleteDish(Long dishId) {
        dishRepo.deleteById(dishId);
    }

    @Override
    public Optional<Dish> getDishById(Long dishId) {
        return dishRepo.findById(dishId);
    }

    @Override
    public List<Dish> getAllDishByUserId(Long userId) {
        return dishRepo.findAllByUserId(userId);
    }

    @Override
    public List<Dish> getAllDishByCountryId(Long countryId) {
        return dishRepo.findAllByCountryId(countryId);
    }

    @Override
    public List<Dish> getDishByPage() {
        return dishRepo.findAll();
    }

    @Override
    public List<Dish> getAllDishByTopRated() {
        return dishRepo.findTopRatedDishes();
    }

    @Override
    public List<Dish> getAllUserFavoritesDish(Long userId) {
        return dishRepo.findUserFavoritesDish(userId);
    }

}
