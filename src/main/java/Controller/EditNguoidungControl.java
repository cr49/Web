package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DAO;

/**
 * Servlet implementation class EditNguoidungControl
 */
@WebServlet("/EditNguoidungControl")
public class EditNguoidungControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditNguoidungControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String idcard = request.getParameter("idcard");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String emailactive = request.getParameter("emailactive");
		String phoneactive = request.getParameter("phoneactive");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		String address = request.getParameter("address");
		String avatar = request.getParameter("avatar");
		String point = request.getParameter("point");
		String level = request.getParameter("level");
		String create = request.getParameter("create");
		DAO dao = new DAO();
		dao.editNguoidung(fname, lname, idcard, email, phone, emailactive, phoneactive,
				username,password,role,address,avatar,point,level,create,id);
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
