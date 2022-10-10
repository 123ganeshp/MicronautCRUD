package com.example.repository;

import com.example.entity.Employee;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepo extends JpaRepository <Employee, Integer>{

}
