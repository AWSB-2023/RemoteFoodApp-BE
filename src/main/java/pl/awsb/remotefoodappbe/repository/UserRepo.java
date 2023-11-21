package pl.awsb.remotefoodappbe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.awsb.remotefoodappbe.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
