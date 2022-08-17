package com.rajaraman.employeemanagementapi.controller;

import com.rajaraman.employeemanagementapi.model.Employee;
import com.rajaraman.employeemanagementapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000/")
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
        employeeService.addEmployee(employee);
        return  employee;
    }

    // GET
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
