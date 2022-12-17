package Controller;

import Dao.DAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/DeleteCart","/deletecart"})
public class DeleteCartController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String CIId = (String) request.getParameter("CIId");
        int ICIId = Integer.parseInt(CIId);
        dao.deleteCart(ICIId);
        HttpSession session1 = request.getSession();
        session1.setAttribute("message", "Xóa giỏ hàng thành công!!!");
        response.sendRedirect("AddCart");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
