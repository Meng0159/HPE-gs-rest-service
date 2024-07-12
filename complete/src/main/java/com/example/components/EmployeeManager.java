package com.example.components;

import org.springframework.stereotype.Repository;


@Repository
public class EmployeeManager {
    private static final Employees employeesList = new Employees();

    static{
        employeesList.getEmployeeList().add(
                new Employee(
                        "1",
                        "Priit",
                        "Woris",
                        "chapradreams@gmail.com",
                        "Title"));
        employeesList.getEmployeeList().add(
                new Employee(
                        "2",
                        "Tommy",
                        "Vertas",
                        "chapradreams@gmail.com",
                        "Title"));
        employeesList.getEmployeeList().add(
                new Employee(
                        "3",
                        "Nannry",
                        "Necotr",
                        "chapradreams@gmail.com",
                        "Title"));

    }
    // Method to return the list
    public Employees getAllEmployees() {
        return employeesList;
    }


    // Method to add an employee
    // to the employees list
    public void
    addEmployee(Employee employee) {
        employeesList.getEmployeeList()
                .add(employee);
    }
}
