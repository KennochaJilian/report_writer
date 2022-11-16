package com.cci.reportworkers.models;

import java.io.PrintWriter;

public class SubContractor extends Worker {
    private double dailyRate;

    public SubContractor(String firstName, String lastName, double dailyRate) {
        super(firstName, lastName);
        this.dailyRate = dailyRate;
    }

    private String displayDailyRate(){
        return "€"+this.dailyRate+"/day";
    }

    @Override
    public void display(PrintWriter out){
        super.display(out);
        out.println(displayDailyRate());
    }

}
