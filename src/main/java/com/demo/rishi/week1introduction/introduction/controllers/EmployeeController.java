package com.demo.rishi.week1introduction.introduction.controllers;

import com.demo.rishi.week1introduction.introduction.dto.EmployeeDTO;
import com.demo.rishi.week1introduction.introduction.entities.EmployeeEntity;
import com.demo.rishi.week1introduction.introduction.repositories.EmployeeRepository;
import com.demo.rishi.week1introduction.introduction.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public List<EmployeeDTO> home() {
        return this.employeeService.findAll();
    }

    @GetMapping(path = "/{employeeID}")
    public EmployeeDTO getEmployee(@PathVariable Long employeeID) {
        return this.employeeService.findById(employeeID);
    }

    @PostMapping()
    public EmployeeDTO createEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return this.employeeService.create(employeeEntity);
    }
}
