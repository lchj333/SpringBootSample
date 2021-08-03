package com.ezen.boot.model;

public class Product {
	private int prod_id;
	private String prod_name;
	private int prod_price;
	
	public Product() {}
	
	public Product(String prod_name, int prod_price) {
		super();
		this.prod_name = prod_name;
		this.prod_price = prod_price;
	}

	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getProd_price() {
		return prod_price;
	}
	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}

	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_price=" + prod_price + "]";
	}
	
}
