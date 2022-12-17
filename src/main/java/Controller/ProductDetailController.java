package Controller;

import Dao.DAO;
import Entity.ProductEntity;
import Entity.ProductImagesEntity;
import Entity.ProductSizeEntity;
import Entity.ReviewDisplay_Tu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/Detail","/detail"})
public class ProductDetailController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
        String ProductId = request.getParameter("productId");
        int IProductId = Integer.parseInt(ProductId);
        ProductEntity Product = dao.getProductByProductId(IProductId);
        List<ProductImagesEntity> listProductImages = dao.getAllProductImagesByProductId(IProductId);
        List<ProductSizeEntity> listProductSizes = dao.getAllProductSizesByProductId(IProductId);
        List<ReviewDisplay_Tu> listReview = dao.getReviewByProductId(IProductId);
        request.setAttribute("Product", Product);
        request.setAttribute("listReview", listReview);
        request.setAttribute("listProductImages", listProductImages);
        request.setAttribute("listProductSizes", listProductSizes);
        request.setAttribute("currentHeader", "Product"); // To active header
        request.getRequestDispatcher("/views/web/Tu/ProductDetail.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
