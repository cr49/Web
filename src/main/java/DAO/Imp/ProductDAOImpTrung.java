package DAO.Imp;

import DAO.IProductDAOTrung;
import Entity.BestSellingProductsEntityTrung;
import Entity.ProductEntity;
import Connection.DBConnectionTrung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpTrung implements IProductDAOTrung {

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    @Override
    public ProductEntity createProduct(ProductEntity product) {
        //name, description, isActive, isSelling, price
        //categoryId (choose theo name)
        //storeId: session
        String sql = "INSERT INTO product (name, description, isActive, isSelling, price, categoryId, storeId) VALUES (?,?,?,?,?,?,?)";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setBoolean(3, product.isActive());
            preparedStatement.setBoolean(4, product.isSelling());
            preparedStatement.setDouble(5, product.getPrice());
            preparedStatement.setInt(6, product.getCategoryId());
            preparedStatement.setInt(7, product.getStoreId());
            preparedStatement.executeUpdate();
            return product;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ProductEntity getProductById(int _id) {
        String sql = "SELECT * FROM product WHERE _id = ?";
        try {
            ProductEntity product = new ProductEntity();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, _id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                product.set_id(resultSet.getInt("_id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setSold(resultSet.getInt("sold"));
                product.setActive(resultSet.getBoolean("isActive"));
                product.setSelling(resultSet.getBoolean("isSelling"));
                product.setPrice(resultSet.getInt("price"));
                product.setCategoryId(resultSet.getInt("categoryId"));
                product.setStoreId(resultSet.getInt("storeId"));
                product.setRating(resultSet.getDouble("rating"));
            }
            return product;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ProductEntity updateProduct(ProductEntity product) {
        String sql = "UPDATE product SET name = ?, description = ?, isActive = ?, isSelling = ?, price = ?, categoryId = ?, storeId = ? WHERE _id = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setBoolean(3, product.isActive());
            preparedStatement.setBoolean(4, product.isSelling());
            preparedStatement.setDouble(5, product.getPrice());
            preparedStatement.setInt(6, product.getCategoryId());
            preparedStatement.setInt(7, product.getStoreId());
            preparedStatement.setInt(8, product.get_id());
            preparedStatement.executeUpdate();
            return product;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int getTotalProductById(int id) {
        return 0;
    }

    @Override
    public List<ProductEntity> getProductByPage(int id, int page, int pagesize) {
        return null;
    }

    @Override
    public List<ProductEntity> getAllProductByStoreId(int id) {
        String sql = "SELECT * FROM product WHERE storeId = ?";
        try {
            List<ProductEntity> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ProductEntity product = new ProductEntity();
                product.set_id(resultSet.getInt("_id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setSold(resultSet.getInt("sold"));
                product.setActive(resultSet.getBoolean("isActive"));
                product.setSelling(resultSet.getBoolean("isSelling"));
                product.setPrice(resultSet.getInt("price"));
                product.setCategoryId(resultSet.getInt("categoryId"));
                product.setStoreId(resultSet.getInt("storeId"));
                product.setRating(resultSet.getDouble("rating"));
                list.add(product);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int getlastId() {
        String sql = "SELECT MAX(_id) FROM product";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public ProductEntity deleteProduct(int _id) {
        String sql = "DELETE FROM product WHERE _id = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, _id);
            preparedStatement.executeUpdate();
            return null;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ProductEntity> searchProductByName(String name, int storeId) {
        String sql = "SELECT * FROM product WHERE name LIKE ? AND storeId = ?";
        try {
            List<ProductEntity> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + name + "%");
            preparedStatement.setInt(2, storeId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ProductEntity product = new ProductEntity();
                product.set_id(resultSet.getInt("_id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setSold(resultSet.getInt("sold"));
                product.setActive(resultSet.getBoolean("isActive"));
                product.setSelling(resultSet.getBoolean("isSelling"));
                product.setPrice(resultSet.getInt("price"));
                product.setCategoryId(resultSet.getInt("categoryId"));
                product.setStoreId(resultSet.getInt("storeId"));
                product.setRating(resultSet.getDouble("rating"));
                list.add(product);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<BestSellingProductsEntityTrung> getBestSellingProductsByStoreId(int id) {
        String sql="select p._id, p.name, SUM( oi.count) AS quantity,SUM( o.amountToStore) AS total\n" +
                "from OrderItem as oi\n" +
                "inner join [Order] as o\n" +
                "on o._id = oi.orderId and o.storeId = ? and o.status='delivered'\n" +
                "inner join Product as p\n" +
                "on oi.productId = p._id\n" +
                "group by p._id, p.name\n" +
                "order by total DESC";
        try {
            List<BestSellingProductsEntityTrung> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                BestSellingProductsEntityTrung product = new BestSellingProductsEntityTrung();
                product.set_id(resultSet.getInt("_id"));
                product.setName(resultSet.getString("name"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setTotal(resultSet.getInt("total"));
                list.add(product);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<BestSellingProductsEntityTrung> getBestSellingProductsByStoreIdAndToday(int id) {
        String sql = "select p._id, p.name, SUM( oi.count) AS quantity,SUM( o.amountToStore) AS total\n" +
                "from OrderItem as oi\n" +
                "inner join [Order] as o\n" +
                "on o._id = oi.orderId and o.storeId = ? and o.status='delivered' and o.createdAt>=DATEADD(DAY,-1,GETDATE())\n" +
                "inner join Product as p\n" +
                "on oi.productId = p._id\n" +
                "group by p._id, p.name\n" +
                "order by total DESC";
        try {
            List<BestSellingProductsEntityTrung> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                BestSellingProductsEntityTrung product = new BestSellingProductsEntityTrung();
                product.set_id(resultSet.getInt("_id"));
                product.setName(resultSet.getString("name"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setTotal(resultSet.getInt("total"));
                list.add(product);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<BestSellingProductsEntityTrung> getBestSellingProductsByStoreIdAndYesterday(int id) {
        String sql = "select p._id, p.name, SUM( oi.count) AS quantity,SUM( o.amountToStore) AS total\n" +
                "from OrderItem as oi\n" +
                "inner join [Order] as o\n" +
                "on o._id = oi.orderId and o.storeId = ? and o.status='delivered' and o.createdAt>=DATEADD(DAY,-2,GETDATE()) and o.createdAt<DATEADD(DAY,-1,GETDATE())\n" +
                "inner join Product as p\n" +
                "on oi.productId = p._id\n" +
                "group by p._id, p.name\n" +
                "order by total DESC";
        try {
            List<BestSellingProductsEntityTrung> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                BestSellingProductsEntityTrung product = new BestSellingProductsEntityTrung();
                product.set_id(resultSet.getInt("_id"));
                product.setName(resultSet.getString("name"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setTotal(resultSet.getInt("total"));
                list.add(product);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<BestSellingProductsEntityTrung> getBestSellingProductsByStoreIdAndThisWeek(int id) {
        String sql = "select p._id, p.name, SUM( oi.count) AS quantity,SUM( o.amountToStore) AS total\n" +
                "from OrderItem as oi\n" +
                "inner join [Order] as o\n" +
                "on o._id = oi.orderId and o.storeId = ? and o.status='delivered' and o.createdAt>=DATEADD(DAY,-7,GETDATE())\n" +
                "inner join Product as p\n" +
                "on oi.productId = p._id\n" +
                "group by p._id, p.name\n" +
                "order by total DESC";
        try {
            List<BestSellingProductsEntityTrung> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                BestSellingProductsEntityTrung product = new BestSellingProductsEntityTrung();
                product.set_id(resultSet.getInt("_id"));
                product.setName(resultSet.getString("name"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setTotal(resultSet.getInt("total"));
                list.add(product);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<BestSellingProductsEntityTrung> getBestSellingProductsByStoreIdAndThisMonth(int id) {
        String sql = "select p._id, p.name, SUM( oi.count) AS quantity,SUM( o.amountToStore) AS total\n" +
                "from OrderItem as oi\n" +
                "inner join [Order] as o\n" +
                "on o._id = oi.orderId and o.storeId = ? and o.status='delivered' and o.createdAt <= DATEADD(month, ((YEAR(GETDATE()) - 1900) * 12) + MONTH(GETDATE()), -1) and o.createdAt >= DATEADD(month, DATEDIFF(month, 0, GETDATE()), 0) \n" +
                "inner join Product as p\n" +
                "on oi.productId = p._id\n" +
                "group by p._id, p.name\n" +
                "order by total DESC";
        try {
            List<BestSellingProductsEntityTrung> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                BestSellingProductsEntityTrung product = new BestSellingProductsEntityTrung();
                product.set_id(resultSet.getInt("_id"));
                product.setName(resultSet.getString("name"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setTotal(resultSet.getInt("total"));
                list.add(product);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<BestSellingProductsEntityTrung> getBestSellingProductsByStoreIdAndThisYear(int id) {
        String sql = "select p._id, p.name, SUM( oi.count) AS quantity,SUM( o.amountToStore) AS total\n" +
                "from OrderItem as oi\n" +
                "inner join [Order] as o\n" +
                "on o._id = oi.orderId and o.storeId = ? and o.status='delivered' and o.createdAt <= DATEADD(yy, DATEDIFF(yy, 0, GETDATE()) + 1, -1) and o.createdAt >= DATEADD(month, DATEDIFF(month, 0, GETDATE()), 0) \n" +
                "inner join Product as p\n" +
                "on oi.productId = p._id\n" +
                "group by p._id, p.name\n" +
                "order by total DESC";
        try {
            List<BestSellingProductsEntityTrung> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                BestSellingProductsEntityTrung product = new BestSellingProductsEntityTrung();
                product.set_id(resultSet.getInt("_id"));
                product.setName(resultSet.getString("name"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setTotal(resultSet.getInt("total"));
                list.add(product);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
