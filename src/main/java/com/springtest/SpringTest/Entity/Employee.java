package com.springtest.SpringTest.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "first_name",
            updatable = true,
            nullable = false
    )
    private String firstName;
    @Column(
            name = "last_name",
            updatable = true,
            nullable = false
    )
    private String lastName;
    @Column(
            name = "user_email",
            updatable = true,
            nullable = false,
            length = 20,
            unique = true
    )
    private String userEmail;

    private LocalDate birthDate;

    private LocalDate startDate;

    private LocalDate terminationDate;

//    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//    private Time time;

    @Column(name = "salary_type", nullable = false)
    private String salaryType;

}

