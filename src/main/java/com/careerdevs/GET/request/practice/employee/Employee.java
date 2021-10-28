package com.careerdevs.GET.request.practice.employee;

//Employee should have minimum id, firstName, lastName


public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String email;

    public Employee(long id, String firstName) {
        this.id = id;
        this.firstName = firstName;

    };

    public Employee(long id, String firstName, String lastname, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastname;
        this.email = email;

    }

    public Employee(long id) {
        this.id = id;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
