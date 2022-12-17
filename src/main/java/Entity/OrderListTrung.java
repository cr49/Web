package Entity;

import java.util.Date;

public class OrderListTrung {
    int _id;
    String name;
    int amountFromUser;

    Date createdAt;

    String nameDelivery;
    String status;

    public OrderListTrung() {
    }

    public OrderListTrung(int _id, String name, int amountFromUser, Date createdAt, String nameDelivery, String status) {
        this._id = _id;
        this.name = name;
        this.amountFromUser = amountFromUser;
        this.createdAt = createdAt;
        this.nameDelivery = nameDelivery;
        this.status = status;
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

    public int getAmountFromUser() {
        return amountFromUser;
    }

    public void setAmountFromUser(int amountFromUser) {
        this.amountFromUser = amountFromUser;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getNameDelivery() {
        return nameDelivery;
    }

    public void setNameDelivery(String nameDelivery) {
        this.nameDelivery = nameDelivery;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderListTrung{" +
                "_id=" + _id +
                ", name='" + name + '\'' +
                ", amountFromUser=" + amountFromUser +
                ", createdAt=" + createdAt +
                ", nameDelivery='" + nameDelivery + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
