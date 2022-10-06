package com.nttdatal.progfuncional2Talleres;



public class Product {

	public String name;
	public Double price;
	public Tax tax;

	Product(String name, Double price, Tax tax) {
		super();
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
}
