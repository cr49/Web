package Controller;

import Dao.DAO;
import Entity.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/AddCart","/addcart"})
public class AddCartController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        UserEntity User = (UserEntity) session.getAttribute("User");

        int IuserId = User.get_id();
        List<CartItemDisplay_Tu> listCartItem = dao.getAllCartItem(IuserId);

        int total = 0;
        for (CartItemDisplay_Tu i : listCartItem
             ) {
            total += i.getTotal();
        }

        request.setAttribute("listCartItem", listCartItem);
        request.setAttribute("total", total);
        request.getRequestDispatcher("/views/web/Tu/Cart.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        UserEntity User = (UserEntity) session.getAttribute("User");

        int IuserId = User.get_id();
        String productId = (String) request.getParameter("productId");
        int IproductId = Integer.parseInt(productId);
        String count = (String) request.getParameter("count");
        int Icount = Integer.parseInt(count);
        String size = (String) request.getParameter("RadioSize");
        if(size==null){
            boolean error = true;

            ProductEntity Product = dao.getProductByProductId(IproductId);
            List<ProductImagesEntity> listProductImages = dao.getAllProductImagesByProductId(IproductId);
            List<ProductSizeEntity> listProductSizes = dao.getAllProductSizesByProductId(IproductId);

            request.setAttribute("error", error);
            request.setAttribute("Product", Product);
            request.setAttribute("listProductImages", listProductImages);
            request.setAttribute("listProductSizes", listProductSizes);
            request.setAttribute("currentHeader", "Product"); // To active header
            request.getRequestDispatcher("/views/web/Tu/ProductDetail.jsp").forward(request, response);
        }
        else{
            dao.addCart(IuserId, IproductId,Icount, size);
            List<CartItemDisplay_Tu> listCartItem = dao.getAllCartItem(IuserId);
            int total = 0;
            for (CartItemDisplay_Tu i : listCartItem
            ) {
                total += i.getTotal();
            }
            request.setAttribute("listCartItem", listCartItem);
            request.setAttribute("total", total);
            request.getRequestDispatcher("/views/web/Tu/Cart.jsp").forward(request, response);
        }
    }
}
