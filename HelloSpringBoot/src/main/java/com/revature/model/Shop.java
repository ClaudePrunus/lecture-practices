package com.revature.model;

import javax.persistence.*;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Entity
@Table
@Data
public class Shop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="s_id")
	@ApiModelProperty(name="id", 
	notes="an Integer value that serves as the unique identier for any shop entity",
	required = true,
	value = "1")
	private int id;
	
	@Column(name="s_name", unique=true, nullable=false)
	@ApiModelProperty(name="shopName", 
	notes="a String value that serves as the shop name",
	required = true,
	value = "test shop name")
	private String shopName;
	
	@Column(name="s_inventory_count", nullable=false)
	@ApiModelProperty(name="inventoryCount", 
	notes="an Integer value that serves as the shop inventory count of candies",
	required = true,
	value = "200")
	private int inventoryCount;

	public Shop() {}

	public Shop(String shopName, int inventoryCount) {
		super();
		this.shopName = shopName;
		this.inventoryCount = inventoryCount;
	}

	public Shop(int id, String shopName, int inventoryCount) {
		super();
		this.id = id;
		this.shopName = shopName;
		this.inventoryCount = inventoryCount;
	}
	
	
}
