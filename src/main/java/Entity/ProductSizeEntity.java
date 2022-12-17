package Entity;

public class ProductSizeEntity {
    private int _id;
    private String size;
    private int quantity;
    private int productId;

    public ProductSizeEntity() {
    }

    public ProductSizeEntity(int _id, String size, int quantity, int productId) {
        this._id = _id;
        this.size = size;
        this.quantity = quantity;
        this.productId = productId;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
