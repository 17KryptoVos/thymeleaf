package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("employees")
public class EmployeeController {

    private List<Employee> employeeList;

    @PostConstruct
    private void loadData(){
        // Create employees
        Employee emp1 = new Employee(1, "Peter", "Vaughn", "peter@blabla.com");
        Employee emp2 = new Employee(1, "Juan", "Vaughn", "juan@blabla.com");
        Employee emp3 = new Employee(1, "Marie", "Vaughn", "marie@blabla.com");

        employeeList = new ArrayList<>();

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel) {


        theModel.addAttribute("employeeList", employeeList);
        return "list-employees";
    }
}
