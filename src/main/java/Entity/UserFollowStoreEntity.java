package Entity;

import java.util.Date;

public class UserFollowStoreEntity {
    private int _id;
    private int userId;
    private int storeId;
    private Date createdAt;

    public UserFollowStoreEntity() {
    }

    public UserFollowStoreEntity(int _id, int userId, int storeId, Date createdAt) {
        this._id = _id;
        this.userId = userId;
        this.storeId = storeId;
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

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
