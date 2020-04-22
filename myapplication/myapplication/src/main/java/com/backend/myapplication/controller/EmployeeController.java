package com.backend.myapplication.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.myapplication.entity.Employee;
import com.backend.myapplication.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@GetMapping("/employees")
	public List<Employee> getEmployee() {
		return es.getAllEmployees();
	}
	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return es.createEmployee(employee);
    }
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		es.deleteEmployee(id);
		return "sukses";
	}
	@PutMapping("/employees/{id}")
	public String updateEmployee(@PathVariable("id") int id,@RequestBody Employee employee) {
		es.updateEmployee(id, employee);
		return "sukses update";
	}
	
}
