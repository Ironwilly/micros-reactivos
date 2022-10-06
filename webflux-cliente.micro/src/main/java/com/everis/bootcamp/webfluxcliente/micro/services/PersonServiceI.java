package com.everis.bootcamp.webfluxcliente.micro.services;

import com.everis.bootcamp.webfluxcliente.micro.models.Person;

import reactor.core.publisher.Flux;

public interface PersonServiceI {

	public Flux<Person> allPersons();
}
