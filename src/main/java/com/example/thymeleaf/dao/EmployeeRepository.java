package com.example.thymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.thymeleaf.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
