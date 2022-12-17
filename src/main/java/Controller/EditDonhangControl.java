package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DAO;

/**
 * Servlet implementation class EditDonhangControl
 */
@WebServlet("/EditDonhangControl")
public class EditDonhangControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDonhangControl() {
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
		String did = request.getParameter("id");
		String userid = request.getParameter("userid");
		String deliveryid = request.getParameter("deliveryid");
		String shippingdate = request.getParameter("shippingdate");
		String storeid = request.getParameter("storeid");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String status = request.getParameter("status");
		String paidbefore = request.getParameter("paidbefore");
		String afu = request.getParameter("afu");
		String afs = request.getParameter("afs");
		String ats = request.getParameter("ats");
		String atg = request.getParameter("atg");
		String create = request.getParameter("create");
		DAO dao = new DAO();
		dao.editDonhang(userid, deliveryid, shippingdate, storeid, address, phone, status,paidbefore,
				afu, afs, ats, atg, create, did);
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
