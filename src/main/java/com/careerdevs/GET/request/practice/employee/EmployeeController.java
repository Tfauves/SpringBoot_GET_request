package com.careerdevs.GET.request.practice.employee;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employee")
public class EmployeeController {

    @GetMapping
    public List<Employee> getEmployees() {
        return List.of(new Employee("Jasper", "Canine", "jasperJ@jmail.com"));
    }

}
