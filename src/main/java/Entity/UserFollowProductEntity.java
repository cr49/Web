package Entity;

import java.util.Date;

public class UserFollowProductEntity {
    private int _id;
    private int userId;
    private int productId;
    private Date createdAt;

    public UserFollowProductEntity() {
    }

    public UserFollowProductEntity(int _id, int userId, int productId, Date createdAt) {
        this._id = _id;
        this.userId = userId;
        this.productId = productId;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
