package Entity;

import java.util.Date;

public class CartItemEntity {
    private int _id;
    private int cartId;
    private int productId;
    private int count;
    private String size;
    private Date createdAt;

    public CartItemEntity() {
    }

    public CartItemEntity(int _id, int cartId, int productId, int count, String size, Date createdAt) {
        this._id = _id;
        this.cartId = cartId;
        this.productId = productId;
        this.count = count;
        this.size = size;
        this.createdAt = createdAt;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
