package com.zaitoneh.storeManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zaitoneh.storeManagement.model.Receipt;
import com.zaitoneh.storeManagement.model.ReceiptDetail;

@Repository 
public interface  ReceiptRepository  extends JpaRepository<Receipt,Long>
   {

	@Query(value = "SELECT receipt1  FROM  ReceiptDetail  receipt1  where  receipt1.receipt  = ?1 ")
	

	//@Query(value = "SELECT *  FROM  receipt_detail  where  receipt_id  = :receipId ", nativeQuery = true)
	List<ReceiptDetail> getReceiptDetailByReceipId(@Param("receipId") Receipt receipId);
	
   }
