package com.educacionit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Carga todo por nosotros y crea el application context
@SpringBootApplication
public class StudentCrudApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentCrudApiApplication.class, args);
	}
}
