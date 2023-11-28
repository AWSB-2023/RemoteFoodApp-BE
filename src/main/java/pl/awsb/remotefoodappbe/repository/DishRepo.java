package pl.awsb.remotefoodappbe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.awsb.remotefoodappbe.entity.Dish;

import java.awt.print.Pageable;
import java.util.List;
@Repository
public interface DishRepo extends JpaRepository<Dish, Long> {
    List<Dish> findAllByUserId(Long userId);
    List<Dish> findAllByCountryId(Long countryId);
    @Query(value = "SELECT d FROM Mark m LEFT JOIN Dish d ON m.dish.id = d.id GROUP BY d.id ORDER BY AVG(m.mark) DESC")
    List<Dish> findTopRatedDishes();
    @Query("select d from Dish d JOIN d.favoritesDish f where f.id= :userId")
    List<Dish> findUserFavoritesDish(@Param("userId") Long userId);


}
