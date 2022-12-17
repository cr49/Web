package DAO.Imp;

import DAO.IProductImagesDAOTrung;
import Entity.ProductImagesEntity;
import Connection.DBConnectionTrung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductImagesDAOImpTrung implements IProductImagesDAOTrung {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    @Override
    public ProductImagesEntity createProductImages(ProductImagesEntity productImages) {
        String sql = "INSERT INTO ProductImages (Url_image, productId) VALUES (?,?)";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, productImages.getUrl_image());
            preparedStatement.setInt(2, productImages.getProductId());
            preparedStatement.executeUpdate();
            return productImages;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ProductImagesEntity updateProductImages(ProductImagesEntity productImages) {
        String sql = "UPDATE ProductImages SET Url_image = ?, productId = ? WHERE _id = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, productImages.getUrl_image());
            preparedStatement.setInt(2, productImages.getProductId());
            preparedStatement.setInt(3, productImages.get_id());
            preparedStatement.executeUpdate();
            return productImages;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public List<ProductImagesEntity> getAllProductImages() {
        String sql = "SELECT * FROM ProductImages";
        try {
            List<ProductImagesEntity> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ProductImagesEntity productImages = new ProductImagesEntity();
                productImages.set_id(resultSet.getInt("_id"));
                productImages.setUrl_image(resultSet.getString("Url_image"));
                productImages.setProductId(resultSet.getInt("productId"));
                list.add(productImages);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ProductImagesEntity> getProductImagesById(int id) {
        String sql = "SELECT * FROM ProductImages WHERE productId = ?";
        try {
            List<ProductImagesEntity> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ProductImagesEntity productImages = new ProductImagesEntity();
                productImages.set_id(resultSet.getInt("_id"));
                productImages.setUrl_image(resultSet.getString("Url_image"));
                productImages.setProductId(resultSet.getInt("productId"));
                list.add(productImages);
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
        String sql = "SELECT _id FROM ProductImages WHERE productId = ?";
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
