package com.jayesh.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayesh.app.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {	

}
