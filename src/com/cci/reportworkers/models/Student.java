package com.cci.reportworkers.models;

import java.io.PrintWriter;

public class Student extends Worker {
    private String schoolName;

    public Student(String firstName, String lastName, String schoolName) {
        super(firstName, lastName);
        this.schoolName = schoolName;
    }
    private String displayUniversity(){
        return this.schoolName;
    }

    @Override
    public void display(PrintWriter out){
        super.display(out);
        out.println(this.displayUniversity());
    }
}
