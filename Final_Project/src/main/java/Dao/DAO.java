package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBConnection;
import Entity.Account;
import Entity.Category;
import Entity.Delivery;
import Entity.Doanhthu;
import Entity.Doanhthu1;
import Entity.Doanhthu2;
import Entity.Order;
import Entity.Product;
import Entity.Store;
import Entity.User;

public class DAO {
	
	//ket noi sql
	//chuyen query sang sql
	//nhan ket qua tra ve
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<Product> getAllProduct(){
		List<Product> list = new ArrayList<>();
		String query="SELECT p._id, p.name, p.description, p.categoryId, p.storeId, p.rating, p.createdAt, p.price, p1.Url_image, p2.size, p2.quantity\r\n"
				+ "FROM Product AS p\r\n"
				+ "LEFT JOIN ProductImages AS p1\r\n"
				+ "ON p._id = p1._id\r\n"
				+ "LEFT JOIN ProductSize AS p2\r\n"
				+ "ON p._id = p2._id";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Product(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getInt(5),
						rs.getInt(6),
						rs.getString(7),
						rs.getInt(8),
						rs.getString(9),
						rs.getString(10),
						rs.getInt(11)
						));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}
	
	public List<Order> getAllOrder(){
		List<Order> listo = new ArrayList<>();
		String query="select *\r\n"
				+ "from [Order]";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				listo.add(new Order(
						rs.getInt(1),
						rs.getInt(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getInt(5),
						rs.getString(6),
						rs.getString(7),
						rs.getString(8),
						rs.getInt(9),
						rs.getInt(10),
						rs.getInt(11),
						rs.getInt(12),
						rs.getInt(13),
						rs.getString(14)
						));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listo;
	}
	
	public List<Delivery> getAllDelivery(){
		List<Delivery> listd = new ArrayList<>();
		String query="select *"
				+ "from Delivery";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				listd.add(new Delivery(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getInt(5)
						));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listd;
	}
	
	public List<User> getAllUser(){
		List<User> listu = new ArrayList<>();
		String query="select *\r\n"
				+ "from [User]";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				listu.add(new User(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getInt(7),
						rs.getInt(8),
						rs.getString(9),
						rs.getString(10),
						rs.getString(11),
						rs.getString(12),
						rs.getString(13),
						rs.getInt(14),
						rs.getInt(15),
						rs.getString(16)
						));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listu;
	}
	
	public Product getProductByID(int id){
		String query="SELECT p._id, p.name, p.description, p.categoryId, p.storeId, p.rating, p.createdAt, p.price, p1.Url_image, p2.size, p2.quantity\r\n"
				+ "FROM Product AS p\r\n"
				+ "LEFT JOIN ProductImages AS p1\r\n"
				+ "ON p._id = p1._id\r\n"
				+ "LEFT JOIN ProductSize AS p2\r\n"
				+ "ON p._id = p2._id Where p._id=?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				return new Product(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getInt(5),
						rs.getInt(6),
						rs.getString(7),
						rs.getInt(8),
						rs.getString(9),
						rs.getString(10),
						rs.getInt(11)
						);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
	public User getNguoidungByID(int id){
		String query="select * from [User] where _id = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				return new User(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getInt(7),
						rs.getInt(8),
						rs.getString(9),
						rs.getString(10),
						rs.getString(11),
						rs.getString(12),
						rs.getString(13),
						rs.getInt(14),
						rs.getInt(15),
						rs.getString(16)
						);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
	public Category getCategoryByID(int id){
		String query="select _id, name, createdAt from Category Where _id=?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				return new Category(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3)
						);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
	public List<Doanhthu> getAllDoanhthu(){
		List<Doanhthu> listd = new ArrayList<>();
		String query="SELECT storeId,\r\n"
				+ "amountFromUser, \r\n"
				+ "amountFromStore, \r\n"
				+ "amountFromUser - amountFromStore AS 'amountToStore'\r\n"
				+ "FROM [Order]";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				listd.add(new Doanhthu(
						rs.getInt(1),
						rs.getInt(2),
						rs.getInt(3),
						rs.getInt(4)
						));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listd;
	}
	
	public List<Doanhthu1> getAllDoanhthu1(){
		List<Doanhthu1> listd = new ArrayList<>();
		String query="SELECT SUM(amountToGD)\r\n"
				+ "FROM [Order]";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				listd.add(new Doanhthu1(
						rs.getInt(1)
						));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listd;
	}
	
	public List<Doanhthu2> getAllDoanhthu2(){
		List<Doanhthu2> listd = new ArrayList<>();
		String query="SELECT SUM(amountToStore)\r\n"
				+ "FROM [Order]";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				listd.add(new Doanhthu2(
						rs.getInt(1)
						));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listd;
	}
	
	public Delivery getDeliveryByID(int id){
		String query="select _id, name, description, price, EstimatedDeliveryDays from Delivery where _id=?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				return new Delivery(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getInt(5)
						);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
	public Order getOrderByID(int id){
		String query="select _id, userId, deliveryId, shippingDate, storeId, [address], phone, [status], \r\n"
				+ "isPaidBefore, amountFromUser, amountFromStore, amountToStore, amountToGD, createdAt \r\n"
				+ "from [Order] where _id = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				return new Order(
						rs.getInt(1),
						rs.getInt(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getInt(5),
						rs.getString(6),
						rs.getString(7),
						rs.getString(8),
						rs.getInt(9),
						rs.getInt(10),
						rs.getInt(11),
						rs.getInt(12),
						rs.getInt(13),
						rs.getString(14)
						);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
	public List<Category> getAllCategory(){
		List<Category> listC = new ArrayList<>();
		String query="select _id, name, createdAt from Category";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				listC.add(new Category(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3)
						));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listC;
	}
	
	public List<Store> getAllStore(){
		List<Store> listS = new ArrayList<>();
		String query="select _id, name from Store";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				listS.add(new Store(
						rs.getInt(1),
						rs.getString(2)
						));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listS;
	}
	
	public void insertProduct(String name, String description, String isactive, String isselling,
			String categoryid, String storeid, String rating,
			String create, String price) {
		String query = "insert into Product (name, description, isActive, isSelling, categoryId, storeId, rating, createdAt, price)\r\n"
				+ "values (?,?,?,?,?,?,?,?,?)";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, description);
			ps.setString(3, isactive);
			ps.setString(4, isselling);
			ps.setString(5, categoryid);
			ps.setString(6, storeid);
			ps.setString(7, rating);
			ps.setString(8, create);
			ps.setString(9, price);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void insertProductImage(String image, String productidimg) {
		String query = "insert into ProductImages (Url_image, productId)\r\n"
				+ "values (?,?)";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, image);
			ps.setString(2, productidimg);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void insertProductSize(String size, String quantity, String productidsize) {
		String query = "insert into ProductSize (size, quantity, productId)\r\n"
				+ "values (?,?,?)";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, size);
			ps.setString(2, quantity);
			ps.setString(3, productidsize);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void insertCategory(String name, String create) {
		String query = "insert into Category (name, createdAt)\r\n"
				+ "values (?, ?)";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, create);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void insertVanchuyen(String name, String description, String price, String estimate) {
		String query = "insert into Delivery (name, description, price, EstimatedDeliveryDays)\r\n"
				+ "values (?, ?, ?, ?)";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, description);
			ps.setString(3, price);
			ps.setString(4, estimate);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void insertNguoidung(String fname, String lname, String cardid, String email,
			String phone, String eactive, String pactive, String username, String password, String role
			,String address ,  String avatar, String point, String level, String create) {
		String query = "insert into [User] (firstname, lastname, id_card, email, phone, isEmalActive, isPhoneActive, username, password, role, address, avatar, point, userlevelId, createdAt)\r\n"
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, cardid);
			ps.setString(4, email);
			ps.setString(5, phone);
			ps.setString(6, eactive);
			ps.setString(7, pactive);
			ps.setString(8, username);
			ps.setString(9, password);
			ps.setString(10, role);
			ps.setString(11, address);
			ps.setString(12, avatar);
			ps.setString(13, point);
			ps.setString(14, level);
			ps.setString(15, create);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void insertDonhang(String userid, String deliveryid, String storeid, String address,
			String phone, String status, String paidbefore, String afuser, String afstore, String atstore
			,String atgd) {
		String query = "insert into [Order] (userId, deliveryId, storeId, address, phone, status, isPaidBefore, "
				+ "amountFromUser, amountFromStore, amountToStore, amountToGD)\r\n"
				+ "values (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, userid);
			ps.setString(2, deliveryid);
			ps.setString(3, storeid);
			ps.setString(4, address);
			ps.setString(5, phone);
			ps.setString(6, status);
			ps.setString(7, paidbefore);
			ps.setString(8, afuser);
			ps.setString(9, afstore);
			ps.setString(10, atstore);
			ps.setString(11, atgd);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void editProduct(String name, String categoryid, 
			String storeid, String rating, String create , String price, String pid) {
		String query = "update Product\r\n"
				+ "set [name] = ?,\r\n"
				+ "categoryId = ?,\r\n"
				+ "storeId = ?,\r\n"
				+ "rating = ?,\r\n"
				+ "[createdAt] = ?,\r\n"
				+ "price = ?\r\n"
				+ "where _id = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, categoryid);
			ps.setString(3, storeid);
			ps.setString(4, rating);
			ps.setString(5, create);
			ps.setString(6, price);
			ps.setString(7, pid);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void editDonhang(String userid, String deliveryid, 
			String shippingdate, String storeid, String address , String phone, String status
			,String paidbefore, String afu, String afs, String ats, String atg, String create, String did) {
		String query = "update [Order]\r\n"
				+ "set userId = ?,\r\n"
				+ "deliveryId = ?,\r\n"
				+ "shippingDate = ?,\r\n"
				+ "storeId = ?,\r\n"
				+ "address = ?,\r\n"
				+ "phone = ?,\r\n"
				+ "status = ?,\r\n"
				+ "isPaidBefore = ?,\r\n"
				+ "amountFromUser = ?,\r\n"
				+ "amountFromStore = ?,\r\n"
				+ "amountToStore = ?,\r\n"
				+ "amountToGD = ?,\r\n"
				+ "createdAt = ?\r\n"
				+ "where _id = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, userid);
			ps.setString(2, deliveryid);
			ps.setString(3, shippingdate);
			ps.setString(4, storeid);
			ps.setString(5, address);
			ps.setString(6, phone);
			ps.setString(7, status);
			ps.setString(8, paidbefore);
			ps.setString(9, afu);
			ps.setString(10, afs);
			ps.setString(11, ats);
			ps.setString(12, atg);
			ps.setString(13, create);
			ps.setString(14, did);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void editProductImage(String image,String pid) {
		String query = "update ProductImages\r\n"
				+ "set Url_image = ?\r\n"
				+ "where productId = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, image);
			ps.setString(2, pid);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void editProductSize(String size, String quantity, String pid) {
		String query = "update ProductSize\r\n"
				+ "set	size = ?,\r\n"
				+ "quantity = ?\r\n"
				+ "where productId = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, size);
			ps.setString(2, quantity);
			ps.setString(3, pid);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void editNguoidung(String fname,String lname,String idcard,String email,String phone
			,String emailactive,String phoneactive,String username,String password,String role,String address
			,String avatar,String point,String level,String create,String id) {
		String query = "update [User]\r\n"
				+ "set firstname = ?,\r\n"
				+ "lastname = ?,\r\n"
				+ "id_card = ?,\r\n"
				+ "email = ?,\r\n"
				+ "phone = ?,\r\n"
				+ "isEmalActive = ?,\r\n"
				+ "isPhoneActive = ?,\r\n"
				+ "username = ?,\r\n"
				+ "password = ?,\r\n"
				+ "role = ?,\r\n"
				+ "address = ?,\r\n"
				+ "avatar = ?,\r\n"
				+ "point = ?,\r\n"
				+ "userlevelId = ?,\r\n"
				+ "createdAt = ?\r\n"
				+ "where _id = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, idcard);
			ps.setString(4, email);
			ps.setString(5, phone);
			ps.setString(6, emailactive);
			ps.setString(7, phoneactive);
			ps.setString(8, username);
			ps.setString(9, password);
			ps.setString(10, role);
			ps.setString(11, address);
			ps.setString(12, avatar);
			ps.setString(13, point);
			ps.setString(14, level);
			ps.setString(15, create);
			ps.setString(16, id);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void editCategory(String name, String create, String cid) {
		String query = "update category \r\n"
				+ "set [name] = ?,\r\n"
				+ "[createdAt] = ?\r\n"
				+ "where _id = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, create);
			ps.setString(3, cid);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void editDelivery(String name, String description, String price, String estimate, String vid) {
		String query = "update delivery\r\n"
				+ "set [name] = ?,\r\n"
				+ "[description] = ?,\r\n"
				+ "[price] = ?,\r\n"
				+ "[EstimatedDeliveryDays] = ?\r\n"
				+ "where _id = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, description);
			ps.setString(3, price);
			ps.setString(4, estimate);
			ps.setString(5, vid);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void deleteProduct(int pid) {
		String query = "delete from Product where _id = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setInt(1, pid);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void deleteDonhang(int did) {
		String query = "delete from [Order] where _id = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setInt(1, did);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void deleteNguoidung(int nid) {
		String query = "delete from [User] where _id = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setInt(1, nid);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void deleteCategory(int cid) {
		String query = "delete from Category where _id = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setInt(1, cid);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void deleteVanchuyen(int did) {
		String query = "delete from Delivery where _id = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setInt(1, did);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public Account login(String user, String pass) {
		String query = "select _id, username, password, role from [User] \r\n"
				+ "where username = ?\r\n"
				+ "and password = ?";
		try {
			conn = new DBConnection().getConnectionW();
			ps = conn.prepareStatement(query);
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while(rs.next()) {
				return new Account(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4)	
						);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		List<Doanhthu> list = dao.getAllDoanhthu();
		for(Doanhthu o : list) {
			System.out.println(o);
		}
	}
	
}
