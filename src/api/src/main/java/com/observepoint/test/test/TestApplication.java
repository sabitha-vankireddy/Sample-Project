package com.observepoint.test.test;

import com.observepoint.test.test.model.Employees;
import com.observepoint.test.test.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(EmployeeRepository employeeRepository) {
//		return args -> {
//			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
//				Employees emp = new Employees();
//				employeeRepository.save(emp);
//			});
//			employeeRepository.findAll().forEach(System.out::println);
//		};
//	}

}
