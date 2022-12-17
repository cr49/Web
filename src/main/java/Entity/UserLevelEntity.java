package Entity;

public class UserLevelEntity {
	private int _id;
	private String name;
	private int minPoint;
	private int discount;
	private boolean isDeleted;
	public UserLevelEntity() {
		super();
	}
	public UserLevelEntity(int _id, String name, int minPoint, int discount, boolean isDeleted) {
		super();
		this._id = _id;
		this.name = name;
		this.minPoint = minPoint;
		this.discount = discount;
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
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	@Override
	public String toString() {
		return "UserLevelTu [_id=" + _id + ", name=" + name + ", minPoint=" + minPoint + ", discount=" + discount
				+ ", isDeleted=" + isDeleted + "]";
	}
	
}
