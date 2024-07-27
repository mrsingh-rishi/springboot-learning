package com.demo.rishi.week1introduction.introduction.repositories;

import com.demo.rishi.week1introduction.introduction.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
