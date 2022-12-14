package com.everis.bootcamp.webfluxcliente.micro.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.everis.bootcamp.webfluxcliente.micro.models.Person;

import reactor.core.publisher.Flux;

@Service
public class PersonServiceImpl implements PersonServiceI{

	
	

	@Override
	public Flux<Person> allPersons() {
		WebClient webClient = WebClient.create("http://localhost:8080");
		Flux<Person> person1 = webClient.get()
		        .uri("/person-list-1")
		        .retrieve()
		        .bodyToFlux(Person.class);
	
		Flux<Person> person2 = webClient.get()
		        .uri("/person-list-2")
		        .retrieve()
		        .bodyToFlux(Person.class);
		
		Flux<Person> person3 = webClient.get()
		        .uri("/person-list-3")
		        .retrieve()
		        .bodyToFlux(Person.class);
	
		Flux<Person> person4 = webClient.get()
		        .uri("/person-list-4")
		        .retrieve()
		        .bodyToFlux(Person.class);
		Flux<Person> listPersons = Flux.concat(person1,person2,person3,person4).filter(person -> person.getNombre().startsWith("A"));

		listPersons.subscribe(person->System.out.println(person.getApellidos()+", "+person.getNombre()+" tiene " + person.getEdad() +" años"));
		return Flux.concat(person1,person2,person3,person4);
	}


	
	
	

}
