package Entity;

import java.util.Date;

public class OrderEntity {
    private int _id;
    private int userId;
    private int deliveryId;
    private Date shippingDate;
    private int storeId;
    private String address;
    private String phone;
    private String status;
    private boolean isPaidBefore;
    private int amountFromUser;
    private int amountFromStore;
    private int amountToStore;
    private int amountToGD;
    private Date createdAt;

    public OrderEntity() {
    }

    public OrderEntity(int _id, int userId, int deliveryId, Date shippingDate, int storeId, String address, String phone, String status, boolean isPaidBefore, int amountFromUser, int amountFromStore, int amountToStore, int amountToGD, Date createdAt) {
        this._id = _id;
        this.userId = userId;
        this.deliveryId = deliveryId;
        this.shippingDate = shippingDate;
        this.storeId = storeId;
        this.address = address;
        this.phone = phone;
        this.status = status;
        this.isPaidBefore = isPaidBefore;
        this.amountFromUser = amountFromUser;
        this.amountFromStore = amountFromStore;
        this.amountToStore = amountToStore;
        this.amountToGD = amountToGD;
        this.createdAt = createdAt;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isPaidBefore() {
        return isPaidBefore;
    }

    public void setPaidBefore(boolean paidBefore) {
        isPaidBefore = paidBefore;
    }

    public int getAmountFromUser() {
        return amountFromUser;
    }

    public void setAmountFromUser(int amountFromUser) {
        this.amountFromUser = amountFromUser;
    }

    public int getAmountFromStore() {
        return amountFromStore;
    }

    public void setAmountFromStore(int amountFromStore) {
        this.amountFromStore = amountFromStore;
    }

    public int getAmountToStore() {
        return amountToStore;
    }

    public void setAmountToStore(int amountToStore) {
        this.amountToStore = amountToStore;
    }

    public int getAmountToGD() {
        return amountToGD;
    }

    public void setAmountToGD(int amountToGD) {
        this.amountToGD = amountToGD;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
