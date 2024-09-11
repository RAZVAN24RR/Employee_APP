package com.yourcompany.controller;

import com.yourcompany.model.Employee;
import com.yourcompany.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
       if(employee.getName() == null || employee.getEmail() == null || employee.getDepartment() == null) {
        return new ResponseEntity<>("Data on request required!", HttpStatus.BAD_REQUEST);
       }
       Employee savedEmployee = employeeService.addEmployee(employee);
       return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

}
