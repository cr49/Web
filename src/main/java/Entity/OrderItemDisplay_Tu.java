package Entity;

import java.util.Date;

public class OrderItemDisplay_Tu {
    private int _id;
    private int productId;
    private int orderId;
    private String size;
    private int categoryId;
    private String content;
    private int count;
    private Date createdAt;
    private String productName;
    private String productImage;
    private int price;
    private int total;
    private String categoryName;

    public OrderItemDisplay_Tu() {
    }

    public OrderItemDisplay_Tu(int _id, int productId, int orderId, String size, int categoryId, String content, int count, Date createdAt, String productName, String productImage, int price, int total, String categoryName) {
        this._id = _id;
        this.productId = productId;
        this.orderId = orderId;
        this.size = size;
        this.categoryId = categoryId;
        this.content = content;
        this.count = count;
        this.createdAt = createdAt;
        this.productName = productName;
        this.productImage = productImage;
        this.price = price;
        this.total = total;
        this.categoryName = categoryName;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
