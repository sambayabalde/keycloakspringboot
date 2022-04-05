package com.eti.keycloakspringboot.repository;

import com.eti.keycloakspringboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
