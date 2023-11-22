package pl.awsb.remotefoodappbe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.awsb.remotefoodappbe.entity.Dish;

import java.util.List;
@Repository
public interface DishRepo extends JpaRepository<Dish, Long> {
    List<Dish> findAllByUserId(Long userId);
    List<Dish> findAllByCountryId(Long countryId);
    List<Dish> findDistinctTopByOrderByIdAsc(int offset, int limit);
}
