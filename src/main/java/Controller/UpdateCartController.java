package Controller;

import Dao.DAO;
import Entity.CartItemDisplay_Tu;
import Entity.UserEntity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/UpdateCart","/updatecart"})
public class UpdateCartController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
//        response.sendRedirect("AddCart");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        UserEntity User = (UserEntity) session.getAttribute("User");

        int IuserId = User.get_id();
        List<CartItemDisplay_Tu> AllCartItem = dao.getAllCartItem(IuserId);

        for (CartItemDisplay_Tu i : AllCartItem
             ) {
            String CIId = (String) request.getParameter("CIId-" + i.get_id());
            int ICIId = Integer.parseInt(CIId);
            String count = (String) request.getParameter("count-" + i.get_id());
            int Icount = Integer.parseInt(count);
            dao.updateCart(ICIId, Icount);
            HttpSession session1 = request.getSession();
            session1.setAttribute("message", "Cập nhật giỏ hàng thành công!!!");
        }
        response.sendRedirect("AddCart");
    }
}
