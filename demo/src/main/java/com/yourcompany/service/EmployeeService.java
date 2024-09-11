package com.yourcompany.service;


import com.yourcompany.model.Employee;
import com.yourcompany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    public void updateEmployeeTeamNr(Long id, Integer teamNr){

        Optional<Employee> employeeOptional = employeeRepository.findById(id);


        if(employeeOptional.isPresent()){
            Employee employee = employeeOptional.get();
            employee.setTeamNr(teamNr);
            employeeRepository.save(employee);
        }else {
            throw new RuntimeException("Employee not found");
        }

    }

}
