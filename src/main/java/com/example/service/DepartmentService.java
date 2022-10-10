package com.example.service;

import com.example.entity.Department;
import com.example.repository.DepartmentRepo;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class DepartmentService {

    @Inject
    private DepartmentRepo departmentRepo;

    //get all departments
    public List<Department> getAllDepartments(){
        return (List<Department>)departmentRepo.findAll();

    }

    //add new department
    public String addDepartment(Department department) {
        departmentRepo.save(department);
        return "Department Added to Database";
    }
}
