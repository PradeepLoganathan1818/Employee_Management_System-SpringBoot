package com.finalproject.Employee.Management.System.Repository;

import com.finalproject.Employee.Management.System.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
