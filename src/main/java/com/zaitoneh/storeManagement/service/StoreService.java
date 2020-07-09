package com.zaitoneh.storeManagement.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.zaitoneh.storeManagement.model.Store;

public interface StoreService {
 List<Store> getAllStores();
 



void saveStore(Store employee);
 
Store getStoreById(long id); 


void deleteStoreById(long id);


Page <Store> findPaginated(int pageNo, int pageSize);
Page <Store> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}