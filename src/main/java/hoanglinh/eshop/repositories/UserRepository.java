package hoanglinh.eshop.repositories;

import hoanglinh.eshop.models.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findUserByUserName(String username);
    boolean existsByEmail(String email);
}
