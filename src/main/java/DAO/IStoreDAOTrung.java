package DAO;

import Entity.StoreEntityTrung;
import Entity.UserEntity;

import java.util.List;

public interface IStoreDAOTrung {
    StoreEntityTrung createStore(StoreEntityTrung store);
    List<StoreEntityTrung> getStoreById(int _id);

    StoreEntityTrung updateStore(StoreEntityTrung store);

    int getTotalStoreById(int id);

    List<StoreEntityTrung> getStoreByPage(int id, int page, int pagesize);

    /////test login
    public UserEntity GetUserLogin(String username, String password, String role);

    StoreEntityTrung getStoreBy_Id(int _id);

    StoreEntityTrung updateStoreExceptAvatar(int _id,String name,String bio);
    StoreEntityTrung updateStoreHaveAvatar(int _id,String name,String bio,String avatar);

    StoreEntityTrung deleteStore(int _id);
}
