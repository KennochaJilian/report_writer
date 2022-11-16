package com.cci.reportworkers.models;

import java.io.PrintWriter;

public class Volunteer extends Worker{
    public Volunteer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void display(PrintWriter out){
        super.display(out);
        out.println("Life is beautiful");

    }
}
