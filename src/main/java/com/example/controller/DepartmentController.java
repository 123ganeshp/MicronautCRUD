package com.example.controller;

import com.example.entity.Department;
import com.example.service.DepartmentService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

import java.util.List;

@Controller
public class DepartmentController {

        @Inject
        private DepartmentService departmentService;

        @Get("/departments")
        public List<Department> getAllDepartment(){
            return departmentService.getAllDepartments();
        }

        @Post("/department")
        public String addDepartment( @Body Department department){
            return departmentService.addDepartment(department);
        }

    }
