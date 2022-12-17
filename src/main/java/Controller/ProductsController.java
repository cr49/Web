

package Controller;

import Dao.DAO;
import Entity.CategoryEntity;
import Entity.ProductDisplay_Tu;
import Entity.StoreDisplay_Tu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/Products", "/product"})
public class ProductsController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        /////////// Nếu lấy sản phẩm của 1 của hàng BEGIN
        String StoreId;
        int IStoreId = 0;
        StoreDisplay_Tu Store = null;
        if (request.getParameter("StoreId") == null) {
            session.removeAttribute("StoreId");
        }
        if (request.getParameter("StoreId") != null) {
            StoreId = request.getParameter("StoreId");
        } else if (session.getAttribute("StoreId") != null) {
            StoreId = (String) session.getAttribute("StoreId");
        } else {
            StoreId = null;
        }
        if (StoreId != null & StoreId!="") {
            IStoreId = Integer.parseInt(StoreId);
            Store = dao.getStoreById(IStoreId);
        }
        ////////// END

        /////////// BEGIN SORT
        String typeSort;
        boolean bTypeSort;
        if (request.getParameter("typeSort") != null) {
            typeSort = request.getParameter("typeSort");
        } else if (session.getAttribute("typeSort") != null) {
            typeSort = (String) session.getAttribute("typeSort");
        } else {
            typeSort = "1"; // Mac dinh la tang dan
        }
        // 1 || true : tang
        // 0 || false: giam
        if (typeSort.equals("0")) {
            bTypeSort = false;
        } else {
            bTypeSort = true;
        }
        session.setAttribute("typeSort", typeSort);
        /////////// END SORT

        ////////// BEGIN PAGING
        String index = request.getParameter("index");
        int totalPage = 0;
        if (index == null) {
            index = "1";
        }
        int Iindex = Integer.parseInt(index);
        int beginP = (Iindex - 1) * 9 + 1;
        int endP = Iindex * 9;
        /////////// END PAGING

        /////////// BEGIN CATEGORY
        String cid;
        if (request.getParameter("cid") == null) {
            cid = (String) session.getAttribute("cid");
        } else {
            cid = request.getParameter("cid");
        }
        List<CategoryEntity> listCate = dao.getAllCategory();
        /////////// END CATEGORY

        int total = 0; // Tong so san pham se xuat hien
        List<ProductDisplay_Tu> listProduct = new ArrayList<>();
        if (cid.equals("0")) {
            if (StoreId != null & StoreId!="") {
                total = dao.countAllProductsByStoreId(IStoreId);
                listProduct = dao.pagingSortedProductByStoreId(Iindex, bTypeSort, IStoreId);
            } else {
                total = dao.countAllProducts();
                listProduct = dao.pagingSortedProduct(Iindex, bTypeSort);
            }
            session.setAttribute("cid", cid);
        } else {
            if (StoreId != null & StoreId!="") {
                total = dao.countAllProductsByStoreIdAndCid(IStoreId, Integer.parseInt(cid));
                listProduct = dao.pagingSortedProductByStoreIdAndCid(Iindex, bTypeSort, IStoreId, Integer.parseInt(cid));
            } else {
                total = dao.countAllProductsByCid(Integer.parseInt(cid));
                listProduct = dao.pagingSortedProductByCid(Iindex, bTypeSort, Integer.parseInt(cid));
            }
            session.setAttribute("cid", cid);
        }

        /////  BEGIN SEARCH
        String search;
        if (request.getParameter("search") == null) {
            session.removeAttribute("search");

        }
        if (request.getParameter("search") != null) {
            search = request.getParameter("search");

        } else if (session.getAttribute("search") != null) {
            search = (String) session.getAttribute("search");
        } else {
            search = null;
        }

        if (search != null & search != "") {
            if (StoreId != null & StoreId!="") {
                total = dao.countSearchedProductByStoreIdAndName(search, IStoreId);
                listProduct = dao.searchPagingSortedProductByStoreIdAndName(Iindex, bTypeSort, search, IStoreId);
            } else {
                total = dao.countSearchedProductByName(search);
                listProduct = dao.searchPagingSortedProductByName(Iindex, bTypeSort, search);
            }

        }
        ////////   END SEARCH

        if (total < 9) {
            endP = total;
        }
        if (endP > total) {
            endP = total;
        }
        if (total % 9 == 0) {
            totalPage = total / 9;
        } else {
            totalPage = total / 9 + 1;
        }
        if (total == 0) {
            beginP = 0;
        }

        request.setAttribute("typeSort", Integer.parseInt(typeSort));
        request.setAttribute("search", search);
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("total", total);
        request.setAttribute("Iindex", Iindex);
        request.setAttribute("beginP", beginP);
        request.setAttribute("endP", endP);
        request.setAttribute("cid", cid);
        request.setAttribute("listCate", listCate);
        request.setAttribute("StoreId", StoreId);
        request.setAttribute("Store", Store);
        request.setAttribute("listProduct", listProduct);
        request.setAttribute("currentHeader", "Product"); // To active header
        request.getRequestDispatcher("/views/web/Tu/Product.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        /////////// Nếu lấy sản phẩm của 1 của hàng BEGIN
        String StoreId;
        int IStoreId = 0;
        StoreDisplay_Tu Store = null;
        if (request.getParameter("StoreId") == null) {
            session.removeAttribute("StoreId");
        }
        if (request.getParameter("StoreId") != null) {
            StoreId = request.getParameter("StoreId");
        } else if (session.getAttribute("StoreId") != null) {
            StoreId = (String) session.getAttribute("StoreId");
        } else {
            StoreId = null;
        }
        if (StoreId != null & StoreId!="") {
            IStoreId = Integer.parseInt(StoreId);
            Store = dao.getStoreById(IStoreId);
        }
        ////////// END

        /////////// BEGIN SORT
        String typeSort;
        boolean bTypeSort;
        if (request.getParameter("typeSort") != null) {
            typeSort = request.getParameter("typeSort");
        } else if (session.getAttribute("typeSort") != null) {
            typeSort = (String) session.getAttribute("typeSort");
        } else {
            typeSort = "1"; // Mac dinh la tang dan
        }
        // 1 || true : tang
        // 0 || false: giam
        if (typeSort.equals("0")) {
            bTypeSort = false;
        } else {
            bTypeSort = true;
        }
        session.setAttribute("typeSort", typeSort);
        /////////// END SORT

        ////////// BEGIN PAGING
        String index = request.getParameter("index");
        int totalPage = 0;
        if (index == null) {
            index = "1";
        }
        int Iindex = Integer.parseInt(index);
        int beginP = (Iindex - 1) * 9 + 1;
        int endP = Iindex * 9;
        /////////// END PAGING

        /////////// BEGIN CATEGORY
        String cid;
        if (request.getParameter("cid") == null) {
            cid = (String) session.getAttribute("cid");
        } else {
            cid = request.getParameter("cid");
        }
        List<CategoryEntity> listCate = dao.getAllCategory();
        /////////// END CATEGORY

        int total = 0; // Tong so san pham se xuat hien
        List<ProductDisplay_Tu> listProduct = new ArrayList<>();
        if (cid.equals("0")) {
            if (StoreId != null & StoreId!="") {
                total = dao.countAllProductsByStoreId(IStoreId);
                listProduct = dao.pagingSortedProductByStoreId(Iindex, bTypeSort, IStoreId);
            } else {
                total = dao.countAllProducts();
                listProduct = dao.pagingSortedProduct(Iindex, bTypeSort);
            }
            session.setAttribute("cid", cid);
        } else {
            if (StoreId != null & StoreId!="") {
                total = dao.countAllProductsByStoreIdAndCid(IStoreId, Integer.parseInt(cid));
                listProduct = dao.pagingSortedProductByStoreIdAndCid(Iindex, bTypeSort, IStoreId, Integer.parseInt(cid));
            } else {
                total = dao.countAllProductsByCid(Integer.parseInt(cid));
                listProduct = dao.pagingSortedProductByCid(Iindex, bTypeSort, Integer.parseInt(cid));
            }
            session.setAttribute("cid", cid);
        }

        /////  BEGIN SEARCH
        String search;
        if (request.getParameter("search") == null) {
            session.removeAttribute("search");

        }
        if (request.getParameter("search") != null) {
            search = request.getParameter("search");

        } else if (session.getAttribute("search") != null) {
            search = (String) session.getAttribute("search");
        } else {
            search = null;
        }

        if (search != null & search != "") {
            if (StoreId != null & StoreId!="") {
                total = dao.countSearchedProductByStoreIdAndName(search, IStoreId);
                listProduct = dao.searchPagingSortedProductByStoreIdAndName(Iindex, bTypeSort, search, IStoreId);
            } else {
                total = dao.countSearchedProductByName(search);
                listProduct = dao.searchPagingSortedProductByName(Iindex, bTypeSort, search);
            }

        }
        ////////   END SEARCH

        if (total < 9) {
            endP = total;
        }
        if (endP > total) {
            endP = total;
        }
        if (total % 9 == 0) {
            totalPage = total / 9;
        } else {
            totalPage = total / 9 + 1;
        }
        if (total == 0) {
            beginP = 0;
        }

        request.setAttribute("typeSort", Integer.parseInt(typeSort));
        request.setAttribute("search", search);
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("total", total);
        request.setAttribute("Iindex", Iindex);
        request.setAttribute("beginP", beginP);
        request.setAttribute("endP", endP);
        request.setAttribute("cid", cid);
        request.setAttribute("listCate", listCate);
        request.setAttribute("StoreId", StoreId);
        request.setAttribute("Store", Store);
        request.setAttribute("listProduct", listProduct);
        request.setAttribute("currentHeader", "Product"); // To active header
        request.getRequestDispatcher("/views/web/Tu/Product.jsp").forward(request, response);
    }
}
