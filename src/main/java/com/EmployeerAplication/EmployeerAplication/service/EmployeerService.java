package com.EmployeerAplication.EmployeerAplication.service;

import com.EmployeerAplication.EmployeerAplication.controller.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeerService {

    public List<Employee> employeeList = Arrays.asList(
            new Employee(1, "Alex Johnson", 27, "San Francisco"),
            new Employee(2, " Liam Zhang", 22, "New York"),
            new Employee(3, "Noah Smith", 19, " Chicago"));


    public List<Employee> getAllEmployees(){
        return employeeList;
    }
}
