package com.zaitoneh.storeManagement.service;

import java.util.List;

import com.zaitoneh.storeManagement.model.Employee;
import com.zaitoneh.storeManagement.model.Receipt;

public interface  ReceiptService {
	 List<Receipt> getAllReceipts();
	
    int  saveReceipt (Receipt receipt) ;

	
	  
    Receipt getReceiptById(long id); 


	 void deleteReceiptById(long id);
	 
	 void deleteAllreceipt();
	 



	
	

	
	 
}