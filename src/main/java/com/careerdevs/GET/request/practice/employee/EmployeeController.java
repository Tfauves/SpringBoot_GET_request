package com.careerdevs.GET.request.practice.employee;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
//        4 routes Minimum
//        root route
//        get dummy employee route
//        query param route to "create" employee
//        path Param route using one field to return an employee.


@RestController
public class EmployeeController {

    @GetMapping
    public String greet() {
        return "Nakatomi Plaza Directory";
    }

    @GetMapping("/employee")
    public Employee bossMan() {
        return new Employee(1,"Joseph", "Takagi", "joeYoshinobuTakagi@nakatomi.com");
    }
}
