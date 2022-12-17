package Controller;

import Dao.DAO;
import Entity.ProductDisplay_Tu;
import Entity.StoreDisplay_Tu;
import Entity.UserEntity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/MyProfile", "/EditInf", "/EditAvatar", "/EditPassword"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50 // 10MB
)
public class MyProfileController extends HttpServlet {
    public static String SAVE_DIRECTORY = "uploadAvatar";
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        UserEntity User = (UserEntity) session.getAttribute("User");
        request.setAttribute("User", User);
////////////////////////////////////////////////////////////// begin Store
        ////////// BEGIN PAGING
        String indexStore = request.getParameter("indexStore");
        int totalStorePage = 0;
        if (indexStore == null) {
            indexStore = "1";
        }
        int IindexStore = Integer.parseInt(indexStore);
        /////////////
        int totalStore = 0; // Tong so cua hang se xuat hien
        totalStore = dao.countAllFollowingStores(User.get_id());
        List<StoreDisplay_Tu> listFollowingStore = dao.pagingAllFollowingStores( IindexStore, User.get_id());
        ////////////
        if (totalStore % 3 == 0) {
            totalStorePage = totalStore / 3;
        } else {
            totalStorePage = totalStore / 3 + 1;
        }
        /////////// END PAGING
////////////////////////////////////////////////////////////// end Store

////////////////////////////////////////////////////////////// begin Store
        ////////// BEGIN PAGING
        String indexProduct = request.getParameter("indexProduct");
        boolean isProductView = false;
        int totalProductPage = 0;
        if (indexProduct == null) {
            indexProduct = "1";
        }
        else {
            isProductView = true;
        }
        int IindexProduct = Integer.parseInt(indexProduct);
        /////////////
        int totalProduct = 0; // Tong so cua hang se xuat hien
        totalProduct = dao.countAllFollowingProducts(User.get_id());
        List<ProductDisplay_Tu> listFollowingProducts = dao.pagingAllFollowingProducts( IindexProduct, User.get_id());
        ////////////
        if (totalProduct % 6 == 0) {
            totalProductPage = totalProduct / 6;
        } else {
            totalProductPage = totalProduct / 6 + 1;
        }
        /////////// END PAGING
////////////////////////////////////////////////////////////// end Store
        request.setAttribute("listFollowingStore", listFollowingStore);
        request.setAttribute("totalStorePage", totalStorePage);
        request.setAttribute("IindexStore", IindexStore);
        request.setAttribute("listFollowingProducts", listFollowingProducts);
        request.setAttribute("totalProductPage", totalProductPage);
        request.setAttribute("IindexProduct", IindexProduct);
        request.setAttribute("isProductView", isProductView);
        request.getRequestDispatcher("/views/web/Tu/MyProfile.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String url = request.getRequestURL().toString();
        HttpSession session = request.getSession();
        UserEntity User = (UserEntity) session.getAttribute("User");
        if (url.contains("EditInf")) {
            EditUserInfomation(request, response);
        } else if (url.contains("EditPassword")) {
            EditPassword(request, response);
        } else {
            request.setAttribute("User", User);
            request.getRequestDispatcher("/views/web/Tu/MyProfile.jsp").forward(request, response);
        }
    }

    protected void EditUserInfomation(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            HttpSession session1 = request.getSession();
            UserEntity User = (UserEntity) session.getAttribute("User");
            int userId = User.get_id();
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String id_card = request.getParameter("id_card");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            if (firstname == null || lastname == null
                    || email == null || id_card == null || phone == null || address == null ||
                    firstname == "" || lastname == ""
                    || email == "" || id_card == "" || phone == "" || address == "") {
                session1.setAttribute("messageError", "Không được bỏ trống!!!");
            } else {
                dao.UpdateUserInf(userId, firstname, lastname, id_card, address, phone, email);
                User = dao.GetUserbyID(userId);
                session.setAttribute("User", User);
                session1.setAttribute("message", "Cập nhật thông tin thành công!!!");
            }
            request.setAttribute("User", User);

            request.getRequestDispatcher("/views/web/Tu/MyProfile.jsp").forward(request, response);

        } catch (Exception e) {
        }
    }

    protected void EditPassword(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            UserEntity User = (UserEntity) session.getAttribute("User");
            int userId = User.get_id();
            String recentpassword = request.getParameter("recentpassword");
            String newpassword = request.getParameter("newpassword");
            String repassword = request.getParameter("repassword");
            HttpSession session1 = request.getSession();

            if (recentpassword == null || newpassword == null
                    || repassword == null ||
                    recentpassword == "" || newpassword == ""
                    || repassword == "") {
                session1.setAttribute("messageError", "Không được bỏ trống!!!");
            } else if (!recentpassword.equals(User.getPassword())) {
                session1.setAttribute("messageError", "Mật khẩu không chính xác!!!");
            } else if (!newpassword.equals(repassword)) {
                session1.setAttribute("messageError", "Mật khẩu không khớp!!!");
            } else {
                dao.UpdatePassword(userId, newpassword);
                User = dao.GetUserbyID(userId);
                session.setAttribute("User", User);
                session1.setAttribute("message", "Đổi mật khẩu thành công!!!");
            }
            request.setAttribute("User", User);
            request.getRequestDispatcher("/views/web/Tu/MyProfile.jsp").forward(request, response);

        } catch (Exception e) {
        }
    }
}
