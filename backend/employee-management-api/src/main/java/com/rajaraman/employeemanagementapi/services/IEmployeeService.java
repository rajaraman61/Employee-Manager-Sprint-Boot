package com.rajaraman.employeemanagementapi.services;

import com.rajaraman.employeemanagementapi.model.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
