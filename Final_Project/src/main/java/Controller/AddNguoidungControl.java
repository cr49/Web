package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DAO;

/**
 * Servlet implementation class AddNguoidungControl
 */
@WebServlet("/AddNguoidungControl")
public class AddNguoidungControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNguoidungControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String cardid = request.getParameter("cardid");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String eactive = request.getParameter("eactive");
		String pactive = request.getParameter("pactive");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		String address = request.getParameter("address");
		String avatar = request.getParameter("avatar");
		String point = request.getParameter("point");
		String level = request.getParameter("level");
		String create = request.getParameter("create");

		DAO dao = new DAO();
		dao.insertNguoidung(fname, lname,cardid,email,phone,eactive,pactive,username,password,
				role,address,avatar,point,level,create);
		response.sendRedirect(request.getContextPath() + "/QLNguoidungControl");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
