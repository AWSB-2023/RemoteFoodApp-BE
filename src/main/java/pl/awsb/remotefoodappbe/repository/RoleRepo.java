package pl.awsb.remotefoodappbe.repository;

import org.springframework.stereotype.Repository;
import pl.awsb.remotefoodappbe.entity.Role;
@Repository
public interface RoleRepo {
    Role findByName(String name);

}
