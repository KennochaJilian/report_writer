package com.cci.reportworkers.models;

import java.io.PrintWriter;

public class Employee extends Worker {
    double salary;
    int nbRemainingHoliday;

    public Employee(String firstName, String lastName, double salary, int nbRemainingHoliday) {
        super(firstName, lastName);
        this.salary = salary;
        this.nbRemainingHoliday = nbRemainingHoliday;
    }

    private String displaySalary(){
        return "€"+ this.salary+"/month";
    }
    private String displayNbRemainingHoliday(){
        return this.nbRemainingHoliday+ " " + "day(s)";
    }
    @Override
    public void display(PrintWriter out){
        super.display(out);
        out.println(displaySalary()+", "+ displayNbRemainingHoliday());
    }
}
