package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DAO;
import Entity.Doanhthu;
import Entity.Doanhthu1;
import Entity.Doanhthu2;

/**
 * Servlet implementation class QLDoanhthuControl
 */
@WebServlet("/QLDoanhthuControl")
public class QLDoanhthuControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLDoanhthuControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
		List<Doanhthu> list = dao.getAllDoanhthu();
		List<Doanhthu1> list1 = dao.getAllDoanhthu1();
		List<Doanhthu2> list2 = dao.getAllDoanhthu2();
		
		request.setAttribute("listC",list);
		request.setAttribute("listC1",list1);
		request.setAttribute("listC2",list2);
		request.getRequestDispatcher("/CuongHandsome/doanhthu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
