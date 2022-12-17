package Entity;

public class ProductImagesEntity {
    private int _id;
    private String Url_image;
    private int productId;

    public ProductImagesEntity() {
    }
    public ProductImagesEntity(int _id, String url_image, int productId) {
        this._id = _id;
        Url_image = url_image;
        this.productId = productId;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getUrl_image() {
        return Url_image;
    }

    public void setUrl_image(String url_image) {
        Url_image = url_image;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
