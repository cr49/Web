package Controller;

import DAO.*;
import DAO.Imp.*;
import Entity.ProductEntity;
import Entity.ProductImagesEntity;
import Entity.ProductListTrung;
import Entity.ProductSizeEntity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@WebServlet(urlPatterns ={ "/vendor/products/new","/vendor/products","/vendor/products/edit","/vendor/products/delete","/vendor/products/search"})
public class ProductControllerTrung extends HttpServlet {

    IProductDAOTrung productDAOTrung = new ProductDAOImpTrung();
    IProductImagesDAOTrung productImagesDAOTrung = new ProductImagesDAOImpTrung();

    IProductSizeDAOTrung productSizeDAOTrung = new ProductSizeDAOImpTrung();

    ICategoryDAOTrung categoryDAOTrung = new CategoryDAOImpTrung();
    IOrderItemDAOTrung orderItemDAOTrung = new OrderItemDAOImpTrung();
    String image1 = "";
    String image2 = "";
    String image3 = "";
    String image4 = "";

    String updateImage1 = "";
    String updateImage2 = "";
    String updateImage3 = "";
    String updateImage4 = "";
    String search_tmp="";
    boolean changeImage = false;
    int loadProductId = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (request.getServletPath().equals("/vendor/products/new")) {

            if (request.getParameter("img1") != null) {
                System.out.println("img1: " + request.getParameter("img1"));
                image1 = request.getParameter("img1");
                request.setAttribute("img1", request.getParameter("img1"));
            } else {
                request.setAttribute("img1", image1);
            }
            if (request.getParameter("img2") != null) {
                System.out.println("img2: " + request.getParameter("img2"));
                image2 = request.getParameter("img2");
                request.setAttribute("img2", request.getParameter("img2"));
            } else {
                request.setAttribute("img2", image2);
            }
            if (request.getParameter("img3") != null) {
                System.out.println("img3: " + request.getParameter("img3"));
                image3 = request.getParameter("img3");
                request.setAttribute("img3", request.getParameter("img3"));
            } else {
                request.setAttribute("img3", image3);
            }
            if (request.getParameter("img4") != null) {
                System.out.println("img4: " + request.getParameter("img4"));
                image4 = request.getParameter("img4");
                request.setAttribute("img4", request.getParameter("img4"));
            } else {
                request.setAttribute("img4", image4);
            }
            request.setAttribute("categories", categoryDAOTrung.getTotalCategory());
            loadAddProduct(request, response);

        }
        else if (request.getServletPath().equals("/vendor/products")) {
//            request.setAttribute("products", productDAOTrung.getTotalProduct());
            if (request.getParameter(("id_Product"))!= null){
                int id = Integer.parseInt(request.getParameter("id_Product"));
                String CategoryName = categoryDAOTrung.getNameCategoryByIdProduct(productDAOTrung.getProductById(id).getCategoryId());
                List<ProductSizeEntity> productSizeEntities = productSizeDAOTrung.getProductSizeByProductId(id);
                List<String> stockOfSize = new ArrayList<>();
                for (ProductSizeEntity productSizeEntity : productSizeEntities){
                    String tmp = "";
                    tmp += productSizeEntity.getQuantity() + " Items Available";
                    stockOfSize.add(tmp);
                }
                request.setAttribute("product", productDAOTrung.getProductById(id));
                request.setAttribute("productImages", productImagesDAOTrung.getProductImagesById(id));
                request.setAttribute("categoryName", CategoryName);
                request.setAttribute("stock", productSizeDAOTrung.totalQuantity(id));
                request.setAttribute("stockOfSize", stockOfSize);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/apps-ecommerce-product-details.jsp");
                dispatcher.forward(request, response);
            }else {
                loadProducts(request, response);
            }
        }
        else if (request.getServletPath().equals("/vendor/products/edit")) {
            if (request.getParameter("img1") != null){
                System.out.println("img1: " + request.getParameter("img1"));
                updateImage1 = request.getParameter("img1");
                request.setAttribute("img1", request.getParameter("img1"));
                changeImage = true;
            }
            if (request.getParameter("img2") != null){
                System.out.println("img2: " + request.getParameter("img2"));
                updateImage2 = request.getParameter("img2");
                request.setAttribute("img2", request.getParameter("img2"));changeImage = true;
            }
            if (request.getParameter("img3") != null){
                System.out.println("img3: " + request.getParameter("img3"));
                updateImage3 = request.getParameter("img3");
                request.setAttribute("img3", request.getParameter("img3"));changeImage = true;
            }
            if (request.getParameter("img4") != null){
                System.out.println("img4: " + request.getParameter("img4"));
                updateImage4 = request.getParameter("img4");
                request.setAttribute("img4", request.getParameter("img4"));changeImage = true;
            }
            loadUpdateProduct(request, response);
        }
        else if (request.getServletPath().equals("/vendor/products/delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            List<Integer> listId = orderItemDAOTrung.listProductIdGroupBy();
            boolean check = false;
            //check product có trong orderItem chưa
            for (Integer integer : listId){
                if (integer == id){
                    check = true;
                    break;
                }
            }
            if (check) {
                request.setAttribute("message", "Not allow to delete this product");
            }
            else {
                request.setAttribute("message", "");
                productDAOTrung.deleteProduct(id);
            }
            response.sendRedirect("/Final_Project/vendor/products");
        }
        else if (request.getServletPath().equals("/vendor/products/search")){
            loadSearchProduct(request, response);
        }
    }

    private void loadSearchProduct(HttpServletRequest request, HttpServletResponse response) {
        try{


            List<ProductListTrung> productListTrung = new ArrayList<>();
            String search = request.getParameter("search");
            if (search == null){
                search = "";
            }
            if (request.getParameter("page")!=null){
search=search_tmp;
            }
            search_tmp=search;
//            System.out.println("storeID= " + request.getSession().getAttribute("storeId").toString());
            List<ProductEntity> productEntityList = productDAOTrung.searchProductByName(search,Integer.parseInt(request.getSession().getAttribute("idStore").toString()));
            System.out.println("Product search list: "+ productEntityList);
//            List<ProductEntity> productEntityList = productDAOTrung.getAllProductByStoreId(Integer.parseInt(request.getSession().getAttribute("idStore").toString()));
            List<ProductImagesEntity> productImagesEntityList = productImagesDAOTrung.getAllProductImages();
            List<ProductSizeEntity> productSizeEntityList = productSizeDAOTrung.getAllProductSize();

            //
            List<ProductImagesEntity> productImagesEntityList_change = new ArrayList<>();
            int idProduct = 0;
            for (ProductImagesEntity productImagesEntity : productImagesEntityList) {
                if (idProduct != productImagesEntity.getProductId()) {
                    idProduct = productImagesEntity.getProductId();
                    productImagesEntityList_change.add(productImagesEntity);
                }
            }

            //
            List<ProductSizeEntity> productSizeEntityList_change = new ArrayList<>();
            int idProductSize = 0;
            int totalQuantity = 0;
            ProductSizeEntity productSizeEntity_temp = new ProductSizeEntity();
            for (ProductSizeEntity productSizeEntity : productSizeEntityList) {
                if (idProductSize != productSizeEntity.getProductId()) {
                    totalQuantity = 0;
                    if (idProductSize != 0)
                        productSizeEntityList_change.add(productSizeEntity_temp);
                    idProductSize = productSizeEntity.getProductId();
                    totalQuantity = productSizeEntity.getQuantity();
                    productSizeEntity_temp = productSizeEntity;
                }
                else {
                    //productSizeEntity_temp = productSizeEntity;
                    totalQuantity += productSizeEntity.getQuantity();
                    productSizeEntity_temp.setQuantity(totalQuantity);
                }
            }
            productSizeEntityList_change.add(productSizeEntity_temp);

            //
            for (ProductEntity productEntity : productEntityList) {
                ProductListTrung productListTrung_temp = new ProductListTrung();
                productListTrung_temp.set_id(productEntity.get_id());
                productListTrung_temp.setName(productEntity.getName());
                productListTrung_temp.setPrice(productEntity.getPrice());
                productListTrung_temp.setRating(productEntity.getRating());
                productListTrung_temp.setSelling(productEntity.isSelling());
                for (ProductImagesEntity productImagesEntity : productImagesEntityList_change) {
                    if (productImagesEntity.getProductId() == productEntity.get_id()) {
                        productListTrung_temp.setUrl_image(productImagesEntity.getUrl_image());
                        break;
                    }
                }
                for (ProductSizeEntity productSizeEntity : productSizeEntityList_change) {
                    if (productSizeEntity.getProductId() == productEntity.get_id()) {
                        productListTrung_temp.setStock(productSizeEntity.getQuantity());
                        break;
                    }
                }
                productListTrung.add(productListTrung_temp);
            }

            System.out.println("productListTrung: " + productListTrung);

            //request.setAttribute("products", productListTrung);

            //paging
            int page = 1;
            if(request.getParameter("page") != null){
                page = Integer.parseInt(request.getParameter("page"));
            }
            int totalProduct = productListTrung.size();
            int totalPage = totalProduct / 5;
            if (totalProduct % 5 != 0) {
                totalPage++;
            }

            List<ProductListTrung> productListTrung_paging = new ArrayList<>();
            int start = (page - 1) * 5;
            int end = start + 5;
            if (end > totalProduct) {
                end = totalProduct;
            }
            for (int i = start; i < end; i++) {
                productListTrung_paging.add(productListTrung.get(i));
            }

            request.setAttribute("endPage", totalPage);
            request.setAttribute("currentPage", page);
            request.setAttribute("products", productListTrung_paging);

            //request.setAttribute("products", productDAOTrung.getTotalProduct());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/apps-ecom-search-products.jsp");
            dispatcher.forward(request, response);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void loadAddProduct(HttpServletRequest request, HttpServletResponse response) {
        try {
            //product
            ProductEntity product = new ProductEntity();
            if (request.getParameter("name") != null) {
                product.setName(request.getParameter("name"));
            }
            if (request.getParameter("price") != null) {
                product.setPrice(Integer.parseInt(request.getParameter("price")));
            }
            if (request.getParameter("description") != null) {
                product.setDescription(request.getParameter("description"));
            }
            if (request.getParameter("choice-category-input") != null) {
                product.setCategoryId(Integer.parseInt(request.getParameter("choice-category-input")));
            }
            product.setStoreId(Integer.parseInt(request.getSession().getAttribute("idStore").toString()));
            //0 or 1
            if (request.getParameter("choices-publish-status-input") != null) {
                String selling = request.getParameter("choices-publish-status-input");
                product.setSelling(Objects.equals(selling, "Published"));
            }
            if (request.getParameter("choices-publish-visibility-input") != null) {
                String active = request.getParameter("choices-publish-visibility-input");
                product.setActive(Objects.equals(active, "Public"));
            }
//            String selling = request.getParameter("choices-publish-status-input");
//            String active = request.getParameter("choices-publish-visibility-input");
//            product.setSelling(Objects.equals(selling, "Published"));
//            product.setActive(Objects.equals(active, "Public"));
            //product.setActive(true);
            //product.setSelling(true);

            //DONE PRODUCT
            //productDAOTrung.createProduct(product);


            //get last id of product
            int idProduct = productDAOTrung.getlastId();
            //product images
            List<ProductImagesEntity> productImagesEntities = new ArrayList<>();
            //ProductImagesEntity productImages = new ProductImagesEntity();
            String[] images = new String[4];
            images[0] = image1;
            images[1] = image2;
            images[2] = image3;
            images[3] = image4;

            for (int i = 0; i < 4; i++) {
                ProductImagesEntity productImages = new ProductImagesEntity();
                productImages.setProductId(idProduct);
                productImages.setUrl_image(images[i]);
                productImagesEntities.add(productImages);
            }
//                response.sendRedirect("/vendor/products");


            //product size
            String[] sizes = new String[4];
            sizes[0] = request.getParameter("size-s");
            sizes[1] = request.getParameter("size-m");
            sizes[2] = request.getParameter("size-l");
            sizes[3] = request.getParameter("size-xl");

            Integer[] quantity = new Integer[4];
            if (request.getParameter("quantity-s") != null) {
                quantity[0] = Integer.parseInt(request.getParameter("quantity-s"));
            }
            if (request.getParameter("quantity-m") != null) {
                quantity[1] = Integer.parseInt(request.getParameter("quantity-m"));
            }
            if (request.getParameter("quantity-l") != null) {
                quantity[2] = Integer.parseInt(request.getParameter("quantity-l"));
            }
            if (request.getParameter("quantity-xl") != null) {
                quantity[3] = Integer.parseInt(request.getParameter("quantity-xl"));
            }

//            quantity[0] = Integer.parseInt(request.getParameter("quantity-s"));
//            quantity[1] = Integer.parseInt(request.getParameter("quantity-m"));
//            quantity[2] = Integer.parseInt(request.getParameter("quantity-l"));
//            quantity[3] = Integer.parseInt(request.getParameter("quantity-xl"));

            List<ProductSizeEntity> productSizeEntities = new ArrayList<>();
            //ProductSizeEntity productSize = new ProductSizeEntity();
            for (int i = 0; i < 4; i++) {
                ProductSizeEntity productSize = new ProductSizeEntity();
                productSize.setProductId(idProduct);
                productSize.setSize(sizes[i]);
                if (quantity[i] != null) {
                    productSize.setQuantity(quantity[i]);
                }
                productSizeEntities.add(productSize);
            }

            System.out.println("product: " + product);
            System.out.println("productImagesEntities: " + productImagesEntities);
            System.out.println("productSizeEntities: " + productSizeEntities);
            //upload data to jsp
            request.setAttribute("name", product.getName());
            request.setAttribute("price", product.getPrice());
            request.setAttribute("description", product.getDescription());
            request.setAttribute("category", product.getCategoryId());
            request.setAttribute("selling", product.isSelling());
            request.setAttribute("active", product.isActive());
            request.setAttribute("image1", productImagesEntities.get(0).getUrl_image());
            request.setAttribute("image2", productImagesEntities.get(1).getUrl_image());
            request.setAttribute("image3", productImagesEntities.get(2).getUrl_image());
            request.setAttribute("image4", productImagesEntities.get(3).getUrl_image());
            request.setAttribute("sizeS", productSizeEntities.get(0).getSize());
            request.setAttribute("sizeM", productSizeEntities.get(1).getSize());
            request.setAttribute("sizeL", productSizeEntities.get(2).getSize());
            request.setAttribute("sizeXL", productSizeEntities.get(3).getSize());
            request.setAttribute("quantity-s", productSizeEntities.get(0).getQuantity());
            request.setAttribute("quantity-m", productSizeEntities.get(1).getQuantity());
            request.setAttribute("quantity-l", productSizeEntities.get(2).getQuantity());
            request.setAttribute("quantity-xl", productSizeEntities.get(3).getQuantity());
            //request.setAttribute("idProduct", idProduct);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/apps-ecommerce-add-product_back.jsp");
            dispatcher.forward(request, response);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (request.getServletPath().equals("/vendor/products/new")) {
            addProduct(request, response);
        }
        else if (request.getServletPath().equals("/vendor/products/edit")) {
            updateProduct(request, response);
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        try {
            //product
            int id = Integer.parseInt(request.getParameter("id"));
            ProductEntity product = new ProductEntity();
            product.set_id(id);
            product.setName(request.getParameter("name"));
            product.setPrice(Integer.parseInt(request.getParameter("price")));
            product.setDescription(request.getParameter("description"));
            //choose category
            String category = request.getParameter("choices-category-input");
            product.setCategoryId(Integer.parseInt(category));
            //product.setCategoryId(1);
            product.setStoreId(Integer.parseInt(request.getSession().getAttribute("idStore").toString()));
            //0 or 1
            String selling = request.getParameter("choices-publish-status-input");
            String active = request.getParameter("choices-publish-visibility-input");
            product.setSelling(Objects.equals(selling, "Published"));
            product.setActive(Objects.equals(active, "Public"));
            //product.setActive(true);
            //product.setSelling(true);

            productDAOTrung.updateProduct(product);


            //get last id of product
            int idProduct = id;
            //product images
            ProductImagesEntity productImages = new ProductImagesEntity();
            String[] images = new String[4];
            images[0] = updateImage1;
            images[1] = updateImage2;
            images[2] = updateImage3;
            images[3] = updateImage4;

            List<Integer> idImages = productImagesDAOTrung.get_IdByProductId(idProduct);

            for (int i = 0; i < images.length; i++) {
                productImages.set_id(idImages.get(i));
                productImages.setProductId(idProduct);
                productImages.setUrl_image(images[i]);
                productImagesDAOTrung.updateProductImages(productImages);
            }

//            for (String image : images) {
//                if (!Objects.equals(image, "")) {
//                    productImages.setUrl_image(image);
//                    productImages.setProductId(idProduct);
//                    productImagesDAOTrung.updateProductImages(productImages);
//                }
////                    productImages.setProductId(idProduct);
////                    productImages.setUrl_image(images[i]);
////                    productImagesDAOTrung.createProductImages(productImages);
//            }
//                response.sendRedirect("/vendor/products");


            //product size
            String[] sizes = new String[4];
            sizes[0] = request.getParameter("size-s");
            sizes[1] = request.getParameter("size-m");
            sizes[2] = request.getParameter("size-l");
            sizes[3] = request.getParameter("size-xl");

            Integer[] quantity = new Integer[4];
            quantity[0] = Integer.parseInt(request.getParameter("quantity-s"));
            quantity[1] = Integer.parseInt(request.getParameter("quantity-m"));
            quantity[2] = Integer.parseInt(request.getParameter("quantity-l"));
            quantity[3] = Integer.parseInt(request.getParameter("quantity-xl"));

            List<Integer> idSize = productSizeDAOTrung.get_IdByProductId(idProduct);


            ProductSizeEntity productSize = new ProductSizeEntity();
            for (int i = 0; i < sizes.length; i++) {
                if (!Objects.equals(sizes[i], "")) {
                    productSize.set_id(idSize.get(i));
                    productSize.setProductId(idProduct);
                    productSize.setSize(sizes[i]);
                    productSize.setQuantity(quantity[i]);
                    productSizeDAOTrung.updateProductSize(productSize);
                }
            }

            updateImage1 = "";
            updateImage2 = "";
            updateImage3 = "";
            updateImage4 = "";

            response.sendRedirect("/Final_Project/vendor/products");

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadUpdateProduct(HttpServletRequest request, HttpServletResponse response) {
        try {
            int id;
            if (request.getParameter("id")==null){
                id = loadProductId;
            }
            else{
                id = Integer.parseInt(request.getParameter("id"));
                loadProductId = id;
            }
            //set all attribute
//            int id = Integer.parseInt(request.getParameter("id"));
//            loadProductId = id;
            ProductEntity productEntity = productDAOTrung.getProductById(id);
            List<ProductImagesEntity> productImagesEntities = productImagesDAOTrung.getProductImagesById(id);
            List<ProductSizeEntity> productSizeEntities = productSizeDAOTrung.getProductSizeByProductId(id);
            request.setAttribute("product", productEntity);
            request.setAttribute("productImages", productImagesEntities);


            if (changeImage){
                if (updateImage1 != null){
                    request.setAttribute("image1", updateImage1);
                }
                if (updateImage2 != null){
                    request.setAttribute("image2", updateImage2);
                }
                if (updateImage3 != null){
                    request.setAttribute("image3", updateImage3);
                }
                if (updateImage4 != null){
                    request.setAttribute("image4", updateImage4);
                }
            }else {
                updateImage1 = productImagesEntities.get(0).getUrl_image();
                updateImage2 = productImagesEntities.get(1).getUrl_image();
                updateImage3 = productImagesEntities.get(2).getUrl_image();
                updateImage4 = productImagesEntities.get(3).getUrl_image();
            }
            changeImage = false;


            int quantitySizeS = productSizeEntities.get(0).getQuantity();
            int quantitySizeM = productSizeEntities.get(1).getQuantity();
            int quantitySizeL = productSizeEntities.get(2).getQuantity();
            int quantitySizeXL = productSizeEntities.get(3).getQuantity();

            request.setAttribute("img1", updateImage1);
            request.setAttribute("img2", updateImage2);
            request.setAttribute("img3", updateImage3);
            request.setAttribute("img4", updateImage4);
            request.setAttribute("categories", categoryDAOTrung.getTotalCategory());
            request.setAttribute("productSize", productSizeEntities);
            request.setAttribute("quantitySizeS", quantitySizeS);
            request.setAttribute("quantitySizeM", quantitySizeM);
            request.setAttribute("quantitySizeL", quantitySizeL);
            request.setAttribute("quantitySizeXL", quantitySizeXL);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/apps-ecommerce-edit-product.jsp");
            dispatcher.forward(request, response);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            List<ProductListTrung> productListTrung = new ArrayList<>();

            List<ProductEntity> productEntityList = productDAOTrung.getAllProductByStoreId(Integer.parseInt(request.getSession().getAttribute("idStore").toString()));
            List<ProductImagesEntity> productImagesEntityList = productImagesDAOTrung.getAllProductImages();
            List<ProductSizeEntity> productSizeEntityList = productSizeDAOTrung.getAllProductSize();

            //
            List<ProductImagesEntity> productImagesEntityList_change = new ArrayList<>();
            int idProduct = 0;
            for (ProductImagesEntity productImagesEntity : productImagesEntityList) {
                if (idProduct != productImagesEntity.getProductId()) {
                    idProduct = productImagesEntity.getProductId();
                    productImagesEntityList_change.add(productImagesEntity);
                }
            }

            //
            List<ProductSizeEntity> productSizeEntityList_change = new ArrayList<>();
            int idProductSize = 0;
            int totalQuantity = 0;
            ProductSizeEntity productSizeEntity_temp = new ProductSizeEntity();
            for (ProductSizeEntity productSizeEntity : productSizeEntityList) {
                if (idProductSize != productSizeEntity.getProductId()) {
                    totalQuantity = 0;
                    if (idProductSize != 0)
                        productSizeEntityList_change.add(productSizeEntity_temp);
                    idProductSize = productSizeEntity.getProductId();
                    totalQuantity = productSizeEntity.getQuantity();
                    productSizeEntity_temp = productSizeEntity;
                }
                else {
                    //productSizeEntity_temp = productSizeEntity;
                    totalQuantity += productSizeEntity.getQuantity();
                    productSizeEntity_temp.setQuantity(totalQuantity);
                }
            }
            productSizeEntityList_change.add(productSizeEntity_temp);

            //
            for (ProductEntity productEntity : productEntityList) {
                ProductListTrung productListTrung_temp = new ProductListTrung();
                productListTrung_temp.set_id(productEntity.get_id());
                productListTrung_temp.setName(productEntity.getName());
                productListTrung_temp.setPrice(productEntity.getPrice());
                productListTrung_temp.setRating(productEntity.getRating());
                productListTrung_temp.setSelling(productEntity.isSelling());
                for (ProductImagesEntity productImagesEntity : productImagesEntityList_change) {
                    if (productImagesEntity.getProductId() == productEntity.get_id()) {
                        productListTrung_temp.setUrl_image(productImagesEntity.getUrl_image());
                        break;
                    }
                }
                for (ProductSizeEntity productSizeEntity : productSizeEntityList_change) {
                    if (productSizeEntity.getProductId() == productEntity.get_id()) {
                        productListTrung_temp.setStock(productSizeEntity.getQuantity());
                        break;
                    }
                }
                productListTrung.add(productListTrung_temp);
            }

            System.out.println("productListTrung: " + productListTrung);

            //request.setAttribute("products", productListTrung);

            //paging
            int page = 1;
            if(request.getParameter("page") != null){
                page = Integer.parseInt(request.getParameter("page"));
            }
            int totalProduct = productListTrung.size();
            int totalPage = totalProduct / 5;
            if (totalProduct % 5 != 0) {
                totalPage++;
            }

            List<ProductListTrung> productListTrung_paging = new ArrayList<>();
            int start = (page - 1) * 5;
            int end = start + 5;
            if (end > totalProduct) {
                end = totalProduct;
            }
            for (int i = start; i < end; i++) {
                productListTrung_paging.add(productListTrung.get(i));
            }

            request.setAttribute("endPage", totalPage);
            request.setAttribute("currentPage", page);
            request.setAttribute("products", productListTrung_paging);

            //request.setAttribute("products", productDAOTrung.getTotalProduct());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Trung/apps-ecommerce-products.jsp");
            dispatcher.forward(request, response);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void addProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //product
            ProductEntity product = new ProductEntity();
            product.setName(request.getParameter("name"));
            product.setPrice(Integer.parseInt(request.getParameter("price")));
            product.setDescription(request.getParameter("description"));
            //choose category
            String category = request.getParameter("choices-category-input");
            product.setCategoryId(Integer.parseInt(category));
            //product.setCategoryId(1);
            product.setStoreId(Integer.parseInt(request.getSession().getAttribute("idStore").toString()));
            //0 or 1
            String selling = request.getParameter("choices-publish-status-input");
            String active = request.getParameter("choices-publish-visibility-input");
            product.setSelling(Objects.equals(selling, "Published"));
            product.setActive(Objects.equals(active, "Public"));
            //product.setActive(true);
            //product.setSelling(true);

            productDAOTrung.createProduct(product);


            //get last id of product
            int idProduct = productDAOTrung.getlastId();
            //product images
            ProductImagesEntity productImages = new ProductImagesEntity();
            String[] images = new String[4];
            images[0] = image1;
            images[1] = image2;
            images[2] = image3;
            images[3] = image4;

                for (String image : images) {
                    if (!Objects.equals(image, "")) {
                        productImages.setUrl_image(image);
                        productImages.setProductId(idProduct);
                        productImagesDAOTrung.createProductImages(productImages);
                    }
//                    productImages.setProductId(idProduct);
//                    productImages.setUrl_image(images[i]);
//                    productImagesDAOTrung.createProductImages(productImages);
                }
//                response.sendRedirect("/vendor/products");


            //product size
            String[] sizes = new String[4];
            sizes[0] = request.getParameter("size-s");
            sizes[1] = request.getParameter("size-m");
            sizes[2] = request.getParameter("size-l");
            sizes[3] = request.getParameter("size-xl");

            Integer[] quantity = new Integer[4];
            quantity[0] = Integer.parseInt(request.getParameter("quantity-s"));
            quantity[1] = Integer.parseInt(request.getParameter("quantity-m"));
            quantity[2] = Integer.parseInt(request.getParameter("quantity-l"));
            quantity[3] = Integer.parseInt(request.getParameter("quantity-xl"));

            ProductSizeEntity productSize = new ProductSizeEntity();
            for (int i = 0; i < sizes.length; i++) {
                if (!Objects.equals(sizes[i], "")) {
                    productSize.setProductId(idProduct);
                    productSize.setSize(sizes[i]);
                    productSize.setQuantity(quantity[i]);
                    productSizeDAOTrung.createProductSize(productSize);
                }
            }

            response.sendRedirect("/Final_Project/vendor/products");

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
