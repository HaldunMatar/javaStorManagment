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


import com.zaitoneh.storeManagement.model.Store;
import com.zaitoneh.storeManagement.service.StoreService;

@Controller
public class StoreController {

    @Autowired
    private StoreService storeService;

  
    // display list of stores
    @GetMapping("/listStores")
    public String listStores(Model model) {
 	   //return findPaginatedStore(1, model);
   	 return findPaginated(1, "storeCode", "asc", model);
     //   model.addAttribute("listStores", storeService.getAllStores());
   //  return "list_stores";
    }
    
    @GetMapping("/pageStore/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
    	    @RequestParam("sortField") String sortField,
    	    @RequestParam("sortDir") String sortDir, 
    	    Model model) {
        int pageSize = 5;
        Page < Store > page = storeService.findPaginated(pageNo, pageSize, sortField, sortDir);
       // Page < Store > page = storeService.findPaginated(pageNo, pageSize);
        List < Store > listStores = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalStores", page.getTotalElements());
        model.addAttribute("listStores", listStores);
        
        
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
       
       
        return "list_stores";
    }
    

    
    @GetMapping("/showNewStoreForm")
     public String showNewStoreForm(Model model) {
         // create model attribute to bind form data
         Store store = new Store();
         model.addAttribute("store", store);
         return "new_store";
     }
    
     @PostMapping("/saveStore")
     public String saveStore(@ModelAttribute("store") Store store) {
         // save store to database
         storeService.saveStore(store);
         return "redirect:/listStores";
     }
   
     @GetMapping("/showFormForUpdateStore/{id}")
     public String showFormForUpdateStore(@PathVariable ( value = "id") long id, Model model) {
      
      // get store from the service
      Store store = storeService.getStoreById(id);
      
      // set store as a model attribute to pre-populate the form
      model.addAttribute("store", store);
      return "update_store";
     }
     
   
     @GetMapping("/deleteStore/{id}")
     public String deleteStore(@PathVariable (value = "id") long id) {
      
      // call delete store method 
     	this.storeService.deleteStoreById(id);
    
      return "redirect:/listStores";
     }
}