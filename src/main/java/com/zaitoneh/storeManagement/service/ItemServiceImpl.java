package com.zaitoneh.storeManagement.service;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.zaitoneh.storeManagement.model.Employee;
import com.zaitoneh.storeManagement.model.Item;
import com.zaitoneh.storeManagement.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List <Item> getAllItems() {
        return itemRepository.findAll();
    }

	@Override
	public void saveItem(Item item) {
		  this.itemRepository.save(item);
		
	}
	
	@Override
	public Item getItemById(long id) {
	    Optional < Item > optional = itemRepository.findById(id);
	    Item item = null;
	    if (optional.isPresent()) {
	        item = optional.get();
	    } else {
	        throw new RuntimeException(" Item not found for id :: " + id);
	    }
	    return item;
	}


	

	@Override
	public void deleteEmployeeById(long id) {
		this.itemRepository.deleteById(id);
		
	}
	
	

	   @Override
	    public Page<Item> findPaginated(int pageNo, int pageSize) {
	     Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
	     return this.itemRepository.findAll(pageable);
	    }	

	   
	    @Override
	    public Page<Item> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
	     Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
	      Sort.by(sortField).descending();
	     
	     Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
	     return this.itemRepository.findAll(pageable);
	    }



    
    
  
    
}
