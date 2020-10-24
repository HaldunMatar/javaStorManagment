package com.zaitoneh.storeManagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.zaitoneh.storeManagement.model.Item;
import com.zaitoneh.storeManagement.model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long>{

}
