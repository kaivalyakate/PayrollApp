package com.springtest.SpringTest.Service;

import com.springtest.SpringTest.Entity.Employee;
import com.springtest.SpringTest.Entity.PayPeriod;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public Employee getEmployeeById(Long id);

    public List<Employee> getALlEmployees();

    public Employee saveEmployee(Employee employee);

    public List<Employee> saveEmployees(List<Employee> employees);
}
