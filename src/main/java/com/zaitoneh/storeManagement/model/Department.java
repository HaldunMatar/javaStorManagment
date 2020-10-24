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
@Table(name = "department_table")
public class Department {
	
	public long getDepartmentId() {
		return departmentId;
	}



	public void setDepartmentId(long depId) {
		this.departmentId = depId;
	}



	public String getDepartmentName() {
		return departmentName;
	}



	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}



	public String getDepartmentCode() {
		return departmentCode;
	}



	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}



	public String getDepartmentNote() {
		return departmentNote;
	}



	public void setDepartmentNote(String departmentNote) {
		this.departmentNote = departmentNote;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long departmentId; 
	
	
	
	@JsonProperty(defaultValue = "0")
	@Column(name = "department_name")
	private String departmentName;
	
	@JsonProperty(defaultValue = "0")
	@Column(name = "department_code")
	private String departmentCode;
	
	
	
	@JsonProperty(defaultValue = "0")
	@Column(name = "department_note")
	private String departmentNote;
	
	
	


}
