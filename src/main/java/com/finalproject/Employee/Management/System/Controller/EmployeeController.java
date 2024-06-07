package com.finalproject.Employee.Management.System.Controller;

import com.finalproject.Employee.Management.System.Model.Employee;
import com.finalproject.Employee.Management.System.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){

        return employeeRepository.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployees(@PathVariable int id){

        Employee e= employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee Not Exist"));
        return ResponseEntity.ok(e);
    }

    @PostMapping("/save")
    public String createEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee Created Successfully";
    }

    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id ,@RequestBody  Employee e){
        Employee employee =employeeRepository.findById(id).get();
        employee.setFirstname(e.getFirstname());
        employee.setLastname(e.getLastname());
        employee.setEmail(e.getEmail());
        employeeRepository.save(employee);
        return ResponseEntity.ok(e);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable int id){

        Employee e = employeeRepository.findById(id).get();
        employeeRepository.delete(e);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}


