package com.devbhaskar.ideDemo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devbhaskar.ideDemo.service.PersonService;

import lombok.Data;

@RestController
@Data
@RequestMapping("/api")
public class Person {

	@Autowired
	private PersonService personService;

	@GetMapping("/person")
	public List<Object> getAllPerson() {
		Map<Integer, String> person = new HashMap<Integer, String>();
		person.put(1, "Alex");

		return new ArrayList<>(person.entrySet());
	}

}
