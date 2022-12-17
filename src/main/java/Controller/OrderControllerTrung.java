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
import java.util.Objects;

@WebServlet(urlPatterns = {"/vendor/orders"})
public class OrderControllerTrung extends HttpServlet {

    IOrderDAOTrung orderDAO = new OrderDAOImpTrung();

    IProductImagesDAOTrung productImagesDAO = new ProductImagesDAOImpTrung();
    IProductDAOTrung productDAOTrung = new ProductDAOImpTrung();

    IOrderItemDAOTrung orderItemDAO = new OrderItemDAOImpTrung();

    IUserDAOTrung userDAO = new UserDAOImpTrung();

    IDeliveryDAOTrung deliveryDAO = new DeliveryDAOImpTrung();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (request.getServletPath().equals("/vendor/orders")) {

            if (request.getParameter("idUpdateS") != null) {
                request.setAttribute("idUpdateS", request.getParameter("idUpdateS"));
                RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/update-Status-Delivery.jsp");
                dispatcher.forward(request, response);
            }else if (request.getParameter("idOrder") != null) {
                OrderEntity orderEntity = orderDAO.getOrderById(Integer.parseInt(request.getParameter("idOrder")));
                String address = orderEntity.getAddress();
                String status = orderEntity.getStatus();
                List<OrderItemEntity> orderItemEntities = orderItemDAO.getOrderItemByOrderId(orderEntity.get_id());
                UserEntity userEntity = userDAO.getUserById(orderEntity.getUserId());
                List<ProductEntity> productEntityList = new ArrayList<>();
                for (OrderItemEntity orderItemEntity : orderItemEntities) {
                    ProductEntity productEntity = productDAOTrung.getProductById(orderItemEntity.getProductId());
                    productEntityList.add(productEntity);
                }
                List<ProductImagesEntity> productImagesEntityList = new ArrayList<>();
                for (ProductEntity productEntity : productEntityList) {
                    productImagesEntityList.add(productImagesDAO.getProductImagesById(productEntity.get_id()).get(0));
                }
                List<ProductListOrderTrung> productListOrderTrungList = new ArrayList<>();
                for (int i = 0; i < productEntityList.size(); i++) {
                    ProductListOrderTrung productListOrderTrung = new ProductListOrderTrung();
                    productListOrderTrung.setName(productEntityList.get(i).getName());
                    productListOrderTrung.setImg(productImagesEntityList.get(i).getUrl_image());
                    productListOrderTrung.setSize(orderItemEntities.get(i).getSize());
                    productListOrderTrung.setCount(orderItemEntities.get(i).getCount());
                    productListOrderTrung.setPrice(productEntityList.get(i).getPrice());
                    productListOrderTrungList.add(productListOrderTrung);
                }
                DeliveryEntity deliveryEntity = deliveryDAO.getDeliveryById(orderEntity.getDeliveryId());

                int total = 0;
                for (ProductListOrderTrung productListOrderTrung : productListOrderTrungList) {
                    total += productListOrderTrung.getPrice() * productListOrderTrung.getCount();
                }

                request.setAttribute("productListOrderTrungList", productListOrderTrungList);
                request.setAttribute("userEntity", userEntity);
                request.setAttribute("orderEntity", orderEntity);
                request.setAttribute("deliveryEntity", deliveryEntity.getPrice());
                request.setAttribute("total", total);
                request.setAttribute("address", address);
                request.setAttribute("status", status);

                //print for test
//                System.out.println("orderEntity: " + address);
//                System.out.println("userEntity: " + userEntity);
//                System.out.println("productListOrderTrungList: " + productListOrderTrungList.get(0).toString());

                request.setAttribute("idOrder", request.getParameter("idOrder"));
                RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/apps-ecommerce-order-details.jsp");
                dispatcher.forward(request, response);
            } else if (request.getParameter("idDeleteS")!= null){
                if (orderDAO.deleteOrder(Integer.parseInt(request.getParameter("idDeleteS")))){
                    response.sendRedirect("orders");
                }
            }
            else{
//                if (request.getParameter("setView") != null) {
//                    loadOrderDelivered(request, response);
//                } else
                if (request.getParameter("setView")!=null && Objects.equals(request.getParameter("setView"), "All")){
                    request.setAttribute("setColor", "All");
                    loadOrder(request, response);
                } else
                if (request.getParameter("setView")!=null && Objects.equals(request.getParameter("setView"), "Delivered")){
                    request.setAttribute("setColor", "Delivered");
                    loadOrderDelivered(request, response);
                } else
                if (request.getParameter("setView")!=null && request.getParameter("setView").equals("Processing")){
                    request.setAttribute("setColor", "Processing");
                    loadOrderProcessing(request, response);
                } else
                if (request.getParameter("setView")!=null && request.getParameter("setView").equals("Shipped")){
                    request.setAttribute("setColor", "Shipped");
                    loadOrderShipped(request, response);
                }else if (request.getParameter("setView")==null)
                    request.setAttribute("setColor", "All");
                    loadOrder(request, response);
            }
        }
    }

    private void loadOrderShipped(HttpServletRequest request, HttpServletResponse response) {
        try{

            List<OrderListTrung> orderList = new ArrayList<>();
            orderList = orderDAO.getAllOrderListByStoreId(Integer.parseInt((request.getSession().getAttribute("idStore").toString())));

            //get list order by status: Delivered
            List<OrderListTrung> orderListDelivered = new ArrayList<>();
            for (OrderListTrung orderListTrung : orderList) {
                if (orderListTrung.getStatus().equals("shipped")){
                    orderListDelivered.add(orderListTrung);
                }
            }

            if (orderListDelivered.size() == 0) {
                request.setAttribute("message", "No order found");
            }
            else {
                request.setAttribute("orderList", orderListDelivered);
            }

            request.setAttribute("listOrder", orderListDelivered);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/apps-ecommerce-orders.jsp");
            dispatcher.forward(request, response);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void loadOrderProcessing(HttpServletRequest request, HttpServletResponse response) {
        try{

            List<OrderListTrung> orderList = new ArrayList<>();
            orderList = orderDAO.getAllOrderListByStoreId(Integer.parseInt((request.getSession().getAttribute("idStore").toString())));

            //get list order by status: Delivered
            List<OrderListTrung> orderListDelivered = new ArrayList<>();
            for (OrderListTrung orderListTrung : orderList) {
                if (orderListTrung.getStatus().equals("processing")){
                    orderListDelivered.add(orderListTrung);
                }
            }

            if (orderListDelivered.size() == 0) {
                request.setAttribute("message", "No order found");
            }
            else {
                request.setAttribute("orderList", orderListDelivered);
            }

            request.setAttribute("listOrder", orderListDelivered);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/apps-ecommerce-orders.jsp");
            dispatcher.forward(request, response);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void loadOrderDelivered(HttpServletRequest request, HttpServletResponse response) {
        try{

            List<OrderListTrung> orderList = new ArrayList<>();
            orderList = orderDAO.getAllOrderListByStoreId(Integer.parseInt((request.getSession().getAttribute("idStore").toString())));

            //get list order by status: Delivered
            List<OrderListTrung> orderListDelivered = new ArrayList<>();
            for (OrderListTrung orderListTrung : orderList) {
                if (orderListTrung.getStatus().equals("delivered")){
                    orderListDelivered.add(orderListTrung);
                }
            }

            if (orderListDelivered.size() == 0) {
                request.setAttribute("message", "No order found");
            }
            else {
                request.setAttribute("orderList", orderListDelivered);
            }

            request.setAttribute("listOrder", orderListDelivered);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/apps-ecommerce-orders.jsp");
            dispatcher.forward(request, response);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void loadOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{

            List<OrderListTrung> orderList = new ArrayList<>();
            orderList = orderDAO.getAllOrderListByStoreId(Integer.parseInt((request.getSession().getAttribute("idStore").toString())));

            if (orderList.size() == 0) {
                request.setAttribute("message", "No order found");
            }
            else {
                request.setAttribute("orderList", orderList);
//                for (OrderListTrung order : orderList) {
//                    System.out.println(order.toString());
//                }
            }

            request.setAttribute("listOrder", orderList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/apps-ecommerce-orders.jsp");
            dispatcher.forward(request, response);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
            if (request.getServletPath().equals("/vendor/orders")) {
                if (request.getParameter("idUpdateS") != null) {
                    orderDAO.updateOrderStatus(Integer.parseInt(request.getParameter("idUpdateS")), request.getParameter("delivered-status"));
                    loadOrder(request, response);
                }
            }
    }
}
