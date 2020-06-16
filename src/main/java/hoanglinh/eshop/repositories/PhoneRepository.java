package hoanglinh.eshop.repositories;

import hoanglinh.eshop.models.product.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.access.method.P;

public interface PhoneRepository extends JpaRepository<Phone,Long> {
    @Override
    Page<Phone> findAll(Pageable pageable);
    @Query(value = "select p from Phone as p order by p.purchase desc")
    Page<Phone> findAllOrderByPurchaseDesc(Pageable pageable);
}
