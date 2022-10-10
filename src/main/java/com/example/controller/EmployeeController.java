package com.example.controller;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepo;
import com.example.service.EmployeeService;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import javax.transaction.Transactional;
import java.util.List;

@Controller
public class EmployeeController {

    @Inject
    EmployeeService employeeService;
    @Inject
    EmployeeRepo employeeRepo;

    @Get("/Allemployee")
    public List<Employee> getEmployees (){
        return employeeService.getEmployees();
    }

    @Post("/add")
    public String addEmployee(@Body Employee employee){
        return employeeService.addEmployee(employee);
    }

    @Transactional
    @Put("/update/{id}")
    public String update(@Body Employee employee, @PathVariable int id){
        return employeeService.update(employee,id);
    }

    @Delete("/delete/{id}")
    public String deleteById(@PathVariable int id){
        return employeeService.deleteById(id);
    }



}
