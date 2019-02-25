package com.hibernate.service.impl;

import com.hibernate.entity.Employee;
import com.hibernate.entity.User;
import com.hibernate.repository.EmployeeRepository;
import com.hibernate.repository.UserRepository;
import com.hibernate.service.EmployeeService;
import com.hibernate.vo.request.EmployeeRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(EmployeeRequestVO request){

        User user = new User();
        user.setName(request.getUser().getName());
        user.setSurName(request.getUser().getSurName());
        user = userRepository.save(user);

        Employee employee = new Employee();
        employee.setArea(request.getEmployeeArea());
        employee.setIdentification(request.getIdentification());
        employee.setUser(user);
        return employeeRepository.save(employee);

    }

    public List<Employee> findAll(){
        return (List<Employee>) employeeRepository.findAll();
    }

    public Employee findByIdentification(String identification){
        return employeeRepository.findByIdentification(identification);
    }

}
