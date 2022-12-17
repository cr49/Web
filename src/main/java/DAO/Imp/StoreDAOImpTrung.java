package DAO.Imp;


import DAO.IStoreDAOTrung;
import Entity.StoreEntityTrung;
import Entity.UserEntity;
import Connection.DBConnectionTrung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StoreDAOImpTrung implements IStoreDAOTrung {

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    @Override
    public List<StoreEntityTrung> getStoreByPage(int id, int page, int pagesize) {
        List<StoreEntityTrung> storeList = new ArrayList<>();
        try {
            connection = new DBConnectionTrung().getConnection();
            String sql = "SELECT * FROM store WHERE ownerId = ? order by _id OFFSET ? rows fetch next ? rows only";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setInt(2, (page - 1) * pagesize);
            preparedStatement.setInt(3, pagesize);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StoreEntityTrung store = new StoreEntityTrung();
                store.set_id(resultSet.getInt("_id"));
                store.setName(resultSet.getString("name"));
                store.setBio(resultSet.getString("bio"));
                store.setOwnerId(resultSet.getInt("ownerId"));
                store.setAvatar(resultSet.getString("avatar"));
                storeList.add(store);
            }
            return storeList;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public int getTotalStoreById(int id) {
        int total = 0;
        try {
            connection = new DBConnectionTrung().getConnection();
            String sql = "SELECT COUNT(*) FROM store WHERE ownerId = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                total = resultSet.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }

    @Override
    public StoreEntityTrung createStore(StoreEntityTrung store) {
        String sql = "INSERT INTO store (name,bio,ownerId,avatar) " +
                "VALUES (?,?,?,?)";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, store.getName());
            preparedStatement.setString(2, store.getBio());
            preparedStatement.setInt(3, store.getOwnerId());
            preparedStatement.setString(4, store.getAvatar());
            preparedStatement.executeUpdate();
            return store;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<StoreEntityTrung> getStoreById(int _id) {
        String sql = "SELECT * FROM store WHERE ownerId = ?";
        List<StoreEntityTrung> storeList = new ArrayList<>();
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, _id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StoreEntityTrung store = new StoreEntityTrung();
                store.set_id(resultSet.getInt("_id"));
                store.setName(resultSet.getString("name"));
                store.setBio(resultSet.getString("bio"));
                store.setOwnerId(resultSet.getInt("ownerId"));
                store.setAvatar(resultSet.getString("avatar"));
                store.setCreatedAt(resultSet.getDate("createdAt"));
                storeList.add(store);
                System.out.println(store);
            }

            return storeList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public StoreEntityTrung updateStore(StoreEntityTrung store) {
        return null;
    }

    @Override
    public UserEntity GetUserLogin(String username, String password, String role) {

        String query = "select * from [User] where username=? and [password]=? and [role]=?";
        try {
            connection =new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, role);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new UserEntity(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getBoolean(7),
                        resultSet.getBoolean(8),
                        resultSet.getString(9),
                        resultSet.getString(10),
                        resultSet.getString(11),
                        resultSet.getString(12),
                        resultSet.getString(13),
                        resultSet.getInt(14),
                        resultSet.getInt(15),
                        resultSet.getDate(16)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public StoreEntityTrung getStoreBy_Id(int _id) {
        String sql = "SELECT * FROM store WHERE _id = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, _id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StoreEntityTrung store = new StoreEntityTrung();
                store.set_id(resultSet.getInt("_id"));
                store.setName(resultSet.getString("name"));
                store.setBio(resultSet.getString("bio"));
                store.setOwnerId(resultSet.getInt("ownerId"));
                store.setAvatar(resultSet.getString("avatar"));
                store.setCreatedAt(resultSet.getDate("createdAt"));
                store.setIsActive(resultSet.getBoolean("isActive"));
                store.setIsOpen(resultSet.getBoolean("isOpen"));
                store.setPoint(resultSet.getInt("point"));
                store.setRating(resultSet.getInt("rating"));
                store.setStoreLevelId(resultSet.getInt("storeLevelId"));
                return store;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public StoreEntityTrung updateStoreExceptAvatar(int _id, String name, String bio) {
        String sql = "UPDATE store SET name = ?, bio = ? WHERE _id = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, bio);
            preparedStatement.setInt(3, _id);
            preparedStatement.executeUpdate();
            return getStoreBy_Id(_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public StoreEntityTrung updateStoreHaveAvatar(int _id, String name, String bio, String avatar) {
        String sql = "UPDATE store SET name = ?, bio = ?, avatar = ? WHERE _id = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, bio);
            preparedStatement.setString(3, avatar);
            preparedStatement.setInt(4, _id);
            preparedStatement.executeUpdate();
            return getStoreBy_Id(_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public StoreEntityTrung deleteStore(int _id) {
        String sql = "DELETE FROM store WHERE _id = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, _id);
            preparedStatement.executeUpdate();
            return getStoreBy_Id(_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
