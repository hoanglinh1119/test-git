package hoanglinh.eshop.models.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String fullName;
    @NotEmpty
    private String numberPhone;
    @NotEmpty
    private String address;
    private Date date;

    public UserDetail() {
    }

    public UserDetail(Long id, @NotEmpty String name, @NotEmpty String fullName, @NotEmpty String numberPhone, @NotEmpty String address, Date date) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.numberPhone = numberPhone;
        this.address = address;
        this.date = date;
    }

    public UserDetail(@NotEmpty String name, @NotEmpty String fullName, @NotEmpty String numberPhone, @NotEmpty String address, Date date) {
        this.name = name;
        this.fullName = fullName;
        this.numberPhone = numberPhone;
        this.address = address;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
