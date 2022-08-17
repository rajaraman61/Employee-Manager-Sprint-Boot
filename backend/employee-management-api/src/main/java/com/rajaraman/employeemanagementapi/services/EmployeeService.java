package com.rajaraman.employeemanagementapi.services;

import com.rajaraman.employeemanagementapi.entity.EmployeeDto;
import com.rajaraman.employeemanagementapi.model.Employee;
import com.rajaraman.employeemanagementapi.repository.IEmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService{

    private IEmployeeRepository employeeRepo;

    public EmployeeService(IEmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();

        BeanUtils.copyProperties(employee, employeeDto);
        employeeRepo.save(employeeDto);
        return employee;
    }
}
