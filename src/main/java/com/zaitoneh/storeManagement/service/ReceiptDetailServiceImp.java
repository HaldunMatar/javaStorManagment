package com.zaitoneh.storeManagement.service;








import com.zaitoneh.storeManagement.model.ReceiptDetail;
import com.zaitoneh.storeManagement.repository.ReceiptDetailRepository;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class   ReceiptDetailServiceImp implements ReceiptDetailService{

	 @Autowired
	 private  ReceiptDetailRepository receiptDetailRepository; 
	 
	 
	 
	@Override
	public void saveReceiptDetail(ReceiptDetail receiptDetail) {
		 this.receiptDetailRepository.save(receiptDetail);
		
	}

	@Override
	public ReceiptDetail getReceiptDetailById(long id) {
		ReceiptDetail receiptDetail=null ;
	     Optional<ReceiptDetail> optional = this.receiptDetailRepository.findById(id)	;
	     if(optional.isPresent()) {
	    	 receiptDetail=optional.get();
	     } 
	     else {
		 throw new RuntimeException(" Receipt not found for id :: " + id);
	     }
	      return receiptDetail;
	}

	@Override
	public void deleteReceiptDetailById(long id) {
		// TODO Auto-generated method stub
		 this.receiptDetailRepository.deleteById(id);
	}

   }

