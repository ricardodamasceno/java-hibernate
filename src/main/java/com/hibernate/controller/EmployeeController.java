package com.hibernate.controller;

import com.hibernate.entity.Employee;
import com.hibernate.service.EmployeeService;
import com.hibernate.vo.request.EmployeeRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("rest/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody @Valid EmployeeRequestVO requestVO){
        return employeeService.saveEmployee(requestVO);
    }

    @GetMapping
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/{identification}/findEmployeeByIdentification")
    public Employee findEmployeeByIdentification(@PathVariable String identification){
        return employeeService.findByIdentification(identification);
    }

}
