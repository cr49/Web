package Controller;

import Dao.DAO;
import Entity.UserEntity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/AddReview"})
public class ReviewRatingController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        UserEntity User = (UserEntity) session.getAttribute("User");
        int IuserId = User.get_id();
        String productId = request.getParameter("productId");
        int storeId = dao.getProductByProductId(Integer.parseInt(productId)).getStoreId();
        String orderId = request.getParameter("orderId");
        String content = request.getParameter("review-" + productId);
        String stars = request.getParameter("rating-" + productId);
        dao.addReview(IuserId, Integer.parseInt(productId), storeId,Integer.parseInt(orderId), content, Integer.parseInt(stars));
        HttpSession session1 = request.getSession();
        session1.setAttribute("message", "Đánh giá sản phẩm thành công!!!");
        response.sendRedirect("MyHistory");
    }
}
