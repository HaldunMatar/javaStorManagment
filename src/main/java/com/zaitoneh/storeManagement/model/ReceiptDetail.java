package com.zaitoneh.storeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Receipt_Detail")


public class ReceiptDetail {

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "receipt_id")
 private Receipt receipt;

public Receipt getReceipt() {
    return receipt;
}

public void setReceipt(Receipt receipt) {
    this.receipt = receipt;
}



 
  public long getItemId() {
	return itemId;
}

public void setItemId(long  itemId) {
	this.itemId = itemId;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}




@Column(name="item_id")
   private 	long itemId ;
  
  @Id
  @Column(name="amount")
  private 	double amount ;
  
 
  @Column(name="item_price")
  private 	float  price ;
  





 
 
 



 
 
	

}
