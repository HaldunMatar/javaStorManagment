package com.zaitoneh.storeManagement.service;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.zaitoneh.storeManagement.model.Department;
import com.zaitoneh.storeManagement.repository.DepartmentRepository;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List <Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
    
    

	@Override
	public void saveDepartment(Department item) {
		  this.departmentRepository.save(item);
		
	}
	

	
	

	   @Override
	    public Page<Department> findPaginated(int pageNo, int pageSize) {
	     Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
	     return this.departmentRepository.findAll(pageable);
	    }	

	   
	    @Override
	    public Page<Department> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
	     Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
	      Sort.by(sortField).descending();
	     
	     Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
	     return this.departmentRepository.findAll(pageable);
	    }



		@Override
		public Department getDepartmentById(Long separtmentId) {
			Optional < Department > optional = departmentRepository.findById(separtmentId);
		    Department item = null;
		    if (optional.isPresent()) {
		        item = optional.get();
		    } else {
		    	
		        throw new RuntimeException(" Department not found for id :: " + separtmentId);
		    }
		    return item;
		}



		@Override
		public void deleteDepartmentById(Long separtmentId) {
			this.departmentRepository.deleteById(separtmentId);
			
		}



    
    
  
    
}
