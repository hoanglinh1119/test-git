package hoanglinh.eshop.models.product;

import hoanglinh.eshop.models.user.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class PhoneForm {
    private Long id;
    private String name;
    private MultipartFile image;
    private String producer;
    private String description;
    private java.sql.Date productionDate;
    private int sale;
    private int quantity;
    private double price;
    private Long purchase;
    private Long likes;
    private User user;

    public PhoneForm(Long id, String name, MultipartFile image, String producer,
                     String description, java.sql.Date productionDate, int sale, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.producer = producer;
        this.description = description;
        this.productionDate = productionDate;
        this.sale = sale;
        this.quantity = quantity;
        this.price = price;
    }

    public PhoneForm(String name, MultipartFile image, String producer, String description,
                     java.sql.Date productionDate, int sale, int quantity, double price) {
        this.name = name;
        this.image = image;
        this.producer = producer;
        this.description = description;
        this.productionDate = productionDate;
        this.sale = sale;
        this.quantity = quantity;
        this.price = price;
    }

    public PhoneForm(Long id, String name, MultipartFile image, String producer, String description,
                     java.sql.Date productionDate, int sale, int quantity, double price, Long purchase, Long likes) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.producer = producer;
        this.description = description;
        this.productionDate = productionDate;
        this.sale = sale;
        this.quantity = quantity;
        this.price = price;
        this.purchase = purchase;
        this.likes = likes;
    }

    public Long getPurchase() {
        return purchase;
    }

    public void setPurchase(Long purchase) {
        this.purchase = purchase;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
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

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(java.sql.Date productionDate) {
        this.productionDate = productionDate;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
