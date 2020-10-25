package com.zaitoneh.storeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "employee_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    
    @Column(name = "employee_Full_name")
    private String employeeName;

    
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
    
    
    @Column(name = "employee_code")
    private String employeeCode;
    
    @Column(name = "employee_mobile1")
    private String employeeMobile1;
    
    
    @Column(name = "employee_mobile2")
    private String employeeMobile2;
    
    
    @Column(name = "employee_note")
    private String employee_note;
    
    @Column(name = "employee_address")
    private String employeeAddress;
    
    
    
    
    
    public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeMobile1() {
		return employeeMobile1;
	}
	public void setEmployeeMobile1(String employeeMobile1) {
		this.employeeMobile1 = employeeMobile1;
	}
	public String getEmployeeMobile2() {
		return employeeMobile2;
	}
	public void setEmployeeMobile2(String employeeMobile2) {
		this.employeeMobile2 = employeeMobile2;
	}
	public String getEmployee_note() {
		return employee_note;
	}
	public void setEmployee_note(String employee_note) {
		this.employee_note = employee_note;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(long id) {
        this.employeeId = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}