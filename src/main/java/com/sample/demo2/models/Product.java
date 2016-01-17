package com.sample.demo2.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1750622020725616645L;
	/**
	 * 
	 */
	@Id
	@Column(name="productid")
	private long productId;
	@Column(name="productname")
	private String productName;
	
	private String remark;
	private float price;
	
	public Product(){
		
	}
	
	public Product(long productId, String productName, String remark, float price) {
		this.productId = productId;
		this.productName = productName;
		this.remark = remark;
		this.price = price;
	}

	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", remark=" + remark + ", price="
				+ price + "]";
	}
	

}
