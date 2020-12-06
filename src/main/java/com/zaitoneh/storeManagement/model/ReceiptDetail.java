package com.zaitoneh.storeManagement.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


class ProjectId implements    Serializable {
	long  receiptId;
	long itemId ;
}
@Entity  @IdClass(ProjectId.class)
@Table(name="Receipt_Detail")


public class ReceiptDetail {

@ManyToOne(fetch = FetchType.LAZY)
//@JoinColumn(name = "receipt_id")
 private Receipt receipt;

@Id
@JoinColumn(name = "receipt_id")
private long  receiptId;
@Id
@Column(name="item_id")
private 	long itemId ;


@Column(name="amount")
private 	double amount ;


@Column(name="item_price")
private 	float  price ;





public Receipt getReceipt() {
    return receipt;
}

public void setReceipt(Receipt receipt) {
    this.receipt = receipt;
}



public long  getReceiptId() {
    return receiptId;
}

public void setReceiptId(long receipt) {
    this.receiptId = receipt;
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









 
 
 



 
 
	

}
