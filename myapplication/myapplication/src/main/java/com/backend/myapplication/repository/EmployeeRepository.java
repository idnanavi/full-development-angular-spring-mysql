package com.backend.myapplication.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.backend.myapplication.entity.Employee;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {
public List<Employee> findAll();
public Employee findById(int id);
}
