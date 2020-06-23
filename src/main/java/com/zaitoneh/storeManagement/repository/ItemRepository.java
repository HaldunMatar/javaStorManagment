package com.zaitoneh.storeManagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.zaitoneh.storeManagement.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
