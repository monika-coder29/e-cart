package com.cnc.ecart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="stock_id")
     private int stockId;
     
     @Column(name="product_id")
     private int prodId;
     
     @Column(name="quantity")
     private int quantity;
     
     @Column(name="total_sold")
     private int total_sold;

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal_sold() {
		return total_sold;
	}

	public void setTotal_sold(int total_sold) {
		this.total_sold = total_sold;
	}
     
}
