package hoanglinh.eshop.controllers;

import hoanglinh.eshop.models.user.Role;
import hoanglinh.eshop.models.user.User;
import hoanglinh.eshop.models.user.UserClientAuthen;
import hoanglinh.eshop.models.user.UserLogin;
import hoanglinh.eshop.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class UserController {
    @Autowired
    private Role roleUser;
    @Autowired
    private Role roleAdmin;
    @Autowired
    private UserService userService;
    @GetMapping("/api/createUser")
    public ResponseEntity<Void> createUser(@RequestBody User user){
        user.setRole(roleUser);
        User user1=userService.findByUserName(user.getUserName());
        try {
            if (user1!=null && !userService.existsByEmail(user.getEmail()))
            userService.save(user);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/login")
    public ResponseEntity<UserClientAuthen> doLogin(@RequestBody UserLogin userLogin){
        User user= userService.findByUserName(userLogin.getUsername());
        UserClientAuthen userClientAuthen=null;
        if (user!=null){
            if (user.getPassword().equals(user.getUserName())){
                userClientAuthen = new UserClientAuthen(
                        user.getId(),
                        user.getUserName(),
                        user.getPassword(),
                        user.getRole().getAuthority(),
                        "fake-jwt-token." + user.getId()
                );
            }else{
                userClientAuthen=null;
            }
        }
        return new ResponseEntity<UserClientAuthen>(userClientAuthen, HttpStatus.OK);
    }
}
