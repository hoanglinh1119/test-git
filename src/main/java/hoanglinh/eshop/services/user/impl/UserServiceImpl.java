package hoanglinh.eshop.services.user.impl;

import hoanglinh.eshop.models.user.User;
import hoanglinh.eshop.repositories.UserRepository;
import hoanglinh.eshop.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findByid(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User findByUserName(String username) {
        return userRepository.findUserByUserName(username);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}
