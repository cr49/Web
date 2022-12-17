package Controller;

import Dao.DAO;
import Entity.ProductDisplay_Tu;
import Entity.UserEntity;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = { "/Home" })
public class HomeController extends HttpServlet {
    DAO dao = new DAO();
    private static final long serialVersionUID = -3470182742494703974L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        int User_id = 0 ;
        String Username = null;
        String Role = null;
        String Password = null;

        Cookie arrLogin[] = request.getCookies();
        HttpSession session = request.getSession();
        for (Cookie o : arrLogin) {
            if (o.getName().equals("ck_UserId")) {
                User_id = Integer.parseInt(o.getValue());
            }
            if (o.getName().equals("ck_Username")) {
                Username = o.getValue();
            }
            if (o.getName().equals("ck_Role")) {
                Role = o.getValue();
            }
            if (o.getName().equals("ck_Password")) {
                Password = o.getValue();
            }
        }
        for (Cookie o : arrLogin) {
            if (o.getName().equals("ck_Password")) {
                UserEntity User = dao.GetUserLogin(Username, Password, Role);
                session.setAttribute("User",User);
            }
        }

        List<ProductDisplay_Tu> List8NewProduct = dao.Top8NewProduct();
        List<ProductDisplay_Tu> List8BestSeller = dao.Top8BestSeller();
        request.setAttribute("List8NewProduct", List8NewProduct);
        request.setAttribute("currentHeader", "Home"); // To active header
        request.setAttribute("List8BestSeller", List8BestSeller);
        request.getRequestDispatcher("/views/web/Tu/Home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
