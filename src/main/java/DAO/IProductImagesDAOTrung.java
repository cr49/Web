package DAO;

import Entity.ProductImagesEntity;

import java.util.List;

public interface IProductImagesDAOTrung {
    //create
    ProductImagesEntity createProductImages(ProductImagesEntity productImages);

    //update
    ProductImagesEntity updateProductImages(ProductImagesEntity productImages);

    //read all
    List<ProductImagesEntity> getAllProductImages();

    //read by id
    List<ProductImagesEntity> getProductImagesById(int id);

    List<Integer> get_IdByProductId(int id);
}
