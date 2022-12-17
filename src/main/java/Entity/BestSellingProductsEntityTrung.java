package Entity;

public class BestSellingProductsEntityTrung {
    private int _id;
    String image;
    String name;
    int quantity;
    int total;
    int storeId;

public BestSellingProductsEntityTrung() {
    }

    @Override
    public String toString() {
        return "BestSellingProductsEntityTrung{" +
                "image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", total=" + total +
                ", storeId=" + storeId +
                '}';
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
}
