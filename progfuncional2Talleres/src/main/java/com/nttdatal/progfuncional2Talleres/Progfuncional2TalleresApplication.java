package com.nttdatal.progfuncional2Talleres;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Progfuncional2TalleresApplication implements CommandLineRunner{

	
	Product product;
	Tax tax;
	
	public static void main(String[] args) {
		SpringApplication.run(Progfuncional2TalleresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Product> shoppingCart = List.of(
				new Product("Clothes", 5.90, Tax.NORMAL),
				new Product("Bread",15.90, Tax.SUPERREDUCED),
				new Product("Meat",13.99, Tax.REDUCED),
				new Product("Cheese",3.59, Tax.SUPERREDUCED),
				new Product("Coke",1.89, Tax.REDUCED),
				new Product("Whiskey",19.90, Tax.NORMAL));
				
				Optional<Double> cantidad = shoppingCart.stream()
				.map(product -> product.price).reduce((x,y)-> x+y);
		System.out.println("Cantidad total: "+cantidad.get()+ "€");

	}
		
	

}
