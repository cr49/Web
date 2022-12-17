package Entity;

public class ProductListTrung {
    private int _id;
    private String name;
    private String Url_image;
    private int stock;
    private int price;
    private double rating;
    private boolean isSelling;

    public ProductListTrung() {
    }

    public ProductListTrung(int _id, String name, String url_image, int stock, int price, double rating, boolean isSelling) {
        this._id = _id;
        this.name = name;
        Url_image = url_image;
        this.stock = stock;
        this.price = price;
        this.rating = rating;
        this.isSelling = isSelling;
    }

    @Override
    public String toString() {
        return "ProductListTrung{" +
                "_id=" + _id +
                ", name='" + name + '\'' +
                ", Url_image='" + Url_image + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", rating=" + rating +
                ", isSelling=" + isSelling +
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

    public String getUrl_image() {
        return Url_image;
    }

    public void setUrl_image(String url_image) {
        Url_image = url_image;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isSelling() {
        return isSelling;
    }

    public void setSelling(boolean selling) {
        isSelling = selling;
    }
}
