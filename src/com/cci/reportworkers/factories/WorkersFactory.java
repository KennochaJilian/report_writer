package com.cci.reportworkers.factories;

import com.cci.reportworkers.models.*;

import java.util.ArrayList;

public class WorkersFactory {
    public ArrayList<Worker> build(){
        ArrayList<Worker> workers = new ArrayList<>();
        workers.addAll(getStudents());
        workers.addAll(getEmployees());
        workers.addAll(getSubContractors());
        workers.addAll(getVolunteers());
        return workers;
    }
    private ArrayList<Student> getStudents(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Codina", "Aranxa", "CCI"));
        students.add(new Student("Expérience", "626", "Tribunal Intergalactique"));
        return students;

    }
    private ArrayList<Employee> getEmployees(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Dupont", "Martin", 1200, 20));
        employees.add(new Employee("Smith", "John", 1500, 15));
        return employees;
    }
    private ArrayList<SubContractor> getSubContractors(){
        ArrayList<SubContractor> subContractors = new ArrayList<>();
        subContractors.add(new SubContractor("Dupond", "Heloise", 50));
        subContractors.add(new SubContractor("MacKensie", "Alice", 300));
        return subContractors;
    }
    private ArrayList<Volunteer> getVolunteers(){
        ArrayList<Volunteer> volunteers = new ArrayList<>();
        volunteers.add(new Volunteer("Petit", "Pas"));
        volunteers.add(new Volunteer("Kruger", "Maxime"));
        return volunteers;
    }
}
