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
import com.zaitoneh.storeManagement.service.EmployeeService;
import com.zaitoneh.storeManagement.service.ItemService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Home pages
 @GetMapping("/")
    public String viewHomePage(Model model) {
       
        return "index";
    }

    // display list of employees
    @GetMapping("/listEmployees")
  public String listEmployees(Model model) {
      //  model.addAttribute("listEmployees", employeeService.getAllEmployees());
      //  return "list_employees";
    	
    
    	        model.addAttribute("listEmployees", employeeService.getAllEmployees());
    	   
    	 return findPaginated(1, "firstName", "asc", model);
    	 
    	 
    	 
    	 //  return findPaginated(1, model);
    }
        
    @GetMapping("/page/{pageNo}")
    
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
    	    @RequestParam("sortField") String sortField,
    	    @RequestParam("sortDir") String sortDir,
    	    Model model) {
            int pageSize = 5;
        Page < Employee > page = employeeService.findPaginated(pageNo, pageSize, sortField, sortDir);
       // Page < Employee > page = employeeService.findPaginated(pageNo, pageSize);
        List < Employee > listEmployees = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("listEmployees", listEmployees);
        
        
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
       
        return "list_employees";
    } 	
   
    
    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        // create model attribute to bind form data
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }
    
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        // save employee to database
        employeeService.saveEmployee(employee);
        return "redirect:/listEmployees";
    }
    
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
     
     // get employee from the service
     Employee employee = employeeService.getEmployeeById(id);
     
     // set employee as a model attribute to pre-populate the form
     model.addAttribute("employee", employee);
     return "update_employee";
    }
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable (value = "id") long id) {
     
     // call delete employee method 
     this.employeeService.deleteEmployeeById(id);
     return "redirect:/listEmployees";
    }
    
 
  
    
  

  

}
