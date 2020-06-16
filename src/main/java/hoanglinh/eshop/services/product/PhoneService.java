package hoanglinh.eshop.services.product;

import hoanglinh.eshop.models.product.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface PhoneService {
    List<Phone> findAll();
    Page<Phone> findAllByPage(Pageable pageable);
    Page<Phone>findAllOrderByPurchaseDesc(Pageable pageable);
    Phone findOne(Long id);
    void save(Phone phone);
    void delete (Long id);
}
