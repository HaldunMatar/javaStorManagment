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
      private  String  receiptCity="0";
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="receipt_dep_id") 
   	private  Integer   receiptDepId=0;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="receipt_date") 
	private Long receiptDate=0L;
    
    @JsonProperty(defaultValue = "0")
    @Column(name="receipt_type") 
	private  short receiptType=0;
    

	@Column(name="receipt_store_id") 
   	private  long receiptStoreId=0L;
  
	@Column(name="receipt_sup_id") 
   	private  long receiptSupId=0L;
    
    @Column(name="receipt_note") 
   	private  String receiptNote="0";
    
    
    @Column(name="receipt_emp_id") 
   	private  long receiptEmpId=0L;
    
    
    public long getReceiptId() {
		return receiptId;
	}


    
    
	
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





	public void setReceiptId(long receiptId) {
		this.receiptId = receiptId;
	}


	public Long getReceiptDate() {
		return receiptDate;
	}


	public void setReceiptDate(Long receiptDate) {
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


	public String getReceiptNote() {
		return receiptNote;
	}


	public void setReceiptNote(String receipNote) {
		this.receiptNote = receipNote;
	}


	public long getReceiptEmpId() {
		return receiptEmpId;
	}


	public void setReceiptEmpId(long receiptEmpId) {
		this.receiptEmpId = receiptEmpId;
	}


	public long getReceiptStoreId() {
		return receiptStoreId;
	}


	public void setReceiptStoreId(long receiptStoteId) {
		this.receiptStoreId = receiptStoteId;
	}

 
	
	

}




