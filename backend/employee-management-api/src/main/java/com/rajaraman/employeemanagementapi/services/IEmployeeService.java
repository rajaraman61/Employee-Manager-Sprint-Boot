package com.rajaraman.employeemanagementapi.services;

import com.rajaraman.employeemanagementapi.entity.EmployeeDto;
import com.rajaraman.employeemanagementapi.model.Employee;

public interface IEmployeeService {
    Employee addEmployee(Employee employee);
}
