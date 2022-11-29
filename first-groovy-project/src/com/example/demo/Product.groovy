package com.example.demo

class Product {
	int id
	String Product_Name
	double rate_per_unit
	Product(id,Product_Name,rate_per_unit) {
		this.id=id
		this.Product_Name=Product_Name
		this.rate_per_unit=rate_per_unit
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", Product_Name=" + Product_Name + ", rate_per_unit=" + rate_per_unit + "]";
	}
	
	

}
