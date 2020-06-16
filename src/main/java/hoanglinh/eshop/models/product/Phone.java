package hoanglinh.eshop.models.product;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String phoneName;
    @NotEmpty
    public String image;
    @NotEmpty
    private String manufacturer;
    @NotEmpty
    private String description;
    @NotEmpty
    private java.sql.Date productionDate;
    @NotNull
    private int sale;
    @NotNull
    private int quantity;
    @NotNull
    private double price;
    private Long purchase;
    private Long likes;

    public Phone() {
    }

    public Phone(Long id, @NotEmpty String phoneName, @NotEmpty String image, @NotEmpty String manufacturer,
                 @NotEmpty String description, @NotEmpty java.sql.Date productionDate, @NotNull int sale, @NotNull int quantity,
                 @NotNull double price, Long purchase, Long likes) {
        this.id = id;
        this.phoneName = phoneName;
        this.image = image;
        this.manufacturer = manufacturer;
        this.description = description;
        this.productionDate = productionDate;
        this.sale = sale;
        this.quantity = quantity;
        this.price = price;
        this.purchase = purchase;
        this.likes = likes;
    }

    public Phone(Long id, @NotEmpty String phoneName, @NotEmpty String image, @NotEmpty String manufacturer, @NotEmpty
            String description, @NotEmpty java.sql.Date productionDate, @NotNull int sale, @NotNull int quantity, @NotNull double price) {
        this.id = id;
        this.phoneName = phoneName;
        this.image = image;
        this.manufacturer = manufacturer;
        this.description = description;
        this.productionDate = productionDate;
        this.sale = sale;
        this.quantity = quantity;
        this.price = price;
    }

    public Phone(@NotEmpty String phoneName, @NotEmpty String image, @NotEmpty String manufacturer, @NotEmpty String description,
                 @NotEmpty java.sql.Date productionDate, @NotNull int sale, @NotNull int quantity, @NotNull double price, Long purchase,
                 Long likes) {
        this.phoneName = phoneName;
        this.image = image;
        this.manufacturer = manufacturer;
        this.description = description;
        this.productionDate = productionDate;
        this.sale = sale;
        this.quantity = quantity;
        this.price = price;
        this.purchase = purchase;
        this.likes = likes;
    }

    public Phone(@NotEmpty String phoneName, @NotEmpty String image, @NotEmpty String manufacturer, @NotEmpty String description, @NotEmpty java.sql.Date productionDate, @NotNull int sale, @NotNull int quantity, @NotNull double price) {
        this.phoneName = phoneName;
        this.image = image;
        this.manufacturer = manufacturer;
        this.description = description;
        this.productionDate = productionDate;
        this.sale = sale;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String name) {
        this.phoneName = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String producer) {
        this.manufacturer = producer;
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

    public Long getPurchase() {
        return purchase;
    }

    public void setPurchase(Long purchase) {
        this.purchase = purchase;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long like) {
        this.likes = like;
    }

}
