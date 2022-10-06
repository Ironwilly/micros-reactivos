package com.nttdatal.progfuncional2Talleres;

import java.math.BigDecimal;

public class ProductBigDecimal {
	
	public String name;
	public BigDecimal price;
	public Tax tax;

	ProductBigDecimal(String name, BigDecimal price, Tax tax) {
		super();
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

}
