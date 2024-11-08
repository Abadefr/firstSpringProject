package com.EmployeerAplication.EmployeerAplication.controller;

import com.EmployeerAplication.EmployeerAplication.controller.Entity.Employee;
import com.EmployeerAplication.EmployeerAplication.service.EmployeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller //(/employees)  Handles web requests and usually returns a webpage or HTML view.
@ResponseBody // send data  Used with @Controller to say "Just send data back, not a webpage.
//@RestController
public class EmployeerController {

    @Autowired
    EmployeerService employeerService;

    @RequestMapping("/employees")
public List<Employee> findAllEmployees(){

    return employeerService.getAllEmployees();
}
@RequestMapping("/employees/{id}")
public Employee findAnEmployee(@PathVariable int id) {
        return employeerService.getAnEmployeeById(id);
}
}

