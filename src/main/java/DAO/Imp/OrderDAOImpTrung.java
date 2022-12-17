package DAO.Imp;

import DAO.IOrderDAOTrung;
import Entity.OrderEntity;
import Entity.OrderListTrung;
import Entity.OrdersRevenueEntityTrung;
import Connection.DBConnectionTrung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpTrung implements IOrderDAOTrung {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    @Override
    public List<OrderListTrung> getAllOrderListByStoreId(int id) {
        String sql = "select o._id, u.firstname +' '+ u.lastname as name, o.amountFromUser, o.createdAt, d.name, o.status\n" +
                "from [Order] as o\n" +
                "INNER JOIN [User] as u\n" +
                "ON o.userId = u._id\n" +
                "INNER JOIN Delivery as d\n" +
                "ON o.deliveryId = d._id\n" +
                "where o.storeId = ?";
        try {
            List<OrderListTrung> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                OrderListTrung orderList = new OrderListTrung();
                orderList.set_id(resultSet.getInt("_id"));
                orderList.setName(resultSet.getString("name"));
                orderList.setAmountFromUser(resultSet.getInt("amountFromUser"));
                orderList.setCreatedAt(resultSet.getDate("createdAt"));
                orderList.setNameDelivery(resultSet.getString("name"));
                orderList.setStatus(resultSet.getString("status"));
                list.add(orderList);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<OrdersRevenueEntityTrung> getAllOrdersRevenueByStoreId(int id) {
        String sql = "select u.firstname +' '+ u.lastname as name, u.avatar, o.amountToStore, u.email,o.createdAt\n" +
                "from [Order] as o\n" +
                "right OUTER join [User]  as u\n" +
                "on u._id = o.userId\n" +
                "where o.storeId = ?\n" +
                "order by o.amountToStore desc";
        try {
            List<OrdersRevenueEntityTrung> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                OrdersRevenueEntityTrung ordersRevenueEntity = new OrdersRevenueEntityTrung();
                ordersRevenueEntity.setName(resultSet.getString("name"));
                ordersRevenueEntity.setImg(resultSet.getString("avatar"));
                ordersRevenueEntity.setTotal(resultSet.getInt("amountToStore"));
                ordersRevenueEntity.setEmail(resultSet.getString("email"));
                ordersRevenueEntity.setCreatedAt(resultSet.getDate("createdAt"));
                list.add(ordersRevenueEntity);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<OrdersRevenueEntityTrung> getAllOrderRevenueByStoreIdAndToday(int id) {
        String sql = "select u.firstname +' '+ u.lastname as name, u.avatar, o.amountToStore, u.email,o.createdAt\n" +
                "                from [Order] as o\n" +
                "                right OUTER join [User]  as u\n" +
                "                on u._id = o.userId\n" +
                "                where o.storeId = ? and o.createdAt >=DATEADD(DAY,-1,GETDATE()) and o.status = 'delivered'\n" +
                "                order by o.amountToStore desc";
        try {
            List<OrdersRevenueEntityTrung> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                OrdersRevenueEntityTrung ordersRevenueEntity = new OrdersRevenueEntityTrung();
                ordersRevenueEntity.setName(resultSet.getString("name"));
                ordersRevenueEntity.setImg(resultSet.getString("avatar"));
                ordersRevenueEntity.setTotal(resultSet.getInt("amountToStore"));
                ordersRevenueEntity.setEmail(resultSet.getString("email"));
                ordersRevenueEntity.setCreatedAt(resultSet.getDate("createdAt"));
                list.add(ordersRevenueEntity);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<OrdersRevenueEntityTrung> getAllOrderRevenueByStoreIdAndYesterday(int id) {
        String sql ="select u.firstname +' '+ u.lastname as name, u.avatar, o.amountToStore, u.email,o.createdAt\n" +
                "                from [Order] as o\n" +
                "                right OUTER join [User]  as u\n" +
                "                on u._id = o.userId\n" +
                "                where o.storeId = ? and o.createdAt >=DATEADD(DAY,-2,GETDATE()) and o.createdAt < DATEADD(DAY,-1,GETDATE()) and o.status = 'delivered'\n" +
                "                order by o.amountToStore desc";
        try {
            List<OrdersRevenueEntityTrung> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                OrdersRevenueEntityTrung ordersRevenueEntity = new OrdersRevenueEntityTrung();
                ordersRevenueEntity.setName(resultSet.getString("name"));
                ordersRevenueEntity.setImg(resultSet.getString("avatar"));
                ordersRevenueEntity.setTotal(resultSet.getInt("amountToStore"));
                ordersRevenueEntity.setEmail(resultSet.getString("email"));
                ordersRevenueEntity.setCreatedAt(resultSet.getDate("createdAt"));
                list.add(ordersRevenueEntity);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public boolean updateOrderStatus(int id, String status) {
        String sql = "update [Order] set status = ? where _id = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, status);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public OrderEntity getOrderById(int id) {
        String sql = "select * from [Order] where _id = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                OrderEntity order = new OrderEntity();
                order.set_id(resultSet.getInt("_id"));
                order.setUserId(resultSet.getInt("userId"));
                order.setStoreId(resultSet.getInt("storeId"));
                order.setAmountFromUser(resultSet.getInt("amountFromUser"));
                order.setAmountFromStore(resultSet.getInt("amountFromStore"));
                order.setDeliveryId(resultSet.getInt("deliveryId"));
                order.setCreatedAt(resultSet.getDate("createdAt"));
                order.setStatus(resultSet.getString("status"));
                order.setAddress(resultSet.getString("address"));
                return order;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deleteOrder(int id) {
        String sql = "delete from [Order] where _id = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<OrderEntity> getAllOrderByStoreId(int id) {
        String sql = "select * from [Order] where storeId = ?";
        try {
            List<OrderEntity> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                OrderEntity order = new OrderEntity();
                order.set_id(resultSet.getInt("_id"));
                order.setUserId(resultSet.getInt("userId"));
                order.setStoreId(resultSet.getInt("storeId"));
                order.setAmountFromUser(resultSet.getInt("amountFromUser"));
                order.setAmountFromStore(resultSet.getInt("amountFromStore"));
                order.setAmountToStore(resultSet.getInt("amountToStore"));
                order.setDeliveryId(resultSet.getInt("deliveryId"));
                order.setCreatedAt(resultSet.getDate("createdAt"));
                order.setStatus(resultSet.getString("status"));
                order.setAddress(resultSet.getString("address"));
                list.add(order);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int totalEarningByStoreId(int id) {
        String sql = "select sum(amountToStore) as total from [Order] where storeId = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return resultSet.getInt("total");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int totalOrderByStoreId(int id) {
        String sql = "select count(*) as total from [Order] where storeId = ?";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return resultSet.getInt("total");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int expectedAmountOrderByStoreId(int id) {
        String sql = "select sum(amountToStore) as total from [Order] where storeId = ? and status='shipped'";
        try {
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return resultSet.getInt("total");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<OrdersRevenueEntityTrung> getAllOrderRevenueByStoreIdAndThisWeek(int storeId) {
        String sql = "select u.firstname +' '+ u.lastname as name, u.avatar, o.amountToStore, u.email,o.createdAt\n" +
                "                from [Order] as o\n" +
                "                right OUTER join [User]  as u\n" +
                "                on u._id = o.userId\n" +
                "                where o.storeId = ? and o.createdAt >=DATEADD(WEEK,-1,GETDATE()) and o.status = 'delivered'\n" +
                "                order by o.amountToStore desc";

        try {
            List<OrdersRevenueEntityTrung> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, storeId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                OrdersRevenueEntityTrung ordersRevenueEntity = new OrdersRevenueEntityTrung();
                ordersRevenueEntity.setName(resultSet.getString("name"));
                ordersRevenueEntity.setImg(resultSet.getString("avatar"));
                ordersRevenueEntity.setTotal(resultSet.getInt("amountToStore"));
                ordersRevenueEntity.setEmail(resultSet.getString("email"));
                ordersRevenueEntity.setCreatedAt(resultSet.getDate("createdAt"));
                list.add(ordersRevenueEntity);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<OrdersRevenueEntityTrung> getAllOrderRevenueByStoreIdAndThisMonth(int id) {
        String sql = "select u.firstname +' '+ u.lastname as name, u.avatar, o.amountToStore, u.email,o.createdAt\n" +
                "                from [Order] as o\n" +
                "                right OUTER join [User]  as u\n" +
                "                on u._id = o.userId\n" +
                "                where o.storeId = ? and o.createdAt <= DATEADD(month, ((YEAR(GETDATE()) - 1900) * 12) + MONTH(GETDATE()), -1) and o.createdAt >= DATEADD(month, DATEDIFF(month, 0, GETDATE()), 0)  and o.status = 'delivered'\n" +
                "                order by o.amountToStore desc";
        try {
            List<OrdersRevenueEntityTrung> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                OrdersRevenueEntityTrung ordersRevenueEntity = new OrdersRevenueEntityTrung();
                ordersRevenueEntity.setName(resultSet.getString("name"));
                ordersRevenueEntity.setImg(resultSet.getString("avatar"));
                ordersRevenueEntity.setTotal(resultSet.getInt("amountToStore"));
                ordersRevenueEntity.setEmail(resultSet.getString("email"));
                ordersRevenueEntity.setCreatedAt(resultSet.getDate("createdAt"));
                list.add(ordersRevenueEntity);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<OrdersRevenueEntityTrung> getAllOrderRevenueByStoreIdAndThisYear(int id) {
        String sql ="select u.firstname +' '+ u.lastname as name, u.avatar, o.amountToStore, u.email,o.createdAt\n" +
                "                from [Order] as o\n" +
                "                right OUTER join [User]  as u\n" +
                "                on u._id = o.userId\n" +
                "                where o.storeId = ? and o.createdAt <= DATEADD(yy, DATEDIFF(yy, 0, GETDATE()) + 1, -1) and o.createdAt >= DATEADD(month, DATEDIFF(month, 0, GETDATE()), 0)   and o.status = 'delivered'\n" +
                "                order by o.amountToStore desc";
        try {
            List<OrdersRevenueEntityTrung> list = new ArrayList<>();
            connection = new DBConnectionTrung().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                OrdersRevenueEntityTrung ordersRevenueEntity = new OrdersRevenueEntityTrung();
                ordersRevenueEntity.setName(resultSet.getString("name"));
                ordersRevenueEntity.setImg(resultSet.getString("avatar"));
                ordersRevenueEntity.setTotal(resultSet.getInt("amountToStore"));
                ordersRevenueEntity.setEmail(resultSet.getString("email"));
                ordersRevenueEntity.setCreatedAt(resultSet.getDate("createdAt"));
                list.add(ordersRevenueEntity);
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
