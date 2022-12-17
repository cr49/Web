package Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/LogOut","/logout"})
public class LogOutController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        session.removeAttribute("User");

        Cookie ck_Username = new Cookie("ck_Username", null);
        Cookie ck_Password =  new Cookie("ck_Password", null);
        Cookie ck_Role = new Cookie("ck_Role", null);
        Cookie ck_UserId= new Cookie("ck_UserId", null);
        ck_Password.setMaxAge(0);
        ck_Username.setMaxAge(0);
        ck_Role.setMaxAge(0);
        ck_UserId.setMaxAge(0);
        response.addCookie(ck_Username);
        response.addCookie(ck_Password);
        response.addCookie(ck_Role);
        response.addCookie(ck_UserId);
        response.sendRedirect("/Final_Project/Home");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
