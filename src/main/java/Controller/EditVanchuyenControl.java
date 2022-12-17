package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DAO;

/**
 * Servlet implementation class EditVanchuyenControl
 */
@WebServlet("/EditVanchuyenControl")
public class EditVanchuyenControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditVanchuyenControl() {
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
		String vid = request.getParameter("id");
		String vname = request.getParameter("name");
		String vdescription = request.getParameter("description");
		String vprice = request.getParameter("price");
		String vestimate = request.getParameter("estimate");
		DAO dao = new DAO();
		dao.editDelivery(vname, vdescription, vprice, vestimate,vid);
		response.sendRedirect(request.getContextPath() + "/QLVanchuyenControl");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
