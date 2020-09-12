
package com.zaitoneh.storeManagement.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.ui.Model;
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
    @PostMapping("/newItem")
    public void   saveItemNet(@RequestBody Item item) {
  
    	  // save item to database
      //  itemService.saveItem(item);
       
   	
    int  a=1;
    }
    
  
    
    

    

    
   
}