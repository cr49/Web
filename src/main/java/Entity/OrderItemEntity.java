package Entity;

import java.util.Date;

public class OrderItemEntity {
    private int _id;
    private int productId;
    private int orderId;
    private String size;
    private int categoryId;
    private String content;
    private int count;
    private Date createdAt;

    public OrderItemEntity() {
    }

    public OrderItemEntity(int _id, int productId, int orderId, String size, int categoryId, String content, int count, Date createdAt) {
        this._id = _id;
        this.productId = productId;
        this.orderId = orderId;
        this.size = size;
        this.categoryId = categoryId;
        this.content = content;
        this.count = count;
        this.createdAt = createdAt;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
