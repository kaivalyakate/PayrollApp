package com.springtest.SpringTest;

import com.springtest.SpringTest.Entity.Employee;
import com.springtest.SpringTest.Service.EmployeeService;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TODO
// Generate Payslips for a Pay Period
//TODO
// Log Hours for a time Period
//TODO



@Log4j2
@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}

}

@Log4j2
@Component
class JpaApplicationWriter implements ApplicationRunner {

	private final EntityManager entityManager;
	private final TransactionTemplate transactionTemplate;
	private final EmployeeService employeeService;

	List<Employee> employeeList = new ArrayList<>();

	JpaApplicationWriter(EntityManager entityManager, TransactionTemplate transactionTemplate, EmployeeService employeeService) {
		this.entityManager = entityManager;
		this.transactionTemplate = transactionTemplate;
		this.employeeService = employeeService;
	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
		transactionTemplate.execute(result -> {
			Employee employee = Employee.builder()
					.firstName("Kwic")
					.lastName("Kiwkc")
					.startDate(LocalDate.of(2013, 11, 13))
					.birthDate(LocalDate.of(2012, 12, 12))
					.terminationDate(LocalDate.of(2027, 12, 12))
					.salaryType("FIXED")
					.userEmail("gm@mail.com")
					.build();
			entityManager.persist(employee);
			return null;
		});
		log.info("Schema Changes Applied or Not? :: 8080");
	}
}
