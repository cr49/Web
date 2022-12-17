package Entity;

import java.util.Date;

public class ReviewEntity {
    private int _id;
    private int userId;
    private int productId;
    private int storeId;
    private int orderId;
    private String content;
    private int stars;
    private Date createdAt;

    public ReviewEntity() {
    }

    public ReviewEntity(int _id, int userId, int productId, int storeId, int orderId, String content, int stars, Date createdAt) {
        this._id = _id;
        this.userId = userId;
        this.productId = productId;
        this.storeId = storeId;
        this.orderId = orderId;
        this.content = content;
        this.stars = stars;
        this.createdAt = createdAt;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
