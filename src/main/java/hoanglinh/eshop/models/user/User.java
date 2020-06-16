package hoanglinh.eshop.models.user;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty(message = "khong duoc de trong")
    @Size(min = 8,max = 30,message = "chuoi phai tu 8-30 ki tu")
    @Pattern(regexp = "([A-Z]{1,5}[a-z]{1,10}[0-9]{1,5})",
            message ="vui long co chu hoa, chu thuong va so" )
    private String userName;
    @NotEmpty(message = "khong duoc de trong")
    @Size(min = 8,max = 30,message = "chuoi phai tu 8-30 ki tu")
    @Pattern(regexp = "([A-Z]{1,5}[a-z]{1,10}[0-9]{1,5})",message ="vui long co chu hoa, chu thuong va so" )
    private String password;
    @NotEmpty(message = "khong duoc de trong")
    @Size(min = 8,max = 30,message = "chuoi phai tu 8-30 ki tu")
    @javax.validation.constraints.Pattern(regexp = "(^[A-Za-z0-9+_.-]+@(.+)$)",message ="nhap theo dinh dang abc@gmail..." )
    private String email;
    @ManyToOne
    private Role role;

    public User() {
    }

    public User(Long id, @NotEmpty(message = "khong duoc de trong") @Size(min = 8, max = 30, message = "chuoi phai tu 8-30 ki tu")
    @Pattern(regexp = "([A-Z]{1,5}[a-z]{1,10}[0-9]{1,5})",
            message = "vui long co chu hoa, chu thuong va so") String userName, @NotEmpty(message = "khong duoc de trong")
    @Size(min = 8, max = 30, message = "chuoi phai tu 8-30 ki tu") @Pattern(regexp = "([A-Z]{1,5}[a-z]{1,10}[0-9]{1,5})",
            message = "vui long co chu hoa, chu thuong va so") String password, @NotEmpty(message = "khong duoc de trong")
    @Size(min = 8, max = 30, message = "chuoi phai tu 8-30 ki tu") @Pattern(regexp = "(^[A-Za-z0-9+_.-]+@(.+)$)",
            message = "nhap theo dinh dang abc@gmail...") String email, Role role) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public User(@NotEmpty(message = "khong duoc de trong") @Size(min = 8, max = 30, message = "chuoi phai tu 8-30 ki tu")
                @Pattern(regexp = "([A-Z]{1,5}[a-z]{1,10}[0-9]{1,5})",
            message = "vui long co chu hoa, chu thuong va so") String userName, @NotEmpty(message = "khong duoc de trong")
    @Size(min = 8, max = 30, message = "chuoi phai tu 8-30 ki tu") @Pattern(regexp = "([A-Z]{1,5}[a-z]{1,10}[0-9]{1,5})",
            message = "vui long co chu hoa, chu thuong va so") String password, Role role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
