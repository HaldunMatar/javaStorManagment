package com.zaitoneh.storeManagement.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.zaitoneh.storeManagement.model.Employee;
import com.zaitoneh.storeManagement.model.Item;

public interface ItemService {
 List<Item> getAllItems();
 



void saveItem(Item employee);
 
Item getItemById(long id); 


void deleteEmployeeById(long id);
Page < Item > findPaginated(int pageNo, int pageSize);
Page < Item > findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);


}