package com.springtest.SpringTest.Repository;

import com.springtest.SpringTest.Entity.PayPeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayPeriodRepository extends JpaRepository<PayPeriod, Long> {

}
