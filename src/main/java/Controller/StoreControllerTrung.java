package Controller;

import DAO.IStoreDAOTrung;
import DAO.Imp.StoreDAOImpTrung;
import Entity.StoreEntityTrung;
import Entity.UserEntity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static java.lang.System.out;

@MultipartConfig
@WebServlet(urlPatterns = {"/vendor/stores-list","/vendor/stores/create","/signin","/vendor/stores","/vendor/stores/update","/vendor/stores/delete"})
public class StoreControllerTrung extends HttpServlet {
    IStoreDAOTrung storeDAO = new StoreDAOImpTrung();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (request.getServletPath().equals("/signin")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/auth-signin-basic.jsp");
            dispatcher.forward(request, response);
        } else if (request.getServletPath().equals("/vendor/stores-list")) {
            readAllStore(request, response);
        }
        else if (request.getServletPath().equals("/vendor/stores/create")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/createStore.jsp");
            dispatcher.forward(request, response);
        }
        else if (request.getServletPath().equals("/vendor/stores")) {

            if (request.getParameter(("id_store_profile"))!=null){
                int id_store_profile = Integer.parseInt(request.getParameter(("id_store_profile")));
//                StoreEntityTrung storeEntityTrung = storeDAO.getStoreById(id_store_profile);
//                request.setAttribute("storeEntityTrung",storeEntityTrung);
                StoreEntityTrung store = storeDAO.getStoreBy_Id(id_store_profile);
                request.setAttribute("store", store);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/profile-store.jsp");
                dispatcher.forward(request, response);
            }
            else
            {
                if (request.getParameter("id") == null) {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/storeDetail.jsp");
                    dispatcher.forward(request, response);
                } else {
                    //create attribute id of store
                    HttpSession session = request.getSession();
                    int idStore = request.getParameter("id") != null ? Integer.parseInt(request.getParameter("id")) : 0;
                    if (idStore == 0) {
                        out.println("id store is not found");
                        return;
                    } else {
                        session.setAttribute("idStore", idStore);
                        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/storeDetail.jsp");
                        dispatcher.forward(request, response);
                    }
                }
            }

        }
        else if (request.getServletPath().equals("/vendor/stores/update")) {
            int idStore = request.getParameter("id") != null ? Integer.parseInt(request.getParameter("id")) : 0;
            if (idStore == 0) {
                out.println("id store is not found");
                return;
            }
            else {
                StoreEntityTrung store = storeDAO.getStoreBy_Id(idStore);
                request.setAttribute("store", store);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/updateStore.jsp");
                dispatcher.forward(request, response);
            }
        }
        else if (request.getServletPath().equals("/vendor/stores/delete")) {
            int idStore = request.getParameter("id") != null ? Integer.parseInt(request.getParameter("id")) : 0;
            if (idStore == 0) {
                out.println("id store is not found");
                return;
            }
            else {
                storeDAO.deleteStore(idStore);
                response.sendRedirect("/Final_Project/vendor/stores-list");
            }
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (request.getServletPath().equals("/vendor/stores/create")) {
            createStore(request, response);
        }
        else if (request.getServletPath().equals("/vendor/stores/update")) {
            updateStore(request, response);
        }
        else if (request.getServletPath().equals("/vendor/stores/delete")) {
            deleteStore(request, response);
        }
        else if (request.getServletPath().equals("/signin")) {
            Login(request, response);
        }

    }

    private void deleteStore(HttpServletRequest request, HttpServletResponse response) {
    }

    private void updateStore(HttpServletRequest request, HttpServletResponse response)  {
        try{
            int idStore = request.getParameter("id") != null ? Integer.parseInt(request.getParameter("id")) : 0;
            if (idStore == 0) {
                out.println("id store is not found");
                return;
            }
            else {
                StoreEntityTrung store = new StoreEntityTrung();
                store.setName(request.getParameter("name"));
                store.setBio(request.getParameter("bio"));
//                store.setOwnerId(Integer.parseInt(request.getParameter("ownerId")));
                if (request.getPart("images").getSize() > 0) {
                    String fileName = store.getName() + System.currentTimeMillis();
                    store.setAvatar(
                            UploadUtils.processUpload("images", request, "F:\\IMG\\store", fileName));
                    storeDAO.updateStoreHaveAvatar(idStore, store.getName(), store.getBio(), store.getAvatar());
                }
                else {
                    storeDAO.updateStoreExceptAvatar(idStore,  store.getName(), store.getBio());
                }

                response.sendRedirect("/Final_Project/vendor/stores-list");
            }
        }
        catch (Exception e) {
            e.printStackTrace();

        }
    }


    protected void createStore(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            StoreEntityTrung store = new StoreEntityTrung();
            store.setName(request.getParameter("name"));
            store.setBio(request.getParameter("bio"));
            store.setOwnerId(Integer.parseInt(request.getParameter("ownerId")));
            //store.setAvatar(request.getParameter("avatar"));
            if (request.getPart("images").getSize() > 0) {
                String fileName = store.getName() + System.currentTimeMillis();
                store.setAvatar(
                        UploadUtils.processUpload("images", request, "F:\\IMG\\store", fileName));
            }
            else {
                store.setAvatar("store_default.jpg");
            }

            storeDAO.createStore(store);
            PrintWriter out = response.getWriter();
            out.println("Create store successfully");
            response.sendRedirect("/Final_Project/vendor/stores-list");
        }
        catch (Exception e) {
            e.printStackTrace();
            PrintWriter out = response.getWriter();
            out.println("Create store FAILED");
        }
    }

    protected void readAllStore(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();
            UserEntity user = (UserEntity) session.getAttribute("User");
            int id = user.get_id();
            out.println(id);
            List<StoreEntityTrung> storeList = storeDAO.getStoreById(id);
            request.setAttribute("storeList", storeList);
            for (StoreEntityTrung store : storeList) {
                out.println(store.getCreatedAt());
            }

            //paging
            int page = 1;
            int recordsPerPage = 4;
            if(request.getParameter("page") != null){
                page = Integer.parseInt(request.getParameter("page"));
            }
            int count = storeDAO.getTotalStoreById(id);
            int endPage = count / recordsPerPage;
            if (count % recordsPerPage > 0) {
                endPage++;
            }
            request.setAttribute("endPage", endPage);
            request.setAttribute("currentPage", page);
            request.setAttribute("storeList", storeDAO.getStoreByPage(id, page, recordsPerPage));

            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/apps-projects-list.jsp");
            dispatcher.forward(request, response);
        }
        catch (Exception e) {
            e.printStackTrace();
            PrintWriter out = response.getWriter();
            out.println("Read all store FAILED");
        }
        return;
    }

    protected void Login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserEntity User = null;
        HttpSession session = request.getSession();
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String Username = request.getParameter("username");
            String Password = request.getParameter("password-input");
            String Role = request.getParameter("role");
            String remember =request.getParameter("auth-remember-check");
            out.println(Username);
            out.println(Password);
            out.println(Role);
            User = storeDAO.GetUserLogin(Username, Password, Role);
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
                //request.getRequestDispatcher("/store/list").forward(request, response);
//                if (Role.equals("Vendor")){
//                    response.sendRedirect("/vendorTrung_war/vendor/stores");
//                }

                request.getRequestDispatcher("/views/web/Trung/home.jsp").forward(request, response);
            }
            else {
                out.println("Login failed");
                //request.setAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng!");
                //request.getRequestDispatcher("/views/web/Login_Register.jsp").forward(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Eror: " + e.getMessage());
        }

    }
}
