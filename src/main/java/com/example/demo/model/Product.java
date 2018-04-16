package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Product {
	@Id
	private ObjectId id;
	private String product_name;
	private float product_price;
	private String product_desc;
	private String product_image;
	private int product_quantity;
	private short product_sale;
	private boolean product_isBargain;
	private float product_offerPrice;
	private String product_condition;
	private String product_brand;
	private Category product_category;
	private User product_seller;
	
	public Product() {
		
	}
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	public String getProduct_image() {
		return product_image;
	}
	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}
	public int getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}
	public short getProduct_sale() {
		return product_sale;
	}
	public void setProduct_sale(short product_sale) {
		this.product_sale = product_sale;
	}
	public boolean isProduct_isBargain() {
		return product_isBargain;
	}
	public void setProduct_isBargain(boolean product_isBargain) {
		this.product_isBargain = product_isBargain;
	}
	public float getProduct_offerPrice() {
		return product_offerPrice;
	}
	public void setProduct_offerPrice(float product_offerPrice) {
		this.product_offerPrice = product_offerPrice;
	}
	public String getProduct_condition() {
		return product_condition;
	}
	public void setProduct_condition(String product_condition) {
		this.product_condition = product_condition;
	}
	public String getProduct_brand() {
		return product_brand;
	}
	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}
	public Category getProduct_category() {
		return product_category;
	}
	public void setProduct_category(Category product_category) {
		this.product_category = product_category;
	}
	public User getProduct_seller() {
		return product_seller;
	}
	public void setProduct_seller(User product_seller) {
		this.product_seller = product_seller;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", product_price=" + product_price
				+ ", product_desc=" + product_desc + ", product_image=" + product_image + ", product_quantity="
				+ product_quantity + ", product_sale=" + product_sale + ", product_isBargain=" + product_isBargain
				+ ", product_offerPrice=" + product_offerPrice + ", product_condition=" + product_condition
				+ ", product_brand=" + product_brand + ", product_category=" + product_category + ", product_seller="
				+ product_seller + "]";
	}
	
	
	
}
