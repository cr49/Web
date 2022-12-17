package Entity;

public class StoreLevelEntity {
    private int _id;
    private String name;
    private int minPoint;
    private float commissionPercent;
    private boolean isDeleted;

    public StoreLevelEntity() {
    }

    public StoreLevelEntity(int _id, String name, int minPoint, float commissionPercent, boolean isDeleted) {
        this._id = _id;
        this.name = name;
        this.minPoint = minPoint;
        this.commissionPercent = commissionPercent;
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

    public int getMinPoint() {
        return minPoint;
    }

    public void setMinPoint(int minPoint) {
        this.minPoint = minPoint;
    }

    public float getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(float commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
