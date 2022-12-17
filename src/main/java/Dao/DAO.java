package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBConnection;
import Entity.*;

public class DAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void Insert_User(String firstname, String lastname, String id_card, String email,
                            String phone, String username, String password, String role,
                            String address, int userlevelId) {
        String query = "INSERT INTO dbo.[User](firstname, lastname,id_card, email,"
                + "phone,username,[password], [role],\r\n"
                + "	[address], userlevelId) \r\n"
                + "	 VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, id_card);
            ps.setString(4, email);
            ps.setString(5, phone);
            ps.setString(6, username);
            ps.setString(7, password);
            ps.setString(8, role);
            ps.setString(9, address);
            ps.setInt(10, userlevelId);
            ps.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public UserEntity GetUserLogin(String username, String password, String role) {
        String query = "select * from [User] where username=? and [password]=? and [role]=?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, role);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new UserEntity(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getBoolean(7),
                        rs.getBoolean(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getInt(14),
                        rs.getInt(15),
                        rs.getDate(16)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public UserEntity GetUserbyID(int _id) {
        String query = "select * from [User] where _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, _id);

            rs = ps.executeQuery();
            while (rs.next()) {
                return new UserEntity(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getBoolean(7),
                        rs.getBoolean(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getInt(14),
                        rs.getInt(15),
                        rs.getDate(16)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void UpdateUserInf(int _id, String firstname, String lastname, String id_card, String address, String phone, String email) {
        String query = "UPDATE [User]\n" +
                "SET firstname = ?,\n" +
                "\tlastname = ?,\n" +
                "\tid_card = ?,\n" +
                "\t[address] = ?,\n" +
                "\tphone = ?,\n" +
                "\temail = ?\n" +
                "WHERE _id = ?;";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(7, _id);
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, id_card);
            ps.setString(4, address);
            ps.setString(5, phone);
            ps.setString(6, email);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void UpdatePassword(int _id, String newpassword) {
        String query = "UPDATE [User] \n" +
                "SET password = ?\n" +
                "WHERE _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(2, _id);
            ps.setString(1, newpassword);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void UpdateAvatar(int _id, String Avatar) {
        String query = "UPDATE [User]\n" +
                "SET avatar = ?\n" +
                "WHERE _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(2, _id);
            ps.setString(1, Avatar);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public boolean checkUsernameExist(String username, String role) {
        String query = "select * from [User] where username=? and [role]=?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, role);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean checkEmailExist(String email, String role) {
        String query = "select * from [User] wher`e email=? and [role]=?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, role);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean checkPhoneExist(String phone, String role) {
        String query = "select * from [User] where phone=? and [role]=?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, phone);
            ps.setString(2, role);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public boolean checkIdCardExist(String id_card, String role) {
        String query = "select * from [User] where id_card=? and [role]=?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id_card);
            ps.setString(2, role);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public List<ProductDisplay_Tu> Top8NewProduct() {
        List<ProductDisplay_Tu> list8P = new ArrayList<>();
        String query = "select top 8* from Product order by _id desc";
        String query3 = "select top 1* from ProductImages where productId =?"; // Lấy 1 ảnh của product

        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps3 = conn.prepareStatement(query3);
                ps3.setInt(1, rs.getInt(1));
                ResultSet rs3 = ps3.executeQuery();
                while (rs3.next()) {
                    list8P.add(new ProductDisplay_Tu(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getBoolean(5),
                            rs.getBoolean(6),
                            rs.getInt(7),
                            rs.getInt(8),
                            rs.getFloat(9),
                            rs.getDate(10),
                            rs.getInt(11),
                            rs3.getString(2)));
                }
            }
            return list8P;
        } catch (Exception e) {
        }
        return null;
    }

    public List<ProductDisplay_Tu> Top8BestSeller() {
        List<ProductDisplay_Tu> list8P = new ArrayList<>();
        String query = "select top 8* from Product order by sold desc";
        String query3 = "select top 1* from ProductImages where productId =?"; // Lấy 1 ảnh của product
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps3 = conn.prepareStatement(query3);
                ps3.setInt(1, rs.getInt(1));
                ResultSet rs3 = ps3.executeQuery();
                while (rs3.next()) {
                    list8P.add(new ProductDisplay_Tu(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getBoolean(5),
                            rs.getBoolean(6),
                            rs.getInt(7),
                            rs.getInt(8),
                            rs.getFloat(9),
                            rs.getDate(10),
                            rs.getInt(11),
                            rs3.getString(2)));
                }
            }
            return list8P;
        } catch (Exception e) {
        }
        return null;
    }

    public ProductEntity getProductById(int _id) {
        String query = "select * from Rooms where _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, _id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new ProductEntity(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getBoolean(5),
                        rs.getBoolean(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getFloat(9),
                        rs.getDate(10),
                        rs.getInt(11)
                );
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    public List<CategoryEntity> getAllCategory() {
        List<CategoryEntity> listCate = new ArrayList<>();
        String query = "select * from Category";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listCate.add(new CategoryEntity(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getBoolean(4),
                        rs.getDate(5)));
            }
            return listCate;
        } catch (Exception e) {
        }
        return null;
    }

    public List<ProductDisplay_Tu> pagingProduct(int index) {
        List<ProductDisplay_Tu> ListProduct = new ArrayList<>();
        String query = "select * from Product order by _id OFFSET ? ROW fetch next 9 rows only";
        String query3 = "select top 1* from ProductImages where productId =?"; // Lấy 1 ảnh của product
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * 9);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps3 = conn.prepareStatement(query3);
                ps3.setInt(1, rs.getInt(1));
                ResultSet rs3 = ps3.executeQuery();
                while (rs3.next()) {
                    ListProduct.add(new ProductDisplay_Tu(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getBoolean(5),
                            rs.getBoolean(6),
                            rs.getInt(7),
                            rs.getInt(8),
                            rs.getFloat(9),
                            rs.getDate(10),
                            rs.getInt(11),
                            rs3.getString(2)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListProduct;
    }

    public List<ProductDisplay_Tu> pagingProductByCid(int index, int Cid) {
        List<ProductDisplay_Tu> ListProduct = new ArrayList<>();
        String query = "select * from Product where categoryId= ? order by _id OFFSET ? ROW fetch next 9 rows only";
        String query3 = "select top 1* from ProductImages where productId =?"; // Lấy 1 ảnh của product
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(2, (index - 1) * 9);
            ps.setInt(1, Cid);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps3 = conn.prepareStatement(query3);
                ps3.setInt(1, rs.getInt(1));
                ResultSet rs3 = ps3.executeQuery();
                while (rs3.next()) {
                    ListProduct.add(new ProductDisplay_Tu(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getBoolean(5),
                            rs.getBoolean(6),
                            rs.getInt(7),
                            rs.getInt(8),
                            rs.getFloat(9),
                            rs.getDate(10),
                            rs.getInt(11),
                            rs3.getString(2)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListProduct;
    }

    public int countAllProducts() {
        int count = 0;
        String query = "SELECT COUNT(_id) AS NumberOfProducts FROM Product";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int countAllProductsByCid(int cid) {
        int count = 0;
        String query = "SELECT COUNT(_id) AS NumberOfProducts FROM Product where categoryId = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<ProductDisplay_Tu> pagingSortedProduct(int index, boolean typeSort) {
        List<ProductDisplay_Tu> ListProduct = new ArrayList<>();
        String query;
        // True : Tang
        // False: Giam
        if (typeSort) {
            query = "select * from Product order by price asc OFFSET ? ROW fetch next 9 rows only";
        } else {
            query = "select * from Product order by price desc OFFSET ? ROW fetch next 9 rows only";
        }

        String query2 = "select top 1* from ProductImages where productId =?"; // Lấy 1 ảnh của product
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * 9);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, rs.getInt(1));
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    ListProduct.add(new ProductDisplay_Tu(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getBoolean(5),
                            rs.getBoolean(6),
                            rs.getInt(7),
                            rs.getInt(8),
                            rs.getFloat(9),
                            rs.getDate(10),
                            rs.getInt(11),
                            rs2.getString(2)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListProduct;
    }

    public List<ProductDisplay_Tu> pagingSortedProductByCid(int index, boolean typeSort, int Cid) {
        List<ProductDisplay_Tu> ListProduct = new ArrayList<>();
        String query;
        // True : Tang
        // False: Giam
        if (typeSort) {
            query = "select * from Product where categoryId = ? order by price asc OFFSET ? ROW fetch next 9 rows only";
        } else {
            query = "select * from Product where categoryId = ? order by price desc OFFSET ? ROW fetch next 9 rows only";
        }

        String query2 = "select top 1* from ProductImages where productId =?"; // Lấy 1 ảnh của product
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(2, (index - 1) * 9);
            ps.setInt(1, Cid);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, rs.getInt(1));
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    ListProduct.add(new ProductDisplay_Tu(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getBoolean(5),
                            rs.getBoolean(6),
                            rs.getInt(7),
                            rs.getInt(8),
                            rs.getFloat(9),
                            rs.getDate(10),
                            rs.getInt(11),
                            rs2.getString(2)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListProduct;
    }

    public List<ProductDisplay_Tu> searchPagingSortedProductByName(int index, boolean typeSort, String search) {
        List<ProductDisplay_Tu> ListProduct = new ArrayList<>();
        String query;
        // True : Tang
        // False: Giam
        if (typeSort) {
            query = "select * from Product where [name] like ?  order by price asc OFFSET ? ROW fetch next 9 rows only";
        } else {
            query = "select * from Product where [name] like ?  order by price desc OFFSET ? ROW fetch next 9 rows only";
        }

        String query2 = "select top 1* from ProductImages where productId =?"; // Lấy 1 ảnh của product
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(2, (index - 1) * 9);
            ps.setString(1, "%" + search + "%");
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, rs.getInt(1));
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    ListProduct.add(new ProductDisplay_Tu(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getBoolean(5),
                            rs.getBoolean(6),
                            rs.getInt(7),
                            rs.getInt(8),
                            rs.getFloat(9),
                            rs.getDate(10),
                            rs.getInt(11),
                            rs2.getString(2)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListProduct;
    }

    public int countSearchedProductByName(String search) {
        int count = 0;
        String query = "select distinct COUNT(p._id) from Product p where [name] like ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + search + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<StoreDisplay_Tu> pagingStores(int index) {
        List<StoreDisplay_Tu> ListStores = new ArrayList<>();
        String query = "select * from Store order by _id OFFSET ? ROW fetch next 9 rows only";
        String query2 = "select * from [User] where _id = ?"; // Lấy giá thấp nhất của 1 product
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * 9);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, rs.getInt(4));
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    String nameOwner = rs2.getString(2) + " " + rs2.getString(3);
                    ListStores.add(new StoreDisplay_Tu(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getBoolean(5),
                            rs.getBoolean(6),
                            rs.getString(7),
                            rs.getInt(8),
                            rs.getFloat(9),
                            rs.getInt(10),
                            rs.getDate(11),
                            nameOwner
                    ));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListStores;
    }

    public List<StoreDisplay_Tu> searchPagingStoreByName(int index, String search) {
        List<StoreDisplay_Tu> ListStores = new ArrayList<>();

        String query = "select * from Store where Store.[name] like ? order by _id OFFSET ? ROW fetch next 9 rows only";


        String query2 = "select * from [User] where _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(2, (index - 1) * 9);
            ps.setString(1, "%" + search + "%");
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, rs.getInt(4));
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    String nameOwner = rs2.getString(2) + " " + rs2.getString(3);
                    ListStores.add(new StoreDisplay_Tu(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getBoolean(5),
                            rs.getBoolean(6),
                            rs.getString(7),
                            rs.getInt(8),
                            rs.getFloat(9),
                            rs.getInt(10),
                            rs.getDate(11),
                            nameOwner
                    ));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListStores;
    }

    public int countAllStores() {
        int count = 0;
        String query = "SELECT COUNT(_id) AS NumberOfProducts FROM Store";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int countSearchedStoreByName(String search) {
        int count = 0;
        String query = "select distinct COUNT(s._id) from Store s where s.[name] like ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + search + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<ProductDisplay_Tu> pagingSortedProductByStoreId(int index, boolean typeSort, int StoreId) {
        List<ProductDisplay_Tu> ListProduct = new ArrayList<>();
        String query;
        // True : Tang
        // False: Giam
        if (typeSort) {
            query = "select * from Product where storeId = ? order by price asc OFFSET ? ROW fetch next 9 rows only";
        } else {
            query = "select * from Product where storeId = ? order by price desc OFFSET ? ROW fetch next 9 rows only";
        }

        String query2 = "select top 1* from ProductImages where productId =?"; // Lấy 1 ảnh của product
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(2, (index - 1) * 9);
            ps.setInt(1, StoreId);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, rs.getInt(1));
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    ListProduct.add(new ProductDisplay_Tu(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getBoolean(5),
                            rs.getBoolean(6),
                            rs.getInt(7),
                            rs.getInt(8),
                            rs.getFloat(9),
                            rs.getDate(10),
                            rs.getInt(11),
                            rs2.getString(2)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListProduct;
    }

    public int countAllProductsByStoreId(int StoreId) {
        int count = 0;
        String query = "select distinct COUNT(p._id) from Product p where p.storeId = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, StoreId);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int countSearchedProductByStoreIdAndName(String search, int StoreId) {
        int count = 0;
        String query = "select distinct COUNT(p._id) from Product p where [name] like ? and p.storeId = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + search + "%");
            ps.setInt(2, StoreId);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<ProductDisplay_Tu> searchPagingSortedProductByStoreIdAndName(int index, boolean typeSort, String search, int StoreId) {
        List<ProductDisplay_Tu> ListProduct = new ArrayList<>();
        String query;
        // True : Tang
        // False: Giam
        if (typeSort) {
            query = "select * from Product where [name] like ? and storeId = ? order by price asc OFFSET ? ROW fetch next 9 rows only";
        } else {
            query = "select * from Product where [name] like ? and storeId = ? order by price desc OFFSET ? ROW fetch next 9 rows only";
        }

        String query2 = "select top 1* from ProductImages where productId =?"; // Lấy 1 ảnh của product
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(2, StoreId);
            ps.setInt(3, (index - 1) * 9);
            ps.setString(1, "%" + search + "%");
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, rs.getInt(1));
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    ListProduct.add(new ProductDisplay_Tu(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getBoolean(5),
                            rs.getBoolean(6),
                            rs.getInt(7),
                            rs.getInt(8),
                            rs.getFloat(9),
                            rs.getDate(10),
                            rs.getInt(11),
                            rs2.getString(2)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListProduct;
    }

    public StoreDisplay_Tu getStoreById(int StoreId) {
        String query = "select * from Store where _id = ?";
        String query2 = "select * from [User] where _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, StoreId);

            rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, rs.getInt(4));
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    String nameOwner = rs2.getString(2) + " " + rs2.getString(3);
                    return new StoreDisplay_Tu(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getBoolean(5),
                            rs.getBoolean(6),
                            rs.getString(7),
                            rs.getInt(8),
                            rs.getFloat(9),
                            rs.getInt(10),
                            rs.getDate(11),
                            nameOwner
                    );
                }
            }
        } catch (Exception e) {
        }
        return null;
    }

    public StoreLevelEntity getStoreLevelById(int storeLevelId) {
        String query = "select * from StoreLevel where _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, storeLevelId);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new StoreLevelEntity(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getFloat(5),
                        rs.getBoolean(4)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public int countAllProductsByStoreIdAndCid(int StoreId, int cid) {
        int count = 0;
        String query = "select distinct COUNT(p._id) from Product p where p.storeId = ? and categoryId = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, StoreId);
            ps.setInt(2, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<ProductDisplay_Tu> pagingSortedProductByStoreIdAndCid(int index, boolean typeSort, int StoreId, int Cid) {
        List<ProductDisplay_Tu> ListProduct = new ArrayList<>();
        String query;
        // True : Tang
        // False: Giam
        if (typeSort) {
            query = "select * from Product where storeId = ? and categoryId = ? order by price asc OFFSET ? ROW fetch next 9 rows only";
        } else {
            query = "select * from Product where storeId = ? and categoryId = ? order by price desc OFFSET ? ROW fetch next 9 rows only";
        }

        String query2 = "select top 1* from ProductImages where productId =?"; // Lấy 1 ảnh của product
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(3, (index - 1) * 9);
            ps.setInt(2, Cid);
            ps.setInt(1, StoreId);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, rs.getInt(1));
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    ListProduct.add(new ProductDisplay_Tu(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getBoolean(5),
                            rs.getBoolean(6),
                            rs.getInt(7),
                            rs.getInt(8),
                            rs.getFloat(9),
                            rs.getDate(10),
                            rs.getInt(11),
                            rs2.getString(2)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListProduct;
    }

    public List<ProductImagesEntity> getAllProductImagesByProductId(int ProductId) {
        List<ProductImagesEntity> listImgaes = new ArrayList<>();
        String query = "select * from ProductImages where productId = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, ProductId);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listImgaes.add(new ProductImagesEntity(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3)
                ));
            }
        } catch (Exception e) {
        }
        return listImgaes;
    }

    public List<ProductSizeEntity> getAllProductSizesByProductId(int ProductId) {
        List<ProductSizeEntity> listSizes = new ArrayList<>();
        String query = "select * from ProductSize where productId = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, ProductId);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listSizes.add(new ProductSizeEntity(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4)
                ));
            }
        } catch (Exception e) {
        }
        return listSizes;
    }

    public ProductEntity getProductByProductId(int ProductId) {
        String query = "select * from Product where _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, ProductId);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new ProductEntity(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getBoolean(5),
                        rs.getBoolean(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getFloat(9),
                        rs.getDate(10),
                        rs.getInt(11)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public int getCartIdExit(int userId, int storeId) {
        String query = "select * from Cart where userId = ? and storeId = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setInt(2, storeId);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<CartItemDisplay_Tu> getAllCartItem(int userId) {
        List<CartItemDisplay_Tu> listCartItem = new ArrayList<>();
        String query = "select * from Cart where userId = ?";
        String query2 = "select * from CartItem where cartId = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int cartId = rs.getInt(1);
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, cartId);
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    int productId = rs2.getInt(3);
                    ProductEntity product = getProductByProductId(productId);
                    List<ProductImagesEntity> listImages = getAllProductImagesByProductId(productId);
                    listCartItem.add(new CartItemDisplay_Tu(
                            rs2.getInt(1),
                            rs.getInt(1),
                            productId,
                            product.getName(),
                            listImages.get(0).getUrl_image(),
                            product.getPrice(),
                            rs2.getInt(4),
                            rs2.getString(5),
                            product.getPrice() * rs2.getInt(4)
                    ));
                }
            }
        } catch (Exception e) {
        }
        return listCartItem;
    }

    public List<CartItemDisplay_Tu> getAllCartItemByStoreId(int userId, int storeId) {
        List<CartItemDisplay_Tu> listCartItem = new ArrayList<>();
        String query = "select * from Cart where userId = ? and storeId = ?";
        String query2 = "select * from CartItem where cartId = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setInt(2, storeId);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int cartId = rs.getInt(1);
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, cartId);
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    int productId = rs2.getInt(3);
                    ProductEntity product = getProductByProductId(productId);
                    List<ProductImagesEntity> listImages = getAllProductImagesByProductId(productId);
                    listCartItem.add(new CartItemDisplay_Tu(
                            rs2.getInt(1),
                            rs.getInt(1),
                            productId,
                            product.getName(),
                            listImages.get(0).getUrl_image(),
                            product.getPrice(),
                            rs2.getInt(4),
                            rs2.getString(5),
                            product.getPrice() * rs2.getInt(4)
                    ));
                }
            }
        } catch (Exception e) {
        }
        return listCartItem;
    }

    public List<DeliveryEntity> getAllDelivery() {
        List<DeliveryEntity> listDelivery = new ArrayList<>();
        String query = "select * from Delivery";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listDelivery.add(new DeliveryEntity(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getBoolean(6)
                ));
            }
        } catch (Exception e) {
        }
        return listDelivery;
    }

    public DeliveryEntity getDeliveryById(int deliveryId) {
        String query = "select * from Delivery where _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, deliveryId);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new DeliveryEntity(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getBoolean(6)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void addToCart(int userId, int storeId) {
        String query = "insert into Cart (userId, storeId) values (?,?)";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setInt(2, storeId);
            ps.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void addToCartItem(int cartId, int productId, int count, String size) {
        String query = "insert into CartItem (cartId, productId, [count], size) \n" +
                "\t\tvalues (?,?,?,?)";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, cartId);
            ps.setInt(2, productId);
            ps.setInt(3, count);
            ps.setString(4, size);
            ps.executeUpdate();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void addCart(int userId, int productId, int count, String size) {
        String query = "select * from Product where _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, productId);
            rs = ps.executeQuery();
            while (rs.next()) {
                int storeId = rs.getInt(8);
                if (getCartIdExit(userId, storeId) == 0) {
                    addToCart(userId, storeId);
                }
                int cartId = getCartIdExit(userId, storeId);
                addToCartItem(cartId, productId, count, size);

            }
        } catch (Exception e) {
        }
    }

    public void deleteToCart(int CartId) {
        String query = "select * from CartItem where cartId = ?";
        String query2 = "delete from Cart where _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, CartId);
            rs = ps.executeQuery();
            while (!rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, CartId);
                ResultSet rs2 = ps2.executeQuery();
            }
        } catch (Exception e) {
        }
    }

    public void deleteCart(int CartItemId) {
        String query = "select * from CartItem where _id = ?";
        String query2 = "delete from CartItem where _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, CartItemId);
            rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, CartItemId);
                ps2.executeUpdate();
                deleteToCart(rs.getInt(2));
            }
        } catch (Exception e) {
        }
    }

    public void updateCart(int CartItemId, int count) {
        String query = "UPDATE CartItem\n" +
                "SET [count] = ?\n" +
                "WHERE _id = ?;";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(2, CartItemId);
            ps.setInt(1, count);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public void addToOrder(int userId, int deliveryId, String address, String phone, String content) {
        DAO dao = new DAO();
        String query = "select * from Cart where userId = ?";
        String query2 = "insert into [Order] (userId, deliveryId, storeId, [address], phone,\n" +
                "\t\tamountFromUser, amountFromStore, amountToStore,amountToGD) \n" +
                "\t\tvalues (?,?,?,?,?,?,?,?,?)";
        String query3 = "select Top 1* from [Order] order by _id desc";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            int x = 0;
            StoreDisplay_Tu Store;
            int storeLevelId;
            while (rs.next()) {
                int storeId = rs.getInt(3);
                storeLevelId = dao.getStoreById(storeId).getStoreLevelId();
                StoreLevelEntity StoreLevel = dao.getStoreLevelById(storeLevelId);
                float commissionPercent = StoreLevel.getCommissionPercent();
                List<CartItemDisplay_Tu> listCartItem = dao.getAllCartItemByStoreId(userId, storeId);
                int AmountperStore = 0;
                for (CartItemDisplay_Tu li : listCartItem
                ) {
                    AmountperStore += li.getTotal();
                }

                DeliveryEntity delivery = dao.getDeliveryById(deliveryId);
                int deliveryPrice = delivery.getPrice();

                int amountFromUser = AmountperStore + deliveryPrice; // số tiền User trả cho đơn hàng
                float FamountFromStore = AmountperStore * commissionPercent / 100;
                int amountFromStore = (int) FamountFromStore; // số tiền Store phải trả cho hệ thống
                int amountToStore = AmountperStore - amountFromStore; // số tiền Store được nhận
                int amountToGD = amountFromStore; // số tiền hệ thống được nhận
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, userId);
                ps2.setInt(2, deliveryId);
                ps2.setInt(3, storeId);
                ps2.setString(4, address);
                ps2.setString(5, phone);
                ps2.setInt(6, amountFromUser);
                ps2.setInt(7, amountFromStore);
                ps2.setInt(8, amountToStore);
                ps2.setInt(9, amountToGD);
                ps2.executeUpdate();
                PreparedStatement ps3 = conn.prepareStatement(query3);
                ResultSet rs3 = ps3.executeQuery();
                while (rs3.next()) {
                    int orderId = rs3.getInt(1);
                    for (CartItemDisplay_Tu li : listCartItem
                    ) {
                        int productId = li.getProductId();
                        int categoryId = dao.getProductByProductId(productId).getCategoryId();
                        int count = li.getCount();
                        String size = li.getSize();
                        dao.addToOrderItem(productId, orderId, categoryId, content, count, size);
                        dao.deleteCart(li.get_id());
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void addToOrderItem(int productId, int orderId, int categoryId, String content, int count, String size) {
        String query = "insert into OrderItem (productId, orderId, size, categoryId, content, [count]) \n" +
                "\t\tvalues( ?, ?, ?, ?, ?, ?)";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, productId);
            ps.setInt(2, orderId);
            ps.setString(3, size);
            ps.setInt(4, categoryId);
            ps.setString(5, content);
            ps.setInt(6, count);
            ps.executeUpdate();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public List<OrderDisplay_Tu> getAllOderByUserId(int userId) {
        String query = "select * from [Order] where userId = ? order by _id desc";
        String query2 = "select * from Store where _id = ?";
        String query3 = "select * from Delivery where _id = ?";
        List<OrderDisplay_Tu> listOrder = new ArrayList<>();
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                PreparedStatement ps3 = conn.prepareStatement(query3);
                ps2.setInt(1, rs.getInt(5));
                ps3.setInt(1, rs.getInt(3));
                ResultSet rs2 = ps2.executeQuery();
                ResultSet rs3 = ps3.executeQuery();
                while (rs2.next() && rs3.next()) {
                    listOrder.add(new OrderDisplay_Tu(
                            rs.getInt(1),
                            rs.getInt(2),
                            rs.getInt(3),
                            rs.getDate(4),
                            rs.getInt(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getString(8),
                            rs.getBoolean(9),
                            rs.getInt(10),
                            rs.getInt(11),
                            rs.getInt(12),
                            rs.getInt(13),
                            rs.getDate(14),
                            rs2.getString(2),
                            rs3.getString(2),
                            rs3.getInt(5)
                    ));
                }
            }
        } catch (Exception e) {
        }
        return listOrder;
    }

    public List<OrderItemDisplay_Tu> getAllOrderItem() {
        String query = "select * from OrderItem";
        String query2 = "select TOP 1* from Product p join ProductImages [pi] on p._id = [pi].productId\n" +
                "\t\t\t\t\t\tjoin Category c on p.categoryId = c._id\n" +
                "where p._id = ?";
        List<OrderItemDisplay_Tu> listOrderItem = new ArrayList<>();
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, rs.getInt(2));
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    listOrderItem.add(new OrderItemDisplay_Tu(
                            rs.getInt(1),
                            rs.getInt(2),
                            rs.getInt(3),
                            rs.getString(4),
                            rs.getInt(5),
                            rs.getString(6),
                            rs.getInt(7),
                            rs.getDate(8),
                            rs2.getString(2),
                            rs2.getString(13),
                            rs2.getInt(11),
                            rs2.getInt(11) * rs.getInt(7),
                            rs2.getString(16)
                    ));
                }
            }
        } catch (Exception e) {
        }
        return listOrderItem;
    }

    public void addFollowingProduct(int userId, int productId) {
        String query = "insert into UserFollowProduct(userId, productId) values (?,?)";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setInt(2, productId);
            ps.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void addFollowingStore(int userId, int storeId) {
        String query = "insert into UserFollowStore(userId, storeId) values (?,?)";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setInt(2, storeId);
            ps.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public List<StoreDisplay_Tu> pagingAllFollowingStores(int index, int userId) {
        List<StoreDisplay_Tu> ListStores = new ArrayList<>();
        String query3 = "select * from UserFollowStore where userId = ? order by _id OFFSET ? ROW fetch next 3 rows only";
        String query = "select * from Store where _id =?";
        String query2 = "select * from [User] where _id = ?";
        try {
            conn = new DBConnection().getConnection();

            PreparedStatement ps3 = conn.prepareStatement(query3);
            ps3.setInt(1, userId);
            ps3.setInt(2, (index - 1) * 3);
            ResultSet rs3 = ps3.executeQuery();
            while (rs3.next()) {
                ps = conn.prepareStatement(query);
                ps.setInt(1, rs3.getInt(3));
                rs = ps.executeQuery();
                while (rs.next()) {
                    PreparedStatement ps2 = conn.prepareStatement(query2);
                    ps2.setInt(1, rs.getInt(4));
                    ResultSet rs2 = ps2.executeQuery();
                    while (rs2.next()) {
                        String nameOwner = rs2.getString(2) + " " + rs2.getString(3);
                        ListStores.add(new StoreDisplay_Tu(rs.getInt(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getInt(4),
                                rs.getBoolean(5),
                                rs.getBoolean(6),
                                rs.getString(7),
                                rs.getInt(8),
                                rs.getFloat(9),
                                rs.getInt(10),
                                rs.getDate(11),
                                nameOwner
                        ));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListStores;
    }

    public int countAllFollowingStores(int userId) {
        int count = 0;
        String query = "SELECT COUNT(_id) FROM UserFollowStore where userId = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<ProductDisplay_Tu> pagingAllFollowingProducts(int index, int userId) {
        List<ProductDisplay_Tu> ListProduct = new ArrayList<>();
        String query2 = "select * from UserFollowProduct where userId = ? order by _id OFFSET ? ROW fetch next 6 rows only";
        String query = "select * from Product where _id = ?";
        String query3 = "select top 1* from ProductImages where productId =?"; // Lấy 1 ảnh của product
        try {
            conn = new DBConnection().getConnection();

            PreparedStatement ps2 = conn.prepareStatement(query2);
            ps2.setInt(1, userId);
            ps2.setInt(2, (index - 1) * 6);
            ResultSet rs2 = ps2.executeQuery();
            while (rs2.next()) {
                ps = conn.prepareStatement(query);
                ps.setInt(1, rs2.getInt(3));
                rs = ps.executeQuery();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    PreparedStatement ps3 = conn.prepareStatement(query3);
                    ps3.setInt(1, rs.getInt(1));
                    ResultSet rs3 = ps3.executeQuery();
                    while (rs3.next()) {
                        ListProduct.add(new ProductDisplay_Tu(rs.getInt(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getInt(4),
                                rs.getBoolean(5),
                                rs.getBoolean(6),
                                rs.getInt(7),
                                rs.getInt(8),
                                rs.getFloat(9),
                                rs.getDate(10),
                                rs.getInt(11),
                                rs3.getString(2)));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListProduct;
    }

    public int countAllFollowingProducts(int userId) {
        int count = 0;
        String query = "SELECT COUNT(_id) FROM UserFollowProduct where userId = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public void deleteFollowingStores(int storeId, int userId) {
        String query = "delete from UserFollowStore where userId = ? and storeId = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setInt(2, storeId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void deleteFollowingProducts(int productId, int userId) {
        String query = "delete from UserFollowProduct where userId = ? and productId = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setInt(2, productId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addReview(int userId, int productId, int storeId, int orderId, String content, int stars) {
        String query = "insert into Review(userId, productId, storeId, orderId, content, stars) \n" +
                "\t\t\tvalues (?, ?, ?, ?, ?, ?)";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setInt(2, productId);
            ps.setInt(3, storeId);
            ps.setInt(4, orderId);
            ps.setString(5, content);
            ps.setInt(6, stars);
            ps.executeUpdate();
            updateProductRating(productId);
            updateStoreRating(storeId);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public List<ReviewDisplay_Tu> getReviewByProductId(int productId){
        List<ReviewDisplay_Tu> listReview = new ArrayList<>();
        String query = "select * from Review where productId = ?";
        String query2 = "select * from [User] where _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, productId);
            rs = ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, rs.getInt(2));
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                        listReview.add(new ReviewDisplay_Tu(
                                rs.getInt(1),
                                rs.getInt(2),
                                rs.getInt(3),
                                rs.getInt(4),
                                rs.getInt(5),
                                rs.getString(6),
                                rs.getInt(7),
                                rs.getDate(8),
                                rs2.getString(2) + rs2.getString(3)
                        ));
                }
            }
        } catch (Exception e) {
        }
        return listReview;
    }

    public void updateProductRating(int productId){
        String query = "select AVG(Cast(stars as Float)) as Trungbinh from Review where productId = ?";
        String query2 = "UPDATE Product SET rating = ? WHERE _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, productId);
            rs = ps.executeQuery();
            while (rs.next()) {
                float newrating = rs.getFloat(1);
                System.out.println(newrating);
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setFloat(1, newrating);
                ps2.setInt(2, productId);
                ps2.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateStoreRating(int storeId){
        String query = "select AVG(Cast(stars as Float)) as Trungbinh from Review where storeId = ?";
        String query2 = "UPDATE Store SET rating = ? WHERE _id = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, storeId);
            rs = ps.executeQuery();
            while (rs.next()) {
                float newrating = rs.getFloat(1);
                System.out.println(newrating);
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setFloat(1, newrating);
                ps2.setInt(2, storeId);
                ps2.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        List<ProductDisplay_Tu> list = dao.Top8NewProduct();
//        StoreDisplay_Tu Store = dao.getStoreById(3);
        for (ProductDisplay_Tu i : list
        ) {
            System.out.println(i.get_id());
            System.out.println(i.getName());
            System.out.println(i.getPrice());
            System.out.println(i.getRating());
        }
//        String name = dao.getStoreById(1).getName();
//        dao.deleteFollowingProducts(6);
//        System.out.println(dao.countAllFollowingProducts(1));
    }
}
