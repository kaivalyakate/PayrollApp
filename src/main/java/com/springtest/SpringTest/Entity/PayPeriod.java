package com.springtest.SpringTest.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PayPeriod {

    @Id
    private Long id;

    private Long workHours;

    private LocalDate payPeriodStartDate;

    private LocalDate payPeriodEndDate;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @MapsId
    private Employee employee;
}
