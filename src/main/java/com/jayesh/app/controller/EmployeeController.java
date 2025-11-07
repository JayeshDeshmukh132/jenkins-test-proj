package com.jayesh.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jayesh.app.entity.Employee;
import com.jayesh.app.repository.EmployeeRepo;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private final EmployeeRepo employeeRepository;

    public EmployeeController(EmployeeRepo employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
	
    @GetMapping
	public ResponseEntity<String> getAllEmployees() {
		return ResponseEntity.ok(employeeRepository.findAll().toString());
	}
	
    @PostMapping
	public ResponseEntity<String> create(@RequestBody Employee employee) {
		return ResponseEntity.ok(employeeRepository.save(employee).toString());
	}
}
