package Entity;

import java.util.Date;

public class StoreDisplay_Tu {
    private int _id;
    private String name;
    private String bio;
    private int ownerId;
    private boolean isActive;
    private boolean isOpen;
    private String avatar;
    private int point;
    private float rating;
    private int storeLevelId;
    private Date createdAt;
    private String nameOwner;

    public StoreDisplay_Tu() {
    }

    public StoreDisplay_Tu(int _id, String name, String bio, int ownerId, boolean isActive, boolean isOpen, String avatar, int point, float rating, int storeLevelId, Date createdAt, String nameOwner) {
        this._id = _id;
        this.name = name;
        this.bio = bio;
        this.ownerId = ownerId;
        this.isActive = isActive;
        this.isOpen = isOpen;
        this.avatar = avatar;
        this.point = point;
        this.rating = rating;
        this.storeLevelId = storeLevelId;
        this.createdAt = createdAt;
        this.nameOwner = nameOwner;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
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

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }
}
