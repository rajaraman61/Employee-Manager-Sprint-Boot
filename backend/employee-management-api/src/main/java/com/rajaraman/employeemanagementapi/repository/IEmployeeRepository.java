package com.rajaraman.employeemanagementapi.repository;

import com.rajaraman.employeemanagementapi.entity.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeDto, Long> {

}
