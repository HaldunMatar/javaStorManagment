package com.zaitoneh.storeManagement.service;

import com.zaitoneh.storeManagement.model.ReceiptDetail;

public interface  ReceiptDetailService {
	
    void saveReceiptDetail (ReceiptDetail receipt) ;

	
	  
    ReceiptDetail getReceiptDetailById(long id); 


	 void deleteReceiptDetailById(long id);



}
