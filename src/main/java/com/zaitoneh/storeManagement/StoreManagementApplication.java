package com.zaitoneh.storeManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.zaitoneh.storeManagement.model.Supplier;

import com.zaitoneh.storeManagement.repository.SupplierRepository;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory ;

@SpringBootApplication
public class StoreManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreManagementApplication.class, args);
	}
	
	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		     ItemService itemService=new ItemServiceImpl() ;
		     
		      ItemRepository itemRepository=new ItemRepository() ;
		     
		     
		     

		  List<Item> list =   itemService.getAllItems() ;
		  
		  
		   
		  System.out.println(list.size());
		   
		   

		};
		

		 
	}*/
	private static final Logger log = LoggerFactory.getLogger(StoreManagementApplication.class);
	@Bean
	public CommandLineRunner loadData(SupplierRepository repository) {
		return (args) -> {
			// save a couple of customers
		/*	repository.save(new Supplier());
			repository.save(new Supplier());
			repository.save(new Supplier());
			repository.save(new Supplier());
			repository.save(new Supplier());
			repository.save(new Supplier());
			repository.save(new Supplier());
			

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Supplier customer : repository.findAll()) {
				System.out.println("ffffffffff"+customer.toString());
				log.info(customer.toString());
			}
			log.info("");*/

			// fetch an individual customer by ID
			/*Customer customer = repository.findById(1L).get();
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastNameStartsWithIgnoreCase('Bauer'):");
			log.info("--------------------------------------------");
			for (Customer bauer : repository
					.findByLastNameStartsWithIgnoreCase("Bauer")) {
				log.info(bauer.toString());
			}
			log.info("");*/
		};
	}
	
	
	

}


