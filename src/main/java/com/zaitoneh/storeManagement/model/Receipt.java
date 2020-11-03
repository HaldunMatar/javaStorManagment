package com.zaitoneh.storeManagement.model;



import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name ="receipt_table")
public class Receipt {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="receipt_id") 
	private long receiptId;
  
  
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "receipt")
    private List<ReceiptDetail> receiptDetailList;
    public Receipt() {
		super();
	}
    
    public Receipt(long id) {
		this.receiptId=id;
	}

	public List<ReceiptDetail> getReceiptDetail() {
        return receiptDetailList;
    }

    public void setReceiptDetail(List<ReceiptDetail> receiptDetail) {
        this.receiptDetailList =receiptDetail;
    }
    
  

    @JsonInclude(JsonInclude.Include.NON_NULL)
     @Column(name="receipt_city") 
      private  String  receiptCity;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="receipt_dep_id") 
   	private  Integer   receiptDepId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="receipt_date") 
	private Date receiptDate;
    @JsonProperty(defaultValue = "0")
    @Column(name="receipt_type") 
	private  short receiptType;
    
    public List<ReceiptDetail> getReceiptDetailList() {
		return receiptDetailList;
	}

	public void setReceiptDetailList(List<ReceiptDetail> receiptDetailList) {
		this.receiptDetailList = receiptDetailList;
	}

	public String getReceiptCity() {
		return receiptCity;
	}

	public void setReceiptCity(String receiptCity) {
		this.receiptCity = receiptCity;
	}

	public Integer getReceiptDepId() {
		return receiptDepId;
	}

	public void setReceiptDepId(Integer receiptDepId) {
		this.receiptDepId = receiptDepId;
	}




	@Column(name="receipt_sup_id") 
   	private  long receiptSupId;
    
    @Column(name="receipt_note") 
   	private  String receipNote;
    
    
    @Column(name="receipt_emp_id") 
   	private  long receiptEmpId;
    
    
    public long getReceiptId() {
		return receiptId;
	}


	public void setReceiptId(long receiptId) {
		this.receiptId = receiptId;
	}


	public Date getReceiptDate() {
		return receiptDate;
	}


	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}


	public short getReceiptType() {
		return receiptType;
	}


	public void setReceiptType(short receiptType) {
		this.receiptType = receiptType;
	}


	public long getReceiptSupId() {
		return receiptSupId;
	}


	public void setReceiptSupId(long receiptSupId) {
		this.receiptSupId = receiptSupId;
	}


	public String getReceipNote() {
		return receipNote;
	}


	public void setReceipNote(String receipNote) {
		this.receipNote = receipNote;
	}


	public long getReceiptEmpId() {
		return receiptEmpId;
	}


	public void setReceiptEmpId(long receiptEmpId) {
		this.receiptEmpId = receiptEmpId;
	}


	public long getReceiptStoteId() {
		return receiptStoteId;
	}


	public void setReceiptStoteId(long receiptStoteId) {
		this.receiptStoteId = receiptStoteId;
	}


	@Column(name="receipt_store_id") 
   	private  long receiptStoteId;
  
    
	
	

}




