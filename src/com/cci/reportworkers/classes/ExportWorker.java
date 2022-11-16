package com.cci.reportworkers.classes;

import com.cci.reportworkers.factories.WorkersFactory;
import com.cci.reportworkers.models.Worker;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ExportWorker {
    final static String title = "Great Report";
    final static String paginationPrefix = "page";
    final static int nbItemsByPage = 3;

    public static void printHeader(PrintWriter out){
        out.println(title);
        out.println("-----------");
        out.println("");
    }
    public static void printPagination(PrintWriter out, int page){
        out.println(ExportWorker.paginationPrefix + " " + page);
        out.println("");
    }
    public static void printWebPagination(PrintWriter out){
        out.println("Consume more, and you will so much more happy!");
        out.println("");
    }

    public static void export(boolean isWebVersion) throws FileNotFoundException {
        WorkersFactory factory = new WorkersFactory();
        final ArrayList<Worker> workers = factory.build();

        PrintWriter out = new PrintWriter("exportWorker.txt");
        ExportWorker.printHeader(out);

        int page = 1;

        for(int i = 0; i < workers.size(); i++){
            try {
                workers.get(i).display(out);
                out.println("");
                if((i+1)%ExportWorker.nbItemsByPage == 0 && !isWebVersion){
                    ExportWorker.printPagination(out, page);
                    page++;
                }
                if((i+1)%2 == 0 && isWebVersion){
                    ExportWorker.printWebPagination(out);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        out.close();
    }

}
