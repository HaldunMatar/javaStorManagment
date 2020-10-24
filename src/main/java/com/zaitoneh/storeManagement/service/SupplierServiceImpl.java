package com.zaitoneh.storeManagement.service;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.zaitoneh.storeManagement.model.Supplier;
import com.zaitoneh.storeManagement.repository.SupplierRepository;


@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List <Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }
    
    

	@Override
	public void saveSupplier(Supplier item) {
		  this.supplierRepository.save(item);
		
	}
	
	@Override
	public Supplier getSupplierById(long id) {
	    Optional < Supplier > optional = supplierRepository.findById(id);
	    Supplier item = null;
	    if (optional.isPresent()) {
	        item = optional.get();
	    } else {
	    	
	        throw new RuntimeException(" Supplier not found for id :: " + id);
	    }
	    return item;
	}

	@Override
	public void deleteSupplierById(long id) {
		this.supplierRepository.deleteById(id);
		
	}
	
	

	   @Override
	    public Page<Supplier> findPaginated(int pageNo, int pageSize) {
	     Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
	     return this.supplierRepository.findAll(pageable);
	    }	

	   
	    @Override
	    public Page<Supplier> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
	     Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
	      Sort.by(sortField).descending();
	     
	     Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
	     return this.supplierRepository.findAll(pageable);
	    }



    
    
  
    
}
