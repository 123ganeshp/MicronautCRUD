package com.example.service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepo;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Optional;

@Singleton
public class EmployeeService {

    @Inject
    EmployeeRepo employeeRepo;

    public List<Employee> getEmployees(){
        return  (List<Employee>) employeeRepo.findAll();
    }

    public String addEmployee(Employee employee){
        employeeRepo.save(employee);
        return "Employee added successfully";
    }


    public String update(Employee employee,int id){
        Optional<Employee> optional = employeeRepo.findById(id);
        Employee e = optional.get();

        if(e != null){
            e.setName(employee.getName());
            e.setAge(employee.getAge());
            e.setSal(employee.getSal());
            e.setEmail(employee.getEmail());
            e.setJoiningDate(employee.getJoiningDate());
            e.setDepartment(employee.getDepartment());

            employeeRepo.save(e);
            return "Update Employee Successfully";
        }
        else {
            return "Not Employee Update";
        }
    }

    public String deleteById(int id){
        Optional<Employee> employee = employeeRepo.findById(id);
        Employee e = employee.get();
        if(e != null){
            employeeRepo.deleteById(id);
            return "Deleted employee by id "+id;
        }
        else{
            return "Employee with id"+id+" not found";
        }
    }
}
