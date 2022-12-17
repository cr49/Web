package Controller;

import Dao.DAO;
import Entity.UserEntity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

@WebServlet(urlPatterns = {"/UploadMulti"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50 // 10MB
)
public class UploadAvatar extends HttpServlet {
    public static String SAVE_DIRECTORY = "uploadAvatar";
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/web/Tu/MyProfile.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        UserEntity User = (UserEntity) session.getAttribute("User");
        int IuserId = User.get_id();

        try {
            Part part = request.getPart("avatar");
            if (part.getSubmittedFileName() != "") {
                String realPath = request.getServletContext().getRealPath("/uploadAvatar");
                String fileName = Paths.get(part.getSubmittedFileName()).getFileName().toString();
                if (!Files.exists(Paths.get(realPath))) {
                    Files.createDirectories(Paths.get(realPath));
                }
                part.write(realPath + "/" + fileName);
                try {
                    dao.UpdateAvatar(IuserId, "uploadAvatar/" + fileName);
                    User = dao.GetUserbyID(IuserId);
                    session.setAttribute("User", User);
                    HttpSession session1 = request.getSession();
                    session1.setAttribute("message", "Cập nhật ảnh đại diện thành công!!!");
                } catch (Exception e) {
                }
            } else {
                request.setAttribute("errorA", "Thất bại!!");
                HttpSession session1 = request.getSession();
                session1.setAttribute("messageError", "Thất bại!!!");
            }
            request.setAttribute("User", User);
            request.getRequestDispatcher("/views/web/Tu/MyProfile.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }
}
