package com.devbhaskar.ideDemo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
@Data
public class Employee {



	@GetMapping("/employee")
	public List<Object> getAllEmployees() {
		Map<Integer, String> emp = new HashMap<>();
		emp.put(1, "Alex");
		emp.put(2, "Bob");

		return new ArrayList<>(emp.entrySet());

	}

}
