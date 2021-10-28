package com.careerdevs.GET.request.practice.employee;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
//        4 routes Minimum
//        root route
//        get dummy employee route
//        query param route to "create" employee
//        path Param route using one field to return an employee.


@RestController
public class EmployeeController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping
    public String greet() {
        return "Nakatomi Plaza Directory";
    }

    @GetMapping("/ceo")
    public Employee ceo() {
        return new Employee(1,"Joseph", "Takagi", "joeYoshinobuTakagi@nakatomi.com");
    }

    @GetMapping("/execs")
    public Employee executive() {
        return new Employee(1988,"Harry", "Ellis", "youMissedSome@nakatomi.com");
    }

    @GetMapping("/getEmployee")
        public Employee getEmployee(@RequestParam(value="name", defaultValue = "employee first name") String firstName,
                                 @RequestParam(value="lastName", defaultValue = "employee last name") String lastName,
                                 @RequestParam(value="email", defaultValue = "employee email") String email) {
        return new Employee(counter.incrementAndGet(), firstName, lastName, email);
    }

    @GetMapping("/employee/{id}")
    public Employee employee(@PathVariable long id) {
        return new Employee(id);
    }

}
