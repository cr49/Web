package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.DAO;
import Entity.UserEntity;

@WebServlet(urlPatterns = { "/Login", "/Register" })
public class LoginRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();

	public LoginRegisterController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/views/web/Tu/Login_Register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = request.getRequestURL().toString();
		if (url.contains("Login")) {
			Login(request, response);

		} else if (url.contains("Register")) {
			Insert_User(request, response);
		}
	}

	protected void Insert_User(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			String FirstName = request.getParameter("registeFirstName");
			String LastName = request.getParameter("registerLastName");
			String IDCard = request.getParameter("registerIDCard");
			String Email = request.getParameter("registerEmail");
			String Phone = request.getParameter("registerPhone");
			String Address = request.getParameter("registerAddress");
			String Username = request.getParameter("registerUsername");
			String Password = request.getParameter("registerPassword");
			String Role = request.getParameter("flexRadioDefault");
			String RepeatPassword = request.getParameter("registerRepeatPassword");

			
			if(FirstName == null || LastName == null || Username == null || Password == null || RepeatPassword == null
					|| Email==null || IDCard == null || Phone==null || Address==null ||
					FirstName == "" || LastName == "" || Username == "" || Password == "" || RepeatPassword == ""
					|| Email=="" || IDCard == "" || Phone=="" || Address=="") {
				request.setAttribute("error", "Không được bỏ trống!!");
			}
			else if(!Password.equals(RepeatPassword)) {
				request.setAttribute("error", "Mật khẩu không khớp!!");
			}
			else if(dao.checkUsernameExist(Username, Role)) {
				request.setAttribute("error", "Username đã tồn tại!!");
			}
			else if(dao.checkEmailExist(Email, Role)) {
				request.setAttribute("error", "Email đã tồn tại!!");
			}
			else if(dao.checkIdCardExist(IDCard, Role)) {
				request.setAttribute("error", "IDCard đã tồn tại!!");
			}
else if(dao.checkPhoneExist(Phone, Role)) {
				request.setAttribute("error", "Phone đã tồn tại!!");
			}
			else {
				dao.Insert_User(FirstName, LastName, IDCard, Email, Phone, Username, RepeatPassword, Role, Address, 1);
				request.setAttribute("success", "Đã đăng ký thành công! Bắt đầu đăng nhập!");
			}
			request.getRequestDispatcher("/views/web/Tu/Login_Register.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Eror: " + e.getMessage());
		}

	}

	protected void Login(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		UserEntity User = null;
		HttpSession session = request.getSession();
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			String Username = request.getParameter("loginName");
			String Password = request.getParameter("loginPassword");
			String Role = request.getParameter("flexRadioDefault");
			String remember =request.getParameter("loginCheck");	
			User = dao.GetUserLogin(Username, Password, Role);
			if (User != null) {

				session.setAttribute("User", User);
				Cookie ck_Username = new Cookie("ck_Username", Username);
				ck_Username.setMaxAge(60*60*24);
				response.addCookie(ck_Username);
				
				if(remember != null) {			
					Cookie ck_Password = new Cookie("ck_Password", Password);
					Cookie ck_Role = new Cookie("ck_Role", Role);
					Cookie ck_UserId = new Cookie("ck_UserId", Integer.toString(User.get_id()));
					
					ck_Password.setMaxAge(60*60*24);
					ck_Role.setMaxAge(60*60*24);
					ck_UserId.setMaxAge(60*60*24);
					
					response.addCookie(ck_Password);
					response.addCookie(ck_Role);
					response.addCookie(ck_UserId);
				}

				String role = User.getRole();
				if(role.equals("Customer")){
					response.sendRedirect("/Final_Project/Home");
				}
//				if(role.equals("Customer")){
//					response.sendRedirect("/Final_Project/Home");
//				}
//				if(role.equals("Customer")){
//					response.sendRedirect("/Final_Project/Home");
//				}
			}
			else {
				request.setAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng!");
				request.getRequestDispatcher("/views/web/Tu/Login_Register.jsp").forward(request, response);
			}		

		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Eror: " + e.getMessage());
		}

	}
	
}
