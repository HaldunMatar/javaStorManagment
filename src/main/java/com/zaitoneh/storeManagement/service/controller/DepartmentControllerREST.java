
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

import com.zaitoneh.storeManagement.model.Department;
import com.zaitoneh.storeManagement.service.DepartmentService;




@RestController
public class DepartmentControllerREST {

    @Autowired
    private DepartmentService separtmentService;

  
    // display list of items
    @GetMapping("/listDepartmentREST")
    public  List<Department>  listDepartment(Model model)  {
 	 
   	 return separtmentService.getAllDepartments() ;
      
    }
    
    //http://localhost:8080/ItemId?ItemId=56
    @GetMapping("/departmentId")
    public  Department getDepartmentById(@RequestParam  Long departmentId)  {

    	return separtmentService.getDepartmentById(departmentId);    
       
       }
    
    @PostMapping("/newDepartment")
    
    public void    saveDepartment(@RequestBody Department separtment) {
    	 try {
    	  // save item to database
          separtmentService.saveDepartment(separtment);
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




@DeleteMapping("/separtments/{id}")
public Map<String, Boolean> deleteDepartment(@PathVariable(value = "id") Long separtmentId)
    	
    */
    
    
   @DeleteMapping("/deleteDepartment")
   public     boolean   deleteDepartment(@RequestParam  Long departmentId)  
   {

    try {
    	 
    	    	
    	separtmentService.deleteDepartmentById(departmentId);
    	return true;
    	
     }
   catch (Exception e) { 
     e.printStackTrace();
 	return false;
        
   }    
    
    }
    


    

    
   
}