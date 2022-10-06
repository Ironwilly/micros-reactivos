package com.everis.bootcamp.webfluxserver.micro.services;

import java.time.Duration;

import org.springframework.stereotype.Service;

import com.everis.bootcamp.webfluxserver.micro.models.Person;

import reactor.core.publisher.Flux;

@Service
public class PersonServiceImpl implements PersonServiceI {

	
	@Override
	public Flux<Person> personList1() {
		
		Person person = new Person();
		person.setNombre("Pedro");
		person.setApellidos("Matas");
		person.setEdad(21);
			
		return Flux.just(person).delayElements(Duration.ofSeconds(1));
		
		
	}

	@Override
	public Flux<Person> personList2() {
		
		Person person = new Person();
		person.setNombre("Alfonso");
		person.setApellidos("Gallardo");
		person.setEdad(39);
			
		return Flux.just(person).delayElements(Duration.ofSeconds(2));
	}

	@Override
	public Flux<Person> personList3() {
		Person person = new Person();
		person.setNombre("Juan");
		person.setApellidos("Barragan");
		person.setEdad(25);
			
		return Flux.just(person).delayElements(Duration.ofSeconds(3));
	}

	@Override
	public Flux<Person> personList4() {
		Person person = new Person();
		person.setNombre("Alejandra");
		person.setApellidos("Herreras");
		person.setEdad(27);
			
		return Flux.just(person).delayElements(Duration.ofSeconds(4));
	}

}
