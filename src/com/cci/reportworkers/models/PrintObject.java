package com.cci.reportworkers.models;

import com.cci.reportworkers.interfaces.IPrintObject;

import java.io.PrintWriter;

public abstract class PrintObject implements IPrintObject {
    String name;
    public PrintObject(String name){
        this.name = name;
    }
    protected void displayName(PrintWriter out){
        out.println(name);
    }

    public void display(PrintWriter out)  {
        this.displayName(out);
    }

}
