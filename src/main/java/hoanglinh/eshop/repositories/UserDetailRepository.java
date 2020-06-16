package hoanglinh.eshop.repositories;

import hoanglinh.eshop.models.user.UserDetail;
import org.springframework.data.repository.CrudRepository;

public interface UserDetailRepository extends CrudRepository<UserDetail,Long> {
}
