package com.programmingTechie.order_service.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="t_order_line_items")

public class OrderLineItems {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String skuCode;
	private BigDecimal price;
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public OrderLineItems(Long id, String skuCode, BigDecimal price, Integer quantity) {
		super();
		this.id = id;
		this.skuCode = skuCode;
		this.price = price;
		this.quantity = quantity;
	}
	public OrderLineItems() {
		
	}
	@Override
	public String toString() {
		return "OrderLineItems [id=" + id + ", skuCode=" + skuCode + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	

	
}
