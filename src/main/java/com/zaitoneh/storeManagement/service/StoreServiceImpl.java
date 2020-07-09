package com.zaitoneh.storeManagement.service;


import com.zaitoneh.storeManagement.model.Store;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;


import com.zaitoneh.storeManagement.repository.StoreRepository;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository StoreRepository;

    @Override
    public List < Store > getAllStores() {
        return StoreRepository.findAll();
    }

	@Override
	public void saveStore(Store Store) {
		  this.StoreRepository.save(Store);
		
	}
	
	@Override
	public Store getStoreById(long id) {
	    Optional < Store > optional = StoreRepository.findById(id);
	    Store Store = null;
	    if (optional.isPresent()) {
	        Store = optional.get();
	    } else {
	        throw new RuntimeException(" Store not found for id :: " + id);
	    }
	    return Store;
	}


	
	
    @Override
public void deleteStoreById(long id) {
this.StoreRepository.deleteById(id);
}
	
	

    @Override
    public Page<Store> findPaginated(int pageNo, int pageSize) {
     Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
     return this.StoreRepository.findAll(pageable);
    }	
    
    @Override
    public Page<Store> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
     Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
      Sort.by(sortField).descending();
     
     Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
     return this.StoreRepository.findAll(pageable);
    }



    
    
  
    
}
