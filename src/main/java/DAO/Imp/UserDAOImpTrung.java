package DAO.Imp;

import DAO.IUserDAOTrung;
import Entity.UserEntity;
import Connection.DBConnectionTrung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAOImpTrung implements IUserDAOTrung {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    @Override
    public UserEntity getUserById(int id) {
        String sql = "SELECT * FROM [user] WHERE _id = ?";
        try{
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                UserEntity user = new UserEntity();
                user.set_id(resultSet.getInt("_id"));
                user.setFirstname(resultSet.getString("firstname"));
                user.setLastname(resultSet.getString("lastname"));
                user.setPhone(resultSet.getString("phone"));
                user.setEmail(resultSet.getString("email"));
                user.setAddress(resultSet.getString("address"));
                return user;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
