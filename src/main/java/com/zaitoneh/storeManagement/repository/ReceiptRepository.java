package com.zaitoneh.storeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zaitoneh.storeManagement.model.Receipt;

@Repository 
public interface  ReceiptRepository  extends JpaRepository<Receipt,Long>
   {

	
	
   }
