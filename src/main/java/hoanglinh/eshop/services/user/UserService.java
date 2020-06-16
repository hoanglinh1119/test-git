package hoanglinh.eshop.services.user;

import hoanglinh.eshop.models.user.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findByid(Long id);
    User findByUserName(String username);
    User save(User user);
    void delete(User user);
    boolean existsByEmail(String email);

}
