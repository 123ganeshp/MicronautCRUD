package com.example.repository;

import com.example.entity.Department;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
