
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

import com.zaitoneh.storeManagement.model.Supplier;
import com.zaitoneh.storeManagement.service.SupplierService;




@RestController
public class SupplierControllerREST {

    @Autowired
    private SupplierService supplierService;

  
    // display list of items
    @GetMapping("/listSupplierREST")
    public  List<Supplier>  listSupplier(Model model)  {
 	 
   	 return supplierService.getAllSuppliers() ;
      
    }
    
    //http://localhost:8080/ItemId?ItemId=56
    @GetMapping("/SupplierId")
    public  Supplier getSupplierById(@RequestParam  Long supplierId)  {

    	return supplierService.getSupplierById(supplierId);    
       
       }
    
    @PostMapping("/newSupplier")
    
    public void    saveSupplier(@RequestBody Supplier supplier) {
    	 try {
    	  // save item to database
       supplierService.saveSupplier(supplier);
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




@DeleteMapping("/suppliers/{id}")
public Map<String, Boolean> deleteSupplier(@PathVariable(value = "id") Long supplierId)
    	
    */
    
    
   @DeleteMapping("/deleteSupplier")
   public     boolean   deleteSupplier(@RequestParam  Long supplierId)  
   {

    try {
    	 
    	    	
    	supplierService.deleteSupplierById(supplierId);
    	return true;
    	
     }
   catch (Exception e) { 
     e.printStackTrace();
 	return false;
        
   }    
    
    }
    


    

    
   
}