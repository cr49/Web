package DAO;

import Entity.BestSellingProductsEntityTrung;
import Entity.ProductEntity;

import java.util.List;

public interface IProductDAOTrung {
    ProductEntity createProduct(ProductEntity product);
//    List<ProductEntity> getProductById(int _id);
    ProductEntity updateProduct(ProductEntity product);
    int getTotalProductById(int id);
    List<ProductEntity> getProductByPage(int id, int page, int pagesize);

    List<ProductEntity> getAllProductByStoreId(int id);

//    List<ProductEntity> getProductBy_Id(int id);

    ProductEntity getProductById(int _id);
    int getlastId();

    ProductEntity deleteProduct(int _id);

    List<ProductEntity> searchProductByName(String name, int storeId);

    List<BestSellingProductsEntityTrung> getBestSellingProductsByStoreId(int id);

    List<BestSellingProductsEntityTrung> getBestSellingProductsByStoreIdAndToday(int id);
    List<BestSellingProductsEntityTrung> getBestSellingProductsByStoreIdAndYesterday(int id);

    List<BestSellingProductsEntityTrung> getBestSellingProductsByStoreIdAndThisWeek(int id);

    List<BestSellingProductsEntityTrung> getBestSellingProductsByStoreIdAndThisMonth(int id);

    List<BestSellingProductsEntityTrung> getBestSellingProductsByStoreIdAndThisYear(int id);
}