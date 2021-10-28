package com.careerdevs.GET.request.practice.employees;

//Employee should have minimum id, firstName, lastName


public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private int floorNumber;

//    public Employee(long id, String firstName) {
//        this.id = id;
//        this.firstName = firstName;
//
//    };

//    public Employee(long id, String firstName, String lastname, String email) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastname;
//        this.email = email;
//
//    }

    public Employee(long id, String firstName, String lastName, String email, int floorNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.floorNumber = floorNumber;
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

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
