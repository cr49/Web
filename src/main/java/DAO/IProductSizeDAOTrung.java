package DAO;

import Entity.ProductSizeEntity;

import java.util.List;

public interface IProductSizeDAOTrung {
    //create
    ProductSizeEntity createProductSize(ProductSizeEntity productSize);

    //update
    ProductSizeEntity updateProductSize(ProductSizeEntity productSize);

    //read all
    List<ProductSizeEntity> getAllProductSize();

    int totalQuantity(int productId);

    List<ProductSizeEntity> getProductSizeByProductId(int productId);

    List<Integer> get_IdByProductId(int id);
}
