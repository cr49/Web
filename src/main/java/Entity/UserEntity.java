package Entity;

import java.util.Date;

public class UserEntity {
	private int _id;
	private	String firstname;
	private String lastname;
	private String id_card;
	private String email;
	private String phone;
	private boolean isEmalActive;
	private boolean isPhoneActive;
	private String username;
	private String password;
	private String role;
	private String address;
	private String avatar;
	private int point;
	private int userlevelId;
	private Date createdAt;
	public UserEntity() {
		super();
	}
	public UserEntity(int _id, String firstname, String lastname, String id_card, String email, String phone,
					  boolean isEmalActive, boolean isPhoneActive, String username, String password, String role, String address,
					  String avatar, int point, int userlevelId, Date createdAt) {
		super();
		this._id = _id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.id_card = id_card;
		this.email = email;
		this.phone = phone;
		this.isEmalActive = isEmalActive;
		this.isPhoneActive = isPhoneActive;
		this.username = username;
		this.password = password;
		this.role = role;
		this.address = address;
		this.avatar = avatar;
		this.point = point;
		this.userlevelId = userlevelId;
		this.createdAt = createdAt;
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getId_card() {
		return id_card;
	}
	public void setId_card(String id_card) {
		this.id_card = id_card;
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
	public boolean isEmalActive() {
		return isEmalActive;
	}
	public void setEmalActive(boolean isEmalActive) {
		this.isEmalActive = isEmalActive;
	}
	public boolean isPhoneActive() {
		return isPhoneActive;
	}
	public void setPhoneActive(boolean isPhoneActive) {
		this.isPhoneActive = isPhoneActive;
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
	public int getUserlevelId() {
		return userlevelId;
	}
	public void setUserlevelId(int userlevelId) {
		this.userlevelId = userlevelId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "UserEntityTu [_id=" + _id + ", firstname=" + firstname + ", lastname=" + lastname + ", id_card="
				+ id_card + ", email=" + email + ", phone=" + phone + ", isEmalActive=" + isEmalActive
				+ ", isPhoneActive=" + isPhoneActive + ", username=" + username + ", password=" + password + ", role="
				+ role + ", address=" + address + ", avatar=" + avatar + ", point=" + point + ", userlevelId="
				+ userlevelId + ", createdAt=" + createdAt + "]";
	}
	
}
