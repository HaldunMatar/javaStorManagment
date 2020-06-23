package com.zaitoneh.storeManagement.service;

import java.util.List;

import com.zaitoneh.storeManagement.model.Employee;

public interface EmployeeService {
 List<Employee> getAllEmployees();
 



void saveEmployee(Employee employee);
 
Employee getEmployeeById(long id); 


void deleteEmployeeById(long id);

}