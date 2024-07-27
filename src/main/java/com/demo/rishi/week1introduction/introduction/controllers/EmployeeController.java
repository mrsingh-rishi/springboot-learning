package com.demo.rishi.week1introduction.introduction.controllers;

import com.demo.rishi.week1introduction.introduction.dto.EmployeeDTO;
import com.demo.rishi.week1introduction.introduction.entities.EmployeeEntity;
import com.demo.rishi.week1introduction.introduction.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(final EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }




    @GetMapping()
    public List<EmployeeEntity> home() {
        return this.employeeRepository.findAll();
    }

    @GetMapping(path = "/{employeeID}")
    public EmployeeEntity getEmployee(@PathVariable Long employeeID) {
        return this.employeeRepository.findById(employeeID).orElse(null);
    }

    @PostMapping()
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return this.employeeRepository.save(employeeEntity);
    }
}
