package com.everis.bootcamp.webfluxserver.micro.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.bootcamp.webfluxserver.micro.models.Person;
import com.everis.bootcamp.webfluxserver.micro.services.PersonServiceI;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {
	
	@Autowired
	PersonServiceI personServiceI;
	
	@GetMapping("/person-list-1")
	public Flux<Person> personList1(){	
		
		return personServiceI.personList1();	
	}
	
	@GetMapping("/person-list-2")
	public Flux<Person> personList2() {

		return personServiceI.personList2();	
	}
	
	@GetMapping("/person-list-3")
	public Flux<Person> personList3() {
		
		return personServiceI.personList3();	
	}
	
	@GetMapping("/person-list-4")
	public Flux<Person> personList4() {
		
		return personServiceI.personList4();	
	}

}
