package pl.awsb.remotefoodappbe.serviceimpl;

import org.springframework.stereotype.Service;
import pl.awsb.remotefoodappbe.entity.User;
import pl.awsb.remotefoodappbe.repository.UserRepo;
import pl.awsb.remotefoodappbe.service.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepo.deleteById(userId);
    }

    @Override
    public void updateUser(User user) {
        userRepo.save(user);
    }

    @Override
    public List<User> getUser(List<Long> userId) {
        return userRepo.findAllById(userId);
    }
}
