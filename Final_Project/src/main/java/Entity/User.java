package Entity;

public class User {
	
	private int id;
	private String fname;
	private String lname;
	private String idcard;
	private String email;
	private String phone;
	private int emailactive;
	private int phoneactive;
	private String username;
	private String password;
	private String role;
	private String address;
	private String avatar;
	private int point;
	private int level;
	private String create;
	
	public User() {}
	
	public User(int id, String fname, String lname, String idcard, String email, String phone,
			int emailactive, int phoneactive, String username , String password, String role, 
			String address, String avatar, int point, int level, String create) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.idcard = idcard;
		this.email = email;
		this.phone = phone;
		this.emailactive = emailactive;
		this.phoneactive = phoneactive;
		this.username = username;
		this.password = password;
		this.role = role;
		this.address = address;
		this.avatar = avatar;
		this.point = point;
		this.level = level;
		this.create = create;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getEmailactive() {
		return emailactive;
	}

	public void setEmailactive(int emailactive) {
		this.emailactive = emailactive;
	}

	public int getPhoneactive() {
		return phoneactive;
	}

	public void setPhoneactive(int phoneactive) {
		this.phoneactive = phoneactive;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getCreate() {
		return create;
	}

	public void setCreate(String create) {
		this.create = create;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", idcard=" + idcard + ", email=" + email
				+ ", phone=" + phone + ", emailactive=" + emailactive + ", phoneactive=" + phoneactive + ", username="
				+ username + ", password=" + password + ", role=" + role + ", address=" + address + ", avatar=" + avatar
				+ ", point=" + point + ", level=" + level + ", create=" + create + "]";
	}

	
}
