package com.zaitoneh.storeManagement.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zaitoneh.storeManagement.model.Department;
import com.zaitoneh.storeManagement.model.Receipt;
import com.zaitoneh.storeManagement.model.ReceiptDetail;

public interface  ReceiptDetailService {
	
    void saveReceiptDetail (ReceiptDetail receipt) ;

	
	  
    ReceiptDetail getReceiptDetailById(long id); 


	 void deleteReceiptDetailById(long id);



	void deleteReceiptDetailAll(List<ReceiptDetail> l);

	List<ReceiptDetail> getAllReceiptDetails();
	
	List<ReceiptDetail> 	getReceiptDetailsByReceipId(@Param("receiptId") Long receiptId);
	
	List<ReceiptDetail> getReceiptDetailByReceipId(@Param("receipId") Receipt receipId);
	
	 void deleteAllreceiptDetails();

	
	

}
