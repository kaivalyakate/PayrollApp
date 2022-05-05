package com.springtest.SpringTest.ServiceImpl;

import com.springtest.SpringTest.Entity.Employee;
import com.springtest.SpringTest.Entity.PayPeriod;
import com.springtest.SpringTest.Repository.PayPeriodRepository;
import com.springtest.SpringTest.Service.EmployeeService;
import com.springtest.SpringTest.Service.PayPeriodService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PayPeriodServiceImpl implements PayPeriodService {

    private final PayPeriodRepository payPeriodRepository;

    private final EmployeeService employeeService;

    @Autowired
    public PayPeriodServiceImpl(PayPeriodRepository payPeriodRepository, EmployeeService employeeService) {
        this.payPeriodRepository = payPeriodRepository;
        this.employeeService = employeeService;
    }

    @Override
    public PayPeriod savePayPeriodDetails(PayPeriod payPeriod) {
        log.info("Saving PayPeriod Information - "+payPeriod.getId());
        Employee employee = employeeService.getEmployeeById(payPeriod.getId());
        payPeriod.setEmployee(employee);
        return payPeriodRepository.save(payPeriod);
    }
}
