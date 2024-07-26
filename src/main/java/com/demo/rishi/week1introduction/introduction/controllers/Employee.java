package com.demo.rishi.week1introduction.introduction.controllers;

import com.demo.rishi.week1introduction.introduction.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "employees")
public class Employee {


    @GetMapping()
    public EmployeeDTO home() {
        return new EmployeeDTO(1L, "Rishi Singh", "rs3949427@gmail.com", 22, LocalDate.of(2024, 7, 1), true);
    }

    @GetMapping(path = "/{employeeID}")
    public EmployeeDTO getEmployee(@PathVariable Long employeeID) {
        return new EmployeeDTO(employeeID, "Rishi Singh", "rs3949427@gmail.com", 22, LocalDate.of(2024, 7, 1), true);
    }
}
