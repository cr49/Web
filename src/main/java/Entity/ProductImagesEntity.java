package Entity;

public class ProductImagesEntity {
    private int _id;
    private String url_image;
    private int productId;

    public ProductImagesEntity(int _id, String url_image, int productId) {
        this._id = _id;
        this.url_image = url_image;
        this.productId = productId;
    }

    public ProductImagesEntity() {
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
