package com.cci.reportworkers.models;

public abstract class Worker extends PrintObject {
    String firstName;
    String lastName;

    public Worker(String firstName, String lastName){
        super(firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
