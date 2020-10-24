package com.zaitoneh.storeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


import com.fasterxml.jackson.annotation.JsonProperty;

@Entity


@Table(
	    name="item_table", 
	    uniqueConstraints=
	        @UniqueConstraint(columnNames={"item_name", "item_type_level1"})
	)

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(defaultValue = "0")
    private long itemId;
    @JsonProperty(defaultValue = "0")
    @Column(name = "item_name")
    private String itemMain;

    public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemMain() {
		return itemMain;
	}

	public void setItemMain(String itemMain) {
		this.itemMain = itemMain;
	}

	public String getItemLevel1() {
		return itemLevel1;
	}

	public void setItemLevel1(String itemLevel1) {
		this.itemLevel1 = itemLevel1;
	}

	public String getItemLevel2() {
		return itemLevel2;
	}

	public void setItemLevel2(String itemLevel2) {
		this.itemLevel2 = itemLevel2;
	}

	public String getItemLevel3() {
		return itemLevel3;
	}

	public void setItemLevel3(String itemLevel3) {
		this.itemLevel3 = itemLevel3;
	}
	 @JsonProperty(defaultValue = "0")
	@Column(name = "item_type_level1")
    private String itemLevel1;
	 @JsonProperty(defaultValue = "0")
    @Column(name = "item_type_level2")
    private String itemLevel2;
	 @JsonProperty(defaultValue = "0")
    @Column(name = "item_type_level3")
    private String itemLevel3;
    
}