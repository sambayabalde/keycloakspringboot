package com.eti.keycloakspringboot.controller;

import com.eti.keycloakspringboot.entity.Employee;
import com.eti.keycloakspringboot.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    @GetMapping("/get-all")
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.created(URI.create("/add")).body(employeeRepository.save(employee));
    }
}
