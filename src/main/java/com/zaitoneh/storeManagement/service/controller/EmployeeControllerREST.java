
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

import com.zaitoneh.storeManagement.model.Employee;
import com.zaitoneh.storeManagement.service.EmployeeService;




@RestController
public class EmployeeControllerREST {

    @Autowired
    private EmployeeService employeeService;

  
    // display list of items
    @GetMapping("/listEmployeeREST")
    public  List<Employee>  listEmployee(Model model)  {
 	 
   	 return employeeService.getAllEmployees() ;
      
    }
    
    //http://localhost:8080/ItemId?ItemId=56
    @GetMapping("/EmployeeId")
    public  Employee getEmployeeById(@RequestParam  Long employeeId)  {
    	
    	

    	return employeeService.getEmployeeById(employeeId);   
    	
    	
       
       }
    
    @PostMapping("/newEmployee")
    
    public void    saveEmployee(@RequestBody Employee employee) {
    	 try {
    	  // save item to database
       employeeService.saveEmployee(employee);
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
    
    
   @DeleteMapping("/deleteEmployee")
   public     boolean   deleteEmployee(@RequestParam  Long employeeId)  
   {

    try {
    	 
    	    	
    	employeeService.deleteEmployeeById(employeeId);
    	return true;
    	
     }
   catch (Exception e) { 
     e.printStackTrace();
 	return false;
        
   }    
    
    }
    


    

    
   
}