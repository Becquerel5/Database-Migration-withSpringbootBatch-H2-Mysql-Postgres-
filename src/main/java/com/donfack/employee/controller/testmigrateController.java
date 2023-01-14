package com.donfack.employee.controller;

import com.donfack.employee.model.Employee;
import com.donfack.employee.repository.EmployeeRepository;
import com.donfack.manager.model.Manager;
import com.donfack.manager.repository.ManagerRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testmigrateController {


    private EmployeeRepository employeeRepository;
    private ManagerRepository managerRepository;

    public testmigrateController(EmployeeRepository employeeRepository, ManagerRepository managerRepository) {
        this.employeeRepository = employeeRepository;
        this.managerRepository = managerRepository;
    }

    /*@PostMapping("/")
    public Object  add(){
        Employee id= employeeRepository.findById(1L).get();
        Manager manager = new Manager();
        manager.setName(id.getName());
        manager.setDate(id.getDate());
        manager.setPassword(id.getPassword());
        manager.setSalary(id.getSalary());

       return managerRepository.save(manager);
    }*/


    @GetMapping("/getemployeeroom")
    public List<Employee> getEmpByRoom(){
        return employeeRepository.findAllRoom();
    }
}
