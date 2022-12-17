package Entity;

import java.util.Date;

public class ProductEntity {
    private int _id;
    private String name;
    private String description;
    private int sold;
    private boolean isActive;
    private boolean isSelling;
    private int categoryId;
    private int storeId;
    private float rating;
    private Date createdAt;
    private int price;

    public ProductEntity() {
    }

    public ProductEntity(int _id, String name, String description, int sold, boolean isActive, boolean isSelling, int categoryId, int storeId, float rating, Date createdAt, int price) {
        this._id = _id;
        this.name = name;
        this.description = description;
        this.sold = sold;
        this.isActive = isActive;
        this.isSelling = isSelling;
        this.categoryId = categoryId;
        this.storeId = storeId;
        this.rating = rating;
        this.createdAt = createdAt;
        this.price = price;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isSelling() {
        return isSelling;
    }

    public void setSelling(boolean selling) {
        isSelling = selling;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
