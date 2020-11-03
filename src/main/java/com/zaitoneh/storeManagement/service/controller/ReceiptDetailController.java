package com.zaitoneh.storeManagement.service.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.zaitoneh.storeManagement.model.Item;
import com.zaitoneh.storeManagement.model.Receipt;
import com.zaitoneh.storeManagement.model.ReceiptDetail;
import com.zaitoneh.storeManagement.repository.ReceiptDetailRepository;
import com.zaitoneh.storeManagement.service.EmployeeService;
import com.zaitoneh.storeManagement.service.ReceiptDetailService;
import com.zaitoneh.storeManagement.service.ReceiptService;
import com.zaitoneh.storeManagement.service.ReceiptServiceImp;

import antlr.collections.List;


@Controller
public class ReceiptDetailController {
	
	
	@Autowired
	private  ReceiptService  receiptService ;
	
	@Autowired
	private  ReceiptDetailService  receiptDetailService ;
	//private  ReceiptDetailService  receiptDetailService;
	
    // display list of stores
    @GetMapping("/listreceipt")
    public String listStores(Model model) {
 	   //return findPaginatedStore(1, model);
   	 ///return findPaginated(1, "storeCode", "asc", model);
    model.addAttribute("listReceipts", receiptService.getAllReceipts());
      
     
     return "list_receipt";
    }
	
	
	
	@GetMapping("/showNewReceiptDetail")
	
	public String   showNewReceiptDetail(Model model) {
		 Receipt  receipt=new  Receipt();
		 model.addAttribute("listReceipts", receipt.getReceiptDetail());
		 model.addAttribute(receipt) ;
		 return  "new_receiptDetail";	
	}
	
    @GetMapping("/showFormForUpdateReceipt/{id}")
    public String showFormForUpdateReceipt(@PathVariable ( value = "id") long id, Model model) {
     
     // get item from the service
    	Receipt receipt = receiptService.getReceiptById(id);
     
     // set item as a model attribute to pre-populate the form
        model.addAttribute("receipt", receipt);
        model.addAttribute("listReceiptDetails", receipt.getReceiptDetail());
        
        
        
        return "update_receipt.html";
    }
    
	
	/*showFormForUpdateReceipt
	 *     // display list of stores
    @GetMapping("/listStores")
    public String listStores(Model model) {
 	   //return findPaginatedStore(1, model);
   	 return findPaginated(1, "storeCode", "asc", model);
     //   model.addAttribute("listStores", storeService.getAllStores());
   //  return "list_stores";
    }
	 * 
	 * 
	 * 
	 */
	@PostMapping("/saveReceipt")
	public String saveReceipt(@ModelAttribute("receipt") Receipt receipt) {
		
		
		
		receiptService.saveReceipt(receipt);
		
		return "redirect:/listReceipts";
	}
	

    @GetMapping("/deleteReceipt/{id}")
    public String deleteStore(@PathVariable (value = "id") long id) {
    	
    	
    java.util.List<ReceiptDetail> l =	 receiptDetailService.getReceiptDetailByReceipId(new Receipt(id));
    	
    	receiptDetailService.deleteReceiptDetailAll( l);
    	this.receiptService.deleteReceiptById(id);
   
     return "redirect:/listStores";
    }

}
