package com.eti.keycloakspringboot;

import com.eti.keycloakspringboot.controller.EmployeeController;
import com.eti.keycloakspringboot.entity.Employee;
import com.eti.keycloakspringboot.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class KeycloakspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeycloakspringbootApplication.class, args);
    }

    //@Bean
    CommandLineRunner start(EmployeeRepository employeeRepository) {
        return args -> {
            employeeRepository.saveAll(List.of(
                    new Employee(null, "Sayon CAMARA", "BIOMETRIE"),
                    new Employee(null, "Amede Nestor HABA", "BIOMETRIE"),
                    new Employee(null, "Mamadou Lamarana BALDE", "BIOMETRIE")
            ));
        };
    }

}
