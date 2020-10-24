package com.zaitoneh.storeManagement.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.zaitoneh.storeManagement.model.Department;


public interface DepartmentService {

	List<Department> getAllDepartments();

	Department getDepartmentById(Long separtmentId);

	void saveDepartment(Department separtment);

	void deleteDepartmentById(Long separtmentId);
	
	Page < Department > findPaginated(int pageNo, int pageSize);
	Page < Department > findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);


}
