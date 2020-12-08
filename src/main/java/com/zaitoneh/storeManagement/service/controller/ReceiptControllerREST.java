
package com.zaitoneh.storeManagement.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zaitoneh.storeManagement.model.Receipt;
import com.zaitoneh.storeManagement.model.ReceiptDetail;
import com.zaitoneh.storeManagement.service.ReceiptDetailService;
import com.zaitoneh.storeManagement.service.ReceiptService;




@RestController
public class ReceiptControllerREST {

    @Autowired
    private ReceiptService receiptService;

  
    // display list of items
    @GetMapping("/listReceiptREST")
    public  List<Receipt>  listReceipt(Model model)  {
 	 
   	 return receiptService.getAllReceipts() ;
      
    }
    
    //http://localhost:8080/ItemId?ItemId=56
    @GetMapping("/receiptId")
    public  Receipt getReceiptById(@RequestParam  Long receiptId)  {

    	return receiptService.getReceiptById(receiptId);    
       
       }
    
    @PostMapping("/newReceipt")
    
    public void    saveReceipt(@RequestBody Receipt receipt) {
    	 try {
    	  // save item to database
       receiptService.saveReceipt(receipt);
     }
   catch (Exception e) { 
      e.printStackTrace();
  }
    	 
    
    }	
    
   /* //http://localhost:8080/ItemId?ItemId=56
    @GetMapping("/ItemId")
    public  Item getItemById(@RequestParam  Long ItemId)  {
    
    
    
    @DeleteMapping(value = "/posts/{id}")
public ResponseEntity<Long> deletePost(@PathVariable Long id) {




@DeleteMapping("/receipts/{id}")
public Map<String, Boolean> deleteReceipt(@PathVariable(value = "id") Long receiptId)
    	
    */
    
    
   @DeleteMapping("/deleteReceipt")
   public     boolean   deleteReceipt(@RequestParam  Long receiptId)  
   {

    try {
    	 
    	    	
    	receiptService.deleteReceiptById(receiptId);
    	return true;
    	
     }
   catch (Exception e) { 
     e.printStackTrace();
 	return false;
        
   }    
    
    }
    
	@Autowired
	private  ReceiptDetailService  receiptDetailService ;

   // display list of listReceiptDetailREST
   @GetMapping("/listReceiptDetailREST")
   public  List<ReceiptDetail>  getAllReceiptDetailsREST(Model model)  {
	 
  	 return receiptDetailService.getAllReceiptDetails() ;
     
   }   

   @PostMapping("/newReceiptDetailtest")
   
   public void    saveReceiptDetail(@RequestBody ReceiptDetail receiptDetail) {
   	 try {
   	  // save item to database
   		 receiptDetailService.saveReceiptDetail(receiptDetail);
    }
  catch (Exception e) { 
     e.printStackTrace();
 }
   	 
   
   }
   
}