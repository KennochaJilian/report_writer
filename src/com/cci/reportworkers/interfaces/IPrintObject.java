package com.cci.reportworkers.interfaces;

import java.io.PrintWriter;

public interface IPrintObject {
    public default void display(PrintWriter out){}
}
