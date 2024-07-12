package com.example.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {
    private final EmployeeManager employeeManager;
    @Autowired
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }
    @GetMapping(
            path = "/",
            produces = "application/json")
    public Employees getEmployees() {
        return employeeManager.getAllEmployees();
    }
}
