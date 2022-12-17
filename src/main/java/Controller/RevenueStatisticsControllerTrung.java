package Controller;

import DAO.*;
import DAO.Imp.*;
import Entity.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/vendor/revenue-statistics"})
public class RevenueStatisticsControllerTrung extends HttpServlet {
    IOrderDAOTrung orderDAO = new OrderDAOImpTrung();

    IProductImagesDAOTrung productImagesDAO = new ProductImagesDAOImpTrung();
    IProductDAOTrung productDAOTrung = new ProductDAOImpTrung();

    IOrderItemDAOTrung orderItemDAO = new OrderItemDAOImpTrung();

    IUserDAOTrung userDAO = new UserDAOImpTrung();

    IDeliveryDAOTrung deliveryDAO = new DeliveryDAOImpTrung();
    String time = "Today";
    String time_o = "Today";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getServletPath().equals("/vendor/revenue-statistics")) {
            int storeId = request.getSession().getAttribute("idStore") != null ? (int) request.getSession().getAttribute("idStore") : 0;
            if (storeId==0){
                return;
            }


            if (request.getParameter("time") != null) {
                time = request.getParameter("time");
            }
            request.setAttribute("time", time);

            if (request.getParameter("time_o") != null) {
                time_o = request.getParameter("time_o");
            }
            request.setAttribute("time_o", time_o);


            //////////////////////////////////

//            List<OrderItemEntity> orderItemEntities = new ArrayList<>();
//            List<OrderEntity> orderEntities = new ArrayList<>();
//
//            orderEntities = orderDAO.getAllOrderByStoreId(storeId);
//            for (OrderEntity orderEntity : orderEntities) {
//                orderItemEntities.addAll(orderItemDAO.getOrderItemByOrderId(orderEntity.get_id()));
//            }
//
//            List<ProductEntity> productEntityList = new ArrayList<>();
//            for (OrderItemEntity orderItemEntity : orderItemEntities) {
//                ProductEntity productEntity = productDAOTrung.getProductById(orderItemEntity.getProductId());
//                productEntityList.add(productEntity);
//            }
//            List<ProductImagesEntity> productImagesEntityList = new ArrayList<>();
//            for (ProductEntity productEntity : productEntityList) {
//                productImagesEntityList.add(productImagesDAO.getProductImagesById(productEntity.get_id()).get(0));
//            }
//
//            List<BestSellingProductsEntityTrung> bestSellingProductsEntityTrungList = new ArrayList<>();
//            int duplicate = 0;
//            for (int i = 0; i < productEntityList.size(); i++) {
//                BestSellingProductsEntityTrung bestSellingProductsEntityTrung = new BestSellingProductsEntityTrung();
//
//                for (int j = 0; j < bestSellingProductsEntityTrungList.size(); j++) {
//                    if (productEntityList.get(i).get_id() == bestSellingProductsEntityTrungList.get(j).get_id()) {
//                        duplicate = 1;
//                        break;
//                    }
//                }
//                if (duplicate == 1) {
//                    duplicate = 0;
//                    continue;
//                }
//                else {
//                    bestSellingProductsEntityTrung.set_id(productEntityList.get(i).get_id());
//                    bestSellingProductsEntityTrung.setName(productEntityList.get(i).getName());
//                    bestSellingProductsEntityTrung.setImage(productImagesEntityList.get(i).getUrl_image());
//                    for (OrderItemEntity orderItemEntity : orderItemEntities) {
//                        if (orderItemEntity.getProductId() == productEntityList.get(i).get_id()) {
//                            bestSellingProductsEntityTrung.setQuantity(bestSellingProductsEntityTrung.getQuantity() + orderItemEntity.getCount());
//                        }
//                    }
//                    for (OrderEntity orderEntity : orderEntities) {
//                        bestSellingProductsEntityTrung.setTotal(bestSellingProductsEntityTrung.getTotal() + orderEntity.getAmountToStore());
//                    }
//                    bestSellingProductsEntityTrungList.add(bestSellingProductsEntityTrung);
//                }
//
//
//
//            }

//            request.setAttribute("bestSellingProductsEntityTrungList", bestSellingProductsEntityTrungList);

            int totalEarning = orderDAO.totalEarningByStoreId(storeId);
            request.setAttribute("totalEarning", totalEarning);

            int totalOrder = orderDAO.totalOrderByStoreId(storeId);
            request.setAttribute("totalOrder", totalOrder);

            int expectedAmount = orderDAO.expectedAmountOrderByStoreId(storeId);
            request.setAttribute("expectedAmount", expectedAmount);

            List<BestSellingProductsEntityTrung> bestSellingProducts = new ArrayList<>();
            List<OrdersRevenueEntityTrung> ordersRevenueEntityTrungList = new ArrayList<>();
//            List<OrdersRevenueEntityTrung> ordersRevenueEntityTrungList = orderDAO.getAllOrdersRevenueByStoreId(storeId);
            if (time.equals("Today")) {
                bestSellingProducts = productDAOTrung.getBestSellingProductsByStoreIdAndToday(storeId);
            }
            else if (time.equals("Yesterday")) {
                bestSellingProducts = productDAOTrung.getBestSellingProductsByStoreIdAndYesterday(storeId);
            }
            else if (time.equals("Last 7 Days")) {
                bestSellingProducts = productDAOTrung.getBestSellingProductsByStoreIdAndThisWeek(storeId);
            }
            else if (time.equals("This Month")) {
                bestSellingProducts = productDAOTrung.getBestSellingProductsByStoreIdAndThisMonth(storeId);
            }
            else if (time.equals("This Year")) {
                bestSellingProducts = productDAOTrung.getBestSellingProductsByStoreIdAndThisYear(storeId);
            }
            else if (time.equals("All time")) {
                bestSellingProducts = productDAOTrung.getBestSellingProductsByStoreId(storeId);
            }
            if (time_o.equals("Today")){
                ordersRevenueEntityTrungList = orderDAO.getAllOrderRevenueByStoreIdAndToday(storeId);
            }
            if (time_o.equals("Yesterday")){
                ordersRevenueEntityTrungList = orderDAO.getAllOrderRevenueByStoreIdAndYesterday(storeId);
            }
            if (time_o.equals("Last 7 Days")){
                ordersRevenueEntityTrungList = orderDAO.getAllOrderRevenueByStoreIdAndThisWeek(storeId);
            }
            if (time_o.equals("This Month")){
                ordersRevenueEntityTrungList = orderDAO.getAllOrderRevenueByStoreIdAndThisMonth(storeId);
            }
            if (time_o.equals("This Year")){
                ordersRevenueEntityTrungList = orderDAO.getAllOrderRevenueByStoreIdAndThisYear(storeId);
            }
            if (time_o.equals("All time")){
                ordersRevenueEntityTrungList = orderDAO.getAllOrdersRevenueByStoreId(storeId);
            }

            request.setAttribute("ordersRevenueEntityTrungList", ordersRevenueEntityTrungList);

            List<ProductImagesEntity> productImages = new ArrayList<>();
            for (BestSellingProductsEntityTrung bestSellingProduct : bestSellingProducts) {
                ProductImagesEntity productImage = productImagesDAO.getProductImagesById(bestSellingProduct.get_id()).get(0);
                productImages.add(productImage);
                bestSellingProduct.setImage(productImage.getUrl_image());
            }
            request.setAttribute("bestSellingProductsEntityTrungList", bestSellingProducts);


            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/dashboard-ecom.jsp");
            dispatcher.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
