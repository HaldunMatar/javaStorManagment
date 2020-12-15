package com.zaitoneh.storeManagement.service;








import com.zaitoneh.storeManagement.model.Department;
import com.zaitoneh.storeManagement.model.Receipt;
import com.zaitoneh.storeManagement.model.ReceiptDetail;
import com.zaitoneh.storeManagement.repository.ReceiptDetailRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

	@Override
	public void deleteReceiptDetailAll(List<ReceiptDetail> List) {
		// TODO Auto-generated method stub
	

		
		 this.receiptDetailRepository.deleteAll(List);
		
	}

	@Override
	public List<ReceiptDetail> getReceiptDetailByReceipId(Receipt receipId) {
		// TODO Auto-generated method stub
		return 	 this.receiptDetailRepository.getReceiptDetailByReceipId(receipId);
	}

	
	@Override
	public void deleteAllreceiptDetails() {
	
		receiptDetailRepository.deleteAll();
	}

	@Override
	public List<ReceiptDetail> getAllReceiptDetails() {
		return receiptDetailRepository.findAll();
	}

	

	@Override
	public List<ReceiptDetail> getReceiptDetailsByReceipId(Long receiptId) {
		// TODO Auto-generated method stub;
		return receiptDetailRepository.getReceiptDetailsByReceipId(receiptId);
	}

	



   }

