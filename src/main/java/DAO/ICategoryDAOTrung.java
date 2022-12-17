package DAO;

import Entity.CategoryEntity;

import java.util.List;

public interface ICategoryDAOTrung {
    List<CategoryEntity> getTotalCategory();

    String getNameCategoryByIdProduct(int id);
}
