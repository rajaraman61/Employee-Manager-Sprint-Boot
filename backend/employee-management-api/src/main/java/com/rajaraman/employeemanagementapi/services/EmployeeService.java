package com.rajaraman.employeemanagementapi.services;

import com.rajaraman.employeemanagementapi.entity.EmployeeDto;
import com.rajaraman.employeemanagementapi.model.Employee;
import com.rajaraman.employeemanagementapi.repository.IEmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<Employee> getAllEmployees() {
        List<EmployeeDto> employeeDtos = employeeRepo.findAll();
        List<Employee> employees = employeeDtos
                .stream()
                .map(emp -> new Employee(
                        emp.getId(),
                        emp.getFirstName(),
                        emp.getLastName(),
                        emp.getEmailId()))
                .collect(Collectors.toList());
        return employees;
    }

}
