package DAO.Imp;

import DAO.IProductSizeDAOTrung;
import Entity.ProductSizeEntity;
import Connection.DBConnectionTrung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductSizeDAOImpTrung implements IProductSizeDAOTrung {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    @Override
    public ProductSizeEntity createProductSize(ProductSizeEntity productSize) {
        String sql = "INSERT INTO ProductSize (size, quantity, productId) VALUES (?,?,?)";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, productSize.getSize());
            preparedStatement.setInt(2, productSize.getQuantity());
            preparedStatement.setInt(3, productSize.getProductId());
            preparedStatement.executeUpdate();
            return productSize;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ProductSizeEntity updateProductSize(ProductSizeEntity productSize) {
        String sql = "UPDATE ProductSize SET size = ?, quantity = ?, productId = ? WHERE _id = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, productSize.getSize());
            preparedStatement.setInt(2, productSize.getQuantity());
            preparedStatement.setInt(3, productSize.getProductId());
            preparedStatement.setInt(4, productSize.get_id());
            preparedStatement.executeUpdate();
            return productSize;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ProductSizeEntity> getAllProductSize() {
        String sql = "SELECT * FROM ProductSize";
        try {
            List<ProductSizeEntity> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ProductSizeEntity productSize = new ProductSizeEntity();
                productSize.set_id(resultSet.getInt("_id"));
                productSize.setSize(resultSet.getString("size"));
                productSize.setQuantity(resultSet.getInt("quantity"));
                productSize.setProductId(resultSet.getInt("productId"));
                list.add(productSize);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int totalQuantity(int productId) {
        String sql = "SELECT SUM(quantity) as stock FROM ProductSize WHERE productId = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, productId);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("stock");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<ProductSizeEntity> getProductSizeByProductId(int productId) {
        String sql = "SELECT * FROM ProductSize WHERE productId = ?";
        try {
            List<ProductSizeEntity> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, productId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ProductSizeEntity productSize = new ProductSizeEntity();
                productSize.set_id(resultSet.getInt("_id"));
                productSize.setSize(resultSet.getString("size"));
                productSize.setQuantity(resultSet.getInt("quantity"));
                productSize.setProductId(resultSet.getInt("productId"));
                list.add(productSize);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Integer> get_IdByProductId(int id) {
        String sql = "SELECT _id FROM ProductSize WHERE productId = ?";
        try {
            List<Integer> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(resultSet.getInt("_id"));
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
