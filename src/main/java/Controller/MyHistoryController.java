package Controller;

import Dao.DAO;
import Entity.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/MyHistory"})
public class MyHistoryController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        UserEntity User = (UserEntity) session.getAttribute("User");

        List<OrderDisplay_Tu> allOrders = dao.getAllOderByUserId(User.get_id());
        List<OrderItemDisplay_Tu> allOrderItems = dao.getAllOrderItem();
        request.setAttribute("allOrders", allOrders);
        request.setAttribute("allOrderItems", allOrderItems);
        request.getRequestDispatcher("/views/web/Tu/MyHistory.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
