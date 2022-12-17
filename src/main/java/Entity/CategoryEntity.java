package Entity;

import java.util.Date;

public class CategoryEntity {
    private int _id;
    private String name;
    private String image;
    private boolean isDeleted;
    private Date createdAt;

    public CategoryEntity() {
    }

    public CategoryEntity(int _id, String name, String image, boolean isDeleted, Date createdAt) {
        this._id = _id;
        this.name = name;
        this.image = image;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
