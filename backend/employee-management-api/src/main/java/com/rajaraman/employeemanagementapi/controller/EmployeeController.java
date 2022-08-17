package com.rajaraman.employeemanagementapi.controller;

import com.rajaraman.employeemanagementapi.entity.EmployeeDto;
import com.rajaraman.employeemanagementapi.model.Employee;
import com.rajaraman.employeemanagementapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // POST
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        System.out.println("Employee Name: " + employee.getFirstName() + " " + employee.getLastName());
        employeeService.addEmployee(employee);
        return  employee;
    }
}
