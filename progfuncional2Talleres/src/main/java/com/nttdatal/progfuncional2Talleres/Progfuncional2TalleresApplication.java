package com.nttdatal.progfuncional2Talleres;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Progfuncional2TalleresApplication implements CommandLineRunner{

	
	Product product;
	ProductBigDecimal productBigDecimal;
	Tax tax;
	
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_BLUE = "\u001B[34m";
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Progfuncional2TalleresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Product> carro = List.of(
				new Product("Clothes", 5.90, Tax.NORMAL),
				new Product("Bread",15.90, Tax.SUPERREDUCED),
				new Product("Meat",13.99, Tax.REDUCED),
				new Product("Cheese",3.59, Tax.SUPERREDUCED),
				new Product("Coke",1.89, Tax.REDUCED),
				new Product("Whiskey",19.90, Tax.NORMAL));
				
				Optional<Double> cantidad = carro.stream()
				.map(product -> product.price).reduce((x,y)-> x+y);
		System.out.println(ANSI_BLACK+"Cantidad total: "+ANSI_RED+cantidad.get() +"€"+ANSI_BLACK);
		
		Optional<Double> cantidadTax = carro.stream()
				.map(product -> product.price + ((product.price *product.tax.percent)/100))
				.reduce((x, y)-> x+y);
		System.out.println(ANSI_BLACK+"La cantidad total con impuestos incluidos es: "+ ANSI_RED+cantidadTax.get() + "€"+ANSI_BLACK);

	}
	
	/*
	
	List<Product> carroBigDecimal = List.of(
			new Product("Clothes",new BigDecimal("5.90"), Tax.NORMAL),
			new Product("Bread",15.90, Tax.SUPERREDUCED),
			new Product("Meat",13.99, Tax.REDUCED),
			new Product("Cheese",3.59, Tax.SUPERREDUCED),
			new Product("Coke",1.89, Tax.REDUCED),
			new Product("Whiskey",19.90, Tax.NORMAL));
			
			Optional<Double> cantidad = carroBigDecimal.stream()
			.map(product -> productBigDecimal.price).reduce((x,y)-> x+y);
	System.out.println(ANSI_BLACK+"Cantidad total: "+ANSI_RED+cantidad.get() +"€"+ANSI_BLACK);
	
	Optional<Double> cantidadTax = carroBigDecimal.stream()
			.map(product2 -> productBigDecimal.price + ((productBigDecimal.price *productBigDecimal.tax.percent)/100))
			.reduce((x, y)-> x+y);
	System.out.println(ANSI_BLACK+"La cantidad total con impuestos incluidos es: "+ ANSI_RED+cantidadTax.get() + "€"+ANSI_BLACK);

}
*/

}
