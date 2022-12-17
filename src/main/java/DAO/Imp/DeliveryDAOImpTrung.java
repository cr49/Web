package DAO.Imp;

import DAO.IDeliveryDAOTrung;
import Entity.DeliveryEntity;
import Connection.DBConnectionTrung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeliveryDAOImpTrung implements IDeliveryDAOTrung {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    @Override
    public DeliveryEntity getDeliveryById(int _id) {
        String sql = "select * from Delivery where _id = ?";
        try{
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, _id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                DeliveryEntity delivery = new DeliveryEntity();
                delivery.set_id(resultSet.getInt("_id"));
                delivery.setName(resultSet.getString("name"));
                delivery.setPrice(resultSet.getInt("price"));
                return delivery;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
