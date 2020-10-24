package com.zaitoneh.storeManagement.service;

import java.util.List;

import org.springframework.data.domain.Page;


import com.zaitoneh.storeManagement.model.Supplier;


public interface SupplierService {
 List<Supplier> getAllSuppliers();
 



void saveSupplier(Supplier employee);
 
Supplier getSupplierById(long id); 


void deleteSupplierById(long id);
Page < Supplier > findPaginated(int pageNo, int pageSize);
Page < Supplier > findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);


}