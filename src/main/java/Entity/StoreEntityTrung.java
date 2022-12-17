package Entity;

import java.util.Date;

public class StoreEntityTrung {
    int _id;
    String name;
    String bio;
    int ownerId;
    boolean isActive;
    boolean isOpen;
    String avatar;
    int point;
    float rating;
    int storeLevelId;
    Date createdAt;

    @Override
    public String toString() {
        return "StoreModelTrung{" +
                "_id=" + _id +
                ", name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                ", ownerId=" + ownerId +
                ", isActive=" + isActive +
                ", isOpen=" + isOpen +
                ", avatar='" + avatar + '\'' +
                ", point=" + point +
                ", rating=" + rating +
                ", storeLevelId=" + storeLevelId +
                ", createdAt=" + createdAt +
                '}';
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getStoreLevelId() {
        return storeLevelId;
    }

    public void setStoreLevelId(int storeLevelId) {
        this.storeLevelId = storeLevelId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
