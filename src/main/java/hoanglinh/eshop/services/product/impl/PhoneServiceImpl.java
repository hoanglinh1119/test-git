package hoanglinh.eshop.services.product.impl;

import hoanglinh.eshop.models.product.Phone;
import hoanglinh.eshop.repositories.PhoneRepository;
import hoanglinh.eshop.services.product.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;
    @Override
    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

    @Override
    public Page<Phone> findAllByPage(Pageable pageable) {
        return phoneRepository.findAll(pageable);
    }

    @Override
    public Page<Phone> findAllOrderByPurchaseDesc(Pageable pageable) {
        return phoneRepository.findAllOrderByPurchaseDesc(pageable);
    }

    @Override
    public Phone findOne(Long id) {
        return phoneRepository.findOne(id);
    }

    @Override
    public void save(Phone phone) {
    phoneRepository.save(phone);
    }

    @Override
    public void delete(Long id) {
     phoneRepository.delete(id);
    }
}
