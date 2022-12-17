package Controller;

import Dao.DAO;
import Entity.ProductDisplay_Tu;
import Entity.StoreDisplay_Tu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/Store", "/store"})
public class StoresController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();

        ////////// BEGIN PAGING
        String index = request.getParameter("index");
        int totalPage = 0;
        if (index == null) {
            index = "1";
        }
        int Iindex = Integer.parseInt(index);
        int beginS = (Iindex - 1) * 9 + 1;
        int endS = Iindex * 9;
        /////////// END PAGING

        int total = 0; // Tong so cua hang se xuat hien
        List<StoreDisplay_Tu> listStore = new ArrayList<>();
        total = dao.countAllStores();
        listStore = dao.pagingStores(Iindex);

        /////  BEGIN SEARCH
        String search;
        if(request.getParameter("search")==null){
            session.removeAttribute("search");
        }
        if(request.getParameter("search")!=null){
            search = request.getParameter("search");
        }
        else if(session.getAttribute("search")!=null){
            search = (String) session.getAttribute("search");
        }
        else{
            search = null;
        }
        if(search != null){
            total = dao.countSearchedStoreByName(search);
            listStore = dao.searchPagingStoreByName(Iindex,search);
        }
        ////////   END SEARCH

        /////////////
        if(total < 9){
            endS =  total;
        }
        if(endS>total){
            endS = total;
        }
        if (total % 9 == 0) {
            totalPage = total / 9;
        } else {
            totalPage = total / 9 + 1;
        }
        if(total==0){
            beginS = 0;
        }/////////////

        request.setAttribute("search", search);
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("total", total);
        request.setAttribute("Iindex", Iindex);
        request.setAttribute("beginS", beginS);
        request.setAttribute("endS", endS);
        request.setAttribute("listStore", listStore);
        request.setAttribute("currentHeader", "Store"); // To active header
        request.getRequestDispatcher("/views/web/Tu/Store.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
