package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DAO;
/**
 * Servlet implementation class AddSanphamControl
 */
@WebServlet("/AddSanphamControl")
public class AddSanphamControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSanphamControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		String pname = request.getParameter("name");
		String pdescription = request.getParameter("description");
		String pisactive = request.getParameter("isactive");
		String pisselling = request.getParameter("isselling");
		String pcategory = request.getParameter("categoryid");
		String pstore = request.getParameter("storeid");
		String prating = request.getParameter("rating");
		String pcreate = request.getParameter("create");
		String pprice = request.getParameter("price");
		String psize = request.getParameter("size");
		String pquantity= request.getParameter("quantity");
		String pimage = request.getParameter("image");
		String pproductidimg = request.getParameter("productidimg");
		String pproductidsize = request.getParameter("productidsize");
		DAO dao = new DAO();
		dao.insertProduct(pname, pdescription, pisactive, pisselling, pcategory, pstore, prating, pcreate, pprice);
		dao.insertProductImage(pimage, pproductidimg);
		dao.insertProductSize(psize, pquantity, pproductidsize);
		
		response.sendRedirect(request.getContextPath() + "/QLSanphamControl");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
