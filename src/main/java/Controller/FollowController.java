package Controller;

import Dao.DAO;
import Entity.UserEntity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/AddFollowProduct", "/AddFollowStore", "/DeleteFollowProduct", "/DeleteFollowStore"})
public class FollowController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = request.getRequestURL().toString();
        if (url.contains("AddFollowProduct")) {
            AddFollowProduct(request, response);

        } else if (url.contains("AddFollowStore")) {
            AddFollowStore(request, response);
        }
        else if (url.contains("DeleteFollowProduct")) {
            DeleteFollowProduct(request, response);
        }
        else if (url.contains("DeleteFollowStore")) {
            DeleteFollowStore(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void AddFollowProduct(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        try {
            response.setContentType("text/html");
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");

            HttpSession session = request.getSession();
            UserEntity User = (UserEntity) session.getAttribute("User");

            int IuserId = User.get_id();

            String productId = request.getParameter("productId");
            dao.addFollowingProduct(IuserId, Integer.parseInt(productId));

            HttpSession session1 = request.getSession();
            session1.setAttribute("message", "Theo dõi sản phẩm thành công!!!");
            response.sendRedirect("MyProfile");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void AddFollowStore(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        try {
            response.setContentType("text/html");
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");

            HttpSession session = request.getSession();
            UserEntity User = (UserEntity) session.getAttribute("User");
            int IuserId = User.get_id();
            String StoreId = request.getParameter("StoreId");
            dao.addFollowingStore(IuserId, Integer.parseInt(StoreId));
            HttpSession session1 = request.getSession();
            session1.setAttribute("message", "Theo dõi cửa hàng thành công!!!");
            response.sendRedirect("MyProfile");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void DeleteFollowProduct(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        try {
            response.setContentType("text/html");
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            UserEntity User = (UserEntity) session.getAttribute("User");
            int IuserId = User.get_id();
            String productId = request.getParameter("productId");
            dao.deleteFollowingProducts(Integer.parseInt(productId), IuserId);
            HttpSession session1 = request.getSession();
            session1.setAttribute("message", "Hủy theo dõi sản phẩm thành công!!!");
            response.sendRedirect("MyProfile");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void DeleteFollowStore(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        try {
            response.setContentType("text/html");
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            UserEntity User = (UserEntity) session.getAttribute("User");
            int IuserId = User.get_id();
            String storeId = request.getParameter("storeId");
            dao.deleteFollowingStores(Integer.parseInt(storeId), IuserId);
            HttpSession session1 = request.getSession();
            session1.setAttribute("message", "Hủy theo dõi cửa hàng thành công!!!");
            response.sendRedirect("MyProfile");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
