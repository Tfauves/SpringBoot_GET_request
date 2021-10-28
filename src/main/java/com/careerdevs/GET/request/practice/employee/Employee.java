package com.careerdevs.GET.request.practice.employee;

//Employee should have minimum id, firstName, lastName
//        4 routes Minimum
//        root route
//        get dummy employee route
//        query param route to "create" employee
//        path Param route using one field to return an employee.

public class Employee {
    private long id;
    private String firstName;
    private String lastname;
    private String email;

    public Employee() {

    };

    public Employee(long id, String firstName, String lastname, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;

    }

    public Employee(String firstName, String lastname, String email) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;

    }


}
