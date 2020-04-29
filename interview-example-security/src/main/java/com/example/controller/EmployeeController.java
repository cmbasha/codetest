package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
     
    @GetMapping(path="/employeeNo", produces = "application/json")
    public String getEmployee() 
    {
        return "Employee No:24555858451";
    }
}
