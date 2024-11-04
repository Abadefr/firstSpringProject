package com.EmployeerAplication.EmployeerAplication.controller;

import com.EmployeerAplication.EmployeerAplication.controller.Entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller //(/employees)  Handles web requests and usually returns a webpage or HTML view.
@ResponseBody // send data  Used with @Controller to say "Just send data back, not a webpage.
//@RestController
public class EmployeerController {


    @RequestMapping("/employees")
public List<Employee> findAllEmployees(){
    List<Employee> employeerList = Arrays.asList(
            new Employee(1, "Alex Johnson", 27, "San Francisco"),
            new Employee(2, " Liam Zhang", 22, "New York"),
            new Employee(3, "Noah Smith", 19, " Chicago")


    );
    return employeerList;
}
}

