package pl.awsb.remotefoodappbe.serviceimpl;

import org.springframework.stereotype.Service;
import pl.awsb.remotefoodappbe.entity.Dish;
import pl.awsb.remotefoodappbe.repository.DishRepo;
import pl.awsb.remotefoodappbe.service.DishService;

import java.util.List;

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
    public List<Dish> getAllDishByUserId(Long userId) {
        return dishRepo.findAllByUserId(userId);
    }

}
