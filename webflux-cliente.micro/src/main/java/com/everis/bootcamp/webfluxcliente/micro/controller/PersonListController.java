package com.everis.bootcamp.webfluxcliente.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.everis.bootcamp.webfluxcliente.micro.models.Person;
import com.everis.bootcamp.webfluxcliente.micro.services.PersonServiceI;

import reactor.core.publisher.Flux;



@Controller
public class PersonListController {
	
	@Autowired
	PersonServiceI personServiceI;
	
	@GetMapping("/person-list")
	public String personList(final Model model) {
		final Flux<Person> personlist = personServiceI.allPersons();
		model.addAttribute("personList",personlist);
		return "personlist";

}

}