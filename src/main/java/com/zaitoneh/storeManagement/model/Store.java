package com.zaitoneh.storeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "store_table")

public class Store {

    @Id
    @JsonProperty(defaultValue = "0")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long storeId;
    
  
    
	@JsonProperty(defaultValue = "0")
	@Column(name = "store_name")
    private String storeName = "";
	  
	  
	@JsonProperty(defaultValue = "0")
    @Column(name = "store_code")
    private String storeCode;
	
	
	@JsonProperty(defaultValue = "0")
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
	  public String getStoreName() {
			return storeName;
		}

		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}

	
    
}