package com.yourcompany.controller;

import com.yourcompany.model.Employee;
import com.yourcompany.model.UpdateTeamRequestDTO;
import com.yourcompany.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;


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
    @GetMapping("/getAllEmployee")
    public ResponseEntity<?> getAllEmployee() {

        List<Employee> allEmployee = employeeService.getAllEmployee();

        return new ResponseEntity<>(allEmployee, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteEmployeeById/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id){

        try{

            employeeService.deleteEmployeeById(id);

            return ResponseEntity.ok("Employee deleted successfully");

        }catch (Exception e){
            return ResponseEntity.status(404).body("Employee not found");
        }
    }

    @PutMapping("/updateTeamEmployee/{id}")
    public ResponseEntity<?> updateEmployeeTeamNr(@PathVariable Long id, @RequestBody UpdateTeamRequestDTO updateTeamRequest)
    {
        try{
   
            employeeService.updateEmployeeTeamNr(id,updateTeamRequest.getTeamNr());
            return ResponseEntity.ok("Employee team number updated seccessfully");

        }catch(Exception e){
            return ResponseEntity.status(404).body("Employee not found or update failed");
        }
    }

}
