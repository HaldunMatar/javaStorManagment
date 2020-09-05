package com.zaitoneh.storeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zaitoneh.storeManagement.model.ReceiptDetail;



@Repository 
public interface  ReceiptDetailRepository  extends JpaRepository< ReceiptDetail,Long>
   {

	
	
   }
