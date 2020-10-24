
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


import com.zaitoneh.storeManagement.model.Store;

import com.zaitoneh.storeManagement.service.StoreService;

@RestController
public class StoreControllerREST {

    @Autowired
    private StoreService itemService;

  
    // display list of items
    @GetMapping("/listStoresREST")
    public  List<Store>  listStores(Model model)  {
 	 
   	 return itemService.getAllStores() ;
      
    }
    
    //http://localhost:8080/ItemId?ItemId=56
    @GetMapping("/StoreId")
    public  Store getStoreById(@RequestParam  Long storeId)  {

    	return itemService.getStoreById(storeId);    
       
       }
    
    @PostMapping("/newStore")
    
    public void    saveStore(@RequestBody Store store) {
    	 try {
    	  // save item to database
       itemService.saveStore(store);
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




@DeleteMapping("/employees/{id}")
public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
    	
    */
    
    
   @DeleteMapping("/deleteStore")
   public     boolean   deleteStore(@RequestParam  Long storeId)  
   {

    try {
    	 
    	    	
    	itemService.deleteStoreById(storeId);
    	return true;
    	
     }
   catch (Exception e) { 
     e.printStackTrace();
 	return false;
        
   }    
    
    }
    


    

    
   
}