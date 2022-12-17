package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DAO;

/**
 * Servlet implementation class AddDonhangControl
 */
@WebServlet("/AddDonhangControl")
public class AddDonhangControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDonhangControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		String userid = request.getParameter("userid");
		String deliveryid = request.getParameter("deliveryid");
		String storeid = request.getParameter("storeid");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String status = request.getParameter("status");
		String paidbefore = request.getParameter("paidbefore");
		String afuser = request.getParameter("afuser");
		String afstore = request.getParameter("afstore");
		String atstore = request.getParameter("atstore");
		String atgd= request.getParameter("atgd");
		DAO dao = new DAO();
		dao.insertDonhang(userid, deliveryid, storeid, address, phone, status, paidbefore, afuser, afstore,atstore,atgd);
		
		response.sendRedirect(request.getContextPath() + "/QLDonhangControl");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
