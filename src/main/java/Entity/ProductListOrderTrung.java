package Entity;

public class ProductListOrderTrung {
//    img, ten product, size, price, count, tong tien
    private String img;
    private String name;
    private String size;
    private int price;
    private int count;
    private int total;

    public ProductListOrderTrung() {
    }



    public ProductListOrderTrung(String img, String name, String size, int price, int count, int total) {
        this.img = img;
        this.name = name;
        this.size = size;
        this.price = price;
        this.count = count;
        this.total = total;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return price * count;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ProductListOrderTrung{" +
                "img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", total=" + total +
                '}';
    }
}

