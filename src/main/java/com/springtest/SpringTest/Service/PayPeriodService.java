package com.springtest.SpringTest.Service;

import com.springtest.SpringTest.Entity.PayPeriod;
import org.springframework.stereotype.Service;

@Service
public interface PayPeriodService {

    public PayPeriod savePayPeriodDetails(PayPeriod payPeriod);
}
