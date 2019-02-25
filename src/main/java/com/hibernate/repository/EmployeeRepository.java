package com.hibernate.repository;

import com.hibernate.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findByIdentification(String identification);

}
