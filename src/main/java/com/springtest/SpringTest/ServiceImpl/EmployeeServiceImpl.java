package com.springtest.SpringTest.ServiceImpl;

import com.springtest.SpringTest.Entity.Employee;
import com.springtest.SpringTest.Entity.PayPeriod;
import com.springtest.SpringTest.Repository.EmployeeRepository;
import com.springtest.SpringTest.Service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeRepository employeeRepository;

    @Autowired
    EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findEmployeeById(id);
    }

    @Override
    public List<Employee> getALlEmployees() {
        log.info("Fetching All Employees::8080");
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> saveEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

}
