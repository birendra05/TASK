package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{

}
