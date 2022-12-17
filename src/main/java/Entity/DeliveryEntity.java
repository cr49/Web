package Entity;

public class DeliveryEntity {
    private int _id;
    private String name;
    private String description;
    private int price;
    private int EstimatedDeliveryDays;
    private boolean isDeleted;

    public DeliveryEntity() {
    }

    public DeliveryEntity(int _id, String name, String description, int price, int estimatedDeliveryDays, boolean isDeleted) {
        this._id = _id;
        this.name = name;
        this.description = description;
        this.price = price;
        EstimatedDeliveryDays = estimatedDeliveryDays;
        this.isDeleted = isDeleted;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEstimatedDeliveryDays() {
        return EstimatedDeliveryDays;
    }

    public void setEstimatedDeliveryDays(int estimatedDeliveryDays) {
        EstimatedDeliveryDays = estimatedDeliveryDays;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
