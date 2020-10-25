package com.zaitoneh.storeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "supplier_table")
public class Supplier{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long supId;  
	    
	  
	public long getSupId() {
		return supId;
	}


	public void setSupId(long supId) {
		this.supId = supId;
	}


	@JsonProperty(defaultValue = "0")
	@Column(name = "sup_full_name")
	private String supFullName;

	@JsonProperty(defaultValue = "0")
	@Column(name = "supp_mobile1")
	 private long supMobile1;
	
	
	@JsonProperty(defaultValue = "0")
	@Column(name = "supp_mobile2")
	 private long supMobile2;

		
		
	public String getSupFullName() {
		return supFullName;
	}


	public void setSupFullName(String supFullName) {
		this.supFullName = supFullName;
	}


	public long getSupMobile1() {
		return supMobile1;
	}


	public void setSupMobile1(long supMobile1) {
		this.supMobile1 = supMobile1;
	}


	public long getSupMobile2() {
		return supMobile2;
	}


	public void setSupMobile2(long supMobile2) {
		this.supMobile2 = supMobile2;
	}


	public String getSupAddress() {
		return supAddress;
	}


	public void setSupAddress(String supAddress) {
		this.supAddress = supAddress;
	}


	public String getSupNote() {
		return supNote;
	}


	public void setSupNote(String supNote) {
		this.supNote = supNote;
	}


	@JsonProperty(defaultValue = "0")
	@Column(name = "sup_address")
	private String supAddress;
	
	
	@JsonProperty(defaultValue = "0")
	@Column(name = "sup_note")
	private String supNote;


} 