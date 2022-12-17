package DAO.Imp;

import DAO.IOrderItemDAOTrung;
import Entity.OrderItemEntity;
import Connection.DBConnectionTrung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderItemDAOImpTrung implements IOrderItemDAOTrung {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    @Override
    public List<OrderItemEntity> getOrderItemByOrderId(int id) {
        String sql = "SELECT * FROM OrderItem WHERE orderId = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            List<OrderItemEntity> orderItemEntities = new ArrayList<>();
            while (resultSet.next()) {
                OrderItemEntity orderItemEntity = new OrderItemEntity();
                orderItemEntity.set_id(resultSet.getInt("_id"));
                orderItemEntity.setOrderId(resultSet.getInt("orderId"));
                orderItemEntity.setProductId(resultSet.getInt("productId"));
                orderItemEntity.setSize(resultSet.getString("size"));
                orderItemEntity.setCategoryId(resultSet.getInt("categoryId"));
                orderItemEntity.setContent(resultSet.getString("content"));
                orderItemEntity.setCount(resultSet.getInt("count"));
                orderItemEntity.setCreatedAt(resultSet.getDate("createdAt"));
                orderItemEntities.add(orderItemEntity);
            }
            return orderItemEntities;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Integer> listProductIdGroupBy() {
        String sql = "select productId from OrderItem\n" +
                "\tgroup by productId";
        try{
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            List<Integer> list = new ArrayList<>();
            while (resultSet.next()){
                list.add(resultSet.getInt("productId"));
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
