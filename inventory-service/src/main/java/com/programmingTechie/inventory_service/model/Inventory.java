package com.programmingTechie.inventory_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="t_inventory")
public class Inventory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String skuCode;
	private Integer quantity;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSkuCode() {
		return skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Inventory(Long id, String skuCode, Integer quantity) {
		super();
		this.id = id;
		this.skuCode = skuCode;
		this.quantity = quantity;
	}
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
