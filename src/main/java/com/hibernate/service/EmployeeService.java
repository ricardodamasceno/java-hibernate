package com.hibernate.service;

import com.hibernate.entity.Employee;
import com.hibernate.vo.request.EmployeeRequestVO;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(EmployeeRequestVO request);
    List<Employee> findAll();
    Employee findByIdentification(String identification);

}
