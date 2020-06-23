package com.zaitoneh.storeManagement.service;

import java.util.List;


import com.zaitoneh.storeManagement.model.Item;

public interface ItemService {
 List<Item> getAllItems();
 



void saveItem(Item employee);
 
Item getItemById(long id); 


void deleteEmployeeById(long id);

}