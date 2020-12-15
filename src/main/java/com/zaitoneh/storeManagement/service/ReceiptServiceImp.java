package com.zaitoneh.storeManagement.service;






import com.zaitoneh.storeManagement.model.Receipt;

import com.zaitoneh.storeManagement.repository.ReceiptRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class   ReceiptServiceImp implements ReceiptService{
	
 @Autowired
 private  ReceiptRepository receiptRepository; 
 

 @Override
public int saveReceipt (Receipt receipt) {
	 
	 this.receiptRepository.save(receipt);
	 
	 this.receiptRepository.flush();
	 return   this.receiptRepository.getCurrentId();
	 
   }

	
 @Override
 public
 Receipt getReceiptById(long id) {
	 Receipt receipt=null ;
     Optional<Receipt> optional = this.receiptRepository.findById(id)	;
     if(optional.isPresent()) {
	 receipt=optional.get();
     } 
     else {
	 throw new RuntimeException(" Receipt not found for id :: " + id);
     }
      return receipt;
}
  
 
 @Override
public
 void deleteReceiptById(long id) {
	 this.receiptRepository.deleteById(id);
 }


@Override
public List<Receipt> getAllReceipts() {
	// TODO Auto-generated method stub
	return receiptRepository.findAll();
}


@Override
public void deleteAllreceipt() {
	 receiptRepository.deleteAll();
	
}







	
}
