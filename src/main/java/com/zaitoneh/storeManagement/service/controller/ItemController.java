package com.zaitoneh.storeManagement.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zaitoneh.storeManagement.model.Employee;
import com.zaitoneh.storeManagement.model.Item;
import com.zaitoneh.storeManagement.service.ItemService;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

  
    // display list of items
    @GetMapping("/listItems")
    public String listItems(Model model) {
 	   //return findPaginatedItem(1, model);
   	 return findPaginated(1, "itemMain", "asc", model);
     //   model.addAttribute("listItems", itemService.getAllItems());
   //  return "list_items";
    }
    
    @GetMapping("/page1/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
    	    @RequestParam("sortField") String sortField,
    	    @RequestParam("sortDir") String sortDir,
    	    Model model) {
        int pageSize = 5;
        Page < Item > page = itemService.findPaginated(pageNo, pageSize, sortField, sortDir);
       // Page < Item > page = itemService.findPaginated(pageNo, pageSize);
        List < Item > listItems = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("listItems", listItems);
        
        
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
       
       
        return "list_items";
    }
    

    
    @GetMapping("/showNewItemForm")
     public String showNewItemForm(Model model) {
         // create model attribute to bind form data
         Item item = new Item();
         model.addAttribute("item", item);
         return "new_item";
     }
    
     @PostMapping("/saveItem")
     public String saveItem(@ModelAttribute("item") Item item) {
         // save item to database
         itemService.saveItem(item);
         return "redirect:/listItems";
     }
   
     @GetMapping("/showFormForUpdateItem/{id}")
     public String showFormForUpdateItem(@PathVariable ( value = "id") long id, Model model) {
      
      // get item from the service
      Item item = itemService.getItemById(id);
      
      // set item as a model attribute to pre-populate the form
      model.addAttribute("item", item);
      return "update_item";
     }
     
   
     @GetMapping("/deleteItem/{id}")
     public String deleteItem(@PathVariable (value = "id") long id) {
      
      // call delete item method 
     	this.itemService.deleteItemById(id);
    
      return "redirect:/listItems";
     }
}