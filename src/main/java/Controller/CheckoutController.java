package Controller;

import Dao.DAO;
import Entity.CartItemDisplay_Tu;
import Entity.DeliveryEntity;
import Entity.UserEntity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/Checkout","/checkout"})
public class CheckoutController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        UserEntity User = (UserEntity) session.getAttribute("User");

        int IuserId = User.get_id();
        List<CartItemDisplay_Tu> listCartItem = dao.getAllCartItem(IuserId);

        int total = 0;
        for (CartItemDisplay_Tu i : listCartItem
        ) {
            total += i.getTotal();
        }
        List<DeliveryEntity> allDelivery = dao.getAllDelivery();
        session.setAttribute("Delivery", allDelivery);
        request.setAttribute("listCartItem", listCartItem);
        request.setAttribute("total", total);
        request.getRequestDispatcher("/views/web/Tu/Checkout.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            UserEntity User = (UserEntity) session.getAttribute("User");
            int userId = User.get_id();
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String id_card = request.getParameter("id_card");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String deliveryId = request.getParameter("RadioDelivery");
            String content = request.getParameter("content");

            if (firstname == null || lastname == null
                    || email == null || id_card == null || phone == null || address == null ||
                    firstname == "" || lastname == ""
                    || email == "" || id_card == "" || phone == "" || address == "") {
                request.setAttribute("error", "Không được bỏ trống!!");
                request.setAttribute("User", User);
                request.getRequestDispatcher("/views/web/Tu/Checkout.jsp").forward(request, response);
            } else {
                dao.UpdateUserInf(userId, firstname, lastname, id_card, address, phone, email);

                User = dao.GetUserbyID(userId);
                session.setAttribute("User", User);
                dao.addToOrder(userId, Integer.parseInt(deliveryId), address, phone, content);
                HttpSession session1 = request.getSession();
                session1.setAttribute("message", "Đặt hàng thành công!!!");
                response.sendRedirect("/Final_Project/Home");
            }

        } catch (Exception e) {
        }
    }
}
