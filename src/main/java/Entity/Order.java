package Entity;

public class Order {
	private int id;
	private int userid;
	private int deliveryid;
	private String shippingdate;
	private int storeid;
	private String address;
	private String phone;
	private String status;
	private int ispaidbefore;
	private int amountfromuser;
	private int amountfromstore;
	private int amounttostore;
	private int amounttogd;
	private String create;
	
	public Order() {}
	
	public Order(int id, int userid, int deliveryid, String shippingdate, 
			int storeid, String address, String phone , String status, int ispaidbefore, int amountfromuser,
			int amountfromstore, int amounttostore, int amounttogd, String create) {
		this.id = id;
		this.userid = userid;
		this.deliveryid = deliveryid;
		this.shippingdate = shippingdate;
		this.storeid = storeid;
		this.address = address;
		this.phone = phone;
		this.status = status;
		this.ispaidbefore = ispaidbefore;
		this.amountfromuser = amountfromuser;
		this.amountfromstore = amountfromstore;
		this.amounttostore = amounttostore;
		this.amounttogd = amounttogd;
		this.create = create;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getDeliveryid() {
		return deliveryid;
	}

	public void setDeliveryid(int deliveryid) {
		this.deliveryid = deliveryid;
	}

	public String getShippingdate() {
		return shippingdate;
	}

	public void setShippingdate(String shippingdate) {
		this.shippingdate = shippingdate;
	}

	public int getStoreid() {
		return storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
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

	public int getIspaidbefore() {
		return ispaidbefore;
	}

	public void setIspaidbefore(int ispaidbefore) {
		this.ispaidbefore = ispaidbefore;
	}

	public int getAmountfromuser() {
		return amountfromuser;
	}

	public void setAmountfromuser(int amountfromuser) {
		this.amountfromuser = amountfromuser;
	}

	public int getAmountfromstore() {
		return amountfromstore;
	}

	public void setAmountfromstore(int amountfromstore) {
		this.amountfromstore = amountfromstore;
	}

	public int getAmounttostore() {
		return amounttostore;
	}

	public void setAmounttostore(int amounttostore) {
		this.amounttostore = amounttostore;
	}

	public int getAmounttogd() {
		return amounttogd;
	}

	public void setAmounttogd(int amounttogd) {
		this.amounttogd = amounttogd;
	}

	public String getCreate() {
		return create;
	}

	public void setCreate(String create) {
		this.create = create;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userid=" + userid + ", deliveryid=" + deliveryid + ", shippingdate="
				+ shippingdate + ", storeid=" + storeid + ", address=" + address + ", phone=" + phone + ", status="
				+ status + ", ispaidbefore=" + ispaidbefore + ", amountfromuser=" + amountfromuser
				+ ", amountfromstore=" + amountfromstore + ", amounttostore=" + amounttostore + ", amounttogd="
				+ amounttogd + ", create=" + create + "]";
	}

	
	
}

