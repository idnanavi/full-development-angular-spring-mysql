package com.backend.myapplication.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.backend.myapplication.entity.Employee;
import com.backend.myapplication.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository er;
	public List<Employee> getAllEmployees() {
        return er.findAll();
    }
	public Employee createEmployee(Employee employee) {
        return er.save(employee);
    }
	public String deleteEmployee(int id) {
		Employee emp = er.findById(id);
		er.delete(emp);
		return "berhasil dihapus";
	}
	public Employee updateEmployee(int id,Employee employee) {
		Employee emp = er.findById(id);
		emp.setId(id);
		emp.setFname(employee.getFname());
		emp.setLname(employee.getLname());
		emp.setEmail(employee.getEmail());
		return er.save(emp);
	}
}
