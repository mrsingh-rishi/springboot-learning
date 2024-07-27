package com.demo.rishi.week1introduction.introduction.services;

import com.demo.rishi.week1introduction.introduction.dto.EmployeeDTO;
import com.demo.rishi.week1introduction.introduction.entities.EmployeeEntity;
import com.demo.rishi.week1introduction.introduction.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper mapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = mapper;
    }

    public List<EmployeeDTO> findAll() {
        List<EmployeeEntity> allEmpoyees = employeeRepository.findAll();

        return  allEmpoyees.stream().map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDTO.class)).collect(Collectors.toList());
    }

    public EmployeeDTO findById(Long employeeID) {
        EmployeeEntity employee = employeeRepository.findById(employeeID).orElse(null);

        if(employee == null) {
            return null;
        }

        return modelMapper.map(employee, EmployeeDTO.class);    }

    public EmployeeDTO create(EmployeeEntity employeeEntity) {
        EmployeeEntity employee = employeeRepository.save(employeeEntity);

        return modelMapper.map(employee, EmployeeDTO.class);
    }
}
