package com.zaitoneh.storeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "store_table")

public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long storeId;
    
    @Column(name = "store_code")
    private String storeCode;
    @Column(name = "store_address")
    private String storeAddress;
 
  

    public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress =  storeAddress;
	}

	
    
}