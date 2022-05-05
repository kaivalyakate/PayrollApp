package com.springtest.SpringTest.Controller;

import com.springtest.SpringTest.Entity.Employee;
import com.springtest.SpringTest.Entity.PayPeriod;
import com.springtest.SpringTest.Service.EmployeeService;
import com.springtest.SpringTest.Service.PayPeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    private final EmployeeService employeeService;
    private final PayPeriodService payPeriodService;

    @Autowired
    Controller(EmployeeService employeeService, PayPeriodService payPeriodService) {
        this.employeeService = employeeService;
        this.payPeriodService = payPeriodService;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable(required = true) Long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getALlEmployees();
    }

    @PostMapping("/employee/save")
    public Employee saveCurrentEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PostMapping("/employee/pay/save")
    public PayPeriod saveCurrentPayPeriodDetails(@RequestBody PayPeriod payPeriod) {
        return payPeriodService.savePayPeriodDetails(payPeriod);
    }
}

