
package com.zaitoneh.storeManagement.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zaitoneh.storeManagement.model.Employee;
import com.zaitoneh.storeManagement.model.Item;
import com.zaitoneh.storeManagement.service.ItemService;

@RestController
public class ItemControllerREST {

    @Autowired
    private ItemService itemService;

  
    // display list of items
    @GetMapping("/listItemsREST")
    public  List<Item>  listItems(Model model)  {
 	 
   	 return itemService.getAllItems() ;
    
    }
    //http://localhost:8080/ItemId?ItemId=56
    @GetMapping("/ItemId")
    public  Item getItemById(@RequestParam  Long ItemId)  {

    	return itemService.getItemById(ItemId);    
       
       }
    
    @PostMapping("/newItem")
    
    public void    saveItemNet(@RequestBody Item item) {
    	 try {
    	  // save item to database
       itemService.saveItem(item);
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
    
    
   @DeleteMapping("/deleteItem")
   public     boolean   deleteItemNet(@RequestParam  Long itemId)   {

    try {
    	 
    	    	
    	itemService.deleteItemById(itemId);
    	return true;
    	
     }
   catch (Exception e) { 
     e.printStackTrace();
 	return false;
        
   }    
    
    }
    


    

    
   
}